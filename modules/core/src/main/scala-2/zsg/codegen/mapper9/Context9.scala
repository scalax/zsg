package zsg
import scala.language.higherKinds
abstract class Context9[F[_, _, _, _, _, _, _, _, _]] {
  def append[
    X1,
    X2,
    X3,
    X4,
    X5,
    X6,
    X7,
    X8,
    X9,
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Y7,
    Y8,
    Y9,
    Z1,
    Z2,
    Z3,
    Z4,
    Z5,
    Z6,
    Z7,
    Z8,
    Z9
  ](
    x: F[X1, X2, X3, X4, X5, X6, X7, X8, X9],
    y: F[Y1, Y2, Y3, Y4, Y5, Y6, Y7, Y8, Y9]
  )(
    p: Plus9[
      X1,
      X2,
      X3,
      X4,
      X5,
      X6,
      X7,
      X8,
      X9,
      Y1,
      Y2,
      Y3,
      Y4,
      Y5,
      Y6,
      Y7,
      Y8,
      Y9,
      Z1,
      Z2,
      Z3,
      Z4,
      Z5,
      Z6,
      Z7,
      Z8,
      Z9
    ]
  ): F[Z1, Z2, Z3, Z4, Z5, Z6, Z7, Z8, Z9]
}
