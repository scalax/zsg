package net.scalax.asuna.circe

import io.circe.{ Encoder, Json, JsonObject }
import net.scalax.asuna.circe.aaaa.{ CirceAsunaEncoder, CirceAsunaEncoderImpl }
import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.encoder._

import scala.language.experimental.macros

trait ACirceEncoderWrapper[RepOut, DataType] extends EncoderContent[RepOut, DataType] {
  def write(data: DataType): JsonObject
}

object asunaCirceImpl extends EncoderWrapperHelper[List[CirceAsunaEncoder], List[(String, Json)], ACirceEncoderWrapper] {

  override def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape.Aux[Rep, D, Out, List[CirceAsunaEncoder], List[(String, Json)]]): ACirceEncoderWrapper[Out, D] = {
    val shape1 = shape
    val rep1 = rep
    val wrapRep = shape1.wrapRep(rep1)
    new ACirceEncoderWrapper[Out, D] {
      override def write(data: D): JsonObject = {
        val dataList = shape1.buildData(data, wrapRep, List.empty)
        JsonObject.fromIterable(dataList)
      }
    }
  }

}

trait CirceAsunaEncoderHelper extends HListEncoderShapeImplicit with EncoderHelper[List[CirceAsunaEncoder], List[(String, Json)]] {

  /*implicit def sdfasfgefsgsertgdryhtryuhrtyh[D](implicit mColumnInfo: MacroColumnInfo): EncoderShape[CirceAsunaEncoderImpl[D], D, CirceAsunaEncoderImpl[D], List[CirceAsunaEncoder], List[(String, Json)]] = {
    new EncoderShape[CirceAsunaEncoderImpl[D], D, CirceAsunaEncoderImpl[D], List[CirceAsunaEncoder], List[(String, Json)]] {
      override def wrapRep(base: CirceAsunaEncoderImpl[D]): CirceAsunaEncoderImpl[D] = base
      override def toLawRep(base: CirceAsunaEncoderImpl[D], oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldRep
      override def buildData(data: D, rep: CirceAsunaEncoderImpl[D], oldData: List[(String, Json)]): List[(String, Json)] = ((rep.key, rep.write(data))) :: oldData
    }
  }*/

  /*implicit def arklerngnighseuighne[D, R](implicit mColumnInfo: MacroColumnInfo, itemEncoder: Lazy[EncoderShape[Placeholder[D], D, R, List[CirceAsunaEncoder], List[(String, Json)]]]): EncoderShape[Placeholder[List[D]], List[D], ListCirceAsunaEncoder[R, D], List[CirceAsunaEncoder], List[(String, Json)]] = {
    new EncoderShape[Placeholder[List[D]], List[D], ListCirceAsunaEncoder[R, D], List[CirceAsunaEncoder], List[(String, Json)]] {
      override def wrapRep(base: Placeholder[List[D]]): ListCirceAsunaEncoder[R, D] = new ListCirceAsunaEncoder[R, D] {
        override val rep: R = itemEncoder.value.wrapRep(new Placeholder[D] {})
        override val shape: EncoderShape[R, D, R, List[CirceAsunaEncoder], List[(String, Json)]] = itemEncoder.value.packed
        override val key: String = mColumnInfo.modelColumnName
      }
      override def toLawRep(base: ListCirceAsunaEncoder[R, D], oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldRep
      override def buildData(data: List[D], rep: ListCirceAsunaEncoder[R, D], oldData: List[(String, Json)]): List[(String, Json)] = ((rep.key, rep.write(data))) :: oldData
    }
  }*/

  /*implicit def sjrjseriojterhtisoehtseruithsierute[D](implicit mColumnInfo: MacroColumnInfo, asunaEncoder: Lazy[EncoderContentAbs[D]]): EncoderShape[Placeholder[List[D]], List[D], ListCirceAsunaEncoder[CirceAsunaEncoderImpl[D], D], List[CirceAsunaEncoder], List[(String, Json)]] = {
    val shape1 = eriosjgiserhtieshtehrt(mColumnInfo, asunaEncoder)
    arklerngnighseuighne(mColumnInfo, shape1)
  }*/

  implicit def dfgsdgdfgdfgsetrtrtdst[B, RepCol, DataCol](implicit someshape: Encoder[B]): EncoderShape.Aux[HListEncoderShapeWrap[Placeholder[B], B, List[CirceAsunaEncoder], List[(String, Json)]], B, CirceAsunaEncoderImpl[B], List[CirceAsunaEncoder], List[(String, Json)]] = {
    new EncoderShape[HListEncoderShapeWrap[Placeholder[B], B, List[CirceAsunaEncoder], List[(String, Json)]], B, List[CirceAsunaEncoder], List[(String, Json)]] {
      override type Target = CirceAsunaEncoderImpl[B]
      override def wrapRep(base: HListEncoderShapeWrap[Placeholder[B], B, List[CirceAsunaEncoder], List[(String, Json)]]): CirceAsunaEncoderImpl[B] = new CirceAsunaEncoderImpl[B] {
        override val key = base.columnInfo.modelColumnName
        override def write(data: B): Json = {
          if (data == null) {
            Json.Null
          } else {
            someshape(data)
          }
        }
      }
      override def toLawRep(base: CirceAsunaEncoderImpl[B], oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldRep
      override def buildData(data: B, rep: CirceAsunaEncoderImpl[B], oldData: List[(String, Json)]): List[(String, Json)] = ((rep.key, rep.write(data))) :: oldData
    }
  }

  /*implicit def eriosjgiserhtieshtehrt[D](implicit mColumnInfo: MacroColumnInfo, asunaEncoder: Encoder[D]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], List[CirceAsunaEncoder], List[(String, Json)]] = {
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

    exsistingCirceEncoderToShape(mColumnInfo.modelColumnName, asunaEncoder)
  }*/

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