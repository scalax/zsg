package zsg
abstract class Application3[F[_, _, _], T <: Context3[F], I1, I2, I3] {
  def application(context: T): F[I1, I2, I3]
}
object Application3 {
  implicit def applicationImplicit[F[_, _, _], T <: Context3[F], I1, I2, I3](implicit i: F[I1, I2, I3]): Application3[F, T, I1, I2, I3] =
    new Application3[F, T, I1, I2, I3] {
      def application(context: T): F[I1, I2, I3] = i
    }
  implicit def applicationImplicit2[F[_, _, _], T <: Context3[F], I1, Y1, I2, Y2, I3, Y3](implicit
    i1: Application3[F, T, I1, I2, I3],
    i2: Application3[F, T, Y1, Y2, Y3]
  ): Application3[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3]] =
    new Application3[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3]] {
      def application(context: T): F[zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3]] =
        context.append(i1.application(context), i2.application(context))(BuildContent.plus3)
    }
}
