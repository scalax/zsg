package org.scalax.asuna.mapper.item
import shapeless._
class ReverseHListItem3[ E1  ,   E2  ,   E3  ](val head:  E1 ::  E2 ::  E3 ::  HNil) extends AnyVal with Item3[ E1  ,   E2  ,   E3  ] {
override def pudao[T](xyy: T): ReverseHListItem4[T  , E1  , E2  , E3 ] = new ReverseHListItem4[T  , E1  , E2  , E3  ](xyy :: head)
override def leftHead: E1 = head.head
override def leftTail: ReverseHListItem2[ E2  ,   E3  ] = new ReverseHListItem2(head.tail)
override def i1: E1 = head.head
override def i2: E2 = head .tail .head
override def i3: E3 = head .tail  .tail .head
}
