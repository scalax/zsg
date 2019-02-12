package org.scalax.asuna.mapper.append.debug

import org.scalax.asuna.mapper.append.{ItemTag, ItemTagWithMessage}

import scala.annotation.tailrec
import scala.collection.immutable.Queue
import scala.language.experimental.macros

trait ItemTagWithMessageApply[P] {
  def debug[Message]: ItemTagWithMessage[P, Message] = new ItemTagWithMessage[P, Message]
}

class ApplyProperty[Model] {
  def p[P](u: Model => P): ItemTagWithMessageApply[P] = new ItemTagWithMessageApply[P] {}
}

object ApplyProperty {
  def apply[Model]: ApplyProperty[Model] = new ApplyProperty[Model]
}

trait TreeActorMessage {
  def actorIndex: Int
}

trait MessageContent {
  def middleMessage(name: String): String
  def leafMessage(name: String): String
}

trait TreeContent {

  val c: scala.reflect.macros.blackbox.Context
  val messageContent: MessageContent

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

  class TreeContent(val tree: Tree, val names: List[String])

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
              , i1.names ::: i2.names ::: i3.names ::: i4.names
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
            , i1.names ::: i2.names ::: i3.names
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
            , i1.names ::: i2.names
          ))
      case i1 :: Nil =>
        append.+:(
          new TreeContent(
              q"""{
              type ${TypeName(messageContent.middleMessage("i1"))} = String
              org.scalax.asuna.mapper.append.Item.debug1(${i1.tree}).debug[${TypeName(messageContent.middleMessage("i1"))}]
            }"""
            , i1.names
          ))
      case Nil => append
    }
  }

  final def initTag(append: Vector[TreeContent], t: List[TreeContent]): Vector[TreeContent] = {
    t match {
      case i1 :: i2 :: i3 :: i4 :: tail =>
        initTag(
            append.+:(
              new TreeContent(
                q"""org.scalax.asuna.mapper.append.Item.message4(${i1.tree}, ${i2.tree}, ${i3.tree}, ${i4.tree})"""
              , i1.names ::: i2.names ::: i3.names ::: i4.names
            )
          )
          , tail
        )
      case i1 :: i2 :: i3 :: Nil =>
        append.+:(
          new TreeContent(
              q"""org.scalax.asuna.mapper.append.Item.message3(${i1.tree}, ${i2.tree}, ${i3.tree})"""
            , i1.names ::: i2.names ::: i3.names
          ))
      case i1 :: i2 :: Nil =>
        append.+:(
          new TreeContent(
              q"""org.scalax.asuna.mapper.append.Item.message2(${i1.tree}, ${i2.tree})"""
            , i1.names ::: i2.names
          ))
      case i1 :: Nil =>
        append.+:(
          new TreeContent(
              q"""org.scalax.asuna.mapper.append.Item.message1(${i1.tree})"""
            , i1.names
          ))
      case Nil => append
    }
  }

  def applyTag1(t: List[TreeContent]): List[TreeContent] = {
    initTag(Vector.empty, t).toList
  }

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

  trait ContextTreeActor {
    subSelf =>

    def selfIndex: Int
    def init: Option[TreeActorMessage]
    def isSelfMessage(message: TreeActorMessage): Boolean = subSelf.selfIndex == message.actorIndex
    def tree1: Tree
    def tree2: Tree
    def typer: Option[List[TreeContent]]
    def receive: PartialFunction[TreeActorMessage, (Option[TreeActorMessage], ContextTreeActor)]

  }

  final def zipTrees(tree: List[List[TreeContent]]): List[List[TreeContent]] = {
    val (line, tailtail) = tree.map { t =>
      if (t.isEmpty) {
        (Option.empty, Nil)
      } else {
        (Option(t.head), t.tail)
      }
    }.unzip

    val ll = if (line.forall(_.isDefined)) {
      line.map(_.get) :: zipTrees(tailtail)
    } else {
      List.empty[List[TreeContent]]
    }
    ll
  }

  def zipTrees1(tree: List[ContextTreeActor]): Tree = {
    q"""org.scalax.asuna.mapper.append.Item.虚得一逼(${applyTag2(applyTag1(zipTrees(tree.flatMap(_.typer)).map(s => s.head)))})"""
  }

  @tailrec
  final def sendActor(l: List[ContextTreeActor], messages: Queue[TreeActorMessage]): List[ContextTreeActor] = {
    messages.dequeueOption match {
      case Some((head, q)) =>
        val (messageList, newActors) = l.map { item =>
          val (messageOpt, newItem) = if (item.receive.isDefinedAt(head)) {
            item.receive.apply(head)
          } else {
            (Option.empty, item)
          }
          (messageOpt, newItem)
        }.unzip
        sendActor(newActors, q.enqueue(messageList.collect { case Some(s) => s }))
      case _ =>
        l
    }

  }

  def sendActor1(l: List[ContextTreeActor]): List[ContextTreeActor] = sendActor(l, Queue.empty)

}

