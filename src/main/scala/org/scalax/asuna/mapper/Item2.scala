import scala.language.higherKinds

trait ItemIO {

  type Current[T, I <: EatItem] <: EatItem

  type UpToPItem1 <: ItemIO
  type UpToPItem2 <: ItemIO
  type UpToTopItem <: ItemIO

  def upToPItem1: UpToPItem1
  def upToPItem2: UpToPItem2
  def upToTopItem: UpToTopItem

  def current[T, I <: EatItem](t: T, i: I): Current[T, I]

}

trait ReplaceTopItemIO[T1 <: ItemIO] extends ItemIO {
  self =>

  override type Current[T, I <: EatItem] = I#Replace[T1#Current[T, I#Sub]]

  override type UpToPItem1  = ReplaceTopItemIO[T1]
  override type UpToPItem2  = ReplaceTopItemIO[T1]
  override type UpToTopItem = ReplaceTopItemIO[T1]

  override def upToPItem1: ReplaceTopItemIO[T1]  = self
  override def upToPItem2: ReplaceTopItemIO[T1]  = self
  override def upToTopItem: ReplaceTopItemIO[T1] = self

  def sub: T1

  override def current[T, I <: EatItem](t: T, i: I): I#Replace[T1#Current[T, I#Sub]] = i.replace(sub.current(t, i.sub))

}

trait ItemValue2TopItemIO[T1 <: ItemIO] extends ItemIO {
  self =>

  override type Current[T, I <: EatItem] = PItem2[I, EatValue1[T]]

  override type UpToPItem1  = ItemValue2TopItemIO[T1]
  override type UpToPItem2  = ItemValue2TopItemIO[T1]
  override type UpToTopItem = ItemValue2TopItemIO[T1]

  override def upToPItem1: ItemValue2TopItemIO[T1]  = self
  override def upToPItem2: ItemValue2TopItemIO[T1]  = self
  override def upToTopItem: ItemValue2TopItemIO[T1] = self

  def sub: T1

  override def current[T, I <: EatItem](t: T, i: I): PItem2[I, EatValue1[T]] = new PItem2(i, new EatValue1(t))

}

trait AppendPItem2TopItemIO[T1 <: ItemIO] extends ItemIO {
  self =>

