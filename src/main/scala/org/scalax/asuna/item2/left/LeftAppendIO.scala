import scala.language.higherKinds

trait LeftAppendIO extends Any {

  type Append[T, I <: EatItem] <: EatItem

  type UpToPItem1 <: LeftAppendIO
  type UpToPItem2 <: LeftAppendIO
  type UpToTopItem <: LeftAppendIO

  def upToPItem1: UpToPItem1
  def upToPItem2: UpToPItem2
  def upToTopItem: UpToTopItem

  def append[T, I <: EatItem](t: T, i: I): Append[T, I]

}

trait LeftEatValue1Append extends Any with LeftAppendIO {
  self =>

  override type Append[T, I <: EatItem] = I

  override type UpToPItem1  = LeftEatValue1Append
  override type UpToPItem2  = LeftEatValue1Append
  override type UpToTopItem = LeftEatValue1UpToTopAppend

  override def upToPItem1: LeftEatValue1Append         = self
  override def upToPItem2: LeftEatValue1Append         = self
  override def upToTopItem: LeftEatValue1UpToTopAppend = LeftEatValue1UpToTopAppend

  override def append[T, I <: EatItem](t: T, i: I): I = i

}

object LeftEatValue1Append extends LeftEatValue1Append

trait LeftEatValue1UpToTopAppend extends Any with LeftAppendIO {
  self =>

  override type Append[T, I <: EatItem] = I#LeftReplace[I#LeftSub#AddLeftItem[T]]

  override type UpToPItem1  = LeftEatValue1UpToTopAppend
  override type UpToPItem2  = LeftEatValue1UpToTopAppend
  override type UpToTopItem = LeftEatValue1UpToTopAppend

  override def upToPItem1: LeftEatValue1UpToTopAppend  = self
  override def upToPItem2: LeftEatValue1UpToTopAppend  = self
  override def upToTopItem: LeftEatValue1UpToTopAppend = self

  override def append[T, I <: EatItem](t: T, i: I): I#LeftReplace[I#LeftSub#AddLeftItem[T]] = i.leftReplace(i.leftSub.addLeftItem(t))

}

object LeftEatValue1UpToTopAppend extends LeftEatValue1UpToTopAppend

trait LeftEatValue2Append extends Any with LeftAppendIO {
  self =>

  override type Append[T, I <: EatItem] = EatValue1[T]

  override type UpToPItem1  = LeftPItem1Append[LeftEatValue2Append]
  override type UpToPItem2  = LeftPItem2Append[LeftEatValue2Append]
  override type UpToTopItem = LeftEatValue2UpToTopAppend

  override def upToPItem1: LeftPItem1Append[LeftEatValue2Append] = new LeftPItem1Append[LeftEatValue2Append](self)
  override def upToPItem2: LeftPItem2Append[LeftEatValue2Append] = new LeftPItem2Append[LeftEatValue2Append](self)
  override def upToTopItem: LeftEatValue2UpToTopAppend           = LeftEatValue2UpToTopAppend

  override def append[T, I <: EatItem](t: T, i: I): EatValue1[T] = new EatValue1(t)

}

object LeftEatValue2Append extends LeftEatValue2Append

trait LeftEatValue2UpToTopAppend extends Any with LeftAppendIO {
  self =>

  override type Append[T, I <: EatItem] = I#LeftPlus[EatValue2Append#Append[T, I#LeftSub]]

  override type UpToPItem1  = LeftEatValue2UpToTopAppend
  override type UpToPItem2  = LeftEatValue2UpToTopAppend
  override type UpToTopItem = LeftEatValue2UpToTopAppend

  override def upToPItem1: LeftEatValue2UpToTopAppend  = self
  override def upToPItem2: LeftEatValue2UpToTopAppend  = self
  override def upToTopItem: LeftEatValue2UpToTopAppend = self

  override def append[T, I <: EatItem](t: T, i: I): I#LeftPlus[EatValue2Append#Append[T, I#LeftSub]] = i.leftPlus(EatValue2Append.append(t, i.leftSub))

}

object LeftEatValue2UpToTopAppend extends LeftEatValue2UpToTopAppend

class LeftPItem1Append[T1 <: LeftAppendIO](val sub: T1) extends AnyVal with LeftAppendIO {
  self =>

  override type Append[T, I <: EatItem] = I#LeftPlus[T1#Append[T, I#LeftSub]]

