package zsg.codegen.tuple

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import zsg.codegen.{StringUtil, ZsgParameters}

import scala.io.Source
import scala.util.Using

object ZsgTupleCodeGeneration {

  val root1_all_Dir =
    Paths
      .get("./")
      .resolve("modules")
      .resolve("scala-tuple")
      .resolve("src")
      .resolve("main")
      .resolve("scala")
      .resolve("zsg")
      .resolve("scala_tuple")
      .resolve("tuple_support")
      .resolve("codegen")

  val root1_2X_Dir =
    Paths
      .get("./")
      .resolve("modules")
      .resolve("scala-tuple")
      .resolve("src")
      .resolve("main")
      .resolve("scala-2")
      .resolve("zsg")
      .resolve("scala_tuple")
      .resolve("tuple_support")
      .resolve("codegen")

  val root1_dotty_Dir =
    Paths
      .get("./")
      .resolve("modules")
      .resolve("scala-tuple")
      .resolve("src")
      .resolve("main")
      .resolve("scala-3")
      .resolve("zsg")
      .resolve("scala_tuple")
      .resolve("tuple_support")
      .resolve("codegen")

  val root2Dir =
    Paths
      .get("./")
      .resolve("modules")
      .resolve("scala-tuple-1")
      .resolve("src")
      .resolve("main")
      .resolve("scala")
      .resolve("zsg")
      .resolve("scala_tuple")
      .resolve("tuple_support")
      .resolve("codegen")

  val root3Dir =
    Paths
      .get("./")
      .resolve("modules")
      .resolve("scala-tuple-2")
      .resolve("src")
      .resolve("main")
      .resolve("scala")
      .resolve("zsg")
      .resolve("scala_tuple")
      .resolve("tuple_support")
      .resolve("codegen")

  def main(arr: Array[String]): Unit = {

    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      for (ii <- 0 to ZsgParameters.maxTupleNum - 1) yield {
        val filePath = root2Dir.resolve("mapper" + i).resolve("HListPlus_" + ii + "_" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer  = new PrintWriter(filePath.toFile, "utf-8")
        val content = StringUtil.trimLines(zsg.codegen.scala_tuple.txt.HListPlusX(tagNum = i, caseClassNum = ii).body)
        writer.println(content)
        writer.close()
      }
    }

    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      val filePath = root2Dir.resolve("mapper" + i).resolve("HListPlus" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(zsg.codegen.scala_tuple.txt.HListPlusSum(tagNum = i, maxTupleNum = ZsgParameters.maxTupleNum - 2).body)
        writer.println(content)
      }

    }

    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      for (ii <- 1 to ZsgParameters.maxTupleNum) yield {
        val filePath = root3Dir.resolve("mapper" + i).resolve("PlusToTuple_" + ii + "_" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer  = new PrintWriter(filePath.toFile, "utf-8")
        val content = StringUtil.trimLines(zsg.codegen.scala_tuple.txt.PlusToTupleX(tagNum = i, caseClassNum = ii).body)
        writer.println(content)
        writer.close()
      }
    }

    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      val filePath = root3Dir.resolve("mapper" + i).resolve("PlusToTuple" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer  = new PrintWriter(filePath.toFile, "utf-8")
      val content = StringUtil.trimLines(zsg.codegen.scala_tuple.txt.PlusToTupleSum(tagNum = i, maxTupleNum = ZsgParameters.maxTupleNum).body)
      writer.println(content)
      writer.close()
    }

    {
      for (i <- 1 to ZsgParameters.maxTupleNum) yield {
        for (ii <- 1 to ZsgParameters.maxContextNum) yield {
          val filePath = root1_2X_Dir.resolve("mapper" + ii).resolve("ScalaTupleImplicits_" + i + "_" + ii + ".scala")
          Files.createDirectories(filePath.getParent)
          val writer = new PrintWriter(filePath.toFile, "utf-8")
          val linerContent = StringUtil.trimLines(
            zsg.codegen.scala_tuple.txt.ScalaTupleImplicitsX(tagNum = i)(typeParamNum = ii)(maxAsunaTupleNum = ZsgParameters.maxTupleNum)(isDotty = false).body
          )
          writer.println(linerContent)
          writer.close()
        }
      }

      for (i <- 1 to ZsgParameters.maxTupleNum) yield {
        for (ii <- 1 to ZsgParameters.maxContextNum) yield {
          val filePath = root1_dotty_Dir.resolve("mapper" + ii).resolve("ScalaTupleImplicits_" + i + "_" + ii + ".scala")
          Files.createDirectories(filePath.getParent)
          val writer = new PrintWriter(filePath.toFile, "utf-8")
          val linerContent =
            StringUtil.trimLines(
              zsg.codegen.scala_tuple.txt.ScalaTupleImplicitsX(tagNum = i)(typeParamNum = ii)(maxAsunaTupleNum = ZsgParameters.maxTupleNum)(isDotty = true).body
            )
          writer.println(linerContent)
          writer.close()
        }
      }
    }

    {
      {
        val filePath = root1_2X_Dir.resolve("ApplicationFetchContent.scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val linerContent = StringUtil.trimLines(
          zsg.codegen.scala_tuple.txt.ApplicationFetchContent(maxParamNum = ZsgParameters.maxContextNum)(isDotty = false).body
        )
        writer.println(linerContent)
        writer.close()
      }

      {
        val filePath = root1_dotty_Dir.resolve("ApplicationFetchContent.scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val linerContent =
          StringUtil.trimLines(
            zsg.codegen.scala_tuple.txt.ApplicationFetchContent(maxParamNum = ZsgParameters.maxContextNum)(isDotty = true).body
          )
        writer.println(linerContent)
        writer.close()
      }
    }

    {
      val filePath = root1_all_Dir.resolve("ScalaTupleImplicits.scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content = StringUtil.trimLines(
        zsg.codegen.scala_tuple.txt.ScalaTupleImplicitsSum(maxAsunaTupleNum = ZsgParameters.maxTupleNum)(maxPropertyNum = ZsgParameters.maxContextNum).body
      )
      writer.println(content)
      writer.close()
    }

  }
}
