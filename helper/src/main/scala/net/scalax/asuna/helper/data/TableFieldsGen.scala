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

  def membersDistinct(members: List[MemberWithDeepKey1111]) = members.foldLeft(List.empty[MemberWithDeepKey1111]) { (oldMembers, item) =>
    if ((item.key match {
          case Left(SingleKey(k)) =>
            List(k)
          case Right(MutiplyKey(keys, _)) =>
            keys
        }).contains("nick"))
      println(item)

    if (item.key.isRight)
      println("2222" * 12 + item)

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

    //println("xx" * 100 + rootMembers)

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
      def unapply(tree: (String, Tree)): Option[Type] = {
        if (tree._1 == "sdfsjeriojgreig")
          println("abcd" * 100 + tree)
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

    /*val currentMemberMap = currentMemberToOverride.foldLeft(currentMemberMapPre.map(s => (s.key, s)).toMap) { (current, item) =>
      current + ((item.key, item))
    }
    println("1234" * 100 + currentMemberToOverride.filter(_.key == "sdfsjeriojgreig"))
    println("5678" * 100 + currentMemberMapPre.filter(_.key == "sdfsjeriojgreig"))
    currentMemberMapPre.filter(_.key == "sdfsjeriojgreig").map { s =>
      println(s.member.asTerm.annotations)
      println(s.member.asTerm.isPublic)
      println(s.member.asTerm.isPrivate)
      println(s.member.asTerm.isProtected)
    }
    println("8768" * 100 + currentMemberMap.filter(_._1 == "sdfsjeriojgreig").map(_._2.member.asTerm.annotations))
    println("sdsbhgt" * 12 + currentMemberToOverride)*/
    //println("7878" * 12 + currentMemberMap.mkString("\n"))

    val currentMemberMap = currentMemberMapPre ::: currentMemberToOverride

    val fixCurrentMap = currentMemberMap.map { item =>
      /*if (key == "nick") {
          println("44" * 100 + item)
        }
        if (key == "sdfsjeriojgreig") {
          println("77" * 100 + item)
        }*/
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
    //println("``1" * 100 + "\n" + membersDistinct(memberCol ::: fixCurrentMap).mkString("\n") + "\n" + "``2" * 100)
    //println("11" * 100 + +"\n" + fixCurrentMap.mkString("\n"))
    println("aabb" * 100 + membersDistinct(memberCol ::: fixCurrentMap).filter(_.key.isRight))

    membersDistinct(memberCol ::: fixCurrentMap)
  }

}
