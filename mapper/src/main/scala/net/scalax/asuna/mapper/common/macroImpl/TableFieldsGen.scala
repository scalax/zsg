package net.scalax.asuna.mapper.common.macroImpl

import net.scalax.asuna.mapper.common.PropertyType
import net.scalax.asuna.mapper.common.annotations.{OverrideProperty, RootModel, RootTable}

import scala.reflect.macros.blackbox.Context

trait TableFieldsGen {

  val c: Context

  val printlnTree = true

  import c.universe._

  def getCompanion(typeSymbol: Type): Tree = {
    /*typeSymbol.typeSymbol.companion.fullName.split('.').toList.map(s => TermName(s)) match {
      case head :: tail =>
        tail.foldLeft(Ident(head): Tree) { (tree: Tree, name: TermName) =>
          Select(tree, name)
        }
    }*/
    c.parse(typeSymbol.typeSymbol.companion.fullName)
  }

  case class MemberWithKey(key: String, member: Symbol, tableGetter: Tree => Tree)

  sealed trait MemberInfo {
    def tableGetter: Tree => Tree
    def tablePropertyName: String
    def containFields: List[String]
    def changeTableGetter(old: (Tree => Tree) => (Tree => Tree)): MemberInfo
  }

  case class SingleKey(private val singleKey: String, override val tableGetter: Tree => Tree, override val tablePropertyName: String) extends MemberInfo {
    self =>
    override lazy val containFields: List[String]                                    = List(singleKey)
    override def changeTableGetter(old: (Tree => Tree) => (Tree => Tree)): SingleKey = self.copy(tableGetter = old(tableGetter))
  }
  case class MutiplyKey(
      private val mutiplyKey: List[String]
    , properType: Tree
    , modelSetter: List[Tree] => Tree
    , override val tableGetter: Tree => Tree
    , override val tablePropertyName: String
  ) extends MemberInfo { self =>
    override lazy val containFields: List[String]                                     = mutiplyKey
    override def changeTableGetter(old: (Tree => Tree) => (Tree => Tree)): MutiplyKey = self.copy(tableGetter = old(tableGetter))
  }

  def membersDistinct(members: List[MemberInfo]): List[MemberInfo] = members.foldLeft(List.empty[MemberInfo]) { (oldMembers, item) =>
    item :: oldMembers.filterNot { oldMember =>
      oldMember.containFields.exists(i => item.containFields.contains(i))
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

  def lawMemberToMutiplyKey(members: List[MemberWithKey]): List[MemberInfo] = {
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

    val proType = weakTypeOf[PropertyType[_]]

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
              , tablePropertyName = item.key
              , properType = q"""${proType.typeSymbol.companion}[${annoType}]"""
              , modelSetter = { setters: List[Tree] =>
                q"""${annoType.typeSymbol.companion}(..${setters})"""
              }
              , tableGetter = item.tableGetter
            )
        }
      extField match {
        case Some(field) => field
        case _ =>
          SingleKey(
              singleKey = item.key
            , tablePropertyName = item.key
            , tableGetter = item.tableGetter
          )

      }
    }
  }

  def fetchTableFieldsImpl(tableType: Type, deepTableTreeGen: (Tree => Tree) => (Tree => Tree)): List[MemberInfo] = {
    val rootMembers                            = lawMembers(tableType)
    val (toUpperMembers, lawMembers1)          = filterToUpperMembers(rootMembers)
    val (currentMemberToOverride, lawMembers2) = filterOverrideMembers(lawMembers1)

    val currentMemberMap = lawMembers2 ::: currentMemberToOverride
    val fixCurrentMap    = lawMemberToMutiplyKey(currentMemberMap).map(s => s.changeTableGetter(deepTableTreeGen))

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

  def fetchTableFields(tableType: Type): List[MemberInfo] = fetchTableFieldsImpl(tableType, identity)

}
