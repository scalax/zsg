package org.scalax.asuna.mapper.common;
import scala.language.higherKinds;

class MiaoMiao7[T1, T2, T3, T4, T5, T6, T7](val i1: T1, val i2: T2, val i3: T3, val i4: T4, val i5: T5, val i6: T6, val i7: T7)

object MiaoMiao7 {
  implicit def wangwangwang[T1, T2, T3, T4, T5, T6, T7, R <: RM](
    m1: AppendToMiaoMiaoMiao[T1, R],
    m2: AppendToMiaoMiaoMiao[T2, R],
    m3: AppendToMiaoMiaoMiao[T3, R],
    m4: AppendToMiaoMiaoMiao[T4, R],
    m5: AppendToMiaoMiaoMiao[T5, R],
    m6: AppendToMiaoMiaoMiao[T6, R],
    m7: AppendToMiaoMiaoMiao[T7, R]
  ): AppendToMiaoMiaoMiao[MiaoMiao7[T1, T2, T3, T4, T5, T6, T7], R] =
    new AppendToMiaoMiaoMiao[MiaoMiao7[T1, T2, T3, T4, T5, T6, T7], R] {
      override def add[U](t: MiaoMiao7[T1, T2, T3, T4, T5, T6, T7], old: R#M[U], context: Context[R]): R#M[(MiaoMiao7[T1, T2, T3, T4, T5, T6, T7], U)] = {
        val v1 = m1.add(t.i1, old, context)
        val v2 = m2.add(t.i2, v1, context)
        val v3 = m3.add(t.i3, v2, context)
        val v4 = m4.add(t.i4, v3, context)
        val v5 = m5.add(t.i5, v4, context)
        val v6 = m6.add(t.i6, v5, context)
        val v7 = m7.add(t.i7, v6, context)
        context.map { t: (T7, (T6, (T5, (T4, (T3, (T2, (T1, U))))))) =>
          (new MiaoMiao7(t._2._2._2._2._2._2._1, t._2._2._2._2._2._1, t._2._2._2._2._1, t._2._2._2._1, t._2._2._1, t._2._1, t._1), t._2._2._2._2._2._2._2)
        }(v7)
      }
    }
}

trait AppendToMiaoMiaoMiao[T, R <: RM] {
  def add[U](t: T, old: R#M[U], context: Context[R]): R#M[(T, U)]
}

trait Context[R <: RM] {
  def map[A, B](r: A => B): R#M[A] => R#M[B]
}

trait RM {
  type M[_]
}
