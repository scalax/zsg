package zsg.hlist

import java.time.LocalDate

trait HList {

  type Head
  type Tail <: HList
  type Plus[T <: HList] <: HList
  type Add[N] <: HList

  def head: Head
  def tail: Tail
  def plus[T <: HList](h: T): Plus[T]
  def :+:[N](n: N): Add[N]

  override def toString: String = s"${head} :: ${tail}"

}

class ZeroItem

object ZeroItem {
  val value: ZeroItem = new ZeroItem
}

class Zero extends HList {
  self =>

  override type Head             = ZeroItem
  override type Tail             = Zero
  override type Plus[T <: HList] = T
  override type Add[T]           = :+:[T, Zero]

  override def head: ZeroItem             = ZeroItem.value
  override def tail: Zero                 = self
  override def plus[T <: HList](h: T): T  = h
  override def :+:[N](n: N): :+:[N, Zero] = new :+:(n, self)

  override def toString: String = "Zero"

}

object Zero {
  val value: Zero = new Zero
}

class :+:[H, T <: HList](override val head: H, override val tail: T) extends HList {
  self =>

  override type Head                 = H
  override type Tail                 = T
  override type Plus[Other <: HList] = T#Plus[Other#Add[H]]
  override type Add[N]               = :+:[N, :+:[H, T]]

  override def plus[P <: HList](h: P): T#Plus[P#Add[H]] = tail.plus(h.:+:(head))
  override def :+:[N](n: N): :+:[N, :+:[H, T]]          = new :+:(n, self)
}

object Round5 extends App {

  class Item1 {
    override def toString: String = "Item1"
  }
  class Item2 {
    override def toString: String = "Item2"
  }
  class Item3 {
    override def toString: String = "Item3"
  }
  class Item4 {
    override def toString: String = "Item4"
  }
  class Item5 {
    override def toString: String = "Item5"
  }
  class Item6 {
    override def toString: String = "Item6"
  }
  class Item7 {
    override def toString: String = "Item7"
  }

  type HList3 = Item3 :+: Item2 :+: Item1 :+: Zero
  val hlist3: HList3 = new Item3 :+: new Item2 :+: new Item1 :+: Zero.value
  println(hlist3) // Item3 :: Item2 :: Item1 :: Zero

  type HList4 = Item4 :+: Item5 :+: Item6 :+: Item7 :+: Zero
  val hlist4: HList4 = new Item4 :+: new Item5 :+: new Item6 :+: new Item7 :+: Zero.value
  println(hlist4) // Item4 :: Item5 :: Item6 :: Item7 :: Zero

  type HList7 = Item1 :+: Item2 :+: Item3 :+: Item4 :+: Item5 :+: Item6 :+: Item7 :+: Zero
  val hlist7_1: HList7              = hlist3.plus(hlist4)
  val hlist7_2: HList3#Plus[HList4] = hlist3.plus(hlist4)

  println(hlist7_1) // Item1 :: Item2 :: Item3 :: Item4 :: Item5 :: Item6 :: Item7 :: Zero
  println(hlist7_2) // Item1 :: Item2 :: Item3 :: Item4 :: Item5 :: Item6 :: Item7 :: Zero

}
