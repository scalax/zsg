package asuna.macros.single

import asuna.{AppendTag, PropertyTag0}

class PropertyApply[I] {
  def to[R](m: I => R): AppendTag[PropertyTag0[R]] = AppendTag[PropertyTag0[R]]
}
object PropertyApply {
  val value: PropertyApply[Any]  = new PropertyApply[Any]
  def apply[R]: PropertyApply[R] = value.asInstanceOf[PropertyApply[R]]
}
