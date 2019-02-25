package org.scalax.asuna.mapper.append.macroImpl

import scala.reflect.macros.blackbox
import scala.language.existentials

case class ModelNames(n: List[String], override val isFromCurrent: Boolean = false) extends MacroMessage {
  override def changeCurrent(isFrom: Boolean): ModelNames = ModelNames(n, isFrom)
}

trait WTypeTag {
  type Model
  def W
}

case class ModelWithType[I <: blackbox.Context](typeTag: I#Type, override val isFromCurrent: Boolean = false) extends MacroMessage {
  override def changeCurrent(isFrom: Boolean): ModelWithType[I] = ModelWithType[I](typeTag, isFrom)
}

class NameActor[I <: blackbox.Context](override val c: I, names: List[String] = List.empty) extends MacroChildActor[I] {
  self =>

  import c.universe._

  class TreeNodeType extends NodeType {
    override type UpperType  = TreeTreeNode
    override type LeafType   = NameTree
    override type AppendType = TreeListNode
  }

  trait NameTree {
    def name: String
    override def toString: String = s"NameTree(${name})"
  }

  trait TreeTreeNode {
    def tree: Tree
    override def toString: String = s"TreeTreeNode(${tree})"
  }

  trait TreeListNode {
    def tree: List[Tree]
    override def toString: String = s"TreeListNode(${tree.mkString(", ")})"
  }

  val accumulation = new Accumulation[TreeNodeType] {
    override def toUpper(append: TreeListNode): TreeTreeNode = new TreeTreeNode {
      override val tree = q"""org.scalax.asuna.mapper.append.Item.${TermName("apply" + append.tree.size)}(..${append.tree})"""
    }
    override def appendUpper(x: TreeUpper[TreeNodeType], y: TreeListNode): TreeListNode = new TreeListNode {
      override val tree = x.content.tree :: y.tree
    }
    override def appendLeaf(leaf: TreeLeaf[TreeNodeType], y: TreeListNode): TreeListNode = new TreeListNode {
      override val tree = q"""${Literal(Constant(leaf.content.name))}""" :: y.tree
    }
    override def initUpper(x: TreeUpper[TreeNodeType]): TreeListNode = new TreeListNode {
      override val tree = List(x.content.tree)
    }
    override def initLeaf(x: TreeLeaf[TreeNodeType]): TreeListNode = new TreeListNode {
      override val tree = List(q"""${Literal(Constant(x.content.name))}""")
    }
  }

  override def tree: Tree =
    names.map(n =>
      new NameTree {
        override val name = n
    }) match {
      case h :: tail =>
        Accumulation.toT(Accumulation.build[TreeNodeType](h, tail), accumulation).tree
      case _ =>
        q"""org.scalax.asuna.mapper.append.Item.apply0"""
    }

  override def receive: PartialFunction[MacroMessage, (NameActor[I], SendResult)] = {
    case ModelNames(n, false) => (new NameActor(c, n), done)
    case _                    => (self, done)
  }

}

trait SetterActor1[I <: blackbox.Context] extends MacroChildActor[I] {
  self =>

  override val c: I

  import c.universe._

  def typeTagOpt: Option[c.universe.Type] = Option.empty
  def names: List[String]                 = List.empty

  class TreeNodeType extends NodeType {
    override type UpperType  = TreeTreeNode
    override type LeafType   = NameTree
    override type AppendType = TreeListNode
  }

  trait NameTree {
    def typeTag: Type
    def name: String
    override def toString: String = s"NameTree(${name})"
  }

  trait TreeTreeNode {
    def tree: Tree
    def index: Map[String, List[Int]]
    override def toString: String = s"TreeTreeNode(${tree})"
  }

  trait TreeListNode {
    def tree: List[TreeTreeNode]
    override def toString: String = s"TreeListNode(${tree.mkString(", ")})"
  }

