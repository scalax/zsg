package net.scalax.asuna.circe

import net.scalax.asuna.circe.json4s.Json4sAsunaEncoderHelper

object AbcTest05 extends Json4sAsunaEncoderHelper with App {

  val model: MiaoMiao2 = MiaoMiao2()

  val result1 = {
    val encoder = {
      import io.circe.generic.auto._
      implicitly[io.circe.Encoder[MiaoMiao2]]
    }

    for (_ <- TestParam.preCollection) {
      encoder(model).noSpaces
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      encoder(model).noSpaces
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = (data2 - data1), jsonModel = encoder(model).noSpaces)
  }

  val result2 = {
    object Abc

    val json4sEncoder = json4s.effect(json4s.caseOnly[Abc.type, MiaoMiao2].input(Abc))
    implicit val formats = org.json4s.jackson.Serialization.formats(org.json4s.NoTypeHints)

    for (_ <- TestParam.preCollection) {
      org.json4s.jackson.Serialization.write(json4sEncoder.write(model))
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      org.json4s.jackson.Serialization.write(json4sEncoder.write(model))
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = data2 - data1, jsonModel = org.json4s.jackson.Serialization.write(json4sEncoder.write(model)))
  }

  def decodeStr(str: String): MiaoMiao2 = {
    import io.circe.generic.auto._
    io.circe.parser.parse(result1.jsonModel).flatMap(_.as[MiaoMiao2]).right.get
  }

  println(s"circe 标准库序列化 ${result1.times} 次消耗了 ${result1.millions} 毫秒")
  println(s"json4s-jackson 序列化 ${result2.times} 次消耗了 ${result2.millions} 毫秒")
  println(s"结果是否相等：${decodeStr(result1.jsonModel) == decodeStr(result2.jsonModel)}")

}