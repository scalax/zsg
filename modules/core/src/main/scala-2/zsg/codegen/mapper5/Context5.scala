package zsg
import scala.language.higherKinds
abstract class Context5[F[_, _, _, _, _]] {
  def append[
    X1,
    X2,
    X3,
    X4,
    X5,
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Z1,
    Z2,
    Z3,
    Z4,
    Z5
  ](
    x: F[X1, X2, X3, X4, X5],
    y: F[Y1, Y2, Y3, Y4, Y5]
  )(
    p: Plus5[
      X1,
      X2,
      X3,
      X4,
      X5,
      Y1,
      Y2,
      Y3,
      Y4,
      Y5,
      Z1,
      Z2,
      Z3,
      Z4,
      Z5
    ]
  ): F[Z1, Z2, Z3, Z4, Z5]
  def start: F[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0]
}
