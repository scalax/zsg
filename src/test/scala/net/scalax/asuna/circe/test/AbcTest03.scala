package net.scalax.asuna.circe

import spray.json._
import fommil.sjs._
import net.scalax.asuna.circe.spray_json.SprayAsunaEncoderHelper

object AbcTest03 extends SprayAsunaEncoderHelper with DefaultJsonProtocol with FamilyFormats with App {

  val model: MiaoMiao2 = MiaoMiao2()

  val result1 = {
    implicit val largeModelImplicit = shapeless.cachedImplicit[JsonFormat[LargeModel]]
    implicit val hahahah2Implicit = shapeless.cachedImplicit[JsonFormat[Hahahah2]]
    implicit val miaoMiao2Implicit = shapeless.cachedImplicit[JsonFormat[MiaoMiao2]]

    val testTimes = TestParam.testTimes / 100
    val preCollection = 1 to (TestParam.preTimes / 100)
    val testCollection = 1 to testTimes

    for (_ <- preCollection) {
      miaoMiao2Implicit.write(model)
    }

    val data1 = System.currentTimeMillis

    for (_ <- testCollection) {
      miaoMiao2Implicit.write(model)
    }

    val data2 = System.currentTimeMillis
    TestResult(times = testTimes, millions = data2 - data1, jsonModel = miaoMiao2Implicit.write(model))
  }

  val result2 = {
    object Abc

    val sprayEncoder = spray.effect(spray.caseOnly[Abc.type, MiaoMiao2].input(Abc))

    val testTimes = TestParam.testTimes / 100
    val preCollection = 1 to (TestParam.preTimes / 100)
    val testCollection = 1 to testTimes

    for (_ <- preCollection) {
      sprayEncoder.write(model)
    }

    val data1 = System.currentTimeMillis

    for (_ <- testCollection) {
      sprayEncoder.write(model)
    }

    val data2 = System.currentTimeMillis
    TestResult(times = testTimes, millions = data2 - data1, jsonModel = sprayEncoder.write(model))
  }

  println(s"spray-json 标准库序列化 ${result1.times} 次消耗了 ${result1.millions} 毫秒")
  println(s"spary-json-asuna 序列化 ${result2.times} 次消耗了 ${result2.millions} 毫秒")
  println(s"结果是否相等：${result1.jsonModel == result2.jsonModel}")

  {
    val data1 = System.currentTimeMillis
    for (_ <- TestParam.testCollection) {
      result1.jsonModel.compactPrint
    }
    val data2 = System.currentTimeMillis
    println(s"转化为文本 ${TestParam.testTimes} 次消耗了 ${data2 - data1} 毫秒")
  }

}