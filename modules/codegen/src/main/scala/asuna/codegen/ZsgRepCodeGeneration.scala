package zsg.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object ZsgRepCodeGeneration {

  val root2XDir  = Paths.get(".", "modules", "rep", "src", "main", "scala-2", "zsg", "codegen")
  val build2XDir = root2XDir.resolve("build")

  val rootAllDir  = Paths.get(".", "modules", "rep", "src", "main", "scala", "zsg", "codegen")
  val buildAllDir = rootAllDir.resolve("build")

  val rootDottyDir  = Paths.get(".", "modules", "rep", "src", "main", "scala-3", "zsg", "codegen")
  val buildDottyDir = rootDottyDir.resolve("build")

  def main(arr: Array[String]): Unit = {
    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      val filePath = rootAllDir.resolve("RepMeta" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val linerContent = StringUtil.trimLines(zsg.codegen.rep.txt.RepMeta(contextNum = i)(maxZTupleNum = ZsgParameters.maxZTupleNum).body)
        writer.println(linerContent)
      }
    }

    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      val filePath = rootAllDir.resolve(Paths.get("impl", "RepMetaImpl" + i + ".scala"))
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val linerContent = StringUtil.trimLines(zsg.codegen.rep.txt.RepMetaImpl(contextNum = i)(maxZTupleNum = ZsgParameters.maxZTupleNum).body)
        writer.println(linerContent)
      }
    }

    for (i <- 1 to ZsgParameters.maxContextNum) yield {
      val filePath = rootAllDir.resolve(Paths.get("impl", "RepMetaOptionTakerImplicit_1_" + i + ".scala"))
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val linerContent = StringUtil.trimLines(zsg.codegen.rep.txt.RepMetaOptionTakerImplicit1(contextNum = i)(maxZTupleNum = ZsgParameters.maxZTupleNum).body)
        writer.println(linerContent)
      }
    }

    {
      val filePath = buildAllDir.resolve("RepMeta.scala")
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val linerContent = StringUtil.trimLines(zsg.codegen.rep.txt.RepMetaBuilder(maxContextNum = ZsgParameters.maxContextNum).body)
        writer.println(linerContent)
      }
    }
  }

}
