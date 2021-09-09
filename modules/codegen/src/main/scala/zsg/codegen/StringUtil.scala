package zsg.codegen

import scala.io.Source
import scala.util.Using

object StringUtil {

  def trimLines(i: String): String =
    Using.resource(Source.fromString(i))(_.getLines().map(p => (p.trim, p)).filter(!_._1.isEmpty).map(_._2).mkString(System.lineSeparator))

}
