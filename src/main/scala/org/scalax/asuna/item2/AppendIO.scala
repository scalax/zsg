import scala.language.higherKinds

trait RightAppendIO extends Any {

  type Append[T, I <: EatItem] <: EatItem

  type UpToPItem1 <: RightAppendIO
  type UpToPItem2 <: RightAppendIO
  type UpToTopItem <: RightAppendIO

  def upToPItem1: UpToPItem1
  def upToPItem2: UpToPItem2
  def upToTopItem: UpToTopItem

  def append[T, I <: EatItem](t: T, i: I): Append[T, I]

}

trait EatValue1Append extends Any with RightAppendIO {
  self =>

  override type Append[T, I <: EatItem] = I

  override type UpToPItem1  = EatValue1Append
  override type UpToPItem2  = EatValue1Append
  override type UpToTopItem = EatValue1UpToTopAppend

  override def upToPItem1: EatValue1Append         = self
  override def upToPItem2: EatValue1Append         = self
  override def upToTopItem: EatValue1UpToTopAppend = EatValue1UpToTopAppend

  override def append[T, I <: EatItem](t: T, i: I): I = i

}

object EatValue1Append extends EatValue1Append

trait EatValue1UpToTopAppend extends Any with RightAppendIO {
  self =>

  override type Append[T, I <: EatItem] = I#RightReplace[I#RightSub#AddRightItem[T]]

  override type UpToPItem1  = EatValue1UpToTopAppend
  override type UpToPItem2  = EatValue1UpToTopAppend
  override type UpToTopItem = EatValue1UpToTopAppend

  override def upToPItem1: EatValue1UpToTopAppend  = self
  override def upToPItem2: EatValue1UpToTopAppend  = self
  override def upToTopItem: EatValue1UpToTopAppend = self

  override def append[T, I <: EatItem](t: T, i: I): I#RightReplace[I#RightSub#AddRightItem[T]] = i.rightReplace(i.rightSub.addRightItem(t))

}

object EatValue1UpToTopAppend extends EatValue1UpToTopAppend

trait EatValue2Append extends Any with RightAppendIO {
  self =>

  override type Append[T, I <: EatItem] = EatValue1[T]

  override type UpToPItem1  = PItem1Append[EatValue2Append]
  override type UpToPItem2  = PItem2Append[EatValue2Append]
  override type UpToTopItem = EatValue2UpToTopAppend

  override def upToPItem1: PItem1Append[EatValue2Append] = new PItem1Append[EatValue2Append](self)
  override def upToPItem2: PItem2Append[EatValue2Append] = new PItem2Append[EatValue2Append](self)
  override def upToTopItem: EatValue2UpToTopAppend       = EatValue2UpToTopAppend

  override def append[T, I <: EatItem](t: T, i: I): EatValue1[T] = new EatValue1(t)

}

object EatValue2Append extends EatValue2Append

trait EatValue2UpToTopAppend extends Any with RightAppendIO {
  self =>

  override type Append[T, I <: EatItem] = I#RightPlus[EatValue2Append#Append[T, I#RightSub]]

  override type UpToPItem1  = EatValue2UpToTopAppend
  override type UpToPItem2  = EatValue2UpToTopAppend
  override type UpToTopItem = EatValue2UpToTopAppend

  override def upToPItem1: EatValue2UpToTopAppend  = self
  override def upToPItem2: EatValue2UpToTopAppend  = self
  override def upToTopItem: EatValue2UpToTopAppend = self

  override def append[T, I <: EatItem](t: T, i: I): I#RightPlus[EatValue2Append#Append[T, I#RightSub]] = i.rightPlus(EatValue2Append.append(t, i.rightSub))

}

object EatValue2UpToTopAppend extends EatValue2UpToTopAppend

class PItem1Append[T1 <: RightAppendIO](val sub: T1) extends AnyVal with RightAppendIO {
  self =>

  override type Append[T, I <: EatItem] = I#RightPlus[T1#Append[T, I#RightSub]]

