package asuna.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object AsunaTestKitCodeGeneration {

  val root2XDir =
    Paths
      .get("./")
      .resolve("modules")
      .resolve("macros")
      .resolve("src")
      .resolve("test")
      .resolve("scala-2")
      .resolve("asuna")
      .resolve("test")
      .resolve("case_class")
      .resolve("codegen")

  def main(i: Array[String]): Unit = {
    val minPropertyNum = 195
    val maxPropertyNum = 202

    for (i <- (1 to 100 by 8).toList ::: (minPropertyNum to maxPropertyNum).toList) yield {
      val filePath = root2XDir.resolve("CaseClassTest" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer1          = new PrintWriter(filePath.toFile, "utf-8")
      val content1         = Source.fromString(asuna.codegen.testkit.txt.CaseClassTestKit(maxItem = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val mkStringContent1 = content1.mkString(System.lineSeparator)
      writer1.println(mkStringContent1)
      writer1.close()
    }
  }
}
