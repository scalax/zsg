package org.scalax.asuna.mapper.item
trait XyyItem8[E1, E2, E3, E4, E5, E6, E7, E8] extends Any with org.scalax.asuna.mapper.item.TagContentImpl[ItemTag8[E1, E2, E3, E4, E5, E6, E7, E8]] {
  self =>
  override type IITag = ItemTag8[E1, E2, E3, E4, E5, E6, E7, E8]
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def leftHead: E1                                                       = throw new Exception("Can not use this method.")
  def leftTail: XyyItem7[E2, E3, E4, E5, E6, E7, E8]                     = throw new Exception("Can not use this method.")
  def rightHead: E8                                                      = throw new Exception("Can not use this method.")
  def rightTail: XyyItem7[E1, E2, E3, E4, E5, E6, E7]                    = throw new Exception("Can not use this method.")
  def eat[T](xyy: T): XyyItem9[E1, E2, E3, E4, E5, E6, E7, E8, T]        = throw new Exception("Can not use this method.")
  def pudao[T](xyy: T): XyyItem9[T, E1, E2, E3, E4, E5, E6, E7, E8]      = throw new Exception("Can not use this method.")
  def eatToTuple[T](xyy: T): Tuple9[E1, E2, E3, E4, E5, E6, E7, E8, T]   = (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, xyy)
  def pudaoToTuple[T](xyy: T): Tuple9[T, E1, E2, E3, E4, E5, E6, E7, E8] = (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8)
  def leftTuple: Tuple7[E2, E3, E4, E5, E6, E7, E8]                      = Tuple7(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8)
  def rightTuple: Tuple7[E1, E2, E3, E4, E5, E6, E7]                     = Tuple7(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7)
}
