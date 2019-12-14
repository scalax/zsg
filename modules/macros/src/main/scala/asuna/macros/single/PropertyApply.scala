package asuna.macros.single

import asuna.AppendTag

class PropertyApply[I] {
  def to[R](m: I => R): AppendTag[PropertyTag[R]] = new AppendTag[PropertyTag[R]]
}
object PropertyApply {
  def apply[R]: PropertyApply[R] = new PropertyApply[R]
}
