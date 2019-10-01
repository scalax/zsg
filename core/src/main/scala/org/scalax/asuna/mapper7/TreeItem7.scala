package org.scalax.asuna.mapper.item
class TreeItem7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ](val item: org.scalax.asuna.mapper.item.EatValue0  #AddRightItem[T1]  #AddRightItem[T2]  #AddRightItem[T3]  #AddRightItem[T4]  #AddRightItem[T5]  #AddRightItem[T6]  #AddRightItem[T7] ) extends AnyVal with Item7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ] {
override def eat[T](xyy: T): TreeItem8[ T1,  T2,  T3,  T4,  T5,  T6,  T7,  T] = new TreeItem8[ T1,  T2,  T3,  T4,  T5,  T6,  T7,  T](item.addRightItem(xyy))
override def rightHead: T7 = item.dropRightItem
override def rightTail: TreeItem6[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ] = new TreeItem6(item.dropRight)
def i1: T1 = item.item.i1.i1.i1
def i2: T2 = item.item.i1.i1.i2
def i3: T3 = item.item.i1.i2.i1
def i4: T4 = item.item.i1.i2.i2
def i5: T5 = item.item.i2.i1.i1
def i6: T6 = item.item.i2.i1.i2
def i7: T7 = item.item.i2.i2.i1
}
class ReverseTreeItem7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ](val item: org.scalax.asuna.mapper.item.EatValue0  #AddRightItem[T7]  #AddRightItem[T6]  #AddRightItem[T5]  #AddRightItem[T4]  #AddRightItem[T3]  #AddRightItem[T2]  #AddRightItem[T1] ) extends AnyVal with Item7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ] {
override def pudao[T](xyy: T): ReverseTreeItem8[T  , T1  , T2  , T3  , T4  , T5  , T6  , T7 ] = new ReverseTreeItem8[T  , T1  , T2  , T3  , T4  , T5  , T6  , T7 ](item.addRightItem(xyy))
override def leftHead: T1 = item.dropRightItem
override def leftTail: ReverseTreeItem6[ T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ] = new ReverseTreeItem6(item.dropRight)
def i1: T1 = item.item.i2.i2.i1
def i2: T2 = item.item.i2.i1.i2
def i3: T3 = item.item.i2.i1.i1
def i4: T4 = item.item.i1.i2.i2
def i5: T5 = item.item.i1.i2.i1
def i6: T6 = item.item.i1.i1.i2
def i7: T7 = item.item.i1.i1.i1
}
