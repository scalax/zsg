package asuna.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object AsunaCoreCodeGeneration {

  val root212Dir =
    Paths.get("./").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala-2.12").resolve("asuna").resolve("codegen")
  val build212Dir = root212Dir.resolve("build")

  val root213Dir =
    Paths.get("./").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala-2.13").resolve("asuna").resolve("codegen")
  val build213Dir = root213Dir.resolve("build")

  val rootAllDir =
    Paths.get("./").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala").resolve("asuna").resolve("codegen")
  val buildAllDir = rootAllDir.resolve("build")

  val rootDottyDir =
    Paths.get("./").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala-0.22").resolve("asuna").resolve("codegen")
  val buildDottyDir = rootDottyDir.resolve("build")

  def main(i: Array[String]): Unit = {
    for (i <- 1 to AsunaParameters.maxContextNum) yield {
      val filePath = rootAllDir.resolve("mapper" + i).resolve("Plus" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
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

    {
      for (i <- 1 to AsunaParameters.maxContextNum) yield {
        val filePath = rootDottyDir.resolve("mapper" + i).resolve("Application" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer       = new PrintWriter(filePath.toFile, "utf-8")
        val linerContent = StringUtil.trimLines(asuna.codegen.tuple.txt.ApplicationX(tagNum = i)(isDotty = true).body)
        writer.println(linerContent)
        writer.close()
      }
      for (i <- 1 to AsunaParameters.maxContextNum) yield {
        val filePath = root212Dir.resolve("mapper" + i).resolve("Application" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer       = new PrintWriter(filePath.toFile, "utf-8")
        val linerContent = StringUtil.trimLines(asuna.codegen.tuple.txt.ApplicationX(tagNum = i)(isDotty = false).body)
        writer.println(linerContent)
        writer.close()
      }
      for (i <- 1 to AsunaParameters.maxContextNum) yield {
        val filePath = root213Dir.resolve("mapper" + i).resolve("Application" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer       = new PrintWriter(filePath.toFile, "utf-8")
        val linerContent = StringUtil.trimLines(asuna.codegen.tuple.txt.ApplicationX(tagNum = i)(isDotty = false).body)
        writer.println(linerContent)
        writer.close()
      }
    }

    for (i <- 1 to AsunaParameters.maxPropertyNum) yield {
      val filePath = rootAllDir.resolve("mapper" + i).resolve("TupleTag" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val linerContent = StringUtil.trimLines(asuna.codegen.tuple.txt.TupleTag(tagNum = i).body)
      writer.println(linerContent)
      writer.close()
    }

    for (i <- 1 to AsunaParameters.maxPropertyNum) yield {
      val filePath = rootAllDir.resolve("mapper" + i).resolve("NodeTag" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer19 = new PrintWriter(filePath.toFile, "utf-8")
      val content191 =
        Source
          .fromString(asuna.codegen.tuple.txt.NodeTag(tagNum = i, maxTagNum = AsunaParameters.maxPropertyNum).body)
          .getLines
          .toList
          .map(_.trim)
          .filter(s => !s.isEmpty)
      val content192 = content191.mkString(System.lineSeparator)
      writer19.println(content192)
      writer19.close()
    }

    {
      {
        val filePath = root212Dir.resolve("build").resolve("support").resolve("NodeTagApplicationCompanion.scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val contentTrim =
          StringUtil
            .trimLines(
              asuna.codegen.tuple.txt.NodeTagApplicationCompanion(maxAsunaTupleNum = AsunaParameters.maxPropertyNum, maxAsunaContext = AsunaParameters.maxContextNum).body
            )
        writer.println(contentTrim)
        writer.close()
      }

      {
        val filePath = root213Dir.resolve("build").resolve("support").resolve("NodeTagApplicationCompanion.scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val contentTrim =
          StringUtil
            .trimLines(
              asuna.codegen.tuple.txt.NodeTagApplicationCompanion(maxAsunaTupleNum = AsunaParameters.maxPropertyNum, maxAsunaContext = AsunaParameters.maxContextNum).body
            )
        writer.println(contentTrim)
        writer.close()
      }

      {
        val filePath = rootDottyDir.resolve("build").resolve("support").resolve("NodeTagApplicationCompanion.scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val contentTrim =
          StringUtil
            .trimLines(
              asuna.codegen.tuple.txt
                .dotty_NodeTagApplicationCompanion(maxAsunaTupleNum = AsunaParameters.maxPropertyNum, maxAsunaContext = AsunaParameters.maxContextNum)
                .body
            )
        writer.println(contentTrim)
        writer.close()
      }
    }

    {
      {
        val filePath = root212Dir.resolve("build").resolve("support").resolve("TupleTagApplicationCompanion.scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val contentTrim =
          StringUtil
            .trimLines(
              asuna.codegen.tuple.txt
                .TupleTagApplicationCompanion(maxAsunaTupleNum = AsunaParameters.maxPropertyNum, maxAsunaContext = AsunaParameters.maxContextNum)
                .body
            )
        writer.println(contentTrim)
        writer.close()
      }

      {
        val filePath = root213Dir.resolve("build").resolve("support").resolve("TupleTagApplicationCompanion.scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val contentTrim =
          StringUtil
            .trimLines(
              asuna.codegen.tuple.txt
                .TupleTagApplicationCompanion(maxAsunaTupleNum = AsunaParameters.maxPropertyNum, maxAsunaContext = AsunaParameters.maxContextNum)
                .body
            )
        writer.println(contentTrim)
        writer.close()
      }

      {
        val filePath = rootDottyDir.resolve("build").resolve("support").resolve("TupleTagApplicationCompanion.scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val contentTrim =
          StringUtil
            .trimLines(
              asuna.codegen.tuple.txt
                .dotty_TupleTagApplicationCompanion(maxAsunaTupleNum = AsunaParameters.maxPropertyNum, maxAsunaContext = AsunaParameters.maxContextNum)
                .body
            )
        writer.println(contentTrim)
        writer.close()
      }
    }

    for (i <- 1 to AsunaParameters.maxPropertyNum) yield {
      val filePath = rootAllDir.resolve("mapper" + i).resolve("AsunaTuple" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content = StringUtil.trimLines(asuna.codegen.tuple.txt.AsunaTuple(tagNum = i, maxContextNum = AsunaParameters.maxContextNum).body)
      writer.println(content)
      writer.close()
    }

    for (i <- 1 to AsunaParameters.maxPropertyNum) yield {
      val filePath = rootAllDir.resolve("mapper" + i).resolve("PropertyTag" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer19   = new PrintWriter(filePath.toFile, "utf-8")
      val content191 = Source.fromString(asuna.codegen.tuple.txt.PropertyTag(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val content192 = content191.mkString(System.lineSeparator)
      writer19.println(content192)
      writer19.close()
    }

    {
      for (i <- 1 to AsunaParameters.maxPropertyNum) yield {
        val filePath = root212Dir.resolve("mapper" + i).resolve("Merge" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer19 = new PrintWriter(filePath.toFile, "utf-8")
        val content191 =
          Source
            .fromString(asuna.codegen.tuple.txt.Merge(tagNum = i, maxAsunaTupleNum = AsunaParameters.maxPropertyNum).body)
            .getLines
            .toList
            .map(_.trim)
            .filter(s => !s.isEmpty)
        val content192 = content191.mkString(System.lineSeparator)
        writer19.println(content192)
        writer19.close()
      }
      for (i <- 1 to AsunaParameters.maxPropertyNum) yield {
        val filePath = root213Dir.resolve("mapper" + i).resolve("Merge" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer19 = new PrintWriter(filePath.toFile, "utf-8")
        val content191 =
          Source
            .fromString(asuna.codegen.tuple.txt.Merge(tagNum = i, maxAsunaTupleNum = AsunaParameters.maxPropertyNum).body)
            .getLines
            .toList
            .map(_.trim)
            .filter(s => !s.isEmpty)
        val content192 = content191.mkString(System.lineSeparator)
        writer19.println(content192)
        writer19.close()
      }
      for (i <- 1 to AsunaParameters.maxPropertyNum) yield {
        val filePath = rootDottyDir.resolve("mapper" + i).resolve("Merge" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer19 = new PrintWriter(filePath.toFile, "utf-8")
        val content191 =
          Source
            .fromString(asuna.codegen.tuple.txt.dotty_Merge(tagNum = i, maxAsunaTupleNum = AsunaParameters.maxPropertyNum).body)
            .getLines
            .toList
            .map(_.trim)
            .filter(s => !s.isEmpty)
        val content192 = content191.mkString(System.lineSeparator)
        writer19.println(content192)
        writer19.close()
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
    }

    {
      {
        val filePath = build212Dir.resolve("BuildTag.scala")
        Files.createDirectories(filePath.getParent)
        val writer18 = new PrintWriter(filePath.toFile, "utf-8")
        val content181 =
          Source.fromString(asuna.codegen.tuple.build.txt.BuildTag(maxItem = AsunaParameters.maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
        val content182 = content181.mkString(System.lineSeparator)
        writer18.println(content182)
        writer18.close()
      }
      {
        val filePath = build213Dir.resolve("BuildTag.scala")
        Files.createDirectories(filePath.getParent)
        val writer18 = new PrintWriter(filePath.toFile, "utf-8")
        val content181 =
          Source.fromString(asuna.codegen.tuple.build.txt.BuildTag(maxItem = AsunaParameters.maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
        val content182 = content181.mkString(System.lineSeparator)
        writer18.println(content182)
        writer18.close()
      }
      {
        val filePath = buildDottyDir.resolve("BuildTag.scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content =
          Source
            .fromString(asuna.codegen.tuple.build.txt.dotty_BuildTag(maxItem = AsunaParameters.maxPropertyNum).body)
            .getLines
            .toList
            .map(_.trim)
            .filter(s => !s.isEmpty)
        val linerContent = content.mkString(System.lineSeparator)
        writer.println(linerContent)
        writer.close()
      }
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
