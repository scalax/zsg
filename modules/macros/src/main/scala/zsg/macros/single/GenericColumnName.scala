package zsg.macros.single

import scala.language.experimental.macros

abstract class GenericColumnName[N <: StringName] {
  def value: Symbol
}

object GenericColumnName {

  implicit def nImplicit[N <: StringName]: GenericColumnName[N] = macro MacroImpl.generic[N]

  class MacroImpl(val c: scala.reflect.macros.blackbox.Context) {
    import c.universe._
    def generic[N <: StringName: c.WeakTypeTag]: c.Expr[GenericColumnName[N]] = {
      val n              = weakTypeOf[N]
      val TypeName(name) = n.typeSymbol.name
      val name1          = name.trim
      c.Expr[GenericColumnName[N]] {
        q"""
          new _root_.zsg.macros.single.GenericColumnName[${n}] {
          override val value: Symbol = ${Literal(Symbol(name1))}
        }"""
      }
    }
  }

}
