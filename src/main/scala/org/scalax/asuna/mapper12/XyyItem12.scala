package org.scalax.asuna.mapper.item
trait XyyItem12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]
    extends Any
    with org.scalax.asuna.mapper.item.TagContentImpl[ItemTag12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]] {
  self =>
  override type IITag = ItemTag12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]
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
  def leftHead: E1                                                                      = throw new Exception("Can not use this method.")
  def leftTail: XyyItem11[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]                = throw new Exception("Can not use this method.")
  def rightHead: E12                                                                    = throw new Exception("Can not use this method.")
  def rightTail: XyyItem11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11]                = throw new Exception("Can not use this method.")
  def eat[T](xyy: T): XyyItem13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, T]   = throw new Exception("Can not use this method.")
  def pudao[T](xyy: T): XyyItem13[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] = throw new Exception("Can not use this method.")
  def eatToTuple[T](xyy: T): Tuple13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, T] =
    (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12, xyy)
  def pudaoToTuple[T](xyy: T): Tuple13[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] =
    (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12)
  def leftTuple: Tuple11[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] =
    Tuple11(self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11, self.i12)
  def rightTuple: Tuple11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] =
    Tuple11(self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, self.i9, self.i10, self.i11)
}
