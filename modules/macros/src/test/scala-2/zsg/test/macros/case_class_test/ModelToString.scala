package zsg.macros.case_class_test

import zsg.macros.single
import zsg.macros.single.{ColumnName, ZsgDefaultValue, ZsgGeneric, ZsgGetterGeneric, ZsgLabelledGeneric, ZsgLabelledTypeGeneric}
import zsg.macros.utils.GenericColumnName
import zsg.{ItemTag2, PropertyTag, ZsgTuple2}

trait ModelToString[E] {
  def mToString(i: E): List[FieldModel]
  def defaultValues: List[DefaultValue]
  def labelledNames: List[String]
}

object ModelToString {

  object ModelToStringContext {

    implicit def impl[X1, X2, X3, X4, X5, Y1, Y2, Y3, Y4, Y5](implicit
      x: ModelToStringContent.Aux[X1, X2, X3, X4, X5, ModelToStringContext.type],
      y: ModelToStringContent.Aux[Y1, Y2, Y3, Y4, Y5, ModelToStringContext.type]
    ): ModelToStringContent.Aux[ItemTag2[X1, Y1], ZsgTuple2[X2, Y2], ZsgTuple2[X3, Y3], ZsgTuple2[X4, Y4], ItemTag2[
      X5,
      Y5
    ], ModelToStringContext.type] = new ModelToStringContent[ItemTag2[X1, Y1], ItemTag2[X5, Y5], ModelToStringContext.type] {
      type M            = ZsgTuple2[X2, Y2]
      type DefalutVal   = ZsgTuple2[X3, Y3]
      type LabelledName = ZsgTuple2[X4, Y4]

      override def totalSize: Int = x.totalSize + y.totalSize

      override def encode(i: ZsgTuple2[X2, Y2], l: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) = {
        val t2 = y.encode(i.i2, l, plus, index)
        x.encode(i.i1, t2._1, plus, t2._2)
      }

      override def defaultValue(i: ZsgTuple2[X3, Y3], l: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int) = {
        val t2 = y.defaultValue(i.i2, l, plus, index)
        x.defaultValue(i.i1, t2._1, plus, t2._2)
      }

      override def appendLabelledName(m: ZsgTuple2[X4, Y4], names: List[String]): List[String] =
        x.appendLabelledName(m.i1, y.appendLabelledName(m.i2, names))
    }
  }

  object ReverseModelToStringContext {
    implicit def impl[X1, X2, X3, X4, X5, Y1, Y2, Y3, Y4, Y5](implicit
      x: ModelToStringContent.Aux[X1, X2, X3, X4, X5, ReverseModelToStringContext.type],
      y: ModelToStringContent.Aux[Y1, Y2, Y3, Y4, Y5, ReverseModelToStringContext.type]
    ): ModelToStringContent.Aux[ItemTag2[X1, Y1], ZsgTuple2[X2, Y2], ZsgTuple2[X3, Y3], ZsgTuple2[X4, Y4], ItemTag2[
      X5,
      Y5
    ], ReverseModelToStringContext.type] = new ModelToStringContent[ItemTag2[X1, Y1], ItemTag2[X5, Y5], ReverseModelToStringContext.type] {
      type M            = ZsgTuple2[X2, Y2]
      type DefalutVal   = ZsgTuple2[X3, Y3]
      type LabelledName = ZsgTuple2[X4, Y4]
      override def totalSize: Int = x.totalSize + y.totalSize

      override def encode(i: ZsgTuple2[X2, Y2], l: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) = {
        val t1 = x.encode(i.i1, l, plus, index)
        y.encode(i.i2, t1._1, plus, t1._2)
      }

      override def defaultValue(i: ZsgTuple2[X3, Y3], l: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int) = {
        val t1 = x.defaultValue(i.i1, l, plus, index)
        y.defaultValue(i.i2, t1._1, plus, t1._2)
      }

      override def appendLabelledName(m: ZsgTuple2[X4, Y4], names: List[String]): List[String] =
        y.appendLabelledName(m.i2, x.appendLabelledName(m.i1, names))
    }
  }

  trait ModelToStringContent[ProTag, NamedType, Ploy] {
    type M
    type DefalutVal
    type LabelledName

    def totalSize: Int
    def encode(i: M, l: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int)
    def defaultValue(i: DefalutVal, l: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int)
    def appendLabelledName(m: LabelledName, names: List[String]): List[String]
  }

  object ModelToStringContent {
    type Aux[ProTag, M1, DefalutVal1, LabelledName1, NamedType1, Ploy] = ModelToStringContent[ProTag, NamedType1, Ploy] {
      type M = M1; type DefalutVal = DefalutVal1; type LabelledName = LabelledName1
    }
    implicit def pp1[G <: String, Ploy](implicit
      g: GenericColumnName[G]
    ): ModelToStringContent.Aux[PropertyTag[String], String, zsg.macros.single.DefaultValue[String], String, ColumnName[G], Ploy] =
      new ModelToStringContent[PropertyTag[String], ColumnName[G], Ploy] {
        override type M            = String
        override type DefalutVal   = zsg.macros.single.DefaultValue[String]
        override type LabelledName = String
        override def totalSize: Int = 1
        override def encode(t: String, i: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) =
          (FieldModel(value = StringProperty(t), fieldIndex = index, fieldName = g.value, typeName = "String") :: i, plus(index))
        override def defaultValue(
          t: zsg.macros.single.DefaultValue[String],
          i: List[DefaultValue],
          plus: Int => Int,
          index: Int
        ): (List[DefaultValue], Int) =
          (DefaultValue(value = t.value.map(StringProperty.apply), fieldIndex = index) :: i, plus(index))
        override def appendLabelledName(m: String, names: List[String]): List[String] = m :: names
      }

