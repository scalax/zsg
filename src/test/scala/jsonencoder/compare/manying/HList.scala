import scala.language.higherKinds

/**
HList 设计大体与 shapeless 相同，无需过度留意。
*/
trait HList {
  type H
  type T <: HList

  val head: H
  val tail: T

  type Add[I] <: HList
  def ::[I](i: I): Add[I]
}

class HNil extends HList {
  self =>
  override type H = HNil
  override type T = HNil
  override val head: HNil = self
  override val tail: HNil = self

  override type Add[I] = I :: HNil
  override def ::[I](i: I): I :: HNil = new ::(i, self)

  override def toString = "HNil"
}

object HNil extends HNil

class ::[HH, TT <: HList](override val head: HH, override val tail: TT) extends HList {
  self =>
  override type H = HH
  override type T = TT
  override type Add[I] = I :: (HH :: TT)
  override def ::[I](i: I): I :: (HH :: TT) = new ::(i, self)

  override def toString = tail.toString + ", " + head.toString
}