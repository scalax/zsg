package asuna.macros

import scala.reflect.macros.blackbox

import scala.language.experimental.macros

abstract class ByNameImplicit[T] {
  def value: T
}

object ByNameImplicit {
  implicit def implicitFetch[T]: ByNameImplicit[T] = macro ByNameImplicitHelper.Impl.fetch[T]
}

object ByNameImplicitHelper {

  class Impl(val c: blackbox.Context) {
    import c.universe._

    def fetch[T: c.WeakTypeTag]: c.Expr[ByNameImplicit[T]] = {
      val byNameImplicit = weakTypeOf[ByNameImplicit[T]].resultType
      val t              = weakTypeOf[T].resultType
      c.Expr[ByNameImplicit[T]] {
        q"""new ${byNameImplicit} { @inline override def value: ${t} = implicitly[${t}] }"""
      }
    }
  }

}
