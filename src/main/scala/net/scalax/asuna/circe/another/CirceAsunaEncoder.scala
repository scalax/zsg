package net.scalax.asuna.circe

import io.circe.{ Json, JsonObject }
import net.scalax.asuna.core.common.AtomicColumn
import net.scalax.asuna.core.encoder.EncoderShape

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
/*object CirceAsunaEncoder extends LawCirceAsunaEncoderHelperImplicitProvider11111 {

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

}*/ 