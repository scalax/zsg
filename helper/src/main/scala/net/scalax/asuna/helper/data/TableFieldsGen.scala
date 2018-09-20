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
    val currentMemberMapPre = reWriteMemberWithOrder.collect { case (member, None) => member }

    /*object DataProUnlifting {
      def unapply(tree: Tree): Option[Type] = {
        val classDef = c.typecheck(tree, silent = true)
        val wt       = weakTypeOf[RootDataProperty[String]]
        val typeArgs = classDef.tpe.dealias.typeArgs
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
      }
    }

    currentMemberMapPre.flatMap(_.member.annotations.map(_.tree)).collect {
      case DataProUnlifting(aa) =>
        println("11" * 100)
        println(aa.members.filter(s => s.isTerm && (s.asTerm.isCaseAccessor)).toList)
    }*/

    val currentMemberMap = currentMemberToOverride.foldLeft(currentMemberMapPre.map(s => (s.key, MemberWithDeepKey(s.key, List(s.member)))).toMap) {
      (current, item) =>
        current + ((item.key, item))
    }

    val memberCol = toUpperMembers
      .map(s => fetchTableFields(s.member.typeSignatureIn(tableType)).map { case (key, r) => (key, MemberWithDeepKey(r.key, s.member :: r.members)) })
      .foldLeft(Map.empty[String, MemberWithDeepKey]) { (oldMap, newMap) =>
        oldMap ++ newMap
      }
    memberCol ++ currentMemberMap
  }

  case class SingleKey(singleKey: String)
  case class MutiplyKey(mutiplyKey: List[String], fieldType: Type)
  case class MemberWithDeepKey1111(key: Either[SingleKey, MutiplyKey], members: List[Symbol])

  def membersDistinct(members:List[MemberWithDeepKey1111]) = members.foldLeft(List.empty[MemberWithDeepKey1111]) { (oldMembers,item) =>
    item.key match {
      case Left(sk)=>
        oldMembers
      case Right(mk)=>
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
      reWriteMemberWithOrder.collect { case (member, Some(order)) => (member, order) }.sortBy(_._2).map(_._1)
    val currentMemberMapPre = reWriteMemberWithOrder.collect { case (member, None) => member }

    object DataProUnlifting {
      def unapply(tree: Tree): Option[Type] = {
        val classDef = c.typecheck(tree, silent = true)
        val wt       = weakTypeOf[RootDataProperty[String]]
        val typeArgs = classDef.tpe.dealias.typeArgs
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
      }
    }

    val currentMemberMap = currentMemberToOverride.foldLeft(currentMemberMapPre.map(s => (s.key, s)).toMap) { (current, item) =>
      current + ((item.key, item))
    }

    val fixCurrentMap = currentMemberMap.map {
      case (key, item) =>
        val extField = item.member.annotations.map(_.tree).collectFirst {
          case DataProUnlifting(aa) =>
            val fields = aa.members.filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal).map(_.name).toList.collect { case TermName(s) => s.trim }
            MutiplyKey(mutiplyKey = fields.filterNot(s => s == item.key), fieldType = aa)
        }
        extField match {
          case Some(field) =>
            MemberWithDeepKey1111(key = Right(field), members = List(item.member))
          case _ =>
            MemberWithDeepKey1111(key = Left(SingleKey(singleKey = key)), members = List(item.member))
        }
    }.toList

    val memberCol = toUpperMembers      .map(          s => fetchTableFields1111(s.member.typeSignatureIn(tableType))      )      .flatten
    memberCol ::: fixCurrentMap
  }

}
