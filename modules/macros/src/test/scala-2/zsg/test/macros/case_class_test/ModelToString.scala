package zsg.macros.case_class_test

import zsg.macros.single.{ColumnName, GenericColumnName, ZsgDefaultValueGeneric, ZsgGeneric, ZsgGetterGeneric, ZsgLabelledGeneric, ZsgLabelledTypeGeneric}
import zsg.{ApplicationX5, Context5, Plus5, PropertyTag}

trait ModelToString[E] {
  def mToString(i: E): List[FieldModel]
  def defaultValues: List[DefaultValue]
  def labelledNames: List[String]
}

object ModelToString {

  class ModelToStringContext extends Context5[ModelToStringContent] {
    override def append[X1, X2, X3, X4, X5, Y1, Y2, Y3, Y4, Y5, Z1, Z2, Z3, Z4, Z5](
      x: ModelToStringContent[X1, X2, X3, X4, X5],
      y: ModelToStringContent[Y1, Y2, Y3, Y4, Y5]
    )(p: Plus5[X1, X2, X3, X4, X5, Y1, Y2, Y3, Y4, Y5, Z1, Z2, Z3, Z4, Z5]): ModelToStringContent[Z1, Z2, Z3, Z4, Z5] = {
      new ModelToStringContent[Z1, Z2, Z3, Z4, Z5] {
        override def totalSize: Int = x.totalSize + y.totalSize
        override def encode(i1: Z2, l: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) = {
          val t2 = y.encode(p.takeTail2(i1), l, plus, index)
          x.encode(p.takeHead2(i1), t2._1, plus, t2._2)
        }
        override def defaultValue(i: Z4, l: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int) = {
          val t2 = y.defaultValue(p.takeTail4(i), l, plus, index)
          x.defaultValue(p.takeHead4(i), t2._1, plus, t2._2)
        }
        override def appendLabelledName(m: Z5, names: List[String]): List[String] = x.appendLabelledName(p.takeHead5(m), y.appendLabelledName(p.takeTail5(m), names))
      }
    }
  }

  object ModelToStringContext {
    val value: ModelToStringContext = new ModelToStringContext
  }

  class ReverseModelToStringContext extends Context5[ModelToStringContent] {
    override def append[X1, X2, X3, X4, X5, Y1, Y2, Y3, Y4, Y5, Z1, Z2, Z3, Z4, Z5](
      x: ModelToStringContent[X1, X2, X3, X4, X5],
      y: ModelToStringContent[Y1, Y2, Y3, Y4, Y5]
    )(p: Plus5[X1, X2, X3, X4, X5, Y1, Y2, Y3, Y4, Y5, Z1, Z2, Z3, Z4, Z5]): ModelToStringContent[Z1, Z2, Z3, Z4, Z5] = {
      new ModelToStringContent[Z1, Z2, Z3, Z4, Z5] {
        override def totalSize: Int = x.totalSize + y.totalSize
        override def encode(i1: Z2, l: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) = {
          val t1 = x.encode(p.takeHead2(i1), l, plus, index)
          y.encode(p.takeTail2(i1), t1._1, plus, t1._2)
        }
        override def defaultValue(i: Z4, l: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int) = {
          val t1 = x.defaultValue(p.takeHead4(i), l, plus, index)
          y.defaultValue(p.takeTail4(i), t1._1, plus, t1._2)
        }
        override def appendLabelledName(m: Z5, names: List[String]): List[String] = y.appendLabelledName(p.takeTail5(m), x.appendLabelledName(p.takeHead5(m), names))
      }
    }
  }

  object ReverseModelToStringContext {
    implicit val value: ReverseModelToStringContext = new ReverseModelToStringContext
  }

  trait ModelToStringContent[I1, M, I2, DefalutVal, LabelledName] {
    def totalSize: Int
    def encode(i: M, l: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int)
    def defaultValue(i: DefalutVal, l: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int)
    def appendLabelledName(m: LabelledName, names: List[String]): List[String]
  }

  object ModelToStringContent {
    implicit def pp1[G](implicit
      g: GenericColumnName[G]
    ): ModelToStringContent[PropertyTag[String], String, ColumnName[G], zsg.macros.single.DefaultValue[String], String] =
      new ModelToStringContent[PropertyTag[String], String, ColumnName[G], zsg.macros.single.DefaultValue[String], String] {
        override def totalSize: Int = 1
        override def encode(t: String, i: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) =
          (FieldModel(value = StringProperty(t), fieldIndex = index, fieldName = g.value, typeName = "String") :: i, plus(index))
        override def defaultValue(t: zsg.macros.single.DefaultValue[String], i: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int) =
          (DefaultValue(value = t.value.map(StringProperty.apply), fieldIndex = index) :: i, plus(index))
        override def appendLabelledName(m: String, names: List[String]): List[String] = m :: names
      }