  override type UpToPItem1  = LeftReplaceAppend[LeftPItem1Append[T1]]
  override type UpToPItem2  = LeftReplaceAppend[LeftPItem1Append[T1]]
  override type UpToTopItem = LeftReplaceAppend[LeftPItem1Append[T1]]

  override def upToPItem1: LeftReplaceAppend[LeftPItem1Append[T1]]  = new LeftReplaceAppend[LeftPItem1Append[T1]](self)
  override def upToPItem2: LeftReplaceAppend[LeftPItem1Append[T1]]  = new LeftReplaceAppend[LeftPItem1Append[T1]](self)
  override def upToTopItem: LeftReplaceAppend[LeftPItem1Append[T1]] = new LeftReplaceAppend[LeftPItem1Append[T1]](self)

  override def append[T, I <: EatItem](t: T, i: I): I#LeftPlus[T1#Append[T, I#LeftSub]] = i.leftPlus(sub.append(t, i.leftSub))

}

class LeftPItem2Append[T1 <: LeftAppendIO](val sub: T1) extends AnyVal with LeftAppendIO {
  self =>

  override type Append[T, I <: EatItem] = PItem1[T1#Append[T, I#LeftSub]]

  override type UpToPItem1  = LeftPItem1Append[LeftPItem2Append[T1]]
  override type UpToPItem2  = LeftPItem2Append[LeftPItem2Append[T1]]
  override type UpToTopItem = LeftTopAppend[LeftPItem2Append[T1]]

  override def upToPItem1: LeftPItem1Append[LeftPItem2Append[T1]] = new LeftPItem1Append[LeftPItem2Append[T1]](self)
  override def upToPItem2: LeftPItem2Append[LeftPItem2Append[T1]] = new LeftPItem2Append[LeftPItem2Append[T1]](self)
  override def upToTopItem: LeftTopAppend[LeftPItem2Append[T1]]   = new LeftTopAppend[LeftPItem2Append[T1]](self)

  override def append[T, I <: EatItem](t: T, i: I): PItem1[T1#Append[T, I#LeftSub]] = new PItem1[T1#Append[T, I#LeftSub]] {
    override val i1: T1#Append[T, I#LeftSub] = self.sub.append(t, i.leftSub)
  }

}

class LeftReplaceAppend[T1 <: LeftAppendIO](val sub: T1) extends AnyVal with LeftAppendIO {
  self =>

  override type Append[T, I <: EatItem] = I#LeftReplace[T1#Append[T, I#LeftSub]]

  override type UpToPItem1  = LeftReplaceAppend[LeftReplaceAppend[T1]]
  override type UpToPItem2  = LeftReplaceAppend[LeftReplaceAppend[T1]]
  override type UpToTopItem = LeftReplaceAppend[LeftReplaceAppend[T1]]

  override def upToPItem1: LeftReplaceAppend[LeftReplaceAppend[T1]]  = new LeftReplaceAppend[LeftReplaceAppend[T1]](self)
  override def upToPItem2: LeftReplaceAppend[LeftReplaceAppend[T1]]  = new LeftReplaceAppend[LeftReplaceAppend[T1]](self)
  override def upToTopItem: LeftReplaceAppend[LeftReplaceAppend[T1]] = new LeftReplaceAppend[LeftReplaceAppend[T1]](self)

  override def append[T, I <: EatItem](t: T, i: I): I#LeftReplace[T1#Append[T, I#LeftSub]] = i.leftReplace(sub.append(t, i.leftSub))

}

class LeftTopAppend[T1 <: LeftAppendIO](val sub: T1) extends AnyVal with LeftAppendIO {
  self =>

  override type Append[T, I <: EatItem] = I#LeftPlus[T1#Append[T, I#LeftSub]]

  override type UpToPItem1  = LeftTopAppend[LeftTopAppend[T1]]
  override type UpToPItem2  = LeftTopAppend[LeftTopAppend[T1]]
  override type UpToTopItem = LeftTopAppend[LeftTopAppend[T1]]

  override def upToPItem1: LeftTopAppend[LeftTopAppend[T1]]  = new LeftTopAppend[LeftTopAppend[T1]](self)
  override def upToPItem2: LeftTopAppend[LeftTopAppend[T1]]  = new LeftTopAppend[LeftTopAppend[T1]](self)
  override def upToTopItem: LeftTopAppend[LeftTopAppend[T1]] = new LeftTopAppend[LeftTopAppend[T1]](self)

  override def append[T, I <: EatItem](t: T, i: I): I#LeftPlus[T1#Append[T, I#LeftSub]] = i.leftPlus(sub.append(t, i.leftSub))

}
