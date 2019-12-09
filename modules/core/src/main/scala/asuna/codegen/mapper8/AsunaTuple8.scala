package asuna
import asuna.support.heterogeneous._
final class AsunaTuple8[ E1  ,   E2  ,   E3  ,   E4  ,   E5  ,   E6  ,   E7  ,   E8  ]
(override final val head: E1
, override final val tail: AsunaTuple7[ E2  ,   E3  ,   E4  ,   E5  ,   E6  ,   E7  ,   E8  ]
)
extends HList {
override final type Head = E1
override final type Tail = AsunaTuple7[ E2  ,   E3  ,   E4  ,   E5  ,   E6  ,   E7  ,   E8  ]
final def i1: E1 = head
final def i2: E2 = tail.head
final def i3: E3 = tail .tail .head
final def i4: E4 = tail .tail  .tail .head
final def i5: E5 = tail .tail  .tail  .tail .head
final def i6: E6 = tail .tail  .tail  .tail  .tail .head
final def i7: E7 = tail .tail  .tail  .tail  .tail  .tail .head
final def i8: E8 = tail .tail  .tail  .tail  .tail  .tail  .tail .head
override final type Append[T] =
T :: AsunaTuple8[ E1  ,   E2  ,   E3  ,   E4  ,   E5  ,   E6  ,   E7  ,   E8  ]
override final def ::[T](t: T): Append[T] =
t :: this
}
