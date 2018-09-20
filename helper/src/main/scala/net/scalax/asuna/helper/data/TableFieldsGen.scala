package net.scalax.asuna.helper

import scala.reflect.macros.blackbox.Context

trait TableFieldsGen {

  val c: Context

  import c.universe._
  case class MemberWithKey(key: String, member: Symbol)
  case class MemberWithDeepKey(key: String, members: List[Symbol])

  def fetchTableFields(tableType: Type): Map[String, MemberWithDeepKey] = {
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
            DefaultRootTableOrder.order
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
            (s.copy(key = name), DefaultReWritePropertyOrder.order)
        }
        .headOption
      (orderOpt.map(_._1).getOrElse(s), orderOpt.map(_._2))
    }
    val currentMemberToOverride =
      reWriteMemberWithOrder.collect { case (member, Some(order)) => (MemberWithDeepKey(member.key, List(member.member)), order) }.sortBy(_._2).map(_._1)
    val currentMemberMapPre = reWriteMemberWithOrder.collect { case (member, None) => (member.key, MemberWithDeepKey(member.key, List(member.member))) }.toMap
    val currentMemberMap = currentMemberToOverride.foldLeft(currentMemberMapPre) { (current, item) =>
      current + ((item.key, item))
    }

    val memberCol = toUpperMembers
      .map(s => fetchTableFields(s.member.typeSignatureIn(tableType)).map { case (key, r) => (key, MemberWithDeepKey(r.key, s.member :: r.members)) })
      .foldLeft(Map.empty[String, MemberWithDeepKey]) { (oldMap, newMap) =>
        oldMap ++ newMap
      }
    memberCol ++ currentMemberMap
  }

}
