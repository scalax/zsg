package zsg.codegen

import scala.io.Source

object StringUtil {

  def trimLines(i: String): String =
    Source.fromString(i).getLines().map(p => (p.trim, p)).filter(!_._1.isEmpty).map(_._2).mkString(System.lineSeparator)

}
