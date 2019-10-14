package asuna

import scala.language.higherKinds

trait HList {

  type Head

  def head: Head

  type Tail <: HList

  def tail: Tail

  type Append[H]

  def ::[H](h: H): Append[H]

}

class HNil extends HList {
  self =>

  override type Head = NoData

  override def head: NoData = NoData.value

  override type Tail = HNil

  override def tail: HNil = HNil

  override type Append[H] = ::[H, HNil]

  override def ::[H](h: H): ::[H, HNil] = new ::(h, self)

  override def toString: String = s"HNil"

}

object HNil extends HNil

class ::[H, T <: HList](override val head: H, override val tail: T) extends HList {
  self =>

  override type Head = H
  override type Tail = T

  override type Append[HH] = ::[HH, ::[H, T]]

  override def ::[HH](h: HH): ::[HH, ::[H, T]] = new ::(h, self)

  override def toString: String = s"${head} :: ${tail}"

}

object i {

  def main(ii: Array[String]): Unit = {
    val a1                                         = "123"
    val a2                                         = 456
    val a3                                         = 789
    val a4                                         = "101112"
    val a5: String :: Int :: Int :: String :: HNil = a4 :: a3 :: a2 :: a1 :: HNil
    println(a5.toString)
  }

}
