package asuna
import scala.language.higherKinds
trait Application1[F[_], X1] {
  def application(context: Context1[F]): F[X1]
}
