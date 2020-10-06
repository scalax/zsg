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
      val filePath = rootAllDir.resolve(Paths.get("mapper" + i, "ApplicationX" + i + ".scala"))
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val linerContent = StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.ApplicationX(tagNum = i, isDotty = false).body)
        writer.println(linerContent)
      }
    }

    {
      for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
        val filePath = root2XDir.resolve(Paths.get("ztuple" + i, "ZTuple" + i + ".scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent =
            StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.ZTupleX(ZTupleNum = i)(maxContextNum = ZsgParameters.maxContextNum)(isDotty = false).body)
          writer.println(linerContent)
        }
      }
      for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
        val filePath = rootDottyDir.resolve(Paths.get("ztuple" + i, "ZTuple" + i + ".scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent =
            StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.ZTupleX(ZTupleNum = i)(maxContextNum = ZsgParameters.maxContextNum)(isDotty = true).body)
          writer.println(linerContent)
        }
      }
    }

    {
      for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
        val filePath = root2XDir.resolve(Paths.get("ztuple" + i, "ZNode" + i + ".scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent =
            StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.ZNodeX(ZTupleNum = i, maxContextNum = ZsgParameters.maxContextNum)(isDotty = false).body)
          writer.println(linerContent)
        }
      }
      for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
        val filePath = rootDottyDir.resolve(Paths.get("ztuple" + i, "ZNode" + i + ".scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent = StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.ZNodeX(ZTupleNum = i, maxContextNum = ZsgParameters.maxContextNum)(isDotty = true).body)
          writer.println(linerContent)
        }
      }
    }

    {
      for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
        val filePath = root2XDir.resolve(Paths.get("ztuple" + i, "PlusInstanceTuple" + i + ".scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent =
            StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.PlusInstanceTupleX(ZTupleNum = i, maxContextNum = ZsgParameters.maxContextNum)(isDotty = false).body)
          writer.println(linerContent)
        }
      }
      for (i <- 1 to ZsgParameters.maxZTupleNum) yield {
        val filePath = rootDottyDir.resolve(Paths.get("ztuple" + i, "PlusInstanceTuple" + i + ".scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent =
            StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.PlusInstanceTupleX(ZTupleNum = i, maxContextNum = ZsgParameters.maxContextNum)(isDotty = true).body)
          writer.println(linerContent)
        }
      }
    }

    {
      {
        val filePath = root2XDir.resolve(Paths.get("ztuple2", "PlusInstanceZsgTuple2.scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent =
            StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.PlusInstanceZsgTuple2(ZTupleNum = 2, maxContextNum = ZsgParameters.maxContextNum)(isDotty = false).body)
          writer.println(linerContent)
        }
      }
      {
        val filePath = rootDottyDir.resolve(Paths.get("ztuple2", "PlusInstanceZsgTuple2.scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent =
            StringUtil.trimLines(zsg.codegen.tuple.new_tuple.txt.PlusInstanceZsgTuple2(ZTupleNum = 2, maxContextNum = ZsgParameters.maxContextNum)(isDotty = true).body)
          writer.println(linerContent)
        }
      }
    }
  }

}
