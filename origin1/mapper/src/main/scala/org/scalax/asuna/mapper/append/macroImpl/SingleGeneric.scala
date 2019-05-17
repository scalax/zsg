package org.scalax.asuna.mapper.append.macroImpl

import scala.annotation.tailrec
import scala.reflect.macros.blackbox
import scala.language.existentials

case class ModelNames(n: List[String], override val isFromCurrent: Boolean = false) extends P2SMessage {
  override def changeCurrent(isFrom: Boolean): ModelNames = ModelNames(n, isFrom)
}

case class ModelNamesToParent(n: List[String]) extends S2PMessage

trait WTypeTag {
  type Model
  def W
}

case class ModelWithType[I <: blackbox.Context](typeTag: I#Type, override val isFromCurrent: Boolean = false) extends P2SMessage {
  override def changeCurrent(isFrom: Boolean): ModelWithType[I] = ModelWithType[I](typeTag, isFrom)
}

class NameActor[I <: blackbox.Context](override val c: I, names: List[String] = List.empty) extends MacroChildActor[I] {
  self =>

  import c.universe._

  @tailrec
  final def applyValue(append: Vector[Tree], t: List[Tree]): Vector[Tree] = {
    t match {
      case i1 :: i2 :: i3 :: i4 :: tail =>
        applyValue(append.+:(q"""org.scalax.asuna.mapper.append.Item.apply4(${i1}, ${i2}, ${i3}, ${i4})"""), tail)
      case i1 :: i2 :: i3 :: Nil =>
        append.+:(q"""org.scalax.asuna.mapper.append.Item.apply3(${i1}, ${i2}, ${i3})""")
      case i1 :: i2 :: Nil =>
        append.+:(q"""org.scalax.asuna.mapper.append.Item.apply2(${i1}, ${i2})""")
      case i1 :: Nil =>
        append.+:(q"""org.scalax.asuna.mapper.append.Item.apply1(${i1})""")
      case Nil => append
    }
  }

  def applyValue1(t: List[Tree]): Vector[Tree] = {
    applyValue(Vector.empty, t)
  }

  @tailrec
  final def applyValue2(t: List[Tree]): Tree = {
    t match {
      case Nil =>
        q"""org.scalax.asuna.mapper.append.Item.apply0"""
      case head :: Nil =>
        head
      case l =>
        applyValue2(applyValue1(l).toList)
    }
  }

  override def tree: Tree = q"""${applyValue2(names.map(name => Literal(Constant(name))))}"""

  override def receive: PartialFunction[P2SMessage, (NameActor[I], SubResult)] = {
    case ModelNames(n, false) => (new NameActor(c, n), done)
    case _                    => (self, done)
  }

}

trait TypeActor[I <: blackbox.Context] extends MacroChildActor[I] {
  self =>

  override val c: I

  import c.universe._

  def typeTagOpt: Option[c.universe.Type] = Option.empty

  def names(tOpt: c.universe.Type): List[String] =
    tOpt.members.toList
      .filter { s =>
        s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor
      }
      .map(s => (s.name, s))
      .collect {
        case (TermName(n), s) =>
          val proName = n.trim
          proName
      }

  @tailrec
  final def applyValue(append: Vector[Tree], t: List[Tree]): Vector[Tree] = {
    t match {
      case i1 :: i2 :: i3 :: i4 :: tail =>
        applyValue(append.+:(q"""org.scalax.asuna.mapper.append.Item.apply4(${i1}, ${i2}, ${i3}, ${i4})"""), tail)
      case i1 :: i2 :: i3 :: Nil =>
        append.+:(q"""org.scalax.asuna.mapper.append.Item.apply3(${i1}, ${i2}, ${i3})""")
      case i1 :: i2 :: Nil =>
        append.+:(q"""org.scalax.asuna.mapper.append.Item.apply2(${i1}, ${i2})""")
      case i1 :: Nil =>
        append.+:(q"""org.scalax.asuna.mapper.append.Item.apply1(${i1})""")
      case Nil => append
    }
  }

