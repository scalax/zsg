package asuna
import scala.language.higherKinds
abstract class Application4[F[_  , _  , _  , _ ] , Tag , X1 , X2 , X3 , X4] {
    def application(context: Context4[F]): F[X1 , X2 , X3 , X4]
}
