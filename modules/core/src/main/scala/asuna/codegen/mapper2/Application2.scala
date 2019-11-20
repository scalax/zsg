package asuna
import scala.language.higherKinds
trait Application2[F[_  , _ ], Tag  , X1  , X2 ] extends Any {
def application(context: Context2[F]): F[X1  , X2 ]
}
