package asuna
abstract class Application7[F[_ , _ , _ , _ , _ , _ , _], X1 , X2 , X3 , X4 , X5 , X6 , X7] {
    def application(context: Context7[F]): F[X1 , X2 , X3 , X4 , X5 , X6 , X7]
}
