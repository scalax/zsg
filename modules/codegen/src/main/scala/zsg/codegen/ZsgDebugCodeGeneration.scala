package zsg.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object ZsgDebugCodeGeneration {

  val root2XDir    = Paths.get(".", "modules", "debug", "src", "main", "scala-2", "zsg", "codegen")
  val rootAllDir   = Paths.get(".", "modules", "debug", "src", "main", "scala", "zsg", "codegen")
  val rootDottyDir = Paths.get(".", "modules", "debug", "src", "main", "scala-3", "zsg", "codegen")

  def main(i: Array[String]): Unit = {

    {
      // for (proNum <- 2 to 64) yield {
      for (proNum <- 2 to 22) yield {
        val filePath = root2XDir.resolve(Paths.get("debug", s"DebugCaseClass${proNum}.scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val content = StringUtil.trimLines(zsg.codegen.debug.txt.DebugCaseClass(maxPropertyNum = ZsgParameters.maxZTupleNum)(proNum = proNum)(isDotty = false).body)
          writer.println(content)
        }
      }

      // for (proNum <- 2 to 64) yield {
      for (proNum <- 2 to 22) yield {
        val filePath = rootDottyDir.resolve(Paths.get("debug", s"DebugCaseClass${proNum}.scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val content = StringUtil.trimLines(zsg.codegen.debug.txt.DebugCaseClass(maxPropertyNum = ZsgParameters.maxZTupleNum)(proNum = proNum)(isDotty = true).body)
          writer.println(content)
        }
      }
    }

    {
      val filePath = rootAllDir.resolve(Paths.get("debug", s"ZsgTupleToDebugCaseClass.scala"))
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(zsg.codegen.debug.txt.ZsgTupleToDebugCaseClass().body)
        writer.println(content)
      }
    }

    /*{
      {
        val filePath = root2XDir.resolve("debug").resolve(s"DebugCaseClassTupleTag64.scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content =
          StringUtil.trimLines(zsg.codegen.debug.txt.DebugCaseClassTupleTag(maxPropertyNum = ZsgParameters.maxPropertyNum)(proNum = 64)(isDotty = false).body)
        writer.println(content)
        writer.close()
      }
      {
        val filePath = rootDottyDir.resolve("debug").resolve(s"DebugCaseClassTupleTag64.scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content =
          StringUtil.trimLines(zsg.codegen.debug.txt.DebugCaseClassTupleTag(maxPropertyNum = ZsgParameters.maxPropertyNum)(proNum = 64)(isDotty = true).body)
        writer.println(content)
        writer.close()
      }
    }*/

  }

}
