package net.scalax.asuna.circe

import io.circe.Json
import net.scalax.asuna.implements.circe.abc.CirceHelper

object AbcTest01 extends App with CirceHelper {

  val model: LargeModel = LargeModel()

  val result1 = {
    import io.circe.generic.auto._
    val encoder = implicitly[io.circe.Encoder[LargeModel]]

    for (_ <- TestParam.preCollection) {
      encoder(model)
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      encoder(model)
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = (data2 - data1), jsonModel = encoder(model))
  }

  object Abc {
    //the property i12 will covert to Int and use Int Encoder and custom key
    //def i12 = cusEncoder[String].func("cus_pro_i12", _.toInt)
    /*@RootModel[sdfhhitehrt]
    def sdklfgjsontoerhntgioerhntgjoisdrntgjioedrhgiodrhgsdriohgsdru = {
      cusEncoder[sdfhhitehrt].func("abc" * 100, identity)
    }*/
  }

  val result2 = {

    val circeEncoder = circe.effect(circe.singleModel[LargeModel](Abc).compile)

    for (_ <- TestParam.preCollection) {
      Json.fromJsonObject(circeEncoder.write(model))
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      Json.fromJsonObject(circeEncoder.write(model))
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = (data2 - data1), jsonModel = Json.fromJsonObject(circeEncoder.write(model)))
  }

  println(s"circe 标准库序列化 ${result1.times} 次消耗了 ${result1.millions} 毫秒")
  println(s"circe-asuna 序列化 ${result2.times} 次消耗了 ${result2.millions} 毫秒")
  println(s"结果是否相等：${result1.jsonModel == result2.jsonModel}")
  //println(result2.jsonModel.spaces2)

  {
    val data1 = System.currentTimeMillis
    for (_ <- TestParam.testCollection) {
      result1.jsonModel.noSpaces
    }
    val data2 = System.currentTimeMillis
    println(s"转化为文本 ${TestParam.testTimes} 次消耗了 ${data2 - data1} 毫秒")
  }

}
