package asuna.testkit

import asuna.macros.{AsunaGeneric, AsunaGetterGeneric, AsunaLabelledGeneric, PropertyTag}
import asuna.{AppendTag, Application, Context, Item0, ItemTag, KindContext, Plus, TypeHList, TypeHList2}

sealed trait PropertyItem
case class IntProperty(i: Int) extends PropertyItem {
  override def toString = s"Int(${i})"
}
case class StringProperty(i: String) extends PropertyItem {
  override def toString = s"String(${i})"
}
case class LongProperty(i: Long) extends PropertyItem {
  override def toString = s"Long(${i})"
}

trait ListToString {

  def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)]

}

trait ListEncoder[E] {
  def encode(i: E): List[(PropertyItem, String)]
}

class IContext extends KindContext {

  override type M[T <: TypeHList] = (T#H, T#T#H) => ListToString

}

object i extends Context[IContext] {

  override def isReverse: Boolean = true

  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
    x: (X#H, X#T#H) => ListToString,
    y: (Y#H, Y#T#H) => ListToString,
    p: Plus[X, Y, Z]
  ): (Z#H, Z#T#H) => ListToString = {
    { (i1: Z#H, i2: Z#T#H) =>
      val t1 = x(p.takeHead(i1), p.sub.takeHead(i2))
      val t2 = y(p.takeTail(i1), p.sub.takeTail(i2))
      new ListToString {
        override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = t2.init(t1.init(i))
      }
    }
  }

  override def start: (Item0, Item0) => ListToString =
    (i1: Item0, i2: Item0) =>
      new ListToString {
        override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = i
      }

}

object in {

  def encoder[I1, I2 <: ItemTag, I3 <: TypeHList](
    implicit ii: AsunaGeneric.Aux[I1, I2],
    pp: Application[IContext, I2, I3],
    asunaGetterGeneric: AsunaGetterGeneric[I1, I3#H],
    asunaNameGeneric: AsunaLabelledGeneric[I1, I3#T#H]
  ): ListEncoder[I1] = {
    new ListEncoder[I1] {
      override def encode(ii: I1): List[(PropertyItem, String)] = {
        pp.application(i)(asunaGetterGeneric.getter(ii).withContext(i), asunaNameGeneric.names.withContext(i)).init(List.empty)
      }
    }
  }

  def init1[I2 <: ItemTag](appendTag: AppendTag[I2]) = new ToStringApply2[I2]

  class ToStringApply2[I2 <: ItemTag] {
    def init2[I3 <: TypeHList](implicit app1: Application[IContext, I2, I3]) = new ToStringApply3[I2, I3] {
      override def app: Application[IContext, I2, I3] = app1
    }
  }

  trait ToStringApply3[I2 <: ItemTag, I3 <: TypeHList] {
    def app: Application[IContext, I2, I3]
    def encode[Model](ii: Model => I3#H, name: I3#T#H): ListEncoder[Model] = new ListEncoder[Model] {
      override def encode(model: Model): List[(PropertyItem, String)] = {
        app.application(i)(ii(model), name).init(List.empty)
      }
    }
  }

  implicit val pp1: Application[IContext, PropertyTag[String], TypeHList2[String, String]] =
    new Application[IContext, PropertyTag[String], TypeHList2[String, String]] {
      override def application(context: Context[IContext]): (String, String) => ListToString = (t, r) => {
        new ListToString {
          override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (StringProperty(t), r) :: i
        }
      }
    }

  implicit val pp2: Application[IContext, PropertyTag[Int], TypeHList2[Int, String]] = new Application[IContext, PropertyTag[Int], TypeHList2[Int, String]] {
    override def application(context: Context[IContext]): (Int, String) => ListToString = (t, r) => {
      new ListToString {
        override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (IntProperty(t), r) :: i
      }
    }
  }

  implicit val pp3: Application[IContext, PropertyTag[Long], TypeHList2[Long, String]] = new Application[IContext, PropertyTag[Long], TypeHList2[Long, String]] {
    override def application(context: Context[IContext]): (Long, String) => ListToString = (t, r) => {
      new ListToString {
        override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (LongProperty(t), r) :: i
      }
    }
  }

}
