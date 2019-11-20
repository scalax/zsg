package asuna
import scala.language.higherKinds
trait Context1[F[_ ]] extends Any {
def append[X1   , Y1   , Z1 ](
x: F[X1 ],
y: F[Y1 ]
)
(p: Plus1[X1   , Y1   , Z1 ])
: F[Z1 ]
def start: F[AsunaTuple0 ]
}
