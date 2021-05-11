package zsg
abstract class ApplicationX2[F[  _   ,  _ ], T <: Context2[F]  , I1  , I2 ] {
  def application(context: T): F[  I1   ,  I2 ]
}
object ApplicationX2 {
    implicit def applicationImplicit[F[  _   ,  _ ], T <: Context2[F]  , I1  , I2 ](implicit i: F[  I1   ,  I2 ]): ApplicationX2[F, T  , I1  , I2 ] =
        new ApplicationX2[F, T  , I1  , I2 ] {
            def application(context: T): F[  I1   ,  I2 ] = i
        }
}
