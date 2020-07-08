package zsg
abstract class ApplicationX1[F[  _ ], T <: Context1[F]  , I1 ] {
  def application(context: T): F[  I1 ]
}
