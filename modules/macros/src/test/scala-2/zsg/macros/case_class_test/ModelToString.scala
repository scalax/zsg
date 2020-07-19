package zsg.macros.case_class_test

import zsg.macros.single.{ColumnName, GenericColumnName, StringName, ZsgDefaultValueGeneric, ZsgGeneric, ZsgGetterGeneric, ZsgLabelledTypeGeneric}
import zsg.{ApplicationX4, Context4, Plus4, PropertyTag, ZsgTuple0}

trait ModelToString[E] {
  def mToString(i: E): List[FieldModel]
  def defaultValues: List[DefaultValue]
}

object ModelToString {

  class ModelToStringContext extends Context4[ModelToStringContent] {
    override def append[X1, X2, X3, X4, Y1, Y2, Y3, Y4, Z1, Z2, Z3, Z4](x: ModelToStringContent[X1, X2, X3, X4], y: ModelToStringContent[Y1, Y2, Y3, Y4])(
      p: Plus4[X1, X2, X3, X4, Y1, Y2, Y3, Y4, Z1, Z2, Z3, Z4]
    ): ModelToStringContent[Z1, Z2, Z3, Z4] = {
      new ModelToStringContent[Z1, Z2, Z3, Z4] {
        override def totalSize: Int = x.totalSize + y.totalSize
        override def encode(i1: Z2, l: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) = {
          val t2 = y.encode(p.takeTail2(i1), l, plus, index)
          x.encode(p.takeHead2(i1), t2._1, plus, t2._2)
        }
        override def defaultValue(i: Z4, l: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int) = {
          val t2 = y.defaultValue(p.takeTail4(i), l, plus, index)
          x.defaultValue(p.takeHead4(i), t2._1, plus, t2._2)
        }
      }
    }

    override val start: ModelToStringContent[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0] = {
      new ModelToStringContent[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0] {
        override def totalSize: Int                                                                                             = 0
        override def encode(i1: ZsgTuple0, l: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int)          = (l, index)
        override def defaultValue(i: ZsgTuple0, l: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int) = (l, index)
      }
    }
  }

  object ModelToStringContext {
    val value: ModelToStringContext = new ModelToStringContext
  }

  class ReverseModelToStringContext extends Context4[ModelToStringContent] {
    override def append[X1, X2, X3, X4, Y1, Y2, Y3, Y4, Z1, Z2, Z3, Z4](x: ModelToStringContent[X1, X2, X3, X4], y: ModelToStringContent[Y1, Y2, Y3, Y4])(
      p: Plus4[X1, X2, X3, X4, Y1, Y2, Y3, Y4, Z1, Z2, Z3, Z4]
    ): ModelToStringContent[Z1, Z2, Z3, Z4] = {
      new ModelToStringContent[Z1, Z2, Z3, Z4] {
        override def totalSize: Int = x.totalSize + y.totalSize
        override def encode(i1: Z2, l: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) = {
          val t1 = x.encode(p.takeHead2(i1), l, plus, index)
          y.encode(p.takeTail2(i1), t1._1, plus, t1._2)
        }
        override def defaultValue(i: Z4, l: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int) = {
          val t1 = x.defaultValue(p.takeHead4(i), l, plus, index)
          y.defaultValue(p.takeTail4(i), t1._1, plus, t1._2)
        }
      }
    }

    override def start: ModelToStringContent[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0] = {
      new ModelToStringContent[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0] {
        override def totalSize: Int                                                                                             = 0
        override def encode(i1: ZsgTuple0, i2: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int)         = (i2, index)
        override def defaultValue(i: ZsgTuple0, l: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int) = (l, index)
      }
    }
  }

  object ReverseModelToStringContext {
    implicit val value: ReverseModelToStringContext = new ReverseModelToStringContext
  }

  trait ModelToStringContent[I1, M, I2, DefalutVal] {
    def totalSize: Int
    def encode(i: M, l: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int)
    def defaultValue(i: DefalutVal, l: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int)
  }

  object ModelToStringContent {
    implicit def pp1[G <: StringName](implicit
      g: GenericColumnName[G]
    ): ModelToStringContent[PropertyTag[String], String, ColumnName[G], zsg.macros.single.DefaultValue[String]] =
      new ModelToStringContent[PropertyTag[String], String, ColumnName[G], zsg.macros.single.DefaultValue[String]] {
        override def totalSize: Int = 1
        override def encode(t: String, i: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) =
          (FieldModel(value = StringProperty(t), fieldIndex = index, fieldName = g.value, typeName = "String") :: i, plus(index))
        override def defaultValue(t: zsg.macros.single.DefaultValue[String], i: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int) =
          (DefaultValue(value = t.value.map(StringProperty.apply), fieldIndex = index) :: i, plus(index))

      }

