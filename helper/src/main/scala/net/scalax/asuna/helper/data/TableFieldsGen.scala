package net.scalax.asuna.helper

import scala.reflect.macros.blackbox.Context

trait TableFieldsGen {

  val c: Context

  import c.universe._
  case class MemberWithKey(key: String, member: Symbol)
  case class MemberWithDeepKey(key: String, members: List[Symbol])

  def fetchTableFields(tableType: Type): Map[String, MemberWithDeepKey] = {
    val rootMembers = tableType.members.toList.map(s => (s.name, s)).collect { case (TermName(n), s) => MemberWithKey(n.trim, s) }
    val memberWithOrder = rootMembers.map { s =>
      val orderOpt = s.member.asTerm.annotations.map(_.tree).collectFirst {

        case q"""new ${r}(${Literal(Constant(num: Int))})""" if r.tpe.<:<(weakTypeOf[RootTable]) =>
          num
        case q"""new ${r}(${_})""" if r.tpe.<:<(weakTypeOf[RootTable]) =>
          DefaultRootTableOrder.order

      }
      (s, orderOpt)
    }
    val toUpperMembers = memberWithOrder.collect { case (member, Some(order)) => (member, order) }.sortBy(_._2).map(_._1)
    val currentMembers = memberWithOrder.collect { case (member, None) => member }
    val memberCol = toUpperMembers
      .map(s => fetchTableFields(s.member.typeSignatureIn(tableType)).map { case (key, r) => (key, MemberWithDeepKey(r.key, s.member :: r.members)) })
      .foldLeft(Map.empty[String, MemberWithDeepKey]) { (oldMap, newMap) =>
        oldMap ++ newMap
      }
    memberCol ++ currentMembers.map(s => (s.key, MemberWithDeepKey(s.key, List(s.member)))).toMap
  }

}
