package zsg
abstract class ApplicationX5[F[_, _, _, _, _], T <: Context5[F], I1, I2, I3, I4, I5] {
  def application(context: T): F[I1, I2, I3, I4, I5]
}
object ApplicationX5 {
  implicit def applicationImplicit[F[_, _, _, _, _], T <: Context5[F], I1, I2, I3, I4, I5](implicit i: F[I1, I2, I3, I4, I5]): ApplicationX5[F, T, I1, I2, I3, I4, I5] =
    new ApplicationX5[F, T, I1, I2, I3, I4, I5] {
      def application(context: T): F[I1, I2, I3, I4, I5] = i
    }
  implicit def applicationImplicit2[F[_, _, _, _, _], T <: Context5[F], I1, Y1, I2, Y2, I3, Y3, I4, Y4, I5, Y5](implicit
    i1: ApplicationX5[F, T, I1, I2, I3, I4, I5],
    i2: ApplicationX5[F, T, Y1, Y2, Y3, Y4, Y5]
  ): ApplicationX5[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4], zsg.ZsgTuple2[I5, Y5]] =
    new ApplicationX5[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4], zsg.ZsgTuple2[I5, Y5]] {
      def application(context: T): F[zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4], zsg.ZsgTuple2[I5, Y5]] =
        context.append(i1.application(context), i2.application(context))(BuildContent.plus5)
    }
}
