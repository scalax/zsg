package org.scalax.asuna.ii.item
trait XyyItem0 extends Any {
  def eat[T](xyy: T): XyyItem1[T] = new XyyItem1[T] {
    override def i1: T = xyy
  }
  def pudao[T](xyy: T): XyyItem1[T] = new XyyItem1[T] {
    override def i1: T = xyy
  }
  def eatToTuple[T](xyy: T): Tuple1[T]   = Tuple1(xyy)
  def pudaoToTuple[T](xyy: T): Tuple1[T] = Tuple1(xyy)
}
object XyyItem0 extends XyyItem0
trait XyyItem1[E1] extends Any {
  self =>
  def i1: E1
  def leftHead: E1        = self.i1
  def leftTail: XyyItem0  = XyyItem0
  def rightHead: E1       = self.i1
  def rightTail: XyyItem0 = XyyItem0
  def eat[T](xyy: T): XyyItem2[E1, T] = new XyyItem2[E1, T] {
    override def i1: E1 = self.i1
    override def i2: T  = xyy
  }
  def pudao[T](xyy: T): XyyItem2[T, E1] = new XyyItem2[T, E1] {
    override def i1: T  = xyy
    override def i2: E1 = self.i1
  }
  def eatToTuple[T](xyy: T): Tuple2[E1, T]   = (self.i1, xyy)
  def pudaoToTuple[T](xyy: T): Tuple2[T, E1] = (xyy, self.i1)
}
trait XyyItem2[E1, E2] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def leftHead: E1 = self.i1
  def leftTail: XyyItem1[E2] = new XyyItem1[E2] {
    def i1: E2 = self.i2
  }
  def rightHead: E2 = self.i2
  def rightTail: XyyItem1[E1] = new XyyItem1[E1] {
    def i1: E1 = self.i1
  }
  def eat[T](xyy: T): XyyItem3[E1, E2, T] = new XyyItem3[E1, E2, T] {
    override def i1: E1 = self.i1
    override def i2: E2 = self.i2
    override def i3: T  = xyy
  }
  def pudao[T](xyy: T): XyyItem3[T, E1, E2] = new XyyItem3[T, E1, E2] {
    override def i1: T  = xyy
    override def i2: E1 = self.i1
    override def i3: E2 = self.i2
  }
  def eatToTuple[T](xyy: T): Tuple3[E1, E2, T]   = (self.i1, self.i2, xyy)
  def pudaoToTuple[T](xyy: T): Tuple3[T, E1, E2] = (xyy, self.i1, self.i2)
  def leftTuple: Tuple1[E2]                      = Tuple1(self.i2)
  def rightTuple: Tuple1[E1]                     = Tuple1(self.i1)
}
trait XyyItem3[E1, E2, E3] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def leftHead: E1 = self.i1
  def leftTail: XyyItem2[E2, E3] = new XyyItem2[E2, E3] {
    def i1: E2 = self.i2
    def i2: E3 = self.i3
  }
  def rightHead: E3 = self.i3
  def rightTail: XyyItem2[E1, E2] = new XyyItem2[E1, E2] {
    def i1: E1 = self.i1
    def i2: E2 = self.i2
  }
  def eat[T](xyy: T): XyyItem4[E1, E2, E3, T] = new XyyItem4[E1, E2, E3, T] {
    override def i1: E1 = self.i1
    override def i2: E2 = self.i2
    override def i3: E3 = self.i3
    override def i4: T  = xyy
  }
  def pudao[T](xyy: T): XyyItem4[T, E1, E2, E3] = new XyyItem4[T, E1, E2, E3] {
    override def i1: T  = xyy
    override def i2: E1 = self.i1
    override def i3: E2 = self.i2
    override def i4: E3 = self.i3
  }
  def eatToTuple[T](xyy: T): Tuple4[E1, E2, E3, T]   = (self.i1, self.i2, self.i3, xyy)
  def pudaoToTuple[T](xyy: T): Tuple4[T, E1, E2, E3] = (xyy, self.i1, self.i2, self.i3)
  def leftTuple: Tuple2[E2, E3]                      = Tuple2(self.i2, self.i3)
  def rightTuple: Tuple2[E1, E2]                     = Tuple2(self.i1, self.i2)
}
trait XyyItem4[E1, E2, E3, E4] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def leftHead: E1 = self.i1
  def leftTail: XyyItem3[E2, E3, E4] = new XyyItem3[E2, E3, E4] {
    def i1: E2 = self.i2
    def i2: E3 = self.i3
    def i3: E4 = self.i4
  }
  def rightHead: E4 = self.i4
  def rightTail: XyyItem3[E1, E2, E3] = new XyyItem3[E1, E2, E3] {
    def i1: E1 = self.i1
    def i2: E2 = self.i2
    def i3: E3 = self.i3
  }
  def eat[T](xyy: T): XyyItem5[E1, E2, E3, E4, T] = new XyyItem5[E1, E2, E3, E4, T] {
    override def i1: E1 = self.i1
    override def i2: E2 = self.i2
    override def i3: E3 = self.i3
    override def i4: E4 = self.i4
    override def i5: T  = xyy
  }
  def pudao[T](xyy: T): XyyItem5[T, E1, E2, E3, E4] = new XyyItem5[T, E1, E2, E3, E4] {
    override def i1: T  = xyy
    override def i2: E1 = self.i1
    override def i3: E2 = self.i2
    override def i4: E3 = self.i3
    override def i5: E4 = self.i4
  }
  def eatToTuple[T](xyy: T): Tuple5[E1, E2, E3, E4, T]   = (self.i1, self.i2, self.i3, self.i4, xyy)
  def pudaoToTuple[T](xyy: T): Tuple5[T, E1, E2, E3, E4] = (xyy, self.i1, self.i2, self.i3, self.i4)
  def leftTuple: Tuple3[E2, E3, E4]                      = Tuple3(self.i2, self.i3, self.i4)
  def rightTuple: Tuple3[E1, E2, E3]                     = Tuple3(self.i1, self.i2, self.i3)
}
trait XyyItem5[E1, E2, E3, E4, E5] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def leftHead: E1 = self.i1
  def leftTail: XyyItem4[E2, E3, E4, E5] = new XyyItem4[E2, E3, E4, E5] {
    def i1: E2 = self.i2
    def i2: E3 = self.i3
    def i3: E4 = self.i4
    def i4: E5 = self.i5
  }
  def rightHead: E5 = self.i5
  def rightTail: XyyItem4[E1, E2, E3, E4] = new XyyItem4[E1, E2, E3, E4] {
    def i1: E1 = self.i1
    def i2: E2 = self.i2
    def i3: E3 = self.i3
    def i4: E4 = self.i4
  }
  def eat[T](xyy: T): XyyItem6[E1, E2, E3, E4, E5, T] = new XyyItem6[E1, E2, E3, E4, E5, T] {
    override def i1: E1 = self.i1
    override def i2: E2 = self.i2
    override def i3: E3 = self.i3
    override def i4: E4 = self.i4
    override def i5: E5 = self.i5
    override def i6: T  = xyy
  }
  def pudao[T](xyy: T): XyyItem6[T, E1, E2, E3, E4, E5] = new XyyItem6[T, E1, E2, E3, E4, E5] {
    override def i1: T  = xyy
    override def i2: E1 = self.i1
    override def i3: E2 = self.i2
    override def i4: E3 = self.i3
    override def i5: E4 = self.i4
    override def i6: E5 = self.i5
  }
  def eatToTuple[T](xyy: T): Tuple6[E1, E2, E3, E4, E5, T]   = (self.i1, self.i2, self.i3, self.i4, self.i5, xyy)
  def pudaoToTuple[T](xyy: T): Tuple6[T, E1, E2, E3, E4, E5] = (xyy, self.i1, self.i2, self.i3, self.i4, self.i5)
  def leftTuple: Tuple4[E2, E3, E4, E5]                      = Tuple4(self.i2, self.i3, self.i4, self.i5)
  def rightTuple: Tuple4[E1, E2, E3, E4]                     = Tuple4(self.i1, self.i2, self.i3, self.i4)
}
trait XyyItem6[E1, E2, E3, E4, E5, E6] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def leftHead: E1 = self.i1
  def leftTail: XyyItem5[E2, E3, E4, E5, E6] = new XyyItem5[E2, E3, E4, E5, E6] {
    def i1: E2 = self.i2
    def i2: E3 = self.i3
    def i3: E4 = self.i4
    def i4: E5 = self.i5
    def i5: E6 = self.i6
  }
  def rightHead: E6 = self.i6
  def rightTail: XyyItem5[E1, E2, E3, E4, E5] = new XyyItem5[E1, E2, E3, E4, E5] {
    def i1: E1 = self.i1
    def i2: E2 = self.i2
    def i3: E3 = self.i3
    def i4: E4 = self.i4
    def i5: E5 = self.i5
  }
  def eat[T](xyy: T): XyyItem7[E1, E2, E3, E4, E5, E6, T] = new XyyItem7[E1, E2, E3, E4, E5, E6, T] {
    override def i1: E1 = self.i1
    override def i2: E2 = self.i2
    override def i3: E3 = self.i3
    override def i4: E4 = self.i4
    override def i5: E5 = self.i5
    override def i6: E6 = self.i6
    override def i7: T  = xyy
  }
  def pudao[T](xyy: T): XyyItem7[T, E1, E2, E3, E4, E5, E6] = new XyyItem7[T, E1, E2, E3, E4, E5, E6] {
    override def i1: T  = xyy
    override def i2: E1 = self.i1
    override def i3: E2 = self.i2
    override def i4: E3 = self.i3
    override def i5: E4 = self.i4
    override def i6: E5 = self.i5
    override def i7: E6 = self.i6
  }
  def eatToTuple[T](xyy: T): Tuple7[E1, E2, E3, E4, E5, E6, T]   = (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, xyy)
  def pudaoToTuple[T](xyy: T): Tuple7[T, E1, E2, E3, E4, E5, E6] = (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6)
  def leftTuple: Tuple5[E2, E3, E4, E5, E6]                      = Tuple5(self.i2, self.i3, self.i4, self.i5, self.i6)
  def rightTuple: Tuple5[E1, E2, E3, E4, E5]                     = Tuple5(self.i1, self.i2, self.i3, self.i4, self.i5)
}
trait XyyItem7[E1, E2, E3, E4, E5, E6, E7] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def leftHead: E1 = self.i1
  def leftTail: XyyItem6[E2, E3, E4, E5, E6, E7] = new XyyItem6[E2, E3, E4, E5, E6, E7] {
    def i1: E2 = self.i2
    def i2: E3 = self.i3
    def i3: E4 = self.i4
    def i4: E5 = self.i5
    def i5: E6 = self.i6
    def i6: E7 = self.i7
  }
  def rightHead: E7 = self.i7
  def rightTail: XyyItem6[E1, E2, E3, E4, E5, E6] = new XyyItem6[E1, E2, E3, E4, E5, E6] {
    def i1: E1 = self.i1
    def i2: E2 = self.i2
    def i3: E3 = self.i3
    def i4: E4 = self.i4
    def i5: E5 = self.i5
    def i6: E6 = self.i6
  }
  def eat[T](xyy: T): XyyItem8[E1, E2, E3, E4, E5, E6, E7, T] = new XyyItem8[E1, E2, E3, E4, E5, E6, E7, T] {
    override def i1: E1 = self.i1
    override def i2: E2 = self.i2
    override def i3: E3 = self.i3
    override def i4: E4 = self.i4
    override def i5: E5 = self.i5
    override def i6: E6 = self.i6
    override def i7: E7 = self.i7
    override def i8: T  = xyy
  }
  def pudao[T](xyy: T): XyyItem8[T, E1, E2, E3, E4, E5, E6, E7] = new XyyItem8[T, E1, E2, E3, E4, E5, E6, E7] {
    override def i1: T  = xyy
    override def i2: E1 = self.i1
    override def i3: E2 = self.i2
    override def i4: E3 = self.i3
    override def i5: E4 = self.i4
    override def i6: E5 = self.i5
    override def i7: E6 = self.i6
    override def i8: E7 = self.i7
  }
  def eatToTuple[T](xyy: T): Tuple8[E1, E2, E3, E4, E5, E6, E7, T]   = (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, xyy)
  def pudaoToTuple[T](xyy: T): Tuple8[T, E1, E2, E3, E4, E5, E6, E7] = (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7)
  def leftTuple: Tuple6[E2, E3, E4, E5, E6, E7]                      = Tuple6(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7)
  def rightTuple: Tuple6[E1, E2, E3, E4, E5, E6]                     = Tuple6(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6)
}
trait XyyItem8[E1, E2, E3, E4, E5, E6, E7, E8] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def leftHead: E1 = self.i1
  def leftTail: XyyItem7[E2, E3, E4, E5, E6, E7, E8] = new XyyItem7[E2, E3, E4, E5, E6, E7, E8] {
    def i1: E2 = self.i2
    def i2: E3 = self.i3
    def i3: E4 = self.i4
    def i4: E5 = self.i5
    def i5: E6 = self.i6
    def i6: E7 = self.i7
    def i7: E8 = self.i8
  }
  def rightHead: E8 = self.i8
  def rightTail: XyyItem7[E1, E2, E3, E4, E5, E6, E7] = new XyyItem7[E1, E2, E3, E4, E5, E6, E7] {
    def i1: E1 = self.i1
    def i2: E2 = self.i2
    def i3: E3 = self.i3
    def i4: E4 = self.i4
    def i5: E5 = self.i5
    def i6: E6 = self.i6
    def i7: E7 = self.i7
  }
  def eat[T](xyy: T): XyyItem9[E1, E2, E3, E4, E5, E6, E7, E8, T] = new XyyItem9[E1, E2, E3, E4, E5, E6, E7, E8, T] {
    override def i1: E1 = self.i1
    override def i2: E2 = self.i2
    override def i3: E3 = self.i3
    override def i4: E4 = self.i4
    override def i5: E5 = self.i5
    override def i6: E6 = self.i6
    override def i7: E7 = self.i7
    override def i8: E8 = self.i8
    override def i9: T  = xyy
  }
  def pudao[T](xyy: T): XyyItem9[T, E1, E2, E3, E4, E5, E6, E7, E8] = new XyyItem9[T, E1, E2, E3, E4, E5, E6, E7, E8] {
    override def i1: T  = xyy
    override def i2: E1 = self.i1
    override def i3: E2 = self.i2
    override def i4: E3 = self.i3
    override def i5: E4 = self.i4
    override def i6: E5 = self.i5
    override def i7: E6 = self.i6
    override def i8: E7 = self.i7
    override def i9: E8 = self.i8
  }
  def eatToTuple[T](xyy: T): Tuple9[E1, E2, E3, E4, E5, E6, E7, E8, T]   = (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, xyy)
  def pudaoToTuple[T](xyy: T): Tuple9[T, E1, E2, E3, E4, E5, E6, E7, E8] = (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8)
  def leftTuple: Tuple7[E2, E3, E4, E5, E6, E7, E8]                      = Tuple7(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8)
  def rightTuple: Tuple7[E1, E2, E3, E4, E5, E6, E7]                     = Tuple7(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7)
}
trait XyyItem9[E1, E2, E3, E4, E5, E6, E7, E8, E9] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def leftHead: E1 = self.i1
  def leftTail: XyyItem8[E2, E3, E4, E5, E6, E7, E8, E9] = new XyyItem8[E2, E3, E4, E5, E6, E7, E8, E9] {
    def i1: E2 = self.i2
    def i2: E3 = self.i3
    def i3: E4 = self.i4
    def i4: E5 = self.i5
    def i5: E6 = self.i6
    def i6: E7 = self.i7
    def i7: E8 = self.i8
    def i8: E9 = self.i9
  }
  def rightHead: E9 = self.i9
  def rightTail: XyyItem8[E1, E2, E3, E4, E5, E6, E7, E8] = new XyyItem8[E1, E2, E3, E4, E5, E6, E7, E8] {
    def i1: E1 = self.i1
    def i2: E2 = self.i2
    def i3: E3 = self.i3
    def i4: E4 = self.i4
    def i5: E5 = self.i5
    def i6: E6 = self.i6
    def i7: E7 = self.i7
    def i8: E8 = self.i8
  }
  def eat[T](xyy: T): XyyItem10[E1, E2, E3, E4, E5, E6, E7, E8, E9, T] = new XyyItem10[E1, E2, E3, E4, E5, E6, E7, E8, E9, T] {
    override def i1: E1 = self.i1
    override def i2: E2 = self.i2
    override def i3: E3 = self.i3
    override def i4: E4 = self.i4
    override def i5: E5 = self.i5
    override def i6: E6 = self.i6
    override def i7: E7 = self.i7
    override def i8: E8 = self.i8
    override def i9: E9 = self.i9
    override def i10: T = xyy
  }
  def pudao[T](xyy: T): XyyItem10[T, E1, E2, E3, E4, E5, E6, E7, E8, E9] = new XyyItem10[T, E1, E2, E3, E4, E5, E6, E7, E8, E9] {
    override def i1: T   = xyy
    override def i2: E1  = self.i1
    override def i3: E2  = self.i2
    override def i4: E3  = self.i3
    override def i5: E4  = self.i4
    override def i6: E5  = self.i5
    override def i7: E6  = self.i6
    override def i8: E7  = self.i7
    override def i9: E8  = self.i8
    override def i10: E9 = self.i9
  }
  def eatToTuple[T](xyy: T): Tuple10[E1, E2, E3, E4, E5, E6, E7, E8, E9, T]   = (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, xyy)
  def pudaoToTuple[T](xyy: T): Tuple10[T, E1, E2, E3, E4, E5, E6, E7, E8, E9] = (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9)
  def leftTuple: Tuple8[E2, E3, E4, E5, E6, E7, E8, E9]                       = Tuple8(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9)
  def rightTuple: Tuple8[E1, E2, E3, E4, E5, E6, E7, E8]                      = Tuple8(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8)
}
trait XyyItem10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def i10: E10
  def leftHead: E1 = self.i1
  def leftTail: XyyItem9[E2, E3, E4, E5, E6, E7, E8, E9, E10] = new XyyItem9[E2, E3, E4, E5, E6, E7, E8, E9, E10] {
    def i1: E2  = self.i2
    def i2: E3  = self.i3
    def i3: E4  = self.i4
    def i4: E5  = self.i5
    def i5: E6  = self.i6
    def i6: E7  = self.i7
    def i7: E8  = self.i8
    def i8: E9  = self.i9
    def i9: E10 = self.i10
  }
  def rightHead: E10 = self.i10
  def rightTail: XyyItem9[E1, E2, E3, E4, E5, E6, E7, E8, E9] = new XyyItem9[E1, E2, E3, E4, E5, E6, E7, E8, E9] {
    def i1: E1 = self.i1
    def i2: E2 = self.i2
    def i3: E3 = self.i3
    def i4: E4 = self.i4
    def i5: E5 = self.i5
    def i6: E6 = self.i6
    def i7: E7 = self.i7
    def i8: E8 = self.i8
    def i9: E9 = self.i9
  }
  def eat[T](xyy: T): XyyItem11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, T] = new XyyItem11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, T] {
    override def i1: E1   = self.i1
    override def i2: E2   = self.i2
    override def i3: E3   = self.i3
    override def i4: E4   = self.i4
    override def i5: E5   = self.i5
    override def i6: E6   = self.i6
    override def i7: E7   = self.i7
    override def i8: E8   = self.i8
    override def i9: E9   = self.i9
    override def i10: E10 = self.i10
    override def i11: T   = xyy
  }
  def pudao[T](xyy: T): XyyItem11[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] = new XyyItem11[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] {
    override def i1: T    = xyy
    override def i2: E1   = self.i1
    override def i3: E2   = self.i2
    override def i4: E3   = self.i3
    override def i5: E4   = self.i4
    override def i6: E5   = self.i5
    override def i7: E6   = self.i6
    override def i8: E7   = self.i7
    override def i9: E8   = self.i8
    override def i10: E9  = self.i9
    override def i11: E10 = self.i10
  }
  def eatToTuple[T](xyy: T): Tuple11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, T] =
    (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, xyy)
  def pudaoToTuple[T](xyy: T): Tuple11[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] =
    (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10)
  def leftTuple: Tuple9[E2, E3, E4, E5, E6, E7, E8, E9, E10] = Tuple9(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10)
  def rightTuple: Tuple9[E1, E2, E3, E4, E5, E6, E7, E8, E9] = Tuple9(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9)
}
trait XyyItem11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def i10: E10
  def i11: E11
  def leftHead: E1 = self.i1
  def leftTail: XyyItem10[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] = new XyyItem10[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] {
    def i1: E2   = self.i2
    def i2: E3   = self.i3
    def i3: E4   = self.i4
    def i4: E5   = self.i5
    def i5: E6   = self.i6
    def i6: E7   = self.i7
    def i7: E8   = self.i8
    def i8: E9   = self.i9
    def i9: E10  = self.i10
    def i10: E11 = self.i11
  }
  def rightHead: E11 = self.i11
  def rightTail: XyyItem10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] = new XyyItem10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] {
    def i1: E1   = self.i1
    def i2: E2   = self.i2
    def i3: E3   = self.i3
    def i4: E4   = self.i4
    def i5: E5   = self.i5
    def i6: E6   = self.i6
    def i7: E7   = self.i7
    def i8: E8   = self.i8
    def i9: E9   = self.i9
    def i10: E10 = self.i10
  }
  def eat[T](xyy: T): XyyItem12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, T] = new XyyItem12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, T] {
    override def i1: E1   = self.i1
    override def i2: E2   = self.i2
    override def i3: E3   = self.i3
    override def i4: E4   = self.i4
    override def i5: E5   = self.i5
    override def i6: E6   = self.i6
    override def i7: E7   = self.i7
    override def i8: E8   = self.i8
    override def i9: E9   = self.i9
    override def i10: E10 = self.i10
    override def i11: E11 = self.i11
    override def i12: T   = xyy
  }
  def pudao[T](xyy: T): XyyItem12[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] = new XyyItem12[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] {
    override def i1: T    = xyy
    override def i2: E1   = self.i1
    override def i3: E2   = self.i2
    override def i4: E3   = self.i3
    override def i5: E4   = self.i4
    override def i6: E5   = self.i5
    override def i7: E6   = self.i6
    override def i8: E7   = self.i7
    override def i9: E8   = self.i8
    override def i10: E9  = self.i9
    override def i11: E10 = self.i10
    override def i12: E11 = self.i11
  }
  def eatToTuple[T](xyy: T): Tuple12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, T] =
    (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, xyy)
  def pudaoToTuple[T](xyy: T): Tuple12[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] =
    (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11)
  def leftTuple: Tuple10[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] = Tuple10(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11)
  def rightTuple: Tuple10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] = Tuple10(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10)
}
trait XyyItem12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def i10: E10
  def i11: E11
  def i12: E12
  def leftHead: E1 = self.i1
  def leftTail: XyyItem11[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] = new XyyItem11[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] {
    def i1: E2   = self.i2
    def i2: E3   = self.i3
    def i3: E4   = self.i4
    def i4: E5   = self.i5
    def i5: E6   = self.i6
    def i6: E7   = self.i7
    def i7: E8   = self.i8
    def i8: E9   = self.i9
    def i9: E10  = self.i10
    def i10: E11 = self.i11
    def i11: E12 = self.i12
  }
  def rightHead: E12 = self.i12
  def rightTail: XyyItem11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] = new XyyItem11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] {
    def i1: E1   = self.i1
    def i2: E2   = self.i2
    def i3: E3   = self.i3
    def i4: E4   = self.i4
    def i5: E5   = self.i5
    def i6: E6   = self.i6
    def i7: E7   = self.i7
    def i8: E8   = self.i8
    def i9: E9   = self.i9
    def i10: E10 = self.i10
    def i11: E11 = self.i11
  }
  def eat[T](xyy: T): XyyItem13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, T] = new XyyItem13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, T] {
    override def i1: E1   = self.i1
    override def i2: E2   = self.i2
    override def i3: E3   = self.i3
    override def i4: E4   = self.i4
    override def i5: E5   = self.i5
    override def i6: E6   = self.i6
    override def i7: E7   = self.i7
    override def i8: E8   = self.i8
    override def i9: E9   = self.i9
    override def i10: E10 = self.i10
    override def i11: E11 = self.i11
    override def i12: E12 = self.i12
    override def i13: T   = xyy
  }
  def pudao[T](xyy: T): XyyItem13[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] = new XyyItem13[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] {
    override def i1: T    = xyy
    override def i2: E1   = self.i1
    override def i3: E2   = self.i2
    override def i4: E3   = self.i3
    override def i5: E4   = self.i4
    override def i6: E5   = self.i5
    override def i7: E6   = self.i6
    override def i8: E7   = self.i7
    override def i9: E8   = self.i8
    override def i10: E9  = self.i9
    override def i11: E10 = self.i10
    override def i12: E11 = self.i11
    override def i13: E12 = self.i12
  }
  def eatToTuple[T](xyy: T): Tuple13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, T] =
    (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, xyy)
  def pudaoToTuple[T](xyy: T): Tuple13[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] =
    (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12)
  def leftTuple: Tuple11[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] =
    Tuple11(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12)
  def rightTuple: Tuple11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] =
    Tuple11(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11)
}
trait XyyItem13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def i10: E10
  def i11: E11
  def i12: E12
  def i13: E13
  def leftHead: E1 = self.i1
  def leftTail: XyyItem12[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] = new XyyItem12[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] {
    def i1: E2   = self.i2
    def i2: E3   = self.i3
    def i3: E4   = self.i4
    def i4: E5   = self.i5
    def i5: E6   = self.i6
    def i6: E7   = self.i7
    def i7: E8   = self.i8
    def i8: E9   = self.i9
    def i9: E10  = self.i10
    def i10: E11 = self.i11
    def i11: E12 = self.i12
    def i12: E13 = self.i13
  }
  def rightHead: E13 = self.i13
  def rightTail: XyyItem12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] = new XyyItem12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] {
    def i1: E1   = self.i1
    def i2: E2   = self.i2
    def i3: E3   = self.i3
    def i4: E4   = self.i4
    def i5: E5   = self.i5
    def i6: E6   = self.i6
    def i7: E7   = self.i7
    def i8: E8   = self.i8
    def i9: E9   = self.i9
    def i10: E10 = self.i10
    def i11: E11 = self.i11
    def i12: E12 = self.i12
  }
  def eat[T](xyy: T): XyyItem14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, T] = new XyyItem14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, T] {
    override def i1: E1   = self.i1
    override def i2: E2   = self.i2
    override def i3: E3   = self.i3
    override def i4: E4   = self.i4
    override def i5: E5   = self.i5
    override def i6: E6   = self.i6
    override def i7: E7   = self.i7
    override def i8: E8   = self.i8
    override def i9: E9   = self.i9
    override def i10: E10 = self.i10
    override def i11: E11 = self.i11
    override def i12: E12 = self.i12
    override def i13: E13 = self.i13
    override def i14: T   = xyy
  }
  def pudao[T](xyy: T): XyyItem14[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] = new XyyItem14[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] {
    override def i1: T    = xyy
    override def i2: E1   = self.i1
    override def i3: E2   = self.i2
    override def i4: E3   = self.i3
    override def i5: E4   = self.i4
    override def i6: E5   = self.i5
    override def i7: E6   = self.i6
    override def i8: E7   = self.i7
    override def i9: E8   = self.i8
    override def i10: E9  = self.i9
    override def i11: E10 = self.i10
    override def i12: E11 = self.i11
    override def i13: E12 = self.i12
    override def i14: E13 = self.i13
  }
  def eatToTuple[T](xyy: T): Tuple14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, T] =
    (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, xyy)
  def pudaoToTuple[T](xyy: T): Tuple14[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] =
    (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13)
  def leftTuple: Tuple12[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] =
    Tuple12(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13)
  def rightTuple: Tuple12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] =
    Tuple12(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12)
}
trait XyyItem14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def i10: E10
  def i11: E11
  def i12: E12
  def i13: E13
  def i14: E14
  def leftHead: E1 = self.i1
  def leftTail: XyyItem13[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] = new XyyItem13[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] {
    def i1: E2   = self.i2
    def i2: E3   = self.i3
    def i3: E4   = self.i4
    def i4: E5   = self.i5
    def i5: E6   = self.i6
    def i6: E7   = self.i7
    def i7: E8   = self.i8
    def i8: E9   = self.i9
    def i9: E10  = self.i10
    def i10: E11 = self.i11
    def i11: E12 = self.i12
    def i12: E13 = self.i13
    def i13: E14 = self.i14
  }
  def rightHead: E14 = self.i14
  def rightTail: XyyItem13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] = new XyyItem13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] {
    def i1: E1   = self.i1
    def i2: E2   = self.i2
    def i3: E3   = self.i3
    def i4: E4   = self.i4
    def i5: E5   = self.i5
    def i6: E6   = self.i6
    def i7: E7   = self.i7
    def i8: E8   = self.i8
    def i9: E9   = self.i9
    def i10: E10 = self.i10
    def i11: E11 = self.i11
    def i12: E12 = self.i12
    def i13: E13 = self.i13
  }
  def eat[T](xyy: T): XyyItem15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, T] =
    new XyyItem15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, T] {
      override def i1: E1   = self.i1
      override def i2: E2   = self.i2
      override def i3: E3   = self.i3
      override def i4: E4   = self.i4
      override def i5: E5   = self.i5
      override def i6: E6   = self.i6
      override def i7: E7   = self.i7
      override def i8: E8   = self.i8
      override def i9: E9   = self.i9
      override def i10: E10 = self.i10
      override def i11: E11 = self.i11
      override def i12: E12 = self.i12
      override def i13: E13 = self.i13
      override def i14: E14 = self.i14
      override def i15: T   = xyy
    }
  def pudao[T](xyy: T): XyyItem15[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] =
    new XyyItem15[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] {
      override def i1: T    = xyy
      override def i2: E1   = self.i1
      override def i3: E2   = self.i2
      override def i4: E3   = self.i3
      override def i5: E4   = self.i4
      override def i6: E5   = self.i5
      override def i7: E6   = self.i6
      override def i8: E7   = self.i7
      override def i9: E8   = self.i8
      override def i10: E9  = self.i9
      override def i11: E10 = self.i10
      override def i12: E11 = self.i11
      override def i13: E12 = self.i12
      override def i14: E13 = self.i13
      override def i15: E14 = self.i14
    }
  def eatToTuple[T](xyy: T): Tuple15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, T] =
    (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14, xyy)
  def pudaoToTuple[T](xyy: T): Tuple15[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] =
    (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14)
  def leftTuple: Tuple13[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] =
    Tuple13(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14)
  def rightTuple: Tuple13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] =
    Tuple13(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13)
}
trait XyyItem15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def i10: E10
  def i11: E11
  def i12: E12
  def i13: E13
  def i14: E14
  def i15: E15
  def leftHead: E1 = self.i1
  def leftTail: XyyItem14[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] = new XyyItem14[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] {
    def i1: E2   = self.i2
    def i2: E3   = self.i3
    def i3: E4   = self.i4
    def i4: E5   = self.i5
    def i5: E6   = self.i6
    def i6: E7   = self.i7
    def i7: E8   = self.i8
    def i8: E9   = self.i9
    def i9: E10  = self.i10
    def i10: E11 = self.i11
    def i11: E12 = self.i12
    def i12: E13 = self.i13
    def i13: E14 = self.i14
    def i14: E15 = self.i15
  }
  def rightHead: E15 = self.i15
  def rightTail: XyyItem14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] = new XyyItem14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] {
    def i1: E1   = self.i1
    def i2: E2   = self.i2
    def i3: E3   = self.i3
    def i4: E4   = self.i4
    def i5: E5   = self.i5
    def i6: E6   = self.i6
    def i7: E7   = self.i7
    def i8: E8   = self.i8
    def i9: E9   = self.i9
    def i10: E10 = self.i10
    def i11: E11 = self.i11
    def i12: E12 = self.i12
    def i13: E13 = self.i13
    def i14: E14 = self.i14
  }
  def eat[T](xyy: T): XyyItem16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, T] =
    new XyyItem16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, T] {
      override def i1: E1   = self.i1
      override def i2: E2   = self.i2
      override def i3: E3   = self.i3
      override def i4: E4   = self.i4
      override def i5: E5   = self.i5
      override def i6: E6   = self.i6
      override def i7: E7   = self.i7
      override def i8: E8   = self.i8
      override def i9: E9   = self.i9
      override def i10: E10 = self.i10
      override def i11: E11 = self.i11
      override def i12: E12 = self.i12
      override def i13: E13 = self.i13
      override def i14: E14 = self.i14
      override def i15: E15 = self.i15
      override def i16: T   = xyy
    }
  def pudao[T](xyy: T): XyyItem16[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] =
    new XyyItem16[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] {
      override def i1: T    = xyy
      override def i2: E1   = self.i1
      override def i3: E2   = self.i2
      override def i4: E3   = self.i3
      override def i5: E4   = self.i4
      override def i6: E5   = self.i5
      override def i7: E6   = self.i6
      override def i8: E7   = self.i7
      override def i9: E8   = self.i8
      override def i10: E9  = self.i9
      override def i11: E10 = self.i10
      override def i12: E11 = self.i11
      override def i13: E12 = self.i12
      override def i14: E13 = self.i13
      override def i15: E14 = self.i14
      override def i16: E15 = self.i15
    }
  def eatToTuple[T](xyy: T): Tuple16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, T] =
    (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14, self.i15, xyy)
  def pudaoToTuple[T](xyy: T): Tuple16[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] =
    (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14, self.i15)
  def leftTuple: Tuple14[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] =
    Tuple14(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14, self.i15)
  def rightTuple: Tuple14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] =
    Tuple14(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14)
}
trait XyyItem16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def i10: E10
  def i11: E11
  def i12: E12
  def i13: E13
  def i14: E14
  def i15: E15
  def i16: E16
  def leftHead: E1 = self.i1
  def leftTail: XyyItem15[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] =
    new XyyItem15[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] {
      def i1: E2   = self.i2
      def i2: E3   = self.i3
      def i3: E4   = self.i4
      def i4: E5   = self.i5
      def i5: E6   = self.i6
      def i6: E7   = self.i7
      def i7: E8   = self.i8
      def i8: E9   = self.i9
      def i9: E10  = self.i10
      def i10: E11 = self.i11
      def i11: E12 = self.i12
      def i12: E13 = self.i13
      def i13: E14 = self.i14
      def i14: E15 = self.i15
      def i15: E16 = self.i16
    }
  def rightHead: E16 = self.i16
  def rightTail: XyyItem15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] =
    new XyyItem15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] {
      def i1: E1   = self.i1
      def i2: E2   = self.i2
      def i3: E3   = self.i3
      def i4: E4   = self.i4
      def i5: E5   = self.i5
      def i6: E6   = self.i6
      def i7: E7   = self.i7
      def i8: E8   = self.i8
      def i9: E9   = self.i9
      def i10: E10 = self.i10
      def i11: E11 = self.i11
      def i12: E12 = self.i12
      def i13: E13 = self.i13
      def i14: E14 = self.i14
      def i15: E15 = self.i15
    }
  def eat[T](xyy: T): XyyItem17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, T] =
    new XyyItem17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, T] {
      override def i1: E1   = self.i1
      override def i2: E2   = self.i2
      override def i3: E3   = self.i3
      override def i4: E4   = self.i4
      override def i5: E5   = self.i5
      override def i6: E6   = self.i6
      override def i7: E7   = self.i7
      override def i8: E8   = self.i8
      override def i9: E9   = self.i9
      override def i10: E10 = self.i10
      override def i11: E11 = self.i11
      override def i12: E12 = self.i12
      override def i13: E13 = self.i13
      override def i14: E14 = self.i14
      override def i15: E15 = self.i15
      override def i16: E16 = self.i16
      override def i17: T   = xyy
    }
  def pudao[T](xyy: T): XyyItem17[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] =
    new XyyItem17[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] {
      override def i1: T    = xyy
      override def i2: E1   = self.i1
      override def i3: E2   = self.i2
      override def i4: E3   = self.i3
      override def i5: E4   = self.i4
      override def i6: E5   = self.i5
      override def i7: E6   = self.i6
      override def i8: E7   = self.i7
      override def i9: E8   = self.i8
      override def i10: E9  = self.i9
      override def i11: E10 = self.i10
      override def i12: E11 = self.i11
      override def i13: E12 = self.i12
      override def i14: E13 = self.i13
      override def i15: E14 = self.i14
      override def i16: E15 = self.i15
      override def i17: E16 = self.i16
    }
  def eatToTuple[T](xyy: T): Tuple17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, T] =
    (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14, self.i15, self.i16, xyy)
  def pudaoToTuple[T](xyy: T): Tuple17[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] =
    (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14, self.i15, self.i16)
  def leftTuple: Tuple15[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] =
    Tuple15(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14, self.i15, self.i16)
  def rightTuple: Tuple15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] =
    Tuple15(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14, self.i15)
}
trait XyyItem17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def i10: E10
  def i11: E11
  def i12: E12
  def i13: E13
  def i14: E14
  def i15: E15
  def i16: E16
  def i17: E17
  def leftHead: E1 = self.i1
  def leftTail: XyyItem16[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] =
    new XyyItem16[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] {
      def i1: E2   = self.i2
      def i2: E3   = self.i3
      def i3: E4   = self.i4
      def i4: E5   = self.i5
      def i5: E6   = self.i6
      def i6: E7   = self.i7
      def i7: E8   = self.i8
      def i8: E9   = self.i9
      def i9: E10  = self.i10
      def i10: E11 = self.i11
      def i11: E12 = self.i12
      def i12: E13 = self.i13
      def i13: E14 = self.i14
      def i14: E15 = self.i15
      def i15: E16 = self.i16
      def i16: E17 = self.i17
    }
  def rightHead: E17 = self.i17
  def rightTail: XyyItem16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] =
    new XyyItem16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] {
      def i1: E1   = self.i1
      def i2: E2   = self.i2
      def i3: E3   = self.i3
      def i4: E4   = self.i4
      def i5: E5   = self.i5
      def i6: E6   = self.i6
      def i7: E7   = self.i7
      def i8: E8   = self.i8
      def i9: E9   = self.i9
      def i10: E10 = self.i10
      def i11: E11 = self.i11
      def i12: E12 = self.i12
      def i13: E13 = self.i13
      def i14: E14 = self.i14
      def i15: E15 = self.i15
      def i16: E16 = self.i16
    }
  def eat[T](xyy: T): XyyItem18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, T] =
    new XyyItem18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, T] {
      override def i1: E1   = self.i1
      override def i2: E2   = self.i2
      override def i3: E3   = self.i3
      override def i4: E4   = self.i4
      override def i5: E5   = self.i5
      override def i6: E6   = self.i6
      override def i7: E7   = self.i7
      override def i8: E8   = self.i8
      override def i9: E9   = self.i9
      override def i10: E10 = self.i10
      override def i11: E11 = self.i11
      override def i12: E12 = self.i12
      override def i13: E13 = self.i13
      override def i14: E14 = self.i14
      override def i15: E15 = self.i15
      override def i16: E16 = self.i16
      override def i17: E17 = self.i17
      override def i18: T   = xyy
    }
  def pudao[T](xyy: T): XyyItem18[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] =
    new XyyItem18[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] {
      override def i1: T    = xyy
      override def i2: E1   = self.i1
      override def i3: E2   = self.i2
      override def i4: E3   = self.i3
      override def i5: E4   = self.i4
      override def i6: E5   = self.i5
      override def i7: E6   = self.i6
      override def i8: E7   = self.i7
      override def i9: E8   = self.i8
      override def i10: E9  = self.i9
      override def i11: E10 = self.i10
      override def i12: E11 = self.i11
      override def i13: E12 = self.i12
      override def i14: E13 = self.i13
      override def i15: E14 = self.i14
      override def i16: E15 = self.i15
      override def i17: E16 = self.i16
      override def i18: E17 = self.i17
    }
  def eatToTuple[T](xyy: T): Tuple18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, T] =
    (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14, self.i15, self.i16, self.i17, xyy)
  def pudaoToTuple[T](xyy: T): Tuple18[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] =
    (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14, self.i15, self.i16, self.i17)
  def leftTuple: Tuple16[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] =
    Tuple16(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14, self.i15, self.i16, self.i17)
  def rightTuple: Tuple16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] =
    Tuple16(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, self.i13, self.i14, self.i15, self.i16)
}
trait XyyItem18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def i10: E10
  def i11: E11
  def i12: E12
  def i13: E13
  def i14: E14
  def i15: E15
  def i16: E16
  def i17: E17
  def i18: E18
  def leftHead: E1 = self.i1
  def leftTail: XyyItem17[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] =
    new XyyItem17[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] {
      def i1: E2   = self.i2
      def i2: E3   = self.i3
      def i3: E4   = self.i4
      def i4: E5   = self.i5
      def i5: E6   = self.i6
      def i6: E7   = self.i7
      def i7: E8   = self.i8
      def i8: E9   = self.i9
      def i9: E10  = self.i10
      def i10: E11 = self.i11
      def i11: E12 = self.i12
      def i12: E13 = self.i13
      def i13: E14 = self.i14
      def i14: E15 = self.i15
      def i15: E16 = self.i16
      def i16: E17 = self.i17
      def i17: E18 = self.i18
    }
  def rightHead: E18 = self.i18
  def rightTail: XyyItem17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] =
    new XyyItem17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] {
      def i1: E1   = self.i1
      def i2: E2   = self.i2
      def i3: E3   = self.i3
      def i4: E4   = self.i4
      def i5: E5   = self.i5
      def i6: E6   = self.i6
      def i7: E7   = self.i7
      def i8: E8   = self.i8
      def i9: E9   = self.i9
      def i10: E10 = self.i10
      def i11: E11 = self.i11
      def i12: E12 = self.i12
      def i13: E13 = self.i13
      def i14: E14 = self.i14
      def i15: E15 = self.i15
      def i16: E16 = self.i16
      def i17: E17 = self.i17
    }
  def eat[T](xyy: T): XyyItem19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, T] =
    new XyyItem19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, T] {
      override def i1: E1   = self.i1
      override def i2: E2   = self.i2
      override def i3: E3   = self.i3
      override def i4: E4   = self.i4
      override def i5: E5   = self.i5
      override def i6: E6   = self.i6
      override def i7: E7   = self.i7
      override def i8: E8   = self.i8
      override def i9: E9   = self.i9
      override def i10: E10 = self.i10
      override def i11: E11 = self.i11
      override def i12: E12 = self.i12
      override def i13: E13 = self.i13
      override def i14: E14 = self.i14
      override def i15: E15 = self.i15
      override def i16: E16 = self.i16
      override def i17: E17 = self.i17
      override def i18: E18 = self.i18
      override def i19: T   = xyy
    }
  def pudao[T](xyy: T): XyyItem19[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] =
    new XyyItem19[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] {
      override def i1: T    = xyy
      override def i2: E1   = self.i1
      override def i3: E2   = self.i2
      override def i4: E3   = self.i3
      override def i5: E4   = self.i4
      override def i6: E5   = self.i5
      override def i7: E6   = self.i6
      override def i8: E7   = self.i7
      override def i9: E8   = self.i8
      override def i10: E9  = self.i9
      override def i11: E10 = self.i10
      override def i12: E11 = self.i11
      override def i13: E12 = self.i12
      override def i14: E13 = self.i13
      override def i15: E14 = self.i14
      override def i16: E15 = self.i15
      override def i17: E16 = self.i16
      override def i18: E17 = self.i17
      override def i19: E18 = self.i18
    }
  def eatToTuple[T](xyy: T): Tuple19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, T] =
    (
      self.i1,
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17,
      self.i18,
      xyy
    )
  def pudaoToTuple[T](xyy: T): Tuple19[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] =
    (
      xyy,
      self.i1,
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17,
      self.i18
    )
  def leftTuple: Tuple17[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] =
    Tuple17(
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17,
      self.i18
    )
  def rightTuple: Tuple17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] =
    Tuple17(
      self.i1,
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17
    )
}
trait XyyItem19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def i10: E10
  def i11: E11
  def i12: E12
  def i13: E13
  def i14: E14
  def i15: E15
  def i16: E16
  def i17: E17
  def i18: E18
  def i19: E19
  def leftHead: E1 = self.i1
  def leftTail: XyyItem18[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] =
    new XyyItem18[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] {
      def i1: E2   = self.i2
      def i2: E3   = self.i3
      def i3: E4   = self.i4
      def i4: E5   = self.i5
      def i5: E6   = self.i6
      def i6: E7   = self.i7
      def i7: E8   = self.i8
      def i8: E9   = self.i9
      def i9: E10  = self.i10
      def i10: E11 = self.i11
      def i11: E12 = self.i12
      def i12: E13 = self.i13
      def i13: E14 = self.i14
      def i14: E15 = self.i15
      def i15: E16 = self.i16
      def i16: E17 = self.i17
      def i17: E18 = self.i18
      def i18: E19 = self.i19
    }
  def rightHead: E19 = self.i19
  def rightTail: XyyItem18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] =
    new XyyItem18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] {
      def i1: E1   = self.i1
      def i2: E2   = self.i2
      def i3: E3   = self.i3
      def i4: E4   = self.i4
      def i5: E5   = self.i5
      def i6: E6   = self.i6
      def i7: E7   = self.i7
      def i8: E8   = self.i8
      def i9: E9   = self.i9
      def i10: E10 = self.i10
      def i11: E11 = self.i11
      def i12: E12 = self.i12
      def i13: E13 = self.i13
      def i14: E14 = self.i14
      def i15: E15 = self.i15
      def i16: E16 = self.i16
      def i17: E17 = self.i17
      def i18: E18 = self.i18
    }
  def eat[T](xyy: T): XyyItem20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, T] =
    new XyyItem20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, T] {
      override def i1: E1   = self.i1
      override def i2: E2   = self.i2
      override def i3: E3   = self.i3
      override def i4: E4   = self.i4
      override def i5: E5   = self.i5
      override def i6: E6   = self.i6
      override def i7: E7   = self.i7
      override def i8: E8   = self.i8
      override def i9: E9   = self.i9
      override def i10: E10 = self.i10
      override def i11: E11 = self.i11
      override def i12: E12 = self.i12
      override def i13: E13 = self.i13
      override def i14: E14 = self.i14
      override def i15: E15 = self.i15
      override def i16: E16 = self.i16
      override def i17: E17 = self.i17
      override def i18: E18 = self.i18
      override def i19: E19 = self.i19
      override def i20: T   = xyy
    }
  def pudao[T](xyy: T): XyyItem20[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] =
    new XyyItem20[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] {
      override def i1: T    = xyy
      override def i2: E1   = self.i1
      override def i3: E2   = self.i2
      override def i4: E3   = self.i3
      override def i5: E4   = self.i4
      override def i6: E5   = self.i5
      override def i7: E6   = self.i6
      override def i8: E7   = self.i7
      override def i9: E8   = self.i8
      override def i10: E9  = self.i9
      override def i11: E10 = self.i10
      override def i12: E11 = self.i11
      override def i13: E12 = self.i12
      override def i14: E13 = self.i13
      override def i15: E14 = self.i14
      override def i16: E15 = self.i15
      override def i17: E16 = self.i16
      override def i18: E17 = self.i17
      override def i19: E18 = self.i18
      override def i20: E19 = self.i19
    }
  def eatToTuple[T](xyy: T): Tuple20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, T] =
    (
      self.i1,
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17,
      self.i18,
      self.i19,
      xyy
    )
  def pudaoToTuple[T](xyy: T): Tuple20[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] =
    (
      xyy,
      self.i1,
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17,
      self.i18,
      self.i19
    )
  def leftTuple: Tuple18[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] =
    Tuple18(
        self.i2
      , self.i3
      , self.i4
      , self.i5
      , self.i6
      , self.i7
      , self.i8
      , self.i9
      , self.i10
      , self.i11
      , self.i12
      , self.i13
      , self.i14
      , self.i15
      , self.i16
      , self.i17
      , self.i18
      , self.i19
    )
  def rightTuple: Tuple18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] =
    Tuple18(
        self.i1
      , self.i2
      , self.i3
      , self.i4
      , self.i5
      , self.i6
      , self.i7
      , self.i8
      , self.i9
      , self.i10
      , self.i11
      , self.i12
      , self.i13
      , self.i14
      , self.i15
      , self.i16
      , self.i17
      , self.i18
    )
}
trait XyyItem20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def i10: E10
  def i11: E11
  def i12: E12
  def i13: E13
  def i14: E14
  def i15: E15
  def i16: E16
  def i17: E17
  def i18: E18
  def i19: E19
  def i20: E20
  def leftHead: E1 = self.i1
  def leftTail: XyyItem19[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] =
    new XyyItem19[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] {
      def i1: E2   = self.i2
      def i2: E3   = self.i3
      def i3: E4   = self.i4
      def i4: E5   = self.i5
      def i5: E6   = self.i6
      def i6: E7   = self.i7
      def i7: E8   = self.i8
      def i8: E9   = self.i9
      def i9: E10  = self.i10
      def i10: E11 = self.i11
      def i11: E12 = self.i12
      def i12: E13 = self.i13
      def i13: E14 = self.i14
      def i14: E15 = self.i15
      def i15: E16 = self.i16
      def i16: E17 = self.i17
      def i17: E18 = self.i18
      def i18: E19 = self.i19
      def i19: E20 = self.i20
    }
  def rightHead: E20 = self.i20
  def rightTail: XyyItem19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] =
    new XyyItem19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] {
      def i1: E1   = self.i1
      def i2: E2   = self.i2
      def i3: E3   = self.i3
      def i4: E4   = self.i4
      def i5: E5   = self.i5
      def i6: E6   = self.i6
      def i7: E7   = self.i7
      def i8: E8   = self.i8
      def i9: E9   = self.i9
      def i10: E10 = self.i10
      def i11: E11 = self.i11
      def i12: E12 = self.i12
      def i13: E13 = self.i13
      def i14: E14 = self.i14
      def i15: E15 = self.i15
      def i16: E16 = self.i16
      def i17: E17 = self.i17
      def i18: E18 = self.i18
      def i19: E19 = self.i19
    }
  def eat[T](xyy: T): XyyItem21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, T] =
    new XyyItem21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, T] {
      override def i1: E1   = self.i1
      override def i2: E2   = self.i2
      override def i3: E3   = self.i3
      override def i4: E4   = self.i4
      override def i5: E5   = self.i5
      override def i6: E6   = self.i6
      override def i7: E7   = self.i7
      override def i8: E8   = self.i8
      override def i9: E9   = self.i9
      override def i10: E10 = self.i10
      override def i11: E11 = self.i11
      override def i12: E12 = self.i12
      override def i13: E13 = self.i13
      override def i14: E14 = self.i14
      override def i15: E15 = self.i15
      override def i16: E16 = self.i16
      override def i17: E17 = self.i17
      override def i18: E18 = self.i18
      override def i19: E19 = self.i19
      override def i20: E20 = self.i20
      override def i21: T   = xyy
    }
  def pudao[T](xyy: T): XyyItem21[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] =
    new XyyItem21[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] {
      override def i1: T    = xyy
      override def i2: E1   = self.i1
      override def i3: E2   = self.i2
      override def i4: E3   = self.i3
      override def i5: E4   = self.i4
      override def i6: E5   = self.i5
      override def i7: E6   = self.i6
      override def i8: E7   = self.i7
      override def i9: E8   = self.i8
      override def i10: E9  = self.i9
      override def i11: E10 = self.i10
      override def i12: E11 = self.i11
      override def i13: E12 = self.i12
      override def i14: E13 = self.i13
      override def i15: E14 = self.i14
      override def i16: E15 = self.i15
      override def i17: E16 = self.i16
      override def i18: E17 = self.i17
      override def i19: E18 = self.i18
      override def i20: E19 = self.i19
      override def i21: E20 = self.i20
    }
  def eatToTuple[T](xyy: T): Tuple21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, T] =
    (
      self.i1,
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17,
      self.i18,
      self.i19,
      self.i20,
      xyy
    )
  def pudaoToTuple[T](xyy: T): Tuple21[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] =
    (
      xyy,
      self.i1,
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17,
      self.i18,
      self.i19,
      self.i20
    )
  def leftTuple: Tuple19[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] =
    Tuple19(
        self.i2
      , self.i3
      , self.i4
      , self.i5
      , self.i6
      , self.i7
      , self.i8
      , self.i9
      , self.i10
      , self.i11
      , self.i12
      , self.i13
      , self.i14
      , self.i15
      , self.i16
      , self.i17
      , self.i18
      , self.i19
      , self.i20
    )
  def rightTuple: Tuple19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] =
    Tuple19(
        self.i1
      , self.i2
      , self.i3
      , self.i4
      , self.i5
      , self.i6
      , self.i7
      , self.i8
      , self.i9
      , self.i10
      , self.i11
      , self.i12
      , self.i13
      , self.i14
      , self.i15
      , self.i16
      , self.i17
      , self.i18
      , self.i19
    )
}
trait XyyItem21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def i10: E10
  def i11: E11
  def i12: E12
  def i13: E13
  def i14: E14
  def i15: E15
  def i16: E16
  def i17: E17
  def i18: E18
  def i19: E19
  def i20: E20
  def i21: E21
  def leftHead: E1 = self.i1
  def leftTail: XyyItem20[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] =
    new XyyItem20[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] {
      def i1: E2   = self.i2
      def i2: E3   = self.i3
      def i3: E4   = self.i4
      def i4: E5   = self.i5
      def i5: E6   = self.i6
      def i6: E7   = self.i7
      def i7: E8   = self.i8
      def i8: E9   = self.i9
      def i9: E10  = self.i10
      def i10: E11 = self.i11
      def i11: E12 = self.i12
      def i12: E13 = self.i13
      def i13: E14 = self.i14
      def i14: E15 = self.i15
      def i15: E16 = self.i16
      def i16: E17 = self.i17
      def i17: E18 = self.i18
      def i18: E19 = self.i19
      def i19: E20 = self.i20
      def i20: E21 = self.i21
    }
  def rightHead: E21 = self.i21
  def rightTail: XyyItem20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] =
    new XyyItem20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] {
      def i1: E1   = self.i1
      def i2: E2   = self.i2
      def i3: E3   = self.i3
      def i4: E4   = self.i4
      def i5: E5   = self.i5
      def i6: E6   = self.i6
      def i7: E7   = self.i7
      def i8: E8   = self.i8
      def i9: E9   = self.i9
      def i10: E10 = self.i10
      def i11: E11 = self.i11
      def i12: E12 = self.i12
      def i13: E13 = self.i13
      def i14: E14 = self.i14
      def i15: E15 = self.i15
      def i16: E16 = self.i16
      def i17: E17 = self.i17
      def i18: E18 = self.i18
      def i19: E19 = self.i19
      def i20: E20 = self.i20
    }
  def eat[T](xyy: T): XyyItem22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, T] =
    new XyyItem22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, T] {
      override def i1: E1   = self.i1
      override def i2: E2   = self.i2
      override def i3: E3   = self.i3
      override def i4: E4   = self.i4
      override def i5: E5   = self.i5
      override def i6: E6   = self.i6
      override def i7: E7   = self.i7
      override def i8: E8   = self.i8
      override def i9: E9   = self.i9
      override def i10: E10 = self.i10
      override def i11: E11 = self.i11
      override def i12: E12 = self.i12
      override def i13: E13 = self.i13
      override def i14: E14 = self.i14
      override def i15: E15 = self.i15
      override def i16: E16 = self.i16
      override def i17: E17 = self.i17
      override def i18: E18 = self.i18
      override def i19: E19 = self.i19
      override def i20: E20 = self.i20
      override def i21: E21 = self.i21
      override def i22: T   = xyy
    }
  def pudao[T](xyy: T): XyyItem22[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] =
    new XyyItem22[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] {
      override def i1: T    = xyy
      override def i2: E1   = self.i1
      override def i3: E2   = self.i2
      override def i4: E3   = self.i3
      override def i5: E4   = self.i4
      override def i6: E5   = self.i5
      override def i7: E6   = self.i6
      override def i8: E7   = self.i7
      override def i9: E8   = self.i8
      override def i10: E9  = self.i9
      override def i11: E10 = self.i10
      override def i12: E11 = self.i11
      override def i13: E12 = self.i12
      override def i14: E13 = self.i13
      override def i15: E14 = self.i14
      override def i16: E15 = self.i15
      override def i17: E16 = self.i16
      override def i18: E17 = self.i17
      override def i19: E18 = self.i18
      override def i20: E19 = self.i19
      override def i21: E20 = self.i20
      override def i22: E21 = self.i21
    }
  def eatToTuple[T](xyy: T): Tuple22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, T] =
    (
      self.i1,
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17,
      self.i18,
      self.i19,
      self.i20,
      self.i21,
      xyy
    )
  def pudaoToTuple[T](xyy: T): Tuple22[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] =
    (
      xyy,
      self.i1,
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17,
      self.i18,
      self.i19,
      self.i20,
      self.i21
    )
  def leftTuple: Tuple20[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] =
    Tuple20(
        self.i2
      , self.i3
      , self.i4
      , self.i5
      , self.i6
      , self.i7
      , self.i8
      , self.i9
      , self.i10
      , self.i11
      , self.i12
      , self.i13
      , self.i14
      , self.i15
      , self.i16
      , self.i17
      , self.i18
      , self.i19
      , self.i20
      , self.i21
    )
  def rightTuple: Tuple20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] =
    Tuple20(
        self.i1
      , self.i2
      , self.i3
      , self.i4
      , self.i5
      , self.i6
      , self.i7
      , self.i8
      , self.i9
      , self.i10
      , self.i11
      , self.i12
      , self.i13
      , self.i14
      , self.i15
      , self.i16
      , self.i17
      , self.i18
      , self.i19
      , self.i20
    )
}
trait XyyItem22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def i10: E10
  def i11: E11
  def i12: E12
  def i13: E13
  def i14: E14
  def i15: E15
  def i16: E16
  def i17: E17
  def i18: E18
  def i19: E19
  def i20: E20
  def i21: E21
  def i22: E22
  def leftHead: E1 = self.i1
  def leftTail: XyyItem21[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22] =
    new XyyItem21[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22] {
      def i1: E2   = self.i2
      def i2: E3   = self.i3
      def i3: E4   = self.i4
      def i4: E5   = self.i5
      def i5: E6   = self.i6
      def i6: E7   = self.i7
      def i7: E8   = self.i8
      def i8: E9   = self.i9
      def i9: E10  = self.i10
      def i10: E11 = self.i11
      def i11: E12 = self.i12
      def i12: E13 = self.i13
      def i13: E14 = self.i14
      def i14: E15 = self.i15
      def i15: E16 = self.i16
      def i16: E17 = self.i17
      def i17: E18 = self.i18
      def i18: E19 = self.i19
      def i19: E20 = self.i20
      def i20: E21 = self.i21
      def i21: E22 = self.i22
    }
  def rightHead: E22 = self.i22
  def rightTail: XyyItem21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] =
    new XyyItem21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] {
      def i1: E1   = self.i1
      def i2: E2   = self.i2
      def i3: E3   = self.i3
      def i4: E4   = self.i4
      def i5: E5   = self.i5
      def i6: E6   = self.i6
      def i7: E7   = self.i7
      def i8: E8   = self.i8
      def i9: E9   = self.i9
      def i10: E10 = self.i10
      def i11: E11 = self.i11
      def i12: E12 = self.i12
      def i13: E13 = self.i13
      def i14: E14 = self.i14
      def i15: E15 = self.i15
      def i16: E16 = self.i16
      def i17: E17 = self.i17
      def i18: E18 = self.i18
      def i19: E19 = self.i19
      def i20: E20 = self.i20
      def i21: E21 = self.i21
    }
  def leftTuple: Tuple21[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22] =
    (
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17,
      self.i18,
      self.i19,
      self.i20,
      self.i21,
      self.i22
    )
  def rightTuple: Tuple21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] =
    (
      self.i1,
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17,
      self.i18,
      self.i19,
      self.i20,
      self.i21
    )
}
