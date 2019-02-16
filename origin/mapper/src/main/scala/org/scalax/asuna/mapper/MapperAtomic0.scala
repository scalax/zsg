package org.scalax.asuna.mapper.common0;
import scala.language.higherKinds;

class MiaoMiao0

object MiaoMiao0 {
  implicit def wangwangwang[M[_]]: AppendToMiaoMiaoMiao[MiaoMiao0, M] = new AppendToMiaoMiaoMiao[MiaoMiao0, M] {
    override def add[U](t: MiaoMiao0, old: M[U], context: Context[M]): M[(MiaoMiao0, U)] = {
      context.map { t: U =>
        (new MiaoMiao0, t)
      }(old)
    }
  }
}

class MiaoMiao7[T1, T2, T3, T4, T5, T6, T7](val i1: T1, val i2: T2, val i3: T3, val i4: T4, val i5: T5, val i6: T6, val i7: T7)

object MiaoMiao7 {
  implicit def wangwangwang[T1, T2, T3, T4, T5, T6, T7, M[_]](
      implicit m1: AppendToMiaoMiaoMiao[T1, M]
    , m2: AppendToMiaoMiaoMiao[T2, M]
    , m3: AppendToMiaoMiaoMiao[T3, M]
    , m4: AppendToMiaoMiaoMiao[T4, M]
    , m5: AppendToMiaoMiaoMiao[T5, M]
    , m6: AppendToMiaoMiaoMiao[T6, M]
    , m7: AppendToMiaoMiaoMiao[T7, M]
  ): AppendToMiaoMiaoMiao[MiaoMiao7[T1, T2, T3, T4, T5, T6, T7], M] =
    new AppendToMiaoMiaoMiao[MiaoMiao7[T1, T2, T3, T4, T5, T6, T7], M] {
      override def add[U](t: MiaoMiao7[T1, T2, T3, T4, T5, T6, T7], old: M[U], context: Context[M]): M[(MiaoMiao7[T1, T2, T3, T4, T5, T6, T7], U)] = {
        val v1 = m1.add(t.i1, old, context)
        val v2 = m2.add(t.i2, v1, context)
        val v3 = m3.add(t.i3, v2, context)
        val v4 = m4.add(t.i4, v3, context)
        val v5 = m5.add(t.i5, v4, context)
        val v6 = m6.add(t.i6, v5, context)
        val v7 = m7.add(t.i7, v6, context)
        context.map { t: (T7, (T6, (T5, (T4, (T3, (T2, (T1, U))))))) =>
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

trait AppendToMiaoMiaoMiao[T, M[_]] {
  def add[U](t: T, old: M[U], context: Context[M]): M[(T, U)]
}

trait Context[M[_]] {
  self =>
  def map[A, B](r: A => B): M[A] => M[B]
  def lift[T](m: T, zero: M[MiaoMiao0])(implicit d: AppendToMiaoMiaoMiao[T, M]): M[T] = {
    map { t: (T, MiaoMiao0) =>
      t._1
    }(d.add(m, zero, self))
  }
}
