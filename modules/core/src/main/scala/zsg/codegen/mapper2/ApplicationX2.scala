package zsg
abstract class ApplicationX2[F[  _   ,  _ ], T <: Context2[F]  , I1  , I2 ] {
  def application(context: T): F[  I1   ,  I2 ]
}
