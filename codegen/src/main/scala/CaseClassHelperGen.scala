package org.scalax.asuna.core.encoder

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object CaseClassHelperGen extends App {

  val maxPropertyNum = 22

  val path1 = Paths
    .get(".")
    .resolve("src")
    .resolve("main")
    .resolve("scala")
    .resolve("org")
    .resolve("scalax")
    .resolve("asuna")
    .resolve("mapper")
    .resolve("Append.scala")

  Files.createDirectories(path1.getParent)

  val writer1 = new PrintWriter(path1.toFile)
  val content11 =
    Source.fromString(org.scalax.asuna.template.txt.AppendItem(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content12 = content11.mkString(System.lineSeparator)
  writer1.println(content12)
  writer1.close()

  val path2 = Paths
    .get(".")
    .resolve("src")
    .resolve("main")
    .resolve("scala")
    .resolve("org")
    .resolve("scalax")
    .resolve("asuna")
    .resolve("mapper")
    .resolve("AppendItemImpl1.scala")

  Files.createDirectories(path2.getParent)

  val writer2 = new PrintWriter(path2.toFile)
  val content21 =
    Source.fromString(org.scalax.asuna.template.txt.AppendItemImpl(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content22 = content21.mkString(System.lineSeparator)
  writer2.println(content22)
  writer2.close()

}
