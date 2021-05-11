package zsg
abstract class ApplicationX10[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context10[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10 ] {
  def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10 ]
}
object ApplicationX10 {
    implicit def applicationImplicit[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context10[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10 ](implicit i: F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10 ]): ApplicationX10[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10 ] =
        new ApplicationX10[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9  , I10 ] {
            def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10 ] = i
        }
}
