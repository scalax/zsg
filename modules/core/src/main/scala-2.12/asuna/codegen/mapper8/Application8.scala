package asuna
import scala.language.higherKinds
abstract class Application8[F[_  , _  , _  , _  , _  , _  , _  , _ ] , Tag , X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8] {
    def application(context: Context8[F]): F[X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8]
}
object Application8 {
     def lift[F[_ , _ , _ , _ , _ , _ , _ , _], Tag, X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8](appendTag: => AppendTag[Tag])( implicit  app: Application8[F, Tag, X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8]): Application8[F, Tag, X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8] = app
}
