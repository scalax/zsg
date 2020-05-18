package zsg.macros

trait AllScalaMacroMethods {
  val c: scala.reflect.macros.blackbox.Context
  import c.universe._

  case class CompanionWithSymbol(companionSymbol: Option[Symbol], companionTree: Tree)

  def companionOfSymbol(symbol: Symbol): CompanionWithSymbol = symbol.companion match {
    case NoSymbol         => CompanionWithSymbol(Option.empty, q"""${symbol.name.toTermName}""")
    case s if s.isStatic  => CompanionWithSymbol(Option(s), q"""${s}""")
    case s if !s.isStatic => CompanionWithSymbol(Option(s), q"""${symbol.name.toTermName}""")
  }
}
