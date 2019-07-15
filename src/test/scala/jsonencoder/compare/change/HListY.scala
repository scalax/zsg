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

trait Convert {
  type M[I <: HListYQ] <: HListYQ
  def convert[I <: HListYQ](i: I): M[I]
}

trait HListYQ {

  type Yueyuan <: HListYuan
  def yueyuan: Yueyuan

  type Yueque <: HListYuan
  def yueque: Yueque

  type Current
  def current: Current

  type C <: Convert
  def currentC: C

  type Next <: HListYQ
  def next: Next

}
