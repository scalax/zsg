package zsg
abstract class ApplicationX6[F[_, _, _, _, _, _], T <: Context6[F], I1, I2, I3, I4, I5, I6] {
  def application(context: T): F[I1, I2, I3, I4, I5, I6]
}
object ApplicationX6 {
  implicit def applicationImplicit[F[_, _, _, _, _, _], T <: Context6[F], I1, I2, I3, I4, I5, I6](implicit
    i: F[I1, I2, I3, I4, I5, I6]
  ): ApplicationX6[F, T, I1, I2, I3, I4, I5, I6] =
    new ApplicationX6[F, T, I1, I2, I3, I4, I5, I6] {
      def application(context: T): F[I1, I2, I3, I4, I5, I6] = i
    }
  implicit def applicationImplicit2[F[_, _, _, _, _, _], T <: Context6[F], I1, Y1, I2, Y2, I3, Y3, I4, Y4, I5, Y5, I6, Y6](implicit
    i1: ApplicationX6[F, T, I1, I2, I3, I4, I5, I6],
    i2: ApplicationX6[F, T, Y1, Y2, Y3, Y4, Y5, Y6]
  ): ApplicationX6[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4], zsg.ZsgTuple2[I5, Y5], zsg.ZsgTuple2[I6, Y6]] =
    new ApplicationX6[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4], zsg.ZsgTuple2[I5, Y5], zsg.ZsgTuple2[I6, Y6]] {
      def application(
        context: T
      ): F[zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4], zsg.ZsgTuple2[I5, Y5], zsg.ZsgTuple2[I6, Y6]] =
        context.append(i1.application(context), i2.application(context))(BuildContent.plus6)
    }
}
