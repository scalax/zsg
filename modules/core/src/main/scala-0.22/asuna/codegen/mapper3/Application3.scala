package asuna
import scala.language.higherKinds
abstract class Application3[F[_  , _  , _ ] , Tag , X1 , X2 , X3] {
    def application(context: Context3[F]): F[X1 , X2 , X3]
}
object Application3 {
     inline  def lift[F[_ , _ , _], Tag, X1 , X2 , X3](appendTag: => AppendTag[Tag])( given  app: Application3[F, Tag, X1 , X2 , X3]): Application3[F, Tag, X1 , X2 , X3] = app
}
