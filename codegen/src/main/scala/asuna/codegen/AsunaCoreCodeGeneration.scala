package asuna.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object AsunaCoreCodeGeneration extends App {

  val maxPropertyNum = 8
  val rootDir =
    Paths.get("./").resolve("core").resolve("src").resolve("main").resolve("scala").resolve("asuna").resolve("codegen")
  val tupleDir = rootDir.resolve("tuple")
  val buildDir = rootDir.resolve("build")

  for (i <- 2 to maxPropertyNum) yield {
    val filePath = rootDir.resolve("mapper" + i).resolve("TupleTag" + i + ".scala")
    Files.createDirectories(filePath.getParent)
    val writer19   = new PrintWriter(filePath.toFile, "utf-8")
    val content191 = Source.fromString(asuna.codegen.tuple.template.txt.TupleTag(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum) yield {
    val filePath = rootDir.resolve("mapper" + i).resolve("NodeTag" + i + ".scala")
    Files.createDirectories(filePath.getParent)
    val writer19   = new PrintWriter(filePath.toFile, "utf-8")
    val content191 = Source.fromString(asuna.codegen.tuple.template.txt.NodeTag(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum) yield {
    val filePath = rootDir.resolve("mapper" + i).resolve("HListToTupleTypeHListPlus" + i + ".scala")
    Files.createDirectories(filePath.getParent)
    val writer19   = new PrintWriter(filePath.toFile, "utf-8")
    val content191 = Source.fromString(asuna.codegen.tuple.template.txt.HListToTupleTypeHListPlus(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum - 1) yield {
    val filePath = rootDir.resolve("mapper" + i).resolve("AsunaTuple" + i + ".scala")
    Files.createDirectories(filePath.getParent)
    val writer19   = new PrintWriter(filePath.toFile, "utf-8")
    val content191 = Source.fromString(asuna.codegen.tuple.template.txt.AsunaTuple(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 1 to maxPropertyNum) yield {
    val filePath = rootDir.resolve("mapper" + i).resolve("AsunaValueTuple" + i + ".scala")
    Files.createDirectories(filePath.getParent)
    val writer19   = new PrintWriter(filePath.toFile, "utf-8")
    val content191 = Source.fromString(asuna.codegen.tuple.template.txt.AsunaValueTuple(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum - 1) yield {
    val filePath =
      rootDir.resolve("mapper" + i).resolve("HListTypeHListPlus" + i + ".scala")
    Files.createDirectories(filePath.getParent)
    val writer19   = new PrintWriter(filePath.toFile, "utf-8")
    val content191 = Source.fromString(asuna.codegen.tuple.template.txt.HListTypeHListPlus(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  {
    val filePath = buildDir.resolve("TupleTypeHList.scala")
    Files.createDirectories(filePath.getParent)
    val writer21 = new PrintWriter(filePath.toFile, "utf-8")
    val content211 =
      Source.fromString(asuna.codegen.tuple.template.build.txt.TupleTypeHList(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content212 = content211.mkString(System.lineSeparator)
    writer21.println(content212)
    writer21.close()
  }

  {
    val filePath = buildDir.resolve("TypeHList.scala")
    Files.createDirectories(filePath.getParent)
    val writer22 = new PrintWriter(filePath.toFile, "utf-8")
    val content221 =
      Source.fromString(asuna.codegen.tuple.template.build.txt.TypeHList(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content222 = content221.mkString(System.lineSeparator)
    writer22.println(content222)
    writer22.close()
  }

  {
    val filePath = buildDir.resolve("NoteNumberMessage.scala")
    Files.createDirectories(filePath.getParent)
    val writer23 = new PrintWriter(filePath.toFile, "utf-8")
    val content231 =
      Source.fromString(asuna.codegen.tuple.template.build.txt.NoteNumberMessage(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content232 = content231.mkString(System.lineSeparator)
    writer23.println(content232)
    writer23.close()
  }

  {
    val filePath = buildDir.resolve("TupleNumberMessage.scala")
    Files.createDirectories(filePath.getParent)
    val writer24 = new PrintWriter(filePath.toFile, "utf-8")
    val content241 =
      Source.fromString(asuna.codegen.tuple.template.build.txt.TupleNumberMessage(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content242 = content241.mkString(System.lineSeparator)
    writer24.println(content242)
    writer24.close()
  }

  {
    val filePath = buildDir.resolve("BuildContent.scala")
    Files.createDirectories(filePath.getParent)
    val writer18 = new PrintWriter(filePath.toFile, "utf-8")
    val content181 =
      Source.fromString(asuna.codegen.tuple.template.build.txt.BuildContent(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content182 = content181.mkString(System.lineSeparator)
    writer18.println(content182)
    writer18.close()
  }

  /*val path10 = tupleDir.resolve("ScalaTupleTypeHList.scala")
  Files.createDirectories(path10.getParent)
  val writer10 = new PrintWriter(path10.toFile, "utf-8")
  val content101 =
    Source.fromString(org.scalax.asuna.codegen.tuple.template.txt.ScalaTupleTypeHList(maxItem = 22).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content102 = content101.mkString(System.lineSeparator)
  writer10.println(content102)
  writer10.close()

  val path11 = tupleDir.resolve("ScalaTupleApplicationImplicits.scala")
  Files.createDirectories(path11.getParent)
  val writer11 = new PrintWriter(path11.toFile, "utf-8")
  val content111 =
    Source
      .fromString(org.scalax.asuna.codegen.tuple.template.txt.ScalaTupleApplicationImplicits(maxItem = maxPropertyNum).body)
      .getLines
      .toList
      .map(_.trim)
      .filter(s => !s.isEmpty)
  val content112 = content111.mkString(System.lineSeparator)
  writer11.println(content112)
  writer11.close()

  val path9 = tupleDir.resolve("ScalaTupleTypeParameterPlus1.scala")
  Files.createDirectories(path9.getParent)
  val writer9   = new PrintWriter(path9.toFile, "utf-8")
  val content91 = Source.fromString(org.scalax.asuna.codegen.tuple.template.txt.ScalaTupleTypeHListPlus1().body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content92 = content91.mkString(System.lineSeparator)
  writer9.println(content92)
  writer9.close()

  val path19 = tupleDir.resolve("ScalaTupleTypeParameterPlus2.scala")
  Files.createDirectories(path19.getParent)
  val writer19   = new PrintWriter(path19.toFile, "utf-8")
  val content191 = Source.fromString(org.scalax.asuna.codegen.tuple.template.txt.ScalaTupleTypeHListPlus2().body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content192 = content191.mkString(System.lineSeparator)
  writer19.println(content192)
  writer19.close()

  val path20 = tupleDir.resolve("ScalaTupleTypeParameterPlus3.scala")
  Files.createDirectories(path20.getParent)
  val writer20   = new PrintWriter(path20.toFile, "utf-8")
  val content201 = Source.fromString(org.scalax.asuna.codegen.tuple.template.txt.ScalaTupleTypeHListPlus3().body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content202 = content201.mkString(System.lineSeparator)
  writer20.println(content202)
  writer20.close()*/

  {
    val filePath = buildDir.resolve("HListTypeHList.scala")
    Files.createDirectories(filePath.getParent)
    val writer16   = new PrintWriter(filePath.toFile, "utf-8")
    val content161 = Source.fromString(asuna.codegen.tuple.template.build.txt.HListTypeHList(maxPropertyNum - 1).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content162 = content161.mkString(System.lineSeparator)
    writer16.println(content162)
    writer16.close()
  }

}
