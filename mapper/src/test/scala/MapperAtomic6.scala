package org.scalax.asuna.mapper.common7

import scala.language.higherKinds

trait Jinyi[Zuiqian, Zuihou, Gewei <: Natural, Shiwei <: Natural, Sheru <: Natural, Shangyige <: Natural] extends Natural {
  self =>

  override type I   = Gewei
  override type J   = Shiwei
  override type Ten = Sheru

  override def head: Gewei
  override def higher: Shiwei

  override type H = Zuiqian
  override type L = Zuihou

  override def zuiqian: H
  override def zuihou: L

  type P = Shangyige

  def tail: P
  def eat[T](xyy: T): N[T]
  def put[T](xyy: T): R[T]
  def plus[T <: Natural](t: T): M[T]

}

abstract class Bingfeng[Zuiqian, Zuihou, Gewei <: Natural, Shiwei <: Natural, Sheru <: Natural, Shangyige <: Natural](override val higher: Shiwei,
                                                                                                                      override val head: Gewei)
    extends Jinyi[Zuiqian, Zuihou, Gewei, Shiwei, Sheru, Shangyige] {
  self =>

  type N[T]            = Bingfeng[H, T, I#N[T]#I, Ten#M[I#N[T]]#J, Ten#M[I#N[T]]#Ten, Jinyi[H, L, I, J, Ten, P]]
  type R[T]            = Bingfeng[T, L, Ten#R[T]#I#M[I]#I, Ten#R[T]#J, Ten#R[T]#M[I]#Ten, Ten#R[T]#M[I#P]]
  type M[T <: Natural] = Ten#M[I#M[T]]

  override def zuiqian: Zuiqian
  override def zuihou: Zuihou
  override def tail: Shangyige

  override def eat[T](xyy: T): Bingfeng[H, T, I#N[T]#I, Ten#M[I#N[T]]#J, Ten#M[I#N[T]]#Ten, Jinyi[H, L, I, J, Ten, P]] = {
    val g: I#N[T]        = head.eat(xyy)
    val h: Ten#M[I#N[T]] = ten.plus(g)
    new Bingfeng[H, T, I#N[T]#I, Ten#M[I#N[T]]#J, Ten#M[I#N[T]]#Ten, Jinyi[H, L, I, J, Ten, P]](h.higher, g.head) {
      override def zuiqian = self.zuiqian
      override def zuihou  = xyy
      override def tail    = self
      override def ten     = h.ten
    }
  }

  override def put[T](xyy: T): Bingfeng[T, Zuihou, Sheru#R[T]#I#M[Gewei]#I, Sheru#R[T]#J, Sheru#R[T]#M[Gewei]#Ten, Sheru#R[T]#M[Gewei#P]] = {
    val g: Sheru#R[T]             = ten.put(xyy)
    val g1: Sheru#R[T]#I#M[Gewei] = g.head.plus(head)
    new Bingfeng[T, Zuihou, Sheru#R[T]#I#M[Gewei]#I, Sheru#R[T]#J, Sheru#R[T]#M[Gewei]#Ten, Sheru#R[T]#M[Gewei#P]](ten.put(xyy).higher, g1.head) {
      override def zuiqian = xyy
      override def zuihou  = self.zuihou
      override def tail    = g.plus(self.head.tail)
      override def ten     = g.plus(self.head).ten
    }
  }

  override def plus[T <: Natural](t: T): Sheru#M[Gewei#M[T]] = {
    ten.plus(head.plus(t))
  }

  override def ten: Sheru

  override def toString: String = {
    s"Bingfeng(${higher},${head})"
  }

}

trait Natural {

  type I <: Natural
  type J <: Natural
  type Ten <: Natural

  def head: I
  def higher: J

  type P <: Natural
  type N[T] <: Natural
  type R[T] <: Natural
  type M[T <: Natural] <: Natural

  type H
  type L

  def zuiqian: H
  def zuihou: L

  def tail: P
  def ten: Ten
  def eat[T](xyy: T): N[T]
  def put[T](xyy: T): R[T]
  def plus[T <: Natural](t: T): M[T]

}

class MiaoMiao0 extends Jinyi[MiaoMiao0, MiaoMiao0, MiaoMiao0, MiaoMiao0, MiaoMiao0, MiaoMiao0] {
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

  override type H = MiaoMiao0
  override type L = MiaoMiao0

  override def zuiqian: MiaoMiao0 = new MiaoMiao0
  override def zuihou: MiaoMiao0  = new MiaoMiao0
  override def ten: MiaoMiao0     = new MiaoMiao0

}

case class MiaoMiao1[T1](i1: T1) extends Jinyi[T1, T1, MiaoMiao1[T1], MiaoMiao0, MiaoMiao0, MiaoMiao0] {
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

  override type H = T1
  override type L = T1

  override def zuiqian: T1    = i1
  override def zuihou: T1     = i1
  override def ten: MiaoMiao0 = new MiaoMiao0

}

case class MiaoMiao2[T1, T2](i1: T1, i2: T2) extends Jinyi[T1, T2, MiaoMiao2[T1, T2], MiaoMiao0, MiaoMiao0, MiaoMiao1[T1]] {
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

  override type H = T1
  override type L = T2

  override def zuiqian: T1    = i1
  override def zuihou: T2     = i2
  override def ten: MiaoMiao0 = new MiaoMiao0

}

case class MiaoMiao3[T1, T2, T3](i1: T1, i2: T2, i3: T3) extends Jinyi[T1, T3, MiaoMiao3[T1, T2, T3], MiaoMiao0, MiaoMiao0, MiaoMiao2[T1, T2]] {
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

  override type H = T1
  override type L = T3

  override def zuiqian: T1    = i1
  override def zuihou: T3     = i3
  override def ten: MiaoMiao0 = new MiaoMiao0

}

object Abc extends App {

  val i1: String = "1"
  val i2: Short  = 2
  val i3: Int    = 3
  val i4: Long   = 4L

  val z = new MiaoMiao0

  /*println(
    z.eat(i1)
      .eat(i2)
      .eat(i3)
      .eat(i4)
      .eat(5)
      .eat(6)
      .eat(7)
      .eat(8)
      .eat(9)
      .eat(10)
      .eat(11)
      .eat(12)
      .eat(13)
      .eat(14)
      .eat(15)
      .eat(16)
      .eat(17)
      .eat(18)
      .eat(19)
      .eat(20)
      .eat(21)
      .eat(22)
      .eat(23))
  println(
    z.put(i1)
      .put(i2)
      .put(i3)
      .put(i4)
      .put(5)
      .put(6)
      .put(7)
      .put(8)
      .put(9)
      .put(10)
      .put(11)
      .put(12)
      .put(13)
      .put(14)
      .put(15)
      .put(16)
      .put(17)
      .put(18)
      .put(19)
      .put(20)
      .put(21)
      .put(22)
      .put(23))

  val bb = z.eat(i1).plus(z).eat(i2).plus(z).plus(z.eat(i3).plus(z.eat(i4)))

  println(bb.plus(bb).plus(bb).plus(bb))*/

}

case class MiaoMiao4[T1, T2, T3, T4](i1: T1, i2: T2, i3: T3, i4: T4)
    extends Jinyi[T1, T4, MiaoMiao4[T1, T2, T3, T4], MiaoMiao0, MiaoMiao0, MiaoMiao3[T1, T2, T3]] {
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
  override def eat[T](xyy: T): MiaoMiao5[T1, T2, T3, T4, T]        = MiaoMiao5(i1, i2, i3, i4, xyy)
  override def put[T](xyy: T): MiaoMiao5[T, T1, T2, T3, T4]        = MiaoMiao5(xyy, i1, i2, i3, i4)
  override def plus[T <: Natural](t: T): T#R[T4]#R[T3]#R[T2]#R[T1] = t.put(i4).put(i3).put(i2).put(i1)

  override type H = T1
  override type L = T4

  override def zuiqian: T1    = i1
  override def zuihou: T4     = i4
  override def ten: MiaoMiao0 = new MiaoMiao0

}

case class MiaoMiao5[T1, T2, T3, T4, T5](i1: T1, i2: T2, i3: T3, i4: T4, i5: T5)
    extends Jinyi[T1, T5, MiaoMiao5[T1, T2, T3, T4, T5], MiaoMiao0, MiaoMiao0, MiaoMiao4[T1, T2, T3, T4]] {
  self =>

  override type I = MiaoMiao5[T1, T2, T3, T4, T5]
  override type J = MiaoMiao0

  override def head: MiaoMiao5[T1, T2, T3, T4, T5] = self
  override def higher: MiaoMiao0                   = new MiaoMiao0

  override type P               = MiaoMiao4[T1, T2, T3, T4]
  override type N[T]            = MiaoMiao6[T1, T2, T3, T4, T5, T]
  override type R[T]            = MiaoMiao6[T, T1, T2, T3, T4, T5]
  override type M[T <: Natural] = T#R[T5]#R[T4]#R[T3]#R[T2]#R[T1]

  override def tail: MiaoMiao4[T1, T2, T3, T4]                           = MiaoMiao4(i1, i2, i3, i4)
  override def eat[T](xyy: T): MiaoMiao6[T1, T2, T3, T4, T5, T]          = MiaoMiao6(i1, i2, i3, i4, i5, xyy)
  override def put[T](xyy: T): MiaoMiao6[T, T1, T2, T3, T4, T5]          = MiaoMiao6(xyy, i1, i2, i3, i4, i5)
  override def plus[T <: Natural](t: T): T#R[T5]#R[T4]#R[T3]#R[T2]#R[T1] = t.put(i5).put(i4).put(i3).put(i2).put(i1)

  override type H = T1
  override type L = T5

  override def zuiqian: T1    = i1
  override def zuihou: T5     = i5
  override def ten: MiaoMiao0 = new MiaoMiao0

}

case class MiaoMiao6[T1, T2, T3, T4, T5, T6](i1: T1, i2: T2, i3: T3, i4: T4, i5: T5, i6: T6)
    extends Jinyi[T1, T6, MiaoMiao6[T1, T2, T3, T4, T5, T6], MiaoMiao0, MiaoMiao0, MiaoMiao5[T1, T2, T3, T4, T5]] {
  self =>

  override type I = MiaoMiao6[T1, T2, T3, T4, T5, T6]
  override type J = MiaoMiao0

  override def head: MiaoMiao6[T1, T2, T3, T4, T5, T6] = self
  override def higher: MiaoMiao0                       = new MiaoMiao0

  override type P               = MiaoMiao5[T1, T2, T3, T4, T5]
  override type N[T]            = MiaoMiao7[T1, T2, T3, T4, T5, T6, T]
  override type R[T]            = MiaoMiao7[T, T1, T2, T3, T4, T5, T6]
  override type M[T <: Natural] = T#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1]

  override def tail: MiaoMiao5[T1, T2, T3, T4, T5]                             = MiaoMiao5(i1, i2, i3, i4, i5)
  override def eat[T](xyy: T): MiaoMiao7[T1, T2, T3, T4, T5, T6, T]            = MiaoMiao7(MiaoMiao1(Jin(i1, i2, i3, i4, i5, i6, xyy)), new MiaoMiao0)
  override def put[T](xyy: T): MiaoMiao7[T, T1, T2, T3, T4, T5, T6]            = MiaoMiao7(MiaoMiao1(Jin(xyy, i1, i2, i3, i4, i5, i6)), new MiaoMiao0)
  override def plus[T <: Natural](t: T): T#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1] = t.put(i6).put(i5).put(i4).put(i3).put(i2).put(i1)

  override type H = T1
  override type L = T6

  override def zuiqian: T1    = i1
  override def zuihou: T6     = i6
  override def ten: MiaoMiao0 = new MiaoMiao0

}

case class Jin[T1, T2, T3, T4, T5, T6, T7](i1: T1, i2: T2, i3: T3, i4: T4, i5: T5, i6: T6, i7: T7)
    extends Jinyi[T1, T7, MiaoMiao0, MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]], Jin[T1, T2, T3, T4, T5, T6, T7], MiaoMiao6[T1, T2, T3, T4, T5, T6]] {
  self =>

  override type P               = MiaoMiao6[T1, T2, T3, T4, T5, T6]
  override type N[T]            = MiaoMiao8[T1, T2, T3, T4, T5, T6, T7, T]
  override type R[T]            = MiaoMiao8[T, T1, T2, T3, T4, T5, T6, T7]
  override type M[T <: Natural] = T#R[T7]#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1]

  override def head: MiaoMiao0                                    = new MiaoMiao0
  override def higher: MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]] = MiaoMiao1(self)
  override def zuiqian: T1                                        = i1
  override def zuihou: T7                                         = i7
  override def tail: MiaoMiao6[T1, T2, T3, T4, T5, T6]            = MiaoMiao6(i1, i2, i3, i4, i5, i6)

  override def eat[T](xyy: T): MiaoMiao8[T1, T2, T3, T4, T5, T6, T7, T] = MiaoMiao8(MiaoMiao1(self), MiaoMiao1(xyy))
  override def put[T](xyy: T): MiaoMiao8[T, T1, T2, T3, T4, T5, T6, T7] =
    MiaoMiao8(MiaoMiao1(Jin(xyy, i1, i2, i3, i4, i5, i6)), MiaoMiao1(i7))
  override def plus[T <: Natural](t: T): T#R[T7]#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1] =
    t.put(i7).put(i6).put(i5).put(i4).put(i3).put(i2).put(i1)
  override def ten: Jin[T1, T2, T3, T4, T5, T6, T7] = self

}

