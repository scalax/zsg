package asuna
import scala.language.higherKinds
abstract class Application7[F[_  , _  , _  , _  , _  , _  , _ ] , Tag , X1 , X2 , X3 , X4 , X5 , X6 , X7] {
    def application(context: Context7[F]): F[X1 , X2 , X3 , X4 , X5 , X6 , X7]
}
object Application7 {
     def lift[F[_ , _ , _ , _ , _ , _ , _], Tag, X1 , X2 , X3 , X4 , X5 , X6 , X7](appendTag: => AppendTag[Tag])( implicit  app: Application7[F, Tag, X1 , X2 , X3 , X4 , X5 , X6 , X7]): Application7[F, Tag, X1 , X2 , X3 , X4 , X5 , X6 , X7] = app
}
