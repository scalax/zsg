import scala.language.higherKinds

trait AppendType {
  type Current <: CurrentIO
  type Append <: AppendIO

  def current: Current
  def append: Append
}

class AppendTypeImpl[R <: CurrentIO, A <: AppendIO](override val current: R, override val append: A) extends AppendType {
  override type Current = R
  override type Append  = A
}

trait EatItem {

  type Plus[T <: EatItem] <: EatItem
  type Sub <: EatItem
  type Replace[T <: EatItem] <: EatItem
  type AddItem[T] <: EatItem

  type Current <: CurrentIO
  type Append <: AppendIO

  def current: Current
  def append: Append

  def sub: Sub
  def plus[T <: EatItem](t: T): Plus[T]
  def replace[T <: EatItem](t: T): Replace[T]
  def addItem[T](t: T): AddItem[T]

}

trait EatValue0 extends EatItem {
  self =>

  override type Plus[T <: EatItem]    = T
  override type Sub                   = EatValue0
  override type Replace[T <: EatItem] = T
  override type AddItem[T]            = E[EatValue1[T]]

  override type Current = EatValue1Current
  override type Append  = EatValue1Append

  override def current: EatValue1Current = EatValue1Current
  override def append: EatValue1Append   = EatValue1Append

  override def sub: EatValue0                 = self
  override def plus[T <: EatItem](t: T): T    = t
  override def replace[T <: EatItem](t: T): T = t
  override def addItem[T](t: T): E[EatValue1[T]] = new E[EatValue1[T]] {
    override val item = new EatValue1(t)
  }

}

object EatValue0 extends EatValue0

class EatValue1[T1](val i1: T1) extends EatItem {
  self =>

  override type Plus[T <: EatItem]    = T
  override type Sub                   = EatValue1[T1]
  override type Replace[T <: EatItem] = T
  override type AddItem[T]            = EatValue2[T1, T]

  override type Current = EatValue1Current
  override type Append  = EatValue1Append

  override def current: EatValue1Current = EatValue1Current
  override def append: EatValue1Append   = EatValue1Append

  override def sub: EatValue1[T1]                 = self
  override def plus[T <: EatItem](t: T): T        = t
  override def replace[T <: EatItem](t: T): T     = t
  override def addItem[T](t: T): EatValue2[T1, T] = new EatValue2(i1, t)

  override def toString: String = s"EatValue1(${i1})"

}

class EatValue2[T1, T2](val i1: T1, val i2: T2) extends EatItem {
  self =>

  override type Plus[T <: EatItem]    = T
  override type Sub                   = EatValue2[T1, T2]
  override type Replace[T <: EatItem] = T
  override type AddItem[T]            = EatValue2[T1, T2]

  override type Current = EatValue2Current
  override type Append  = EatValue2Append

  override def current: EatValue2Current = EatValue2Current
  override def append: EatValue2Append   = EatValue2Append

  override def sub: EatValue2[T1, T2]              = self
  override def plus[T](t: T): T                    = t
  override def replace[T <: EatItem](t: T): T      = t
  override def addItem[T](t: T): EatValue2[T1, T2] = self

  override def toString: String = s"EatValue2(${i1}, ${i2})"

}

class PItem1[T1 <: EatItem](val i1: T1) extends EatItem {
  self =>

  override type Plus[T <: EatItem]    = PItem2[T1, T]
  override type Sub                   = T1
  override type Replace[T <: EatItem] = PItem1[T]
  override type AddItem[T]            = PItem1[T1]

  override type Current = Sub#Current#UpToPItem1
  override type Append  = Sub#Append#UpToPItem1

  override def current: Sub#Current#UpToPItem1 = sub.current.upToPItem1
  override def append: Sub#Append#UpToPItem1   = sub.append.upToPItem1

  override def sub: T1                                 = i1
  override def plus[T <: EatItem](t: T): PItem2[T1, T] = new PItem2(i1, t)
  override def replace[T <: EatItem](t: T): PItem1[T]  = new PItem1(t)
  override def addItem[T](t: T): PItem1[T1]            = self

  override def toString: String = s"PItem1(${i1})"

}

class PItem2[T1 <: EatItem, T2 <: EatItem](val i1: T1, val i2: T2) extends EatItem {
  self =>

  override type Plus[T <: EatItem]    = PItem2[T1, T2]
  override type Sub                   = T2
  override type Replace[T <: EatItem] = PItem2[T1, T]
  override type AddItem[T]            = PItem2[T1, T2]

  override type Current = Sub#Current#UpToPItem2
  override type Append  = Sub#Append#UpToPItem2

  override def current: Sub#Current#UpToPItem2 = sub.current.upToPItem2
  override def append: Sub#Append#UpToPItem2   = sub.append.upToPItem2

  override def sub: T2                                    = i2
  override def plus[T <: EatItem](t: T): PItem2[T1, T2]   = self
  override def replace[T <: EatItem](t: T): PItem2[T1, T] = new PItem2(i1, t)
  override def addItem[T](t: T): PItem2[T1, T2]           = self

  override def toString: String = s"PItem2(${i1}, ${i2})"

}

trait E[I <: EatItem] extends EatItem {
  self =>

  val item: I

  override type Plus[T <: EatItem]    = E[PItem2[I, T]]
  override type Sub                   = I
  override type Replace[T <: EatItem] = E[T]
  override type AddItem[T]            = Sub#Append#UpToTopItem#Append[T, E[Sub#Current#Current[T, I]]]

  override type Current = Sub#Current
  override type Append  = Sub#Append#UpToTopItem

  override def current: Sub#Current           = sub.current
  override def append: Sub#Append#UpToTopItem = sub.append.upToTopItem

  override def sub: I = item
  override def plus[T <: EatItem](t: T): E[PItem2[I, T]] = new E[PItem2[I, T]] {
    override val item = new PItem2(self.item, t)
  }
  override def replace[T <: EatItem](t: T): E[T] = new E[T] {
    override val item = t
  }
  override def addItem[T](t: T): Sub#Append#UpToTopItem#Append[T, E[Sub#Current#Current[T, I]]] = {
    sub.append.upToTopItem.append(t, new E[Sub#Current#Current[T, I]] {
      override val item = self.sub.current.current(t, self.item)
    })
  }

  override def toString: String = s"E(${item})"

}

object E {
  def value1[T](t: T): E[EatValue1[T]] = new E[EatValue1[T]] {
    override val item = new EatValue1(t)
  }

  val item0: EatValue0 = EatValue0
}

object App extends App {

  val bb = E.item0
    .addItem("123456")
    .addItem("12123154")
    .addItem(123)
    .addItem("1234")
    .addItem(123456)
    .addItem("123456")
    .addItem("123456")
    .addItem("123456")
    .addItem(1234)
    .addItem("123456")
  println(bb)

}
