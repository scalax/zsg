package net.scalax.asuna.circe.spray_json

import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderHelper, EncoderWrapperHelper, ForTableInput }
import spray.json._
import shapeless.Lazy

import scala.language.experimental.macros

trait ACirceEncoderWrapper[RepOut, DataType] extends EncoderContent[RepOut, DataType] {
  def write(data: DataType): JsValue
}

object sprayImpl extends EncoderHelper[CirceAsunaEncoder, Any] with EncoderWrapperHelper[CirceAsunaEncoder, Any, ACirceEncoderWrapper] {

  override def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape[Rep, D, Out, CirceAsunaEncoder, Any]): ACirceEncoderWrapper[Out, D] = {
    val shape1 = shape
    val rep1 = rep
    val wrapRep = shape1.wrapRep(rep1)
    new ACirceEncoderWrapper[Out, D] {
      override def write(data: D): JsValue = {
        val dataList = shape1.buildData(data, wrapRep, List.empty).asInstanceOf[List[(String, JsValue)]]
        JsObject(dataList: _*)
      }
    }
  }

}

trait SprayAsunaEncoderHelper {

  implicit def sdfasfgefsgsertgdryhtryuhrtyh[D](implicit mColumnInfo: MacroColumnInfo): EncoderShape[CirceAsunaEncoderImpl[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder, Any] = {
    new EncoderShape[CirceAsunaEncoderImpl[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder, Any] {
      override def wrapRep(base: CirceAsunaEncoderImpl[D]): CirceAsunaEncoderImpl[D] = base
      override def toLawRep(base: CirceAsunaEncoderImpl[D], oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldRep
      override def buildData(data: D, rep: CirceAsunaEncoderImpl[D], oldData: List[Any]): List[Any] = ((rep.key, rep.write(data))) :: oldData
    }
  }

  implicit def caseOnlyEncoderImplicit[Case]: ForTableInput[EmptyCirceTable, Case, CirceAsunaEncoder, Any] = macro EncoderMapper.EncoderMapperImpl.impl[EmptyCirceTable, Case, CirceAsunaEncoder, Any]

  implicit def eriosjgiserhtieshtehrt[D](implicit mColumnInfo: MacroColumnInfo, asunaEncoder: Lazy[EncoderContentAbs[D]]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder, Any] = {
    def exsistingCirceEncoderToShape(proName: String, circeEncoder: JsonWriter[D]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder, Any] = {
      new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder, Any] {
        override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
          override val key = proName
          override def write(data: D): JsValue = {
            if (data == null) {
              JsNull
            } else {
              circeEncoder.write(data)
            }
          }
        }
        override def toLawRep(base: CirceAsunaEncoderImpl[D], oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldRep

        override def buildData(data: D, rep: CirceAsunaEncoderImpl[D], oldData: List[Any]): List[Any] = ((rep.key, rep.write(data))) :: oldData
      }
    }

    def asunaInputTableToShape(proName: String, asunaEncoder: ForTableInput[EmptyCirceTable, D, CirceAsunaEncoder, Any]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder, Any] = {
      lazy val subEncoder = sprayImpl.effect(asunaEncoder.input(EmptyCirceTable.value))
      new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder, Any] {
        override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
          override val key = proName
          override def write(data: D): JsValue = {
            if (data == null) {
              JsNull
            } else {
              subEncoder.write(data)
            }
          }
        }
        override def toLawRep(base: CirceAsunaEncoderImpl[D], oldReps: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldReps
        override def buildData(data: D, rep: CirceAsunaEncoderImpl[D], oldData: List[Any]): List[Any] = ((rep.key, rep.write(data))) :: oldData
      }
    }
    asunaEncoder.value match {
      case n1: CirceEncoderContent[D] => exsistingCirceEncoderToShape(mColumnInfo.modelColumnName, n1.circeEncoder)
      case n2: AsunaEncoderContent[D] => asunaInputTableToShape(mColumnInfo.modelColumnName, n2.asunaEncoder)
    }
  }

  trait EncoderApply[T] {
    def func[R](key: String, f: T => R)(implicit encoder: JsonWriter[R]): CirceAsunaEncoderImpl[T] = {
      val key1 = key
      new CirceAsunaEncoderImpl[T] {
        override val key = key1
        override def write(data: T): JsValue = encoder.write(f(data))
      }
    }
  }

  def cusEncoder[T]: EncoderApply[T] = new EncoderApply[T] {}

  val spray = sprayImpl

}