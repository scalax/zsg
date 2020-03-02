package asuna
import scala.language.higherKinds
abstract class Application5[F[_  , _  , _  , _  , _ ] , Tag , X1 , X2 , X3 , X4 , X5] {
    def application(context: Context5[F]): F[X1 , X2 , X3 , X4 , X5]
}
object Application5 {
     def lift[F[_ , _ , _ , _ , _], Tag, X1 , X2 , X3 , X4 , X5](appendTag: => AppendTag[Tag])( implicit  app: Application5[F, Tag, X1 , X2 , X3 , X4 , X5]): Application5[F, Tag, X1 , X2 , X3 , X4 , X5] = app
}
