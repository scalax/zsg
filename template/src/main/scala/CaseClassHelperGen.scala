package net.scalax.asuna.core.encoder

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object CaseClassHelperGen extends App {

  val maxPropertyNum = 12

  val path = Paths
    .get(".")
    .resolve("mapper")
    .resolve("src")
    .resolve("main")
    .resolve("scala")
    .resolve("net")
    .resolve("scalax")
    .resolve("asuna")
    .resolve("mapper")
    .resolve("common")
    .resolve("CaseClassMapper.scala")

  Files.createDirectories(path.getParent)

  val writer = new PrintWriter(path.toFile)
  writer.println(
      Source
      .fromString(net.scalax.asuna.template1111.txt.CaseClassHelperTemplate(maxItem = maxPropertyNum).body)
      .getLines
      .toList
      .map(_.trim)
      .filter(s => !s.isEmpty)
      .mkString(System.lineSeparator)
  )
  writer.close()

}
