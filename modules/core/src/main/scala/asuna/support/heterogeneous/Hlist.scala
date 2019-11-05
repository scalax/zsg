package asuna.support.heterogeneous

import scala.language.higherKinds

final class NoData

final object NoData {
  final val value: NoData = new NoData
}

trait HList {

  type Head

  def head: Head

  type Tail <: HList

  def tail: Tail

  type Append[H] <: HList

  def ::[H](h: H): Append[H]

}

trait HNil extends HList {
  self =>

  override type Head = NoData

  override def head: NoData = NoData.value

  override type Tail = HNil

  override def tail: HNil = HNil

  override type Append[H] = ::[H, HNil]

  override def ::[H](h: H): ::[H, HNil] = new ::(h, self)

  override def toString: String = s"HNil"

}

final object HNil extends HNil

final class ::[H, T <: HList](override val head: H, override val tail: T) extends HList {
  self =>

  override final type Head = H
  override final type Tail = T

  override final type Append[HH] = ::[HH, ::[H, T]]

  override final def ::[HH](h: HH): ::[HH, ::[H, T]] = new ::(h, self)

  override final def toString: String = s"${head} :: ${tail}"

}
