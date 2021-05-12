package zsg
abstract class ApplicationX12[F[_, _, _, _, _, _, _, _, _, _, _, _], T <: Context12[F], I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] {
  def application(context: T): F[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
}
object ApplicationX12 {
  implicit def applicationImplicit[F[_, _, _, _, _, _, _, _, _, _, _, _], T <: Context12[
    F
  ], I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12](implicit
    i: F[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
  ): ApplicationX12[F, T, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] =
    new ApplicationX12[F, T, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] {
      def application(context: T): F[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] = i
    }
  implicit def applicationImplicit2[F[_, _, _, _, _, _, _, _, _, _, _, _], T <: Context12[
    F
  ], I1, Y1, I2, Y2, I3, Y3, I4, Y4, I5, Y5, I6, Y6, I7, Y7, I8, Y8, I9, Y9, I10, Y10, I11, Y11, I12, Y12](implicit
    i1: ApplicationX12[F, T, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12],
    i2: ApplicationX12[F, T, Y1, Y2, Y3, Y4, Y5, Y6, Y7, Y8, Y9, Y10, Y11, Y12]
  ): ApplicationX12[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4], zsg.ZsgTuple2[
    I5,
    Y5
  ], zsg.ZsgTuple2[
    I6,
    Y6
  ], zsg.ZsgTuple2[I7, Y7], zsg.ZsgTuple2[I8, Y8], zsg.ZsgTuple2[I9, Y9], zsg.ZsgTuple2[I10, Y10], zsg.ZsgTuple2[I11, Y11], zsg.ZsgTuple2[
    I12,
    Y12
  ]] =
    new ApplicationX12[
      F,
      T,
      zsg.ZsgTuple2[I1, Y1],
      zsg.ZsgTuple2[I2, Y2],
      zsg.ZsgTuple2[I3, Y3],
      zsg.ZsgTuple2[I4, Y4],
      zsg.ZsgTuple2[I5, Y5],
      zsg.ZsgTuple2[I6, Y6],
      zsg.ZsgTuple2[I7, Y7],
      zsg.ZsgTuple2[I8, Y8],
      zsg.ZsgTuple2[I9, Y9],
      zsg.ZsgTuple2[I10, Y10],
      zsg.ZsgTuple2[I11, Y11],
      zsg.ZsgTuple2[I12, Y12]
    ] {
      def application(
        context: T
      ): F[zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4], zsg.ZsgTuple2[I5, Y5], zsg.ZsgTuple2[
        I6,
        Y6
      ], zsg.ZsgTuple2[I7, Y7], zsg.ZsgTuple2[I8, Y8], zsg.ZsgTuple2[I9, Y9], zsg.ZsgTuple2[I10, Y10], zsg.ZsgTuple2[
        I11,
        Y11
      ], zsg.ZsgTuple2[I12, Y12]] =
        context.append(i1.application(context), i2.application(context))(BuildContent.plus12)
    }
}
