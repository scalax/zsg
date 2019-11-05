package asuna
import scala.language.higherKinds
trait Application5[F[_, _, _, _, _], X1, X2, X3, X4, X5] {
  def application(context: Context5[F]): F[X1, X2, X3, X4, X5]
}
