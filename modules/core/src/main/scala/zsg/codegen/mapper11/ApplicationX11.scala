package zsg
abstract class ApplicationX11[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context11[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11 ] {
  def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11 ]
}
object ApplicationX11 {
    implicit def applicationImplicit[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context11[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11 ](implicit i: F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11 ]): ApplicationX11[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11 ] =
        new ApplicationX11[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10  , I11 ] {
            def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11 ] = i
        }
}
