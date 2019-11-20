package asuna
import scala.language.higherKinds
trait Application7[F[_  , _  , _  , _  , _  , _  , _ ], Tag  , X1  , X2  , X3  , X4  , X5  , X6  , X7 ] extends Any {
def application(context: Context7[F]): F[X1  , X2  , X3  , X4  , X5  , X6  , X7 ]
}
