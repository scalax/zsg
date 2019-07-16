import scala.language.higherKinds

trait HListYuan {

  type Head
  def head: Head

  type C <: Convert
  def c: C

  type Tail <: HListYuan
  def tail: Tail

  type Add[T] <: HListYuan
  def add[T](i: T): Add[T]

}

trait HListYQ {

  type Source <: HListYuan
  def source: Source

  type Target <: HListYuan
  def target: Target

  type Current = Source#Head
  def current: Source#Head = source.head

  type CanReverse
  def canReverse: CanReverse

  type NextNext
  def nextNext: NextNext

  type Next
  def next: Next

}
