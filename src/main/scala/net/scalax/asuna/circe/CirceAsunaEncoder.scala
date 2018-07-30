package net.scalax.asuna.circe

import io.circe.{ Encoder, Json, JsonObject }
import net.scalax.asuna.core.common.{ AtomicColumn, DataGroup, DataRepGroup, Placeholder }
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.encoder.ForTableInput
import shapeless.Lazy

trait CirceAsunaEncoder {

  type DataType

  val key: String

  def write(data: DataType): Json

}

trait CirceAsunaEncoderImpl[E] extends AtomicColumn[E, CirceAsunaEncoder] with CirceAsunaEncoder {
  self =>

  override type DataType = E
  override def common: CirceAsunaEncoder = self

}

trait ListCirceAsunaEncoder[Rep, E] extends AtomicColumn[List[E], CirceAsunaEncoder] with CirceAsunaEncoder {
  self =>

  import io.circe.syntax._

  override type DataType = List[E]
  override def common: CirceAsunaEncoder = self

  val rep: Rep

  val shape: EncoderShape[Rep, E, Rep, CirceAsunaEncoder]

  override val key: String

  def write(data: List[E]): Json = {
    val reps = shape.toLawRep(rep).reps
    data.map { d =>
      val dataList = shape.buildData(d, rep).items
      val jsonMap = dataList.zip(reps).map { case (d, r) => (r.key, r.write(d.asInstanceOf[r.DataType])) }.toMap
      JsonObject.fromMap(jsonMap).asJson
    }.asJson
  }

}

object CirceAsunaEncoder /*extends LawCirceAsunaEncoderHelperImplicitProvider11111*/ {

  /*implicit def columnEncoderWithPropertyName11112222[T, R](implicit mColumnInfo: MacroColumnInfo, itemEncoder: EncoderShape[Placeholder[T], T, R, CirceAsunaEncoder]): EncoderShape[Placeholder[List[T]], List[T], ListCirceAsunaEncoder[R, T], CirceAsunaEncoder] = {
    new EncoderShape[Placeholder[List[T]], List[T], ListCirceAsunaEncoder[R, T], CirceAsunaEncoder] {
      override def wrapRep(base: Placeholder[List[T]]): ListCirceAsunaEncoder[R, T] = new ListCirceAsunaEncoder[R, T] {
        override val rep = itemEncoder.wrapRep(new Placeholder[T] {})
        override val shape = itemEncoder.packed
        override val key = mColumnInfo.modelColumnName
      }
      override def toLawRep(base: ListCirceAsunaEncoder[R, T]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
      override def buildData(data: List[T], rep: ListCirceAsunaEncoder[R, T]): DataGroup = {
        DataGroup(List(data))
      }
    }
  }*/

}

private[circe] trait LawCirceAsunaEncoderHelperImplicitProvider11111 {

  implicit def columnEncoderWithPropertyName[D](implicit mColumnInfo: MacroColumnInfo, enc: Lazy[EncoderContentAbs[D]]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] = {
    def exsistingCirceEncoderToShape(proName: String, circeEncoder: Encoder[D]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] = {
      new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] {
        override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
          override val key = proName + "1111"
          override def write(data: D): Json = circeEncoder(data)
        }
        override def toLawRep(base: CirceAsunaEncoderImpl[D]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))

        override def buildData(data: D, rep: CirceAsunaEncoderImpl[D]): DataGroup = DataGroup(List(data))
      }
    }

    def asunaInputTableToShape(proName: String, asunaEncoder: ForTableInput[EmptyCirceTable, D, CirceAsunaEncoder]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] = {
      new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] {
        override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
          override val key = proName + "2222"
          override def write(data: D): Json = {
            import io.circe.syntax._
            asunaCirceImpl.effect(asunaEncoder.input(EmptyCirceTable.value)).write(data).asJson
          }
        }
        override def toLawRep(base: CirceAsunaEncoderImpl[D]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
        override def buildData(data: D, rep: CirceAsunaEncoderImpl[D]): DataGroup = DataGroup(List(data))
      }
    }
    enc.value match {
      case n1: CirceEncoderContent[D] => exsistingCirceEncoderToShape(mColumnInfo.modelColumnName, n1.circeEncoder)
      case n2: AsunaEncoderContent[D] => asunaInputTableToShape(mColumnInfo.modelColumnName, n2.asunaEncoder)
    }
  }

}