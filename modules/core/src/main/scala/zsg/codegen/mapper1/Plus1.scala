package zsg
abstract class Plus1[
  X1,
  Y1,
  Z1
] {
  def takeHead1(z: Z1): X1
  def takeTail1(z: Z1): Y1
  def plus1(x: X1, y: Y1): Z1
}
