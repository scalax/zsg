package asuna.macros.single.utils

import scala.language.experimental.macros
import scala.collection.compat._

trait TypeHelper {

  val c: scala.reflect.macros.blackbox.Context
  import c.universe._

  def caseClassMembersByType(tpe: Type): List[String] = {
    tpe.members.to(List).filter(s => s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor).map(_.name).collect { case TermName(n) => n.trim }.reverse
  }

}
