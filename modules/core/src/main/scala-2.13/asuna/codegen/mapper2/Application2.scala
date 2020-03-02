package asuna
import scala.language.higherKinds
abstract class Application2[F[_  , _ ] , Tag , X1 , X2] {
    def application(context: Context2[F]): F[X1 , X2]
}
object Application2 {
     def lift[F[_ , _], Tag, X1 , X2](appendTag: => AppendTag[Tag])( implicit  app: Application2[F, Tag, X1 , X2]): Application2[F, Tag, X1 , X2] = app
}
