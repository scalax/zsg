package org.scalax.asuna.ii.item
trait XyyItem0 extends Any {
  def eat[T](xyy: T): XyyItem1[T] = new XyyItem1[T] {
    override def i1: T = xyy
  }
  def pudao[T](xyy: T): XyyItem1[T] = new XyyItem1[T] {
    override def i1: T = xyy
  }
}
object XyyItem0 extends XyyItem0
trait XyyItem1[E1] extends Any {
  self =>
  def i1: E1
  def eat[T](xyy: T): XyyItem2[E1, T] = new XyyItem2[E1, T] {
    override def i1: E1 = self.i1
    override def i2: T  = xyy
  }
  def pudao[T](xyy: T): XyyItem2[T, E1] = new XyyItem2[T, E1] {
    override def i1: T  = xyy
    override def i2: E1 = self.i1
  }
}
trait XyyItem2[E1, E2] extends Any {
  self =>
  def i1: E1
  def i2: E2
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
}
trait XyyItem3[E1, E2, E3] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
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
}
trait XyyItem4[E1, E2, E3, E4] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
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
}
trait XyyItem5[E1, E2, E3, E4, E5] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
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
}
trait XyyItem6[E1, E2, E3, E4, E5, E6] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
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
}
trait XyyItem22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22] extends Any {
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
}
