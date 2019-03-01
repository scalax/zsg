package org.scalax.asuna.mapper.append

import scala.annotation.implicitNotFound
import scala.language.higherKinds

trait TypeParam {
  type H
  type T <: TypeParam
}

class Item0
class DebugItem0 extends Item0 {
  def debug[K <: KindContext](context: Context[K]): Application[K, DebugItem0, Type0] = new Application[K, DebugItem0, Type0] {
    override def tag: ItemTag[DebugItem0] = Item.debug0.debug
    override def application(context: Context[K]): K#M[Type0] = {
      Item0.implicit0[K].application(context)
    }
  }
}
class DebugMessage0 {
  def debug: ItemTag[DebugItem0] = new ItemTag[DebugItem0]
}
class Type0 extends TypeParam {
  override type H = Item0
  override type T = Type0
}

object DebugItem0 {

  implicit def debugImplicit0[K <: KindContext]: Application[K, DebugItem0, Type0] = new Application[K, DebugItem0, Type0] {
    override def tag: ItemTag[DebugItem0] = Item.debug0.debug
    override def application(context: Context[K]): K#M[Type0] = {
      Item0.implicit0[K].application(context)
    }
  }

}

object Item0 {

  implicit def implicit0[K <: KindContext]: Application[K, Item0, Type0] = new Application[K, Item0, Type0] {
    override def tag: ItemTag[Item0]                          = Item.tag0
    override def application(context: Context[K]): K#M[Type0] = context.start
  }