case class MiaoMiao7[T1, T2, T3, T4, T5, T6, T7](override val higher: MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]], override val head: MiaoMiao0)
    extends Jinyi[T1, T7, MiaoMiao0, MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]], Jin[T1, T2, T3, T4, T5, T6, T7], MiaoMiao6[T1, T2, T3, T4, T5, T6]] {
  self =>

  override type I = MiaoMiao0
  override type J = MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]]

  override type P               = MiaoMiao6[T1, T2, T3, T4, T5, T6]
  override type N[T]            = MiaoMiao8[T1, T2, T3, T4, T5, T6, T7, T]
  override type R[T]            = MiaoMiao8[T, T1, T2, T3, T4, T5, T6, T7]
  override type M[T <: Natural] = T#R[T7]#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1]

  override def tail: MiaoMiao6[T1, T2, T3, T4, T5, T6]                  = MiaoMiao6(higher.i1.i1, higher.i1.i2, higher.i1.i3, higher.i1.i4, higher.i1.i5, higher.i1.i6)
  override def eat[T](xyy: T): MiaoMiao8[T1, T2, T3, T4, T5, T6, T7, T] = MiaoMiao8(higher, MiaoMiao1(xyy))
  override def put[T](xyy: T): MiaoMiao8[T, T1, T2, T3, T4, T5, T6, T7] =
    MiaoMiao8(MiaoMiao1(Jin(xyy, higher.i1.i1, higher.i1.i2, higher.i1.i3, higher.i1.i4, higher.i1.i5, higher.i1.i6)), MiaoMiao1(higher.i1.i7))
  override def plus[T <: Natural](t: T): T#R[T7]#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1] =
    t.put(higher.i1.i7).put(higher.i1.i6).put(higher.i1.i5).put(higher.i1.i4).put(higher.i1.i3).put(higher.i1.i2).put(higher.i1.i1)

  override type H = T1
  override type L = T7

  override def zuiqian: T1                          = higher.i1.i1
  override def zuihou: T7                           = higher.i1.i7
  override def ten: Jin[T1, T2, T3, T4, T5, T6, T7] = higher.i1

}

