package zsg.macros.single

import scala.language.experimental.macros

class GenericColumnName[N <: StringName](val value: String) extends AnyVal

object GenericColumnName {

  implicit def nImplicit[N <: StringName]: GenericColumnName[N] = macro GenericColumnNameMacroApply.MacroImpl.generic[N]

  private object GenericColumnNameMacroApply {
    class MacroImpl(val c: scala.reflect.macros.blackbox.Context) {
      import c.universe._
      def generic[N <: StringName: c.WeakTypeTag]: c.Expr[GenericColumnName[N]] = {
        try {
          val n    = weakTypeOf[N]
          val name = n.toString.trim
          c.Expr[GenericColumnName[N]] {
            q"""new _root_.zsg.macros.single.GenericColumnName[${n}](${Literal(Constant(name))})"""
          }
        } catch {
          case e: Exception =>
            e.printStackTrace()
            throw e
        }
      }
    }
  }

}


