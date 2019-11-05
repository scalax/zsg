package asuna
import scala.language.higherKinds
trait Context6[F[_, _, _, _, _, _]] {
  def append[X1, X2, X3, X4, X5, X6, Y1, Y2, Y3, Y4, Y5, Y6, Z1, Z2, Z3, Z4, Z5, Z6](
    x: F[X1, X2, X3, X4, X5, X6],
    y: F[Y1, Y2, Y3, Y4, Y5, Y6]
  )(p: Plus6[X1, X2, X3, X4, X5, X6, Y1, Y2, Y3, Y4, Y5, Y6, Z1, Z2, Z3, Z4, Z5, Z6]): F[Z1, Z2, Z3, Z4, Z5, Z6]
  def start: F[AsunaTuple0, AsunaTuple0, AsunaTuple0, AsunaTuple0, AsunaTuple0, AsunaTuple0]
}
