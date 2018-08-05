package net.scalax.asuna.circe

object AbcTest02 extends CirceAsunaEncoderHelper with App {

  val times = 100000

  val model: MiaoMiao = MiaoMiao()

  //need about 16s to compile
  //watse 2610ms
  {
    import io.circe.syntax._
    import io.circe.generic.auto._
    val data1 = System.currentTimeMillis
    for (_ <- 1 to times) {
      model.asJsonObject
    }
    val data2 = System.currentTimeMillis
    println(s"circe 序列化 $times 次消耗了 ${data2 - data1} 毫秒")
  }

  //need about 3s to compile
  //watse 4037ms
  {
    object Abc {
      //the property i12 will covert to Int and use Int Encoder and custom key
      def i12 = cusEncoder[String].func("cus_pro_i12", _.toInt)
    }
    val circeEncoder = asunaCirce.effect(asunaCirce.caseOnly[Abc.type, MiaoMiao].input(Abc))
    val data1 = System.currentTimeMillis
    for (_ <- 1 to times) {
      circeEncoder.write(model)
    }
    val data2 = System.currentTimeMillis
    println(s"asuna 序列化 $times 次消耗了 ${data2 - data1} 毫秒")
  }

}