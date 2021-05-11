package zsg.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object ZsgCoreCodeGeneration {

  val root2XDir  = Paths.get(".", "modules", "core", "src", "main", "scala-2", "zsg", "codegen")
  val build2XDir = root2XDir.resolve("build")

  val rootAllDir = Paths.get(".", "modules", "core", "src", "main", "scala", "zsg", "codegen")

  val rootDottyDir  = Paths.get(".", "modules", "core", "src", "main", "scala-3", "zsg", "codegen")
  val buildDottyDir = rootDottyDir.resolve("build")

  def main(arr: Array[String]): Unit = {
    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      val filePath = rootAllDir.resolve(Paths.get("mapper" + i, "Plus" + i + ".scala"))
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val linerContent = StringUtil.trimLines(zsg.codegen.tuple.txt.PlusX(tagNum = i).body)
        writer.println(linerContent)
      }
    }

    {
      for (i <- 1 to ZsgParameters.maxContextNum) yield {
        val filePath = root2XDir.resolve(Paths.get("mapper" + i, "Context" + i + ".scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent = StringUtil.trimLines(zsg.codegen.tuple.txt.ContextX(tagNum = i)(isDotty = false).body)
          writer.println(linerContent)
        }
      }
      for (i <- 1 to ZsgParameters.maxContextNum) yield {
        val filePath = rootDottyDir.resolve(Paths.get("mapper" + i, "Context" + i + ".scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent = StringUtil.trimLines(zsg.codegen.tuple.txt.ContextX(tagNum = i)(isDotty = true).body)
          writer.println(linerContent)
        }
      }
    }

    /*{
      for (i <- 1 to ZsgParameters.maxContextNum) yield {
        val filePath = root2XDir.resolve("mapper" + i).resolve("Application" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer       = new PrintWriter(filePath.toFile, "utf-8")
        val linerContent = StringUtil.trimLines(zsg.codegen.tuple.txt.ApplicationX(tagNum = i, isDotty = false).body)
        writer.println(linerContent)
        writer.close()
      }
      for (i <- 1 to ZsgParameters.maxContextNum) yield {
        val filePath = rootDottyDir.resolve("mapper" + i).resolve("Application" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer       = new PrintWriter(filePath.toFile, "utf-8")
        val linerContent = StringUtil.trimLines(zsg.codegen.tuple.txt.ApplicationX(tagNum = i, isDotty = true).body)
        writer.println(linerContent)
        writer.close()
      }
    }*/

    /*{
      {
        val filePath = root2XDir.resolve("mapper" + 2).resolve("ZsgTuple" + 2 + ".scala")
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val content = StringUtil.trimLines(
            zsg.codegen.tuple.txt.ZsgTuple(tagNum = 2)(maxAsunaContext = ZsgParameters.maxContextNum)(false).body
          )
          writer.println(content)
        }
      }
      {
        val filePath = rootDottyDir.resolve("mapper" + 2).resolve("ZsgTuple" + 2 + ".scala")
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val content = StringUtil.trimLines(
            zsg.codegen.tuple.txt.ZsgTuple(tagNum = 2)(maxAsunaContext = ZsgParameters.maxContextNum)(true).body
          )
          writer.println(content)
        }
      }
    }*/

    /*{
      for (i <- 1 to ZsgParameters.maxPropertyNum) yield {
        val filePath = root2XDir.resolve("mapper" + i).resolve("NodeTuple" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content = StringUtil.trimLines(
          zsg.codegen.tuple.txt.NodeTuple(tagNum = i)(maxAsunaTupleNum = ZsgParameters.maxPropertyNum, maxAsunaContext = ZsgParameters.maxContextNum)(false).body
        )
        writer.println(content)
        writer.close()
      }
      for (i <- 1 to ZsgParameters.maxPropertyNum) yield {
        val filePath = rootDottyDir.resolve("mapper" + i).resolve("NodeTuple" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content = StringUtil.trimLines(
          zsg.codegen.tuple.txt.NodeTuple(tagNum = i)(maxAsunaTupleNum = ZsgParameters.maxPropertyNum, maxAsunaContext = ZsgParameters.maxContextNum)(true).body
        )
        writer.println(content)
        writer.close()
      }
    }*/

    {
      {
        val filePath = build2XDir.resolve("BuildContent.scala")
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val content = StringUtil.trimLines(zsg.codegen.tuple.build.txt.BuildContent(maxItem = ZsgParameters.maxZTupleNum)(isDotty = false).body)
          writer.println(content)
        }
      }
      {
        val filePath = buildDottyDir.resolve("BuildContent.scala")
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val content = StringUtil.trimLines(zsg.codegen.tuple.build.txt.BuildContent(maxItem = ZsgParameters.maxZTupleNum)(isDotty = true).body)
          writer.println(content)
        }
      }
    }

  }

}
