package zsg
abstract class Application1[F[_], X1] {
    def application(context: Context1[F]): F[X1]
}
