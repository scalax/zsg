package zsg
abstract class ApplicationX7[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7 ] {
  def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7 ]
}
object ApplicationX7 {
    implicit def applicationImplicit[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7 ](implicit i: F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7 ]): ApplicationX7[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7 ] =
        new ApplicationX7[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7 ] {
            def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7 ] = i
        }
}
