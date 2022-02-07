package zsg

trait Context {
  type T[_ <: TypeHList]
  def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: T[X], y: T[Y])(plus: Plus[X, Y, Z]): T[Z]
}
