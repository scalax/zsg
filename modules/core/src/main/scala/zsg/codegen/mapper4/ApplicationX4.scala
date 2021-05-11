package zsg
abstract class ApplicationX4[F[_, _, _, _], T <: Context4[F], I1, I2, I3, I4] {
  def application(context: T): F[I1, I2, I3, I4]
}
object ApplicationX4 {
  implicit def applicationImplicit[F[_, _, _, _], T <: Context4[F], I1, I2, I3, I4](implicit i: F[I1, I2, I3, I4]): ApplicationX4[F, T, I1, I2, I3, I4] =
    new ApplicationX4[F, T, I1, I2, I3, I4] {
      def application(context: T): F[I1, I2, I3, I4] = i
    }
  implicit def applicationImplicit2[F[_, _, _, _], T <: Context4[F], I1, Y1, I2, Y2, I3, Y3, I4, Y4](implicit
    i1: ApplicationX4[F, T, I1, I2, I3, I4],
    i2: ApplicationX4[F, T, Y1, Y2, Y3, Y4]
  ): ApplicationX4[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4]] =
    new ApplicationX4[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4]] {
      def application(context: T): F[zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4]] =
        context.append(i1.application(context), i2.application(context))(BuildContent.plus4)
    }
}
