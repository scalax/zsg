package zsg
abstract class ApplicationX6[F[_, _, _, _, _, _], T <: Context6[F], I1, I2, I3, I4, I5, I6] {
  def application(context: T): F[I1, I2, I3, I4, I5, I6]
}
