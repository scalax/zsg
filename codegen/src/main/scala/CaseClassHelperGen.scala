package org.scalax.asuna.core.encoder

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object CaseClassHelperGen1 extends App {

  val maxPropertyNum = 8
  val rootDir        = Paths.get("../").resolve("core").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna")

  for (i <- 2 to maxPropertyNum) yield {
    val path19 = rootDir.resolve("mapper" + i).resolve("Append" + i + ".scala")

    Files.createDirectories(path19.getParent)

    val writer19   = new PrintWriter(path19.toFile)
    val content191 = Source.fromString(org.scalax.asuna.template.txt.AppendXyy(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum) yield {
    val path19 = rootDir.resolve("mapper" + i).resolve("NodeTag" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile)
    val content191 = Source.fromString(org.scalax.asuna.template.txt.AppendNoteTagXyy(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum - 1) yield {
    val path19 = rootDir.resolve("mapper" + i).resolve("HListItem" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile)
    val content191 = Source.fromString(org.scalax.asuna.template.txt.HListItem(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum - 1) yield {
    val path19 = rootDir.resolve("mapper" + i).resolve("TreeItem" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile)
    val content191 = Source.fromString(org.scalax.asuna.template.txt.TreeItem(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum - 1) yield {
    val path19 = rootDir.resolve("mapper" + i).resolve("Item" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile)
    val content191 = Source.fromString(org.scalax.asuna.template.txt.Item(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum - 1) yield {
    val path19 = rootDir.resolve("mapper" + i).resolve("ReverseHListItem" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile)
    val content191 = Source.fromString(org.scalax.asuna.template.txt.ReverseHListItem(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to maxPropertyNum) yield {
    val path19 = rootDir.resolve("mapper" + i).resolve("EatXyyPlus" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile)
    val content191 = Source.fromString(org.scalax.asuna.template.txt.EatXyyPlus(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 1 to maxPropertyNum) yield {
    val path19 = rootDir.resolve("mapper" + i).resolve("EatXyyType" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile)
    val content191 = Source.fromString(org.scalax.asuna.template.txt.EatXyyType(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 0 to maxPropertyNum) yield {
    val path19 = rootDir.resolve("mapper" + i).resolve("NumberMessage" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile)
    val content191 = Source.fromString(org.scalax.asuna.template.txt.NumberMessage(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 0 to maxPropertyNum) yield {
    val path19 = rootDir.resolve("mapper" + i).resolve("NumberMessage2" + i + ".scala")
    Files.createDirectories(path19.getParent)
    val writer19   = new PrintWriter(path19.toFile)
    val content191 = Source.fromString(org.scalax.asuna.template.txt.NumberMessage2(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  /*val path9 = rootDir.resolve("ii").resolve("tuple").resolve("EatTuplePlus.scala")

  Files.createDirectories(path9.getParent)

  val writer9   = new PrintWriter(path9.toFile)
  val content91 = Source.fromString(org.scalax.asuna.tuple.template.txt.EatTuplePlus().body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content92 = content91.mkString(System.lineSeparator)
  writer9.println(content92)
  writer9.close()

  val path10 = rootDir.resolve("ii").resolve("tuple").resolve("EatXyyType.scala")

  Files.createDirectories(path10.getParent)

  val writer10 = new PrintWriter(path10.toFile)
  val content101 =
    Source.fromString(org.scalax.asuna.tuple.template.txt.EatXyyType(maxItem = 22).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content102 = content101.mkString(System.lineSeparator)
  writer10.println(content102)
  writer10.close()

  val path11 = rootDir.resolve("ii").resolve("tuple").resolve("AppendTuple.scala")

  Files.createDirectories(path11.getParent)

  val writer11 = new PrintWriter(path11.toFile)
  val content111 =
    Source.fromString(org.scalax.asuna.tuple.template.txt.AppendTuple(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content112 = content111.mkString(System.lineSeparator)
  writer11.println(content112)
  writer11.close()*/

  val path18 = rootDir.resolve("ii").resolve("tag").resolve("BuildTag.scala")

  Files.createDirectories(path18.getParent)

  val writer18 = new PrintWriter(path18.toFile)
  val content181 =
    Source.fromString(org.scalax.asuna.tuple.tag.txt.BuildTag(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content182 = content181.mkString(System.lineSeparator)
  writer18.println(content182)
  writer18.close()

  /*val path19 = rootDir.resolve("ii").resolve("tuple").resolve("EatTuplePlus22.scala")

  Files.createDirectories(path19.getParent)
  val writer19   = new PrintWriter(path19.toFile)
  val content191 = Source.fromString(org.scalax.asuna.tuple.template.txt.EatTuplePlus22().body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content192 = content191.mkString(System.lineSeparator)
  writer19.println(content192)
  writer19.close()

  val path20 = rootDir.resolve("ii").resolve("tuple").resolve("EatTuplePlus222.scala")

  Files.createDirectories(path20.getParent)
  val writer20   = new PrintWriter(path20.toFile)
  val content201 = Source.fromString(org.scalax.asuna.tuple.template.txt.EatTuplePlus222().body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content202 = content201.mkString(System.lineSeparator)
  writer20.println(content202)
  writer20.close()*/

}
