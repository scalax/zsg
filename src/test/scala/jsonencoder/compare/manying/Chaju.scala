import scala.language.higherKinds

trait Chaju {

  type Next <: Chaju
  def next: Next

  type M[I <: HList, Item] <: HList
  def tran[I <: HList, Item](m: I, item: Item): M[I, Item]

  type Add <: Chaju
  def add: Add

}

class Manyi extends Chaju {
  self =>

  override type Next = Manyi
  override def next: Manyi = self

  override type M[I <: HList, Item] = I
  override def tran[I <: HList, Item](m: I, item: Item): I = m

  override type Add = ChajuImpl[Manyi]
  override def add: ChajuImpl[Manyi] = new ChajuImpl(self)

}

object Manyi extends Manyi

class ChajuImpl[T <: Chaju](tail: T) extends Chaju {
  self =>

  override type Next = T
  override def next: T = tail

  override type M[I <: HList, Item] = I#Add[Item]
  override def tran[I <: HList, Item](m: I, item: Item): I#Add[Item] = m.add(item)

  override type Add = ChajuImpl[ChajuImpl[T]]
  override def add: ChajuImpl[ChajuImpl[T]] = new ChajuImpl(self)

}
