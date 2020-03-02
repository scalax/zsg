package asuna
import scala.language.higherKinds
abstract class Context4[F[_ , _ , _ , _]] {
    def append[
        X1 , X2 , X3 , X4,
        Y1 , Y2 , Y3 , Y4,
        Z1 , Z2 , Z3 , Z4
    ](
        x: F[X1 , X2 , X3 , X4],
        y: F[Y1 , Y2 , Y3 , Y4]
    )(p: Plus4[
        X1 , X2 , X3 , X4,
        Y1 , Y2 , Y3 , Y4,
        Z1 , Z2 , Z3 , Z4
    ]): F[Z1 , Z2 , Z3 , Z4]
    def start: F[AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0]
}
