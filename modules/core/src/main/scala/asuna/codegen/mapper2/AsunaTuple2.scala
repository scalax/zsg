package asuna
import asuna.support.heterogeneous._
final class AsunaTuple2[ E1  ,   E2  ]
(override final val head: E1
, override final val tail: AsunaTuple1[ E2  ]
)
extends HList {
override final type Head = E1
override final type Tail = AsunaTuple1[ E2  ]
final def i1: E1 = head
final def i2: E2 = tail.head
override final type Append[T] =
AsunaTuple3[T  , E1  , E2 ]
override final def ::[T](t: T): Append[T] =
new AsunaTuple3[T  , E1  , E2 ](t, this)
}
