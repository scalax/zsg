package org.scalax.asuna.mapper.common2;
import scala.language.higherKinds;

class MiaoMiao0
class WangWang0 extends Item {
  override type D = MiaoMiao0
}

object MiaoMiao0 {
  implicit def wangwangwang[R <: RM]: AppendToMiaoMiaoMiao[MiaoMiao0, R, WangWang0] = new AppendToMiaoMiaoMiao[MiaoMiao0, R, WangWang0] {
    override def add[U](t: MiaoMiao0, old: R#M[U], context: Context[R]): R#M[(WangWang0#D, U)] = {
      context.map { t: U =>
        (new MiaoMiao0, t)
      }(old)
    }
  }
}

class MiaoMiao2[T1, T2](val i1: T1, val i2: T2)
class WangWang2[I1 <: Item, I2 <: Item] extends Item {
  override type D = MiaoMiao2[I1#D, I2#D]
}

object MiaoMiao2 {
  implicit def wangwangwang[T1, T2, I1 <: Item, I2 <: Item, R <: RM](
      implicit m1: AppendToMiaoMiaoMiao[T1, R, I1]
    , m2: AppendToMiaoMiaoMiao[T2, R, I2]
  ): AppendToMiaoMiaoMiao[MiaoMiao2[T1, T2], R, WangWang2[I1, I2]] =
    new AppendToMiaoMiaoMiao[MiaoMiao2[T1, T2], R, WangWang2[I1, I2]] {
      override def add[U](t: MiaoMiao2[T1, T2], old: R#M[U], context: Context[R]): R#M[(WangWang2[I1, I2]#D, U)] = {
        val v1 = m1.add(t.i1, old, context)
        val v2 = m2.add(t.i2, v1, context)
        context.map { t: (I2#D, (I1#D, U)) =>
          val n2 = t
          val n1 = n2._2
          val n0 = n1._2
          (new MiaoMiao2(n1._1, n2._1), n0)
        }(v2)
      }
    }
}

class MiaoMiao7[T1, T2, T3, T4, T5, T6, T7](val i1: T1, val i2: T2, val i3: T3, val i4: T4, val i5: T5, val i6: T6, val i7: T7)
class WangWang7[I1 <: Item, I2 <: Item, I3 <: Item, I4 <: Item, I5 <: Item, I6 <: Item, I7 <: Item] extends Item {
  override type D = MiaoMiao7[I1#D, I2#D, I3#D, I4#D, I5#D, I6#D, I7#D]
}

object MiaoMiao7 {
  implicit def wangwangwang[T1, T2, T3, T4, T5, T6, T7, I1 <: Item, I2 <: Item, I3 <: Item, I4 <: Item, I5 <: Item, I6 <: Item, I7 <: Item, R <: RM](
      implicit m1: AppendToMiaoMiaoMiao[T1, R, I1]
    , m2: AppendToMiaoMiaoMiao[T2, R, I2]
    , m3: AppendToMiaoMiaoMiao[T3, R, I3]
    , m4: AppendToMiaoMiaoMiao[T4, R, I4]
    , m5: AppendToMiaoMiaoMiao[T5, R, I5]
    , m6: AppendToMiaoMiaoMiao[T6, R, I6]
    , m7: AppendToMiaoMiaoMiao[T7, R, I7]
  ): AppendToMiaoMiaoMiao[MiaoMiao7[T1, T2, T3, T4, T5, T6, T7], R, WangWang7[I1, I2, I3, I4, I5, I6, I7]] =
    new AppendToMiaoMiaoMiao[MiaoMiao7[T1, T2, T3, T4, T5, T6, T7], R, WangWang7[I1, I2, I3, I4, I5, I6, I7]] {
      override def add[U](t: MiaoMiao7[T1, T2, T3, T4, T5, T6, T7], old: R#M[U], context: Context[R]): R#M[(WangWang7[I1, I2, I3, I4, I5, I6, I7]#D, U)] = {
        val v1 = m1.add(t.i1, old, context)
        val v2 = m2.add(t.i2, v1, context)
        val v3 = m3.add(t.i3, v2, context)
        val v4 = m4.add(t.i4, v3, context)
        val v5 = m5.add(t.i5, v4, context)
        val v6 = m6.add(t.i6, v5, context)
        val v7 = m7.add(t.i7, v6, context)
        context.map { t: (I7#D, (I6#D, (I5#D, (I4#D, (I3#D, (I2#D, (I1#D, U))))))) =>
          val n7 = t
          val n6 = n7._2
          val n5 = n6._2
          val n4 = n5._2
          val n3 = n4._2
          val n2 = n3._2
          val n1 = n2._2
          val n0 = n1._2
          (new MiaoMiao7(n1._1, n2._1, n3._1, n4._1, n5._1, n6._1, n7._1), n0)
        }(v7)
      }
    }
}

trait AppendToMiaoMiaoMiao[T, R <: RM, I <: Item] {
  def add[U](t: T, old: R#M[U], context: Context[R]): R#M[(I#D, U)]
}

trait Context[R <: RM] {
  self =>
  def map[A, B](r: A => B): R#M[A] => R#M[B]
  def lift[T, I <: Item](m: T, zero: R#M[MiaoMiao0])(implicit d: AppendToMiaoMiaoMiao[T, R, I]): R#M[I#D] = {
    map { t: (I#D, MiaoMiao0) =>
      t._1
    }(d.add(m, zero, self))
  }
}

trait RM {
  type M[_]
}

trait Item {
  type D
}
