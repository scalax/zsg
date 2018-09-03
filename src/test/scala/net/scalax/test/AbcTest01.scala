package net.scalax.asuna.circe

object AbcTest01 extends CirceAsunaEncoderHelper with App {

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

  val result2 = {
    object Abc {
      //the property i12 will covert to Int and use Int Encoder and custom key
      //def i12 = cusEncoder[String].func("cus_pro_i12", _.toInt)
    }

    val circeEncoder = asunaCirce.effect(asunaCirce.caseOnly[Abc.type, LargeModel].compileEncoder1111.inputTable(Abc))

    for (_ <- TestParam.preCollection) {
      io.circe.Json.fromJsonObject(circeEncoder.write(model))
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      io.circe.Json.fromJsonObject(circeEncoder.write(model))
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = (data2 - data1), jsonModel = io.circe.Json.fromJsonObject(circeEncoder.write(model)))
  }

  println(s"circe 标准库序列化 ${result1.times} 次消耗了 ${result1.millions} 毫秒")
  println(s"circe-asuna 序列化 ${result2.times} 次消耗了 ${result2.millions} 毫秒")
  println(s"结果是否相等：${result1.jsonModel == result2.jsonModel}")

  {
    val data1 = System.currentTimeMillis
    for (_ <- TestParam.testCollection) {
      result1.jsonModel.noSpaces
    }
    val data2 = System.currentTimeMillis
    println(s"转化为文本 ${TestParam.testTimes} 次消耗了 ${data2 - data1} 毫秒")
  }

}