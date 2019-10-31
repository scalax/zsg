package asuna.macros

import scala.reflect.macros.blackbox

import scala.language.experimental.macros

trait ByNameImplicit[T] {
  def value: T
}

object ByNameImplicit {
  implicit def implicitFetch[T]: ByNameImplicit[T] = macro ByNameImplicitHelper.ByNameImplicitHelperImpl.implicitFetch[T]
}

object ByNameImplicitHelper {

  class ByNameImplicitHelperImpl(val c: blackbox.Context) {
    import c.universe._

    def implicitFetch[T: c.WeakTypeTag]: c.Expr[ByNameImplicit[T]] = {
      val lazyImplicit = weakTypeOf[ByNameImplicit[T]].resultType
      val t            = weakTypeOf[T].resultType
      c.Expr[ByNameImplicit[T]] {
        q"""new ${lazyImplicit} { override def value: ${t} = implicitly[${t}] }"""
      }
    }
  }

}
