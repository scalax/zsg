package zsg
abstract class ApplicationX3[F[_, _, _], T <: Context3[F], I1, I2, I3] {
  def application(context: T): F[I1, I2, I3]
}
