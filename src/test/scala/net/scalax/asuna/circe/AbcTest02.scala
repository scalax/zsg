package net.scalax.asuna.circe

object AbcTest02 extends CirceAsunaEncoderHelper with App {

  val preTimes = 10000
  val testTimes = 100000

  val preCollection = 1 to preTimes
  val testCollection = 1 to testTimes

  val model: LargeModel = LargeModel()

  {
    object Abc
    val circeEncoder = asunaCirce.effect(asunaCirce.caseOnly[Abc.type, LargeModel].input(Abc))
    for (_ <- preCollection) {
      io.circe.Json.fromJsonObject(circeEncoder.write(model))
    }
  }

  {
    import io.circe.syntax._
    import io.circe.generic.auto._
    for (_ <- preCollection) {
      model.asJsonObject
    }
  }

  //need about 3s to compile
  //watse 1262ms
  {
    object Abc {
      //the property i12 will covert to Int and use Int Encoder and custom key
      //def i12 = cusEncoder[String].func("cus_pro_i12", _.toInt)
    }
    val circeEncoder = asunaCirce.effect(asunaCirce.caseOnly[Abc.type, LargeModel].input(Abc))
    val data1 = System.currentTimeMillis
    for (_ <- testCollection) {
      io.circe.Json.fromJsonObject(circeEncoder.write(model))
    }
    val data2 = System.currentTimeMillis
    println(s"asuna 序列化 $testTimes 次消耗了 ${data2 - data1} 毫秒")
  }

  //need about 16s to compile
  //watse 2102ms
  {
    import io.circe.generic.auto._
    val encoder = implicitly[io.circe.Encoder[LargeModel]]
    val data1 = System.currentTimeMillis
    for (_ <- testCollection) {
      encoder(model)
    }
    val data2 = System.currentTimeMillis
    println(s"circe 序列化 $testTimes 次消耗了 ${data2 - data1} 毫秒")
  }

}