package zsg.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object ZsgDebugCodeGeneration {

  val root2XDir =
    Paths.get(".").resolve("modules").resolve("debug").resolve("src").resolve("main").resolve("scala-2").resolve("zsg").resolve("codegen")

  val rootAllDir =
    Paths.get(".").resolve("modules").resolve("debug").resolve("src").resolve("main").resolve("scala").resolve("zsg").resolve("codegen")

  val rootDottyDir =
    Paths.get(".").resolve("modules").resolve("debug").resolve("src").resolve("main").resolve("scala-3").resolve("zsg").resolve("codegen")

  def main(i: Array[String]): Unit = {

    {
      for (proNum <- 1 to 127) yield {
        val filePath = root2XDir.resolve("debug").resolve(s"DebugCaseClass${proNum}.scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content =
          StringUtil.trimLines(zsg.codegen.debug.txt.DebugCaseClass(maxPropertyNum = ZsgParameters.maxPropertyNum)(proNum = proNum)(isDotty = false).body)
        writer.println(content)
        writer.close()
      }

      for (proNum <- 1 to 127) yield {
        val filePath = rootDottyDir.resolve("debug").resolve(s"DebugCaseClass${proNum}.scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content =
          StringUtil.trimLines(zsg.codegen.debug.txt.DebugCaseClass(maxPropertyNum = ZsgParameters.maxPropertyNum)(proNum = proNum)(isDotty = true).body)
        writer.println(content)
        writer.close()
      }
    }

    {
      val filePath = rootAllDir.resolve("debug").resolve(s"ZsgTupleToDebugCaseClass.scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        StringUtil.trimLines(zsg.codegen.debug.txt.ZsgTupleToDebugCaseClass().body)
      writer.println(content)
      writer.close()
    }

    {
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
    }

  }

}
