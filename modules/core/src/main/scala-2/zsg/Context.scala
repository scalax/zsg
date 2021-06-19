package zsg

abstract class Context[F[_ <: TypeHList]] {
  def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: F[X], y: F[Y])(plus: Plus[X, Y, Z]): F[Z]
}
