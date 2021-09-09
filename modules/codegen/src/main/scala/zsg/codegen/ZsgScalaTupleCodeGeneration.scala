package zsg.codegen

import zsg.codegen.helper.{TreeAbs, TreeContent, TreeHelper, TreeLeaf}

import java.io.PrintWriter
import java.nio.file.{Files, Paths}
import scala.util.Using

object ZsgScalaTupleCodeGeneration {

  val root2XDir = Paths.get(".", "modules", "scala-tuple", "src", "main", "scala-2", "zsg", "scala", "tuple", "codegen")

  def main(arrs: Array[String]): Unit = {
    {
      val filePath = root2XDir.resolve("TupleHelper.scala")
      Files.createDirectories(filePath.getParent)
      Using.resource(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val linerContent =
          StringUtil.trimLines(zsg.codegen.scalaTuple.txt.ScalaTuple_Scala2_Implicit(tagNum = ZsgParameters.maxScala2TupleNum).body)
        writer.println(linerContent)
      }
    }
    {
      val filePath = root2XDir.resolve("Tuple22TypeHList.scala")
      Files.createDirectories(filePath.getParent)
      Using.resource(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val linerContent =
          StringUtil.trimLines(zsg.codegen.scalaTuple.txt.ScalaTuple_Scala2_TypeHList(tagNum = ZsgParameters.maxScala2TupleNum).body)
        writer.println(linerContent)
      }
    }
    {
      val filePath = root2XDir.resolve("Tuple22Plus.scala")
      Files.createDirectories(filePath.getParent)
      Using.resource(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val linerContent =
          StringUtil.trimLines(zsg.codegen.scalaTuple.txt.ScalaTuple_Scala2_TuplePlus(tagNum = ZsgParameters.maxScala2TupleNum).body)
        writer.println(linerContent)
      }
    }
  }

  def genHListString1(strSeq: Seq[String]): String = {
    val tree = TreeHelper.fromSeq(strSeq, 2)
    def genString(tree1: TreeAbs[String]): String = {
      tree1 match {
        case TreeContent(List(content1, content2)) => s"Item2TypeHList[${genString(content1)}, ${genString(content2)}]"
        case TreeLeaf(leaf)                        => leaf
      }
    }
    genString(tree)
  }

  def genHListString2(strSeq: Seq[String]): String = {
    val tree = TreeHelper.fromSeq(strSeq, 2)
    def genString(tree1: TreeAbs[String]): String = {
      tree1 match {
        case TreeContent(List(content1, content2)) => s"ZsgTuple2[${genString(content1)}, ${genString(content2)}]"
        case TreeLeaf(leaf)                        => leaf
      }
    }
    genString(tree)
  }

  def genHListString3(strSeq: Seq[String]): String = {
    val tree = TreeHelper.fromSeq(strSeq, 2)
    def genString(tree1: TreeAbs[String]): String = {
      tree1 match {
        case TreeContent(List(content1, content2)) => s"new ZsgTuple2(${genString(content1)}, ${genString(content2)})"
        case TreeLeaf(leaf)                        => leaf
      }
    }
    genString(tree)
  }

  def genHListString4(n: Int, str: String): List[String] = {
    val tree = TreeHelper.fromSeq(List.fill(n)(str), 2)
    def genString(tree1: TreeAbs[String]): List[(String, String)] = {
      tree1 match {
        case TreeContent(List(content1, content2)) =>
          genString(content1).map(s => (s._1, ".i1" + s._2)) ::: genString(content2).map(s => (s._1, ".i2" + s._2))
        case TreeLeaf(leaf) => List((leaf, ""))
      }
    }
    genString(tree).map(i => i._1 + i._2)
  }

  def genHListString5(n: Seq[String]): String = {
    val tree = TreeHelper.fromSeq(n, 2)
    def genString(tree1: TreeAbs[String]): String = {
      tree1 match {
        case TreeContent(List(content1, content2)) =>
          s"context.append(${genString(content1)}, ${genString(content2)})(Plus.item2Plus)"
        case TreeLeaf(leaf) => leaf
      }
    }
    genString(tree)
  }

}
