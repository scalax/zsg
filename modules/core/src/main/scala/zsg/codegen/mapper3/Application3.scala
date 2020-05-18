package zsg
abstract class Application3[F[_ , _ , _], X1 , X2 , X3] {
    def application(context: Context3[F]): F[X1 , X2 , X3]
}
