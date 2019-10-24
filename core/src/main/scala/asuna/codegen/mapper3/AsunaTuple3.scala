package asuna
trait AsunaTuple3[E1, E2, E3] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def addToTuple[T](xyy: T): (E1, E2, E3, T)  = (self.i1, self.i2, self.i3, xyy)
  def pullToTuple[T](xyy: T): (T, E1, E2, E3) = (xyy, self.i1, self.i2, self.i3)
  def leftTuple: (E2, E3)                     = (self.i2, self.i3)
  def rightTuple: (E1, E2)                    = (self.i1, self.i2)
}
