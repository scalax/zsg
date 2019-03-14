package org.scalax.asuna.codegen

object TemplateUtils1 {

  /*class TreeNodeType extends NodeType {
    override type UpperType = TreeTreeNode
    override type LeafType  = NameTree
  }

  trait NameTree {
    def name: Option[String]
  }

  trait TreeTreeNode {
    def content: Option[String]
  }

  val accumulation = new Accumulation[TreeNodeType] {
    override def appendUpper(x: TreeUpper[TreeNodeType], y: TreeTreeNode, length: Int): TreeTreeNode = new TreeTreeNode {
      override val content = {
        (y.content, x.content.content) match {
          case (Some(i), Some(ii)) =>
            Option(s"ItemValue2[${i}, ${ii}]")
          case (Some(i), None) =>
            Option(s"ItemValue1[${i}]")
          case (None, Some(i)) =>
            Option(s"ItemValue1[${i}]")
        }
      }
    }
    override def appendLeaf(leaf: TreeLeaf[TreeNodeType], y: TreeTreeNode, length: Int): TreeTreeNode = new TreeTreeNode {
      override val content = {
        (y.content, leaf.content.name) match {
          case (Some(i), Some(ii)) =>
            Option(s"ItemValue2[${i}, ${ii}]")
          case (Some(i), None) =>
            Option(s"ItemValue1[${i}]")
          case (None, Some(i)) =>
            Option(s"ItemValue1[${i}]")
        }
      }
    }
    override def initUpper(x: TreeUpper[TreeNodeType], length: Int): TreeTreeNode = new TreeTreeNode {
      override val content = if (length == 1) {
        x.content.content.map { i =>
          s"ItemValue1[${i}]"
        }
      } else {
        x.content.content
      }
    }
    override def initLeaf(x: TreeLeaf[TreeNodeType], length: Int): TreeTreeNode = new TreeTreeNode {
      override val content = if (length == 1) {
        x.content.name.map { i =>
          s"ItemValue1[${i}]"
        }
      } else {
        x.content.name
      }
    }
  }*/

  class TreeNodeType extends NodeType {
    override type UpperType = TreeTreeNode
    override type LeafType  = NameTree
  }

  trait NameTree {
    def name: Option[String]
  }

  trait TreeTreeNode {
    def to_1: Boolean
    def content: String
  }

  val accumulation = new Accumulation[TreeNodeType] {
    override def appendUpper(x: TreeUpper[TreeNodeType], y: TreeTreeNode, length: Int): TreeTreeNode = new TreeTreeNode {
      override val to_1 = x.content.to_1 && y.to_1
      override val content = {
        if (to_1) {
          s"Item2[${y.content}, ${x.content.content}]"
        } else {
          s"Item2[${y.content}, ${x.content.content}]"
        }
      }
    }
    override def appendLeaf(leaf: TreeLeaf[TreeNodeType], y: TreeTreeNode, length: Int): TreeTreeNode = new TreeTreeNode {
      override val to_1 = leaf.content.name.isEmpty || y.to_1
      override val content = {
        val aa = s"Item1[${y.content}]"
        if (to_1) {
          leaf.content.name
            .map { i =>
              s"Item1[${y.content}${i}]"
            }
            .getOrElse(aa)
        } else {
          leaf.content.name
            .map { i =>
              s"Item2[${y.content}, ${i}]"
            }
            .getOrElse(aa)
        }
      }
    }
    override def initUpper(x: TreeUpper[TreeNodeType], length: Int): TreeTreeNode = new TreeTreeNode {
      override val to_1 = x.content.to_1
      override val content = if (length == 1) {
        s"Item1[${x.content.content}]"
      } else {
        x.content.content
      }
    }
    override def initLeaf(x: TreeLeaf[TreeNodeType], length: Int): TreeTreeNode = new TreeTreeNode {
      override val to_1 = x.content.name.isEmpty || (length == 1)
      override val content = if (to_1) {
        x.content.name
          .map { i =>
            s"Item1[${i}]"
          }
          .getOrElse("")
      } else {
        x.content.name.getOrElse("")
      }
    }
  }

}

object TemplateTree {

