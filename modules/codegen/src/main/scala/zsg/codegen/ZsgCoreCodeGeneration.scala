package zsg.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object ZsgCoreCodeGeneration {

  val root2XDir = Paths.get(".", "modules", "core", "src", "main", "scala-2", "zsg", "codegen")

  def typeHListXGen(n: Int): String = {
    def typeStr(count: Int) = (1 to count).map(i => s"I${i}").mkString(",")
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
        case (0, sum) =>
          s"""
             |override type Tail = TypeHList${sum}[${typeStr(sum)}]
             |""".stripMargin
      }
    }
    typeHListImpl(n, n)
  }

  def main(i: Array[String]): Unit = {
    {
      val filePath = root2XDir.resolve("TypeHListX.scala")
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(zsg.codegen.tuple.txt.TypeHListX(maxItem = ZsgParameters.maxZTupleNum).body)
        writer.println(content)
      }
    }

    {
      val filePath = root2XDir.resolve("TagMerge.scala")
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(zsg.codegen.tuple.txt.TagMerge(tagNum = ZsgParameters.maxZTupleNum).body)
        writer.println(content)
      }
    }
  }

}