    implicit def pp2[G](implicit
      g: GenericColumnName[G]
    ): ModelToStringContent[PropertyTag[Int], Int, ColumnName[G], zsg.macros.single.DefaultValue[Int], String] =
      new ModelToStringContent[PropertyTag[Int], Int, ColumnName[G], zsg.macros.single.DefaultValue[Int], String] {
        override def totalSize: Int = 1
        override def encode(t: Int, i: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) =
          (FieldModel(value = IntProperty(t), fieldIndex = index, fieldName = g.value, typeName = "Int") :: i, plus(index))
        override def defaultValue(t: zsg.macros.single.DefaultValue[Int], i: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int) =
          (DefaultValue(value = t.value.map(IntProperty.apply), fieldIndex = index) :: i, plus(index))
        override def appendLabelledName(m: String, names: List[String]): List[String] = m :: names
      }

    implicit def pp3[G](implicit
      g: GenericColumnName[G]
    ): ModelToStringContent[PropertyTag[Long], Long, ColumnName[G], zsg.macros.single.DefaultValue[Long], String] =
      new ModelToStringContent[PropertyTag[Long], Long, ColumnName[G], zsg.macros.single.DefaultValue[Long], String] {
        override def totalSize: Int = 1
        override def encode(t: Long, i: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) =
          (FieldModel(value = LongProperty(t), fieldIndex = index, fieldName = g.value, typeName = "Long") :: i, plus(index))
        override def defaultValue(t: zsg.macros.single.DefaultValue[Long], i: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int) =
          (DefaultValue(value = t.value.map(LongProperty.apply), fieldIndex = index) :: i, plus(index))
        override def appendLabelledName(m: String, names: List[String]): List[String] = m :: names
      }
  }

  class EncoderContent[I1]

  def encoder[I1, I2, X, Y, DefalutVal, LabelledVal](implicit
    g: ZsgGeneric.Aux[I1, I2],
    l: ZsgLabelledTypeGeneric.Aux[I1, Y],
    pp: ApplicationX5[ModelToStringContent, ModelToStringContext, I2, X, Y, DefalutVal, LabelledVal],
    zsgLabelledGeneric: ZsgLabelledGeneric[I1, LabelledVal],
    defVal: ZsgDefaultValueGeneric[I1, DefalutVal],
    zsgGetterGeneric: ZsgGetterGeneric[I1, X]
  ): ModelToString[I1] = {
    val application = pp.application(ModelToStringContext.value)
    new ModelToString[I1] {
      override def mToString(data: I1): List[FieldModel] = application.encode(zsgGetterGeneric.getter(data), List.empty, _ - 1, application.totalSize)._1
      override def defaultValues: List[DefaultValue]     = application.defaultValue(defVal.defaultValues, List.empty, _ - 1, application.totalSize)._1
      override def labelledNames: List[String]           = application.appendLabelledName(zsgLabelledGeneric.names, List.empty)
    }
  }

  trait Init2[I1, I2, L] {
    val g: ZsgGeneric.Aux[I1, I2]
    val l: ZsgLabelledTypeGeneric.Aux[I1, L]

    def init2[X, DefaultVal, LabelledVal](implicit
      n: ApplicationX5[ModelToStringContent, ModelToStringContext, I2, X, L, DefaultVal, LabelledVal]
    ): Init3[I1, I2, X, L, DefaultVal, LabelledVal] =
      new Init3(n.application(ModelToStringContext.value))
  }

  class Init3[I1, I2, X, L, DefaultVal, LabelledVal](n: ModelToStringContent[I2, X, L, DefaultVal, LabelledVal]) {
    def init3(
      zsgGetterGeneric: ZsgGetterGeneric[I1, X]
    )(implicit defaultVal: ZsgDefaultValueGeneric[I1, DefaultVal], labelledValue: ZsgLabelledGeneric[I1, LabelledVal]): ModelToString[I1] =
      new ModelToString[I1] {
        override def mToString(ii: I1): List[FieldModel] = n.encode(zsgGetterGeneric.getter(ii), List.empty, _ - 1, n.totalSize)._1
        override def defaultValues: List[DefaultValue]   = n.defaultValue(defaultVal.defaultValues, List.empty, _ - 1, n.totalSize)._1
        override def labelledNames: List[String]         = n.appendLabelledName(labelledValue.names, List.empty)
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

  def reverseEncoder[I1, I2, X, Y, DefaultVal, LabelledVal](implicit
    ii: ZsgGeneric.Aux[I1, I2],
    l: ZsgLabelledTypeGeneric.Aux[I1, Y],
    pp: ApplicationX5[ModelToStringContent, ReverseModelToStringContext, I2, X, Y, DefaultVal, LabelledVal],
    zsgLabelledGeneric: ZsgLabelledGeneric[I1, LabelledVal],
    zsgDefaultValueGeneric: ZsgDefaultValueGeneric[I1, DefaultVal],
    zsgGetterGeneric: ZsgGetterGeneric[I1, X]
  ): ModelToString[I1] = {
    val app = pp.application(ReverseModelToStringContext.value)
    new ModelToString[I1] {
      override def mToString(ii: I1): List[FieldModel] = app.encode(zsgGetterGeneric.getter(ii), List.empty, _ + 1, 1)._1
      override def defaultValues: List[DefaultValue]   = app.defaultValue(zsgDefaultValueGeneric.defaultValues, List.empty, _ + 1, 1)._1
      override def labelledNames: List[String]         = app.appendLabelledName(zsgLabelledGeneric.names, List.empty)
    }
  }

}
