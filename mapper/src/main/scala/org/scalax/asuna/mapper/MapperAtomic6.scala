package org.scalax.asuna.mapper.miaomiao1;
import scala.language.higherKinds;

trait Natural {

  type T <: Natural
  type H

  def tail: T
  def biggest: H

  type N[R] <: Natural
  type M[R] <: Natural
  type P[R <: Natural] <: Natural

  def append[R](xyy: R): N[R]
  def put[R](xyy: R): M[R]
  def plus[R <: Natural](xyy: R): P[R]

}

class MiaoMiao0 extends Natural {
  self =>

  override type T = MiaoMiao0
  override type H = MiaoMiao0

  override def tail: MiaoMiao0    = self
  override def biggest: MiaoMiao0 = self

  override type N[R]            = MiaoMiao1[R]
  override type M[R]            = MiaoMiao1[R]
  override type P[R <: Natural] = R

  override def append[R](xyy: R): MiaoMiao1[R]  = MiaoMiao1(xyy)
  override def put[R](xyy: R): MiaoMiao1[R]     = MiaoMiao1(xyy)
  override def plus[R <: Natural](xyy: R): P[R] = xyy

}

object MiaoMiao0 {
  val miaomiao0: MiaoMiao0 = new MiaoMiao0
}

case class MiaoMiao1[T1](i1: T1) extends Natural {
  self =>

  override type T = MiaoMiao0
  override type H = T1

  override def tail: MiaoMiao0 = MiaoMiao0.miaomiao0
  override def biggest: T1     = i1

  override type N[R]            = AppendAble[MiaoMiao1[T1], R]
  override type M[R]            = AppendAble[MiaoMiao1[R], T1]
  override type P[R <: Natural] = R#M[T1]

  override def append[R](xyy: R): AppendAble[MiaoMiao1[T1], R] = new AppendAble[MiaoMiao1[T1], R] {
    override def tail    = self
    override def biggest = xyy
  }
  override def put[R](xyy: R): AppendAble[MiaoMiao1[R], T1] = new AppendAble[MiaoMiao1[R], T1] {
    override def tail    = MiaoMiao1(xyy)
    override def biggest = i1
  }
  override def plus[R <: Natural](xyy: R): R#M[T1] = xyy.put(i1)

  override def toString: String = i1.toString

}

trait AppendAble[T1 <: Natural, T2] extends Natural {
  self =>

  override type T = T1
  override type H = T2

  override def tail: T1
  override def biggest: T2

  override type N[R]            = AppendAble[AppendAble[T1, T2], R]
  override type M[R]            = MiaoMiao1[R]#P[T1]#N[T2]
  override type P[R <: Natural] = T1#P[R#M[T2]]

  override def append[R](xyy: R): AppendAble[AppendAble[T1, T2], R] = new AppendAble[AppendAble[T1, T2], R] {
    override def tail    = self
    override def biggest = xyy
  }
  override def put[R](xyy: R): MiaoMiao1[R]#P[T1]#N[T2]  = MiaoMiao1(xyy).plus(tail).append(biggest)
  override def plus[R <: Natural](xyy: R): T1#P[R#M[T2]] = tail.plus(xyy.put(biggest))

  override def toString: String = s"AppendAble(${tail}, ${biggest})"

}

object Miaomiao extends App {

  val i1: Int    = 1
  val i2: String = "2"
  val i3: Long   = 3L
  val i4: Double = 4

  val mi =
    MiaoMiao0.miaomiao0.append(i1).plus(MiaoMiao0.miaomiao0.append(i2).append(i3)).plus(MiaoMiao0.miaomiao0.plus(MiaoMiao0.miaomiao0)).plus(MiaoMiao1(i4))

  println(mi.plus(mi).plus(mi).plus(mi).plus(mi).plus(mi).plus(mi).plus(MiaoMiao0.miaomiao0.plus(MiaoMiao0.miaomiao0).plus(mi)).plus(mi))

}
