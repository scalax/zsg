package asuna.codegen.tuple

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object AsunaTupleCodeGeneration {
  val maxPropertyNum = 3
  val maxTupleNum    = 22

  def main(arr: Array[String]): Unit = {
    val rootDir =
      Paths.get("./").resolve("modules").resolve("scala-tuple").resolve("src").resolve("main").resolve("scala").resolve("asuna").resolve("tuple").resolve("codegen")
    val supportDir =
      rootDir.resolve("tupleSupport")

    for (i <- 1 to maxPropertyNum) yield {
      for (ii <- 1 to maxTupleNum - 2) yield {
        val filePath = rootDir.resolve("mapper" + i).resolve("HListPlus_" + ii + "_" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        val writer = new PrintWriter(filePath.toFile, "utf-8")
        val content =
          Source.fromString(asuna.codegen.scala_tuple.txt.HListPlus(tagNum = i, caseClassNum = ii).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
        val linerContent = content.mkString(System.lineSeparator)
        writer.println(linerContent)
        writer.close()
      }
    }

    for (i <- 1 to maxPropertyNum) yield {
      val filePath = rootDir.resolve("mapper" + i).resolve("HListPlus" + i + ".scala")
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
        val filePath = rootDir.resolve("mapper" + i).resolve("PlusToTuple_" + ii + "_" + i + ".scala")
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
      val filePath = rootDir.resolve("mapper" + i).resolve("PlusToTuple" + i + ".scala")
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

    for (i <- 2 to maxTupleNum) yield {
      for (ii <- 1 to maxPropertyNum) yield {
        val filePath = rootDir.resolve("mapper" + ii).resolve("ScalaTupleImplicits_" + i + "_" + ii + ".scala")
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

    {
      val filePath = rootDir.resolve("ScalaTupleImplicits.scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source
          .fromString(asuna.codegen.scala_tuple.txt.ScalaTupleImplicits(maxAsunaTupleNum = maxTupleNum)(maxPropertyNum = maxPropertyNum).body)
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
