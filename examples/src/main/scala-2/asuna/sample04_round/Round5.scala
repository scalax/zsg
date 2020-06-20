package zsg.hlist

trait HList {

  type Head
  type Tail <: HList
  type Plus[T <: HList] <: HList
  type Add[N] <: HList
  type RePlus[P <: HList] <: HList

  def head: Head
  def tail: Tail
  def plus[T <: HList](h: T): Plus[T]
  def add[N](n: N): Add[N]
  def rePlus[T <: HList](h: T): RePlus[T]

}

class ZeroItem

object ZeroItem {
  val value: ZeroItem = new ZeroItem
}

class Zero extends HList {
  self =>

  override type Head               = ZeroItem
  override type Tail               = Zero
  override type Plus[T <: HList]   = T
  override type Add[T]             = Appendable[T, Zero]
  override type RePlus[P <: HList] = P

  override def head: ZeroItem                    = ZeroItem.value
  override def tail: Zero                        = self
  override def plus[T <: HList](h: T): T         = h
  override def add[N](n: N): Appendable[N, Zero] = new Appendable(n, self)
  override def rePlus[T <: HList](h: T): T       = h

  override def toString: String = "Zero"

}

object Zero {
  val value: Zero = new Zero
}

class Appendable[H, T <: HList](override val head: H, override val tail: T) extends HList {
  self =>

  override type Head               = H
  override type Tail               = T
  override type Plus[P <: HList]   = T#Plus[P]#Add[H]
  override type RePlus[P <: HList] = P#Plus[Appendable[H, T]]
  override type Add[N]             = Appendable[N, Appendable[H, T]]

  override def plus[P <: HList](h: P): T#Plus[P]#Add[H]           = tail.plus(h).add(head)
  override def add[N](n: N): Appendable[N, Appendable[H, T]]      = new Appendable(n, self)
  override def rePlus[P <: HList](h: P): P#Plus[Appendable[H, T]] = h.plus(self)

  override def toString: String = s"${tail} , ${head}"

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

  type HList3 = Zero#Add[Item1]#Add[Item2]#Add[Item3]
  val hlist3: HList3 = Zero.value.add(new Item1).add(new Item2).add(new Item3)
  println(hlist3) // Zero , Item1 , Item2 , Item3

  type HList4 = Zero#Add[Item4]#Add[Item5]#Add[Item6]#Add[Item7]
  val hlist4: HList4 = Zero.value.add(new Item4).add(new Item5).add(new Item6).add(new Item7)
  println(hlist4) // Zero , Item4 , Item5 , Item6 , Item7

  type HList7 = Zero#Add[Item1]#Add[Item2]#Add[Item3]#Add[Item4]#Add[Item5]#Add[Item6]#Add[Item7]
  val hlist7_1: HList7                = hlist4.plus(hlist3)
  val hlist7_2: HList3#Plus[HList4]   = hlist3.plus(hlist4)
  val hlist7_3: HList3#Plus[HList4]   = hlist4.rePlus(hlist3)
  val hlist7_4: HList3#RePlus[HList4] = hlist3.rePlus(hlist4)
  hlist7_4: HList7

  println(hlist7_1) // Zero , Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7
  println(hlist7_2) // Zero , Item4 , Item5 , Item6 , Item7 , Item1 , Item2 , Item3
  println(hlist7_3) // Zero , Item4 , Item5 , Item6 , Item7 , Item1 , Item2 , Item3
  println(hlist7_4) // Zero , Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7

  type II = HList3#RePlus[HList4]#RePlus[HList3#RePlus[HList4]]#RePlus[HList3#RePlus[HList4]]#RePlus[HList3#RePlus[HList4]]
  val ii: II = hlist3.rePlus(hlist4).rePlus(hlist3.rePlus(hlist4)).rePlus(hlist3.rePlus(hlist4)).rePlus(hlist3.rePlus(hlist4))

  type BB = II#RePlus[II]#RePlus[II]#RePlus[II]#RePlus[HList7]
  val bb = ii.rePlus(ii).rePlus(ii).rePlus(ii).rePlus(hlist7_4)

  bb: HList7#RePlus[HList7]#RePlus[HList7]#RePlus[HList7]#RePlus[HList7]#RePlus[HList7]#RePlus[HList7]#RePlus[HList7]#RePlus[HList7]#RePlus[HList7]#RePlus[HList7]#RePlus[
    HList7
  ]#RePlus[HList7]#RePlus[HList7]#RePlus[HList7]#RePlus[HList7]#RePlus[HList7]
  println(bb)
/* Zero , Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 ,
Item1 , Item2 , Item3 , Item4 , Item5 , Item6 , Item7 */

}