  def applyValue1(t: List[Tree]): Vector[Tree] = applyValue(Vector.empty, t)

  @tailrec
  final def applyValue2(t: List[Tree]): Tree = t match {
    case Nil =>
      q"""org.scalax.asuna.mapper.append.Item.apply0"""
    case head :: Nil =>
      head
    case l =>
      applyValue2(applyValue1(l).toList)
  }

  override def tree: Tree = {
    val valName = "model"
    typeTagOpt match {
      case Some(typeOpt) =>
        q"""{ ${TermName(valName)}: ${typeOpt} =>
          ${applyValue2(
          typeTagOpt.toList
            .flatMap { t =>
              names(t)
            }
            .map(name => q"""${TermName(valName)}.${TermName(name)}"""))}
        }"""
      case _ => Literal(Constant("喵"))
    }

  }

  override def receive: PartialFunction[P2SMessage, (TypeActor[I], SubResult)] = {
    case ModelWithType(typeTag: c.universe.Type, false) =>
      (new TypeActor[I] {
        override val c: self.c.type                      = self.c
        override def typeTagOpt: Option[c.universe.Type] = Option(typeTag)
      }, sendToParent(ModelNamesToParent(names(typeTag))))
    case _ => (self, done)
  }

}

trait MessageContent {
  def middleMessage(name: String): String
  def leafMessage(name: String): String
}

trait TagActor[I <: blackbox.Context] extends MacroChildActor[I] {
  self =>

  val messageContent: MessageContent

  override val c: I

  import c.universe._

  def typeTagOpt: Option[c.universe.Type] = Option.empty
  def names: List[String]                 = List.empty

  def content: List[TreeContent] = typeTagOpt.toList.flatMap { typeTag =>
    names.map { name =>
      new TreeContent(
          q"""{
        type ${TypeName(messageContent.leafMessage(name))} = String
        org.scalax.asuna.mapper.append.debug.ApplyProperty[${typeTag}].p(_.${TermName(name)}).debug[${TypeName(messageContent.leafMessage(name))}]
      }"""
      )
    }
  }

  class TreeContent(val tree: Tree)

  @tailrec
  final def applyTag(append: Vector[TreeContent], t: List[TreeContent]): Vector[TreeContent] = {
    t match {
      case i1 :: i2 :: i3 :: i4 :: tail =>
        applyTag(
            append.+:(
              new TreeContent(
                q"""{
                  type ${TypeName(messageContent.middleMessage("i1"))} = String
                  type ${TypeName(messageContent.middleMessage("i2"))} = String
                  type ${TypeName(messageContent.middleMessage("i3"))} = String
                  type ${TypeName(messageContent.middleMessage("i4"))} = String
                  org.scalax.asuna.mapper.append.Item.debug4(${i1.tree}, ${i2.tree}, ${i3.tree}, ${i4.tree}).debug[${TypeName(messageContent.middleMessage("i1"))}, ${TypeName(
                messageContent.middleMessage("i2"))}, ${TypeName(messageContent.middleMessage("i3"))}, ${TypeName(messageContent.middleMessage("i4"))}]
                }"""
            )
          )
          , tail
        )
      case i1 :: i2 :: i3 :: Nil =>
        append.+:(
          new TreeContent(
              q"""{
              type ${TypeName(messageContent.middleMessage("i1"))} = String
              type ${TypeName(messageContent.middleMessage("i2"))} = String
              type ${TypeName(messageContent.middleMessage("i3"))} = String
              org.scalax.asuna.mapper.append.Item.debug3(${i1.tree}, ${i2.tree}, ${i3.tree}).debug[${TypeName(messageContent.middleMessage("i1"))}, ${TypeName(
              messageContent.middleMessage("i2"))}, ${TypeName(messageContent.middleMessage("i3"))}]
            }"""
          ))
      case i1 :: i2 :: Nil =>
        append.+:(
          new TreeContent(
              q"""{
              type ${TypeName(messageContent.middleMessage("i1"))} = String
              type ${TypeName(messageContent.middleMessage("i2"))} = String
              org.scalax.asuna.mapper.append.Item.debug2(${i1.tree}, ${i2.tree}).debug[${TypeName(messageContent.middleMessage("i1"))}, ${TypeName(
              messageContent.middleMessage("i2"))}]
            }"""
          ))
      case i1 :: Nil =>
        append.+:(
          new TreeContent(
              q"""{
              type ${TypeName(messageContent.middleMessage("i1"))} = String
              org.scalax.asuna.mapper.append.Item.debug1(${i1.tree}).debug[${TypeName(messageContent.middleMessage("i1"))}]
            }"""
          ))
      case Nil => append
    }
  }

