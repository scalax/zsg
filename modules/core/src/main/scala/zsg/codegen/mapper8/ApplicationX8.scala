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
  implicit def applicationImplicit2[F[_, _, _, _, _, _, _, _], T <: Context8[
    F
  ], I1, Y1, I2, Y2, I3, Y3, I4, Y4, I5, Y5, I6, Y6, I7, Y7, I8, Y8](implicit
    i1: ApplicationX8[F, T, I1, I2, I3, I4, I5, I6, I7, I8],
    i2: ApplicationX8[F, T, Y1, Y2, Y3, Y4, Y5, Y6, Y7, Y8]
  ): ApplicationX8[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4], zsg.ZsgTuple2[
    I5,
    Y5
  ], zsg.ZsgTuple2[
    I6,
    Y6
  ], zsg.ZsgTuple2[I7, Y7], zsg.ZsgTuple2[I8, Y8]] =
    new ApplicationX8[
      F,
      T,
      zsg.ZsgTuple2[I1, Y1],
      zsg.ZsgTuple2[I2, Y2],
      zsg.ZsgTuple2[I3, Y3],
      zsg.ZsgTuple2[I4, Y4],
      zsg.ZsgTuple2[I5, Y5],
      zsg.ZsgTuple2[I6, Y6],
      zsg.ZsgTuple2[I7, Y7],
      zsg.ZsgTuple2[I8, Y8]
    ] {
      def application(
        context: T
      ): F[zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4], zsg.ZsgTuple2[I5, Y5], zsg.ZsgTuple2[
        I6,
        Y6
      ], zsg.ZsgTuple2[I7, Y7], zsg.ZsgTuple2[I8, Y8]] =
        context.append(i1.application(context), i2.application(context))(BuildContent.plus8)
    }
}
