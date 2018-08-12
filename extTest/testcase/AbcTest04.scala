package net.scalax.asuna.circe

import ai.x.play.json.Jsonx
import net.scalax.asuna.circe.play_json.PlayJsonAsunaEncoderHelper
import play.api.libs.json.Json

object AbcTest04 extends PlayJsonAsunaEncoderHelper with App {

  val model: MiaoMiao2 = MiaoMiao2()

  val result1 = {
    implicit val largeModelImplicit = Jsonx.formatCaseClass[LargeModel]
    implicit val hahahah2Implicit = Jsonx.formatCaseClass[Hahahah2]
    implicit val miaoMiao2Implicit = Jsonx.formatCaseClass[MiaoMiao2]

    for (_ <- TestParam.preCollection) {
      miaoMiao2Implicit.writes(model)
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      miaoMiao2Implicit.writes(model)
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = data2 - data1, jsonModel = miaoMiao2Implicit.writes(model))
  }

  val result2 = {
    object Abc

    val playJsonEncoder = playJson.effect(playJson.caseOnly[Abc.type, MiaoMiao2].input(Abc))

    for (_ <- TestParam.preCollection) {
      playJsonEncoder.write(model)
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      playJsonEncoder.write(model)
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = data2 - data1, jsonModel = playJsonEncoder.write(model))
  }

  println(s"play-json 标准库序列化 ${result1.times} 次消耗了 ${result1.millions} 毫秒")
  println(s"play-json-asuna 序列化 ${result2.times} 次消耗了 ${result2.millions} 毫秒")
  println(s"结果是否相等：${result1.jsonModel == result2.jsonModel}")

  {
    val data1 = System.currentTimeMillis
    for (_ <- TestParam.testCollection) {
      Json.stringify(result1.jsonModel)
    }
    val data2 = System.currentTimeMillis
    println(s"转化为文本 ${TestParam.testTimes} 次消耗了 ${data2 - data1} 毫秒")
  }

}