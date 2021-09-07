package zsg.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object ZsgScalaTupleCodeGeneration {

  val root2XDir = Paths.get(".", "modules", "scala-tuple", "src", "main", "scala-2", "zsg", "scala", "tuple", "codegen")

  def main(arrs: Array[String]): Unit = {
    {
      val filePath = root2XDir.resolve("TupleHelper.scala")
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val linerContent =
          StringUtil.trimLines(zsg.codegen.scalaTuple.txt.ScalaTuple_Scala2_Implicit(tagNum = ZsgParameters.maxScala2TupleNum).body)
        writer.println(linerContent)
      }
    }
    {
      val filePath = root2XDir.resolve("Tuple22TypeHList.scala")
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val linerContent =
          StringUtil.trimLines(zsg.codegen.scalaTuple.txt.ScalaTuple_Scala2_TypeHList(tagNum = ZsgParameters.maxScala2TupleNum).body)
        writer.println(linerContent)
      }
    }
  }

}
