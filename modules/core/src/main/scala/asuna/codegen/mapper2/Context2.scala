package asuna
import scala.language.higherKinds
trait Context2[F[_, _]] extends Any {
  def append[X1, X2, Y1, Y2, Z1, Z2](
    x: F[X1, X2],
    y: F[Y1, Y2]
  )(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): F[Z1, Z2]
  def start: F[AsunaTuple0, AsunaTuple0]
}
