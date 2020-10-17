package zsg.codegen

import scala.annotation.tailrec

object JinzhiTree {

  sealed trait TreeContent[T]
  case class DataTree[T](data: T)                                extends TreeContent[T]
  case class NodeTree[T](i1: TreeContent[T], i2: TreeContent[T]) extends TreeContent[T]

  def listToTree[T](data: List[T]): TreeContent[T] = {
    def splitData[T](d: List[T]): (List[T], List[T]) = {
      val size  = d.size
      val start = 2
      @tailrec
      def takeSzie(t: Int): Int = {
        if (t >= size) t / 2 else takeSzie(t * 2)
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

  def treeToType(i: Int): String = {
    def treeToTypeImpl(i: TreeContent[String]): String = {
      i match {
        case d: DataTree[String] =>
          d.data
        case n: NodeTree[String] =>
          s"""zsg.ZsgTuple2[${treeToTypeImpl(n.i1)}, ${treeToTypeImpl(n.i2)}]"""
      }
    }
    treeToTypeImpl(listToTree((1 to i).to(List).map(r => s"I${r}")))
  }

  def treeBuildModel(i: Int): String = {
    def treeBuildImpl(i: TreeContent[String]): String = {
      i match {
        case d: DataTree[String] =>
          d.data
        case n: NodeTree[String] =>
          s"""new ZsgTuple2(i1 = ${treeBuildImpl(n.i1)}, i2 = ${treeBuildImpl(n.i2)})"""
      }
    }
    treeBuildImpl(listToTree((1 to i).to(List).map(r => s"n.i${r}")))
  }

  def treeIndex(i: Int, className: String): String = {
    def treeIndexImpl(i: TreeContent[Int], suffix: String): Map[Int, String] = {
      i match {
        case d: DataTree[Int] =>
          Map((d.data, suffix))
        case n: NodeTree[Int] =>
          treeIndexImpl(n.i1, suffix + ".i1") ++ treeIndexImpl(n.i2, suffix + ".i2")
      }
    }

    val index = (1 to i - 1).to(List)
    val map   = treeIndexImpl(listToTree(index), "")
    s"new ${className}(${index.map(i => s"i${i} = m${map(i)}").mkString(" , ")}, i${i} = n)"
  }

  def scalaTupleTreeBuildModel(i: Int): String = {
    def treeBuildImpl(i: TreeContent[String]): String = {
      i match {
        case d: DataTree[String] =>
          d.data
        case n: NodeTree[String] =>
          s"""new zsg.ZsgTuple2(i1 = ${treeBuildImpl(n.i1)}, i2 = ${treeBuildImpl(n.i2)})"""
      }
    }
    treeBuildImpl(listToTree((1 to i).to(List).map(r => s"n._${r}")))
  }

  def scalaTupleTreeIndex(i: Int, className: String): String = {
    def treeIndexImpl(i: TreeContent[Int], suffix: String): Map[Int, String] = {
      i match {
        case d: DataTree[Int] =>
          Map((d.data, suffix))
        case n: NodeTree[Int] =>
          treeIndexImpl(n.i1, suffix + ".i1") ++ treeIndexImpl(n.i2, suffix + ".i2")
      }
    }

    val index = (1 to i - 1).to(List)
    val map   = treeIndexImpl(listToTree(index), "")
    s"new ${className}(${index.map(i => s"_${i} = m${map(i)}").mkString(" , ")}, _${i} = n)"
  }

  def contextAppendImpl(i: TreeContent[String], contextNum: Int): String = {
    i match {
      case d: DataTree[String] =>
        d.data
      case n: NodeTree[String] =>
        s"context.append(${contextAppendImpl(n.i1, contextNum = contextNum)}, ${contextAppendImpl(n.i2, contextNum = contextNum)})(PlusInstanceZsgTuple2.contextNum${contextNum})"
    }
  }

  def contextAppend(i: Int, contextNum: Int): String = {
    contextAppendImpl(listToTree((1 to i).to(List).map(r => s"t${r}")), contextNum = contextNum)
  }

  def nodeContextAppend(i: Int, contextNum: Int): String = {
    contextAppendImpl(listToTree((1 to i).to(List).map(r => s"t${r}.application(context)")), contextNum = contextNum)
  }

}
