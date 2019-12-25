package asuna.macros.single

import asuna.AppendTag

class PropertyApply[I] {
  def to[R](m: I => R): AppendTag[PropertyTag[R]] = AppendTag[PropertyTag[R]]
}
object PropertyApply {
  val value: PropertyApply[Any]  = new PropertyApply[Any]
  def apply[R]: PropertyApply[R] = value.asInstanceOf[PropertyApply[R]]
}
