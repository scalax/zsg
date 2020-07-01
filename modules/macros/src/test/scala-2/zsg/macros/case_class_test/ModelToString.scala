package zsg.macros.case_class_test

import zsg.macros.single.{ColumnName, GenericColumnName, StringName, ZsgGeneric, ZsgGetterGeneric, ZsgLabelledTypeGeneric}
import zsg.{Application3, Context3, Plus3, PropertyTag, ZsgTuple0}

trait ModelToString[E] {
  def mToString(i: E): List[(PropertyItem, String)]
}

object ModelToString {

  object ModelToStringContext extends Context3[ModelToStringContent] {
    override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: ModelToStringContent[X1, X2, X3], y: ModelToStringContent[Y1, Y2, Y3])(
      p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]
    ): ModelToStringContent[Z1, Z2, Z3] =
      new ModelToStringContent[Z1, Z2, Z3] {
        override def encode(i1: Z2, l: List[(PropertyItem, String)]): List[(PropertyItem, String)] = {
          val t1 = x.encode(p.takeHead2(i1), l)
          y.encode(p.takeTail2(i1), t1)
        }
      }

    override val start: ModelToStringContent[ZsgTuple0, ZsgTuple0, ZsgTuple0] = new ModelToStringContent[ZsgTuple0, ZsgTuple0, ZsgTuple0] {
      override def encode(i1: ZsgTuple0, l: List[(PropertyItem, String)]): List[(PropertyItem, String)] = l
    }
  }

  object ReverseModelToStringContext extends Context3[ModelToStringContent] {
    override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: ModelToStringContent[X1, X2, X3], y: ModelToStringContent[Y1, Y2, Y3])(
      p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]
    ): ModelToStringContent[Z1, Z2, Z3] =
      new ModelToStringContent[Z1, Z2, Z3] {
        override def encode(i1: Z2, l: List[(PropertyItem, String)]): List[(PropertyItem, String)] = {
          val t2 = y.encode(p.takeTail2(i1), l)
          x.encode(p.takeHead2(i1), t2)
        }
      }

    override val start: ModelToStringContent[ZsgTuple0, ZsgTuple0, ZsgTuple0] = new ModelToStringContent[ZsgTuple0, ZsgTuple0, ZsgTuple0] {
      override def encode(i1: ZsgTuple0, i2: List[(PropertyItem, String)]): List[(PropertyItem, String)] = i2
    }
  }

  trait ModelToStringContent[I1, M, I2] {
    def encode(i: M, l: List[(PropertyItem, String)]): List[(PropertyItem, String)]
  }

  object ModelToStringContent {
    implicit def pp1[G <: StringName](implicit g: GenericColumnName[G]): ModelToStringContent[PropertyTag[String], String, ColumnName[G]] =
      new ModelToStringContent[PropertyTag[String], String, ColumnName[G]] {
        override def encode(t: String, i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (StringProperty(t), g.value) :: i
      }

    implicit def pp2[G <: StringName](implicit g: GenericColumnName[G]): ModelToStringContent[PropertyTag[Int], Int, ColumnName[G]] =
      new ModelToStringContent[PropertyTag[Int], Int, ColumnName[G]] {
        override def encode(t: Int, i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (IntProperty(t), g.value) :: i
      }

    implicit def pp3[G <: StringName](implicit g: GenericColumnName[G]): ModelToStringContent[PropertyTag[Long], Long, ColumnName[G]] =
      new ModelToStringContent[PropertyTag[Long], Long, ColumnName[G]] {
        override def encode(t: Long, i: List[(PropertyItem, String)]): List[(PropertyItem, String)] = (LongProperty(t), g.value) :: i
      }
  }

  class EncoderContent[I1] {
    def encoder[I2, X, Y](implicit
      g: ZsgGeneric.Aux[I1, I2],
      l: ZsgLabelledTypeGeneric.Aux[I1, Y],
      pp: Application3[ModelToStringContent, I2, X, Y],
      zsgGetterGeneric: ZsgGetterGeneric[I1, X]
    ): ModelToString[I1] = {
      new ModelToString[I1] {
        override def mToString(data: I1): List[(PropertyItem, String)] = pp.application.encode(zsgGetterGeneric.getter(data), List.empty)
      }
    }
  }

  def encoder[T](n: Context3[ModelToStringContent] => EncoderContent[T] => ModelToString[T]): ModelToString[T] = n(ModelToStringContext)(new EncoderContent)

  trait Init2[I1, I2, L] {
    val g: ZsgGeneric.Aux[I1, I2]
    val l: ZsgLabelledTypeGeneric.Aux[I1, L]

    def init2[X](n: Context3[ModelToStringContent] => MContent => Init3[X]): Init3[X] = n(ModelToStringContext)(new MContent)

    class MContent {
      def init2[X](implicit n: Application3[ModelToStringContent, I2, X, L]): Init3[X] = new Init3[X](n.application)
    }

    class Init3[X](n: ModelToStringContent[I2, X, L]) {
      def init3(zsgGetterGeneric: ZsgGetterGeneric[I1, X]): ModelToString[I1] =
        new ModelToString[I1] {
          override def mToString(ii: I1): List[(PropertyItem, String)] = n.encode(zsgGetterGeneric.getter(ii), List.empty)
        }
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

  class ReverseContent[I1] {
    def reverseEncoder[I2, X, Y](implicit
      ii: ZsgGeneric.Aux[I1, I2],
      l: ZsgLabelledTypeGeneric.Aux[I1, Y],
      pp: Application3[ModelToStringContent, I2, X, Y],
      zsgGetterGeneric: ZsgGetterGeneric[I1, X]
    ): ModelToString[I1] =
      new ModelToString[I1] {
        override def mToString(ii: I1): List[(PropertyItem, String)] = pp.application.encode(zsgGetterGeneric.getter(ii), List.empty)
      }
  }

  def reverseEncoder[T](n: Context3[ModelToStringContent] => ReverseContent[T] => ModelToString[T]): ModelToString[T] = n(ReverseModelToStringContext)(new ReverseContent)

}
