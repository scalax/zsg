package asuna
import asuna.support.heterogeneous._
final class AsunaTuple6[ E1  ,   E2  ,   E3  ,   E4  ,   E5  ,   E6  ]
(override final val head: E1
, override final val tail: AsunaTuple5[ E2  ,   E3  ,   E4  ,   E5  ,   E6  ]
)
extends HList {
override final type Head = E1
override final type Tail = AsunaTuple5[ E2  ,   E3  ,   E4  ,   E5  ,   E6  ]
final def i1: E1 = head
final def i2: E2 = tail.head
final def i3: E3 = tail .tail .head
final def i4: E4 = tail .tail  .tail .head
final def i5: E5 = tail .tail  .tail  .tail .head
final def i6: E6 = tail .tail  .tail  .tail  .tail .head
override final type Append[T] =
AsunaTuple7[T  , E1  , E2  , E3  , E4  , E5  , E6 ]
override final def ::[T](t: T): Append[T] =
new AsunaTuple7[T  , E1  , E2  , E3  , E4  , E5  , E6 ](t, this)
}
