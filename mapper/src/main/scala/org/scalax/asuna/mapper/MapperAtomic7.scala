package org.scalax.asuna.mapper.miaomiao2;
import scala.language.higherKinds;

trait ZhengZhengshu {
  self =>

  type T <: ZhengZhengshu
  type H
  type MiaoMiaoMiao <: ZhengZhengshu

  def tail: T
  def biggest: H
  def miaomiaomiao: MiaoMiaoMiao

  type N[R] <: Natural
  type M[R] <: ZhengZhengshu
  type P[R <: Natural] <: Natural

  def append[R](xyy: R): N[R]
  def put[R](xyy: R): M[R]
  def plus[R <: Natural](xyy: R): P[R]
  def plus(xyy: MiaoMiao0): MiaoMiaoMiao = miaomiaomiao

}

trait Natural extends ZhengZhengshu {

  override type T <: ZhengZhengshu
  override type H
  override type MiaoMiaoMiao <: ZhengZhengshu

  override def tail: T
  override def biggest: H
  override def miaomiaomiao: MiaoMiaoMiao

  override type N[R] <: Natural
  override type M[R] <: Natural
  override type P[R <: Natural] <: Natural

  override def append[R](xyy: R): N[R]
  override def put[R](xyy: R): M[R]
  override def plus[R <: Natural](xyy: R): P[R]

}

class MiaoMiao0 extends ZhengZhengshu {
  self =>

  override type T            = MiaoMiao0
  override type H            = MiaoMiao0
  override type MiaoMiaoMiao = MiaoMiao0

  override def tail: MiaoMiao0         = self
  override def biggest: MiaoMiao0      = self
  override def miaomiaomiao: MiaoMiao0 = self

  override type N[R]            = MiaoMiao1[R]
  override type M[R]            = MiaoMiao0
  override type P[R <: Natural] = R

  override def append[R](xyy: R): MiaoMiao1[R] = MiaoMiao1(xyy)
  override def put[R](xyy: R): MiaoMiao0       = self
  override def plus[R <: Natural](xyy: R): R   = xyy

}

object MiaoMiao0 {
  val miaomiao0: MiaoMiao0 = new MiaoMiao0
}

case class MiaoMiao1[T1](i1: T1) extends Natural {
  self =>

  override type T            = MiaoMiao0
  override type H            = T1
  override type MiaoMiaoMiao = MiaoMiao1[T1]

  override def tail: MiaoMiao0             = MiaoMiao0.miaomiao0
  override def biggest: T1                 = i1
  override def miaomiaomiao: MiaoMiao1[T1] = self

  override type N[R]            = AppendAble[MiaoMiao1[T1], R]
  override type M[R]            = MiaoMiao1[R]
  override type P[R <: Natural] = R#M[T1]#N[R#H]

  override def append[R](xyy: R): AppendAble[MiaoMiao1[T1], R] = new AppendAble[MiaoMiao1[T1], R] {
    override def tail    = self
    override def biggest = xyy
  }
  override def put[R](xyy: R): MiaoMiao1[R]               = MiaoMiao1(xyy)
  override def plus[R <: Natural](xyy: R): R#M[T1]#N[R#H] = xyy.put(i1).append(xyy.biggest)

  override def toString: String = s"MiaoMiao1(${i1.toString})"

}

trait AppendAble[T1 <: Natural, T2] extends Natural {
  self =>

  override type T            = T1
  override type H            = T2
  override type MiaoMiaoMiao = AppendAble[T1, T2]

  override def tail: T1
  override def biggest: T2
  override def miaomiaomiao: AppendAble[T1, T2] = self

  override type N[R]            = AppendAble[AppendAble[T1, T2], R]
  override type M[R]            = T1#M[R]#N[T1#H]
  override type P[R <: Natural] = T1#P[MiaoMiao1[T2]#P[R]]

  override def append[R](xyy: R): AppendAble[AppendAble[T1, T2], R] = new AppendAble[AppendAble[T1, T2], R] {
    override def tail    = self
    override def biggest = xyy
  }
  override def put[R](xyy: R): T1#M[R]#N[T1#H]                      = tail.put(xyy).append(tail.biggest)
  override def plus[R <: Natural](xyy: R): T1#P[MiaoMiao1[T2]#P[R]] = tail.plus(MiaoMiao1(biggest).plus(xyy))

  override def toString: String = s"AppendAble(${tail}, ${biggest})"

}

object Miaomiao extends App {

  val i1: Int    = 1
  val i2: String = "miaomiaomiao"
  val i3: Long   = 3L
  val i4: Double = 4

  val mi =
    MiaoMiao0.miaomiao0.append(i1).plus(MiaoMiao0.miaomiao0.append(i2).append(i3).plus(MiaoMiao1(i4))).plus(MiaoMiao0.miaomiao0.plus(MiaoMiao0.miaomiao0))

  println(mi.plus(mi).plus(mi).plus(MiaoMiao0.miaomiao0.append("喵").append("汪")))
  println(MiaoMiao0.miaomiao0.append(i1).plus(MiaoMiao0.miaomiao0.append(i2)))

  println(MiaoMiao0.miaomiao0.append(i1).append(i2).append(i3).append(i4))

}
