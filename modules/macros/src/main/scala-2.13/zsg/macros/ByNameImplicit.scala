package zsg.macros

abstract class ByNameImplicit[T] {
  def value: T
}

object ByNameImplicit {
  implicit def implicitFetch[T](implicit byNameValue: => T): ByNameImplicit[T] = new ByNameImplicit[T] {
    override def value: T = byNameValue
  }
}
