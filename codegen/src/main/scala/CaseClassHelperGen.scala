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



  val maxPropertyNum = 21

  val path1 = Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("ii").resolve("EatXyy.scala")

  Files.createDirectories(path1.getParent)

  val writer1 = new PrintWriter(path1.toFile)
  val content11 =
    Source.fromString(org.scalax.asuna.template11.txt.EatXyy(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content12 = content11.mkString(System.lineSeparator)
  writer1.println(content12)
  writer1.close()

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

  /*val path12 =
    Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("ii").resolve("tag").resolve("ItemTag.scala")

  Files.createDirectories(path12.getParent)

  val writer12 = new PrintWriter(path12.toFile)
  val content121 =
    Source.fromString(org.scalax.asuna.template11.tag.txt.ItemTag(maxItem = maxPropertyNum + 1).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content122 = content121.mkString(System.lineSeparator)
  writer12.println(content122)
  writer12.close()*/

  val path13 =
    Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("ii").resolve("tag").resolve("NodeTag.scala")

  Files.createDirectories(path13.getParent)

  val writer13 = new PrintWriter(path13.toFile)
  val content131 =
    Source.fromString(org.scalax.asuna.template11.tag.txt.NodeTag(maxItem = maxPropertyNum + 1).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content132 = content131.mkString(System.lineSeparator)
  writer13.println(content132)
  writer13.close()

  val path14 =
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
      .resolve("ItemTagWithMessage.scala")

  Files.createDirectories(path14.getParent)

  val writer14 = new PrintWriter(path14.toFile)
  val content141 =
    Source.fromString(org.scalax.asuna.template11.tag.txt.ItemTagWithMessage(maxItem = maxPropertyNum + 1).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content142 = content141.mkString(System.lineSeparator)
  writer14.println(content142)
  writer14.close()

  val path15 =
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
      .resolve("NodeTagWithMessage.scala")

  /*Files.createDirectories(path15.getParent)

  val writer15 = new PrintWriter(path15.toFile)
  val content151 =
    Source.fromString(org.scalax.asuna.template11.tag.txt.NodeTagWithMessage(maxItem = maxPropertyNum + 1).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content152 = content151.mkString(System.lineSeparator)
  writer15.println(content152)
  writer15.close()*/

  val path16 =
    Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("ii").resolve("tag").resolve("Message.scala")

  Files.createDirectories(path16.getParent)

  val writer16 = new PrintWriter(path16.toFile)
  val content161 =
    Source.fromString(org.scalax.asuna.template11.tag.txt.Message(maxItem = maxPropertyNum + 1).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content162 = content161.mkString(System.lineSeparator)
  writer16.println(content162)
  writer16.close()

  val path17 =
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
      .resolve("AppendItemWithMessage.scala")

  Files.createDirectories(path17.getParent)

  val writer17 = new PrintWriter(path17.toFile)
  val content171 =
    Source.fromString(org.scalax.asuna.template11.append.txt.AppendItemWithMessage(maxItem = maxPropertyNum + 1).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content172 = content171.mkString(System.lineSeparator)
  writer17.println(content172)
  writer17.close()

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