trait ModelApply[H] {
  type M
  type P
  type Str
  def p: (H => M, Str, ItemTag[P])
}

object ModelApply {

  type Aux[H, MM, PP, SS] = ModelApply[H] { type M = MM; type P = PP; type Str = SS }

  class ModelApplyApply[H] {
    def model[MM, PP, SS](pp: (H => MM, SS, ItemTag[PP])): ModelApply.Aux[H, MM, PP, SS] = new ModelApply[H] {
      override type M   = MM
      override type P   = PP
      override type Str = SS
      override def p: (H => MM, SS, ItemTag[PP]) = pp
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

  class AppendMacroImplImpl(override val c: scala.reflect.macros.whitebox.Context, override val messageContent: MessageContent) extends AppendMacroApply.AppendMacroImpl1

}

object AppendMacroApply {

  trait AppendMacroImpl1 extends TreeContent {

    override val messageContent: MessageContent

    override val c: scala.reflect.macros.blackbox.Context

    import c.universe._

    trait ShapelessGenericGetter extends ContextTreeActor {
      subSelf =>

      def weakTypeTag: Type
      def valName: String
      override def init: Option[TreeActorMessage] = Option.empty

      def names: List[String] =
        weakTypeTag.members.toList
          .filter { s =>
            s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor
          }
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }

      override def tree1: Tree = {
        q"""{ ${TermName(valName)}: ${weakTypeTag} =>
          ${applyValue2(names.map(name => q"""${TermName(valName)}.${TermName(name)}"""))}
        }"""
      }

      override def tree2: Tree = {
        q"""${applyValue2(names.map(name => q"""${Literal(Constant(name))}"""))}"""
      }

      override def typer: Option[List[TreeContent]] =
        Option(names.map { name =>
          new TreeContent(
              q"""{
              type ${TypeName(messageContent.leafMessage(name))} = String
              org.scalax.asuna.mapper.append.debug.ApplyProperty[${weakTypeTag}].p(_.${TermName(name)}).debug[${TypeName(messageContent.leafMessage(name))}]
            }"""
            , List(name)
          )
        })

      override def receive: PartialFunction[TreeActorMessage, (Option[TreeActorMessage], ContextTreeActor)] = {
        case _ => (Option.empty, subSelf)
      }

    }

    class ShapelessGenericGetterImpl(override val valName: String, override val selfIndex: Int, override implicit val weakTypeTag: Type) extends ShapelessGenericGetter

    def generic[H: c.WeakTypeTag, P: c.WeakTypeTag, M: c.WeakTypeTag, Str: c.WeakTypeTag]: c.Expr[ModelApply.Aux[H, M, P, Str]] = {
      val h = c.weakTypeOf[H]

      val shapelessGetter = new ShapelessGenericGetterImpl("ll", 1, h)
      val result          = sendActor1(List(shapelessGetter))
      val List(item)      = result

      c.Expr[ModelApply.Aux[H, M, P, Str]] {
        q"""org.scalax.asuna.mapper.append.debug.ModelApply.instance[${h}].model((${item.tree1}, ${item.tree2}, ${zipTrees1(result)}))"""
      }
    }

  }

}
