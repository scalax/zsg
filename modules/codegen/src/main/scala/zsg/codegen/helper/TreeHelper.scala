package zsg.codegen.helper

import scala.io.Source
import scala.util.Using

// 在 scala macro 也引入这个文件的源码，可以独立一个文件夹，但不建立项目，以 source code 的形式引入
sealed trait TreeAbs[+T]
case class TreeContent[+T](content: List[TreeAbs[T]]) extends TreeAbs[T] {
  override def toString: String = {
    def genContent(t: TreeAbs[T]) = Using.resource(Source.fromString(t.toString))(_.getLines().to(List))
    val contentStr                = content.flatMap(genContent)
    s"TreeContent(\n${contentStr.map(s => s"  $s").mkString("\n")}\n)"
  }
}
case class TreeLeaf[+T](leaf: T) extends TreeAbs[T]
case object EmptyTree            extends TreeAbs[Nothing]

object TreeHelper {

  def fromSeq[T](seq: Seq[T], count: Int): TreeAbs[T] = groupedTree(seq.map(TreeLeaf(_)), count)

  private def groupedTree[T](tree: Seq[TreeAbs[T]], count: Int): TreeAbs[T] = {
    if (tree.size == 0)
      EmptyTree
    else if (tree.size == 1)
      tree.head
    else if (tree.size <= count)
      TreeContent(tree.to(List))
    else {
      val grouped = tree.grouped(count).to(List)
      val seq     = grouped.map(groupedTree(_, count))
      groupedTree(seq, count)
    }
  }

}
