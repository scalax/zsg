package zsg
abstract class ApplicationX5[F[_, _, _, _, _], T <: Context5[F], I1, I2, I3, I4, I5] {
  def application(context: T): F[I1, I2, I3, I4, I5]
}
object ApplicationX5 {
  implicit def applicationImplicit[F[_, _, _, _, _], T <: Context5[F], I1, I2, I3, I4, I5](implicit i: F[I1, I2, I3, I4, I5]): ApplicationX5[F, T, I1, I2, I3, I4, I5] =
    new ApplicationX5[F, T, I1, I2, I3, I4, I5] {
      def application(context: T): F[I1, I2, I3, I4, I5] = i
    }
}
