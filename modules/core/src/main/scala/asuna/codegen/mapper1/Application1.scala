package asuna
import scala.language.higherKinds
abstract class Application1[F[_ ], Tag  , X1 ] {
def application(context: Context1[F]): F[X1 ]
}
