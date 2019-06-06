package org.scalax.asuna.mapper.item
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
  def leftHead: E1                                                            = throw new Exception("Can not use this method.")
  def leftTail: XyyItem8[E2, E3, E4, E5, E6, E7, E8, E9]                      = throw new Exception("Can not use this method.")
  def rightHead: E9                                                           = throw new Exception("Can not use this method.")
  def rightTail: XyyItem8[E1, E2, E3, E4, E5, E6, E7, E8]                     = throw new Exception("Can not use this method.")
  def eat[T](xyy: T): XyyItem10[E1, E2, E3, E4, E5, E6, E7, E8, E9, T]        = throw new Exception("Can not use this method.")
  def pudao[T](xyy: T): XyyItem10[T, E1, E2, E3, E4, E5, E6, E7, E8, E9]      = throw new Exception("Can not use this method.")
  def eatToTuple[T](xyy: T): Tuple10[E1, E2, E3, E4, E5, E6, E7, E8, E9, T]   = (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, xyy)
  def pudaoToTuple[T](xyy: T): Tuple10[T, E1, E2, E3, E4, E5, E6, E7, E8, E9] = (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9)
  def leftTuple: Tuple8[E2, E3, E4, E5, E6, E7, E8, E9]                       = Tuple8(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9)
  def rightTuple: Tuple8[E1, E2, E3, E4, E5, E6, E7, E8]                      = Tuple8(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8)
}
