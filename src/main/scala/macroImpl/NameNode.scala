package org.scalax.asuna.mapper.append.macroImpl

trait NodeType {

  type UpperType
  type LeafType
  type AppendType

}

sealed trait NameNode[T <: NodeType]

trait TreeUpper[T <: NodeType] extends NameNode[T] {

  def index: Int
  def content: T#UpperType

  override def toString: String = s"TreeUpper(${index}, ${content})"

}

object TreeUpper {

  def apply[T <: NodeType](content1: T#UpperType, index1: Int): TreeUpper[T] = {
    new TreeUpper[T] {
      override val index   = index1
      override val content = content1
    }
  }

}

trait TreeLeaf[T <: NodeType] extends NameNode[T] {

  def index: Int
  def content: T#LeafType

  override def toString: String = s"TreeLeaf(${index}, ${content})"

}

object TreeLeaf {

  def apply[T <: NodeType](content1: T#LeafType, index1: Int): TreeLeaf[T] = {
    new TreeLeaf[T] {
      override val index   = index1
      override val content = content1
    }
  }

}

trait TreeNode[T <: NodeType] extends NameNode[T] {

  def index: Int
  def leaf: (NameNode[T], List[NameNode[T]])

  override def toString: String = s"TreeNode(${index}, ${(leaf._1 :: leaf._2).toString})"

}

object TreeNode {

  def apply[T <: NodeType](head1: NameNode[T], leaf1: List[NameNode[T]], index1: Int): TreeNode[T] = {
    new TreeNode[T] {
      override val index = index1
      override val leaf  = (head1, leaf1)
    }
  }

}

trait Accumulation[T <: NodeType] {
  def toUpper(append: T#AppendType): T#UpperType
  def appendUpper(x: TreeUpper[T], y: T#AppendType): T#AppendType
  def appendLeaf(leaf: TreeLeaf[T], y: T#AppendType): T#AppendType
  def initUpper(x: TreeUpper[T]): T#AppendType
  def initLeaf(x: TreeLeaf[T]): T#AppendType
}

object Accumulation {

  def toTImpl[T <: NodeType](node: TreeNode[T], accumulation: Accumulation[T]): TreeUpper[T] = {
    val tail = node.leaf._2.map { n =>
      n match {
        case leaf: TreeLeaf[T] => { i: T#AppendType =>
          accumulation.appendLeaf(leaf, i)
        }
        case u: TreeUpper[T] => { i: T#AppendType =>
          accumulation.appendUpper(u, i)
        }
        case each: TreeNode[T] => { i: T#AppendType =>
          accumulation.appendUpper(toTImpl(each, accumulation), i)
        }
      }
    }
    val head = node.leaf._1 match {
      case leaf: TreeLeaf[T] =>
        accumulation.initLeaf(leaf)
      case u: TreeUpper[T] =>
        accumulation.initUpper(u)
      case each: TreeNode[T] =>
        accumulation.initUpper(toTImpl(each, accumulation))
    }
    val c = tail.foldLeft(head) { (x, y) =>
      y(x)
    }
    TreeUpper(accumulation.toUpper(c), node.index)
  }

  def toT[T <: NodeType](node: TreeNode[T], accumulation: Accumulation[T]): T#UpperType = {
    toTImpl(node, accumulation).content
  }

  def buildImpl[T <: NodeType](h: T#LeafType, l: List[T#LeafType], index: Int): (TreeNode[T], List[TreeNode[T]]) = {
    l match {
      case i1 :: i2 :: i3 :: i4 :: tail =>
        val b = buildImpl(i4, tail, (index + 1) % 4)
        (TreeNode(TreeLeaf(h, 0), List(TreeLeaf(i1, 1), TreeLeaf(i2, 2), TreeLeaf(i3, 3)), index), b._1 :: b._2)
      case i1 :: i2 :: i3 :: Nil =>
        (TreeNode(TreeLeaf(h, 0), List(TreeLeaf(i1, 1), TreeLeaf(i2, 2), TreeLeaf(i3, 3)), index), List.empty)
      case i1 :: i2 :: Nil =>
        (TreeNode(TreeLeaf(h, 0), List(TreeLeaf(i1, 1), TreeLeaf(i2, 2)), index), List.empty)
      case i1 :: Nil =>
        (TreeNode(TreeLeaf(h, 0), List(TreeLeaf(i1, 1)), index), List.empty)
      case Nil =>
        (TreeNode(TreeLeaf(h, 0), List.empty, index), List.empty)
    }
  }

  def buildImpl1[T <: NodeType](h: TreeNode[T], n: List[TreeNode[T]], index: Int): (TreeNode[T], List[TreeNode[T]]) = {
    n match {
      case i1 :: i2 :: i3 :: i4 :: tail =>
        val b = buildImpl1(i4, tail, (index + 1) % 4)
        (TreeNode(h, List(i1, i2, i3), index), b._1 :: b._2)
      case i1 :: i2 :: i3 :: Nil =>
        (TreeNode(h, List(i1, i2, i3), index), List.empty)
      case i1 :: i2 :: Nil =>
        (TreeNode(h, List(i1, i2), index), List.empty)
      case i1 :: Nil =>
        (TreeNode(h, List(i1), index), List.empty)
      case Nil =>
        (TreeNode(h, List.empty, index), List.empty)
    }
  }

  def buildImpl2[T <: NodeType](h: TreeNode[T], n: List[TreeNode[T]]): TreeNode[T] = {
    val (h1, h2) = buildImpl1(h, n, 0)
    h2 match {
      case Nil                => h1
      case n @ (_ :: _) => buildImpl2(h1, n)
    }
  }

  def build[T <: NodeType](h: T#LeafType, l: List[T#LeafType]): TreeNode[T] = {
    val b = buildImpl(h, l, 0)
    buildImpl2(b._1, b._2)
  }

}
