package zsg
abstract class ApplicationX7[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]  , I1  , I2  , I3  , I4  , I5  , I6  , I7 ] {
  def application(context: T): F[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7 ]
}
