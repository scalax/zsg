package net.scalax.asuna.mapper.common.macroImpl

import net.scalax.asuna.mapper.common.annotations.{ReWriteProperty, RootDataProperty, RootTable}

import scala.reflect.macros.blackbox.Context

trait TableFieldsGen {

  val c: Context

  import c.universe._
  case class MemberWithKey(key: String, member: Symbol)

  case class SingleKey(singleKey: String)
  case class MutiplyKey(mutiplyKey: List[String], fieldType: Type)
  case class MemberWithDeepKey1111(key: Either[SingleKey, MutiplyKey], members: List[Symbol])

  def membersDistinct(members: List[MemberWithDeepKey1111]) = members.foldLeft(List.empty[MemberWithDeepKey1111]) { (oldMembers, item) =>
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

  def fetchTableFields1111(tableType: Type): List[MemberWithDeepKey1111] = {
    val rootMembers = tableType.members.toList
      .filter { s =>
        s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod)
      }
      .map(s => (s.name, s))
      .collect { case (TermName(n), s) => MemberWithKey(n.trim, s) }

    val memberWithOrder = rootMembers.map { s =>
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
    val reWriteMemberWithOrder = lawMembers.map { s =>
      val orderOpt = s.member.annotations
        .map(_.tree)
        .collect {
          case q"""new ${classDef}(${Literal(Constant(name: String))}, ${Literal(Constant(num: Int))})""" if classDef.tpe.<:<(weakTypeOf[ReWriteProperty]) =>
            (s.copy(key = name), num)
          case q"""new ${classDef}(${Literal(Constant(name: String))}, ${_})""" if classDef.tpe.<:<(weakTypeOf[ReWriteProperty]) =>
            (s.copy(key = name), ReWriteProperty.defaultReWritePropertyOrder)
        }
        .headOption
      (orderOpt.map(_._1).getOrElse(s), orderOpt.map(_._2))
    }
    val currentMemberToOverride =
      reWriteMemberWithOrder.collect { case (member, Some(order)) => (member, order) }.sortBy(_._2).map(_._1)

    val currentMemberMapPre = reWriteMemberWithOrder.collect { case (member, None) => member }

    object DataProUnlifting {
      def unapply(tree: (String, Tree)): Option[Type] = {
        val classDef = c.typecheck(tree._2, silent = true)
        val wt       = weakTypeOf[RootDataProperty[String]]
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

    val currentMemberMap = currentMemberMapPre ::: currentMemberToOverride

    val fixCurrentMap = currentMemberMap.map { item =>
      val extField = item.member.annotations
        .map { s =>
          (item.key, s.tree)
        }
        .collectFirst {
          case DataProUnlifting(aa) =>
            val fields =
              aa.members.filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal).map(_.name).toList.collect { case TermName(s) => s.trim }
            MutiplyKey(mutiplyKey = fields.filterNot(s => s == item.key), fieldType = aa)
        }
      extField match {
        case Some(field) =>
          MemberWithDeepKey1111(key = Right(field), members = List(item.member))
        case _ =>
          MemberWithDeepKey1111(key = Left(SingleKey(singleKey = item.key)), members = List(item.member))
      }
    }

    val memberCol = toUpperMembers.map(s => fetchTableFields1111(s.member.typeSignatureIn(tableType)).map(r => r.copy(members = s.member :: r.members))).flatten

    membersDistinct(memberCol ::: fixCurrentMap)
  }

}
