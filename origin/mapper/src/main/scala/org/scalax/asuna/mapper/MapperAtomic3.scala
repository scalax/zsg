package org.scalax.asuna.mapper.common3;
import scala.language.higherKinds;

/*trait Bingfeng {
  type Head
  type Tail <: Bingfeng

  def head: Head
  def tail: Tail
}

trait Bingfeng0 extends Bingfeng {
  self =>
  type B0 <: Bingfeng0

  type Head = B0
  type Tail = B0

  def head: B0
  def tail: B0
}

trait Bingfeng1 extends Bingfeng {
  type B0 <: Bingfeng0

  override type Head
  override type Tail = B0

  override def head: Head
  override def tail: B0
}

trait Bingfeng2 extends Bingfeng {
  type B1 <: Bingfeng1

  override type Head
  override type Tail = B1

  override def head: Head
  override def tail: B1
}

trait Bingfeng3 extends Bingfeng {
  type B2 <: Bingfeng2

  override type Head
  override type Tail = B2

  override def head: Head
  override def tail: B2
}

trait Bingfeng4 extends Bingfeng {
  type B3 <: Bingfeng3

  override type Head
  override type Tail = B3

  override def head: Head
  override def tail: B3
}*/

trait Bingbing

trait Bingbing0 extends Bingbing {
  self =>
}

trait Bingbing1[T1] extends Bingbing0 {
  self =>
  def i1: T1
}

trait Bingbing2[T1, T2] extends Bingbing1[T1] {
  self =>
  override def i1: T1
  def i2: T2
}

trait Bingbing3[T1, T2, T3] extends Bingbing2[T1, T2] {
  self =>
  override def i1: T1
  override def i2: T2
  def i3: T3
}

trait Bingbing4[T1, T2, T3, T4] extends Bingbing3[T1, T2, T3] {
  self =>
  override def i1: T1
  override def i2: T2
  override def i3: T3
  def i4: T4
}