  final def initTag(append: Vector[TreeContent], t: List[TreeContent]): Vector[TreeContent] = {
    t match {
      case i1 :: i2 :: i3 :: i4 :: tail =>
        initTag(append.+:(new TreeContent(q"""org.scalax.asuna.mapper.append.Item.message4(${i1.tree}, ${i2.tree}, ${i3.tree}, ${i4.tree})""")), tail)
      case i1 :: i2 :: i3 :: Nil =>
        append.+:(new TreeContent(q"""org.scalax.asuna.mapper.append.Item.message3(${i1.tree}, ${i2.tree}, ${i3.tree})"""))
      case i1 :: i2 :: Nil =>
        append.+:(new TreeContent(q"""org.scalax.asuna.mapper.append.Item.message2(${i1.tree}, ${i2.tree})"""))
      case i1 :: Nil =>
        append.+:(new TreeContent(q"""org.scalax.asuna.mapper.append.Item.message1(${i1.tree})"""))
      case Nil => append
    }
  }

  def applyTag1(t: List[TreeContent]): List[TreeContent] = initTag(Vector.empty, t).toList

  @tailrec
  final def applyTag2(t: List[TreeContent]): Tree = {
    t match {
      case Nil =>
        q"""org.scalax.asuna.mapper.append.Item.debug0"""
      case head :: Nil =>
        head.tree
      case l =>
        applyTag2(applyTag(Vector.empty, l).toList)
    }
  }

  def zipTrees1(tree: List[TreeContent]): Tree = q"""org.scalax.asuna.mapper.append.Item.虚得一逼(${applyTag2(applyTag1(tree))})"""

  override def tree: Tree = zipTrees1(content)

  override def receive: PartialFunction[P2SMessage, (TagActor[I], SubResult)] = {
    case ModelWithType(typeTag: c.universe.Type, false) =>
      (new TagActor[I] {
        override val c: self.c.type                      = self.c
        override def typeTagOpt: Option[c.universe.Type] = Option(typeTag)
        override def names                               = self.names
        override val messageContent                      = self.messageContent
      }, done)
    case ModelNames(n, false) =>
      (new TagActor[I] {
        override val c: self.c.type                      = self.c
        override def typeTagOpt: Option[c.universe.Type] = self.typeTagOpt
        override def names                               = n
        override val messageContent                      = self.messageContent
      }, done)
    case _ => (self, done)
  }

}

trait SingleGeneric[I <: blackbox.Context] extends MacroParentActor[I] {
  self =>

  override val c: I

  def m: c.universe.Type

  override def init: ParentContent = sendToAll(ModelWithType(m))

  override def receive: PartialFunction[S2PMessage, (SingleGeneric[I], ParentResult)] = {
    case ModelNamesToParent(n) =>
      (new SingleGeneric[I] {
        override val c: self.c.type = self.c
        override def m              = self.m
      }, sendToAll(ModelNames(n)))
  }

}
