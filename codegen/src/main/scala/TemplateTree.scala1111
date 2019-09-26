package org.scalax.asuna.codegen

object TemplateUtils1 {

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
          s"PItem2[${y.content}, ${x.content.content}]"
        } else {
          s"PItem2[${y.content}, ${x.content.content}]"
        }
      }
    }
    override def appendLeaf(leaf: TreeLeaf[TreeNodeType], y: TreeTreeNode, length: Int): TreeTreeNode = new TreeTreeNode {
      override val to_1 = leaf.content.name.isEmpty || y.to_1
      override val content = {
        val aa = s"EatValue1[${y.content}]"
        if (to_1) {
          leaf.content.name
            .map { i =>
              s"EatValue1[${y.content}${i}]"
            }
            .getOrElse(aa)
        } else {
          leaf.content.name
            .map { i =>
              s"EatValue2[${y.content}, ${i}]"
            }
            .getOrElse(aa)
        }
      }
    }
    override def initUpper(x: TreeUpper[TreeNodeType], length: Int): TreeTreeNode = new TreeTreeNode {
      override val to_1 = x.content.to_1
      override val content = if (length == 1) {
        s"PItem1[${x.content.content}]"
      } else {
        x.content.content
      }
    }
    override def initLeaf(x: TreeLeaf[TreeNodeType], length: Int): TreeTreeNode = new TreeTreeNode {
      override val to_1 = x.content.name.isEmpty || (length == 1)
      override val content = if (to_1) {
        x.content.name
          .map { i =>
            s"EatValue1[${i}]"
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
  }

  def plusXyy(index: Int): String = {
    val i = Accumulation.toT(
        Accumulation.build[TemplateUtils1.TreeNodeType](
          new TemplateUtils1.NameTree {
          override val name = Option(s"I1")
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
    val i = Accumulation.toT(
        Accumulation.build[TemplateUtils2.TreeNodeType](
          new TemplateUtils2.NameTree {
          override val name = Option((s"override def e${index}: E${index} = ", ""))
        }
        , ((index - 1) to 1 by (-1)).toVector.map { t =>
          new TemplateUtils2.NameTree {
            override val name = Option((s"override def e${t}: E${t} = ", ""))
          }
        }
      )
      , TemplateUtils2.accumulation
    )
    i.content.reverse.map { case (i1, i2) => s"${i1}item.item${i2}" }.mkString("\n")
  }

  def plusXyy(index: Int): String = {
    val i = Accumulation.toT(
        Accumulation.build[TemplateUtils2.TreeNodeType](
          new TemplateUtils2.NameTree {
          override val name = Option((s"override def i1: I1 = ", ""))
        }
        , (2 to index).toVector.map { t =>
          new TemplateUtils2.NameTree {
            override val name = Option((s"override def i${t}: I${t} = ", ""))
          }
        }
      )
      , TemplateUtils2.accumulation
    )
    i.content.map { case (i1, i2) => s"${i1}item.item${i2}" }.mkString("\n")
  }

}

/*object TemplateUtils3 {

  class TreeNodeType extends NodeType {
    override type UpperType = TreeTreeNode
    override type LeafType  = NameTree
  }

  trait NameTree {
    def name: Option[(String, String => String)]
  }

  trait TreeTreeNode {
    def to_1: Boolean
    def content: Vector[(String, String => String)]
    def valDefine: Vector[String]
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

object TemplateTree3 {

  def eatXyy(index: Int): String = {
    val i = Accumulation.toT(
        Accumulation.build[TemplateUtils2.TreeNodeType](
          new TemplateUtils2.NameTree {
          override val name = Option.empty
        }
        , (1 to index).toVector.map { t =>
          new TemplateUtils2.NameTree {
            override val name = Option((s"override def i${t}: I${t} = ", ""))
          }
        }
      )
      , TemplateUtils2.accumulation
    )
    i.content.map { case (i1, i2) => s"${i1}item.item${i2}" }.mkString("\n")
  }

}*/
