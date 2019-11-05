package asuna.testkit

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

trait ModelToString {
  def appendField(i: List[(PropertyItem, String)]): List[(PropertyItem, String)]
}

trait ListEncoder[E] {
  def encode(i: E): List[(PropertyItem, String)]
}

object i extends Context2[in.II] {


  override def append[X1, X2, Y1, Y2, Z1, Z2](x: (X1, X2) => ModelToString, y: (Y1, Y2) => ModelToString)(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): (Z1, Z2) => ModelToString = {
    (i1, i2) =>
      val t1 = x(p.takeHead1(i1), p.takeHead2(i2))
      val t2 = y(p.takeTail1(i1), p.takeTail2(i2))
      new ModelToString {
        override def appendField(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = t2.appendField(t1.appendField(i))
      }
  }

  override def start: (AsunaTuple0, AsunaTuple0) => ModelToString = {
    (i1, i2) =>
      { i =>
        i
      }
  }
}

object reverseI extends Context2[in.II] {

  override def append[X1, X2, Y1, Y2, Z1, Z2](x: (X1, X2) => ModelToString, y: (Y1, Y2) => ModelToString)(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): (Z1, Z2) => ModelToString = {
    (i1, i2) =>
      val t1 = x(p.takeHead1(i1), p.takeHead2(i2))
      val t2 = y(p.takeTail1(i1), p.takeTail2(i2))
      new ModelToString {
        override def appendField(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = t1.appendField(t2.appendField(i))
      }
  }

  override def start: (AsunaTuple0, AsunaTuple0) => ModelToString = {
    (i1, i2) =>
      { i =>
        i
      }
  }
}

object in {

  type II[I1,I2] = (I1, I2) => ModelToString

  def encoder[I1, I2 <: TupleTag, X, Y](
    implicit ii: AsunaGeneric.Aux[I1, I2],
    pp: Application2[II, I2, X, Y],
    asunaGetterGeneric: AsunaGetterGeneric[I1, X],
    asunaLabelledGeneric: AsunaLabelledGeneric[I1, Y]
  ): ListEncoder[I1] = {
    new ListEncoder[I1] {
      override def encode(ii: I1): List[(PropertyItem, String)] = {
        pp.application(i)(asunaGetterGeneric.getter(ii), asunaLabelledGeneric.names).appendField(List.empty)
      }
    }
  }

  def reverseEncoder[I1, I2 <: TupleTag, X, Y](
    implicit ii: AsunaGeneric.Aux[I1, I2],
    pp: Application2[II, I2, X, Y],
    asunaGetterGeneric: AsunaGetterGeneric[I1, X],
    asunaNameGeneric: AsunaLabelledGeneric[I1, Y]
  ): ListEncoder[I1] = {
    new ListEncoder[I1] {
      override def encode(ii: I1): List[(PropertyItem, String)] = {
        pp.application(reverseI)(asunaGetterGeneric.getter(ii), asunaNameGeneric.names).appendField(List.empty)
      }
    }
  }

  def init1[I2 <: TupleTag](appendTag: AppendTag[I2]) = new ToStringApply2[I2]

  class ToStringApply2[I2 <: TupleTag] {
    def init2[I3, I4](implicit app1: Application2[II, I2, I3, I4]): ToStringApply3[I2, I3, I4] =
      new ToStringApply3[I2, I3, I4] {
        override def app: Application2[II, I2, I3, I4] = app1
      }
  }

  trait ToStringApply3[I2 <: TupleTag, I3, I4] {
    def app: Application2[II, I2, I3, I4]

    def encode[Model](ii: Model => I3, name: I4): ListEncoder[Model] = new ListEncoder[Model] {
      override def encode(model: Model): List[(PropertyItem, String)] = {
        app.application(i)(ii(model), name).appendField(List.empty)
      }
    }
  }

  implicit val pp1: Application2[II, PropertyTag[String], String, String] =
    new Application2[II, PropertyTag[String], String, String] {
      override def application(context: Context2[II]): (String, String) => ModelToString = (t, r) => {
        new ModelToString {
          override def appendField(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (StringProperty(t), r) :: i
        }
      }
    }

  implicit val pp2: Application2[II, PropertyTag[Int], Int, String] =
    new Application2[II, PropertyTag[Int], Int, String] {
      override def application(context: Context2[II]): (Int, String) => ModelToString = (t, r) => {
        new ModelToString {
          override def appendField(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (IntProperty(t), r) :: i
        }
      }
    }

  implicit val pp3: Application2[II, PropertyTag[Long], Long, String] =
    new Application2[II, PropertyTag[Long], Long, String] {
      override def application(context: Context2[II]): (Long, String) => ModelToString = (t, r) => {
        new ModelToString {
          override def appendField(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (LongProperty(t), r) :: i
        }
      }
    }

}
