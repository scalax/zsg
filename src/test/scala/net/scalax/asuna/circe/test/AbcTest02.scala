package net.scalax.asuna.circe

import net.scalax.asuna.circe.json4s.Json4sAsunaEncoderHelper

object AbcTest02 extends Json4sAsunaEncoderHelper with App {

  val model: MiaoMiao2 = MiaoMiao2()

  val result1 = {
    import org.json4s._
    implicit val formats: Formats = DefaultFormats

    val testTimes = TestParam.testTimes / 10
    val preCollection = 1 to (TestParam.preTimes / 10)
    val testCollection = 1 to testTimes

    for (_ <- preCollection) {
      Extraction.decompose(model)
    }

    val data1 = System.currentTimeMillis

    for (_ <- testCollection) {
      Extraction.decompose(model)
    }

    val data2 = System.currentTimeMillis
    TestResult(times = testTimes, millions = data2 - data1, jsonModel = Extraction.decompose(model))
  }

  val result2 = {
    object Abc

    val json4sEncoder = json4s.effect(json4s.caseOnly[Abc.type, MiaoMiao2].input(Abc))

    for (_ <- TestParam.preCollection) {
      json4sEncoder.write(model)
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      json4sEncoder.write(model)
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = data2 - data1, jsonModel = json4sEncoder.write(model))
  }

  println(s"json4s 标准库序列化 ${result1.times} 次消耗了 ${result1.millions} 毫秒")
  println(s"json4s-asuna 序列化 ${result2.times} 次消耗了 ${result2.millions} 毫秒")
  println(s"结果是否相等：${result1.jsonModel == result2.jsonModel}")

  {
    val data1 = System.currentTimeMillis
    for (_ <- TestParam.testCollection) {
      implicit val formats = org.json4s.native.Serialization.formats(org.json4s.NoTypeHints)
      org.json4s.native.Serialization.write(result1.jsonModel)
    }
    val data2 = System.currentTimeMillis
    println(s"native 底层转化为文本 ${TestParam.testTimes} 次消耗了 ${data2 - data1} 毫秒")
  }

  {
    val data1 = System.currentTimeMillis
    for (_ <- TestParam.testCollection) {
      implicit val formats = org.json4s.jackson.Serialization.formats(org.json4s.NoTypeHints)
      org.json4s.jackson.Serialization.write(result1.jsonModel)
    }
    val data2 = System.currentTimeMillis
    println(s"jackson 底层转化为文本 ${TestParam.testTimes} 次消耗了 ${data2 - data1} 毫秒")
  }

}