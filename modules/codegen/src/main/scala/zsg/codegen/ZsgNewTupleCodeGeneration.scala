package zsg.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object ZsgNewTupleCodeGeneration {

  val root2XDir  = Paths.get(".", "modules", "core", "src", "main", "scala-2", "zsg", "codegen")
  val build2XDir = root2XDir.resolve("build")

  val rootAllDir = Paths.get(".", "modules", "core", "src", "main", "scala", "zsg", "codegen")

  val rootDottyDir  = Paths.get(".", "modules", "core", "src", "main", "scala-3", "zsg", "codegen")
  val buildDottyDir = rootDottyDir.resolve("build")

  def main(arrs: Array[String]): Unit = {
    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      val filePath = rootAllDir.resolve(Paths.get("mapper" + i, "Application" + i + ".scala"))
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val linerContent = StringUtil.trimLines(zsg.codegen.tuple.txt.Application(tagNum = i, isDotty = false).body)
        writer.println(linerContent)
      }
    }
  }

}
