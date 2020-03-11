package asuna
abstract class Application5[F[_ , _ , _ , _ , _] , Tag , X1 , X2 , X3 , X4 , X5] {
    def application(context: Context5[F]): F[X1 , X2 , X3 , X4 , X5]
}
