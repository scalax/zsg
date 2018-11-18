package net.scalax.asuna.circe

import net.scalax.asuna.implements.play.abc.PlayHelper

object AbcTest04 extends PlayHelper with App {

  val model: MiaoMiao2 = MiaoMiao2()

  val result1 = {
    import ai.x.play.json.Jsonx

    implicit def largeModelImplicit = Jsonx.formatCaseClass[LargeModel]
    implicit def hahahah2Implicit   = Jsonx.formatCaseClass[Hahahah2]
    implicit def miaoMiao2Implicit  = Jsonx.formatCaseClass[MiaoMiao2]

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
    object Ghi

    object Abc {
      implicit def a1 = play.effect(play.singleModel[LargeModel](Ghi).compile).write
      implicit def a2 = play.effect(play.singleModel[Hahahah2](Ghi).compile).write
      def a3          = play.effect(play.singleModel[MiaoMiao2](Ghi).compile).write
    }

    for (_ <- TestParam.preCollection) {
      Abc.a3.writes(model)
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      Abc.a3.writes(model)
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = data2 - data1, jsonModel = Abc.a3.writes(model))
  }

  println(s"play-json 标准库序列化 ${result1.times} 次消耗了 ${result1.millions} 毫秒")
  println(s"play-json-asuna 序列化 ${result2.times} 次消耗了 ${result2.millions} 毫秒")
  println(s"结果是否相等：${result1.jsonModel == result2.jsonModel}")

  {
    import _root_.play.api.libs.json.Json
    val data1 = System.currentTimeMillis
    for (_ <- TestParam.toStringCollection) {
      Json.stringify(result1.jsonModel)
    }
    val data2 = System.currentTimeMillis
    println(s"转化为文本 ${TestParam.toStringTimes} 次消耗了 ${data2 - data1} 毫秒")
  }

}
