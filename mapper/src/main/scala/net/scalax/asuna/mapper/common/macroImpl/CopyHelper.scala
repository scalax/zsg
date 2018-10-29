package net.scalax.asuna.mapper.common.macroImpl

import java.io.PrintWriter
import java.nio.file.Paths
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import net.scalax.asuna.mapper.utils.CopyHelper

import scala.io.Source
import scala.reflect.macros.blackbox.Context
import scala.util.Properties

trait CopyHelper {

  val c: Context

  import c.universe._

  val dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS")

  def copySourceToTarget(scalaCode: String): Tree = {
    val rootPath = Paths.get(Properties.tmpDir).resolve("asuna-macro").resolve(dtf.format(LocalDateTime.now))
    CopyHelper.copyFromClassPath(List("net", "scalax", "asuna", "mapper", "assets"), rootPath)

    var head: Source             = null
    var content: Source          = null
    var bottom: Source           = null
    var printWriter: PrintWriter = null

    val config = org.scalafmt.Scalafmt.parseHoconConfig("""
        |maxColumn = 160
        |align = more
        |continuationIndent.defnSite = 2
        |lineEndings = unix
        |optIn.breakChainOnFirstMethodDot = false
        |rewrite.rules = [SortImports]
        |poorMansTrailingCommasInConfigStyle = true
      """.stripMargin).get.copy(runner = org.scalafmt.config.ScalafmtRunner.statement)

    val formattedCode  = org.scalafmt.Scalafmt.format(scalaCode, config).get
    val formattedCode1 = org.scalafmt.Scalafmt.format(formattedCode, config).get

    try {
      head = Source.fromFile(rootPath.resolve("highlight").resolve("template").resolve("index-head.html").toFile, "utf-8")
      content = Source.fromString(formattedCode)
      bottom = Source.fromFile(rootPath.resolve("highlight").resolve("template").resolve("index-bottom.html").toFile, "utf-8")
      printWriter = new PrintWriter(rootPath.resolve("index.html").toFile, "utf-8")

      val headList = head.getLines.toList
      val listSize = headList.size
      headList.zipWithIndex.map {
        case (line, index) => if (listSize == index + 1) printWriter.print(line) else printWriter.println(line)
      }
      content.getLines.toList.map(line => printWriter.println(line))
      bottom.getLines.toList.map(line => printWriter.println(line))
    } catch {
      case e: Exception => e.printStackTrace
    } finally {
      try {
        head.close()
      } catch {
        case _: Throwable =>
      }

      try {
        content.close()
      } catch {
        case _: Throwable =>
      }

      try {
        bottom.close()
      } catch {
        case _: Throwable =>
      }

      try {
        printWriter.close()
      } catch {
        case _: Throwable =>
      }

    }

    q"""{
       @deprecated(${Literal(
        Constant(s"Macro code is already write to file.\nOpen\n${rootPath.toString}\nand click the html file to see the code for debug.\n\n")
    )}, ${Literal(
        Constant("")
    )})
       def output: String = ${Literal(Constant(""))}

       output
     }"""
  }

}
