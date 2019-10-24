package asuna
trait AsunaTuple5[E1, E2, E3, E4, E5] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def addToTuple[T](xyy: T): (E1, E2, E3, E4, E5, T)  = (self.i1, self.i2, self.i3, self.i4, self.i5, xyy)
  def pullToTuple[T](xyy: T): (T, E1, E2, E3, E4, E5) = (xyy, self.i1, self.i2, self.i3, self.i4, self.i5)
  def leftTuple: (E2, E3, E4, E5)                     = (self.i2, self.i3, self.i4, self.i5)
  def rightTuple: (E1, E2, E3, E4)                    = (self.i1, self.i2, self.i3, self.i4)
}