  def eatXyy(index: Int): String = {
    /*if (index % 2 == 0) {*/
    val i = Accumulation.toT(
        Accumulation.build[TemplateUtils1.TreeNodeType](
          new TemplateUtils1.NameTree {
          override val name = Option.empty
        }
        , (1 to index).toVector.map { t =>
          new TemplateUtils1.NameTree {
            override val name = Option(s"I${t}")
          }
        }
      )
      , TemplateUtils1.accumulation
    )
    i.content
    /*} else {
      val i = Accumulation.toT(
          Accumulation.build[TemplateUtils1.TreeNodeType](
            new TemplateUtils1.NameTree {
            override val name = Option("I1")
          }
          , (2 to index).toVector.map { t =>
            new TemplateUtils1.NameTree {
              override val name = Option(s"I${t}")
            }
          }
        )
        , TemplateUtils1.accumulation
      )
      i.content.getOrElse("")
    }*/
  }

}

object TemplateUtils2 {

  class TreeNodeType extends NodeType {
    override type UpperType = TreeTreeNode
    override type LeafType  = NameTree
  }

  trait NameTree {
    def name: Option[(String, String)]
  }

  trait TreeTreeNode {
    def to_1: Boolean
    def content: Vector[(String, String)]
  }

  val accumulation = new Accumulation[TreeNodeType] {
    override def appendUpper(x: TreeUpper[TreeNodeType], y: TreeTreeNode, length: Int): TreeTreeNode = new TreeTreeNode {
      override val to_1 = x.content.to_1 && y.to_1
      override val content = {
        y.content ++ x.content.content.map { case (i1, i2) => (i1, if (to_1) s".i1${i2}" else s".i2${i2}") }
      }
    }
    override def appendLeaf(leaf: TreeLeaf[TreeNodeType], y: TreeTreeNode, length: Int): TreeTreeNode = new TreeTreeNode {
      override val to_1 = leaf.content.name.isEmpty || y.to_1
      override val content = {
        y.content ++ leaf.content.name.map { case (i1, i2) => (i1, if (to_1) s".i1${i2}" else s".i2${i2}") }.toVector
      }
    }
    override def initUpper(x: TreeUpper[TreeNodeType], length: Int): TreeTreeNode = new TreeTreeNode {
      override val to_1 = x.content.to_1
      override val content = x.content.content.map { i =>
        (i._1, s".i1${i._2}")
      }
    }
    override def initLeaf(x: TreeLeaf[TreeNodeType], length: Int): TreeTreeNode = new TreeTreeNode {
      override val to_1 = x.content.name.isEmpty
      override val content = x.content.name.map { i =>
        (i._1, s".i1${i._2}")
      }.toVector
    }
  }

}

object TemplateTree1 {

  def eatXyy(index: Int): String = {
    /*if (index % 2 == 0) {*/
    val i = Accumulation.toT(
        Accumulation.build[TemplateUtils2.TreeNodeType](
          new TemplateUtils2.NameTree {
          override val name = Option.empty
        }
        , (1 to index).toVector.map { t =>
          new TemplateUtils2.NameTree {
            override val name = Option((s"def i${t} = ", ""))
          }
        }
      )
      , TemplateUtils2.accumulation
    )
    i.content.map { case (i1, i2) => s"${i1}item${i2}" }.mkString("\n")
    /*} else {
      val i = Accumulation.toT(
          Accumulation.build[TemplateUtils2.TreeNodeType](
            new TemplateUtils2.NameTree {
            override val name = Option.empty
          }
          , (1 to index).toVector.map { t =>
            new TemplateUtils2.NameTree {
              override val name = Option((s"def i${t} = ", ""))
            }
          }
        )
        , TemplateUtils2.accumulation
      )
      i.content.map { case (i1, i2) => s"${i1}item${i2}" }.mkString("\n")
    }*/
  }

}

