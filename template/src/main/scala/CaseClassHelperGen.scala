package net.scalax.asuna.core.encoder

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object CaseClassHelperGen extends App {

  val maxPropertyNum = 17

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
  val content1 =
    Source.fromString(net.scalax.asuna.template.txt.CaseClassHelperTemplate(maxItem = maxPropertyNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
  val content2 = content1.mkString(System.lineSeparator)
  writer.println(content2)
  writer.close()

}
