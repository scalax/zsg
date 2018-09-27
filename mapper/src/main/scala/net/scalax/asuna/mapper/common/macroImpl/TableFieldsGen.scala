package net.scalax.asuna.mapper.common.macroImpl

import net.scalax.asuna.mapper.common.annotations.{OverrideProperty, RootModel, RootTable}

import scala.reflect.macros.blackbox.Context

trait TableFieldsGen {

  val c: Context

  import c.universe._
  case class MemberWithKey(key: String, member: Symbol)

  case class SingleKey(singleKey: String)
  case class MutiplyKey(mutiplyKey: List[String], fieldType: Type)
  case class MemberWithDeepKey(key: Either[SingleKey, MutiplyKey], members: List[Symbol])

  def membersDistinct(members: List[MemberWithDeepKey]) = members.foldLeft(List.empty[MemberWithDeepKey]) { (oldMembers, item) =>
    val memWithKey = oldMembers.map { s =>
      val keys = s.key match {
        case Left(SingleKey(k)) =>
          List(k)
        case Right(MutiplyKey(keys, _)) =>
          keys
      }
      (keys, s)
    }
    item.key match {
      case Left(SingleKey(sk)) =>
        item :: memWithKey.filterNot { case (keys, _) => keys.contains(sk) }.map(_._2)
      case Right(MutiplyKey(mk, _)) =>
        item :: memWithKey.filterNot { case (keys, _) => keys.exists(i => mk.contains(i)) }.map(_._2)
    }
  }

  protected def lawMembers(tableType: Type): List[MemberWithKey] = {
    tableType.members.toList
      .filter { s =>
        s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod)
      }
      .map(s => (s.name, s))
      .collect { case (TermName(n), s) => MemberWithKey(n.trim, s) }
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
            MutiplyKey(mutiplyKey = fields.filterNot(s => s == item.key), fieldType = annoType)
        }
      extField match {
        case Some(field) =>
          MemberWithDeepKey(key = Right(field), members = List(item.member))
        case _ =>
          MemberWithDeepKey(key = Left(SingleKey(singleKey = item.key)), members = List(item.member))
      }
    }
  }

  def fetchTableFields(tableType: Type): List[MemberWithDeepKey] = {
    val rootMembers                            = lawMembers(tableType)
    val (toUpperMembers, lawMembers1)          = filterToUpperMembers(rootMembers)
    val (currentMemberToOverride, lawMembers2) = filterOverrideMembers(lawMembers1)

    val currentMemberMap = lawMembers2 ::: currentMemberToOverride
    val fixCurrentMap    = lawMemberToMutiplyKey(currentMemberMap)

    val memberCol = toUpperMembers.map(s => fetchTableFields(s.member.typeSignatureIn(tableType)).map(r => r.copy(members = s.member :: r.members))).flatten

    membersDistinct(memberCol ::: fixCurrentMap)
  }

}