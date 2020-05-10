package asuna.testkit.circe.test2

import asuna.macros.single.{AsunaGeneric, AsunaGetterGeneric, AsunaLabelledGeneric}
import asuna.{Application3, AsunaTuple0, Context3, Plus2, Plus3, PropertyTag}

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

trait LTString[Tag, I1, I2] {
  def string(i1: I1, i2: I2): ListToString
}

object i extends Context3[LTString] {
  /*override def append[X1, X2, Y1, Y2, Z1, Z2](x: LTString[X1, X2], y: LTString[Y1, Y2])(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): LTString[Z1, Z2] = new LTString[Z1, Z2] {
    override def string(i1: Z1, i2: Z2): ListToString = {
      val t1 = x.string(p.takeHead1(i1), p.takeHead2(i2))
      val t2 = y.string(p.takeTail1(i1), p.takeTail2(i2))
      new ListToString {
        override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = t2.init(t1.init(i))
      }
    }
  }

  override def start: LTString[AsunaTuple0, AsunaTuple0] = new LTString[AsunaTuple0, AsunaTuple0] {
    override def string(i1: AsunaTuple0, i2: AsunaTuple0): ListToString = new ListToString {
      override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = i
    }
  }*/
  override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: LTString[X1, X2, X3], y: LTString[Y1, Y2, Y3])(p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]): LTString[Z1, Z2, Z3] = new LTString[Z1, Z2, Z3] {
    override def string(i1: Z2, i2: Z3): ListToString = {
      val t1 = x.string(p.takeHead2(i1), p.takeHead3(i2))
      val t2 = y.string(p.takeTail2(i1), p.takeTail3(i2))
      new ListToString {
        override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = t2.init(t1.init(i))
      }
    }
  }

  override def start: LTString[AsunaTuple0, AsunaTuple0, AsunaTuple0] = new LTString[AsunaTuple0, AsunaTuple0, AsunaTuple0] {
    override def string(i1: AsunaTuple0, i2: AsunaTuple0): ListToString = new ListToString {
      override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = i
    }
  }
}

object in {

  def encoder[I1, I2, I3, I4](
                               implicit ii: AsunaGeneric.Aux[I1, I2],
                               pp: Application3[LTString, I2, I3, I4],
                               asunaGetterGeneric: AsunaGetterGeneric[I1, I3],
                               asunaNameGeneric: AsunaLabelledGeneric[I1, I4]
                             ): ListEncoder[I1] = {
    new ListEncoder[I1] {
      override def encode(ii: I1): List[(PropertyItem, String)] = {
        pp.application(i).string(asunaGetterGeneric.getter(ii), asunaNameGeneric.names).init(List.empty)
      }
    }
  }


  class ToStringApply2[I2] {
    def init2[I3, I4](implicit app1: Application3[LTString, I2, I3, I4]): ToStringApply3[I2, I3, I4] =
      new ToStringApply3[I2, I3, I4] {
        override def app: Application3[LTString, I2, I3, I4] = app1
      }
  }

  trait ToStringApply3[I2, I3, I4] {
    def app: Application3[LTString, I2, I3, I4]

    def encode[Model](ii: Model => I3, name: I4): ListEncoder[Model] = new ListEncoder[Model] {
      override def encode(model: Model): List[(PropertyItem, String)] = {
        app.application(i).string(ii(model), name).init(List.empty)
      }
    }
  }

  implicit val pp1: Application3[LTString, PropertyTag[String], String, String] =
    new Application3[LTString, PropertyTag[String], String, String] {
      override def application(context: Context3[LTString]): LTString[PropertyTag[String], String, String] = new LTString[PropertyTag[String], String, String] {
        override def string(t: String, r: String): ListToString = new ListToString {
          override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (StringProperty(t), r) :: i
        }
      }
    }

  implicit val pp2: Application3[LTString, PropertyTag[Int], Int, String] =
    new Application3[LTString, PropertyTag[Int], Int, String] {
      override def application(context: Context3[LTString]): LTString[PropertyTag[Int], Int, String] = new LTString[PropertyTag[Int], Int, String] {
        override def string(t: Int, r: String): ListToString = new ListToString {
          override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (IntProperty(t), r) :: i
        }
      }
    }

  implicit val pp3: Application3[LTString, PropertyTag[Long], Long, String] =
    new Application3[LTString, PropertyTag[Long], Long, String] {
      override def application(context: Context3[LTString]): LTString[PropertyTag[Long], Long, String] = new LTString[PropertyTag[Long], Long, String] {
        override def string(t: Long, r: String): ListToString = new ListToString {
          override def init(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (LongProperty(t), r) :: i
        }
      }
    }

}
