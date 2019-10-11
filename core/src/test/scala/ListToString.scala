package org.scalax.asuna

import org.scalax.asuna.mapper.append.macroImpl.{AsunaGeneric, AsunaGetterGeneric, AsunaNameGeneric}
import org.scalax.asuna.mapper.{Application, Context, Item0, ItemTag, KindContext, Plus, TypeParameter, TypeParameter2}

trait ListToString {

  def init(i: List[(String, String)]): List[(String, String)]

}

trait ListEncoder[E] {
  def encode(i: E): List[(String, String)]
}

class IContext extends KindContext {

  override type M[T <: TypeParameter] = (T#H, T#T#H) => ListToString

}

object i extends Context[IContext] {
  override def isReverse: Boolean = true

  override def useHList: Boolean = true

  override def append[X <: TypeParameter, Y <: TypeParameter, Z <: TypeParameter](x: (X#H, X#T#H) => ListToString,
                                                                      y: (Y#H, Y#T#H) => ListToString,
                                                                      p: Plus[X, Y, Z]): (Z#H, Z#T#H) => ListToString = {
    { (i1: Z#H, i2: Z#T#H) =>
      val t1 = x(p.takeHead(i1), p.sub.takeHead(i2))
      val t2 = y(p.takeTail(i1), p.sub.takeTail(i2))
      new ListToString {
        override def init(i: List[(String, String)]): List[(String, String)] = t2.init(t1.init(i))
      }
    }
  }

  override def start: (Item0, Item0) => ListToString =
    (i1: Item0, i2: Item0) =>
      new ListToString {
        override def init(i: List[(String, String)]): List[(String, String)] = i
    }
}

object in {

  def encoder[I1, I2 <: ItemTag, I3 <: TypeParameter](implicit ii: AsunaGeneric.Aux[I1, I2],
                                                  pp: Application[IContext, I2, I3],
                                                  asunaGetterGeneric: AsunaGetterGeneric.Aux[I1, I3#H],
                                                  asunaNameGeneric: AsunaNameGeneric.Aux[I1, I3#T#H]) = {
    new ListEncoder[I1] {
      override def encode(ii: I1): List[(String, String)] = {
        pp.application(i)(asunaGetterGeneric.getter(ii).withContext(i), asunaNameGeneric.names.withContext(i)).init(List.empty)
      }
    }
  }

  implicit val pp1: Application[IContext, String, TypeParameter2[String, String]] = new Application[IContext, String, TypeParameter2[String, String]] {
    override def application(context: Context[IContext]): (String, String) => ListToString = (t, r) => {
      new ListToString {
        override def init(i: List[(String, String)]): List[(String, String)] = (t, r) :: i
      }
    }
  }

  implicit val pp2: Application[IContext, Int, TypeParameter2[Int, String]] = new Application[IContext, Int, TypeParameter2[Int, String]] {
    override def application(context: Context[IContext]): (Int, String) => ListToString = (t, r) => {
      new ListToString {
        override def init(i: List[(String, String)]): List[(String, String)] = (t.toString, r) :: i
      }
    }
  }

  implicit val pp3: Application[IContext, Long, TypeParameter2[Long, String]] = new Application[IContext, Long, TypeParameter2[Long, String]] {
    override def application(context: Context[IContext]): (Long, String) => ListToString = (t, r) => {
      new ListToString {
        override def init(i: List[(String, String)]): List[(String, String)] = (t.toString, r) :: i
      }
    }
  }

}
