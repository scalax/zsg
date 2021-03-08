package zsg
abstract class ApplicationX8[F[_, _, _, _, _, _, _, _], T <: Context8[F], I1, I2, I3, I4, I5, I6, I7, I8] {
  def application(context: T): F[I1, I2, I3, I4, I5, I6, I7, I8]
}
object ApplicationX8 {
  implicit def applicationImplicit[F[_, _, _, _, _, _, _, _], T <: Context8[F], I1, I2, I3, I4, I5, I6, I7, I8](implicit
    i: F[I1, I2, I3, I4, I5, I6, I7, I8]
  ): ApplicationX8[F, T, I1, I2, I3, I4, I5, I6, I7, I8] =
    new ApplicationX8[F, T, I1, I2, I3, I4, I5, I6, I7, I8] {
      def application(context: T): F[I1, I2, I3, I4, I5, I6, I7, I8] = i
    }
}
