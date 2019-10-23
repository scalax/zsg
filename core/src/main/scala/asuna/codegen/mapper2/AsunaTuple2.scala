package asuna
trait AsunaTuple2[E1, E2] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def addToTuple[T](xyy: T): (E1, E2, T)  = (self.i1, self.i2, xyy)
  def pullToTuple[T](xyy: T): (T, E1, E2) = (xyy, self.i1, self.i2)
  def leftTuple: (E2)                     = (self.i2)
  def rightTuple: (E1)                    = (self.i1)
}
