package org.scalax.asuna.mapper.item
trait Item10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] extends Any {
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
  def leftHead: E1                                                         = throw new Exception("Can not use this method.")
  def leftTail: Item9[E2, E3, E4, E5, E6, E7, E8, E9, E10]                 = throw new Exception("Can not use this method.")
  def rightHead: E10                                                       = throw new Exception("Can not use this method.")
  def rightTail: Item9[E1, E2, E3, E4, E5, E6, E7, E8, E9]                 = throw new Exception("Can not use this method.")
  def eat[T](xyy: T): Item11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, T]   = throw new Exception("Can not use this method.")
  def pudao[T](xyy: T): Item11[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] = throw new Exception("Can not use this method.")
  def eatToTuple[T](xyy: T): Tuple11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, T] =
    (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, xyy)
  def pudaoToTuple[T](xyy: T): Tuple11[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] =
    (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10)
  def leftTuple: Tuple9[E2, E3, E4, E5, E6, E7, E8, E9, E10] = Tuple9(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10)
  def rightTuple: Tuple9[E1, E2, E3, E4, E5, E6, E7, E8, E9] = Tuple9(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9)
}
