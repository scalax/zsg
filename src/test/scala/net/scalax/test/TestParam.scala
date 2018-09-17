package net.scalax.asuna.circe

object TestParam {

  val preTimes  = 80000
  val testTimes = 1000000

  val preCollection  = 1 to preTimes
  val testCollection = 1 to testTimes

}

case class TestResult[T](times: Int, millions: Long, jsonModel: T)
