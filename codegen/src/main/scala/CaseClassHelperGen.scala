package org.scalax.asuna.core.encoder

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object CaseClassHelperGen extends App {

  val maxPropertyNum = 21

  val path1 = Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("mapper").resolve("Append.scala")

  Files.createDirectories(path1.getParent)

  val writer1 = new PrintWriter(path1.toFile)
  val content11 =
    Source.fromString(org.scalax.asuna.template.txt.AppendItem(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content12 = content11.mkString(System.lineSeparator)
  writer1.println(content12)
  writer1.close()

  /*val path2 =
    Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("mapper").resolve("AppendItemValue.scala")

  Files.createDirectories(path2.getParent)

  val writer2 = new PrintWriter(path2.toFile)
  val content21 =
    Source.fromString(org.scalax.asuna.template.txt.AppendItemImpl(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content22 = content21.mkString(System.lineSeparator)
  writer2.println(content22)
  writer2.close()*/

  val path3 =
    Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("mapper").resolve("AppendItemEatXyy.scala")

  Files.createDirectories(path3.getParent)

  val writer3 = new PrintWriter(path3.toFile)
  val content31 =
    Source.fromString(org.scalax.asuna.template.txt.AppendItemEatXyy(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content32 = content31.mkString(System.lineSeparator)
  writer3.println(content32)
  writer3.close()

  val path4 =
    Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("mapper").resolve("AppendItemPlusXyy.scala")

  Files.createDirectories(path4.getParent)

  val writer4 = new PrintWriter(path4.toFile)
  val content41 =
    Source.fromString(org.scalax.asuna.template.txt.AppendItemPlusXyy(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content42 = content41.mkString(System.lineSeparator)
  writer4.println(content42)
  writer4.close()


  val path5 =
    Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("mapper").resolve("AppendArticle.scala")

  Files.createDirectories(path5.getParent)

  val writer5 = new PrintWriter(path5.toFile)
  val content51 =
    Source.fromString(org.scalax.asuna.template.txt.AppendArticle(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content52 = content51.mkString(System.lineSeparator)
  writer5.println(content52)
  writer5.close()

  val path6 =
    Paths.get(".").resolve("src").resolve("main").resolve("scala").resolve("org").resolve("scalax").resolve("asuna").resolve("mapper").resolve("AppendXyy.scala")

  Files.createDirectories(path6.getParent)

  val writer6 = new PrintWriter(path6.toFile)
  val content61 =
    Source.fromString(org.scalax.asuna.template.txt.AppendXyy(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content62 = content61.mkString(System.lineSeparator)
  writer6.println(content62)
  writer6.close()

}
