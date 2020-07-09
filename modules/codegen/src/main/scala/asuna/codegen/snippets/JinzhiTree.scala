package zsg.codegen

import scala.annotation.tailrec

object JinzhiTree {

  sealed trait TreeContent[T]
  case class DataTree[T](data: T) extends TreeContent[T]
  case class NodeTree[T](i1: TreeContent[T], i2: TreeContent[T]) extends TreeContent[T]

  def listToTree[T](data: List[T]): TreeContent[T] = {
    def splitData[T](d: List[T]):(List[T], List[T]) = {
      val size = d.size
      val start = 2
      @tailrec
      def takeSzie(t : Int): Int = {
        if (t >= size) t /2 else takeSzie(t * 2)
      }
      val splitSize = takeSzie(start)
      (d.take(splitSize), d.drop(splitSize))
    }
    val (headList, tailList) = splitData(data)
    (headList, tailList) match {
      case (h :: Nil, Nil) =>
        DataTree(h)
      case (h, Nil) =>
        listToTree(h)
      case (h, t) =>
        NodeTree(listToTree(h), listToTree(t))
    }
  }

  def treeToTypeImpl(i: TreeContent[String]): String = {
    i match {
      case d: DataTree[String] =>
        d.data
      case n: NodeTree[String ] =>
        s"""ZsgTuple2[${treeToTypeImpl(n.i1)}, ${treeToTypeImpl(n.i2)}]"""
    }
  }

  def treeToType(i: Int): String = {
    treeToTypeImpl(listToTree((1 to i).to(List).map(r => s"I${r}")))
  }

}
