package zsg.codegen.tuple

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import zsg.codegen.{StringUtil, ZsgParameters}

import scala.util.Using

object ZsgTupleCodeGeneration {

  val root1_all_Dir   = Paths.get(".", "modules", "scala-tuple", "src", "main", "scala", "zsg", "scala_tuple", "tuple_support", "codegen")
  val root1_2X_Dir    = Paths.get(".", "modules", "scala-tuple", "src", "main", "scala-2", "zsg", "scala_tuple", "tuple_support", "codegen")
  val root1_dotty_Dir = Paths.get(".", "modules", "scala-tuple", "src", "main", "scala-3", "zsg", "scala_tuple", "tuple_support", "codegen")
  val root2Dir        = Paths.get(".", "modules", "scala-tuple-1", "src", "main", "scala", "zsg", "scala_tuple", "tuple_support", "codegen")
  val root3Dir        = Paths.get(".", "modules", "scala-tuple-2", "src", "main", "scala", "zsg", "scala_tuple", "tuple_support", "codegen")
  val root3_2X_Dir    = Paths.get(".", "modules", "scala-tuple-2", "src", "main", "scala-2", "zsg", "scala_tuple", "tuple_support", "codegen")
  val root3_dotty_Dir = Paths.get(".", "modules", "scala-tuple-2", "src", "main", "scala-3", "zsg", "scala_tuple", "tuple_support", "codegen")

  def main(arr: Array[String]): Unit = {

    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      for (ii <- 0 to ZsgParameters.maxTupleNum - 1) yield {
        val filePath = root2Dir.resolve(Paths.get("mapper" + i, "HListPlus_" + ii + "_" + i + ".scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val content = StringUtil.trimLines(zsg.codegen.scala_tuple.txt.HListPlusX(tagNum = i, caseClassNum = ii).body)
          writer.println(content)
        }
      }
    }

    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      val filePath = root2Dir.resolve(Paths.get("mapper" + i, "HListPlus" + i + ".scala"))
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(zsg.codegen.scala_tuple.txt.HListPlusSum(tagNum = i, maxTupleNum = ZsgParameters.maxTupleNum - 2).body)
        writer.println(content)
      }
    }

    {
      for (ii <- 2 to ZsgParameters.maxTupleNum) yield {
        val filePath = root3_2X_Dir.resolve(Paths.get("scala_tuple_plus", "PlusInstanceScalaTuple_" + ii + ".scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val content =
            StringUtil.trimLines(zsg.codegen.scala_tuple.txt.PlusInstanceTupleX(ZTupleNum = ii, maxContextNum = ZsgParameters.maxContextNum)(isDotty = false).body)
          writer.println(content)
        }
      }

      for (ii <- 2 to ZsgParameters.maxTupleNum) yield {
        val filePath = root3_dotty_Dir.resolve(Paths.get("scala_tuple_plus", "PlusInstanceScalaTuple_" + ii + ".scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val content =
            StringUtil.trimLines(zsg.codegen.scala_tuple.txt.PlusInstanceTupleX(ZTupleNum = ii, maxContextNum = ZsgParameters.maxContextNum)(isDotty = true).body)
          writer.println(content)
        }
      }
    }

    /*for (i <- 1 to ZsgParameters.maxContextNum) yield {
      for (ii <- 1 to ZsgParameters.maxTupleNum) yield {
        val filePath = root3Dir.resolve(Paths.get("mapper" + i, "PlusToTuple_" + ii + "_" + i + ".scala"))
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val content = StringUtil.trimLines(zsg.codegen.scala_tuple.txt.PlusToTupleX(tagNum = i, caseClassNum = ii).body)
          writer.println(content)
        }
      }
    }

    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      val filePath = root3Dir.resolve(Paths.get("mapper" + i, "PlusToTuple" + i + ".scala"))
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(zsg.codegen.scala_tuple.txt.PlusToTupleSum(tagNum = i, maxTupleNum = ZsgParameters.maxTupleNum).body)
        writer.println(content)
      }
    }*/

    /*{
      for (i <- 1 to ZsgParameters.maxTupleNum) yield {
        for (ii <- 1 to ZsgParameters.maxContextNum) yield {
          val filePath = root1_2X_Dir.resolve("mapper" + ii).resolve("ScalaTupleImplicits_" + i + "_" + ii + ".scala")
          Files.createDirectories(filePath.getParent)
          Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
            val linerContent = StringUtil.trimLines(
              zsg.codegen.scala_tuple.txt.ScalaTupleImplicitsX(tagNum = i)(typeParamNum = ii)(maxAsunaTupleNum = ZsgParameters.maxTupleNum)(isDotty = false).body
            )
            writer.println(linerContent)
          }
        }
      }

      for (i <- 1 to ZsgParameters.maxTupleNum) yield {
        for (ii <- 1 to ZsgParameters.maxContextNum) yield {
          val filePath = root1_dotty_Dir.resolve(Paths.get("mapper" + ii, "ScalaTupleImplicits_" + i + "_" + ii + ".scala"))
          Files.createDirectories(filePath.getParent)
          Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
            val linerContent =
              StringUtil.trimLines(
                zsg.codegen.scala_tuple.txt.ScalaTupleImplicitsX(tagNum = i)(typeParamNum = ii)(maxAsunaTupleNum = ZsgParameters.maxTupleNum)(isDotty = true).body
              )
            writer.println(linerContent)
          }
        }
      }
    }*/

    {
      for (i <- 2 to ZsgParameters.maxTupleNum) yield {
        val filePath = root1_2X_Dir.resolve("ScalaTupleImplicits_" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent = StringUtil.trimLines(
            zsg.codegen.scala_tuple.txt.TupleXImplicit(ZTupleNum = i)(maxContextNum = ZsgParameters.maxContextNum)(isDotty = false).body
          )
          writer.println(linerContent)
        }
      }
      for (i <- 2 to ZsgParameters.maxTupleNum) yield {
        val filePath = root1_dotty_Dir.resolve("ScalaTupleImplicits_" + i + ".scala")
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent = StringUtil.trimLines(
            zsg.codegen.scala_tuple.txt.TupleXImplicit(ZTupleNum = i)(maxContextNum = ZsgParameters.maxContextNum)(isDotty = true).body
          )
          writer.println(linerContent)
        }
      }
    }

    {
      {
        val filePath = root1_2X_Dir.resolve("ApplicationFetchContent.scala")
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent = StringUtil.trimLines(
            zsg.codegen.scala_tuple.txt.ApplicationFetchContent(maxParamNum = ZsgParameters.maxContextNum)(isDotty = false).body
          )
          writer.println(linerContent)
        }
      }

      {
        val filePath = root1_dotty_Dir.resolve("ApplicationFetchContent.scala")
        Files.createDirectories(filePath.getParent)
        Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
          val linerContent =
            StringUtil.trimLines(
              zsg.codegen.scala_tuple.txt.ApplicationFetchContent(maxParamNum = ZsgParameters.maxContextNum)(isDotty = true).body
            )
          writer.println(linerContent)
        }
      }
    }

    {
      val filePath = root1_all_Dir.resolve("ScalaTupleImplicits.scala")
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(
          zsg.codegen.scala_tuple.txt.ScalaTupleImplicitsSum(maxAsunaTupleNum = ZsgParameters.maxTupleNum)(maxPropertyNum = ZsgParameters.maxContextNum).body
        )
        writer.println(content)
      }
    }

  }
}
