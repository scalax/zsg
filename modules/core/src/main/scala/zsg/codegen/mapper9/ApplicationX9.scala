package zsg
abstract class ApplicationX9[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context9[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9 ] {
  def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9 ]
}
object ApplicationX9 {
    implicit def applicationImplicit[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context9[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9 ](implicit i: F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9 ]): ApplicationX9[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9 ] =
        new ApplicationX9[F, T  , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9 ] {
            def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9 ] = i
        }
}