    implicit def pp2[G <: String, Ploy](implicit
      g: GenericColumnName[G]
    ): ModelToStringContent.Aux[PropertyTag[Int], Int, zsg.macros.single.DefaultValue[Int], String, ColumnName[G], Ploy] =
      new ModelToStringContent[PropertyTag[Int], ColumnName[G], Ploy] {
        override type M            = Int
        override type DefalutVal   = zsg.macros.single.DefaultValue[Int]
        override type LabelledName = String
        override def totalSize: Int = 1
        override def encode(t: Int, i: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) =
          (FieldModel(value = IntProperty(t), fieldIndex = index, fieldName = g.value, typeName = "Int") :: i, plus(index))
        override def defaultValue(
          t: zsg.macros.single.DefaultValue[Int],
          i: List[DefaultValue],
          plus: Int => Int,
          index: Int
        ): (List[DefaultValue], Int) =
          (DefaultValue(value = t.value.map(IntProperty.apply), fieldIndex = index) :: i, plus(index))
        override def appendLabelledName(m: String, names: List[String]): List[String] = m :: names
      }

    implicit def pp3[G <: String, Ploy](implicit
      g: GenericColumnName[G]
    ): ModelToStringContent.Aux[PropertyTag[Long], Long, single.DefaultValue[Long], String, ColumnName[G], Ploy] =
      new ModelToStringContent[PropertyTag[Long], ColumnName[G], Ploy] {
        override type M            = Long
        override type DefalutVal   = zsg.macros.single.DefaultValue[Long]
        override type LabelledName = String
        override def totalSize: Int = 1
        override def encode(t: Long, i: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int) =
          (FieldModel(value = LongProperty(t), fieldIndex = index, fieldName = g.value, typeName = "Long") :: i, plus(index))
        override def defaultValue(
          t: zsg.macros.single.DefaultValue[Long],
          i: List[DefaultValue],
          plus: Int => Int,
          index: Int
        ): (List[DefaultValue], Int) =
          (DefaultValue(value = t.value.map(LongProperty.apply), fieldIndex = index) :: i, plus(index))
        override def appendLabelledName(m: String, names: List[String]): List[String] = m :: names
      }
  }

  def encoder[I1, I2, I3, I4, I5, I6](implicit
    g: ZsgGeneric.Aux[I1, I2],
    l: ZsgLabelledTypeGeneric.Aux[I1, I6],
    content: ModelToStringContent.Aux[I2, I4, I3, I5, I6, ModelToStringContext.type],
    zsgLabelledGeneric: ZsgLabelledGeneric[I1, I5],
    defVal: ZsgDefaultValue#ModelType[I1]#GenericType[I3],
    zsgGetterGeneric: ZsgGetterGeneric[I1, I4]
  ): ModelToString[I1] = new ModelToString[I1] {
    override def mToString(data: I1): List[FieldModel] =
      content.encode(zsgGetterGeneric.getter(data), List.empty, _ - 1, content.totalSize)._1
    override def defaultValues: List[DefaultValue] =
      content.defaultValue(defVal.defaultValues, List.empty, _ - 1, content.totalSize)._1
    override def labelledNames: List[String] = content.appendLabelledName(zsgLabelledGeneric.names, List.empty)
  }

  trait Init2[I1, I2, L] {
    val g: ZsgGeneric.Aux[I1, I2]
    val l: ZsgLabelledTypeGeneric.Aux[I1, L]

    def init2[I3, I4, I5](implicit
      n: ModelToStringContent.Aux[I2, I4, I3, I5, L, ModelToStringContext.type]
    ): Init3[I1, I2, I3, I5, I4, L] = new Init3(n)
  }

  class Init3[I1, I2, I3, I5, I4, L](n: ModelToStringContent.Aux[I2, I4, I3, I5, L, ModelToStringContext.type]) {
    def init3(
      zsgGetterGeneric: ZsgGetterGeneric[I1, I4]
    )(implicit
      defaultVal: ZsgDefaultValue#ModelType[I1]#GenericType[I3],
      labelledValue: ZsgLabelledGeneric[I1, I5]
    ): ModelToString[I1] =
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

  def reverseEncoder[I1, I2, I3, I4, I5, I6](implicit
    g: ZsgGeneric.Aux[I1, I2],
    l: ZsgLabelledTypeGeneric.Aux[I1, I6],
    content: ModelToStringContent.Aux[I2, I4, I3, I5, I6, ReverseModelToStringContext.type],
    zsgLabelledGeneric: ZsgLabelledGeneric[I1, I5],
    defVal: ZsgDefaultValue#ModelType[I1]#GenericType[I3],
    zsgGetterGeneric: ZsgGetterGeneric[I1, I4]
  ): ModelToString[I1] = new ModelToString[I1] {
    override def mToString(ii: I1): List[FieldModel] = content.encode(zsgGetterGeneric.getter(ii), List.empty, _ + 1, 1)._1
    override def defaultValues: List[DefaultValue]   = content.defaultValue(defVal.defaultValues, List.empty, _ + 1, 1)._1
    override def labelledNames: List[String]         = content.appendLabelledName(zsgLabelledGeneric.names, List.empty)
  }

}
