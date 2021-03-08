package zsg.codegen3

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object SOFAliasCodegen {

  case class NameType(name: String)

  val root2XDir = Paths.get(".", "modules", "codegen", "src", "test", "scala", "zsg", "codegen3")

  def toAliasType(count: Int): String = {
    for (i <- 0 to count) yield {
      val s = SystemOfNumeration.init6(NameType("T1"), NameType("T2"), NameType("T3"), NameType("T4"), NameType("T5"), NameType("T6"))
      val b = (0 to i).foldLeft(s)((x, y) => x.next(NameType(s"T${y}")))
      b match {
        case 2 =>
      }
    }
  }

  def main(i: Array[String]): Unit = {
    val filePath = root2XDir.resolve("SystemOfNumerationTestItem1.scala")
    Files.createDirectories(root2XDir)
    Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
      val content = zsg.codegen.StringUtil.trimLines(zsg.codegen3.son.txt.SystemOfNumerationTestItem1().body)
      writer.println(content)
    }
  }

}
