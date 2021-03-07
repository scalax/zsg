package zsg
abstract class ApplicationX1[F[  _ ], T <: Context1[F]  , I1 ] {
  def application(context: T): F[  I1 ]
}
object ApplicationX1 {
    implicit def applicationImplicit[F[  _ ], T <: Context1[F]  , I1 ](implicit i: F[  I1 ]): ApplicationX1[F, T  , I1 ] =
        new ApplicationX1[F, T  , I1 ] {
            def application(context: T): F[  I1 ] = i
        }
}
