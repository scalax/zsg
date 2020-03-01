package asuna
import scala.language.higherKinds
abstract class Application1[F[_ ] , Tag , X1] {
    def application(context: Context1[F]): F[X1]
}
object Application1 {
     def lift[F[_], Tag, X1](appendTag: => AppendTag[Tag])( implicit  app: Application1[F, Tag, X1]): Application1[F, Tag, X1] = app
}
