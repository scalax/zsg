package asuna
import scala.language.higherKinds
trait Application4[F[_  , _  , _  , _ ], Tag  , X1  , X2  , X3  , X4 ] extends Any {
def application(context: Context4[F]): F[X1  , X2  , X3  , X4 ]
}
