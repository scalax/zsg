package org.scalax.asuna.core.encoder

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object AsunaTestKitCodeGeneration extends App {

  val minPropertyNum = 195
  val maxPropertyNum = 202
  val rootDir =
    Paths.get("./").resolve("testkit").resolve("src").resolve("test").resolve("scala").resolve("asuna").resolve("testkit").resolve("codegen")

  for (i <- (1 to 100 by 8).toList ::: (minPropertyNum to maxPropertyNum).toList) yield {
    val path1 = rootDir.resolve("CaseClassTest" + i + ".scala")
    Files.createDirectories(path1.getParent)
    val writer1          = new PrintWriter(path1.toFile, "utf-8")
    val content1         = Source.fromString(org.scalax.asuna.testkit.txt.CaseClassTestKit(maxItem = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val mkStringContent1 = content1.mkString(System.lineSeparator)
    writer1.println(mkStringContent1)
    writer1.close()
  }

}
