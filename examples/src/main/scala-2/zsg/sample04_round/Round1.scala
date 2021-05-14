package zsg.sample04_round

trait TypeParam {
  type H
  type T <: TypeParam
}

class TypeParameter1 {
  class ParamPositive[Head, Tail <: TypeParam] extends TypeParam {
    override type H = Head
    override type T = Tail
  }

  class Param1[I1] extends ParamPositive[I1, Param1[I1]]

  class Param2[I1, I2]     extends ParamPositive[I1, ParamPositive[I2, Param2Impl[I1, I2]]]
  class Param2Impl[I1, I2] extends ParamPositive[I2, Param2[I1, I2]]

  class Param3[I1, I2, I3]     extends ParamPositive[I1, ParamPositive[I2, Param3Impl[I1, I2, I3]]]
  class Param3Impl[I1, I2, I3] extends ParamPositive[I3, Param3[I1, I2, I3]]

  class Param4[I1, I2, I3, I4]     extends ParamPositive[I1, ParamPositive[I2, ParamPositive[I3, Param4Impl[I1, I2, I3, I4]]]]
  class Param4Impl[I1, I2, I3, I4] extends ParamPositive[I4, Param4[I1, I2, I3, I4]]

}

object Item1 {

  def plus1[T1 <: TypeParam, T <: TypeParam]: Plus[T1, T, Type2[T1, T]] =
    new Plus[T1, T, Type2[T1, T]] {
      override def plus(p: T1#H, item: T#H): Item2[T1#H, T#H] = Item.apply2(p, item)
      override def take(t: Item2[T1#H, T#H]): (T1#H, T#H)     = (t.i1, t.i2)
      override def sub: Plus[T1#T, T#T, Type2[T1#T, T#T]]     = plus1[T1#T, T#T]
    }

}

class Item2[T1, T2](val i1: T1, val i2: T2)
class Type2[T1 <: TypeParam, T2 <: TypeParam] extends TypeParam {
  override type H = Item2[T1#H, T2#H]
  override type T = Type2[T1#T, T2#T]
}

object Item2 {

  implicit def implicit2[K <: KindContext, T1, T2, P1 <: TypeParam, P2 <: TypeParam](implicit
    t1: Application[K, T1, P1],
    t2: Application[K, T2, P2]
  ): Application[K, Item2[T1, T2], Type2[P1, P2]] =
    new Application[K, Item2[T1, T2], Type2[P1, P2]] {
      override def application(context: Context[K]): K#M[Type2[P1, P2]] = {
        val ii1 = t1.application(context)
        val ii2 = t2.application(context)
        context.append(ii1, ii2, Item1.plus1[P1, P2])
      }
    }

  def plus2[T1 <: TypeParam, T2 <: TypeParam, T <: TypeParam]: Plus[Type2[T1, T2], T, Type3[T1, T2, T]] =
    new Plus[Type2[T1, T2], T, Type3[T1, T2, T]] {
      override def plus(p: Item2[T1#H, T2#H], item: T#H): Item3[T1#H, T2#H, T#H] = Item.apply3(p.i1, p.i2, item)
      override def take(t: Item3[T1#H, T2#H, T#H]): (Item2[T1#H, T2#H], T#H)     = (Item.apply2(t.i1, t.i2), t.i3)
      override def sub: Plus[Type2[T1#T, T2#T], T#T, Type3[T1#T, T2#T, T#T]]     = plus2[T1#T, T2#T, T#T]
    }

}

class Item3[T1, T2, T3](val i1: T1, val i2: T2, val i3: T3)
class Type3[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam] extends TypeParam {
  override type H = Item3[T1#H, T2#H, T3#H]
  override type T = Type3[T1#T, T2#T, T3#T]
}

object Item3 {

  implicit def implicit3[K <: KindContext, T1, T2, T3, P1 <: TypeParam, P2 <: TypeParam, P3 <: TypeParam](implicit
    t1: Application[K, T1, P1],
    t2: Application[K, T2, P2],
    t3: Application[K, T3, P3]
  ): Application[K, Item3[T1, T2, T3], Type3[P1, P2, P3]] =
    new Application[K, Item3[T1, T2, T3], Type3[P1, P2, P3]] {
      override def application(context: Context[K]): K#M[Type3[P1, P2, P3]] = {
        val ii3 = t3.application(context)
        context.append(Item2.implicit2(t1, t2).application(context), ii3, Item2.plus2[P1, P2, P3])
      }
    }

  def plus3[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T <: TypeParam]: Plus[Type3[T1, T2, T3], T, Type4[T1, T2, T3, T]] =
    new Plus[Type3[T1, T2, T3], T, Type4[T1, T2, T3, T]] {
      override def plus(p: Item3[T1#H, T2#H, T3#H], item: T#H): Item4[T1#H, T2#H, T3#H, T#H] = Item.apply4(p.i1, p.i2, p.i3, item)
      override def take(t: Item4[T1#H, T2#H, T3#H, T#H]): (Item3[T1#H, T2#H, T3#H], T#H)     = (Item.apply3(t.i1, t.i2, t.i3), t.i4)
      override def sub: Plus[Type3[T1#T, T2#T, T3#T], T#T, Type4[T1#T, T2#T, T3#T, T#T]]     = plus3[T1#T, T2#T, T3#T, T#T]
    }

}

class Item4[T1, T2, T3, T4](val i1: T1, val i2: T2, val i3: T3, val i4: T4)
class Type4[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam] extends TypeParam {
  override type H = Item4[T1#H, T2#H, T3#H, T4#H]
  override type T = Type4[T1#T, T2#T, T3#T, T4#T]
}

object Item4 {

  implicit def implicit4[K <: KindContext, T1, T2, T3, T4, P1 <: TypeParam, P2 <: TypeParam, P3 <: TypeParam, P4 <: TypeParam](implicit
    t1: Application[K, T1, P1],
    t2: Application[K, T2, P2],
    t3: Application[K, T3, P3],
    t4: Application[K, T4, P4]
  ): Application[K, Item4[T1, T2, T3, T4], Type4[P1, P2, P3, P4]] =
    new Application[K, Item4[T1, T2, T3, T4], Type4[P1, P2, P3, P4]] {
      override def application(context: Context[K]): K#M[Type4[P1, P2, P3, P4]] = {
        val ii4 = t4.application(context)
        context.append(Item3.implicit3(t1, t2, t3).application(context), ii4, Item3.plus3[P1, P2, P3, P4])
      }
    }

}

object Item {
  def apply2[T1, T2](t1: T1, t2: T2): Item2[T1, T2]                                 = new Item2(t1, t2)
  def apply3[T1, T2, T3](t1: T1, t2: T2, t3: T3): Item3[T1, T2, T3]                 = new Item3(t1, t2, t3)
  def apply4[T1, T2, T3, T4](t1: T1, t2: T2, t3: T3, t4: T4): Item4[T1, T2, T3, T4] = new Item4(t1, t2, t3, t4)
}

trait Application[K <: KindContext, T, I <: TypeParam] {
  def application(context: Context[K]): K#M[I]
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
}