  override type UpToPItem1  = ReplaceAppend[PItem1Append[T1]]
  override type UpToPItem2  = ReplaceAppend[PItem1Append[T1]]
  override type UpToTopItem = ReplaceAppend[PItem1Append[T1]]

  override def upToPItem1: ReplaceAppend[PItem1Append[T1]]  = new ReplaceAppend[PItem1Append[T1]](self)
  override def upToPItem2: ReplaceAppend[PItem1Append[T1]]  = new ReplaceAppend[PItem1Append[T1]](self)
  override def upToTopItem: ReplaceAppend[PItem1Append[T1]] = new ReplaceAppend[PItem1Append[T1]](self)

  override def append[T, I <: EatItem](t: T, i: I): I#RightPlus[T1#Append[T, I#RightSub]] = i.rightPlus(sub.append(t, i.rightSub))

}

class PItem2Append[T1 <: RightAppendIO](val sub: T1) extends AnyVal with RightAppendIO {
  self =>

  override type Append[T, I <: EatItem] = PItem1[T1#Append[T, I#RightSub]]

  override type UpToPItem1  = PItem1Append[PItem2Append[T1]]
  override type UpToPItem2  = PItem2Append[PItem2Append[T1]]
  override type UpToTopItem = TopAppend[PItem2Append[T1]]

  override def upToPItem1: PItem1Append[PItem2Append[T1]] = new PItem1Append[PItem2Append[T1]](self)
  override def upToPItem2: PItem2Append[PItem2Append[T1]] = new PItem2Append[PItem2Append[T1]](self)
  override def upToTopItem: TopAppend[PItem2Append[T1]]   = new TopAppend[PItem2Append[T1]](self)

  override def append[T, I <: EatItem](t: T, i: I): PItem1[T1#Append[T, I#RightSub]] = new PItem1[T1#Append[T, I#RightSub]] {
    override val i1: T1#Append[T, I#RightSub] = self.sub.append(t, i.rightSub)
  }

}

class ReplaceAppend[T1 <: RightAppendIO](val sub: T1) extends AnyVal with RightAppendIO {
  self =>

  override type Append[T, I <: EatItem] = I#RightReplace[T1#Append[T, I#RightSub]]

  override type UpToPItem1  = ReplaceAppend[ReplaceAppend[T1]]
  override type UpToPItem2  = ReplaceAppend[ReplaceAppend[T1]]
  override type UpToTopItem = ReplaceAppend[ReplaceAppend[T1]]

  override def upToPItem1: ReplaceAppend[ReplaceAppend[T1]]  = new ReplaceAppend[ReplaceAppend[T1]](self)
  override def upToPItem2: ReplaceAppend[ReplaceAppend[T1]]  = new ReplaceAppend[ReplaceAppend[T1]](self)
  override def upToTopItem: ReplaceAppend[ReplaceAppend[T1]] = new ReplaceAppend[ReplaceAppend[T1]](self)

  override def append[T, I <: EatItem](t: T, i: I): I#RightReplace[T1#Append[T, I#RightSub]] = i.rightReplace(sub.append(t, i.rightSub))

}

class TopAppend[T1 <: RightAppendIO](val sub: T1) extends AnyVal with RightAppendIO {
  self =>

  override type Append[T, I <: EatItem] = I#RightPlus[T1#Append[T, I#RightSub]]

  override type UpToPItem1  = TopAppend[TopAppend[T1]]
  override type UpToPItem2  = TopAppend[TopAppend[T1]]
  override type UpToTopItem = TopAppend[TopAppend[T1]]

  override def upToPItem1: TopAppend[TopAppend[T1]]  = new TopAppend[TopAppend[T1]](self)
  override def upToPItem2: TopAppend[TopAppend[T1]]  = new TopAppend[TopAppend[T1]](self)
  override def upToTopItem: TopAppend[TopAppend[T1]] = new TopAppend[TopAppend[T1]](self)

  override def append[T, I <: EatItem](t: T, i: I): I#RightPlus[T1#Append[T, I#RightSub]] = i.rightPlus(sub.append(t, i.rightSub))

}