  val accumulation = new Accumulation[TreeNodeType] {
    override def toUpper(append: TreeListNode): TreeTreeNode = new TreeTreeNode {
      override val tree = q"""org.scalax.asuna.mapper.append.Item.${TermName("tag" + append.tree.size)}(..${append.tree.map(_.tree)})"""
      override val index = {
        val s = append.tree.size
        append.tree
          .foldLeft(Map.empty[String, List[Int]]) { (x, y) =>
            x ++ y.index
          }
          .map {
            case (k, v) =>
              (k, v match {
                case head :: tail =>
                  (s - head) :: tail
              })
          }
      }
    }
    override def appendUpper(x: TreeUpper[TreeNodeType], y: TreeListNode): TreeListNode = new TreeListNode {
      override val tree =
        new TreeTreeNode {
          override val tree  = x.content.tree
          override val index = x.content.index.map { case (ppp, pppp) => (ppp, x.index :: pppp) }
        } :: y.tree
    }
    override def appendLeaf(leaf: TreeLeaf[TreeNodeType], y: TreeListNode): TreeListNode = new TreeListNode {
      override val tree = new TreeTreeNode {
        override val tree  = q"""org.scalax.asuna.mapper.append.debug.ApplyProperty[${leaf.content.typeTag}].tag(_.${TermName(leaf.content.name)})"""
        override val index = Map((leaf.content.name, List(leaf.index)))
      } :: y.tree
    }
    override def initUpper(x: TreeUpper[TreeNodeType]): TreeListNode = new TreeListNode {
      override val tree = List(new TreeTreeNode {
        override val tree  = x.content.tree
        override def index = x.content.index.map { case (ppp, pppp) => (ppp, x.index :: pppp) }
      })
    }
    override def initLeaf(x: TreeLeaf[TreeNodeType]): TreeListNode = new TreeListNode {
      override val tree = List(new TreeTreeNode {
        override val tree  = q"""org.scalax.asuna.mapper.append.debug.ApplyProperty[${x.content.typeTag}].tag(_.${TermName(x.content.name)})"""
        override val index = Map((x.content.name, List(x.index)))
      })
    }
  }

  override def tree: Tree =
    typeTagOpt.toList.flatMap { t =>
      names.map(n =>
        new NameTree {
          override val typeTag = t
          override val name    = n
        }: NameTree)
    } match {
      case h :: tail =>
        val p = Accumulation.toT(Accumulation.build[TreeNodeType](h, tail), accumulation)
        q"""org.scalax.asuna.mapper.append.debug.ApplyProperty.tag(${p.tree}) { model => ${h.typeTag.typeSymbol.companion}(..${p.index.map {
          case (name, pp) =>
            q"""${TermName(name)} = ${pp.foldLeft(Ident(TermName("model")): Tree) { (x, y) =>
              q"""${x}.${TermName("i" + y.toString)}"""
            }}"""
        }}) }"""
      case _ =>
        q"""org.scalax.asuna.mapper.append.Item.apply0"""
    }

  override def receive: PartialFunction[MacroMessage, (SetterActor1[I], SendResult)] = {
    case ModelWithType(typeTag: c.universe.Type, false) =>
      (new SetterActor1[I] {
        override val c: self.c.type                      = self.c
        override def typeTagOpt: Option[c.universe.Type] = Option(typeTag)
        override def names                               = self.names
      }, done)
    case ModelNames(n, false) =>
      (new SetterActor1[I] {
        override val c: self.c.type                      = self.c
        override def typeTagOpt: Option[c.universe.Type] = self.typeTagOpt
        override def names                               = n
      }, done)
    case _ => (self, done)
  }

}

trait SetterActor[I <: blackbox.Context] extends MacroChildActor[I] {
  self =>

  override val c: I

  import c.universe._

  val valName = "model"

  class TreeNodeType extends NodeType {
    override type UpperType  = TreeTreeNode
    override type LeafType   = NameTree
    override type AppendType = TreeListNode
  }

  trait NameTree {
    def name: String
    override def toString: String = s"NameTree(${name})"
  }

  trait TreeTreeNode {
    def tree: Tree
    override def toString: String = s"TreeTreeNode(${tree})"
  }

  trait TreeListNode {
    def tree: List[Tree]
    override def toString: String = s"TreeListNode(${tree.mkString(", ")})"
  }