case class MiaoMiao8[T1, T2, T3, T4, T5, T6, T7, T8](override val higher: MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]], override val head: MiaoMiao1[T8])
    extends Jinyi[T1, T8, MiaoMiao1[T8], MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]], Jin[T1, T2, T3, T4, T5, T6, T7], MiaoMiao7[T1, T2, T3, T4, T5, T6, T7]] {
  self =>

  override type I = MiaoMiao1[T8]
  override type J = MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]]

  override type P               = MiaoMiao7[T1, T2, T3, T4, T5, T6, T7]
  override type N[T]            = MiaoMiao9[T1, T2, T3, T4, T5, T6, T7, T8, T]
  override type R[T]            = MiaoMiao9[T, T1, T2, T3, T4, T5, T6, T7, T8]
  override type M[T <: Natural] = T#R[T8]#R[T7]#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1]

  override def tail: MiaoMiao7[T1, T2, T3, T4, T5, T6, T7]                  = MiaoMiao7(higher, new MiaoMiao0)
  override def eat[T](xyy: T): MiaoMiao9[T1, T2, T3, T4, T5, T6, T7, T8, T] = MiaoMiao9(higher, MiaoMiao2(head.i1, xyy))
  override def put[T](xyy: T): MiaoMiao9[T, T1, T2, T3, T4, T5, T6, T7, T8] = {
    MiaoMiao9(MiaoMiao1(Jin(xyy, higher.i1.i1, higher.i1.i2, higher.i1.i3, higher.i1.i4, higher.i1.i5, higher.i1.i6)), MiaoMiao2(higher.i1.i7, head.i1))
  }
  override def plus[T <: Natural](t: T): T#R[T8]#R[T7]#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1] =
    t.put(head.i1).put(higher.i1.i7).put(higher.i1.i6).put(higher.i1.i5).put(higher.i1.i4).put(higher.i1.i3).put(higher.i1.i2).put(higher.i1.i1)

  override type H = T1
  override type L = T8

  override def zuiqian: T1                          = higher.i1.i1
  override def zuihou: T8                           = head.i1
  override def ten: Jin[T1, T2, T3, T4, T5, T6, T7] = higher.i1

}

