package asuna
import scala.language.higherKinds
abstract class Application3[F[_, _, _], Tag, X1, X2, X3] {
  def application(context: Context3[F]): F[X1, X2, X3]
}
