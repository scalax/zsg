package zsg.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object ZsgTestKitCodeGeneration {

  val root2XDir = Paths
    .get("./")
    .resolve("modules")
    .resolve("macros")
    .resolve("src")
    .resolve("test")
    .resolve("scala-2")
    .resolve("zsg")
    .resolve("macros")
    .resolve("case_class_test")
    .resolve("codegen")

  def main(i: Array[String]): Unit = {
    for (i <- List(1, 2, 3, 68, 202)) yield {
      val filePath = root2XDir.resolve("CaseClassTest" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer1          = new PrintWriter(filePath.toFile, "utf-8")
      val content1         = Source.fromString(zsg.codegen.testkit.txt.CaseClassTestKit(maxItem = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val mkStringContent1 = content1.mkString(System.lineSeparator)
      writer1.println(mkStringContent1)
      writer1.close()
    }
  }
}
