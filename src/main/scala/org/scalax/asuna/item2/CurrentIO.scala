import scala.language.higherKinds

trait CurrentIO {

  type Current[T, I <: EatItem] <: EatItem

  type UpToPItem1 <: CurrentIO
  type UpToPItem2 <: CurrentIO

  def upToPItem1: UpToPItem1
  def upToPItem2: UpToPItem2

  def current[T, I <: EatItem](t: T, i: I): Current[T, I]

}

trait EatValue1Current extends CurrentIO {
  self =>

  override type Current[T, I <: EatItem] = I#AddItem[T]

  override type UpToPItem1 = ReplaceCurrent[EatValue1Current]
  override type UpToPItem2 = ReplaceCurrent[EatValue1Current]

  override def upToPItem1: ReplaceCurrent[EatValue1Current] = new ReplaceCurrent[EatValue1Current] {
    override val sub = self
  }
  override def upToPItem2: ReplaceCurrent[EatValue1Current] = new ReplaceCurrent[EatValue1Current] {
    override val sub = self
  }

  override def current[T, I <: EatItem](t: T, i: I): I#AddItem[T] = i.addItem(t)

}

object EatValue1Current extends EatValue1Current

trait EatValue2Current extends CurrentIO {
  self =>

  override type Current[T, I <: EatItem] = I

  override type UpToPItem1 = EatValue2Current
  override type UpToPItem2 = EatValue2Current

  override def upToPItem1: EatValue2Current = self
  override def upToPItem2: EatValue2Current = self

  override def current[T, I <: EatItem](t: T, i: I): I = i

}

object EatValue2Current extends EatValue2Current

trait ReplaceCurrent[T1 <: CurrentIO] extends CurrentIO {
  self =>

  override type Current[T, I <: EatItem] = I#Replace[T1#Current[T, I#Sub]]

  override type UpToPItem1 = ReplaceCurrent[ReplaceCurrent[T1]]
  override type UpToPItem2 = ReplaceCurrent[ReplaceCurrent[T1]]

  override def upToPItem1: ReplaceCurrent[ReplaceCurrent[T1]] = new ReplaceCurrent[ReplaceCurrent[T1]] {
    override val sub = self
  }
  override def upToPItem2: ReplaceCurrent[ReplaceCurrent[T1]] = new ReplaceCurrent[ReplaceCurrent[T1]] {
    override val sub = self
  }

  def sub: T1

  override def current[T, I <: EatItem](t: T, i: I): I#Replace[T1#Current[T, I#Sub]] = i.replace(sub.current(t, i.sub))

}
