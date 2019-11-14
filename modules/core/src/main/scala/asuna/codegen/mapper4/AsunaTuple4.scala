package asuna
import asuna.support.heterogeneous._
final class AsunaTuple4[ E1  ,   E2  ,   E3  ,   E4  ]
(override final val head: E1
, override final val tail: AsunaTuple3[ E2  ,   E3  ,   E4  ]
)
extends HList {
override final type Head = E1
override final type Tail = AsunaTuple3[ E2  ,   E3  ,   E4  ]
final def i1: E1 = head
final def i2: E2 = tail.head
final def i3: E3 = tail .tail .head
final def i4: E4 = tail .tail  .tail .head
override final type Append[T] =
AsunaTuple5[T  , E1  , E2  , E3  , E4 ]
override final def ::[T](t: T): Append[T] =
new AsunaTuple5[T  , E1  , E2  , E3  , E4 ](t, this)
}