case class MiaoMiao9[T1, T2, T3, T4, T5, T6, T7, T8, T9](override val higher: MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]], override val head: MiaoMiao2[T8, T9])
    extends Jinyi[T1,
                  T9,
                  MiaoMiao2[T8, T9],
                  MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]],
                  Jin[T1, T2, T3, T4, T5, T6, T7],
                  MiaoMiao8[T1, T2, T3, T4, T5, T6, T7, T8]] { self =>

  override type I = MiaoMiao2[T8, T9]
  override type J = MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]]

  override type P               = MiaoMiao8[T1, T2, T3, T4, T5, T6, T7, T8]
  override type N[T]            = MiaoMiao10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T]
  override type R[T]            = MiaoMiao10[T, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  override type M[T <: Natural] = T#R[T9]#R[T8]#R[T7]#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1]

  override def tail: MiaoMiao8[T1, T2, T3, T4, T5, T6, T7, T8]                   = MiaoMiao8(higher, MiaoMiao1(head.i1))
  override def eat[T](xyy: T): MiaoMiao10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T] = MiaoMiao10(higher, MiaoMiao3(head.i1, head.i2, xyy))
  override def put[T](xyy: T): MiaoMiao10[T, T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
    MiaoMiao10(
        MiaoMiao1(Jin(xyy, higher.i1.i1, higher.i1.i2, higher.i1.i3, higher.i1.i4, higher.i1.i5, higher.i1.i6))
      , MiaoMiao3(higher.i1.i7, head.i1, head.i2)
    )
  }
  override def plus[T <: Natural](t: T): T#R[T9]#R[T8]#R[T7]#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1] =
    t.put(head.i2).put(head.i1).put(higher.i1.i7).put(higher.i1.i6).put(higher.i1.i5).put(higher.i1.i4).put(higher.i1.i3).put(higher.i1.i2).put(higher.i1.i1)

  override type H = T1
  override type L = T9

  override def zuiqian: T1                          = higher.i1.i1
  override def zuihou: T9                           = head.i2
  override def ten: Jin[T1, T2, T3, T4, T5, T6, T7] = higher.i1

}

