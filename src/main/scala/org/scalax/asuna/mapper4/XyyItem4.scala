package org.scalax.asuna.mapper.item
trait XyyItem4[E1, E2, E3, E4] extends Any with org.scalax.asuna.mapper.item.TagContentImpl[ItemTag4[E1, E2, E3, E4]] {
  self =>
  override type IITag = ItemTag4[E1, E2, E3, E4]
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def leftHead: E1                                       = throw new Exception("Can not use this method.")
  def leftTail: XyyItem3[E2, E3, E4]                     = throw new Exception("Can not use this method.")
  def rightHead: E4                                      = throw new Exception("Can not use this method.")
  def rightTail: XyyItem3[E1, E2, E3]                    = throw new Exception("Can not use this method.")
  def eat[T](xyy: T): XyyItem5[E1, E2, E3, E4, T]        = throw new Exception("Can not use this method.")
  def pudao[T](xyy: T): XyyItem5[T, E1, E2, E3, E4]      = throw new Exception("Can not use this method.")
  def eatToTuple[T](xyy: T): Tuple5[E1, E2, E3, E4, T]   = (self.i1, self.i2, self.i3, self.i4, xyy)
  def pudaoToTuple[T](xyy: T): Tuple5[T, E1, E2, E3, E4] = (xyy, self.i1, self.i2, self.i3, self.i4)
  def leftTuple: Tuple3[E2, E3, E4]                      = Tuple3(self.i2, self.i3, self.i4)
  def rightTuple: Tuple3[E1, E2, E3]                     = Tuple3(self.i1, self.i2, self.i3)
}
