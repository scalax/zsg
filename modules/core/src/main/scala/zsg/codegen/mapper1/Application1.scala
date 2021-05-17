package zsg
abstract class Application1[F[_], T <: Context1[F], I1] {
  def application(context: T): F[I1]
}
object Application1 {
  implicit def applicationImplicit[F[_], T <: Context1[F], I1](implicit i: F[I1]): Application1[F, T, I1] =
    new Application1[F, T, I1] {
      def application(context: T): F[I1] = i
    }
  implicit def applicationImplicit2[F[_], T <: Context1[F], I1, Y1](implicit
    i1: Application1[F, T, I1],
    i2: Application1[F, T, Y1]
  ): Application1[F, T, zsg.ZsgTuple2[I1, Y1]] =
    new Application1[F, T, zsg.ZsgTuple2[I1, Y1]] {
      def application(context: T): F[zsg.ZsgTuple2[I1, Y1]] =
        context.append(i1.application(context), i2.application(context))(BuildContent.plus1)
    }
}
