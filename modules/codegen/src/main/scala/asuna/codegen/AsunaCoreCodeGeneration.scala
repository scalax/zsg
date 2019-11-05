package asuna.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object AsunaCoreCodeGeneration {

  def main(i: Array[String]): Unit = {
    val maxPropertyNum = 8
    val rootDir =
      Paths.get("./").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala").resolve("asuna").resolve("codegen")
    val tupleDir = rootDir.resolve("tuple")
    val buildDir = rootDir.resolve("build")

    for (i <- 1 to maxPropertyNum) yield {
      val filePath = rootDir.resolve("mapper" + i).resolve("Plus" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source.fromString(asuna.codegen.tuple.txt.PlusX(tagNum = i, maxAsunaTupleNum = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val linerContent = content.mkString(System.lineSeparator)
      writer.println(linerContent)
      writer.close()
    }

    for (i <- 1 to maxPropertyNum) yield {
      val filePath = rootDir.resolve("mapper" + i).resolve("Context" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source.fromString(asuna.codegen.tuple.txt.ContextX(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val linerContent = content.mkString(System.lineSeparator)
      writer.println(linerContent)
      writer.close()
    }

    for (i <- 1 to maxPropertyNum) yield {
      val filePath = rootDir.resolve("mapper" + i).resolve("Application" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source.fromString(asuna.codegen.tuple.txt.ApplicationX(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val linerContent = content.mkString(System.lineSeparator)
      writer.println(linerContent)
      writer.close()
    }

    for (i <- 1 to maxPropertyNum) yield {
      val filePath = rootDir.resolve("mapper" + i).resolve("TupleTag" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source.fromString(asuna.codegen.tuple.txt.TupleTag(tagNum = i, maxAsunaTupleNum = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val linerContent = content.mkString(System.lineSeparator)
      writer.println(linerContent)
      writer.close()
    }

    for (i <- 1 to maxPropertyNum) yield {
      val filePath = rootDir.resolve("mapper" + i).resolve("NodeTag" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer19 = new PrintWriter(filePath.toFile, "utf-8")
      val content191 =
        Source.fromString(asuna.codegen.tuple.txt.NodeTag(tagNum = i, maxAsunaTupleNum = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val content192 = content191.mkString(System.lineSeparator)
      writer19.println(content192)
      writer19.close()
    }

    for (i <- 1 to maxPropertyNum) yield {
      val filePath = rootDir.resolve("mapper" + i).resolve("AsunaTuple" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer19   = new PrintWriter(filePath.toFile, "utf-8")
      val content191 = Source.fromString(asuna.codegen.tuple.txt.AsunaTuple(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val content192 = content191.mkString(System.lineSeparator)
      writer19.println(content192)
      writer19.close()
    }

    {
      val filePath = buildDir.resolve("NoteNumberMessage.scala")
      Files.createDirectories(filePath.getParent)
      val writer23 = new PrintWriter(filePath.toFile, "utf-8")
      val content231 =
        Source.fromString(asuna.codegen.tuple.build.txt.NoteNumberMessage(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val content232 = content231.mkString(System.lineSeparator)
      writer23.println(content232)
      writer23.close()
    }

    {
      val filePath = buildDir.resolve("TupleNumberMessage.scala")
      Files.createDirectories(filePath.getParent)
      val writer24 = new PrintWriter(filePath.toFile, "utf-8")
      val content241 =
        Source.fromString(asuna.codegen.tuple.build.txt.TupleNumberMessage(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val content242 = content241.mkString(System.lineSeparator)
      writer24.println(content242)
      writer24.close()
    }

    {
      val filePath = buildDir.resolve("BuildContent.scala")
      Files.createDirectories(filePath.getParent)
      val writer18 = new PrintWriter(filePath.toFile, "utf-8")
      val content181 =
        Source.fromString(asuna.codegen.tuple.build.txt.BuildContent(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val content182 = content181.mkString(System.lineSeparator)
      writer18.println(content182)
      writer18.close()
    }

  }
}