  def plus0[T <: TypeParam]: Plus[Type0, T, Type1[T]] = new Plus[Type0, T, Type1[T]] {
    override def plus(p: Item0, item: T#H): Item1[T#H] = Item.apply1(item)
    override def take(t: Item1[T#H]): (Item0, T#H)     = (Item.apply0, t.i1)
    override def sub: Plus[Type0, T#T, Type1[T#T]]     = plus0[T#T]
  }

  def put0[T <: TypeParam]: Plus[Type0, T, Type1[T]] = plus0[T]

}

class Item1[T1](val i1: T1)
class DebugItem1[T1, M1](override val i1: T1) extends Item1[T1](i1) {
  def debug[K <: KindContext, P1 <: TypeParam](context: Context[K])(implicit t1: DebugApplication[K, T1, P1, M1]): Application[K, DebugItem1[T1, M1], Type1[P1]] =
    new Application[K, DebugItem1[T1, M1], Type1[P1]] {
      override def tag: ItemTag[DebugItem1[T1, M1]] = Item.debug1(t1.tag).debug[M1]
      override def application(context: Context[K]): K#M[Type1[P1]] = {
        Item1.implicit1(t1).application(context)
      }
    }
}
class DebugMessage1[T1] {
  def debug[M1]: ItemTag[DebugItem1[T1, M1]] = new ItemTag[DebugItem1[T1, M1]]
}
class Type1[T1 <: TypeParam] extends TypeParam {
  override type H = Item1[T1#H]
  override type T = Type1[T1#T]
}

object DebugItem1 {

  implicit def debugImplicit1[K <: KindContext, T1, M1, P1 <: TypeParam](implicit t1: Application[K, T1, P1]): Application[K, DebugItem1[T1, M1], Type1[P1]] =
    new Application[K, DebugItem1[T1, M1], Type1[P1]] {
      override def tag: ItemTag[DebugItem1[T1, M1]] = Item.debug1(t1.tag).debug[M1]
      override def application(context: Context[K]): K#M[Type1[P1]] = {
        Item1.implicit1(t1).application(context)
      }
    }

}

object Item1 {

  implicit def implicit1[K <: KindContext, T1, P1 <: TypeParam](implicit t1: Application[K, T1, P1]): Application[K, Item1[T1], Type1[P1]] =
    new Application[K, Item1[T1], Type1[P1]] {
      override def tag: ItemTag[Item1[T1]] = Item.tag1(t1.tag)
      override def application(context: Context[K]): K#M[Type1[P1]] = {
        val ii1 = t1.application(context)
        context.append(Item0.implicit0.application(context), ii1, Item0.plus0[P1])
      }
    }

  def plus1[T1 <: TypeParam, T <: TypeParam]: Plus[Type1[T1], T, Type2[T1, T]] = new Plus[Type1[T1], T, Type2[T1, T]] {
    override def plus(p: Item1[T1#H], item: T#H): Item2[T1#H, T#H] = Item.apply2(p.i1, item)
    override def take(t: Item2[T1#H, T#H]): (Item1[T1#H], T#H)     = (Item.apply1(t.i1), t.i2)
    override def sub: Plus[Type1[T1#T], T#T, Type2[T1#T, T#T]]     = plus1[T1#T, T#T]
  }

  def put1[T1 <: TypeParam, T <: TypeParam]: Plus[Type1[T1], T, Type2[T, T1]] = new Plus[Type1[T1], T, Type2[T, T1]] {
    override def plus(p: Item1[T1#H], item: T#H): Item2[T#H, T1#H] = Item.apply2(item, p.i1)
    override def take(t: Item2[T#H, T1#H]): (Item1[T1#H], T#H)     = (Item.apply1(t.i2), t.i1)
    override def sub: Plus[Type1[T1#T], T#T, Type2[T#T, T1#T]]     = put1[T1#T, T#T]
  }

}

class Item2[T1, T2](val i1: T1, val i2: T2)
class DebugItem2[T1, T2, M1, M2](override val i1: T1, override val i2: T2) extends Item2[T1, T2](i1, i2) {
  def debug[K <: KindContext, P1 <: TypeParam, P2 <: TypeParam](
    context: Context[K])(implicit t1: DebugApplication[K, T1, P1, M1], t2: DebugApplication[K, T2, P2, M2]): Application[K, DebugItem2[T1, T2, M1, M2], Type2[P1, P2]] =
    new Application[K, DebugItem2[T1, T2, M1, M2], Type2[P1, P2]] {
      override def tag: ItemTag[DebugItem2[T1, T2, M1, M2]] = Item.debug2(t1.tag, t2.tag).debug[M1, M2]
      override def application(context: Context[K]): K#M[Type2[P1, P2]] = {
        Item2.implicit2(t1, t2).application(context)
      }
    }
}
class DebugMessage2[T1, T2] {
  def debug[M1, M2]: ItemTag[DebugItem2[T1, T2, M1, M2]] = new ItemTag[DebugItem2[T1, T2, M1, M2]]
}
class Type2[T1 <: TypeParam, T2 <: TypeParam] extends TypeParam {
  override type H = Item2[T1#H, T2#H]
  override type T = Type2[T1#T, T2#T]
}

object DebugItem2 {

  implicit def debugImplicit2[K <: KindContext, T1, T2, M1, M2, P1 <: TypeParam, P2 <: TypeParam](
    implicit t1: Application[K, T1, P1],
    t2: Application[K, T2, P2]): Application[K, DebugItem2[T1, T2, M1, M2], Type2[P1, P2]] =
    new Application[K, DebugItem2[T1, T2, M1, M2], Type2[P1, P2]] {
      override def tag: ItemTag[DebugItem2[T1, T2, M1, M2]] = Item.debug2(t1.tag, t2.tag).debug[M1, M2]
      override def application(context: Context[K]): K#M[Type2[P1, P2]] = {
        Item2.implicit2(t1, t2).application(context)
      }
    }

}

object Item2 {

  implicit def implicit2[K <: KindContext, T1, T2, P1 <: TypeParam, P2 <: TypeParam](implicit t1: Application[K, T1, P1],
                                                                                     t2: Application[K, T2, P2]): Application[K, Item2[T1, T2], Type2[P1, P2]] =
    new Application[K, Item2[T1, T2], Type2[P1, P2]] {
      override def tag: ItemTag[Item2[T1, T2]] = Item.tag2(t1.tag, t2.tag)
      override def application(context: Context[K]): K#M[Type2[P1, P2]] = {
        if (context.reverse) {
          val ii1 = t1.application(context)
          context.append(Item1.implicit1(t2).application(context), ii1, Item1.put1[P2, P1])
        } else {
          val ii2 = t2.application(context)
          context.append(Item1.implicit1(t1).application(context), ii2, Item1.plus1[P1, P2])
        }
      }
    }

  def plus2[T1 <: TypeParam, T2 <: TypeParam, T <: TypeParam]: Plus[Type2[T1, T2], T, Type3[T1, T2, T]] = new Plus[Type2[T1, T2], T, Type3[T1, T2, T]] {
    override def plus(p: Item2[T1#H, T2#H], item: T#H): Item3[T1#H, T2#H, T#H] = Item.apply3(p.i1, p.i2, item)
    override def take(t: Item3[T1#H, T2#H, T#H]): (Item2[T1#H, T2#H], T#H)     = (Item.apply2(t.i1, t.i2), t.i3)
    override def sub: Plus[Type2[T1#T, T2#T], T#T, Type3[T1#T, T2#T, T#T]]     = plus2[T1#T, T2#T, T#T]
  }

  def put2[T1 <: TypeParam, T2 <: TypeParam, T <: TypeParam]: Plus[Type2[T1, T2], T, Type3[T, T1, T2]] = new Plus[Type2[T1, T2], T, Type3[T, T1, T2]] {
    override def plus(p: Item2[T1#H, T2#H], item: T#H): Item3[T#H, T1#H, T2#H] = Item.apply3(item, p.i1, p.i2)
    override def take(t: Item3[T#H, T1#H, T2#H]): (Item2[T1#H, T2#H], T#H)     = (Item.apply2(t.i2, t.i3), t.i1)
    override def sub: Plus[Type2[T1#T, T2#T], T#T, Type3[T#T, T1#T, T2#T]]     = put2[T1#T, T2#T, T#T]
  }

}

class Item3[T1, T2, T3](val i1: T1, val i2: T2, val i3: T3)
class DebugItem3[T1, T2, T3, M1, M2, M3](override val i1: T1, override val i2: T2, override val i3: T3) extends Item3[T1, T2, T3](i1, i2, i3) {
  def debug[K <: KindContext, P1 <: TypeParam, P2 <: TypeParam, P3 <: TypeParam](context: Context[K])(
    implicit t1: DebugApplication[K, T1, P1, M1],
    t2: DebugApplication[K, T2, P2, M2],
    t3: DebugApplication[K, T3, P3, M3]): Application[K, DebugItem3[T1, T2, T3, M1, M2, M3], Type3[P1, P2, P3]] =
    new Application[K, DebugItem3[T1, T2, T3, M1, M2, M3], Type3[P1, P2, P3]] {
      override def tag: ItemTag[DebugItem3[T1, T2, T3, M1, M2, M3]] = Item.debug3(t1.tag, t2.tag, t3.tag).debug[M1, M2, M3]
      override def application(context: Context[K]): K#M[Type3[P1, P2, P3]] = {
        Item3.implicit3(t1, t2, t3).application(context)
      }
    }
}
class DebugMessage3[T1, T2, T3] {
  def debug[M1, M2, M3]: ItemTag[DebugItem3[T1, T2, T3, M1, M2, M3]] = new ItemTag[DebugItem3[T1, T2, T3, M1, M2, M3]]
}
class Type3[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam] extends TypeParam {
  override type H = Item3[T1#H, T2#H, T3#H]
  override type T = Type3[T1#T, T2#T, T3#T]
}

object DebugItem3 {

  implicit def debugImplicit3[K <: KindContext, T1, T2, T3, M1, M2, M3, P1 <: TypeParam, P2 <: TypeParam, P3 <: TypeParam](
      implicit t1: Application[K, T1, P1]
    , t2: Application[K, T2, P2]
    , t3: Application[K, T3, P3]
  ): Application[K, DebugItem3[T1, T2, T3, M1, M2, M3], Type3[P1, P2, P3]] =
    new Application[K, DebugItem3[T1, T2, T3, M1, M2, M3], Type3[P1, P2, P3]] {
      override def tag: ItemTag[DebugItem3[T1, T2, T3, M1, M2, M3]] = Item.debug3(t1.tag, t2.tag, t3.tag).debug[M1, M2, M3]
      override def application(context: Context[K]): K#M[Type3[P1, P2, P3]] = {
        Item3.implicit3(t1, t2, t3).application(context)
      }
    }

}

object Item3 {

  implicit def implicit3[K <: KindContext, T1, T2, T3, P1 <: TypeParam, P2 <: TypeParam, P3 <: TypeParam](
      implicit t1: Application[K, T1, P1]
    , t2: Application[K, T2, P2]
    , t3: Application[K, T3, P3]
  ): Application[K, Item3[T1, T2, T3], Type3[P1, P2, P3]] =
    new Application[K, Item3[T1, T2, T3], Type3[P1, P2, P3]] {
      override def tag: ItemTag[Item3[T1, T2, T3]] = Item.tag3(t1.tag, t2.tag, t3.tag)
      override def application(context: Context[K]): K#M[Type3[P1, P2, P3]] = {
        if (context.reverse) {
          val ii1 = t1.application(context)
          context.append(Item2.implicit2(t2, t3).application(context), ii1, Item2.put2[P2, P3, P1])
        } else {
          val ii3 = t3.application(context)
          context.append(Item2.implicit2(t1, t2).application(context), ii3, Item2.plus2[P1, P2, P3])
        }
      }
    }

  def plus3[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T <: TypeParam]: Plus[Type3[T1, T2, T3], T, Type4[T1, T2, T3, T]] =
    new Plus[Type3[T1, T2, T3], T, Type4[T1, T2, T3, T]] {
      override def plus(p: Item3[T1#H, T2#H, T3#H], item: T#H): Item4[T1#H, T2#H, T3#H, T#H] = Item.apply4(p.i1, p.i2, p.i3, item)
      override def take(t: Item4[T1#H, T2#H, T3#H, T#H]): (Item3[T1#H, T2#H, T3#H], T#H)     = (Item.apply3(t.i1, t.i2, t.i3), t.i4)
      override def sub: Plus[Type3[T1#T, T2#T, T3#T], T#T, Type4[T1#T, T2#T, T3#T, T#T]]     = plus3[T1#T, T2#T, T3#T, T#T]
    }

  def put3[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T <: TypeParam]: Plus[Type3[T1, T2, T3], T, Type4[T, T1, T2, T3]] =
    new Plus[Type3[T1, T2, T3], T, Type4[T, T1, T2, T3]] {
      override def plus(p: Item3[T1#H, T2#H, T3#H], item: T#H): Item4[T#H, T1#H, T2#H, T3#H] = Item.apply4(item, p.i1, p.i2, p.i3)
      override def take(t: Item4[T#H, T1#H, T2#H, T3#H]): (Item3[T1#H, T2#H, T3#H], T#H)     = (Item.apply3(t.i2, t.i3, t.i4), t.i1)
      override def sub: Plus[Type3[T1#T, T2#T, T3#T], T#T, Type4[T#T, T1#T, T2#T, T3#T]]     = put3[T1#T, T2#T, T3#T, T#T]
    }

}

class Item4[T1, T2, T3, T4](val i1: T1, val i2: T2, val i3: T3, val i4: T4)
class DebugItem4[T1, T2, T3, T4, M1, M2, M3, M4](override val i1: T1, override val i2: T2, override val i3: T3, override val i4: T4)
    extends Item4[T1, T2, T3, T4](i1, i2, i3, i4) {
  def debug[K <: KindContext, P1 <: TypeParam, P2 <: TypeParam, P3 <: TypeParam, P4 <: TypeParam](context: Context[K])(
    implicit t1: DebugApplication[K, T1, P1, M1],
    t2: DebugApplication[K, T2, P2, M2],
    t3: DebugApplication[K, T3, P3, M3],
    t4: DebugApplication[K, T4, P4, M4]): Application[K, DebugItem4[T1, T2, T3, T4, M1, M2, M3, M4], Type4[P1, P2, P3, P4]] =
    new Application[K, DebugItem4[T1, T2, T3, T4, M1, M2, M3, M4], Type4[P1, P2, P3, P4]] {
      override def tag: ItemTag[DebugItem4[T1, T2, T3, T4, M1, M2, M3, M4]] = Item.debug4(t1.tag, t2.tag, t3.tag, t4.tag).debug[M1, M2, M3, M4]
      override def application(context: Context[K]): K#M[Type4[P1, P2, P3, P4]] = {
        Item4.implicit4(t1, t2, t3, t4).application(context)
      }
    }
}
class DebugMessage4[T1, T2, T3, T4] {
  def debug[M1, M2, M3, M4]: ItemTag[DebugItem4[T1, T2, T3, T4, M1, M2, M3, M4]] = new ItemTag[DebugItem4[T1, T2, T3, T4, M1, M2, M3, M4]]
}
class Type4[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam] extends TypeParam {
  override type H = Item4[T1#H, T2#H, T3#H, T4#H]
  override type T = Type4[T1#T, T2#T, T3#T, T4#T]
}

object DebugItem4 {

  implicit def debugImplicit4[K <: KindContext, T1, T2, T3, T4, M1, M2, M3, M4, P1 <: TypeParam, P2 <: TypeParam, P3 <: TypeParam, P4 <: TypeParam](
      implicit t1: Application[K, T1, P1]
    , t2: Application[K, T2, P2]
    , t3: Application[K, T3, P3]
    , t4: Application[K, T4, P4]
  ): Application[K, DebugItem4[T1, T2, T3, T4, M1, M2, M3, M4], Type4[P1, P2, P3, P4]] =
    new Application[K, DebugItem4[T1, T2, T3, T4, M1, M2, M3, M4], Type4[P1, P2, P3, P4]] {
      override def tag: ItemTag[DebugItem4[T1, T2, T3, T4, M1, M2, M3, M4]] = Item.debug4(t1.tag, t2.tag, t3.tag, t4.tag).debug[M1, M2, M3, M4]
      override def application(context: Context[K]): K#M[Type4[P1, P2, P3, P4]] = {
        Item4.implicit4(t1, t2, t3, t4).application(context)
      }
    }

}

object Item4 {

  implicit def implicit4[K <: KindContext, T1, T2, T3, T4, P1 <: TypeParam, P2 <: TypeParam, P3 <: TypeParam, P4 <: TypeParam](
      implicit t1: Application[K, T1, P1]
    , t2: Application[K, T2, P2]
    , t3: Application[K, T3, P3]
    , t4: Application[K, T4, P4]
  ): Application[K, Item4[T1, T2, T3, T4], Type4[P1, P2, P3, P4]] =
    new Application[K, Item4[T1, T2, T3, T4], Type4[P1, P2, P3, P4]] {
      override def tag: ItemTag[Item4[T1, T2, T3, T4]] = Item.tag4(t1.tag, t2.tag, t3.tag, t4.tag)
      override def application(context: Context[K]): K#M[Type4[P1, P2, P3, P4]] = {
        if (context.reverse) {
          val ii1 = t1.application(context)
          context.append(Item3.implicit3(t2, t3, t4).application(context), ii1, Item3.put3[P2, P3, P4, P1])
        } else {
          val ii4 = t4.application(context)
          context.append(Item3.implicit3(t1, t2, t3).application(context), ii4, Item3.plus3[P1, P2, P3, P4])
        }
      }
    }

}

class ItemTagWithMessage[T, Message] extends ItemTag[T]

class ItemTag[T] {
  def debug: T = throw new Exception("debugging")
}

class Item

object Item {

  val apply0: Item0                                                                 = new Item0
  def apply1[T1](t1: T1): Item1[T1]                                                 = new Item1(t1)
  def apply2[T1, T2](t1: T1, t2: T2): Item2[T1, T2]                                 = new Item2(t1, t2)
  def apply3[T1, T2, T3](t1: T1, t2: T2, t3: T3): Item3[T1, T2, T3]                 = new Item3(t1, t2, t3)
  def apply4[T1, T2, T3, T4](t1: T1, t2: T2, t3: T3, t4: T4): Item4[T1, T2, T3, T4] = new Item4(t1, t2, t3, t4)

  val tag0: ItemTag[Item0]                                                                                                     = new ItemTag[Item0]
  def tag1[T1](t1: ItemTag[T1]): ItemTag[Item1[T1]]                                                                            = new ItemTag[Item1[T1]]
  def tag2[T1, T2](t1: ItemTag[T1], t2: ItemTag[T2]): ItemTag[Item2[T1, T2]]                                                   = new ItemTag[Item2[T1, T2]]
  def tag3[T1, T2, T3](t1: ItemTag[T1], t2: ItemTag[T2], t3: ItemTag[T3]): ItemTag[Item3[T1, T2, T3]]                          = new ItemTag[Item3[T1, T2, T3]]
  def tag4[T1, T2, T3, T4](t1: ItemTag[T1], t2: ItemTag[T2], t3: ItemTag[T3], t4: ItemTag[T4]): ItemTag[Item4[T1, T2, T3, T4]] = new ItemTag[Item4[T1, T2, T3, T4]]

  val debug0: DebugMessage0                                                                                                     = new DebugMessage0
  def debug1[T1](t1: ItemTag[T1]): DebugMessage1[T1]                                                                            = new DebugMessage1[T1]
  def debug2[T1, T2](t1: ItemTag[T1], t2: ItemTag[T2]): DebugMessage2[T1, T2]                                                   = new DebugMessage2[T1, T2]
  def debug3[T1, T2, T3](t1: ItemTag[T1], t2: ItemTag[T2], t3: ItemTag[T3]): DebugMessage3[T1, T2, T3]                          = new DebugMessage3[T1, T2, T3]
  def debug4[T1, T2, T3, T4](t1: ItemTag[T1], t2: ItemTag[T2], t3: ItemTag[T3], t4: ItemTag[T4]): DebugMessage4[T1, T2, T3, T4] = new DebugMessage4[T1, T2, T3, T4]

  def message1[T1, M1](t1: ItemTagWithMessage[T1, M1]): ItemTag[DebugItem1[T1, M1]] = new ItemTag[DebugItem1[T1, M1]]
  def message2[T1, T2, M1, M2](t1: ItemTagWithMessage[T1, M1], t2: ItemTagWithMessage[T2, M2]): ItemTag[DebugItem2[T1, T2, M1, M2]] =
    new ItemTag[DebugItem2[T1, T2, M1, M2]]
  def message3[T1, T2, T3, M1, M2, M3](t1: ItemTagWithMessage[T1, M1],
                                       t2: ItemTagWithMessage[T2, M2],
                                       t3: ItemTagWithMessage[T3, M3]): ItemTag[DebugItem3[T1, T2, T3, M1, M2, M3]] =
    new ItemTag[DebugItem3[T1, T2, T3, M1, M2, M3]]
  def message4[T1, T2, T3, T4, M1, M2, M3, M4](t1: ItemTagWithMessage[T1, M1],
                                               t2: ItemTagWithMessage[T2, M2],
                                               t3: ItemTagWithMessage[T3, M3],
                                               t4: ItemTagWithMessage[T4, M4]): ItemTag[DebugItem4[T1, T2, T3, T4, M1, M2, M3, M4]] =
    new ItemTag[DebugItem4[T1, T2, T3, T4, M1, M2, M3, M4]]

  def 虚得一逼[T](tag: => ItemTag[T]): ItemTag[T] = new ItemTag[T]

}

trait Application[K <: KindContext, T, I <: TypeParam] {
  def tag: ItemTag[T]
  def application(context: Context[K]): K#M[I]
}

@implicitNotFound(msg = "\nApplication not found.\nKindContext: ${K}\nMessage    :${Message}")
trait DebugApplication[K <: KindContext, T, I <: TypeParam, Message] extends Application[K, T, I] {
  override def tag: ItemTag[T]
  override def application(context: Context[K]): K#M[I]
}

object DebugApplication {

  implicit def applicationImplicit[K <: KindContext, T, I <: TypeParam, Message](implicit app: Application[K, T, I]): DebugApplication[K, T, I, Message] = {
    new DebugApplication[K, T, I, Message] {
      override def tag: ItemTag[T]                          = Item.虚得一逼(app.tag)
      override def application(context: Context[K]): K#M[I] = app.application(context)
    }
  }

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
  self =>

  def reverse: Boolean
  def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z]
  def start: K#M[Type0]
  def lift[T, I <: TypeParam](i: ItemTag[T])(implicit ii: Application[K, T, I]): K#M[I] = ii.application(context = self)

}

object Context {
  def 虚得一逼[T](t: => T): ItemTag[T] = new ItemTag[T]
}
