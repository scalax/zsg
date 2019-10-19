package asuna
trait AsunaTuple2[E1, E2] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def leftHead: E1                            = throw new Exception("Can not use this method.")
  def leftTail: AsunaTuple1[E2]               = throw new Exception("Can not use this method.")
  def rightHead: E2                           = throw new Exception("Can not use this method.")
  def rightTail: AsunaTuple1[E1]              = throw new Exception("Can not use this method.")
  def add[T](xyy: T): AsunaTuple3[E1, E2, T]  = throw new Exception("Can not use this method.")
  def pull[T](xyy: T): AsunaTuple3[T, E1, E2] = throw new Exception("Can not use this method.")
  def addToTuple[T](xyy: T): (E1, E2, T)      = (self.i1, self.i2, xyy)
  def pullToTuple[T](xyy: T): (T, E1, E2)     = (xyy, self.i1, self.i2)
  def leftTuple: (E2)                         = (self.i2)
  def rightTuple: (E1)                        = (self.i1)
}
