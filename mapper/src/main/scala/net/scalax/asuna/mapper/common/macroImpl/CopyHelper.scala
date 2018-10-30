package net.scalax.asuna.mapper.common.macroImpl

import java.io.PrintWriter
import java.nio.file.Paths
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import net.scalax.asuna.mapper.utils.CopyHelper
import org.slf4j.LoggerFactory

import scala.io.Source
import scala.reflect.macros.blackbox.Context
import scala.util.{Failure, Properties, Success, Try}

trait CopyHelper extends RepMapperUtils {

  val c: Context

  val logger = LoggerFactory.getLogger("Macro generator")

  val dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS")

  def copySourceToTarget(scalaCode: String, baseFields: List[BaseField]): Unit = {

    val countFields = countIndex(baseFields)
    val appendString = countFields
      .map { field =>
        s"""table field = ${field.tablePropertyName}, case class field: ${field.names.mkString("[", ", ", "]")}, temp model field: tempModel.${field.repIndex
          .map(s => s"rep${s + 1}")
          .mkString(".")}"""
      }
      .map(s => s"// ${s}")
      .mkString("\n")

    val autalScalaCode =
      s"""${scalaCode}
         |
         |// Mapping info
         |${appendString}
       """.stripMargin

    val rootPath = Paths.get(Properties.tmpDir).resolve("asuna-macro").resolve(dtf.format(LocalDateTime.now))

    logger.warn(s"""Macro code
         |${c.enclosingPosition.source.lineToString(c.enclosingPosition.line - 1)}
         |in
         |${c.enclosingPosition.source.path}(line ${c.enclosingPosition.line})
         |has been output.
         |Open
         |${rootPath.toString}
         |and click the html file to see the code for debug.
         |""".stripMargin)

    CopyHelper.copyFromClassPath(List("net", "scalax", "asuna", "mapper", "assets"), rootPath)

    var head: Source             = null
    var content: Source          = null
    var bottom: Source           = null
    var printWriter: PrintWriter = null

    val config = org.scalafmt.config.ScalafmtConfig.default.copy(
        maxColumn = 160
      , align = org.scalafmt.config.Align.more
      , continuationIndent = org.scalafmt.config.ContinuationIndent.apply(defnSite = 2)
      , lineEndings = org.scalafmt.config.LineEndings.unix
      , optIn = org.scalafmt.config.OptIn(breakChainOnFirstMethodDot = false)
      , rewrite = org.scalafmt.config.RewriteSettings(rules = List(org.scalafmt.rewrite.SortImports))
      , poorMansTrailingCommasInConfigStyle = true
      , runner = org.scalafmt.config.ScalafmtRunner.statement
    )

    /*val config = org.scalafmt.Scalafmt.parseHoconConfig("""
        |maxColumn = 160
        |align = more
        |continuationIndent.defnSite = 2
        |lineEndings = unix
        |optIn.breakChainOnFirstMethodDot = false
        |rewrite.rules = [SortImports]
        |poorMansTrailingCommasInConfigStyle = true
      """.stripMargin).get.copy(runner = org.scalafmt.config.ScalafmtRunner.statement)*/

    val formattedCode1 = Try {
      val formattedCode = org.scalafmt.Scalafmt.format(autalScalaCode, config).get
      org.scalafmt.Scalafmt.format(formattedCode, config).get
    } match {
      case Success(formattedCode) => formattedCode
      case Failure(fa) =>
        logger.warn(s"""Code can not be formatted by scalafmt. Output raw code by default. Error message: ${fa.getMessage}""")
        autalScalaCode
    }

    try {
      head = Source.fromFile(rootPath.resolve("highlight").resolve("template").resolve("index-head.html").toFile, "utf-8")
      content = Source.fromString(formattedCode1)
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
  }

}
