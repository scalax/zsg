package asuna.macros.utils

trait MacroMethods {
  val c: scala.reflect.macros.blackbox.Context
  import c.universe._

  def namedParam(name: TermName, value: Tree): Tree = NamedArg(Ident(name), value)
}
