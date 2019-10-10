package org.scalax.asuna.mapper
trait Item0 extends Any {
  def eat[T](xyy: T): Item1[T]   = throw new Exception("Can not use this method.")
  def pudao[T](xyy: T): Item1[T] = throw new Exception("Can not use this method.")
}
object Item0 extends Item0
trait Item1[E1] extends Any {
  self =>
  def i1: E1
  def leftHead: E1                     = throw new Exception("Can not use this method.")
  def leftTail: Item0                  = throw new Exception("Can not use this method.")
  def rightHead: E1                    = throw new Exception("Can not use this method.")
  def rightTail: Item0                 = throw new Exception("Can not use this method.")
  def eat[T](xyy: T): Item2[E1, T]     = throw new Exception("Can not use this method.")
  def pudao[T](xyy: T): Item2[T, E1]   = throw new Exception("Can not use this method.")
  def eatToTuple[T](xyy: T): (E1, T)   = (self.i1, xyy)
  def pudaoToTuple[T](xyy: T): (T, E1) = (xyy, self.i1)
}
trait Item8[E1, E2, E3, E4, E5, E6, E7, E8] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def leftHead: E1                                                 = throw new Exception("Can not use this method.")
  def leftTail: Item7[E2, E3, E4, E5, E6, E7, E8]                  = throw new Exception("Can not use this method.")
  def rightHead: E8                                                = throw new Exception("Can not use this method.")
  def rightTail: Item7[E1, E2, E3, E4, E5, E6, E7]                 = throw new Exception("Can not use this method.")
  def leftTuple: (E2, E3, E4, E5, E6, E7, E8)                      = (self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8)
  def rightTuple: (E1, E2, E3, E4, E5, E6, E7)                     = (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7)
  def eatToTuple[T](xyy: T): (E1, E2, E3, E4, E5, E6, E7, E8, T)   = (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8, xyy)
  def pudaoToTuple[T](xyy: T): (T, E1, E2, E3, E4, E5, E6, E7, E8) = (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, self.i8)
}
