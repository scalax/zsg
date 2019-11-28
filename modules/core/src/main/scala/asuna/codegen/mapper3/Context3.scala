package asuna
import scala.language.higherKinds
trait Context3[F[_  , _  , _ ]] extends Any {
def append[X1  , X2  , X3   , Y1  , Y2  , Y3   , Z1  , Z2  , Z3 ](
x: F[X1  , X2  , X3 ],
y: F[Y1  , Y2  , Y3 ]
)
(p: Plus3[X1  , X2  , X3   , Y1  , Y2  , Y3   , Z1  , Z2  , Z3 ])
: F[Z1  , Z2  , Z3 ]
def start: F[AsunaTuple0  , AsunaTuple0  , AsunaTuple0 ]
}
