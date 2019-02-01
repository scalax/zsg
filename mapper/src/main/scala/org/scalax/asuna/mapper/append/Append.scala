package org.scalax.asuna.mapper.append

import scala.annotation.implicitNotFound
import scala.language.higherKinds
import scala.language.implicitConversions

trait TypeParam {
  type H
  type T <: TypeParam
}

class Item0

class Type0 extends TypeParam {
  override type H = Item0
  override type T = Type0
}

class Item1[T1](val i1: T1)

class Type1[T1 <: TypeParam] extends TypeParam {
  override type H = Item1[T1#H]
  override type T = Type1[T1#T]
}

class Item2[T1, T2](val i1: T1, val i2: T2)

class Type2[T1 <: TypeParam, T2 <: TypeParam] extends TypeParam {
  override type H = Item2[T1#H, T2#H]
  override type T = Type2[T1#T, T2#T]
}

class Item3[T1, T2, T3](val i1: T1, val i2: T2, val i3: T3)

class Type3[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam] extends TypeParam {
  override type H = Item3[T1#H, T2#H, T3#H]
  override type T = Type3[T1#T, T2#T, T3#T]
}

class Item4[T1, T2, T3, T4](val i1: T1, val i2: T2, val i3: T3, val i4: T4)

class Type4[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam] extends TypeParam {
  override type H = Item4[T1#H, T2#H, T3#H, T4#H]
  override type T = Type4[T1#T, T2#T, T3#T, T4#T]
}

object Item {

  val apply0: Item0                                                                 = new Item0
  def apply1[T1](t1: T1): Item1[T1]                                                 = new Item1(t1)
  def apply2[T1, T2](t1: T1, t2: T2): Item2[T1, T2]                                 = new Item2(t1, t2)
  def apply3[T1, T2, T3](t1: T1, t2: T2, t3: T3): Item3[T1, T2, T3]                 = new Item3(t1, t2, t3)
  def apply4[T1, T2, T3, T4](t1: T1, t2: T2, t3: T3, t4: T4): Item4[T1, T2, T3, T4] = new Item4(t1, t2, t3, t4)

  val applyTag0: ItemTag[TagTag0]                                                                              = new ItemTag[TagTag0]
  def applyTag1[T1](tag1: ItemTag[T1]): DebugTagTag1[T1]                                                       = new DebugTagTag1[T1]
  def applyTag2[T1, T2](tag1: ItemTag[T1], tag2: ItemTag[T2]): DebugTagTag2[T1, T2]                            = new DebugTagTag2[T1, T2]
  def applyTag3[T1, T2, T3](tag1: ItemTag[T1], tag2: ItemTag[T2], tag3: ItemTag[T3]): DebugTagTag3[T1, T2, T3] = new DebugTagTag3[T1, T2, T3]
  def applyTag4[T1, T2, T3, T4](tag1: ItemTag[T1], tag2: ItemTag[T2], tag3: ItemTag[T3], tag4: ItemTag[T4]): DebugTagTag4[T1, T2, T3, T4] =
    new DebugTagTag4[T1, T2, T3, T4]
  def 虚得一逼[T](tag: => ItemTag[T]): ItemTag[T] = new ItemTag[T]

}

class ItemTag[T] {
  def debug: T = throw new Exception("debugging")
}

class TagTag0 {
  def debug[K <: KindContext](context: Context[K]): Application[K, TagTag0, Type0] = TagTag0.implicit0[K]
}

object TagTag0 {

  implicit def implicit0[K <: KindContext]: Application[K, TagTag0, Type0] = new Application[K, TagTag0, Type0] {
    override def application(t: ItemTag[TagTag0], context: Context[K]): K#M[Type0] = context.start
  }

  def plus0[T <: TypeParam]: Plus[Type0, T, Type1[T]] = new Plus[Type0, T, Type1[T]] {
    override def plus(p: Item0, item: T#H): Item1[T#H] = Item.apply1(item)
    override def take(t: Item1[T#H]): (Item0, T#H)     = (Item.apply0, t.i1)
    override def sub: Plus[Type0, T#T, Type1[T#T]]     = plus0[T#T]
  }

  def put0[T <: TypeParam]: Plus[Type0, T, Type1[T]] = plus0[T]

}

class DebugTagTag1[T1] {
  def message[M1] = new ItemTag[TagTag1[T1, M1]]
}

class TagTag1[T1, M1] {
  def i1: T1 = throw new Exception("debugging")

  def debug[K <: KindContext, P1 <: TypeParam](context: Context[K])(implicit t1: DebugApplication[K, T1, P1, M1]): Application[K, TagTag1[T1, M1], Type1[P1]] =
    TagTag1.implicit1(t1.app)
}

object TagTag1 {

  implicit def implicit1[K <: KindContext, T1, M1, P1 <: TypeParam](implicit t1: Application[K, T1, P1]): Application[K, TagTag1[T1, M1], Type1[P1]] =
    new Application[K, TagTag1[T1, M1], Type1[P1]] {
      override def application(t: ItemTag[TagTag1[T1, M1]], context: Context[K]): K#M[Type1[P1]] = {
        val ii1 = t1.application(new ItemTag[T1], context)
        context.append(TagTag0.implicit0.application(new ItemTag[TagTag0], context), ii1, TagTag0.plus0[P1])
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

class DebugTagTag2[T1, T2] {
  def message[M1, M2] = new ItemTag[TagTag2[T1, T2, M1, M2]]
}

class TagTag2[T1, T2, M1, M2] {
  def i1: T1 = throw new Exception("debugging")
  def i2: T2 = throw new Exception("debugging")

  def debug[K <: KindContext, P1 <: TypeParam, P2 <: TypeParam](context: Context[K])(
    implicit t1: DebugApplication[K, T1, P1, M1],
    t2: DebugApplication[K, T2, P2, M2]): Application[K, TagTag2[T1, T2, M1, M2], Type2[P1, P2]] =
    TagTag2.implicit2(t1.app, t2.app)
}

object TagTag2 {

  implicit def implicit2[K <: KindContext, T1, T2, M1, M2, P1 <: TypeParam, P2 <: TypeParam](
    implicit t1: Application[K, T1, P1],
    t2: Application[K, T2, P2]): Application[K, TagTag2[T1, T2, M1, M2], Type2[P1, P2]] =
    new Application[K, TagTag2[T1, T2, M1, M2], Type2[P1, P2]] {
      override def application(t: ItemTag[TagTag2[T1, T2, M1, M2]], context: Context[K]): K#M[Type2[P1, P2]] = {
        if (context.reverse) {
          val ii1 = t1.application(new ItemTag[T1], context)
          context.append(TagTag1.implicit1(t2).application(new ItemTag[TagTag1[T2, M2]], context), ii1, TagTag1.put1[P2, P1])
        } else {
          val ii2 = t2.application(new ItemTag[T2], context)
          context.append(TagTag1.implicit1(t1).application(new ItemTag[TagTag1[T1, M1]], context), ii2, TagTag1.plus1[P1, P2])
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

class DebugTagTag3[T1, T2, T3] {
  def message[M1, M2, M3] = new ItemTag[TagTag3[T1, T2, T3, M1, M2, M3]]
}

class TagTag3[T1, T2, T3, M1, M2, M3] {
  def i1: T1 = throw new Exception("debugging")
  def i2: T2 = throw new Exception("debugging")
  def i3: T3 = throw new Exception("debugging")

  def debug[K <: KindContext, P1 <: TypeParam, P2 <: TypeParam, P3 <: TypeParam](context: Context[K])(
    implicit t1: DebugApplication[K, T1, P1, M1],
    t2: DebugApplication[K, T2, P2, M2],
    t3: DebugApplication[K, T3, P3, M3]): Application[K, TagTag3[T1, T2, T3, M1, M2, M3], Type3[P1, P2, P3]] =
    TagTag3.implicit3(t1.app, t2.app, t3.app)
}

object TagTag3 {

  implicit def implicit3[K <: KindContext, T1, T2, T3, M1, M2, M3, P1 <: TypeParam, P2 <: TypeParam, P3 <: TypeParam](
      implicit t1: Application[K, T1, P1]
    , t2: Application[K, T2, P2]
    , t3: Application[K, T3, P3]
  ): Application[K, TagTag3[T1, T2, T3, M1, M2, M3], Type3[P1, P2, P3]] =
    new Application[K, TagTag3[T1, T2, T3, M1, M2, M3], Type3[P1, P2, P3]] {
      override def application(t: ItemTag[TagTag3[T1, T2, T3, M1, M2, M3]], context: Context[K]): K#M[Type3[P1, P2, P3]] = {
        if (context.reverse) {
          val ii1 = t1.application(new ItemTag[T1], context)
          context.append(TagTag2.implicit2(t2, t3).application(new ItemTag[TagTag2[T2, T3, M2, M3]], context), ii1, TagTag2.put2[P2, P3, P1])
        } else {
          val ii3 = t3.application(new ItemTag[T3], context)
          context.append(TagTag2.implicit2(t1, t2).application(new ItemTag[TagTag2[T1, T2, M1, M2]], context), ii3, TagTag2.plus2[P1, P2, P3])
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

class DebugTagTag4[T1, T2, T3, T4] {
  def message[M1, M2, M3, M4] = new ItemTag[TagTag4[T1, T2, T3, T4, M1, M2, M3, M4]]
}

class TagTag4[T1, T2, T3, T4, M1, M2, M3, M4] {
  def i1: T1 = throw new Exception("debugging")
  def i2: T2 = throw new Exception("debugging")
  def i3: T3 = throw new Exception("debugging")
  def i4: T4 = throw new Exception("debugging")

  def debug[K <: KindContext, P1 <: TypeParam, P2 <: TypeParam, P3 <: TypeParam, P4 <: TypeParam](context: Context[K])(
    implicit t1: DebugApplication[K, T1, P1, M1],
    t2: DebugApplication[K, T2, P2, M2],
    t3: DebugApplication[K, T3, P3, M3],
    t4: DebugApplication[K, T4, P4, M4]): Application[K, TagTag4[T1, T2, T3, T4, M1, M2, M3, M4], Type4[P1, P2, P3, P4]] =
    TagTag4.implicit4(t1.app, t2.app, t3.app, t4.app)
}

object TagTag4 {

  implicit def implicit4[K <: KindContext, T1, T2, T3, T4, M1, M2, M3, M4, P1 <: TypeParam, P2 <: TypeParam, P3 <: TypeParam, P4 <: TypeParam](
      implicit t1: Application[K, T1, P1]
    , t2: Application[K, T2, P2]
    , t3: Application[K, T3, P3]
    , t4: Application[K, T4, P4]
  ): Application[K, TagTag4[T1, T2, T3, T4, M1, M2, M3, M4], Type4[P1, P2, P3, P4]] =
    new Application[K, TagTag4[T1, T2, T3, T4, M1, M2, M3, M4], Type4[P1, P2, P3, P4]] {
      override def application(t: ItemTag[TagTag4[T1, T2, T3, T4, M1, M2, M3, M4]], context: Context[K]): K#M[Type4[P1, P2, P3, P4]] = {
        if (context.reverse) {
          val ii1 = t1.application(new ItemTag[T1], context)
          context.append(TagTag3.implicit3(t2, t3, t4).application(new ItemTag[TagTag3[T2, T3, T4, M2, M3, M4]], context), ii1, TagTag3.put3[P2, P3, P4, P1])
        } else {
          val ii4 = t4.application(new ItemTag[T4], context)
          context.append(TagTag3.implicit3(t1, t2, t3).application(new ItemTag[TagTag3[T1, T2, T3, M1, M2, M3]], context), ii4, TagTag3.plus3[P1, P2, P3, P4])
        }
      }
    }

}

trait Application[K <: KindContext, T, I <: TypeParam] {
  def application(t: ItemTag[T], context: Context[K]): K#M[I]
}

@implicitNotFound(msg = "Application not found\nKindContext: ${K}\nMessage: ${Message}")
trait DebugApplication[K <: KindContext, T, I <: TypeParam, Message] {
  def app: Application[K, T, I]
}

object DebugApplication {
  implicit def implicitImplicit[K <: KindContext, T, I <: TypeParam, Message](implicit p: Application[K, T, I]): DebugApplication[K, T, I, Message] =
    new DebugApplication[K, T, I, Message] {
      override def app = p
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
  def lift[T, I <: TypeParam](i: ItemTag[T])(implicit ii: Application[K, T, I]): K#M[I] = ii.application(t = i, context = self)

}

object Context {
  def 虚得一逼[T](t: => T): ItemTag[T] = new ItemTag[T]
}
