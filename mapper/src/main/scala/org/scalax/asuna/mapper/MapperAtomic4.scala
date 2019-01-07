package org.scalax.asuna.mapper.common3;
import scala.language.higherKinds;

trait Shuidi[R <: RM] extends Bingbing

trait Shuidi0[R <: RM] extends Shuidi[R] with Bingbing0

trait Shuidi1[R <: RM, T1 <: Item] extends Shuidi0[R] with Bingbing1[R#IM[T1]] {
  override def i1: R#IM[T1]
}

trait Shuidi2[R <: RM, T1 <: Item, T2 <: Item] extends Shuidi1[R, T1] with Bingbing2[R#IM[T1], R#IM[T2]] {
  override def i1: R#IM[T1]
  override def i2: R#IM[T2]
}

trait Shuidi3[R <: RM, T1 <: Item, T2 <: Item, T3 <: Item] extends Shuidi2[R, T1, T2] with Bingbing3[R#IM[T1], R#IM[T2], R#IM[T3]] {
  override def i1: R#IM[T1]
  override def i2: R#IM[T2]
  override def i3: R#IM[T3]
}

trait Shuidi4[R <: RM, T1 <: Item, T2 <: Item, T3 <: Item, T4 <: Item] extends Shuidi3[R, T1, T2, T3] with Bingbing4[R#IM[T1], R#IM[T2], R#IM[T3], R#IM[T4]] {
  override def i1: R#IM[T1]
  override def i2: R#IM[T2]
  override def i3: R#IM[T3]
  override def i4: R#IM[T4]
}

trait Append[R <: RM, T, A <: Item] {
  def add(t: T): R#IM[A]
}

trait Context[R <: RM] {
  self =>

  def map[T1 <: Item, T2 <: Item](a1: R#IM[T1], a2: R#IM[T2]): R#IM[Item2[T1, T2]]

}

trait RM {
  type IM[_ <: Item]
}

trait Item {
  type Model
  type Sub <: Item
}

trait ZeroItem {
  type Model = ZeroItem
  type Sub   = ZeroItem
}

trait Item2[I1 <: Item, I2 <: Item] extends Item {
  override type Model = Bingbing2[I1#Model, I2#Model]
  override type Sub   = Item2[I1#Sub, I2#Sub]
}
