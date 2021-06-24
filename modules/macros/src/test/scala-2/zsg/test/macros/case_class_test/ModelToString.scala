package zsg.macros.case_class_test

import zsg.macros.single
import zsg.macros.single.{
  ColumnName,
  GenericColumnName,
  ZsgDefaultValue,
  ZsgGeneric,
  ZsgGetterGeneric,
  ZsgLabelledGeneric,
  ZsgLabelledTypeGeneric
}
import zsg.{Application, Context, Plus, PropertyTag, TagMerge2, TypeFunction, TypeHList, TypeHList3, TypeHList4}

trait ModelToString[E] {
  def mToString(i: E): List[FieldModel]
  def defaultValues: List[DefaultValue]
  def labelledNames: List[String]
}

object ModelToString {

  class MTSType extends TypeFunction {
    override type H[T <: TypeHList] =
      ModelToStringContent[T#Head, T#Tail#Head, T#Tail#Tail#Head, T#Tail#Tail#Tail#Head]
  }

  class ModelToStringContext extends Context[MTSType] {
    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: MTSType#H[X], y: MTSType#H[Y])(
      plus: Plus[X, Y, Z]
    ): MTSType#H[Z] = {
      new ModelToStringContent[Z#Head, Z#Tail#Head, Z#Tail#Tail#Head, Z#Tail#Tail#Tail#Head] {
        override def totalSize: Int = x.totalSize + y.totalSize
        override def encode(i: Z#Head, l: List[FieldModel], plus1: Int => Int, index: Int): (List[FieldModel], Int) = {
          val t2 = y.encode(plus.takeTail(i), l, plus1, index)
          x.encode(plus.takeHead(i), t2._1, plus1, t2._2)
        }
        override def defaultValue(i: Z#Tail#Head, l: List[DefaultValue], plus1: Int => Int, index: Int): (List[DefaultValue], Int) = {
          val t2 = y.defaultValue(plus.tail.takeTail(i), l, plus1, index)
          x.defaultValue(plus.tail.takeHead(i), t2._1, plus1, t2._2)
        }
        override def appendLabelledName(m: Z#Tail#Tail#Head, names: List[String]): List[String] =
          x.appendLabelledName(plus.tail.tail.takeHead(m), y.appendLabelledName(plus.tail.tail.takeTail(m), names))
      }
    }
  }

  object ModelToStringContext {
    val value: ModelToStringContext = new ModelToStringContext

    implicit def pp1[T1, T2](implicit
      g: ModelToStringContent[T1, zsg.macros.single.DefaultValue[T1], String, T2]
    ): Application[MTSType, ModelToStringContext, TagMerge2[PropertyTag[T1], T2], TypeHList4[T1, zsg.macros.single.DefaultValue[
      T1
    ], String, T2]] = new Application[
      MTSType,
      ModelToStringContext,
      TagMerge2[PropertyTag[T1], T2],
      TypeHList4[T1, zsg.macros.single.DefaultValue[T1], String, T2]
    ] {
      override def application(
        context: ModelToStringContext
      ): ModelToStringContent[T1, zsg.macros.single.DefaultValue[T1], String, T2] = g
    }
  }

