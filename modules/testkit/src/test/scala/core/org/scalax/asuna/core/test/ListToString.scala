package asuna.testkit.circe.test2

import asuna.macros.{AsunaGeneric, AsunaGetterGeneric, AsunaLabelledGeneric, PropertyTag}
import asuna.{AppendTag, Application2, AsunaTuple0, Context2, Plus2, TupleTag}

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

trait LTString[I1, I2] {
  def string(i1: I1, i2: I2): ListToString
}

object i extends Context2[LTString] {

  override def append[X1, X2, Y1, Y2, Z1, Z2](x: LTString[X1, X2], y: LTString[Y1, Y2])(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): LTString[Z1, Z2] = { (i1, i2) =>
    val t1 = x.string(p.takeHead1(i1), p.takeHead2(i2))
    val t2 = y.string(p.takeTail1(i1), p.takeTail2(i2))
    new ListToString {
      override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = t2.init(t1.init(i))
    }
  }

  override def start: LTString[AsunaTuple0, AsunaTuple0] = { (i1: AsunaTuple0, i2: AsunaTuple0) =>
    new ListToString {
      override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = i
    }
  }
}

object in {

  def encoder[I1, I2 <: TupleTag, I3, I4](
    implicit ii: AsunaGeneric.Aux[I1, I2],
    pp: Application2[LTString, I2, I3, I4],
    asunaGetterGeneric: AsunaGetterGeneric[I1, I3],
    asunaNameGeneric: AsunaLabelledGeneric[I1, I4]
  ): ListEncoder[I1] = {
    new ListEncoder[I1] {
      override def encode(ii: I1): List[(PropertyItem, String)] = {
        pp.application(i).string(asunaGetterGeneric.getter(ii), asunaNameGeneric.names).init(List.empty)
      }
    }
  }

  def init1[I2 <: TupleTag](appendTag: AppendTag[I2]) = new ToStringApply2[I2]

  class ToStringApply2[I2 <: TupleTag] {
    def init2[I3, I4](implicit app1: Application2[LTString, I2, I3, I4]): ToStringApply3[I2, I3, I4] =
      new ToStringApply3[I2, I3, I4] {
        override def app: Application2[LTString, I2, I3, I4] = app1
      }
  }

  trait ToStringApply3[I2 <: TupleTag, I3, I4] {
    def app: Application2[LTString, I2, I3, I4]
    def encode[Model](ii: Model => I3, name: I4): ListEncoder[Model] = new ListEncoder[Model] {
      override def encode(model: Model): List[(PropertyItem, String)] = {
        app.application(i).string(ii(model), name).init(List.empty)
      }
    }
  }

  implicit val pp1: Application2[LTString, PropertyTag[String], String, String] =
    new Application2[LTString, PropertyTag[String], String, String] {
      override def application(context: Context2[LTString]): LTString[String, String] = { (t, r) =>
        new ListToString {
          override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (StringProperty(t), r) :: i
        }
      }
    }

  implicit val pp2: Application2[LTString, PropertyTag[Int], Int, String] =
    new Application2[LTString, PropertyTag[Int], Int, String] {
      override def application(context: Context2[LTString]): LTString[Int, String] = (t, r) => {
        new ListToString {
          override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (IntProperty(t), r) :: i
        }
      }
    }

  implicit val pp3: Application2[LTString, PropertyTag[Long], Long, String] =
    new Application2[LTString, PropertyTag[Long], Long, String] {
      override def application(context: Context2[LTString]): LTString[Long, String] = (t, r) => {
        new ListToString {
          override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (LongProperty(t), r) :: i
        }
      }
    }

}
