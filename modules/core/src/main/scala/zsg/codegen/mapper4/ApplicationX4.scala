package zsg
abstract class ApplicationX4[F[  _   ,  _   ,  _   ,  _ ], T <: Context4[F]  , I1  , I2  , I3  , I4 ] {
  def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4 ]
}
