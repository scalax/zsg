package org.scalax.asuna.mapper.item

import scala.language.higherKinds

trait RightDropIO extends Any {

  type Drop[I <: PItem1PP] <: PItem1PP

  type UpToPItem1 <: RightDropIO
  type UpToPItem2 <: RightDropIO
  type UpToTopItem <: RightDropIO

  def upToPItem1: UpToPItem1
  def upToPItem2: UpToPItem2
  def upToTopItem: UpToTopItem

  def drop[I <: PItem1PP](i: I): Drop[I]

}

trait EatValue1RightDropIO extends Any with RightDropIO {
  self =>

  override type Drop[I <: PItem1PP] = NotUse

  override type UpToPItem1  = PItem1RightDropIO
  override type UpToPItem2  = PDropIO
  override type UpToTopItem = NotUsedDropIO

  override def upToPItem1: PItem1RightDropIO = PItem1RightDropIO
  override def upToPItem2: PDropIO           = PDropIO
  override def upToTopItem: NotUsedDropIO    = NotUsedDropIO

  override def drop[I <: PItem1PP](i: I): NotUse = NotUse

}

object EatValue1RightDropIO extends EatValue1RightDropIO

trait EatValue2RightDropIO extends Any with RightDropIO {
  self =>

  override type Drop[I <: PItem1PP] = I#RightDrop

  override type UpToPItem1  = ReplaceDropIO1111[EatValue2RightDropIO]
  override type UpToPItem2  = ReplaceDropIO1111[EatValue2RightDropIO]
  override type UpToTopItem = EatValue2UpToTopDropIO

  override def upToPItem1: ReplaceDropIO1111[EatValue2RightDropIO] = new ReplaceDropIO1111[EatValue2RightDropIO](self)
  override def upToPItem2: ReplaceDropIO1111[EatValue2RightDropIO] = new ReplaceDropIO1111[EatValue2RightDropIO](self)
  override def upToTopItem: EatValue2UpToTopDropIO                 = EatValue2UpToTopDropIO

  override def drop[I <: PItem1PP](i: I): I#RightDrop = i.rightDrop

}

object EatValue2RightDropIO extends EatValue2RightDropIO

class EatValue2UpToTopDropIO extends RightDropIO {

  override type Drop[I <: PItem1PP] = I#RightReplace[I#RightSub#RightDrop]

  override type UpToPItem1  = NotUsedDropIO
  override type UpToPItem2  = NotUsedDropIO
  override type UpToTopItem = NotUsedDropIO

  override def upToPItem1: NotUsedDropIO  = NotUsedDropIO
  override def upToPItem2: NotUsedDropIO  = NotUsedDropIO
  override def upToTopItem: NotUsedDropIO = NotUsedDropIO

  override def drop[I <: PItem1PP](i: I): I#RightReplace[I#RightSub#RightDrop] = i.rightReplace(i.rightSub.rightDrop)

}

object EatValue2UpToTopDropIO extends EatValue2UpToTopDropIO

class PItem1RightDropIO extends RightDropIO {
  self =>

  override type Drop[I <: PItem1PP] = NotUse

  override type UpToPItem1  = PItem1RightDropIO
  override type UpToPItem2  = PDropIO
  override type UpToTopItem = PItem1UpToTopDropIO

  override def upToPItem1: PItem1RightDropIO    = self
  override def upToPItem2: PDropIO              = PDropIO
  override def upToTopItem: PItem1UpToTopDropIO = PItem1UpToTopDropIO

  override def drop[I <: PItem1PP](i: I): NotUse = NotUse

}

object PItem1RightDropIO extends PItem1RightDropIO

class PItem1UpToTopDropIO extends RightDropIO {

  override type Drop[I <: PItem1PP] = I#RightDrop

  override type UpToPItem1  = NotUsedDropIO
  override type UpToPItem2  = NotUsedDropIO
  override type UpToTopItem = NotUsedDropIO

  override def upToPItem1: NotUsedDropIO  = NotUsedDropIO
  override def upToPItem2: NotUsedDropIO  = NotUsedDropIO
  override def upToTopItem: NotUsedDropIO = NotUsedDropIO

  override def drop[I <: PItem1PP](i: I): I#RightDrop = i.rightDrop

}

object PItem1UpToTopDropIO extends PItem1UpToTopDropIO

class PDropIO extends RightDropIO {
  self =>

  override type Drop[I <: PItem1PP] = I#RightDrop

  override type UpToPItem1  = ReplaceDropIO[PDropIO]
  override type UpToPItem2  = ReplaceDropIO[PDropIO]
  override type UpToTopItem = ReplaceDropIO1111[PDropIO]

  override def upToPItem1: ReplaceDropIO[PDropIO]      = new ReplaceDropIO[PDropIO](self)
  override def upToPItem2: ReplaceDropIO[PDropIO]      = new ReplaceDropIO[PDropIO](self)
  override def upToTopItem: ReplaceDropIO1111[PDropIO] = new ReplaceDropIO1111[PDropIO](self)

  override def drop[I <: PItem1PP](i: I): I#RightDrop = i.rightDrop

}

object PDropIO extends PDropIO

class ReplaceDropIO1111[T1 <: RightDropIO](val sub: T1) extends AnyVal with RightDropIO {
  self =>

  override type Drop[I <: PItem1PP] = I#RightReplace[T1#Drop[I#RightSub]]

  override type UpToPItem1  = ReplaceDropIO1111[ReplaceDropIO1111[T1]]
  override type UpToPItem2  = ReplaceDropIO1111[ReplaceDropIO1111[T1]]
  override type UpToTopItem = ReplaceDropIO1111[ReplaceDropIO1111[T1]]

  override def upToPItem1: ReplaceDropIO1111[ReplaceDropIO1111[T1]]  = new ReplaceDropIO1111[ReplaceDropIO1111[T1]](self)
  override def upToPItem2: ReplaceDropIO1111[ReplaceDropIO1111[T1]]  = new ReplaceDropIO1111[ReplaceDropIO1111[T1]](self)
  override def upToTopItem: ReplaceDropIO1111[ReplaceDropIO1111[T1]] = new ReplaceDropIO1111[ReplaceDropIO1111[T1]](self)

  override def drop[I <: PItem1PP](i: I): I#RightReplace[T1#Drop[I#RightSub]] = i.rightReplace(sub.drop(i.rightSub))

}

class ReplaceDropIO[T1 <: RightDropIO](val sub: T1) extends AnyVal with RightDropIO {
  self =>

  override type Drop[I <: PItem1PP] = I#RightReplace[T1#Drop[I#RightSub]]

  override type UpToPItem1  = ReplaceDropIO1111[ReplaceDropIO[T1]]
  override type UpToPItem2  = ReplaceDropIO1111[ReplaceDropIO[T1]]
  override type UpToTopItem = ReplaceDropIO1111[ReplaceDropIO[T1]]

  override def upToPItem1: ReplaceDropIO1111[ReplaceDropIO[T1]]  = new ReplaceDropIO1111[ReplaceDropIO[T1]](self)
  override def upToPItem2: ReplaceDropIO1111[ReplaceDropIO[T1]]  = new ReplaceDropIO1111[ReplaceDropIO[T1]](self)
  override def upToTopItem: ReplaceDropIO1111[ReplaceDropIO[T1]] = new ReplaceDropIO1111[ReplaceDropIO[T1]](self)

  override def drop[I <: PItem1PP](i: I): I#RightReplace[T1#Drop[I#RightSub]] = i.rightReplace(sub.drop(i.rightSub))

}
