package asuna.support.heterogeneous

import scala.language.higherKinds

final class NoData

object NoData {
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

final class HNil extends HList {
  self =>

  override final type Head = NoData
  override final def head: NoData = NoData.value
  override final type Tail = HNil
  override final def tail: HNil = self
  override final type Append[H] = ::[H, HNil]
  override final def ::[H](h: H): ::[H, HNil] = new ::(h, self)
  override final def toString: String         = s"HNil"

}

object HNil {
  final val value: HNil = new HNil
}

final class ::[H, T <: HList](override val head: H, override val tail: T) extends HList {
  self =>

  override final type Head       = H
  override final type Tail       = T
  override final type Append[HH] = ::[HH, ::[H, T]]
  override final def ::[HH](h: HH): ::[HH, ::[H, T]] = new ::(h, self)
  override final def toString: String                = s"${head} :: ${tail}"

}
