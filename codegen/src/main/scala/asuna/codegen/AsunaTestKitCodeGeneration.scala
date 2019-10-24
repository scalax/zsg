package asuna.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object AsunaTestKitCodeGeneration extends App {

  val minPropertyNum = 195
  val maxPropertyNum = 202
  val rootDir =
    Paths.get("./").resolve("testkit").resolve("src").resolve("test").resolve("scala").resolve("asuna").resolve("testkit").resolve("codegen")

  for (i <- (1 to 100 by 8).toList ::: (minPropertyNum to maxPropertyNum).toList) yield {
    val filePath = rootDir.resolve("CaseClassTest" + i + ".scala")
    Files.createDirectories(filePath.getParent)
    val writer1          = new PrintWriter(filePath.toFile, "utf-8")
    val content1         = Source.fromString(asuna.codegen.testkit.txt.CaseClassTestKit(maxItem = i).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val mkStringContent1 = content1.mkString(System.lineSeparator)
    writer1.println(mkStringContent1)
    writer1.close()
  }

}
