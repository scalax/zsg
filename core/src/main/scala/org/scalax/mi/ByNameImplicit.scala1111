package org.scalax.asuna.implements

import scala.reflect.macros.blackbox

import scala.language.experimental.macros

trait ByNameImplicit[T] {
  def value: T
}

object ByNameImplicit {
  implicit def implicit1[T]: ByNameImplicit[T] = macro ByNameImplicitMacro.ByNameImplicitMacroImpl.implicitFetch[T]
}

object ByNameImplicitMacro {

  class ByNameImplicitMacroImpl(val c: blackbox.Context) {
    import c.universe._

    def implicitFetch[T: c.WeakTypeTag]: c.Expr[ByNameImplicit[T]] = {
      val byNameImplicit = weakTypeOf[ByNameImplicit[T]]
      val t              = weakTypeOf[T]
      c.Expr[ByNameImplicit[T]] {
        q"""new ${byNameImplicit} { override def value: ${t} = implicitly[${t}] }"""
      }
    }
  }

}
