package net.scalax.asuna.circe

object AbcTest02 extends CirceAsunaEncoderHelper with App {

  val times = 100000

  val collection = 1 to times

  val model: LargeModel = LargeModel()

  {
    object Abc
    val circeEncoder = asunaCirce.effect(asunaCirce.caseOnly[Abc.type, LargeModel].input(Abc))
    for (_ <- collection) {
      io.circe.Json.fromJsonObject(circeEncoder.write(model))
    }
  }

  {
    import io.circe.syntax._
    import io.circe.generic.auto._
    for (_ <- collection) {
      model.asJsonObject
    }
  }

  //need about 3s to compile
  //watse 2055ms
  {
    object Abc {
      //the property i12 will covert to Int and use Int Encoder and custom key
      def i12 = cusEncoder[String].func("cus_pro_i12", _.toInt)
    }
    val circeEncoder = asunaCirce.effect(asunaCirce.caseOnly[Abc.type, LargeModel].input(Abc))
    val data1 = System.currentTimeMillis
    for (_ <- collection) {
      io.circe.Json.fromJsonObject(circeEncoder.write(model))
    }
    val data2 = System.currentTimeMillis
    println(s"asuna 序列化 $times 次消耗了 ${data2 - data1} 毫秒")
    //println(io.circe.Json.fromJsonObject(circeEncoder.write(model)).spaces2)
  }

  //need about 16s to compile
  //watse 2285ms
  {
    import io.circe.syntax._
    import io.circe.generic.auto._
    val data1 = System.currentTimeMillis
    for (_ <- collection) {
      model.asJsonObject
    }
    val data2 = System.currentTimeMillis
    println(s"circe 序列化 $times 次消耗了 ${data2 - data1} 毫秒")
  }

}