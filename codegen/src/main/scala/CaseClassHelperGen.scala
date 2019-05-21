package org.scalax.asuna.core.encoder

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object CaseClassHelperGen1 extends App {

  for (i <- 2 to 22) yield {
    val path19 = Paths
      .get(".")
      .resolve("src")
      .resolve("main")
      .resolve("scala")
      .resolve("org")
      .resolve("scalax")
      .resolve("asuna")
      .resolve("mapper" + i)
      .resolve("Append" + i + ".scala")

    Files.createDirectories(path19.getParent)

    val writer19   = new PrintWriter(path19.toFile)
    val content191 = Source.fromString(org.scalax.asuna.template.txt.AppendXyy(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to 22) yield {
    val path19 = Paths
      .get(".")
      .resolve("src")
      .resolve("main")
      .resolve("scala")
      .resolve("org")
      .resolve("scalax")
      .resolve("asuna")
      .resolve("mapper" + i)
      .resolve("NodeTag" + i + ".scala")

    Files.createDirectories(path19.getParent)

    val writer19   = new PrintWriter(path19.toFile)
    val content191 = Source.fromString(org.scalax.asuna.template.txt.AppendNoteTagXyy(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to 22) yield {
    val path19 = Paths
      .get(".")
      .resolve("src")
      .resolve("main")
      .resolve("scala")
      .resolve("org")
      .resolve("scalax")
      .resolve("asuna")
      .resolve("mapper" + i)
      .resolve("ItemTagWithMessage" + i + ".scala")

    Files.createDirectories(path19.getParent)

    val writer19   = new PrintWriter(path19.toFile)
    val content191 = Source.fromString(org.scalax.asuna.template.txt.ItemTagWithMessage(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  for (i <- 2 to 21) yield {
    val path19 = Paths
      .get(".")
      .resolve("src")
      .resolve("main")
      .resolve("scala")
      .resolve("org")
      .resolve("scalax")
      .resolve("asuna")
      .resolve("mapper" + i)
      .resolve("EatXyy" + i + ".scala")

    Files.createDirectories(path19.getParent)

    val writer19   = new PrintWriter(path19.toFile)
    val content191 = Source.fromString(org.scalax.asuna.template.txt.EatXyy(tagNum = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val content192 = content191.mkString(System.lineSeparator)
    writer19.println(content192)
    writer19.close()
  }

  val maxPropertyNum = 21

  val path2 =
    Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("ii").resolve("EatXyyType.scala")

  Files.createDirectories(path2.getParent)

  val writer2 = new PrintWriter(path2.toFile)
  val content21 =
    Source.fromString(org.scalax.asuna.template11.txt.EatXyyType(maxItem = maxPropertyNum + 1).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content22 = content21.mkString(System.lineSeparator)
  writer2.println(content22)
  writer2.close()

  val path3 =
    Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("ii").resolve("EatXyyPlus.scala")

  Files.createDirectories(path3.getParent)

  val writer3 = new PrintWriter(path3.toFile)
  val content31 =
    Source.fromString(org.scalax.asuna.template11.txt.EatXyyPlus(maxItem = maxPropertyNum + 1).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content32 = content31.mkString(System.lineSeparator)
  writer3.println(content32)
  writer3.close()

  /*val path4 =
    Paths
      .get(".")
      .resolve("src")
      .resolve("main")
      .resolve("scala")
      .resolve("org")
      .resolve("scalax")
      .resolve("asuna")
      .resolve("ii")
      .resolve("append")
      .resolve("AppendEatXyy.scala")

  Files.createDirectories(path4.getParent)

  val writer4 = new PrintWriter(path4.toFile)
  val content41 =
    Source.fromString(org.scalax.asuna.template11.append.txt.AppendEatXyy(maxItem = maxPropertyNum + 1).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content42 = content41.mkString(System.lineSeparator)
  writer4.println(content42)
  writer4.close()*/

  val path5 =
    Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("ii").resolve("XyyItem.scala")

  Files.createDirectories(path5.getParent)

  val writer5 = new PrintWriter(path5.toFile)
  val content51 =
    Source.fromString(org.scalax.asuna.template11.txt.XyyItem(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content52 = content51.mkString(System.lineSeparator)
  writer5.println(content52)
  writer5.close()

  val path6 =
    Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("ii").resolve("AppendXyyReverse.scala")

  Files.createDirectories(path6.getParent)

  val writer6 = new PrintWriter(path6.toFile)
  val content61 =
    Source.fromString(org.scalax.asuna.template11.txt.EatXyyReverse(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content62 = content61.mkString(System.lineSeparator)
  writer6.println(content62)
  writer6.close()

  val path7 =
    Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("ii").resolve("Item2Xyy.scala")

  Files.createDirectories(path7.getParent)

  val writer7 = new PrintWriter(path7.toFile)
  val content71 =
    Source.fromString(org.scalax.asuna.template11.txt.Item2Xyy(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content72 = content71.mkString(System.lineSeparator)
  writer7.println(content72)
  writer7.close()

  val path8 =
    Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("ii").resolve("Item2XyyReverse.scala")

  Files.createDirectories(path8.getParent)

  val writer8 = new PrintWriter(path8.toFile)
  val content81 =
    Source.fromString(org.scalax.asuna.template11.txt.Item2XyyReverse(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content82 = content81.mkString(System.lineSeparator)
  writer8.println(content82)
  writer8.close()

  val path9 =
    Paths
      .get(".")
      .resolve("src")
      .resolve("main")
      .resolve("scala")
      .resolve("org")
      .resolve("scalax")
      .resolve("asuna")
      .resolve("ii")
      .resolve("tuple")
      .resolve("EatTuplePlus.scala")

  Files.createDirectories(path9.getParent)

  val writer9 = new PrintWriter(path9.toFile)
  val content91 =
    Source.fromString(org.scalax.asuna.template11.tuple.txt.EatTuplePlus(maxItem = maxPropertyNum + 1).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content92 = content91.mkString(System.lineSeparator)
  writer9.println(content92)
  writer9.close()

  val path10 =
    Paths
      .get(".")
      .resolve("src")
      .resolve("main")
      .resolve("scala")
      .resolve("org")
      .resolve("scalax")
      .resolve("asuna")
      .resolve("ii")
      .resolve("tuple")
      .resolve("EatXyyType.scala")

  Files.createDirectories(path10.getParent)

  val writer10 = new PrintWriter(path10.toFile)
  val content101 =
    Source.fromString(org.scalax.asuna.template11.tuple.txt.EatXyyType(maxItem = maxPropertyNum + 1).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content102 = content101.mkString(System.lineSeparator)
  writer10.println(content102)
  writer10.close()

  val path11 =
    Paths
      .get(".")
      .resolve("src")
      .resolve("main")
      .resolve("scala")
      .resolve("org")
      .resolve("scalax")
      .resolve("asuna")
      .resolve("ii")
      .resolve("tuple")
      .resolve("AppendTuple.scala")

  Files.createDirectories(path11.getParent)

  val writer11 = new PrintWriter(path11.toFile)
  val content111 =
    Source.fromString(org.scalax.asuna.template11.tuple.txt.AppendTuple(maxItem = maxPropertyNum + 1).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content112 = content111.mkString(System.lineSeparator)
  writer11.println(content112)
  writer11.close()

  val path18 =
    Paths
      .get(".")
      .resolve("src")
      .resolve("main")
      .resolve("scala")
      .resolve("org")
      .resolve("scalax")
      .resolve("asuna")
      .resolve("ii")
      .resolve("tag")
      .resolve("BuildTag.scala")

  Files.createDirectories(path18.getParent)

  val writer18 = new PrintWriter(path18.toFile)
  val content181 =
    Source.fromString(org.scalax.asuna.template11.tag.txt.BuildTag(maxItem = maxPropertyNum + 1).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content182 = content181.mkString(System.lineSeparator)
  writer18.println(content182)
  writer18.close()

}
