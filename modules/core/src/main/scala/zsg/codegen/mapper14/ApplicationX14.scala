package zsg
abstract class ApplicationX14[F[_, _, _, _, _, _, _, _, _, _, _, _, _, _], T <: Context14[
  F
], I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] {
  def application(context: T): F[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
}
object ApplicationX14 {
  implicit def applicationImplicit[F[_, _, _, _, _, _, _, _, _, _, _, _, _, _], T <: Context14[
    F
  ], I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14](implicit
    i: F[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
  ): ApplicationX14[F, T, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] =
    new ApplicationX14[F, T, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] {
      def application(context: T): F[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] = i
    }
  implicit def applicationImplicit2[F[_, _, _, _, _, _, _, _, _, _, _, _, _, _], T <: Context14[
    F
  ], I1, Y1, I2, Y2, I3, Y3, I4, Y4, I5, Y5, I6, Y6, I7, Y7, I8, Y8, I9, Y9, I10, Y10, I11, Y11, I12, Y12, I13, Y13, I14, Y14](implicit
    i1: ApplicationX14[F, T, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14],
    i2: ApplicationX14[F, T, Y1, Y2, Y3, Y4, Y5, Y6, Y7, Y8, Y9, Y10, Y11, Y12, Y13, Y14]
  ): ApplicationX14[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4], zsg.ZsgTuple2[
    I5,
    Y5
  ], zsg.ZsgTuple2[
    I6,
    Y6
  ], zsg.ZsgTuple2[I7, Y7], zsg.ZsgTuple2[I8, Y8], zsg.ZsgTuple2[I9, Y9], zsg.ZsgTuple2[I10, Y10], zsg.ZsgTuple2[I11, Y11], zsg.ZsgTuple2[
    I12,
    Y12
  ], zsg.ZsgTuple2[
    I13,
    Y13
  ], zsg.ZsgTuple2[I14, Y14]] =
    new ApplicationX14[
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
      zsg.ZsgTuple2[I12, Y12],
      zsg.ZsgTuple2[I13, Y13],
      zsg.ZsgTuple2[I14, Y14]
    ] {
      def application(
        context: T
      ): F[zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4], zsg.ZsgTuple2[I5, Y5], zsg.ZsgTuple2[
        I6,
        Y6
      ], zsg.ZsgTuple2[I7, Y7], zsg.ZsgTuple2[I8, Y8], zsg.ZsgTuple2[I9, Y9], zsg.ZsgTuple2[I10, Y10], zsg.ZsgTuple2[
        I11,
        Y11
      ], zsg.ZsgTuple2[I12, Y12], zsg.ZsgTuple2[
        I13,
        Y13
      ], zsg.ZsgTuple2[I14, Y14]] =
        context.append(i1.application(context), i2.application(context))(BuildContent.plus14)
    }
}
