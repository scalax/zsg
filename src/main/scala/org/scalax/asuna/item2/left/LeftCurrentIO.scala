import scala.language.higherKinds

trait LeftCurrentIO extends Any {

  type Current[T, I <: EatItem] <: EatItem

  type UpToPItem1 <: LeftCurrentIO
  type UpToPItem2 <: LeftCurrentIO

  def upToPItem1: UpToPItem1
  def upToPItem2: UpToPItem2

  def current[T, I <: EatItem](t: T, i: I): Current[T, I]

}

trait LeftEatValue1Current extends Any with LeftCurrentIO {
  self =>

  override type Current[T, I <: EatItem] = I#AddLeftItem[T]

  override type UpToPItem1 = LeftReplaceCurrent[LeftEatValue1Current]
  override type UpToPItem2 = LeftReplaceCurrent[LeftEatValue1Current]

  override def upToPItem1: LeftReplaceCurrent[LeftEatValue1Current] = new LeftReplaceCurrent[LeftEatValue1Current](self)
  override def upToPItem2: LeftReplaceCurrent[LeftEatValue1Current] = new LeftReplaceCurrent[LeftEatValue1Current](self)

  override def current[T, I <: EatItem](t: T, i: I): I#AddLeftItem[T] = i.addLeftItem(t)

}

object LeftEatValue1Current extends LeftEatValue1Current

trait LeftEatValue2Current extends Any with LeftCurrentIO {
  self =>

  override type Current[T, I <: EatItem] = I

  override type UpToPItem1 = LeftEatValue2Current
  override type UpToPItem2 = LeftEatValue2Current

  override def upToPItem1: LeftEatValue2Current = self
  override def upToPItem2: LeftEatValue2Current = self

  override def current[T, I <: EatItem](t: T, i: I): I = i

}

object LeftEatValue2Current extends LeftEatValue2Current

class LeftReplaceCurrent[T1 <: LeftCurrentIO](val sub: T1) extends AnyVal with LeftCurrentIO {
  self =>

  override type Current[T, I <: EatItem] = I#LeftReplace[T1#Current[T, I#LeftSub]]

  override type UpToPItem1 = LeftReplaceCurrent[LeftReplaceCurrent[T1]]
  override type UpToPItem2 = LeftReplaceCurrent[LeftReplaceCurrent[T1]]

  override def upToPItem1: LeftReplaceCurrent[LeftReplaceCurrent[T1]] = new LeftReplaceCurrent[LeftReplaceCurrent[T1]](self)
  override def upToPItem2: LeftReplaceCurrent[LeftReplaceCurrent[T1]] = new LeftReplaceCurrent[LeftReplaceCurrent[T1]](self)

  override def current[T, I <: EatItem](t: T, i: I): I#LeftReplace[T1#Current[T, I#LeftSub]] = i.leftReplace(sub.current(t, i.leftSub))

}
