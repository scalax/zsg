import scala.language.higherKinds

import shapeless._

object ThirdTest extends App {

  trait HListTran {

    type Next <: HListTran
    def next: Next

    type M[I <: HList, Item] <: HList
    def tran[I <: HList, Item](m: I, item: Item): M[I, Item]

    type Add <: HListTran
    def add: Add

  }

  class ZeroTran extends HListTran {
    self =>

    override type Next = ZeroTran
    override def next: ZeroTran = self

    override type M[I <: HList, Item] = I
    override def tran[I <: HList, Item](m: I, item: Item): I = m

    override type Add = AddTran[ZeroTran]
    override def add: AddTran[ZeroTran] = new AddTran(ZeroTran)

  }

  object ZeroTran extends ZeroTran

  class AddTran[T <: HListTran](tail: T) extends HListTran {
    self =>
    
    override type Next = T
    override def next: T = tail

    override type M[I <: HList, Item] = Item :: I
    override def tran[I <: HList, Item](m: I, item: Item): Item :: I = item :: m

    override type Add = AddTran[AddTran[T]]
    override def add: AddTran[AddTran[T]] = new AddTran(self)

  }

  trait HListM {
    type II <: HList
    type BB <: HListTran
    def hlist: II
    def tran: BB

    type Add[T] <: HListM
    def add[T](t: T): Add[T]

    override def toString: String = hlist.toString
  }

  class HListMImpl[I <: HList, B <: HListTran](override val hlist: I, override val tran: B) extends HListM {
    override type II = I
    override type BB = B

    override type Add[Item] = HListMImpl[BB#M[II, Item], BB#Next]
    override def add[Item](item: Item): HListMImpl[BB#M[II, Item], BB#Next] = new HListMImpl(tran.tran(hlist, item), tran.next)
  }

  object HListMImpl extends HListMImpl(HNil, ZeroTran.add.add.add.add)

  val item = HListMImpl.add(1).add("个").add("喵喵喵").add("满").add("自").add("溢").add("的").add("HList")
  println(item.toString)
  val b: String :: String :: String :: Int :: HNil = item.hlist //检查类型

}
