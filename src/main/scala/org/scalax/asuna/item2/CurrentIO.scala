import scala.language.higherKinds

trait CurrentIO extends Any {

  type Current[T, I <: EatItem] <: EatItem

  type UpToPItem1 <: CurrentIO
  type UpToPItem2 <: CurrentIO

  def upToPItem1: UpToPItem1
  def upToPItem2: UpToPItem2

  def current[T, I <: EatItem](t: T, i: I): Current[T, I]

}

trait EatValue1Current extends Any with CurrentIO {
  self =>

  override type Current[T, I <: EatItem] = I#AddRightItem[T]

  override type UpToPItem1 = ReplaceCurrent[EatValue1Current]
  override type UpToPItem2 = ReplaceCurrent[EatValue1Current]

  override def upToPItem1: ReplaceCurrent[EatValue1Current] = new ReplaceCurrent[EatValue1Current](self)
  override def upToPItem2: ReplaceCurrent[EatValue1Current] = new ReplaceCurrent[EatValue1Current](self)

  override def current[T, I <: EatItem](t: T, i: I): I#AddRightItem[T] = i.addRightItem(t)

}

object EatValue1Current extends EatValue1Current

trait EatValue2Current extends Any with CurrentIO {
  self =>

  override type Current[T, I <: EatItem] = I

  override type UpToPItem1 = EatValue2Current
  override type UpToPItem2 = EatValue2Current

  override def upToPItem1: EatValue2Current = self
  override def upToPItem2: EatValue2Current = self

  override def current[T, I <: EatItem](t: T, i: I): I = i

}

object EatValue2Current extends EatValue2Current

class ReplaceCurrent[T1 <: CurrentIO](val sub: T1) extends AnyVal with CurrentIO {
  self =>

  override type Current[T, I <: EatItem] = I#RightReplace[T1#Current[T, I#RightSub]]

  override type UpToPItem1 = ReplaceCurrent[ReplaceCurrent[T1]]
  override type UpToPItem2 = ReplaceCurrent[ReplaceCurrent[T1]]

  override def upToPItem1: ReplaceCurrent[ReplaceCurrent[T1]] = new ReplaceCurrent[ReplaceCurrent[T1]](self)
  override def upToPItem2: ReplaceCurrent[ReplaceCurrent[T1]] = new ReplaceCurrent[ReplaceCurrent[T1]](self)

  override def current[T, I <: EatItem](t: T, i: I): I#RightReplace[T1#Current[T, I#RightSub]] = i.replace(sub.current(t, i.sub))

}
