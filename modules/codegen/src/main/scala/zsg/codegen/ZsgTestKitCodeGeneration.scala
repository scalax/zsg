package zsg.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object ZsgTestKitCodeGeneration {

  val root2XDir = Paths.get(".", "modules", "macros", "src", "test", "scala-2", "zsg", "macros", "case_class_test", "codegen")

  def main(i: Array[String]): Unit = {
    for (i <- List(1, 2, 3, 4, 68, 160)) yield {
      val filePath = root2XDir.resolve("CaseClassTest" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(zsg.codegen.testkit.txt.CaseClassTestKit(maxItem = i).body)
        writer.println(content)
      }
    }
  }

}