  override type Current[T, I <: EatItem] = PItem2[I, T1#Current[T, I#Sub]]

  override type UpToPItem1  = AppendPItem2TopItemIO[T1]
  override type UpToPItem2  = AppendPItem2TopItemIO[T1]
  override type UpToTopItem = AppendPItem2TopItemIO[T1]

  override def upToPItem1: AppendPItem2TopItemIO[T1]  = self
  override def upToPItem2: AppendPItem2TopItemIO[T1]  = self
  override def upToTopItem: AppendPItem2TopItemIO[T1] = self

  def sub: T1

  override def current[T, I <: EatItem](t: T, i: I): PItem2[I, T1#Current[T, I#Sub]] = new PItem2(i, sub.current(t, i.sub))

}

trait EatValue1Current extends ItemIO {
  self =>

  override type Current[T, I <: EatItem] = I#Replace[I#Sub#AddItem[T]]

  override type UpToPItem1  = PItem1Current[EatValue1Current]
  override type UpToPItem2  = PItem1Current[EatValue1Current]
  override type UpToTopItem = ReplaceTopItemIO[EatValue1Current]

  override def upToPItem1: PItem1Current[EatValue1Current] = new PItem1Current[EatValue1Current] {
    override val sub = self
  }
  override def upToPItem2: PItem1Current[EatValue1Current] = new PItem1Current[EatValue1Current] {
    override val sub = self
  }
  override def upToTopItem: ReplaceTopItemIO[EatValue1Current] = new ReplaceTopItemIO[EatValue1Current] {
    override val sub = self
  }

  override def current[T, I <: EatItem](t: T, i: I): I#Replace[I#Sub#AddItem[T]] = i.replace(i.sub.addItem(t))

}

object EatValue1Current extends EatValue1Current

trait EatValue2Current extends ItemIO {
  self =>

  override type Current[T, I <: EatItem] = I

  override type UpToPItem1  = EatValue2Current
  override type UpToPItem2  = EatValue2Current
  override type UpToTopItem = ReplaceTopItemIO[EatValue2Current]

  override def upToPItem1: EatValue2Current = self
  override def upToPItem2: EatValue2Current = self
  override def upToTopItem: ReplaceTopItemIO[EatValue2Current] = new ReplaceTopItemIO[EatValue2Current] {
    override val sub = self
  }

  override def current[T, I <: EatItem](t: T, i: I): I = i

}

object EatValue2Current extends EatValue2Current

trait PItem1Current[T1 <: ItemIO] extends ItemIO {
  self =>

  override type Current[T, I <: EatItem] = I#Replace[T1#Current[T, I#Sub]]

  override type UpToPItem1  = PItem1Current[PItem1Current[T1]]
  override type UpToPItem2  = PItem1Current[PItem1Current[T1]]
  override type UpToTopItem = ReplaceTopItemIO[PItem1Current[T1]]

  override def upToPItem1: PItem1Current[PItem1Current[T1]] = new PItem1Current[PItem1Current[T1]] {
    override val sub = self
  }
  override def upToPItem2: PItem1Current[PItem1Current[T1]] = new PItem1Current[PItem1Current[T1]] {
    override val sub = self
  }
  override def upToTopItem: ReplaceTopItemIO[PItem1Current[T1]] = new ReplaceTopItemIO[PItem1Current[T1]] {
    override val sub = self
  }

  def sub: T1

  override def current[T, I <: EatItem](t: T, i: I): I#Replace[T1#Current[T, I#Sub]] = i.replace(sub.current(t, i.sub))

}

trait EatValue1Append extends ItemIO {
  self =>

  override type Current[T, I <: EatItem] = I

  override type UpToPItem1  = EatValue1Append
  override type UpToPItem2  = EatValue1Append
  override type UpToTopItem = ReplaceTopItemIO[EatValue1Append]

  override def upToPItem1: EatValue1Append = self
  override def upToPItem2: EatValue1Append = self
  override def upToTopItem: ReplaceTopItemIO[EatValue1Append] = new ReplaceTopItemIO[EatValue1Append] {
    override val sub = self
  }
  override def current[T, I <: EatItem](t: T, i: I): I = i

}

object EatValue1Append extends EatValue1Append

trait EatValue2Append extends ItemIO {
  self =>

  override type Current[T, I <: EatItem] = EatValue1[T]

  override type UpToPItem1  = PItem1Append[EatValue2Append]
  override type UpToPItem2  = PItem2Append[EatValue2Append]
  override type UpToTopItem = ReplaceTopItemIO[EatValue2Append]

  override def upToPItem1: PItem1Append[EatValue2Append] = new PItem1Append[EatValue2Append] {
    override val sub = self
  }
  override def upToPItem2: PItem2Append[EatValue2Append] = new PItem2Append[EatValue2Append] {
    override val sub = self
  }
  override def upToTopItem: ReplaceTopItemIO[EatValue2Append] = new ReplaceTopItemIO[EatValue2Append] {
    override val sub = self
  }

  override def current[T, I <: EatItem](t: T, i: I): EatValue1[T] = new EatValue1(t)

}

object EatValue2Append extends EatValue2Append

trait PItem1Append[T1 <: ItemIO] extends ItemIO {
  self =>

  override type Current[T, I <: EatItem] = I#Plus[T1#Current[T, I#Sub]]

  override type UpToPItem1  = PItemReplaceAppend[PItem1Append[T1]]
  override type UpToPItem2  = PItemReplaceAppend[PItem1Append[T1]]
  override type UpToTopItem = AppendPItem2TopItemIO[PItem1Append[T1]]

  override def upToPItem1: PItemReplaceAppend[PItem1Append[T1]] = new PItemReplaceAppend[PItem1Append[T1]] {
    override val sub = self
  }
  override def upToPItem2: PItemReplaceAppend[PItem1Append[T1]] = new PItemReplaceAppend[PItem1Append[T1]] {
    override val sub = self
  }
  override def upToTopItem: AppendPItem2TopItemIO[PItem1Append[T1]] = new AppendPItem2TopItemIO[PItem1Append[T1]] {
    override val sub = self
  }

  def sub: T1

  override def current[T, I <: EatItem](t: T, i: I): I#Plus[T1#Current[T, I#Sub]] = i.plus(sub.current(t, i.sub))

}

trait PItem2Append[T1 <: ItemIO] extends ItemIO {
  self =>

  override type Current[T, I <: EatItem] = PItem1[T1#Current[T, I#Sub]]

  override type UpToPItem1  = PItem1Append[PItem2Append[T1]]
  override type UpToPItem2  = PItem2Append[PItem2Append[T1]]
  override type UpToTopItem = AppendPItem2TopItemIO[PItem2Append[T1]]

  override def upToPItem1: PItem1Append[PItem2Append[T1]] = new PItem1Append[PItem2Append[T1]] {
    override val sub = self
  }
  override def upToPItem2: PItem2Append[PItem2Append[T1]] = new PItem2Append[PItem2Append[T1]] {
    override val sub = self
  }
  override def upToTopItem: AppendPItem2TopItemIO[PItem2Append[T1]] = new AppendPItem2TopItemIO[PItem2Append[T1]] {
    override val sub = self
  }

  def sub: T1

  override def current[T, I <: EatItem](t: T, i: I): PItem1[T1#Current[T, I#Sub]] = new PItem1(sub.current(t, i.sub))

}

trait PItemReplaceAppend[T1 <: ItemIO] extends ItemIO {
  self =>

  override type Current[T, I <: EatItem] = I#Replace[T1#Current[T, I#Sub]]

  override type UpToPItem1  = PItemReplaceAppend[PItemReplaceAppend[T1]]
  override type UpToPItem2  = PItemReplaceAppend[PItemReplaceAppend[T1]]
  override type UpToTopItem = AppendPItem2TopItemIO[PItemReplaceAppend[T1]]

  override def upToPItem1: PItemReplaceAppend[PItemReplaceAppend[T1]] = new PItemReplaceAppend[PItemReplaceAppend[T1]] {
    override val sub = self
  }
  override def upToPItem2: PItemReplaceAppend[PItemReplaceAppend[T1]] = new PItemReplaceAppend[PItemReplaceAppend[T1]] {
    override val sub = self
  }
  override def upToTopItem: AppendPItem2TopItemIO[PItemReplaceAppend[T1]] = new AppendPItem2TopItemIO[PItemReplaceAppend[T1]] {
    override val sub = self
  }

  def sub: T1

  override def current[T, I <: EatItem](t: T, i: I): I#Replace[T1#Current[T, I#Sub]] = i.replace(sub.current(t, i.sub))

}

trait AppendType {
  type Replace <: ItemIO
  type Append <: ItemIO

  def replace: Replace
  def append: Append
}

class AppendTypeImpl[R <: ItemIO, A <: ItemIO](override val replace: R, override val append: A) extends AppendType {
  override type Replace = R
  override type Append  = A
}

trait EatItem {

  type Plus[T <: EatItem] <: EatItem
  type Sub <: EatItem
  type Replace[T <: EatItem] <: EatItem
  type AddItem[T] <: EatItem
  type Append <: AppendType

  def sub: Sub
  def plus[T <: EatItem](t: T): Plus[T]
  def replace[T <: EatItem](t: T): Replace[T]
  def addItem[T](t: T): AddItem[T]
  def append: Append

}

class EatValue1[T1](i1: T1) extends EatItem {
  self =>

  override type Plus[T <: EatItem]    = T
  override type Sub                   = EatValue1[T1]
  override type Replace[T <: EatItem] = T
  override type AddItem[T]            = EatValue2[T1, T]
  override type Append                = AppendTypeImpl[EatValue1Current, EatValue1Append]

  override def sub: EatValue1[T1]                 = self
  override def plus[T <: EatItem](t: T): T        = t
  override def replace[T <: EatItem](t: T): T     = t
  override def addItem[T](t: T): EatValue2[T1, T] = new EatValue2(i1, t)
  override def append: AppendTypeImpl[EatValue1Current, EatValue1Append] = {
    new AppendTypeImpl(EatValue1Current, EatValue1Append)
  }

  override def toString: String = s"EatValue1(${i1})"

}

class EatValue2[T1, T2](i1: T1, i2: T2) extends EatItem {
  self =>

  override type Plus[T <: EatItem]    = T
  override type Sub                   = EatValue2[T1, T2]
  override type Replace[T <: EatItem] = T
  override type AddItem[T]            = EatValue2[T1, T2]
  override type Append                = AppendTypeImpl[EatValue2Current, EatValue2Append]

  override def sub: EatValue2[T1, T2]              = self
  override def plus[T](t: T): T                    = t
  override def replace[T <: EatItem](t: T): T      = t
  override def addItem[T](t: T): EatValue2[T1, T2] = self
  override def append: AppendTypeImpl[EatValue2Current, EatValue2Append] = {
    new AppendTypeImpl(EatValue2Current, EatValue2Append)
  }

  override def toString: String = s"EatValue2(${i1}, ${i2})"

}

class PItem1[T1 <: EatItem](i1: T1) extends EatItem {
  self =>

  override type Plus[T <: EatItem]    = PItem2[T1, T]
  override type Sub                   = T1
  override type Replace[T <: EatItem] = PItem1[T]
  override type AddItem[T]            = PItem1[T1]
  override type Append                = AppendTypeImpl[Sub#Append#Replace#UpToPItem1, Sub#Append#Append#UpToPItem2]

  override def sub: T1                                 = i1
  override def plus[T <: EatItem](t: T): PItem2[T1, T] = new PItem2(i1, t)
  override def replace[T <: EatItem](t: T): PItem1[T]  = new PItem1(t)
  override def addItem[T](t: T): PItem1[T1]            = self
  override def append: AppendTypeImpl[Sub#Append#Replace#UpToPItem1, Sub#Append#Append#UpToPItem2] = {
    new AppendTypeImpl(sub.append.replace.upToPItem1, sub.append.append.upToPItem2)
  }

  override def toString: String = s"PItem1(${i1})"

}

class PItem2[T1 <: EatItem, T2 <: EatItem](i1: T1, i2: T2) extends EatItem {
  self =>

  override type Plus[T <: EatItem]    = PItem2[T1, T2]
  override type Sub                   = T2
  override type Replace[T <: EatItem] = PItem2[T1, T]
  override type AddItem[T]            = PItem2[T1, T2]
  override type Append                = AppendTypeImpl[Sub#Append#Replace#UpToPItem1, Sub#Append#Append#UpToPItem2]

  override def sub: T2                                    = i2
  override def plus[T <: EatItem](t: T): PItem2[T1, T2]   = self
  override def replace[T <: EatItem](t: T): PItem2[T1, T] = new PItem2(i1, t)
  override def addItem[T](t: T): PItem2[T1, T2]           = self
  override def append: AppendTypeImpl[Sub#Append#Replace#UpToPItem1, Sub#Append#Append#UpToPItem2] = {
    new AppendTypeImpl(sub.append.replace.upToPItem1, sub.append.append.upToPItem2)
  }

  override def toString: String = s"PItem2(${i1}, ${i2})"

}

trait E[I <: EatItem] extends EatItem {
  self =>

  val item: I

  override type Plus[T <: EatItem]    = E[PItem2[I, T]]
  override type Sub                   = I
  override type Replace[T <: EatItem] = E[T]
  override type AddItem[T]            = Append#Append#Current[T, E[Append#Replace#Current[T, I]]]
  override type Append                = AppendTypeImpl[Sub#Append#Replace, Sub#Append#Append#UpToTopItem]

  override def sub: I = item
  override def plus[T <: EatItem](t: T): E[PItem2[I, T]] = new E[PItem2[I, T]] {
    override val item = new PItem2(self.item, t)
  }
  override def replace[T <: EatItem](t: T): E[T] = new E[T] {
    override val item = t
  }
  override def addItem[T](t: T): Append#Append#Current[T, E[Append#Replace#Current[T, I]]] = {
    append.append.current(t, new E[Append#Replace#Current[T, I]] {
      override val item = self.append.replace.current(t, self.item)
    })
  }
  override def append: AppendTypeImpl[Sub#Append#Replace, Sub#Append#Append#UpToTopItem] = {
    new AppendTypeImpl(sub.append.replace, sub.append.append.upToTopItem)
  }

  override def toString: String = s"E(${item})"

}

object E {
  def value1[T](t: T): E[EatValue1[T]] = new E[EatValue1[T]] {
    override val item = new EatValue1(t)
  }
}

object App extends App {

  val aa = E.value1("123456")
  val bb = aa.addItem("12123154").addItem(123)
  println(bb: String)

}
