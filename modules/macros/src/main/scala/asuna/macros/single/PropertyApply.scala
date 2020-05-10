package asuna.macros.single

import asuna.PropertyTag

class PropertyApply[I] {
  def to[R](m: I => R): PropertyTag[R] = PropertyTag[R]
}
object PropertyApply {
  val value: PropertyApply[Any]                 = new PropertyApply[Any]
  implicit def proImplicit[I]: PropertyApply[I] = PropertyApply[I]
  def apply[R]: PropertyApply[R]                = value.asInstanceOf[PropertyApply[R]]
}
