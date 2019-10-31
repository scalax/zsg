package asuna.macros

import scala.reflect.macros.blackbox

import scala.language.experimental.macros

trait LazyImplicit[T] {
  def value: T
}

object LazyImplicit {
  implicit def implicitFetch[T]: LazyImplicit[T] = macro LazyImplicitHelper.Impl.fetch[T]
}

object LazyImplicitHelper {

  class Impl(val c: blackbox.Context) {
    import c.universe._

    def fetch[T: c.WeakTypeTag]: c.Expr[LazyImplicit[T]] = {
      val lazyImplicit = weakTypeOf[LazyImplicit[T]].resultType
      val t            = weakTypeOf[T].resultType
      c.Expr[LazyImplicit[T]] {
        q"""new ${lazyImplicit} { override lazy val value: ${t} = implicitly[${t}] }"""
      }
    }
  }

}
