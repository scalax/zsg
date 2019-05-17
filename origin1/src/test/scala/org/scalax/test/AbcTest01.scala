package org.scalax.asuna.circe

import io.circe.Encoder
import io.circe.syntax._
import org.scalax.asuna.implements.circe.encoder.CirceHelper
import org.scalax.asuna.mapper.decoder.EmptyLazyModel

object AbcTest01 extends App with CirceHelper {

  val model: LargeModel11 = Abcc.jj

  val result1 = {
    import io.circe.generic.semiauto._
    implicit val encoder: Encoder[LargeModel11] = deriveEncoder

    for (_ <- TestParam.preCollection) {
      model.asJson
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      model.asJson
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = (data2 - data1), jsonModel = model.asJson)
  }

  object Abc {
    //the property i12 will covert to Int and use Int Encoder and custom key
    //def i12 = cusEncoder[String].func("cus_pro_i12", _.toInt)
    /*@RootModel[sdfhhitehrt]
    def sdklfgjsontoerhntgioerhntgjoisdrntgjioedrhgiodrhgsdriohgsdru = {
      cusEncoder[sdfhhitehrt].func("abc" * 100, identity)
    }*/
  }

  object Ghi

  case class Input[T](i18: T)

  /*trait TypeP {

    def unused: Input[R] = Input(i18 = model.i18)
    val model: LargeModel[R]
    val input: EmptyLazyModel = EmptyLazyModel.value
    type R

  }

  type AAux[T] = TypeP { type R = T }

  def inputModel[T](m: LargeModel[T]): AAux[T] = new TypeP {
    override val model: LargeModel[T] = m
    override type R = T
  }*/

  val result2 = {

    /*implicit val a1 = circe.effect(circe.unusedModel[TypeP](Ghi).compile)
    implicit def k[T](implicit kr: Encoder[T]): Encoder[LargeModel[T]] = {
      val u1 = circeDef.effect(circeDef.singleModel[Input[T]](Ghi).compile)
      a1.zip(u1).write.contramap[LargeModel[T]] { r =>
        val m = inputModel(r)
        (m, m.unused)
      }
    }

    object Aa {
      implicit val a1 = circe.effect(circe.unusedModel[TypeP](Ghi).compile)
      implicit def k[T](implicit kr: Encoder[T]): Encoder[LargeModel[T]] = {
        val u1 = circe.effect(circe.singleModel[Input[T]](Ghi).compile)
        a1.zip(u1).write.contramap[LargeModel[T]] { r =>
          val m = inputModel(r)
          (m, m.unused)
        }
      }
      implicit val a2 = circe.effect(circe.singleModel[Hahahah2](Ghi).compile).write
      lazy val a3     = circe.effect(circe.singleModel[MiaoMiao2](Abc).compile).write
    }*/

    implicit val a1 = valEncoder.effect(valEncoder.singleModel[LargeModel11](Ghi).compile).encoder

    for (_ <- TestParam.preCollection) {
      model.asJson
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      model.asJson
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = (data2 - data1), jsonModel = model.asJson)
  }

  println(s"circe 标准库序列化 ${result1.times} 次消耗了 ${result1.millions} 毫秒")
  println(s"circe-asuna 序列化 ${result2.times} 次消耗了 ${result2.millions} 毫秒")
  println(s"结果是否相等：${result1.jsonModel == result2.jsonModel}")
  //println(result2.jsonModel.spaces2)

  {
    val data1 = System.currentTimeMillis
    for (_ <- TestParam.toStringCollection) {
      result1.jsonModel.noSpaces
    }
    val data2 = System.currentTimeMillis
    println(s"转化为文本 ${TestParam.toStringTimes} 次消耗了 ${data2 - data1} 毫秒")
  }

}
