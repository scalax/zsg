package asuna
trait AsunaTuple3[E1, E2, E3] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def leftHead: E1                                = throw new Exception("Can not use this method.")
  def leftTail: AsunaTuple2[E2, E3]               = throw new Exception("Can not use this method.")
  def rightHead: E3                               = throw new Exception("Can not use this method.")
  def rightTail: AsunaTuple2[E1, E2]              = throw new Exception("Can not use this method.")
  def add[T](xyy: T): AsunaTuple4[E1, E2, E3, T]  = throw new Exception("Can not use this method.")
  def pull[T](xyy: T): AsunaTuple4[T, E1, E2, E3] = throw new Exception("Can not use this method.")
  def addToTuple[T](xyy: T): (E1, E2, E3, T)      = (self.i1, self.i2, self.i3, xyy)
  def pullToTuple[T](xyy: T): (T, E1, E2, E3)     = (xyy, self.i1, self.i2, self.i3)
  def leftTuple: (E2, E3)                         = (self.i2, self.i3)
  def rightTuple: (E1, E2)                        = (self.i1, self.i2)
}
