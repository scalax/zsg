package net.scalax.asuna.circe

import io.circe.{ Encoder, Json, JsonObject }
import net.scalax.asuna.circe.aaaa.{ CirceAsunaEncoder, CirceAsunaEncoderImpl }
import net.scalax.asuna.circe.another.{ AsunaEncoderContent, CirceEncoderContent, EncoderContentAbs }
import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderHelper, EncoderWrapperHelper, ForTableInput }
import shapeless.Lazy

import scala.language.experimental.macros

trait ACirceEncoderWrapper[RepOut, DataType] extends EncoderContent[RepOut, DataType] {
  def write(data: DataType): JsonObject
}

object asunaCirceImpl extends EncoderHelper[List[CirceAsunaEncoder], List[(String, Json)]] with EncoderWrapperHelper[List[CirceAsunaEncoder], List[(String, Json)], ACirceEncoderWrapper] {

  override def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape[Rep, D, Out, List[CirceAsunaEncoder], List[(String, Json)]]): ACirceEncoderWrapper[Out, D] = {
    val shape1 = shape
    val rep1 = rep
    val wrapRep = shape1.wrapRep(rep1)
    //val reps = shape1.toLawRep(shape1.wrapRep(rep1), List.empty)
    new ACirceEncoderWrapper[Out, D] {
      override def write(data: D): JsonObject = {
        val dataList = shape1.buildData(data, wrapRep, List.empty)
        //val list = reps.zip(dataList).map { case (rep, data) => (rep.key, rep.write(data.asInstanceOf[rep.DataType])) }
        /*val (_, list) = reps.foldLeft((dataList, List.empty[(String, Json)])) {
          case ((items, r), rep) =>
            val head = items.head
            val json = rep.write(head.asInstanceOf[rep.DataType])
            val value = ((rep.key, json)) :: r
            (items.tail, value)
        }*/
        JsonObject.fromIterable(dataList)
      }
    }
  }

}

trait CirceAsunaEncoderHelper {

  /*implicit def sdfasfgefsgsertgdryhtryuhrtyh[D](implicit mColumnInfo: MacroColumnInfo): EncoderShape[CirceAsunaEncoderImpl[D], D, CirceAsunaEncoderImpl[D], List[CirceAsunaEncoder], List[(String, Json)]] = {
    new EncoderShape[CirceAsunaEncoderImpl[D], D, CirceAsunaEncoderImpl[D], List[CirceAsunaEncoder], List[(String, Json)]] {
      override def wrapRep(base: CirceAsunaEncoderImpl[D]): CirceAsunaEncoderImpl[D] = base
      override def toLawRep(base: CirceAsunaEncoderImpl[D], oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldRep
      override def buildData(data: D, rep: CirceAsunaEncoderImpl[D], oldData: List[Any]): List[Any] = ((rep.key, rep.write(data))) :: oldData
    }
  }*/

  implicit def caseOnlyEncoderImplicit[Case]: ForTableInput[EmptyCirceTable, Case, List[CirceAsunaEncoder], List[(String, Json)]] = macro EncoderMapper.EncoderMapperImpl.impl[EmptyCirceTable, Case, List[CirceAsunaEncoder], List[(String, Json)]]

  implicit def eriosjgiserhtieshtehrt[D](implicit mColumnInfo: MacroColumnInfo, asunaEncoder: Lazy[EncoderContentAbs[D]]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], List[CirceAsunaEncoder], List[(String, Json)]] = {
    def exsistingCirceEncoderToShape(proName: String, circeEncoder: Encoder[D]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], List[CirceAsunaEncoder], List[(String, Json)]] = {
      new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], List[CirceAsunaEncoder], List[(String, Json)]] {
        override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
          override val key = proName
          override def write(data: D): Json = {
            if (data == null) {
              Json.Null
            } else {
              circeEncoder(data)
            }
          }
        }
        override def toLawRep(base: CirceAsunaEncoderImpl[D], oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldRep

        override def buildData(data: D, rep: CirceAsunaEncoderImpl[D], oldData: List[(String, Json)]): List[(String, Json)] = ((rep.key, rep.write(data))) :: oldData
      }
    }

    def asunaInputTableToShape(proName: String, asunaEncoder: ForTableInput[EmptyCirceTable, D, List[CirceAsunaEncoder], List[(String, Json)]]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], List[CirceAsunaEncoder], List[(String, Json)]] = {
      lazy val subEncoder = asunaCirceImpl.effect(asunaEncoder.input(EmptyCirceTable.value))
      new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], List[CirceAsunaEncoder], List[(String, Json)]] {
        override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
          override val key = proName
          override def write(data: D): Json = {
            if (data == null) {
              Json.Null
            } else {
              Json.fromJsonObject(subEncoder.write(data))
            }
          }
        }
        override def toLawRep(base: CirceAsunaEncoderImpl[D], oldReps: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldReps
        override def buildData(data: D, rep: CirceAsunaEncoderImpl[D], oldData: List[(String, Json)]): List[(String, Json)] = ((rep.key, rep.write(data))) :: oldData
      }
    }
    asunaEncoder.value match {
      case n1: CirceEncoderContent[D] => exsistingCirceEncoderToShape(mColumnInfo.modelColumnName, n1.circeEncoder)
      case n2: AsunaEncoderContent[D] => asunaInputTableToShape(mColumnInfo.modelColumnName, n2.asunaEncoder)
    }
  }

  trait EncoderApply[T] {
    def func[R](key: String, f: T => R)(implicit encoder: Encoder[R]): CirceAsunaEncoderImpl[T] = {
      val key1 = key
      new CirceAsunaEncoderImpl[T] {
        override val key = key1
        override def write(data: T): Json = encoder(f(data))
      }
    }
  }

  def cusEncoder[T]: EncoderApply[T] = new EncoderApply[T] {}

  val asunaCirce = asunaCirceImpl

}