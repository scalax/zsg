package asuna
trait AsunaTuple4[E1, E2, E3, E4] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def addToTuple[T](xyy: T): (E1, E2, E3, E4, T)  = (self.i1, self.i2, self.i3, self.i4, xyy)
  def pullToTuple[T](xyy: T): (T, E1, E2, E3, E4) = (xyy, self.i1, self.i2, self.i3, self.i4)
  def leftTuple: (E2, E3, E4)                     = (self.i2, self.i3, self.i4)
  def rightTuple: (E1, E2, E3)                    = (self.i1, self.i2, self.i3)
}
