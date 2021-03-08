package zsg
abstract class ApplicationX3[F[_, _, _], T <: Context3[F], I1, I2, I3] {
  def application(context: T): F[I1, I2, I3]
}
object ApplicationX3 {
  implicit def applicationImplicit[F[_, _, _], T <: Context3[F], I1, I2, I3](implicit i: F[I1, I2, I3]): ApplicationX3[F, T, I1, I2, I3] =
    new ApplicationX3[F, T, I1, I2, I3] {
      def application(context: T): F[I1, I2, I3] = i
    }
}
