package zsg
abstract class ApplicationX13[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context13[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12  , I13 ] {
  def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13 ]
}
object ApplicationX13 {
    implicit def applicationImplicit[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context13[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12  , I13 ](implicit i: F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13 ]): ApplicationX13[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12  , I13 ] =
        new ApplicationX13[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11  , I12  , I13 ] {
            def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13 ] = i
        }
}
