package zsg.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object ZsgCoreCodeGeneration {

  val root2XDir    = Paths.get(".", "modules", "core", "src", "main", "scala-2", "zsg", "codegen")
  val rootDottyDir = Paths.get(".", "modules", "core", "src", "main", "scala-3", "zsg", "codegen")

  /*def typeHListXGen(n: Int): String = {
    def typeStr(count: Int) = (1 to count).map(i => s"I$i").mkString(",")
    def typeHListImpl(current: Int, sum: Int): String = {
      (current, sum) match {
        case (current, sum) if current == sum =>
          s"""
             |class TypeHList${current}[${typeStr(current)}] extends TypeHList {
             |  override type Head = I${sum - current + 1}
             |  ${typeHListImpl(current - 1, sum)}
             |}
             |""".stripMargin
        case (current, sum) if current < sum && current > 0 =>
          s"""
          |override type Tail = TypeHListImpl${current}[${typeStr(current)}]
          |class TypeHListImpl${current}[${typeStr(current)}] extends TypeHList {
          |  override type Head = I${sum - current + 1}
          |  ${typeHListImpl(current - 1, sum)}
          |}
          |""".stripMargin
        case (0, _) => "override type Tail <: TypeHList"
      }
    }
    typeHListImpl(n, n)
  }*/

  def typeHListXGen1(n: Int): String = {
    val seq  = (1 to n).map(i => s"T$i")
    val seq2 = (2 to n).map(i => s"T$i")
    s"type TypeHList${n}[${seq.mkString(", ")}] = TypeHList { type Head = T1; type Tail = TypeHList${n - 1}[${seq2.mkString(", ")}] }"
  }

  trait TypeHListGen[+T]
  case class TypeHPositiveGen[+T](head: T, tail: TypeHListGen[T]) extends TypeHListGen[T]
  case object TypeHNilGen                                         extends TypeHListGen[Nothing]

  def fromCollection[T](seq: Seq[T]): TypeHListGen[T] = {
    val list = seq.to(List)
    def from(l: List[T]): TypeHListGen[T] = l match {
      case head :: tail => TypeHPositiveGen(head, from(tail))
      case Nil          => TypeHNilGen
    }
    from(list)
  }

  def scala3TypeHListXGen(n: Int): String = {
    val seq = (1 to n).map(i => s"T$i")
    val gen = fromCollection(seq)
    def fromGen(gen1: TypeHListGen[String]): String = gen1 match {
      case TypeHPositiveGen(head, tail) => s"TypePositive[$head, ${fromGen(tail)}]"
      case TypeHNilGen                  => "TypeZero"
    }
    val perfix = s"type TypeHList$n[${seq.mkString(", ")}] = "
    perfix + fromGen(gen)
  }

  def main(i: Array[String]): Unit = {
    {
      val filePath = root2XDir.resolve("TypeHListX.scala")
      Files.createDirectories(filePath.getParent)
      Using.resource(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(zsg.codegen.tuple.txt.TypeHListX(maxItem = ZsgParameters.maxZTupleNum).body)
        writer.println(content)
      }
    }

    {
      val filePath = root2XDir.resolve("TagMerge.scala")
      Files.createDirectories(filePath.getParent)
      Using.resource(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(zsg.codegen.tuple.txt.TagMerge(tagNum = ZsgParameters.maxZTupleNum).body)
        writer.println(content)
      }
    }

    // Scala 3
    {
      val filePath = rootDottyDir.resolve("TypeHListX.scala")
      Files.createDirectories(filePath.getParent)
      Using.resource(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(zsg.scala3Codegen.tuple.txt.TypeHListX(maxItem = ZsgParameters.maxZTupleNum).body)
        writer.println(content)
      }
    }
  }

}
