package asuna.testkit

import asuna.macros.single.{AsunaGeneric, AsunaGetterGeneric, AsunaLabelledGeneric}
import asuna.testkit.in.MTS
import asuna.{Application3, AsunaTuple0, Context3, Plus3, PropertyTag}

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

object i extends Context3[MTS] {
  override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: MTS[X1, X2, X3], y: MTS[Y1, Y2, Y3])(p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]): MTS[Z1, Z2, Z3] = new MTS[Z1, Z2, Z3] {
    override def apply(i1: Z2, i2: Z3): ModelToString = {
      val t1 = x(p.takeHead2(i1), p.takeHead3(i2))
      val t2 = y(p.takeTail2(i1), p.takeTail3(i2))
      new ModelToString {
        override def appendField(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = t2.appendField(t1.appendField(i))
      }
    }
  }

  override def start: MTS[AsunaTuple0, AsunaTuple0, AsunaTuple0] = new MTS[AsunaTuple0, AsunaTuple0, AsunaTuple0] {
    override def apply(i1: AsunaTuple0, i2: AsunaTuple0): ModelToString = new ModelToString {
      override def appendField(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = i
    }
  }
}

object reverseI extends Context3[MTS] {

  override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: MTS[X1, X2, X3], y: MTS[Y1, Y2, Y3])(p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]): MTS[Z1, Z2, Z3] = new MTS[Z1, Z2, Z3] {
    override def apply(i1: Z2, i2: Z3): ModelToString = {
      val t1 = x(p.takeHead2(i1), p.takeHead3(i2))
      val t2 = y(p.takeTail2(i1), p.takeTail3(i2))
      new ModelToString {
        override def appendField(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = t1.appendField(t2.appendField(i))
      }
    }
  }

  override def start: MTS[AsunaTuple0, AsunaTuple0, AsunaTuple0] = new MTS[AsunaTuple0, AsunaTuple0, AsunaTuple0] {
    override def apply(i1: AsunaTuple0, i2: AsunaTuple0): ModelToString = new ModelToString {
      override def appendField(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = i
    }
  }

}

object in {

  trait MTS[M, I1, I2] {
    def apply(i1: I1, i2: I2): ModelToString
  }

  def encoder[I1, I2, X, Y](
                             implicit ii: AsunaGeneric.Aux[I1, I2],
                             pp: Application3[MTS, I2, X, Y],
                             asunaGetterGeneric: AsunaGetterGeneric[I1, X],
                             asunaLabelledGeneric: AsunaLabelledGeneric[I1, Y]
                           ): ListEncoder[I1] = {
    new ListEncoder[I1] {
      override def encode(ii: I1): List[(PropertyItem, String)] = {
        pp.application(i)(asunaGetterGeneric.getter(ii), asunaLabelledGeneric.names).appendField(List.empty)
      }
    }
  }

  trait II[I1, I2] {
    val g: AsunaGeneric.Aux[I1, I2]

    def init2[X, Y](implicit n: Application3[MTS, I2, X, Y]): III[I1, I2, X, Y] = new III[I1, I2, X, Y] {
      def encode(asunaGetterGeneric: AsunaGetterGeneric[I1, X], asunaLabelledGeneric: AsunaLabelledGeneric[I1, Y]): ListEncoder[I1] = {
        new ListEncoder[I1] {
          override def encode(ii: I1): List[(PropertyItem, String)] = {
            n.application(i)(asunaGetterGeneric.getter(ii), asunaLabelledGeneric.names).appendField(List.empty)
          }
        }
      }
    }
  }

  trait III[I1, I2, X, Y] {
    def encode(asunaGetterGeneric: AsunaGetterGeneric[I1, X], asunaLabelledGeneric: AsunaLabelledGeneric[I1, Y]): ListEncoder[I1]
  }

  def init1[I1, I2](implicit ii: AsunaGeneric.Aux[I1, I2]): II[I1, I2] = {
    new II[I1, I2] {
      val g: AsunaGeneric.Aux[I1, I2] = ii
    }
  }

  def encoder1[I1, I2, X, Y](
                              ii: AsunaGeneric.Aux[I1, I2])(
                              implicit pp: Application3[MTS, I2, X, Y],
                              asunaGetterGeneric: AsunaGetterGeneric[I1, X],
                              asunaLabelledGeneric: AsunaLabelledGeneric[I1, Y]
                            ): ListEncoder[I1] = {
    new ListEncoder[I1] {
      override def encode(ii: I1): List[(PropertyItem, String)] = {
        pp.application(i)(asunaGetterGeneric.getter(ii), asunaLabelledGeneric.names).appendField(List.empty)
      }
    }
  }

  def forType[T]: TypeContent[T] = new TypeContent[T] {}

  trait TypeContent[T] {
    def value[R](i: R): AsunaGeneric.Aux[T, R] = new AsunaGeneric[T] {
      override type WT = R

      override def tag: WT = i
    }
  }

  def reverseEncoder[I1, I2, X, Y](
                                    implicit ii: AsunaGeneric.Aux[I1, I2],
                                    pp: Application3[MTS, I2, X, Y],
                                    asunaGetterGeneric: AsunaGetterGeneric[I1, X],
                                    asunaNameGeneric: AsunaLabelledGeneric[I1, Y]
                                  ): ListEncoder[I1] = {
    new ListEncoder[I1] {
      override def encode(ii: I1): List[(PropertyItem, String)] = {
        pp.application(reverseI)(asunaGetterGeneric.getter(ii), asunaNameGeneric.names).appendField(List.empty)
      }
    }
  }


  class ToStringApply2[I2] {
    def init2[I3, I4](implicit app1: Application3[MTS, I2, I3, I4]): ToStringApply3[I2, I3, I4] = new ToStringApply3[I2, I3, I4] {
      override def app: Application3[MTS, I2, I3, I4] = app1
    }
  }

  trait ToStringApply3[I2, I3, I4] {
    def app: Application3[MTS, I2, I3, I4]

    def encode[Model](ii: Model => I3, name: I4): ListEncoder[Model] = new ListEncoder[Model] {
      override def encode(model: Model): List[(PropertyItem, String)] = {
        app.application(i)(ii(model), name).appendField(List.empty)
      }
    }
  }

  implicit val pp1: Application3[MTS, PropertyTag[String], String, String] =
    new Application3[MTS, PropertyTag[String], String, String] {
      override def application(context: Context3[MTS]): MTS[PropertyTag[String], String, String] = new MTS[PropertyTag[String], String, String] {
        override def apply(t: String, r: String): ModelToString = new ModelToString {
          override def appendField(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (StringProperty(t), r) :: i
        }
      }
    }

  implicit val pp2: Application3[MTS, PropertyTag[Int], Int, String] =
    new Application3[MTS, PropertyTag[Int], Int, String] {
      override def application(context: Context3[MTS]): MTS[PropertyTag[Int], Int, String] = new MTS[PropertyTag[Int], Int, String] {
        override def apply(t: Int, r: String): ModelToString = {
          new ModelToString {
            override def appendField(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (IntProperty(t), r) :: i
          }
        }
      }
    }

  implicit val pp3: Application3[MTS, PropertyTag[Long], Long, String] =
    new Application3[MTS, PropertyTag[Long], Long, String] {
      override def application(context: Context3[MTS]): MTS[PropertyTag[Long], Long, String] = new MTS[PropertyTag[Long], Long, String] {
        override def apply(t: Long, r: String): ModelToString = {
          new ModelToString {
            override def appendField(i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (LongProperty(t), r) :: i
          }
        }
      }
    }

}
