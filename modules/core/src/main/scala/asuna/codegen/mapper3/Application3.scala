package asuna
import scala.language.higherKinds
trait Application3[F[_  , _  , _ ], Tag  , X1  , X2  , X3 ] extends Any {
def application(context: Context3[F]): F[X1  , X2  , X3 ]
}
