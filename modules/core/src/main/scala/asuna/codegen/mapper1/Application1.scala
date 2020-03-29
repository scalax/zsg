package asuna
abstract class Application1[F[_] , Tag , X1] {
    def application(context: Context1[F]): F[X1]
}
