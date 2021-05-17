package zsg
abstract class Application4[F[_, _, _, _], T <: Context4[F], I1, I2, I3, I4] {
  def application(context: T): F[I1, I2, I3, I4]
}
object Application4 {
  implicit def applicationImplicit[F[_, _, _, _], T <: Context4[F], I1, I2, I3, I4](implicit
    i: F[I1, I2, I3, I4]
  ): Application4[F, T, I1, I2, I3, I4] =
    new Application4[F, T, I1, I2, I3, I4] {
      def application(context: T): F[I1, I2, I3, I4] = i
    }
  implicit def applicationImplicit2[F[_, _, _, _], T <: Context4[F], I1, Y1, I2, Y2, I3, Y3, I4, Y4](implicit
    i1: Application4[F, T, I1, I2, I3, I4],
    i2: Application4[F, T, Y1, Y2, Y3, Y4]
  ): Application4[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4]] =
    new Application4[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4]] {
      def application(context: T): F[zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4]] =
        context.append(i1.application(context), i2.application(context))(BuildContent.plus4)
    }
}
