package zsg

abstract class Context[F <: TypeFunction] {
  def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: F#H[X], y: F#H[Y])(plus: Plus[X, Y, Z]): F#H[Z]
}
