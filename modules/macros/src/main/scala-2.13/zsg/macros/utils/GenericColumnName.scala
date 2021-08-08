package zsg.macros.utils

class GenericColumnName[N <: String](val value: String) extends AnyVal

object GenericColumnName {
  implicit def nameImplicit[N <: String](implicit name: ValueOf[N]): GenericColumnName[N] = new GenericColumnName[N](name.value)
}
