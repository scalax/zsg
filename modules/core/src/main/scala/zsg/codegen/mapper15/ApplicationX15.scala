package zsg
abstract class ApplicationX15[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context15[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12  , I13  , I14  , I15 ] {
  def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15 ]
}
object ApplicationX15 {
    implicit def applicationImplicit[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context15[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12  , I13  , I14  , I15 ](implicit i: F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15 ]): ApplicationX15[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12  , I13  , I14  , I15 ] =
        new ApplicationX15[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12  , I13  , I14  , I15 ] {
            def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15 ] = i
        }
}
