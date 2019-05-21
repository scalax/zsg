package org.scalax.asuna.ii.item
trait XyyItem7[E1, E2, E3, E4, E5, E6, E7] extends Any with org.scalax.asuna.mapper.item.TagContentImpl[ItemTag7[E1, E2, E3, E4, E5, E6, E7]] {
  self =>
  override type IITag = ItemTag7[E1, E2, E3, E4, E5, E6, E7]
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def leftHead: E1                                                   = throw new Exception("Can not use this method.")
  def leftTail: XyyItem6[E2, E3, E4, E5, E6, E7]                     = throw new Exception("Can not use this method.")
  def rightHead: E7                                                  = throw new Exception("Can not use this method.")
  def rightTail: XyyItem6[E1, E2, E3, E4, E5, E6]                    = throw new Exception("Can not use this method.")
  def eat[T](xyy: T): XyyItem8[E1, E2, E3, E4, E5, E6, E7, T]        = throw new Exception("Can not use this method.")
  def pudao[T](xyy: T): XyyItem8[T, E1, E2, E3, E4, E5, E6, E7]      = throw new Exception("Can not use this method.")
  def eatToTuple[T](xyy: T): Tuple8[E1, E2, E3, E4, E5, E6, E7, T]   = (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, xyy)
  def pudaoToTuple[T](xyy: T): Tuple8[T, E1, E2, E3, E4, E5, E6, E7] = (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7)
  def leftTuple: Tuple6[E2, E3, E4, E5, E6, E7]                      = Tuple6(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7)
  def rightTuple: Tuple6[E1, E2, E3, E4, E5, E6]                     = Tuple6(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6)
}
