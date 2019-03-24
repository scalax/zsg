import scala.language.higherKinds

trait EatItem extends Any {

  type RightPlus[T <: EatItem] <: EatItem
  type RightSub <: EatItem
  type RightReplace[T <: EatItem] <: EatItem
  type AddRightItem[T] <: EatItem

  type RightCurrent <: CurrentIO
  type RightAppend <: AppendIO

  def rightCurrent: RightCurrent
  def rightAppend: RightAppend

  def sub: RightSub
  def plus[T <: EatItem](t: T): RightPlus[T]
  def replace[T <: EatItem](t: T): RightReplace[T]
  def addRightItem[T](t: T): AddRightItem[T]

}

trait EatValue0 extends Any {
  self =>

  type AddRightItem[T]  = E[EatValue1[T]]
  type Add2Item[T1, T2] = E[PItem2[EatValue1[T1], EatValue1[T2]]]

  def addRightItem[T](t: T): E[EatValue1[T]] = new E[EatValue1[T]](new EatValue1(t))
  def add2Item[T1, T2](t1: T1, t2: T2): E[PItem2[EatValue1[T1], EatValue1[T2]]] =
    new E(new PItem2[EatValue1[T1], EatValue1[T2]] {
      override val i1 = new EatValue1(t1)
      override val i2 = new EatValue1(t2)
    })

}

object EatValue0 extends EatValue0

class EatValue1[T1](val i1: T1) extends AnyVal with EatItem {
  self =>

  override type RightPlus[T <: EatItem]    = T
  override type RightSub                   = EatValue1[T1]
  override type RightReplace[T <: EatItem] = T
  override type AddRightItem[T]            = EatValue2[T1, T]

  override type RightCurrent = EatValue1Current
  override type RightAppend  = EatValue1Append

  override def rightCurrent: EatValue1Current = EatValue1Current
  override def rightAppend: EatValue1Append   = EatValue1Append

  override def sub: EatValue1[T1]             = self
  override def plus[T <: EatItem](t: T): T    = t
  override def replace[T <: EatItem](t: T): T = t
  override def addRightItem[T](t: T): EatValue2[T1, T] = new EatValue2[T1, T] {
    override val i1: T1 = self.i1
    override val i2     = t
  }

  override def toString: String = s"EatValue1(${i1})"

}

trait EatValue2[T1, T2] extends Any with EatItem {
  self =>

  def i1: T1
  def i2: T2

  override type RightPlus[T <: EatItem]    = T
  override type RightSub                   = EatValue2[T1, T2]
  override type RightReplace[T <: EatItem] = T
  override type AddRightItem[T]            = EatValue2[T1, T2]

  override type RightCurrent = EatValue2Current
  override type RightAppend  = EatValue2Append

  override def rightCurrent: EatValue2Current = EatValue2Current
  override def rightAppend: EatValue2Append   = EatValue2Append

  override def sub: EatValue2[T1, T2]                   = self
  override def plus[T](t: T): T                         = t
  override def replace[T <: EatItem](t: T): T           = t
  override def addRightItem[T](t: T): EatValue2[T1, T2] = self

  override def toString: String = s"EatValue2(${i1}, ${i2})"

}

trait PItem1[T1 <: EatItem] extends Any with EatItem {
  self =>

  def i1: T1

  override type RightPlus[T <: EatItem]    = PItem2[T1, T]
  override type RightSub                   = T1
  override type RightReplace[T <: EatItem] = PItem1[T]
  override type AddRightItem[T]            = PItem1[T1]

  override type RightCurrent = RightSub#RightCurrent#UpToPItem1
  override type RightAppend  = RightSub#RightAppend#UpToPItem1

  override def rightCurrent: RightSub#RightCurrent#UpToPItem1 = sub.rightCurrent.upToPItem1
  override def rightAppend: RightSub#RightAppend#UpToPItem1   = sub.rightAppend.upToPItem1

  override def sub: T1 = i1
  override def plus[T <: EatItem](t: T): PItem2[T1, T] = new PItem2[T1, T] {
    override val i1 = self.i1
    override val i2 = t
  }
  override def replace[T <: EatItem](t: T): PItem1[T] = new PItem1[T] {
    override val i1 = t
  }
  override def addRightItem[T](t: T): PItem1[T1] = self

  override def toString: String = s"PItem1(${i1})"

}

trait PItem2[T1 <: EatItem, T2 <: EatItem] extends Any with EatItem {
  self =>

  def i1: T1
  def i2: T2

  override type RightPlus[T <: EatItem]    = PItem2[T1, T2]
  override type RightSub                   = T2
  override type RightReplace[T <: EatItem] = PItem2[T1, T]
  override type AddRightItem[T]            = PItem2[T1, T2]

  override type RightCurrent = RightSub#RightCurrent#UpToPItem2
  override type RightAppend  = RightSub#RightAppend#UpToPItem2

  override def rightCurrent: RightSub#RightCurrent#UpToPItem2 = sub.rightCurrent.upToPItem2
  override def rightAppend: RightSub#RightAppend#UpToPItem2   = sub.rightAppend.upToPItem2

  override def sub: T2                                  = i2
  override def plus[T <: EatItem](t: T): PItem2[T1, T2] = self
  override def replace[T <: EatItem](t: T): PItem2[T1, T] = new PItem2[T1, T] {
    override val i1 = self.i1
    override val i2 = t
  }
  override def addRightItem[T](t: T): PItem2[T1, T2] = self

  override def toString: String = s"PItem2(${i1}, ${i2})"

}

class E[I <: EatItem](val item: I) extends EatItem {
  self =>

  override type RightPlus[T <: EatItem]    = E[PItem2[I, T]]
  override type RightSub                   = I
  override type RightReplace[T <: EatItem] = E[T]
  override type AddRightItem[T]            = RightSub#RightAppend#UpToTopItem#Append[T, E[RightSub#RightCurrent#Current[T, I]]]

  override type RightCurrent = RightSub#RightCurrent
  override type RightAppend  = RightSub#RightAppend#UpToTopItem

  override def rightCurrent: RightSub#RightCurrent           = sub.rightCurrent
  override def rightAppend: RightSub#RightAppend#UpToTopItem = sub.rightAppend.upToTopItem

  override def sub: I = item
  override def plus[T <: EatItem](t: T): E[PItem2[I, T]] =
    new E(new PItem2[I, T] {
      override val i1: I = self.item
      override val i2    = t
    })
  override def replace[T <: EatItem](t: T): E[T] = new E(t)
  override def addRightItem[T](t: T): RightSub#RightAppend#UpToTopItem#Append[T, E[RightSub#RightCurrent#Current[T, I]]] = {
    sub.rightAppend.upToTopItem.append(t, new E(self.sub.rightCurrent.current(t, self.item)))
  }

  override def toString: String = s"E(${item})"

}

object E {
  def value1[T](t: T): E[EatValue1[T]] = new E(new EatValue1(t))

  val item0: EatValue0 = EatValue0
}

object App extends App {

  val bb = E.item0
    .addRightItem("123456")
    .addRightItem("12123154")
    .addRightItem(123)
    .addRightItem("1234")
    .addRightItem(123456)
    .addRightItem("123456")
    .addRightItem("123456")
    .addRightItem("123456")
    .addRightItem(1234)
    .addRightItem("123456")
  println(bb)

}
