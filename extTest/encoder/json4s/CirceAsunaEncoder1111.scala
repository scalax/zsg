package net.scalax.asuna.circe.json4s

import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderHelper, EncoderWrapperHelper, ForTableInput }
import org.json4s.JsonAST._
import shapeless.Lazy

import scala.language.experimental.macros

trait ACirceEncoderWrapper[RepOut, DataType] extends EncoderContent[RepOut, DataType] {
  def write(data: DataType): JValue
}

object json4sImpl extends EncoderHelper[CirceAsunaEncoder, Any] with EncoderWrapperHelper[CirceAsunaEncoder, Any, ACirceEncoderWrapper] {

  override def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape[Rep, D, Out, CirceAsunaEncoder, Any]): ACirceEncoderWrapper[Out, D] = {
    val shape1 = shape
    val rep1 = rep
    val wrapRep = shape1.wrapRep(rep1)
    new ACirceEncoderWrapper[Out, D] {
      override def write(data: D): JValue = {
        val dataList = shape1.buildData(data, wrapRep, List.empty).asInstanceOf[List[(String, JValue)]]
        JObject(dataList)
      }
    }
  }

}

trait Json4sAsunaEncoderHelper {

  implicit val stringEncoder: Json4sEncoder[String] = (s: String) => JString(s)
  implicit val intEncoder: Json4sEncoder[Int] = (s: Int) => JInt(s)

  implicit def sdfasfgefsgsertgdryhtryuhrtyh[D](implicit mColumnInfo: MacroColumnInfo): EncoderShape[CirceAsunaEncoderImpl[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder, Any] = {
    new EncoderShape[CirceAsunaEncoderImpl[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder, Any] {
      override def wrapRep(base: CirceAsunaEncoderImpl[D]): CirceAsunaEncoderImpl[D] = base
      override def toLawRep(base: CirceAsunaEncoderImpl[D], oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldRep
      override def buildData(data: D, rep: CirceAsunaEncoderImpl[D], oldData: List[Any]): List[Any] = ((rep.key, rep.write(data))) :: oldData
    }
  }

  implicit def caseOnlyEncoderImplicit[Case]: ForTableInput[EmptyCirceTable, Case, CirceAsunaEncoder, Any] = macro EncoderMapper.EncoderMapperImpl.impl[EmptyCirceTable, Case, CirceAsunaEncoder, Any]

  implicit def eriosjgiserhtieshtehrt[D](implicit mColumnInfo: MacroColumnInfo, asunaEncoder: Lazy[EncoderContentAbs[D]]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder, Any] = {
    def exsistingCirceEncoderToShape(proName: String, circeEncoder: Json4sEncoder[D]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder, Any] = {
      new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder, Any] {
        override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
          override val key = proName
          override def write(data: D): JValue = {
            if (data == null) {
              JNull
            } else {
              circeEncoder(data)
            }
          }
        }
        override def toLawRep(base: CirceAsunaEncoderImpl[D], oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldRep

        override def buildData(data: D, rep: CirceAsunaEncoderImpl[D], oldData: List[Any]): List[Any] = ((rep.key, rep.write(data))) :: oldData
      }
    }

    def asunaInputTableToShape(proName: String, asunaEncoder: ForTableInput[EmptyCirceTable, D, CirceAsunaEncoder, Any]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder, Any] = {
      lazy val subEncoder = json4sImpl.effect(asunaEncoder.input(EmptyCirceTable.value))
      new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder, Any] {
        override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
          override val key = proName
          override def write(data: D): JValue = {
            if (data == null) {
              JNull
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
    def func[R](key: String, f: T => R)(implicit encoder: Json4sEncoder[R]): CirceAsunaEncoderImpl[T] = {
      val key1 = key
      new CirceAsunaEncoderImpl[T] {
        override val key = key1
        override def write(data: T): JValue = encoder(f(data))
      }
    }
  }

  def cusEncoder[T]: EncoderApply[T] = new EncoderApply[T] {}

  val json4s = json4sImpl

}