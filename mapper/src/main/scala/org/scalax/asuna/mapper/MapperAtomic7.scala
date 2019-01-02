package org.scalax.asuna.mapper.common7

import scala.language.higherKinds

trait Jinzhi {

  type I
  type J <: Jinzhi

  def head: I
  def higher: J

}

trait Natural {

  type P <: Natural
  type N[T] <: Natural
  type R[T] <: Natural
  type M[T <: Natural] <: Natural

  def tail: P
  def eat[T](xyy: T): N[T]
  def put[T](xyy: T): R[T]
  def plus[T <: Natural](t: T): M[T]

}

class MiaoMiao0 extends Jinzhi with Natural {
  self =>

  override type I = MiaoMiao0
  override type J = MiaoMiao0

  override def head: MiaoMiao0   = self
  override def higher: MiaoMiao0 = self

  override type P               = MiaoMiao0
  override type N[T]            = MiaoMiao1[T]
  override type R[T]            = MiaoMiao1[T]
  override type M[T <: Natural] = T

  override def tail: MiaoMiao0              = self
  override def eat[T](xyy: T): MiaoMiao1[T] = MiaoMiao1(xyy)
  override def put[T](xyy: T): MiaoMiao1[T] = MiaoMiao1(xyy)
  override def plus[T <: Natural](t: T): T  = t
}

case class MiaoMiao1[T1](i1: T1) extends Jinzhi with Natural {
  self =>

  override type I = MiaoMiao1[T1]
  override type J = MiaoMiao0

  override def head: MiaoMiao1[T1] = self
  override def higher: MiaoMiao0   = new MiaoMiao0

  override type P               = MiaoMiao0
  override type N[T]            = MiaoMiao2[T1, T]
  override type R[T]            = MiaoMiao2[T, T1]
  override type M[T <: Natural] = T#R[T1]

  override def tail: MiaoMiao0                   = new MiaoMiao0
  override def eat[T](xyy: T): MiaoMiao2[T1, T]  = MiaoMiao2(i1, xyy)
  override def put[T](xyy: T): MiaoMiao2[T, T1]  = MiaoMiao2(xyy, i1)
  override def plus[T <: Natural](t: T): T#R[T1] = t.put(i1)
}

case class MiaoMiao2[T1, T2](i1: T1, i2: T2) extends Jinzhi with Natural {
  self =>

  override type I = MiaoMiao2[T1, T2]
  override type J = MiaoMiao0

  override def head: MiaoMiao2[T1, T2] = self
  override def higher: MiaoMiao0       = new MiaoMiao0

  override type P               = MiaoMiao1[T1]
  override type N[T]            = MiaoMiao3[T1, T2, T]
  override type R[T]            = MiaoMiao3[T, T1, T2]
  override type M[T <: Natural] = T#R[T2]#R[T1]

  override def tail: MiaoMiao1[T1]                     = MiaoMiao1(i1)
  override def eat[T](xyy: T): MiaoMiao3[T1, T2, T]    = MiaoMiao3(i1, i2, xyy)
  override def put[T](xyy: T): MiaoMiao3[T, T1, T2]    = MiaoMiao3(xyy, i1, i2)
  override def plus[T <: Natural](t: T): T#R[T2]#R[T1] = t.put(i2).put(i1)
}

case class MiaoMiao3[T1, T2, T3](i1: T1, i2: T2, i3: T3) extends Jinzhi with Natural {
  self =>

  override type I = MiaoMiao3[T1, T2, T3]
  override type J = MiaoMiao0

  override def head: MiaoMiao3[T1, T2, T3] = self
  override def higher: MiaoMiao0           = new MiaoMiao0

  override type P               = MiaoMiao2[T1, T2]
  override type N[T]            = MiaoMiao4[T1, T2, T3, T]
  override type R[T]            = MiaoMiao4[T, T1, T2, T3]
  override type M[T <: Natural] = T#R[T3]#R[T2]#R[T1]

  override def tail: MiaoMiao2[T1, T2]                       = MiaoMiao2(i1, i2)
  override def eat[T](xyy: T): MiaoMiao4[T1, T2, T3, T]      = MiaoMiao4(i1, i2, i3, xyy)
  override def put[T](xyy: T): MiaoMiao4[T, T1, T2, T3]      = MiaoMiao4(xyy, i1, i2, i3)
  override def plus[T <: Natural](t: T): T#R[T3]#R[T2]#R[T1] = t.put(i3).put(i2).put(i1)
}

object Abc extends App {

  val i1: String = "1"
  val i2: Short  = 2
  val i3: Int    = 3
  val i4: Long   = 4L

  val z = new MiaoMiao0

  println(z.eat(i1).eat(i2).eat(i3).eat(i4))
  println(z.eat(i1).plus(z).eat(i2).plus(z).plus(z.eat(i3).plus(z.eat(i4))))
  println(z.eat(i1).eat(i2).plus(z.eat(i3).eat(i4)))

}

case class MiaoMiao4[T1, T2, T3, T4](i1: T1, i2: T2, i3: T3, i4: T4) extends Jinzhi with Natural {
  self =>

  override type I = MiaoMiao4[T1, T2, T3, T4]
  override type J = MiaoMiao0

  override def head: MiaoMiao4[T1, T2, T3, T4] = self
  override def higher: MiaoMiao0               = new MiaoMiao0

  override type P               = MiaoMiao3[T1, T2, T3]
  override type N[T]            = MiaoMiao5[T1, T2, T3, T4, T]
  override type R[T]            = MiaoMiao5[T, T1, T2, T3, T4]
  override type M[T <: Natural] = T#R[T4]#R[T3]#R[T2]#R[T1]

  override def tail: MiaoMiao3[T1, T2, T3]                         = MiaoMiao3(i1, i2, i3)
  override def eat[T](xyy: T): MiaoMiao5[T1, T2, T3, T4, T]        = ???
  override def put[T](xyy: T): MiaoMiao5[T, T1, T2, T3, T4]        = ???
  override def plus[T <: Natural](t: T): T#R[T4]#R[T3]#R[T2]#R[T1] = t.put(i4).put(i3).put(i2).put(i1)
}

trait MiaoMiao5[T1, T2, T3, T4, T5] extends Jinzhi with Natural
