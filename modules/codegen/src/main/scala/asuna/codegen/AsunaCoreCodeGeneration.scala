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
      val filePath = rootDir.resolve("mapper" + i).resolve("TupleTag" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer19   = new PrintWriter(filePath.toFile, "utf-8")
      val content191 = Source.fromString(asuna.codegen.tuple.txt.TupleTag(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val content192 = content191.mkString(System.lineSeparator)
      writer19.println(content192)
      writer19.close()
    }

    for (i <- 1 to maxPropertyNum) yield {
      val filePath = rootDir.resolve("mapper" + i).resolve("NodeTag" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer19   = new PrintWriter(filePath.toFile, "utf-8")
      val content191 = Source.fromString(asuna.codegen.tuple.txt.NodeTag(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
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

    for (i <- 1 to maxPropertyNum) yield {
      val filePath =
        rootDir.resolve("mapper" + i).resolve("support").resolve("TypeHListPlus" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer19   = new PrintWriter(filePath.toFile, "utf-8")
      val content191 = Source.fromString(asuna.codegen.tuple.support.txt.TypeHListPlus(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val content192 = content191.mkString(System.lineSeparator)
      writer19.println(content192)
      writer19.close()
    }

    {
      val filePath = buildDir.resolve("TupleTypeHList.scala")
      Files.createDirectories(filePath.getParent)
      val writer21 = new PrintWriter(filePath.toFile, "utf-8")
      val content211 =
        Source.fromString(asuna.codegen.tuple.build.txt.TupleTypeHList(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val content212 = content211.mkString(System.lineSeparator)
      writer21.println(content212)
      writer21.close()
    }

    {
      val filePath = buildDir.resolve("TypeHList.scala")
      Files.createDirectories(filePath.getParent)
      val writer22 = new PrintWriter(filePath.toFile, "utf-8")
      val content221 =
        Source.fromString(asuna.codegen.tuple.build.txt.TypeHList(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val content222 = content221.mkString(System.lineSeparator)
      writer22.println(content222)
      writer22.close()
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
