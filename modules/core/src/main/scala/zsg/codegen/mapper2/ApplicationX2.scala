package zsg
abstract class ApplicationX2[F[_, _], T <: Context2[F], I1, I2] {
  def application(context: T): F[I1, I2]
}
object ApplicationX2 {
  implicit def applicationImplicit[F[_, _], T <: Context2[F], I1, I2](implicit i: F[I1, I2]): ApplicationX2[F, T, I1, I2] =
    new ApplicationX2[F, T, I1, I2] {
      def application(context: T): F[I1, I2] = i
    }
  implicit def applicationImplicit2[F[_, _], T <: Context2[F], I1, Y1, I2, Y2](implicit
    i1: ApplicationX2[F, T, I1, I2],
    i2: ApplicationX2[F, T, Y1, Y2]
  ): ApplicationX2[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2]] =
    new ApplicationX2[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2]] {
      def application(context: T): F[zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2]] =
        context.append(i1.application(context), i2.application(context))(BuildContent.plus2)
    }
}
