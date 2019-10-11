package org.scalax.asuna.core.encoder

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object CaseClassHelperGen1 extends App {

  val maxPropertyNum = 8
  val rootDir =
    Paths.get("./").resolve("core").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("mapper").resolve("codegen")
  val tupleDir = rootDir.resolve("tuple")
  val buildDir = rootDir.resolve("build")

  for (i <- 2 to maxPropertyNum) yield {
    val path19 = rootDir.resolve("mapper" + i).resolve("ItemTag" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile, "utf-8")
    val content191 = Source.fromString(org.scalax.asuna.item.template.txt.ItemTag(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum) yield {
    val path19 = rootDir.resolve("mapper" + i).resolve("NodeTag" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile, "utf-8")
    val content191 = Source.fromString(org.scalax.asuna.item.template.txt.NodeTag(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum - 1) yield {
    val path19 =
      rootDir.resolve("mapper" + i).resolve("HListItem" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile, "utf-8")
    val content191 = Source.fromString(org.scalax.asuna.item.template.txt.HListItem(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum - 1) yield {
    val path19 = rootDir.resolve("mapper" + i).resolve("Item" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile, "utf-8")
    val content191 = Source.fromString(org.scalax.asuna.item.template.txt.Item(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum - 1) yield {
    val path19 =
      rootDir.resolve("mapper" + i).resolve("ReverseHListItem" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile, "utf-8")
    val content191 = Source.fromString(org.scalax.asuna.item.template.txt.ReverseHListItem(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum) yield {
    val path19 =
      rootDir.resolve("mapper" + i).resolve("ItemTypeParameterPlus" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile, "utf-8")
    val content191 = Source.fromString(org.scalax.asuna.item.template.txt.ItemTypeParameterPlus(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  val path21 = buildDir.resolve("ItemTypeParameter.scala")
  Files.createDirectories(path21.getParent)
  val writer21 = new PrintWriter(path21.toFile, "utf-8")
  val content211 =
    Source.fromString(org.scalax.asuna.item.template.txt.ItemTypeParameter(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content212 = content211.mkString(System.lineSeparator)
  writer21.println(content212)
  writer21.close()

  val path22 = buildDir.resolve("TypeParameter.scala")
  Files.createDirectories(path22.getParent)
  val writer22   = new PrintWriter(path22.toFile, "utf-8")
  val content221 = Source.fromString(org.scalax.asuna.item.template.txt.TypeParameter(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content222 = content221.mkString(System.lineSeparator)
  writer22.println(content222)
  writer22.close()

  val path23 = buildDir.resolve("NoteNumberMessage.scala")
  Files.createDirectories(path23.getParent)
  val writer23 = new PrintWriter(path23.toFile, "utf-8")
  val content231 =
    Source.fromString(org.scalax.asuna.item.template.txt.NoteNumberMessage(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content232 = content231.mkString(System.lineSeparator)
  writer23.println(content232)
  writer23.close()

  val path24 = buildDir.resolve("ItemNumberMessage.scala")
  Files.createDirectories(path24.getParent)
  val writer24 = new PrintWriter(path24.toFile, "utf-8")
  val content241 =
    Source.fromString(org.scalax.asuna.item.template.txt.ItemNumberMessage(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content242 = content241.mkString(System.lineSeparator)
  writer24.println(content242)
  writer24.close()

  val path18 = buildDir.resolve("BuildContent.scala")
  Files.createDirectories(path18.getParent)
  val writer18 = new PrintWriter(path18.toFile, "utf-8")
  val content181 =
    Source.fromString(org.scalax.asuna.item.template.txt.BuildContent(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content182 = content181.mkString(System.lineSeparator)
  writer18.println(content182)
  writer18.close()

  val path10 = tupleDir.resolve("TupleTypeParameter.scala")
  Files.createDirectories(path10.getParent)
  val writer10 = new PrintWriter(path10.toFile, "utf-8")
  val content101 =
    Source.fromString(org.scalax.asuna.tuple.template.txt.TupleTypeParameter(maxItem = 22).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content102 = content101.mkString(System.lineSeparator)
  writer10.println(content102)
  writer10.close()

  val path11 = tupleDir.resolve("TupleApplicationImplicits.scala")
  Files.createDirectories(path11.getParent)
  val writer11 = new PrintWriter(path11.toFile, "utf-8")
  val content111 =
    Source.fromString(org.scalax.asuna.tuple.template.txt.TupleApplicationImplicits(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content112 = content111.mkString(System.lineSeparator)
  writer11.println(content112)
  writer11.close()

  val path9 = tupleDir.resolve("EatTuplePlus.scala")
  Files.createDirectories(path9.getParent)
  val writer9   = new PrintWriter(path9.toFile, "utf-8")
  val content91 = Source.fromString(org.scalax.asuna.tuple.template.txt.EatTuplePlus().body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content92 = content91.mkString(System.lineSeparator)
  writer9.println(content92)
  writer9.close()

  val path19 = tupleDir.resolve("EatTuplePlus22.scala")
  Files.createDirectories(path19.getParent)
  val writer19   = new PrintWriter(path19.toFile, "utf-8")
  val content191 = Source.fromString(org.scalax.asuna.tuple.template.txt.EatTuplePlus22().body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content192 = content191.mkString(System.lineSeparator)
  writer19.println(content192)
  writer19.close()

  val path20 = tupleDir.resolve("EatTuplePlus222.scala")
  Files.createDirectories(path20.getParent)
  val writer20   = new PrintWriter(path20.toFile, "utf-8")
  val content201 = Source.fromString(org.scalax.asuna.tuple.template.txt.EatTuplePlus222().body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content202 = content201.mkString(System.lineSeparator)
  writer20.println(content202)
  writer20.close()

}
