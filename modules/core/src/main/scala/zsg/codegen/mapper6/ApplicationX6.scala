package zsg
abstract class ApplicationX6[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context6[F]  , I1  , I2  , I3  , I4  , I5  , I6 ] {
  def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6 ]
}
object ApplicationX6 {
    implicit def applicationImplicit[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context6[F]  , I1  , I2  , I3  , I4  , I5  , I6 ](implicit i: F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6 ]): ApplicationX6[F, T  , I1  , I2  , I3  , I4  , I5  , I6 ] =
        new ApplicationX6[F, T  , I1  , I2  , I3  , I4  , I5  , I6 ] {
            def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6 ] = i
        }
}
