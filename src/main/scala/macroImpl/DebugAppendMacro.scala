package org.scalax.asuna.mapper.append.debug

import org.scalax.asuna.mapper.append.macroImpl._
import org.scalax.asuna.mapper.append.{ItemTag, ItemTagWithMessage, MacroContent}

import scala.language.experimental.macros

class ItemTagWithMessageApply[P] {
  def debug[Message]: ItemTagWithMessage[P, Message] = new ItemTagWithMessage[P, Message]
}

class ApplyProperty[Model] {
  def p[P](u: Model => P): ItemTagWithMessageApply[P] = new ItemTagWithMessageApply[P]
}

object ApplyProperty {
  def apply[Model]: ApplyProperty[Model] = new ApplyProperty[Model]
}

trait TreeActorMessage {
  def actorIndex: Int
}

trait ModelApply[H] {
  type M
  type P
  type Str
  def getter: H => M
  def names: Str
  def tag: ItemTag[P]
}

object ModelApply {

  type Aux[H, MM, PP, SS] = ModelApply[H] { type M = MM; type P = PP; type Str = SS }

  class ModelApplyApply[H] {
    def model[MM, PP, SS](g: H => MM, n: SS, t: ItemTag[PP]): ModelApply.Aux[H, MM, PP, SS] = new ModelApply[H] {
      override type M   = MM
      override type P   = PP
      override type Str = SS

      override def getter = g
      override def names  = n
      override def tag    = t
    }
  }

  def instance[M]: ModelApplyApply[M] = new ModelApplyApply[M]

  implicit def appendMacroImpl[H, M, P, S]: ModelApply.Aux[H, M, P, S] = macro AppendMacro.AppendMacroImpl2.generic[H, M, P, S]

}

object AppendMacro {

  val messageContent = new MessageContent {
    override def middleMessage(name: String): String = s" 你的 implicit 找不到哦, 请把 .debug(context) 替换成 .${name}.debug(context) 继续努力吧"
    override def leafMessage(name: String): String   = s" 找不到的 implicit 就在这里啦, 它的属性名是: ${name}, 大家快去调试吧"
  }

  class AppendMacroImpl2(override val c: scala.reflect.macros.whitebox.Context) extends AppendMacroImplImpl(c, messageContent)

  class AppendMacroImplImpl(override val c: scala.reflect.macros.blackbox.Context, override val messageContent: MessageContent) extends AppendMacroApply.AppendMacroImpl1

}

object AppendMacroApply {

  trait AppendMacroImpl1 {
    self =>

    val messageContent: MessageContent

    val c: scala.reflect.macros.blackbox.Context

    import c.universe._

    def generic[H: c.WeakTypeTag, P: c.WeakTypeTag, M: c.WeakTypeTag, Str: c.WeakTypeTag]: c.Expr[ModelApply.Aux[H, M, P, Str]] = {
      val h = c.weakTypeOf[H]

      val treeContent = new MacroContent[c.type] {
        subSelf =>

        override val c: self.c.type = self.c

        override def parent: MacroParentActor[self.c.type] = new SingleGeneric[self.c.type] {
          override val c: self.c.type     = subSelf.c
          override def m: c.universe.Type = h
        }

        override def children: List[MacroChildActor[self.c.type]] =
          List(
              new TypeActor[self.c.type] {
              override val c: self.c.type = self.c
            }
            , new NameActor[c.type](self.c)
            , new TagActor[self.c.type] {
              override val c: self.c.type = self.c
              override val messageContent = self.messageContent
            }
          )
      }

      val List(tree1, tree2, tree3) = treeContent.result

      c.Expr[ModelApply.Aux[H, M, P, Str]] {
        q"""org.scalax.asuna.mapper.append.debug.ModelApply.instance[${h}].model(${tree1}, ${tree2}, ${tree3})"""
      }
    }

  }

}