  val accumulation = new Accumulation[TreeNodeType] {
    override def toUpper(append: TreeListNode): TreeTreeNode = new TreeTreeNode {
      override val tree = q"""org.scalax.asuna.mapper.append.Item.${TermName("apply" + append.tree.size)}(..${append.tree})"""
    }
    override def appendUpper(x: TreeUpper[TreeNodeType], y: TreeListNode): TreeListNode = new TreeListNode {
      override val tree = x.content.tree :: y.tree
    }
    override def appendLeaf(leaf: TreeLeaf[TreeNodeType], y: TreeListNode): TreeListNode = new TreeListNode {
      override val tree = q"""${TermName(valName)}.${TermName(leaf.content.name)}""" :: y.tree
    }
    override def initUpper(x: TreeUpper[TreeNodeType]): TreeListNode = new TreeListNode {
      override val tree = List(x.content.tree)
    }
    override def initLeaf(x: TreeLeaf[TreeNodeType]): TreeListNode = new TreeListNode {
      override val tree = List(q"""${TermName(valName)}.${TermName(x.content.name)}""")
    }
  }

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

  override def tree: Tree = typeTagOpt match {
    case Some(typeOpt) =>
      q"""{ ${TermName(valName)}: ${typeOpt} =>
          ${typeTagOpt.toList
        .flatMap { t =>
          names(t)
        }
        .map(n =>
          new NameTree {
            override val name = n
        }) match {
        case h :: tail =>
          Accumulation.toT(Accumulation.build[TreeNodeType](h, tail), accumulation).tree
        case _ =>
          q"""org.scalax.asuna.mapper.append.Item.apply0"""
      }}
        }"""
    case _ => Literal(Constant("喵"))
  }

  override def receive: PartialFunction[MacroMessage, (SetterActor[I], SendResult)] = {
    case ModelWithType(typeTag: c.universe.Type, false) =>
      (new SetterActor[I] {
        override val c: self.c.type                      = self.c
        override def typeTagOpt: Option[c.universe.Type] = Option(typeTag)
      }, send(ModelNames(names(typeTag))))
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

  class TreeNodeType extends NodeType {
    override type UpperType  = TreeTreeNode
    override type LeafType   = NameTree
    override type AppendType = TreeListNode
  }

  trait NameTree {
    def typeTag: Type
    def name: String
    override def toString: String = s"NameTree(${name})"
  }

  trait TreeTreeNode {
    def tree: Tree
    override def toString: String = s"TreeTreeNode(${tree})"
  }

  trait TreeListNode {
    def tree: List[Tree]
    override def toString: String = s"TreeListNode(${tree.mkString(", ")})"
  }

  val accumulation = new Accumulation[TreeNodeType] {
    override def toUpper(append: TreeListNode): TreeTreeNode = new TreeTreeNode {
      override val tree = q"""org.scalax.asuna.mapper.append.Item.${TermName("tag" + append.tree.size)}(..${append.tree})"""
    }
    override def appendUpper(x: TreeUpper[TreeNodeType], y: TreeListNode): TreeListNode = new TreeListNode {
      override val tree = x.content.tree :: y.tree
    }
    override def appendLeaf(leaf: TreeLeaf[TreeNodeType], y: TreeListNode): TreeListNode = new TreeListNode {
      override val tree = q"""{
        type ${TypeName(messageContent.leafMessage(leaf.content.name))} = String
        org.scalax.asuna.mapper.append.debug.ApplyProperty[${leaf.content.typeTag}].p(_.${TermName(leaf.content.name)}).debug[${TypeName(
        messageContent.leafMessage(leaf.content.name))}]
      }""" :: y.tree
    }
    override def initUpper(x: TreeUpper[TreeNodeType]): TreeListNode = new TreeListNode {
      override val tree = List(x.content.tree)
    }
    override def initLeaf(x: TreeLeaf[TreeNodeType]): TreeListNode = new TreeListNode {
      override val tree = List(q"""{
        type ${TypeName(messageContent.leafMessage(x.content.name))} = String
        org.scalax.asuna.mapper.append.debug.ApplyProperty[${x.content.typeTag}].p(_.${TermName(x.content.name)}).debug[${TypeName(
        messageContent.leafMessage(x.content.name))}]
      }""")
    }
  }

  override def tree: Tree =
    typeTagOpt.toList.flatMap { t =>
      names.map(n =>
        new NameTree {
          override val typeTag = t
          override val name    = n
      })
    } match {
      case h :: tail =>
        Accumulation.toT(Accumulation.build[TreeNodeType](h, tail), accumulation).tree
      case _ =>
        q"""org.scalax.asuna.mapper.append.Item.apply0"""
    }

  override def receive: PartialFunction[MacroMessage, (TagActor[I], SendResult)] = {
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
