package zsg.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object ZsgNewTupleCodeGeneration {

  val root2XDir =
    Paths.get("./").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala-2").resolve("zsg").resolve("codegen")
  val build2XDir = root2XDir.resolve("build")

  val rootAllDir =
    Paths.get("./").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala").resolve("zsg").resolve("codegen")

  val rootDottyDir =
    Paths.get("./").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala-3").resolve("zsg").resolve("codegen")
  val buildDottyDir = rootDottyDir.resolve("build")

  def main(i: Array[String]): Unit = {
    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      val filePath = rootAllDir.resolve("mapper" + i).resolve("ApplicationX" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer       = new PrintWriter(filePath.toFile, "utf-8")
      val linerContent = StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.ApplicationX(tagNum = i, isDotty = false).body)
      writer.println(linerContent)
      writer.close()
    }

    for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
      val filePath = rootAllDir.resolve("ztuple" + i).resolve("ZTuple" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer       = new PrintWriter(filePath.toFile, "utf-8")
      val linerContent = StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.ZTupleX(ZTupleNum = i).body)
      writer.println(linerContent)
      writer.close()
    }

    for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
      val filePath = rootAllDir.resolve("ztuple" + i).resolve("ZNode" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer       = new PrintWriter(filePath.toFile, "utf-8")
      val linerContent = StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.ZNodeX(ZTupleNum = i).body)
      writer.println(linerContent)
      writer.close()
    }

    for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
      val filePath = rootAllDir.resolve("ztuple" + i).resolve("PlusInstanceTuple" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer       = new PrintWriter(filePath.toFile, "utf-8")
      val linerContent = StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.PlusInstanceTupleX(ZTupleNum = i, maxContextNum = ZsgParameters.maxContextNum).body)
      writer.println(linerContent)
      writer.close()
    }
  }

}
