package asuna
import scala.language.higherKinds
trait Application1[F[_], Tag, X1] extends Any {
  def application(context: Context1[F]): F[X1]
}
