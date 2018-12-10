package org.scalax.asuna.circe

import io.circe.ObjectEncoder
import org.scalax.asuna.implements.circe.encoder.CirceHelper

object AbcTest02 extends App with CirceHelper {

  val model: MiaoMiao2 = Abcc.hh

  val result1 = {
    import upickle.default._
    import upickle.default.{ReadWriter => RW, macroRW}

    implicit lazy val rw1: RW[LargeModel[String]] = macroRW
    implicit lazy val rw2: RW[Hahahah2]           = macroRW
    implicit lazy val rw3: RW[MiaoMiao2]          = macroRW

    for (_ <- TestParam.preCollection) {
      write[MiaoMiao2](model)
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      write[MiaoMiao2](model)
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = (data2 - data1), jsonModel = write[MiaoMiao2](model))
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

  val result2 = {

    import io.circe.syntax._

    implicit lazy val a1: ObjectEncoder[LargeModel[String]] = valEncoder.effect(valEncoder.singleModel[LargeModel[String]](Ghi).compile).encoder
    implicit lazy val a2: ObjectEncoder[Hahahah2]           = valEncoder.effect(valEncoder.singleModel[Hahahah2](Ghi).compile).encoder
    implicit lazy val a3: ObjectEncoder[MiaoMiao2]          = valEncoder.effect(valEncoder.singleModel[MiaoMiao2](Abc).compile).encoder

    for (_ <- TestParam.preCollection) {
      model.asJson.noSpaces
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      model.asJson.noSpaces
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = (data2 - data1), jsonModel = model.asJson.noSpaces)
  }

  println(s"upickle 标准库序列化 ${result1.times} 次消耗了 ${result1.millions} 毫秒")
  println(s"circe-asuna 序列化 ${result2.times} 次消耗了 ${result2.millions} 毫秒")
  println(s"结果是否相等：${io.circe.parser.parse(result1.jsonModel) == io.circe.parser.parse(result2.jsonModel)}")
  println(result1.jsonModel)
  println(result2.jsonModel)

  /*{
    val data1 = System.currentTimeMillis
    for (_ <- TestParam.toStringCollection) {
      result1.jsonModel.noSpaces
    }
    val data2 = System.currentTimeMillis
    println(s"转化为文本 ${TestParam.toStringTimes} 次消耗了 ${data2 - data1} 毫秒")
  }*/

}
