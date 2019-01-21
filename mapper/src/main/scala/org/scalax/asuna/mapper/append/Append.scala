package org.scalax.asuna.mapper.append;
import scala.language.higherKinds;

trait TypeParam {
  type H
  type T <: TypeParam
}

/*





















 */

class Item0

object Item0 {

  val item0: Item0 = new Item0

  implicit def implicit0[K <: KindContext]: Application[K, Item0, Type0] = new Application[K, Item0, Type0] {
    override def application(t: Item0, context: Context[K]): K#M[Type0] = context.start
  }

  def plus0[T1 <: TypeParam]: Plus[Type0, T1, Type1[T1]] = new Plus[Type0, T1, Type1[T1]] {
    override def plus(p: Item0, item: T1#H): Item1[T1#H] = new Item1(item)
    override def take(t: Item1[T1#H]): (Item0, T1#H)     = (item0, t.i1)
    override def sub: Plus[Type0, T1#T, Type1[T1#T]]     = plus0[T1#T]
  }

}

trait Type0 extends TypeParam {
  override type H = Item0
  override type T = Type0
}

class Item1[T1](val i1: T1)

trait Type1[T1 <: TypeParam] extends TypeParam {
  override type H = Item1[T1#H]
  override type T = Type1[T1#T]
}

object Item1 {

  implicit def implicit1[K <: KindContext, T1, P1 <: TypeParam](implicit t1: Application[K, T1, P1]): Application[K, Item1[T1], Type1[P1]] =
    new Application[K, Item1[T1], Type1[P1]] {
      override def application(t: Item1[T1], context: Context[K]): K#M[Type1[P1]] = {
        val ii1 = t1.application(t.i1, context)
        context.append(Item0.implicit0[K].application(Item0.item0, context), ii1, Item0.plus0[P1])
      }
    }

  def plus1[T1 <: TypeParam, T2 <: TypeParam]: Plus[Type1[T1], T2, Type2[T1, T2]] = new Plus[Type1[T1], T2, Type2[T1, T2]] {
    override def plus(p: Item1[T1#H], item: T2#H): Item2[T1#H, T2#H] = new Item2(p.i1, item)
    override def take(t: Item2[T1#H, T2#H]): (Item1[T1#H], T2#H)     = (new Item1(t.i1), t.i2)
    override def sub: Plus[Type1[T1#T], T2#T, Type2[T1#T, T2#T]]     = plus1[T1#T, T2#T]
  }

}

class Item2[T1, T2](val i1: T1, val i2: T2)

trait Type2[T1 <: TypeParam, T2 <: TypeParam] extends TypeParam {
  override type H = Item2[T1#H, T2#H]
  override type T = Type2[T1#T, T2#T]
}

object Item2 {

  implicit def implicit2[K <: KindContext, T1, T2, P1 <: TypeParam, P2 <: TypeParam](implicit t1: Application[K, T1, P1],
                                                                                     t2: Application[K, T2, P2]): Application[K, Item2[T1, T2], Type2[P1, P2]] =
    new Application[K, Item2[T1, T2], Type2[P1, P2]] {
      override def application(t: Item2[T1, T2], context: Context[K]): K#M[Type2[P1, P2]] = {
        val ii2 = t2.application(t.i2, context)
        context.append(Item1.implicit1(t1).application(new Item1(t.i1), context), ii2, Item1.plus1[P1, P2])
      }
    }

  def plus2[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam]: Plus[Type2[T1, T2], T3, Type3[T1, T2, T3]] = new Plus[Type2[T1, T2], T3, Type3[T1, T2, T3]] {
    override def plus(p: Item2[T1#H, T2#H], item: T3#H): Item3[T1#H, T2#H, T3#H] = new Item3(p.i1, p.i2, item)
    override def take(t: Item3[T1#H, T2#H, T3#H]): (Item2[T1#H, T2#H], T3#H)     = (new Item2(t.i1, t.i2), t.i3)
    override def sub: Plus[Type2[T1#T, T2#T], T3#T, Type3[T1#T, T2#T, T3#T]]     = plus2[T1#T, T2#T, T3#T]
  }

}

class Item3[T1, T2, T3](val i1: T1, val i2: T2, val i3: T3)

trait Type3[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam] extends TypeParam {
  override type H = Item3[T1#H, T2#H, T3#H]
  override type T = Type3[T1#T, T2#T, T3#T]
}

object Item3 {

  implicit def implicit3[K <: KindContext, T1, T2, T3, P1 <: TypeParam, P2 <: TypeParam, P3 <: TypeParam](
    implicit t1: Application[K, T1, P1],
    t2: Application[K, T2, P2],
    t3: Application[K, T3, P3]): Application[K, Item3[T1, T2, T3], Type3[P1, P2, P3]] =
    new Application[K, Item3[T1, T2, T3], Type3[P1, P2, P3]] {
      override def application(t: Item3[T1, T2, T3], context: Context[K]): K#M[Type3[P1, P2, P3]] = {
        val ii3 = t3.application(t.i3, context)
        context.append(Item2.implicit2(t1, t2).application(new Item2(t.i1, t.i2), context), ii3, Item2.plus2[P1, P2, P3])
      }
    }

  def plus3[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam]: Plus[Type3[T1, T2, T3], T4, Type4[T1, T2, T3, T4]] =
    new Plus[Type3[T1, T2, T3], T4, Type4[T1, T2, T3, T4]] {
      override def plus(p: Item3[T1#H, T2#H, T3#H], item: T4#H): Item4[T1#H, T2#H, T3#H, T4#H] = new Item4(p.i1, p.i2, p.i3, item)
      override def take(t: Item4[T1#H, T2#H, T3#H, T4#H]): (Item3[T1#H, T2#H, T3#H], T4#H)     = (new Item3(t.i1, t.i2, t.i3), t.i4)
      override def sub: Plus[Type3[T1#T, T2#T, T3#T], T4#T, Type4[T1#T, T2#T, T3#T, T4#T]]     = plus3[T1#T, T2#T, T3#T, T4#T]
    }

}

class Item4[T1, T2, T3, T4](val i1: T1, val i2: T2, val i3: T3, val i4: T4)

trait Type4[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam] extends TypeParam {
  override type H = Item4[T1#H, T2#H, T3#H, T4#H]
  override type T = Type4[T1#T, T2#T, T3#T, T4#T]
}

object Item4 {

  implicit def implicit4[K <: KindContext, T1, T2, T3, T4, P1 <: TypeParam, P2 <: TypeParam, P3 <: TypeParam, P4 <: TypeParam](
    implicit t1: Application[K, T1, P1],
    t2: Application[K, T2, P2],
    t3: Application[K, T3, P3],
    t4: Application[K, T4, P4]): Application[K, Item4[T1, T2, T3, T4], Type4[P1, P2, P3, P4]] =
    new Application[K, Item4[T1, T2, T3, T4], Type4[P1, P2, P3, P4]] {
      override def application(t: Item4[T1, T2, T3, T4], context: Context[K]): K#M[Type4[P1, P2, P3, P4]] = {
        val ii4 = t4.application(t.i4, context)
        context.append(Item3.implicit3(t1, t2, t3).application(new Item3(t.i1, t.i2, t.i3), context), ii4, Item3.plus3[P1, P2, P3, P4])
      }
    }

}

trait Application[K <: KindContext, T, I <: TypeParam] {
  def application(t: T, context: Context[K]): K#M[I]
}

trait KindContext {
  type M[P <: TypeParam]
}

trait Plus[X <: TypeParam, Y <: TypeParam, Z <: TypeParam] {
  def plus(p: X#H, item: Y#H): Z#H
  def take(t: Z#H): (X#H, Y#H)
  def sub: Plus[X#T, Y#T, Z#T]
}

trait Context[K <: KindContext] {
  def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z]
  def start: K#M[Type0]
}
