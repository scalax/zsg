package zsg.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source
import scala.util.Using

object ZsgNewTupleCodeGeneration {

  val root2XDir =
    Paths.get(".").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala-2").resolve("zsg").resolve("codegen")
  val build2XDir = root2XDir.resolve("build")

  val rootAllDir =
    Paths.get(".").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala").resolve("zsg").resolve("codegen")

  val rootDottyDir =
    Paths.get(".").resolve("modules").resolve("core").resolve("src").resolve("main").resolve("scala-3").resolve("zsg").resolve("codegen")
  val buildDottyDir = rootDottyDir.resolve("build")

  def main(arrs: Array[String]): Unit = {
    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      val filePath = rootAllDir.resolve("mapper" + i).resolve("ApplicationX" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer       = new PrintWriter(filePath.toFile, "utf-8")
      val linerContent = StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.ApplicationX(tagNum = i, isDotty = false).body)
      writer.println(linerContent)
      writer.close()
    }

    {
      for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
        val filePath = root2XDir.resolve("ztuple" + i).resolve("ZTuple" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer       = new PrintWriter(filePath.toFile, "utf-8")
        val linerContent = StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.ZTupleX(ZTupleNum = i)(maxContextNum = ZsgParameters.maxContextNum)(isDotty = false).body)
        writer.println(linerContent)
        writer.close()
      }
      for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
        val filePath = rootDottyDir.resolve("ztuple" + i).resolve("ZTuple" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer       = new PrintWriter(filePath.toFile, "utf-8")
        val linerContent = StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.ZTupleX(ZTupleNum = i)(maxContextNum = ZsgParameters.maxContextNum)(isDotty = true).body)
        writer.println(linerContent)
        writer.close()
      }
    }

    {
      for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
        val filePath = root2XDir.resolve("ztuple" + i).resolve("ZNode" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer       = new PrintWriter(filePath.toFile, "utf-8")
        val linerContent = StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.ZNodeX(ZTupleNum = i, maxContextNum = ZsgParameters.maxContextNum)(isDotty = false).body)
        writer.println(linerContent)
        writer.close()
      }
      for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
        val filePath = rootDottyDir.resolve("ztuple" + i).resolve("ZNode" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer       = new PrintWriter(filePath.toFile, "utf-8")
        val linerContent = StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.ZNodeX(ZTupleNum = i, maxContextNum = ZsgParameters.maxContextNum)(isDotty = true).body)
        writer.println(linerContent)
        writer.close()
      }
    }

    {
      for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
        val filePath = root2XDir.resolve("ztuple" + i).resolve("PlusInstanceTuple" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val linerContent =
          StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.PlusInstanceTupleX(ZTupleNum = i, maxContextNum = ZsgParameters.maxContextNum)(isDotty = false).body)
        writer.println(linerContent)
        writer.close()
      }
      for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
        val filePath = rootDottyDir.resolve("ztuple" + i).resolve("PlusInstanceTuple" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val linerContent =
          StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.PlusInstanceTupleX(ZTupleNum = i, maxContextNum = ZsgParameters.maxContextNum)(isDotty = true).body)
        writer.println(linerContent)
        writer.close()
      }
    }

    {
      {
        val filePath = root2XDir.resolve("ztuple2").resolve("PlusInstanceZsgTuple2.scala")
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent =
            StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.PlusInstanceZsgTuple2(ZTupleNum = 2, maxContextNum = ZsgParameters.maxContextNum)(isDotty = false).body)
          writer.println(linerContent)
        }
      }
      {
        val filePath = rootDottyDir.resolve("ztuple2").resolve("PlusInstanceZsgTuple2.scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val linerContent =
          StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.PlusInstanceZsgTuple2(ZTupleNum = 2, maxContextNum = ZsgParameters.maxContextNum)(isDotty = true).body)
        writer.println(linerContent)
        writer.close()
      }
    }
  }

}
