package asuna.macros.single

import asuna.{AppendTag, PropertyTag0}

class PropertyApply[I] {
  def to[R](m: I => R): AppendTag[PropertyTag0[R]] = AppendTag[PropertyTag0[R]]
}
object PropertyApply {
  val value: PropertyApply[Any]                 = new PropertyApply[Any]
  implicit def proImplicit[I]: PropertyApply[I] = PropertyApply[I]
  def apply[R]: PropertyApply[R]                = value.asInstanceOf[PropertyApply[R]]
}
