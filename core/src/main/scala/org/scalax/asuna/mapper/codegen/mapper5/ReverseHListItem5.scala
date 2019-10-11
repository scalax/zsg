package org.scalax.asuna.mapper
class ReverseHListItem5[ E1  ,   E2  ,   E3  ,   E4  ,   E5  ](val head:  E1 ::  E2 ::  E3 ::  E4 ::  E5 ::  HNil) extends AnyVal with Item5[ E1  ,   E2  ,   E3  ,   E4  ,   E5  ] {
override def pull[T](xyy: T): ReverseHListItem6[T  , E1  , E2  , E3  , E4  , E5 ] = new ReverseHListItem6[T  , E1  , E2  , E3  , E4  , E5  ](xyy :: head)
override def leftHead: E1 = head.head
override def leftTail: ReverseHListItem4[ E2  ,   E3  ,   E4  ,   E5  ] = new ReverseHListItem4(head.tail)
override def i1: E1 = head.head
override def i2: E2 = head .tail .head
override def i3: E3 = head .tail  .tail .head
override def i4: E4 = head .tail  .tail  .tail .head
override def i5: E5 = head .tail  .tail  .tail  .tail .head
}