case class MiaoMiao10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    override val higher: MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]]
  , override val head: MiaoMiao3[T8, T9, T10]
) extends Jinyi[T1,
                  T10,
                  MiaoMiao3[T8, T9, T10],
                  MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]],
                  Jin[T1, T2, T3, T4, T5, T6, T7],
                  MiaoMiao9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] { self =>

  override type I = MiaoMiao3[T8, T9, T10]
  override type J = MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]]

  override type P               = MiaoMiao9[T1, T2, T3, T4, T5, T6, T7, T8, T9]
  override type N[T]            = MiaoMiao11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T]
  override type R[T]            = MiaoMiao11[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]
  override type M[T <: Natural] = T#R[T10]#R[T9]#R[T8]#R[T7]#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1]

  override def tail: MiaoMiao9[T1, T2, T3, T4, T5, T6, T7, T8, T9]                    = MiaoMiao9(higher, MiaoMiao2(head.i1, head.i2))
  override def eat[T](xyy: T): MiaoMiao11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T] = MiaoMiao11(higher, MiaoMiao4(head.i1, head.i2, head.i3, xyy))
  override def put[T](xyy: T): MiaoMiao11[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = {
    MiaoMiao11(
        MiaoMiao1(Jin(xyy, higher.i1.i1, higher.i1.i2, higher.i1.i3, higher.i1.i4, higher.i1.i5, higher.i1.i6))
      , MiaoMiao4(higher.i1.i7, head.i1, head.i2, head.i3)
    )

  }
  override def plus[T <: Natural](t: T): T#R[T10]#R[T9]#R[T8]#R[T7]#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1] =
    t.put(head.i3)
      .put(head.i2)
      .put(head.i1)
      .put(higher.i1.i7)
      .put(higher.i1.i6)
      .put(higher.i1.i5)
      .put(higher.i1.i4)
      .put(higher.i1.i3)
      .put(higher.i1.i2)
      .put(higher.i1.i1)

  override type H = T1
  override type L = T10

  override def zuiqian: T1                          = higher.i1.i1
  override def zuihou: T10                          = head.i3
  override def ten: Jin[T1, T2, T3, T4, T5, T6, T7] = higher.i1

}

