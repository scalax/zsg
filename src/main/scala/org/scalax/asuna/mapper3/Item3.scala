package org.scalax.asuna.mapper.item
trait Item3[E1, E2, E3] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def leftHead: E1                                   = throw new Exception("Can not use this method.")
  def leftTail: Item2[E2, E3]                        = throw new Exception("Can not use this method.")
  def rightHead: E3                                  = throw new Exception("Can not use this method.")
  def rightTail: Item2[E1, E2]                       = throw new Exception("Can not use this method.")
  def eat[T](xyy: T): Item4[E1, E2, E3, T]           = throw new Exception("Can not use this method.")
  def pudao[T](xyy: T): Item4[T, E1, E2, E3]         = throw new Exception("Can not use this method.")
  def eatToTuple[T](xyy: T): Tuple4[E1, E2, E3, T]   = (self.i1, self.i2, self.i3, xyy)
  def pudaoToTuple[T](xyy: T): Tuple4[T, E1, E2, E3] = (xyy, self.i1, self.i2, self.i3)
  def leftTuple: Tuple2[E2, E3]                      = Tuple2(self.i2, self.i3)
  def rightTuple: Tuple2[E1, E2]                     = Tuple2(self.i1, self.i2)
}
