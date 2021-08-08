package zsg.macros.utils

import scala.language.experimental.macros

class GenericColumnName[N <: String](val value: String) extends AnyVal

object GenericColumnName {

  implicit def nImplicit[N <: String]: GenericColumnName[N] = macro GenericColumnNameMacroApply.MacroImpl.generic[N]

  private object GenericColumnNameMacroApply {
    class MacroImpl(val c: scala.reflect.macros.blackbox.Context) {
      import c.universe._
      def generic[N <: String: c.WeakTypeTag]: c.Expr[GenericColumnName[N]] = {
        try {
          val n                                    = weakTypeOf[N]
          val ConstantType(Constant(name: String)) = n
          c.Expr[GenericColumnName[N]] {
            q"""new _root_.zsg.macros.utils.GenericColumnName[${n}](${Literal(Constant(name.trim))})"""
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
