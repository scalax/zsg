package net.scalax.asuna.core.encoder

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object CaseClassHelperGen extends App {

  val maxPropertyNum = 12

  val path = Paths
    .get(".")
    .resolve("helper")
    .resolve("src")
    .resolve("main")
    .resolve("scala")
    .resolve("net")
    .resolve("scalax")
    .resolve("asuna")
    .resolve("helper")
    .resolve("template")
    .resolve("CaseClassHelper.scala")

  Files.createDirectories(path.getParent)

  val writer = new PrintWriter(path.toFile)
  writer.println(Source.fromString(net.scalax.asuna.template.txt.CaseClassHelperTemplate(maxItem = 12).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty).mkString(System.lineSeparator))
  writer.close()

  val path1111 = Paths
    .get(".")
    .resolve("helper")
    .resolve("src")
    .resolve("main")
    .resolve("scala")
    .resolve("net")
    .resolve("scalax")
    .resolve("asuna")
    .resolve("helper")
    .resolve("template")
    .resolve("CaseClassMapper.scala")

  Files.createDirectories(path1111.getParent)

  val writer1111 = new PrintWriter(path1111.toFile)
  writer1111.println(
      Source.fromString(net.scalax.asuna.template1111.txt.CaseClassHelperTemplate(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty).mkString(System.lineSeparator)
  )
  writer1111.close()

}
