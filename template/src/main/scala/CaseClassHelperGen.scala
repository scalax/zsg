package net.scalax.asuna.core.encoder

import java.io.PrintWriter
import java.nio.file.{ Files, Paths }

import scala.io.Source

object CaseClassHelperGen extends App {

  val path = Paths.get(".").resolve("helper").resolve("src")
    .resolve("main").resolve("scala").resolve("net")
    .resolve("scalax").resolve("asuna").resolve("helper")
    .resolve("template").resolve("CaseClassHelper.scala")

  Files.createDirectories(path.getParent)

  val writer = new PrintWriter(path.toFile)
  writer.println(Source.fromString(
    net.scalax.asuna.template.txt.CaseClassHelperTemplate(maxItem = 6).body)
    .getLines.toList.map(_.trim)
    .filter(s => !s.isEmpty)
    .mkString(System.lineSeparator))
  writer.close()

}