package asuna.macros

import scala.reflect.macros.blackbox

import scala.language.experimental.macros

trait LazyImplicit[T] {
  def value: T
}

object LazyImplicit {
  implicit def implicitFetch[T]: LazyImplicit[T] = macro LazyImplicitHelper.LazyImplicitHelperImpl.implicitFetch[T]
}

object LazyImplicitHelper {

  class LazyImplicitHelperImpl(val c: blackbox.Context) {
    import c.universe._

    def implicitFetch[T: c.WeakTypeTag]: c.Expr[LazyImplicit[T]] = {
      val lazyImplicit = weakTypeOf[LazyImplicit[T]].resultType
      val t            = weakTypeOf[T].resultType
      c.Expr[LazyImplicit[T]] {
        q"""new ${lazyImplicit} { override def value: ${t} = implicitly[${t}] }"""
      }
    }
  }

}