    implicit def pp2[G <: StringName](implicit g: GenericColumnName[G]): ModelToStringContent[PropertyTag[Int], Int, ColumnName[G], zsg.macros.single.DefaultValue[Int]] =
      new ModelToStringContent[PropertyTag[Int], Int, ColumnName[G], zsg.macros.single.DefaultValue[Int]] {
        override def totalSize: Int = 1
        override def encode(t: Int, i: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) =
          (FieldModel(value = IntProperty(t), fieldIndex = index, fieldName = g.value, typeName = "Int") :: i, plus(index))
        override def defaultValue(t: zsg.macros.single.DefaultValue[Int], i: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int) =
          (DefaultValue(value = t.value.map(IntProperty.apply), fieldIndex = index) :: i, plus(index))
      }

    implicit def pp3[G <: StringName](implicit
      g: GenericColumnName[G]
    ): ModelToStringContent[PropertyTag[Long], Long, ColumnName[G], zsg.macros.single.DefaultValue[Long]] =
      new ModelToStringContent[PropertyTag[Long], Long, ColumnName[G], zsg.macros.single.DefaultValue[Long]] {
        override def totalSize: Int = 1
        override def encode(t: Long, i: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) =
          (FieldModel(value = LongProperty(t), fieldIndex = index, fieldName = g.value, typeName = "Long") :: i, plus(index))
        override def defaultValue(t: zsg.macros.single.DefaultValue[Long], i: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int) =
          (DefaultValue(value = t.value.map(LongProperty.apply), fieldIndex = index) :: i, plus(index))
      }
  }

  class EncoderContent[I1]

  def encoder[I1, I2, X, Y, DefalutVal](implicit
    g: ZsgGeneric.Aux[I1, I2],
    l: ZsgLabelledTypeGeneric.Aux[I1, Y],
    pp: ApplicationX4[ModelToStringContent, ModelToStringContext, I2, X, Y, DefalutVal],
    defVal: ZsgDefaultValueGeneric[I1, DefalutVal],
    zsgGetterGeneric: ZsgGetterGeneric[I1, X]
  ): ModelToString[I1] = {
    val application = pp.application(ModelToStringContext.value)
    new ModelToString[I1] {
      override def mToString(data: I1): List[FieldModel] = application.encode(zsgGetterGeneric.getter(data), List.empty, _ - 1, application.totalSize)._1
      override def defaultValues: List[DefaultValue]     = application.defaultValue(defVal.defaultValues, List.empty, _ - 1, application.totalSize)._1
    }
  }

  trait Init2[I1, I2, L] {
    val g: ZsgGeneric.Aux[I1, I2]
    val l: ZsgLabelledTypeGeneric.Aux[I1, L]

    def init2[X, DefaultVal](implicit n: ApplicationX4[ModelToStringContent, ModelToStringContext, I2, X, L, DefaultVal]): Init3[I1, I2, X, L, DefaultVal] =
      new Init3(n.application(ModelToStringContext.value))
  }

  class Init3[I1, I2, X, L, DefaultVal](n: ModelToStringContent[I2, X, L, DefaultVal]) {
    def init3(zsgGetterGeneric: ZsgGetterGeneric[I1, X])(implicit defaultVal: ZsgDefaultValueGeneric[I1, DefaultVal]): ModelToString[I1] =
      new ModelToString[I1] {
        override def mToString(ii: I1): List[FieldModel] = n.encode(zsgGetterGeneric.getter(ii), List.empty, _ - 1, n.totalSize)._1
        override def defaultValues: List[DefaultValue]   = n.defaultValue(defaultVal.defaultValues, List.empty, _ - 1, n.totalSize)._1
      }
  }

  def init1[I1, I2, L](implicit ii: ZsgGeneric.Aux[I1, I2], labelled: ZsgLabelledTypeGeneric.Aux[I1, L]): Init2[I1, I2, L] =
    new Init2[I1, I2, L] {
      val g: ZsgGeneric.Aux[I1, I2]            = ii
      val l: ZsgLabelledTypeGeneric.Aux[I1, L] = labelled
    }

  def forType[T]: TypeContent[T] = new TypeContent[T]

  class TypeContent[T] {
    def value[R](i: R): ZsgGeneric.Aux[T, R] =
      new ZsgGeneric[T] {
        override type WT = R
        override def tag: WT = i
      }
  }

  def reverseEncoder[I1, I2, X, Y, DefaultVal](implicit
    ii: ZsgGeneric.Aux[I1, I2],
    l: ZsgLabelledTypeGeneric.Aux[I1, Y],
    pp: ApplicationX4[ModelToStringContent, ReverseModelToStringContext, I2, X, Y, DefaultVal],
    zsgDefaultValueGeneric: ZsgDefaultValueGeneric[I1, DefaultVal],
    zsgGetterGeneric: ZsgGetterGeneric[I1, X]
  ): ModelToString[I1] = {
    val app = pp.application(ReverseModelToStringContext.value)
    new ModelToString[I1] {
      override def mToString(ii: I1): List[FieldModel] = app.encode(zsgGetterGeneric.getter(ii), List.empty, _ + 1, 1)._1
      override def defaultValues: List[DefaultValue]   = app.defaultValue(zsgDefaultValueGeneric.defaultValues, List.empty, _ + 1, 1)._1
    }
  }

}
