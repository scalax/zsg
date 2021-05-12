package zsg
abstract class ApplicationX19[F[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _], T <: Context19[
  F
], I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] {
  def application(context: T): F[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]
}
object ApplicationX19 {
  implicit def applicationImplicit[F[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _], T <: Context19[
    F
  ], I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19](implicit
    i: F[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]
  ): ApplicationX19[F, T, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] =
    new ApplicationX19[F, T, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] {
      def application(context: T): F[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] = i
    }
  implicit def applicationImplicit2[F[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _], T <: Context19[
    F
  ], I1, Y1, I2, Y2, I3, Y3, I4, Y4, I5, Y5, I6, Y6, I7, Y7, I8, Y8, I9, Y9, I10, Y10, I11, Y11, I12, Y12, I13, Y13, I14, Y14, I15, Y15, I16, Y16, I17, Y17, I18, Y18, I19, Y19](
    implicit
    i1: ApplicationX19[F, T, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19],
    i2: ApplicationX19[F, T, Y1, Y2, Y3, Y4, Y5, Y6, Y7, Y8, Y9, Y10, Y11, Y12, Y13, Y14, Y15, Y16, Y17, Y18, Y19]
  ): ApplicationX19[F, T, zsg.ZsgTuple2[I1, Y1], zsg.ZsgTuple2[I2, Y2], zsg.ZsgTuple2[I3, Y3], zsg.ZsgTuple2[I4, Y4], zsg.ZsgTuple2[
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
  ], zsg.ZsgTuple2[I14, Y14], zsg.ZsgTuple2[I15, Y15], zsg.ZsgTuple2[I16, Y16], zsg.ZsgTuple2[I17, Y17], zsg.ZsgTuple2[
    I18,
    Y18
  ], zsg.ZsgTuple2[I19, Y19]] =
    new ApplicationX19[
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
      zsg.ZsgTuple2[I14, Y14],
      zsg.ZsgTuple2[I15, Y15],
      zsg.ZsgTuple2[I16, Y16],
      zsg.ZsgTuple2[I17, Y17],
      zsg.ZsgTuple2[I18, Y18],
      zsg.ZsgTuple2[I19, Y19]
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
      ], zsg.ZsgTuple2[I14, Y14], zsg.ZsgTuple2[I15, Y15], zsg.ZsgTuple2[I16, Y16], zsg.ZsgTuple2[I17, Y17], zsg.ZsgTuple2[
        I18,
        Y18
      ], zsg.ZsgTuple2[I19, Y19]] =
        context.append(i1.application(context), i2.application(context))(BuildContent.plus19)
    }
}
