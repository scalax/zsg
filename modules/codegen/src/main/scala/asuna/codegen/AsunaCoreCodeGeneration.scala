package asuna.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object AsunaCoreCodeGeneration {

  val root2XDir =
    Paths.get("./").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala-2").resolve("asuna").resolve("codegen")
  val build2XDir = root2XDir.resolve("build")

  val rootAllDir =
    Paths.get("./").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala").resolve("asuna").resolve("codegen")
  val buildAllDir = rootAllDir.resolve("build")

  val rootDottyDir =
    Paths.get("./").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala-3").resolve("asuna").resolve("codegen")
  val buildDottyDir = rootDottyDir.resolve("build")

  def main(i: Array[String]): Unit = {
    for (i <- 1 to AsunaParameters.maxContextNum) yield {
      val filePath = rootAllDir.resolve("mapper" + i).resolve("Plus" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer       = new PrintWriter(filePath.toFile, "utf-8")
      val linerContent = StringUtil.trimLines(asuna.codegen.tuple.txt.PlusX(tagNum = i, maxAsunaTupleNum = AsunaParameters.maxPropertyNum).body)
      writer.println(linerContent)
      writer.close()
    }

    for (i <- 1 to AsunaParameters.maxContextNum) yield {
      val filePath = rootAllDir.resolve("mapper" + i).resolve("Context" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer       = new PrintWriter(filePath.toFile, "utf-8")
      val linerContent = StringUtil.trimLines(asuna.codegen.tuple.txt.ContextX(tagNum = i).body)
      writer.println(linerContent)
      writer.close()
    }

    for (i <- 1 to AsunaParameters.maxContextNum) yield {
      val filePath = rootAllDir.resolve("mapper" + i).resolve("Application" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer       = new PrintWriter(filePath.toFile, "utf-8")
      val linerContent = StringUtil.trimLines(asuna.codegen.tuple.txt.ApplicationX(tagNum = i).body)
      writer.println(linerContent)
      writer.close()
    }

    {
      for (i <- 1 to AsunaParameters.maxPropertyNum) yield {
        val filePath = root2XDir.resolve("mapper" + i).resolve("AsunaTuple" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content = StringUtil.trimLines(
          asuna.codegen.tuple.txt.AsunaTuple(tagNum = i)(maxAsunaTupleNum = AsunaParameters.maxPropertyNum, maxAsunaContext = AsunaParameters.maxContextNum)(false).body
        )
        writer.println(content)
        writer.close()
      }
      for (i <- 1 to AsunaParameters.maxPropertyNum) yield {
        val filePath = rootDottyDir.resolve("mapper" + i).resolve("AsunaTuple" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content = StringUtil.trimLines(
          asuna.codegen.tuple.txt.AsunaTuple(tagNum = i)(maxAsunaTupleNum = AsunaParameters.maxPropertyNum, maxAsunaContext = AsunaParameters.maxContextNum)(true).body
        )
        writer.println(content)
        writer.close()
      }
    }

    {
      val filePath = buildAllDir.resolve("NodeNumberMessage.scala")
      Files.createDirectories(filePath.getParent)
      val writer23 = new PrintWriter(filePath.toFile, "utf-8")
      val content231 =
        Source
          .fromString(asuna.codegen.tuple.build.txt.NodeNumberMessage(maxItem = AsunaParameters.maxPropertyNum).body)
          .getLines
          .toList
          .map(_.trim)
          .filter(s => !s.isEmpty)
      val content232 = content231.mkString(System.lineSeparator)
      writer23.println(content232)
      writer23.close()
    }

    {
      val filePath = buildAllDir.resolve("TupleNumberMessage.scala")
      Files.createDirectories(filePath.getParent)
      val writer24 = new PrintWriter(filePath.toFile, "utf-8")
      val content241 =
        Source
          .fromString(asuna.codegen.tuple.build.txt.TupleNumberMessage(maxItem = AsunaParameters.maxPropertyNum).body)
          .getLines
          .toList
          .map(_.trim)
          .filter(s => !s.isEmpty)
      val content242 = content241.mkString(System.lineSeparator)
      writer24.println(content242)
      writer24.close()
    }

    {
      val filePath = buildAllDir.resolve("BuildContent.scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source.fromString(asuna.codegen.tuple.build.txt.BuildContent(maxItem = AsunaParameters.maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val lineContent = content.mkString(System.lineSeparator)
      writer.println(lineContent)
      writer.close()
    }

    {
      val filePath = rootAllDir.resolve("message").resolve("MessageClass.scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source
          .fromString(
            asuna.codegen.debug.scala_all.txt.MessageClass(maxContextIndex = AsunaParameters.maxContextNum, maxPropertyNum = AsunaParameters.maxPropertyNum).body
          )
          .getLines
          .toList
          .map(_.trim)
          .filter(s => !s.isEmpty)
      val linerContent = content.mkString(System.lineSeparator)
      writer.println(linerContent)
      writer.close()
    }

  }

}