  class ReverseModelToStringContext extends Context[MTSType] {
    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: MTSType#H[X], y: MTSType#H[Y])(
      plus: Plus[X, Y, Z]
    ): MTSType#H[Z] = {
      new ModelToStringContent[Z#Head, Z#Tail#Head, Z#Tail#Tail#Head, Z#Tail#Tail#Tail#Head] {
        override def totalSize: Int = x.totalSize + y.totalSize
        override def encode(i: Z#Head, l: List[FieldModel], plus1: Int => Int, index: Int): (List[FieldModel], Int) = {
          val t1 = x.encode(plus.takeHead(i), l, plus1, index)
          y.encode(plus.takeTail(i), t1._1, plus1, t1._2)
        }
        override def defaultValue(i: Z#Tail#Head, l: List[DefaultValue], plus1: Int => Int, index: Int): (List[DefaultValue], Int) = {
          val t1 = x.defaultValue(plus.tail.takeHead(i), l, plus1, index)
          y.defaultValue(plus.tail.takeTail(i), t1._1, plus1, t1._2)
        }
        override def appendLabelledName(m: Z#Tail#Tail#Head, names: List[String]): List[String] =
          y.appendLabelledName(plus.tail.tail.takeTail(m), x.appendLabelledName(plus.tail.tail.takeHead(m), names))
      }
    }
  }

  object ReverseModelToStringContext {
    implicit val value: ReverseModelToStringContext = new ReverseModelToStringContext
    implicit def pp1[T1, T2](implicit
      g: ModelToStringContent[T1, zsg.macros.single.DefaultValue[T1], String, T2]
    ): Application[MTSType, ReverseModelToStringContext, TagMerge2[PropertyTag[T1], T2], TypeHList4[T1, zsg.macros.single.DefaultValue[
      T1
    ], String, T2]] = new Application[
      MTSType,
      ReverseModelToStringContext,
      TagMerge2[PropertyTag[T1], T2],
      TypeHList4[T1, zsg.macros.single.DefaultValue[T1], String, T2]
    ] {
      override def application(
        context: ReverseModelToStringContext
      ): ModelToStringContent[T1, zsg.macros.single.DefaultValue[T1], String, T2] = g
    }
  }

  trait ModelToStringContent[M, DefalutVal, LabelledName, NamedType] {
    def totalSize: Int
    def encode(i: M, l: List[FieldModel], plus: Int => Int, index: Int): (List[FieldModel], Int)
    def defaultValue(i: DefalutVal, l: List[DefaultValue], plus: Int => Int, index: Int): (List[DefaultValue], Int)
    def appendLabelledName(m: LabelledName, names: List[String]): List[String]
  }

  object ModelToStringContent {
    implicit def pp1[G](implicit
      g: GenericColumnName[G]
    ): ModelToStringContent[String, zsg.macros.single.DefaultValue[String], String, ColumnName[G]] =
      new ModelToStringContent[String, zsg.macros.single.DefaultValue[String], String, ColumnName[G]] {
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

    implicit def pp2[G](implicit
      g: GenericColumnName[G]
    ): ModelToStringContent[Int, zsg.macros.single.DefaultValue[Int], String, ColumnName[G]] =
      new ModelToStringContent[Int, zsg.macros.single.DefaultValue[Int], String, ColumnName[G]] {
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

    implicit def pp3[G](implicit
      g: GenericColumnName[G]
    ): ModelToStringContent[Long, single.DefaultValue[Long], String, ColumnName[G]] =
      new ModelToStringContent[Long, single.DefaultValue[Long], String, ColumnName[G]] {
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

  // class EncoderContent[I1]

  def encoder[I1, I2, I3, Merge2, I4 <: TypeHList](implicit
    g: ZsgGeneric.Aux[I1, I2],
    l: ZsgLabelledTypeGeneric.Aux[I1, I3],
    merge2: TagMerge2.Aux[I2, I3, Merge2],
    pp: Application[MTSType, ModelToStringContext, Merge2, I4],
    zsgLabelledGeneric: ZsgLabelledGeneric[I1, I4#Tail#Tail#Head],
    defVal: ZsgDefaultValue#ModelType[I1]#GenericType[I4#Tail#Head],
    zsgGetterGeneric: ZsgGetterGeneric[I1, I4#Head]
  ): ModelToString[I1] = {
    val application = pp.application(ModelToStringContext.value)
    new ModelToString[I1] {
      override def mToString(data: I1): List[FieldModel] =
        application.encode(zsgGetterGeneric.getter(data), List.empty, _ - 1, application.totalSize)._1
      override def defaultValues: List[DefaultValue] =
        application.defaultValue(defVal.defaultValues, List.empty, _ - 1, application.totalSize)._1
      override def labelledNames: List[String] = application.appendLabelledName(zsgLabelledGeneric.names, List.empty)
    }
  }

  trait Init2[I1, I2, L] {
    val g: ZsgGeneric.Aux[I1, I2]
    val l: ZsgLabelledTypeGeneric.Aux[I1, L]

    def init2[Merge2, I4 <: TypeHList](implicit
      merge2: TagMerge2.Aux[I2, L, Merge2],
      n: Application[MTSType, ModelToStringContext, Merge2, I4]
    ): Init3[I1, I4] = new Init3(n.application(ModelToStringContext.value))
  }

  class Init3[I1, I4 <: TypeHList](n: ModelToStringContent[I4#Head, I4#Tail#Head, I4#Tail#Tail#Head, I4#Tail#Tail#Tail#Head]) {
    def init3(
      zsgGetterGeneric: ZsgGetterGeneric[I1, I4#Head]
    )(implicit
      defaultVal: ZsgDefaultValue#ModelType[I1]#GenericType[I4#Tail#Head],
      labelledValue: ZsgLabelledGeneric[I1, I4#Tail#Tail#Head]
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

  def reverseEncoder[I1, I2, Y, Merge2, I4 <: TypeHList](implicit
    ii: ZsgGeneric.Aux[I1, I2],
    l: ZsgLabelledTypeGeneric.Aux[I1, Y],
    merge2: TagMerge2.Aux[I2, Y, Merge2],
    pp: Application[MTSType, ReverseModelToStringContext, Merge2, I4],
    zsgLabelledGeneric: ZsgLabelledGeneric[I1, I4#Tail#Tail#Head],
    zsgDefaultValueGeneric: ZsgDefaultValue#ModelType[I1]#GenericType[I4#Tail#Head],
    zsgGetterGeneric: ZsgGetterGeneric[I1, I4#Head]
  ): ModelToString[I1] = {
    val app = pp.application(ReverseModelToStringContext.value)
    new ModelToString[I1] {
      override def mToString(ii: I1): List[FieldModel] = app.encode(zsgGetterGeneric.getter(ii), List.empty, _ + 1, 1)._1
      override def defaultValues: List[DefaultValue]   = app.defaultValue(zsgDefaultValueGeneric.defaultValues, List.empty, _ + 1, 1)._1
      override def labelledNames: List[String]         = app.appendLabelledName(zsgLabelledGeneric.names, List.empty)
    }
  }

}