case class MiaoMiao11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](
    override val higher: MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]]
  , override val head: MiaoMiao4[T8, T9, T10, T11]
) extends Jinyi[T1,
                  T11,
                  MiaoMiao4[T8, T9, T10, T11],
                  MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]],
                  Jin[T1, T2, T3, T4, T5, T6, T7],
                  MiaoMiao10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] { self =>

  override type I = MiaoMiao4[T8, T9, T10, T11]
  override type J = MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]]

  override type P               = MiaoMiao10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]
  override type N[T]            = MiaoMiao12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T]
  override type R[T]            = MiaoMiao12[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
  override type M[T <: Natural] = T#R[T11]#R[T10]#R[T9]#R[T8]#R[T7]#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1]

  override def tail: MiaoMiao10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = MiaoMiao10(higher, MiaoMiao3(head.i1, head.i2, head.i3))
  override def eat[T](xyy: T): MiaoMiao12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T] =
    MiaoMiao12(higher, MiaoMiao5(head.i1, head.i2, head.i3, head.i4, xyy))
  override def put[T](xyy: T): MiaoMiao12[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {
    MiaoMiao12(
        MiaoMiao1(Jin(xyy, higher.i1.i1, higher.i1.i2, higher.i1.i3, higher.i1.i4, higher.i1.i5, higher.i1.i6))
      , MiaoMiao5(higher.i1.i7, head.i1, head.i2, head.i3, head.i4)
    )

  }
  override def plus[T <: Natural](t: T): T#R[T11]#R[T10]#R[T9]#R[T8]#R[T7]#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1] =
    t.put(head.i4)
      .put(head.i3)
      .put(head.i2)
      .put(head.i1)
      .put(higher.i1.i7)
      .put(higher.i1.i6)
      .put(higher.i1.i5)
      .put(higher.i1.i4)
      .put(higher.i1.i3)
      .put(higher.i1.i2)
      .put(higher.i1.i1)

  override type H = T1
  override type L = T11

  override def zuiqian: T1                          = higher.i1.i1
  override def zuihou: T11                          = head.i4
  override def ten: Jin[T1, T2, T3, T4, T5, T6, T7] = higher.i1

}

