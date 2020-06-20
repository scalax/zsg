package zsg.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object ZsgCoreCodeGeneration {

  val root2XDir =
    Paths.get("./").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala-2").resolve("zsg").resolve("codegen")
  val build2XDir = root2XDir.resolve("build")

  val rootAllDir =
    Paths.get("./").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala").resolve("zsg").resolve("codegen")

  val rootDottyDir =
    Paths.get("./").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala-3").resolve("zsg").resolve("codegen")
  val buildDottyDir = rootDottyDir.resolve("build")

  def main(i: Array[String]): Unit = {
    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      val filePath = rootAllDir.resolve("mapper" + i).resolve("Plus" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer       = new PrintWriter(filePath.toFile, "utf-8")
      val linerContent = StringUtil.trimLines(zsg.codegen.tuple.txt.PlusX(tagNum = i, maxAsunaTupleNum = ZsgParameters.maxPropertyNum).body)
      writer.println(linerContent)
      writer.close()
    }

    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      val filePath = rootAllDir.resolve("mapper" + i).resolve("Context" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer       = new PrintWriter(filePath.toFile, "utf-8")
      val linerContent = StringUtil.trimLines(zsg.codegen.tuple.txt.ContextX(tagNum = i).body)
      writer.println(linerContent)
      writer.close()
    }

    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      val filePath = rootAllDir.resolve("mapper" + i).resolve("Application" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer       = new PrintWriter(filePath.toFile, "utf-8")
      val linerContent = StringUtil.trimLines(zsg.codegen.tuple.txt.ApplicationX(tagNum = i).body)
      writer.println(linerContent)
      writer.close()
    }

    {
      for (i <- 1 to ZsgParameters.maxPropertyNum) yield {
        val filePath = root2XDir.resolve("mapper" + i).resolve("ZsgTuple" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content = StringUtil.trimLines(
          zsg.codegen.tuple.txt.ZsgTuple(tagNum = i)(maxAsunaTupleNum = ZsgParameters.maxPropertyNum, maxAsunaContext = ZsgParameters.maxContextNum)(false).body
        )
        writer.println(content)
        writer.close()
      }
      for (i <- 1 to ZsgParameters.maxPropertyNum) yield {
        val filePath = rootDottyDir.resolve("mapper" + i).resolve("ZsgTuple" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content = StringUtil.trimLines(
          zsg.codegen.tuple.txt.ZsgTuple(tagNum = i)(maxAsunaTupleNum = ZsgParameters.maxPropertyNum, maxAsunaContext = ZsgParameters.maxContextNum)(true).body
        )
        writer.println(content)
        writer.close()
      }
    }

    {
      for (i <- 1 to ZsgParameters.maxPropertyNum) yield {
        val filePath = root2XDir.resolve("mapper" + i).resolve("NodeTuple" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content = StringUtil.trimLines(
          zsg.codegen.tuple.txt.NodeTuple(tagNum = i)(maxAsunaTupleNum = ZsgParameters.maxPropertyNum, maxAsunaContext = ZsgParameters.maxContextNum)(false).body
        )
        writer.println(content)
        writer.close()
      }
      for (i <- 1 to ZsgParameters.maxPropertyNum) yield {
        val filePath = rootDottyDir.resolve("mapper" + i).resolve("NodeTuple" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content = StringUtil.trimLines(
          zsg.codegen.tuple.txt.NodeTuple(tagNum = i)(maxAsunaTupleNum = ZsgParameters.maxPropertyNum, maxAsunaContext = ZsgParameters.maxContextNum)(true).body
        )
        writer.println(content)
        writer.close()
      }
    }

    /*{
      {
        val filePath = root2XDir.resolve("DebugMessage.scala")
        Files.createDirectories(filePath.getParent)
        val writer  = new PrintWriter(filePath.toFile, "utf-8")
        val content = StringUtil.trimLines(zsg.codegen.tuple.txt.DebugMessage(maxItem = ZsgParameters.maxContextNum)(isDotty = false).body)
        writer.println(content)
        writer.close()
      }
      {
        val filePath = rootDottyDir.resolve("DebugMessage.scala")
        Files.createDirectories(filePath.getParent)
        val writer  = new PrintWriter(filePath.toFile, "utf-8")
        val content = StringUtil.trimLines(zsg.codegen.tuple.txt.DebugMessage(maxItem = ZsgParameters.maxContextNum)(isDotty = true).body)
        writer.println(content)
        writer.close()
      }
    }*/

    {
      {
        val filePath = build2XDir.resolve("BuildContent.scala")
        Files.createDirectories(filePath.getParent)
        val writer  = new PrintWriter(filePath.toFile, "utf-8")
        val content = StringUtil.trimLines(zsg.codegen.tuple.build.txt.BuildContent(maxItem = ZsgParameters.maxPropertyNum)(isDotty = false).body)
        writer.println(content)
        writer.close()
      }
      {
        val filePath = buildDottyDir.resolve("BuildContent.scala")
        Files.createDirectories(filePath.getParent)
        val writer  = new PrintWriter(filePath.toFile, "utf-8")
        val content = StringUtil.trimLines(zsg.codegen.tuple.build.txt.BuildContent(maxItem = ZsgParameters.maxPropertyNum)(isDotty = true).body)
        writer.println(content)
        writer.close()
      }
    }

  }

}