/*object TemplateUtils3 {

  class TreeNodeType extends NodeType {
    override type UpperType  = TreeTreeNode
    override type LeafType   = NameTree
    override type AppendType = TreeListNode
  }

  trait NameTree {
    def name: String
    override def toString: String = name
  }

  trait TreeTreeNode {
    def tree: String
    override def toString: String = tree
  }

  trait TreeListNode {
    def tree: Vector[String]
    override def toString: String = tree.mkString(", ")
  }

  val accumulation = new Accumulation[TreeNodeType] {
    override def toUpper(append: TreeListNode): TreeTreeNode = new TreeTreeNode {
      override val tree = s"""Item${append.tree.size}[${append.tree.mkString(", ")}]"""
    }
    override def appendUpper(x: TreeUpper[TreeNodeType], y: TreeListNode, length: Int): TreeListNode = new TreeListNode {
      override val tree = x.content.tree +: y.tree
    }
    override def appendLeaf(leaf: TreeLeaf[TreeNodeType], y: TreeListNode, length: Int): TreeListNode = new TreeListNode {
      override val tree = leaf.content.name +: y.tree
    }
    override def initUpper(x: TreeUpper[TreeNodeType], length: Int): TreeListNode = new TreeListNode {
      override val tree = Vector(x.content.tree)
    }
    override def initLeaf(x: TreeLeaf[TreeNodeType], length: Int): TreeListNode = new TreeListNode {
      override val tree = Vector(x.content.name)
    }
  }

}

object TemplateTree2 {

  def eatXyy(index: Int): String = {
    /*if (index % 2 == 0) {
      val i = Accumulation.toT(
          Accumulation.build[TemplateUtils1.TreeNodeType](
            new TemplateUtils1.NameTree {
            override val name = Option("I1")
          }
          , (2 to index).toVector.map { t =>
            new TemplateUtils1.NameTree {
              override val name = Option(s"I${t}")
            }
          }
        )
        , TemplateUtils1.accumulation
      )
      i.content
    } else {*/
    val i = Accumulation.toT(
        Accumulation.build[TemplateUtils1.TreeNodeType](
          new TemplateUtils1.NameTree {
          override val name = Option.empty
        }
        , (1 to index).toVector.map { t =>
          new TemplateUtils1.NameTree {
            override val name = Option(s"I${t}")
          }
        }
      )
      , TemplateUtils1.accumulation
    )
    i.content
    //}
  }

}

object TemplateUtils4 {

  class TreeNodeType extends NodeType {
    override type UpperType  = TreeTreeNode
    override type LeafType   = NameTree
    override type AppendType = TreeListNode
  }

  trait NameTree {
    def name: (String, String)
    override def toString: String = s"""(${name}, ${name})"""
  }

  trait TreeTreeNode {
    def tree: Vector[(String, String)]
    override def toString: String = tree.mkString(", ")
  }

  trait TreeListNode {
    def tree: Vector[(String, String)]
    override def toString: String = tree.mkString(", ")
  }

  val accumulation = new Accumulation[TreeNodeType] {
    override def toUpper(append: TreeListNode): TreeTreeNode = new TreeTreeNode {
      override val tree = append.tree
    }
    override def appendUpper(x: TreeUpper[TreeNodeType], y: TreeListNode, length: Int): TreeListNode = new TreeListNode {
      override val tree = x.content.tree.map(i => (i._1, s".i${length - x.index}${i._2}")) ++ y.tree
    }
    override def appendLeaf(leaf: TreeLeaf[TreeNodeType], y: TreeListNode, length: Int): TreeListNode = new TreeListNode {
      override val tree = (leaf.content.name._1, s".i${length - leaf.index}${leaf.content.name._2}") +: y.tree
    }
    override def initUpper(x: TreeUpper[TreeNodeType], length: Int): TreeListNode = new TreeListNode {
      override val tree = x.content.tree.map(i => (i._1, s".i${length - x.index}${i._2}"))
    }
    override def initLeaf(x: TreeLeaf[TreeNodeType], length: Int): TreeListNode = new TreeListNode {
      override val tree = Vector((x.content.name._1, s".i${length - x.index}${x.content.name._2}"))
    }
  }

}

object TemplateTree3 {

  def eatXyy(index: Int): String = {
    ((index to 1 by -1).toVector.map { t =>
      new TemplateUtils4.NameTree {
        override val name = (s"override def i${t}: I${t} = ", "")
      }
    } match {
      case v @ Vector(h, _*) =>
        Accumulation.toT(Accumulation.build[TemplateUtils4.TreeNodeType](h, v.tail), TemplateUtils4.accumulation).tree
      case _ =>
        Vector.empty
    }).map(i => s"${i._1} item${i._2}").mkString("\n")
  }

}*/
