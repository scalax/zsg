package asuna.codegen.tuple

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object AsunaTupleCodeGeneration {
  val maxPropertyNum = 6
  val maxTupleNum    = 16

  val root1_all_Dir =
    Paths
      .get("./")
      .resolve("modules")
      .resolve("scala-tuple")
      .resolve("src")
      .resolve("main")
      .resolve("scala")
      .resolve("asuna")
      .resolve("scala_tuple")
      .resolve("tuple_support")
      .resolve("codegen")

  val root1_212_Dir =
    Paths
      .get("./")
      .resolve("modules")
      .resolve("scala-tuple")
      .resolve("src")
      .resolve("main")
      .resolve("scala-2.12")
      .resolve("asuna")
      .resolve("scala_tuple")
      .resolve("tuple_support")
      .resolve("codegen")

  val root1_213_Dir =
    Paths
      .get("./")
      .resolve("modules")
      .resolve("scala-tuple")
      .resolve("src")
      .resolve("main")
      .resolve("scala-2.13")
      .resolve("asuna")
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
      .resolve("scala-0.20")
      .resolve("asuna")
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
      .resolve("asuna")
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
      .resolve("asuna")
      .resolve("scala_tuple")
      .resolve("tuple_support")
      .resolve("codegen")

  def main(arr: Array[String]): Unit = {

    for (i <- 1 to maxPropertyNum) yield {
      for (ii <- 0 to maxTupleNum - 1) yield {
        val filePath = root2Dir.resolve("mapper" + i).resolve("HListPlus_" + ii + "_" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content =
          Source.fromString(asuna.codegen.scala_tuple.txt.HListPlusX(tagNum = i, caseClassNum = ii).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
        val linerContent = content.mkString(System.lineSeparator)
        writer.println(linerContent)
        writer.close()
      }
    }

    for (i <- 1 to maxPropertyNum) yield {
      val filePath = root2Dir.resolve("mapper" + i).resolve("HListPlus" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source.fromString(asuna.codegen.scala_tuple.txt.HListPlusSum(tagNum = i, maxTupleNum = maxTupleNum - 2).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val linerContent = content.mkString(System.lineSeparator)
      writer.println(linerContent)
      writer.close()
    }

    for (i <- 1 to maxPropertyNum) yield {

      for (ii <- 1 to maxTupleNum - 1) yield {
        val filePath = root3Dir.resolve("mapper" + i).resolve("PlusToTuple_" + ii + "_" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content =
          Source.fromString(asuna.codegen.scala_tuple.txt.PlusToTupleX(tagNum = i, caseClassNum = ii).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
        val linerContent = content.mkString(System.lineSeparator)
        writer.println(linerContent)
        writer.close()
      }
    }

    for (i <- 1 to maxPropertyNum) yield {
      val filePath = root3Dir.resolve("mapper" + i).resolve("PlusToTuple" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source
          .fromString(asuna.codegen.scala_tuple.txt.PlusToTupleSum(tagNum = i, maxTupleNum = maxTupleNum - 1).body)
          .getLines
          .toList
          .map(_.trim)
          .filter(s => !s.isEmpty)
      val linerContent = content.mkString(System.lineSeparator)
      writer.println(linerContent)
      writer.close()
    }

    {
      for (i <- 2 to maxTupleNum) yield {
        for (ii <- 1 to maxPropertyNum) yield {
          val filePath = root1_212_Dir.resolve("mapper" + ii).resolve("ScalaTupleImplicits_" + i + "_" + ii + ".scala")
          Files.createDirectories(filePath.getParent)
          val writer = new PrintWriter(filePath.toFile, "utf-8")
          val content =
            Source
              .fromString(asuna.codegen.scala_tuple.txt.ScalaTupleImplicitsX(tagNum = i)(typeParamNum = ii)(maxAsunaTupleNum = maxTupleNum).body)
              .getLines
              .toList
              .map(_.trim)
              .filter(s => !s.isEmpty)
          val linerContent = content.mkString(System.lineSeparator)
          writer.println(linerContent)
          writer.close()
        }
      }

      for (i <- 2 to maxTupleNum) yield {
        for (ii <- 1 to maxPropertyNum) yield {
          val filePath = root1_213_Dir.resolve("mapper" + ii).resolve("ScalaTupleImplicits_" + i + "_" + ii + ".scala")
          Files.createDirectories(filePath.getParent)
          val writer = new PrintWriter(filePath.toFile, "utf-8")
          val content =
            Source
              .fromString(asuna.codegen.scala_tuple.txt.ScalaTupleImplicitsX(tagNum = i)(typeParamNum = ii)(maxAsunaTupleNum = maxTupleNum).body)
              .getLines
              .toList
              .map(_.trim)
              .filter(s => !s.isEmpty)
          val linerContent = content.mkString(System.lineSeparator)
          writer.println(linerContent)
          writer.close()
        }
      }

      for (i <- 2 to maxTupleNum) yield {
        for (ii <- 1 to maxPropertyNum) yield {
          val filePath = root1_dotty_Dir.resolve("mapper" + ii).resolve("ScalaTupleImplicits_" + i + "_" + ii + ".scala")
          Files.createDirectories(filePath.getParent)
          val writer = new PrintWriter(filePath.toFile, "utf-8")
          val content =
            Source
              .fromString(asuna.codegen.scala_tuple.txt.dotty_ScalaTupleImplicitsX(tagNum = i)(typeParamNum = ii)(maxAsunaTupleNum = maxTupleNum).body)
              .getLines
              .toList
              .map(_.trim)
              .filter(s => !s.isEmpty)
          val linerContent = content.mkString(System.lineSeparator)
          writer.println(linerContent)
          writer.close()
        }
      }
    }

    {
      val filePath = root1_all_Dir.resolve("ScalaTupleImplicits.scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source
          .fromString(asuna.codegen.scala_tuple.txt.ScalaTupleImplicitsSum(maxAsunaTupleNum = maxTupleNum)(maxPropertyNum = maxPropertyNum).body)
          .getLines
          .toList
          .map(_.trim)
          .filter(s => !s.isEmpty)
      val linerContent = content.mkString(System.lineSeparator)
      writer.println(linerContent)
      writer.close()
    }

  }
}
