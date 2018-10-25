package net.scalax.asuna.mapper.common.macroImpl

import net.scalax.asuna.mapper.common.annotations.{OverrideProperty, RootModel, RootTable}

import scala.reflect.macros.blackbox.Context

trait TableFieldsGen {

  val c: Context

  import c.universe._
  case class MemberWithKey(key: String, member: Symbol, tableGetter: Tree => Tree)

  case class SingleKey(singleKey: String, modelSetter: Tree => Tree, modelGetter: Tree => Tree)
  case class MutiplyKey(mutiplyKey: List[String], fieldType: Type, modelSetter: List[(String, Tree)] => Tree, modelGetter: List[(String, Tree => Tree)])
  case class MemberWithDeepKey(key: Either[SingleKey, MutiplyKey], tableGetter: Tree => Tree)

  def membersDistinct(members: List[MemberWithDeepKey]) = members.foldLeft(List.empty[MemberWithDeepKey]) { (oldMembers, item) =>
    val memWithKey = oldMembers.map { s =>
      val keys = s.key match {
        case Left(k: SingleKey) =>
          List(k.singleKey)
        case Right(keys: MutiplyKey) =>
          keys.mutiplyKey
      }
      (keys, s)
    }
    item.key match {
      case Left(sk: SingleKey) =>
        item :: memWithKey.filterNot { case (keys, _) => keys.contains(sk.singleKey) }.map(_._2)
      case Right(mk: MutiplyKey) =>
        item :: memWithKey.filterNot { case (keys, _) => keys.exists(i => mk.mutiplyKey.contains(i)) }.map(_._2)
    }
  }

  protected def lawMembers(tableType: Type): List[MemberWithKey] = {
    tableType.members.toList
      .filter { s =>
        s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod)
      }
      .map(s => (s.name, s))
      .collect {
        case (TermName(n), s) =>
          val proName = n.trim
          MemberWithKey(proName, s, { tableVar: Tree =>
            q"""${tableVar}.${TermName(proName)}"""
          })
      }
  }

  protected def filterToUpperMembers(law: List[MemberWithKey]): (List[MemberWithKey], List[MemberWithKey]) = {
    val memberWithOrder = law.map { s =>
      val orderOpt = s.member.annotations
        .map(_.tree)
        .collect {
          case q"""new ${classDef}(${Literal(Constant(num: Int))})""" if classDef.tpe.<:<(weakTypeOf[RootTable]) =>
            num
          case q"""new ${classDef}(${_})""" if classDef.tpe.<:<(weakTypeOf[RootTable]) =>
            RootTable.defaultRootTableOrder
        }
        .headOption
      (s, orderOpt)
    }

    val toUpperMembers = memberWithOrder.collect { case (member, Some(order)) => (member, order) }.sortBy(_._2).map(_._1)
    val lawMembers     = memberWithOrder.collect { case (member, None) => member }

    (toUpperMembers, lawMembers)
  }

  protected def filterOverrideMembers(law: List[MemberWithKey]): (List[MemberWithKey], List[MemberWithKey]) = {
    val reWriteMemberWithOrder = law.map { s =>
      val orderOpt = s.member.annotations
        .map(_.tree)
        .collect {
          case q"""new ${classDef}(${Literal(Constant(name: String))}, ${Literal(Constant(num: Int))})""" if classDef.tpe.<:<(weakTypeOf[OverrideProperty]) =>
            (s.copy(key = name), num)
          case q"""new ${classDef}(${Literal(Constant(name: String))}, ${_})""" if classDef.tpe.<:<(weakTypeOf[OverrideProperty]) =>
            (s.copy(key = name), OverrideProperty.defaultReWritePropertyOrder)
        }
        .headOption
      (orderOpt.map(_._1).getOrElse(s), orderOpt.map(_._2))
    }
    val currentMemberToOverride =
      reWriteMemberWithOrder.collect { case (member, Some(order)) => (member, order) }.sortBy(_._2).map(_._1)

    val currentMemberMapPre = reWriteMemberWithOrder.collect { case (member, None) => member }

    (currentMemberToOverride, currentMemberMapPre)
  }

  def lawMemberToMutiplyKey(members: List[MemberWithKey]): List[MemberWithDeepKey] = {
    object DataProUnlifting {
      def unapply(tree: (String, Tree)): Option[Type] = {
        val classDef = c.typecheck(tree._2, silent = true)
        val wt       = weakTypeOf[RootModel[String]]
        val typeArgs = classDef.tpe.dealias.typeArgs
        try {
          typeArgs match {
            case head :: Nil =>
              val typeRef     = tq"""${wt.typeSymbol}[..${typeArgs}]"""
              val checkedType = c.typecheck(q"""{ val aa: ${typeRef} = ???; aa }""").tpe
              if (classDef.tpe weak_<:< checkedType) {
                Option(head.asInstanceOf[c.Type])
              } else Option.empty
            case _ =>
              Option.empty
          }
        } catch {
          case e: Exception =>
            e.printStackTrace
            throw e
        }
      }
    }

    members.map { item =>
      val extField = item.member.annotations
        .map { s =>
          (item.key, s.tree)
        }
        .collectFirst {
          case DataProUnlifting(annoType) =>
            val fields =
              annoType.members.filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal).map(_.name).toList.collect { case TermName(s) => s.trim }
            MutiplyKey(
                mutiplyKey = fields.filterNot(s => s == item.key)
              , fieldType = annoType
              , modelGetter = fields.map(
                  field =>
                  (field, { modelVar: Tree =>
                    q"""${TermName(field)} = ${modelVar}.${TermName(field)}"""
                  })
              )
              , modelSetter = { modelVar: List[(String, Tree)] =>
                q"""${annoType.typeSymbol.companion}(..${fields.map(field => q"""${TermName(field)} = ${modelVar.toMap.apply(field)}""")})"""
              }
            )
        }
      extField match {
        case Some(field) =>
          MemberWithDeepKey(key = Right(field), tableGetter = item.tableGetter)
        case _ =>
          MemberWithDeepKey(
              key = Left(
                SingleKey(
                  singleKey = item.key
                , modelGetter = { modelVar: Tree =>
                  q"""${TermName(item.key)} = ${modelVar}.${TermName(item.key)}"""
                }
                , modelSetter = { modelVar: Tree =>
                  modelVar
                }
              )
            )
            , tableGetter = item.tableGetter
          )
      }
    }
  }

  def fetchTableFieldsImpl(tableType: Type, deepTableTreeGen: (Tree => Tree) => (Tree => Tree)): List[MemberWithDeepKey] = {
    val rootMembers                            = lawMembers(tableType)
    val (toUpperMembers, lawMembers1)          = filterToUpperMembers(rootMembers)
    val (currentMemberToOverride, lawMembers2) = filterOverrideMembers(lawMembers1)

    val currentMemberMap = lawMembers2 ::: currentMemberToOverride
    val fixCurrentMap    = lawMemberToMutiplyKey(currentMemberMap).map(s => s.copy(tableGetter = deepTableTreeGen(s.tableGetter)))

    val memberCol = toUpperMembers
      .map(
          s =>
          fetchTableFieldsImpl(s.member.typeSignatureIn(tableType), {
            gen: (Tree => Tree) =>
              { tree: Tree =>
                gen(q"""${tree}.${TermName(s.member.name.toString.trim)}""")
              }
          })
      )
      .flatten

    membersDistinct(memberCol ::: fixCurrentMap)
  }

  def fetchTableFields(tableType: Type): List[MemberWithDeepKey] = fetchTableFieldsImpl(tableType, identity)

}