case class MiaoMiao12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](
    override val higher: MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]]
  , override val head: MiaoMiao5[T8, T9, T10, T11, T12]
) extends Jinyi[T1,
                  T12,
                  MiaoMiao5[T8, T9, T10, T11, T12],
                  MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]],
                  Jin[T1, T2, T3, T4, T5, T6, T7],
                  MiaoMiao11[
                      T1
                    , T2
                    , T3
                    , T4
                    , T5
                    , T6
                    , T7
                    , T8
                    , T9
                    , T10
                    , T11
                  ]] { self =>

  override type I = MiaoMiao5[T8, T9, T10, T11, T12]
  override type J = MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]]

  override type P = MiaoMiao11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
  override type N[T] = Bingfeng[T1,
                                T,
                                MiaoMiao6[T8, T9, T10, T11, T12, T],
                                MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]],
                                Jin[T1, T2, T3, T4, T5, T6, T7],
                                MiaoMiao12[
                                    T1
                                  , T2
                                  , T3
                                  , T4
                                  , T5
                                  , T6
                                  , T7
                                  , T8
                                  , T9
                                  , T10
                                  , T11
                                  , T12
                                ]]
  override type R[T] = Bingfeng[T,
                                T12,
                                MiaoMiao6[T7, T8, T9, T10, T11, T12],
                                MiaoMiao1[Jin[T, T1, T2, T3, T4, T5, T6]],
                                Jin[T, T1, T2, T3, T4, T5, T6],
                                MiaoMiao12[
                                    T
                                  , T1
                                  , T2
                                  , T3
                                  , T4
                                  , T5
                                  , T6
                                  , T7
                                  , T8
                                  , T9
                                  , T10
                                  , T11
                                ]]
  override type M[T <: Natural] = T#R[T12]#R[T11]#R[T10]#R[T9]#R[T8]#R[T7]#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1]

  override def tail: MiaoMiao11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = MiaoMiao11(higher, MiaoMiao4(head.i1, head.i2, head.i3, head.i4))
  override def eat[T](xyy: T): Bingfeng[T1,
                                        T,
                                        MiaoMiao6[T8, T9, T10, T11, T12, T],
                                        MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]],
                                        Jin[T1, T2, T3, T4, T5, T6, T7],
                                        MiaoMiao12[
                                            T1
                                          , T2
                                          , T3
                                          , T4
                                          , T5
                                          , T6
                                          , T7
                                          , T8
                                          , T9
                                          , T10
                                          , T11
                                          , T12
                                        ]] = {
    /*new Bingfeng[T1,
                 T,
                 MiaoMiao6[T8, T9, T10, T11, T12, T],
                 MiaoMiao1[Jin[T1, T2, T3, T4, T5, T6, T7]],
                 Jin[T1, T2, T3, T4, T5, T6, T7],
                 MiaoMiao12[
                     T1
                   , T2
                   , T3
                   , T4
                   , T5
                   , T6
                   , T7
                   , T8
                   , T9
                   , T10
                   , T11
                   , T12
                 ]](higher, MiaoMiao6(head.i1, head.i2, head.i3, head.i4, head.i5, xyy)) {
      override def zuiqian = higher.i1.i1
      override def zuihou  = xyy
      override def tail    = self

      override def ten: Jin[T1, T2, T3, T4, T5, T6, T7] = self.ten
    }*/
    throw new Exception("miaomiaomiao")
  }

  override def put[T](xyy: T): Bingfeng[T,
                                        T12,
                                        MiaoMiao6[T7, T8, T9, T10, T11, T12],
                                        MiaoMiao1[Jin[T, T1, T2, T3, T4, T5, T6]],
                                        Jin[T, T1, T2, T3, T4, T5, T6],
                                        MiaoMiao12[
                                            T
                                          , T1
                                          , T2
                                          , T3
                                          , T4
                                          , T5
                                          , T6
                                          , T7
                                          , T8
                                          , T9
                                          , T10
                                          , T11
                                        ]] = {
    new Bingfeng[T,
                 T12,
                 MiaoMiao6[T7, T8, T9, T10, T11, T12],
                 MiaoMiao1[Jin[T, T1, T2, T3, T4, T5, T6]],
                 Jin[T, T1, T2, T3, T4, T5, T6],
                 MiaoMiao12[
                     T
                   , T1
                   , T2
                   , T3
                   , T4
                   , T5
                   , T6
                   , T7
                   , T8
                   , T9
                   , T10
                   , T11
                 ]](
        MiaoMiao1(Jin(xyy, higher.i1.i1, higher.i1.i2, higher.i1.i3, higher.i1.i4, higher.i1.i5, higher.i1.i6))
      , MiaoMiao6(higher.i1.i7, head.i1, head.i2, head.i3, head.i4, head.i5)
    ) {

      override type I   = MiaoMiao6[T7, T8, T9, T10, T11, T12]
      override type J   = MiaoMiao1[Jin[T, T1, T2, T3, T4, T5, T6]]
      override type Ten = Jin[T, T1, T2, T3, T4, T5, T6]
      override type P = MiaoMiao12[
          T
        , T1
        , T2
        , T3
        , T4
        , T5
        , T6
        , T7
        , T8
        , T9
        , T10
        , T11
      ]
      override type H = T
      override type L = T12

      override type N[U] =
        Bingfeng[T,
                 U,
                 MiaoMiao0,
                 Jin[T, T1, T2, T3, T4, T5, T6]#M[MiaoMiao7[T7, T8, T9, T10, T11, T12, U]]#J,
                 Jin[T, T1, T2, T3, T4, T5, T6]#M[MiaoMiao7[T7, T8, T9, T10, T11, T12, U]]#Ten,
                 Jinyi[T,
                       T12,
                       MiaoMiao6[T7, T8, T9, T10, T11, T12],
                       MiaoMiao1[Jin[T, T1, T2, T3, T4, T5, T6]],
                       Jin[T, T1, T2, T3, T4, T5, T6],
                       MiaoMiao12[
                           T
                         , T1
                         , T2
                         , T3
                         , T4
                         , T5
                         , T6
                         , T7
                         , T8
                         , T9
                         , T10
                         , T11
                       ]]]

      override type R[U] = Bingfeng[U,
                                    T12,
                                    MiaoMiao0,
                                    MiaoMiao1[Jin[U, T, T1, T2, T3, T4, T5]],
                                    MiaoMiao8[U, T, T1, T2, T3, T4, T5, T6]#M[MiaoMiao6[T7, T8, T9, T10, T11, T12]]#Ten,
                                    MiaoMiao8[U, T, T1, T2, T3, T4, T5, T6]#M[MiaoMiao5[T7, T8, T9, T10, T11]]]

      override type M[U <: Natural] = Jin[T, T1, T2, T3, T4, T5, T6]#M[MiaoMiao6[T7, T8, T9, T10, T11, T12]#M[U]]

      override def eat[U](xyy: U): Bingfeng[T,
                                            U,
                                            MiaoMiao0,
                                            Jin[T, T1, T2, T3, T4, T5, T6]#M[MiaoMiao7[T7, T8, T9, T10, T11, T12, U]]#J,
                                            Jin[T, T1, T2, T3, T4, T5, T6]#M[MiaoMiao7[T7, T8, T9, T10, T11, T12, U]]#Ten,
                                            Jinyi[T,
                                                  T12,
                                                  MiaoMiao6[T7, T8, T9, T10, T11, T12],
                                                  MiaoMiao1[Jin[T, T1, T2, T3, T4, T5, T6]],
                                                  Jin[T, T1, T2, T3, T4, T5, T6],
                                                  MiaoMiao12[
                                                      T
                                                    , T1
                                                    , T2
                                                    , T3
                                                    , T4
                                                    , T5
                                                    , T6
                                                    , T7
                                                    , T8
                                                    , T9
                                                    , T10
                                                    , T11
                                                  ]]] = {
        super.eat(xyy)
      }

      override def put[U](xyy: U): Bingfeng[U,
        T12,
        MiaoMiao0,
        MiaoMiao1[Jin[U, T, T1, T2, T3, T4, T5]],
        MiaoMiao8[U, T, T1, T2, T3, T4, T5, T6]#M[MiaoMiao6[T7, T8, T9, T10, T11, T12]]#Ten,
        MiaoMiao8[U, T, T1, T2, T3, T4, T5, T6]#M[MiaoMiao5[T7, T8, T9, T10, T11]]] = {
        super.put(xyy)
      }

      override def plus[U <: Natural](t: U): Jin[T, T1, T2, T3, T4, T5, T6]#M[MiaoMiao6[T7, T8, T9, T10, T11, T12]#M[U]] = {
        super.plus(t)
      }

      override def zuiqian: T  = xyy
      override def zuihou: T12 = self.head.i5
      override def tail: MiaoMiao12[
          T
        , T1
        , T2
        , T3
        , T4
        , T5
        , T6
        , T7
        , T8
        , T9
        , T10
        , T11
      ] =
        MiaoMiao12(
            MiaoMiao1(Jin(xyy, self.higher.i1.i1, self.higher.i1.i2, self.higher.i1.i3, self.higher.i1.i4, self.higher.i1.i5, self.higher.i1.i6))
          , MiaoMiao5(self.higher.i1.i7, self.head.i1, self.head.i2, self.head.i3, self.head.i4)
        )

      override def ten: Jin[T, T1, T2, T3, T4, T5, T6] =
        Jin(xyy, self.higher.i1.i1, self.higher.i1.i2, self.higher.i1.i3, self.higher.i1.i4, self.higher.i1.i5, self.higher.i1.i6)

    }
  }

  override def plus[T <: Natural](t: T): T#R[T12]#R[T11]#R[T10]#R[T9]#R[T8]#R[T7]#R[T6]#R[T5]#R[T4]#R[T3]#R[T2]#R[T1] =
    t.put(head.i5)
      .put(head.i4)
      .put(head.i3)
      .put(head.i2)
      .put(head.i1)
      .put(higher.i1.i7)
      .put(higher.i1.i6)
      .put(higher.i1.i5)
      .put(higher.i1.i4)
      .put(higher.i1.i3)
      .put(higher.i1.i2)
      .put(higher.i1.i1)

  override def zuiqian: T1                          = higher.i1.i1
  override def zuihou: T12                          = head.i5
  override def ten: Jin[T1, T2, T3, T4, T5, T6, T7] = higher.i1

}
