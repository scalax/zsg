package org.scalax.asuna.mapper.miaomiao2;
import scala.language.higherKinds;

trait Natural {
  self =>

  type N[R] <: Natural
  type M[R] <: PutAble
  type P[R <: Natural] <: Natural

  def append[R](xyy: R): N[R]
  def put[R](xyy: R): M[R]
  def plus[R <: Natural](xyy: R): P[R]

}

trait PutAble {

  type H <: Natural
  type T

  def head: H
  def current: T

}

case class PutAbleImpl[Head <: Natural, Tail](override val head: Head, override val current: Tail) extends PutAble {
  override type H = Head
  override type T = Tail
}

class MiaoMiao0 extends Natural {
  self =>

  override type N[R]            = AppendAble[MiaoMiao0, R]
  override type M[R]            = PutAbleImpl[MiaoMiao0, R]
  override type P[R <: Natural] = R

  override def append[R](xyy: R): AppendAble[MiaoMiao0, R] = new AppendAble[MiaoMiao0, R] {
    override def tail: MiaoMiao0 = self
    override def biggest: R      = xyy
  }
  override def put[R](xyy: R): PutAbleImpl[MiaoMiao0, R] = PutAbleImpl[MiaoMiao0, R](self, xyy)
  override def plus[R <: Natural](xyy: R): R             = xyy

}

object MiaoMiao0 {
  val miaomiao0: MiaoMiao0 = new MiaoMiao0
}

trait AppendAble[T1 <: Natural, T2] extends Natural {
  self =>

  def tail: T1
  def biggest: T2

  override type N[R] = AppendAble[AppendAble[T1, T2], R]
  override type M[R] = ({
    type MM = T1#M[R]
    type NN = MM#H#N[MM#T]
    type PP = PutAbleImpl[NN, T2]
  })#PP
  override type P[R <: Natural] = ({
    type MM = R#M[T2]
    type NN = T1#P[MM#H]#N[MM#T]
  })#NN

  override def append[R](xyy: R): AppendAble[AppendAble[T1, T2], R] = new AppendAble[AppendAble[T1, T2], R] {
    subSelf =>
    override def tail    = self
    override def biggest = xyy
  }
  override def put[R](xyy: R): ({
    type MM = T1#M[R]
    type NN = MM#H#N[MM#T]
    type PP = PutAbleImpl[NN, T2]
  })#PP = {
    type MM = T1#M[R]
    type NN = MM#H#N[MM#T]

    val mm: MM = tail.put(xyy)
    val nn: NN = mm.head.append(mm.current: MM#T)
    PutAbleImpl(nn, biggest)
  }
  override def plus[R <: Natural](xyy: R): ({
    type MM = R#M[T2]
    type NN = T1#P[MM#H]#N[MM#T]
  })#NN = {
    type MM = R#M[T2]

    val mm: MM = xyy.put(biggest)
    tail.plus(mm.head: MM#H).append(mm.current: MM#T)
  }

  override def toString: String = s"AppendAble(${tail}, ${biggest})"

}

object Miaomiao extends App {

  val i1: Int    = 1
  val i2: String = "miaomiaomiao"
  val i3: Long   = 3L
  val i4: Double = 4

  /*val mi = MiaoMiao0.miaomiao0
    .append(i1)
    .plus(MiaoMiao0.miaomiao0.plus(MiaoMiao0.miaomiao0))
    .plus(MiaoMiao0.miaomiao0.append(i2).append(i3).plus(MiaoMiao0.miaomiao0.append(i4)))

  val bar = mi.plus(mi).plus(mi.plus(mi).plus(mi).plus(MiaoMiao0.miaomiao0.append("喵").append("汪")))
  println(bar)*/

}
