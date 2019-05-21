package org.scalax.asuna.ii.item
trait XyyItem5[E1, E2, E3, E4, E5] extends Any with org.scalax.asuna.mapper.item.TagContentImpl[ItemTag5[E1, E2, E3, E4, E5]] {
  self =>
  override type IITag = ItemTag5[E1, E2, E3, E4, E5]
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def leftHead: E1                                           = throw new Exception("Can not use this method.")
  def leftTail: XyyItem4[E2, E3, E4, E5]                     = throw new Exception("Can not use this method.")
  def rightHead: E5                                          = throw new Exception("Can not use this method.")
  def rightTail: XyyItem4[E1, E2, E3, E4]                    = throw new Exception("Can not use this method.")
  def eat[T](xyy: T): XyyItem6[E1, E2, E3, E4, E5, T]        = throw new Exception("Can not use this method.")
  def pudao[T](xyy: T): XyyItem6[T, E1, E2, E3, E4, E5]      = throw new Exception("Can not use this method.")
  def eatToTuple[T](xyy: T): Tuple6[E1, E2, E3, E4, E5, T]   = (self.i1, self.i2, self.i3, self.i4, self.i5, xyy)
  def pudaoToTuple[T](xyy: T): Tuple6[T, E1, E2, E3, E4, E5] = (xyy, self.i1, self.i2, self.i3, self.i4, self.i5)
  def leftTuple: Tuple4[E2, E3, E4, E5]                      = Tuple4(self.i2, self.i3, self.i4, self.i5)
  def rightTuple: Tuple4[E1, E2, E3, E4]                     = Tuple4(self.i1, self.i2, self.i3, self.i4)
}
