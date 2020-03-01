package asuna
import scala.language.higherKinds
abstract class Application4[F[_  , _  , _  , _ ] , Tag , X1 , X2 , X3 , X4] {
    def application(context: Context4[F]): F[X1 , X2 , X3 , X4]
}
object Application4 {
     def lift[F[_ , _ , _ , _], Tag, X1 , X2 , X3 , X4](appendTag: => AppendTag[Tag])( implicit  app: Application4[F, Tag, X1 , X2 , X3 , X4]): Application4[F, Tag, X1 , X2 , X3 , X4] = app
}
