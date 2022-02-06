package zsg

trait Context {
  type T[_ <: TypeHList]
  inline def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](inline x: T[X], inline y: T[Y])(inline plus: Plus[X, Y, Z]): T[Z]
}
