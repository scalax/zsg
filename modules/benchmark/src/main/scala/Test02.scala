package org.scalax.asuna.circe

import java.util.concurrent.TimeUnit

import asuna.test.{AsunaCirceEncoder, AsunaSealedDecoder, AsunaSealedEncoder}
import org.openjdk.jmh.annotations._

object Aa {
  import ADTs.ADT0
  import Defaults._
  import Generic.ADT
  import Hierarchy._
  import Recursive._
  type Data = ADT[Seq[(Int, Int)], String, A, LL, ADTc, ADT0]
  val benchmarkSampleData: Data = ADT(
    Vector((1, 2), (3, 4), (4, 5), (6, 7), (8, 9), (10, 11), (12, 13)),
    """
        |I am cow, hear me moo
        |I weigh twice as much as you
        |And I look good on the barbecueeeee
      """.stripMargin,
    C("lol i am a noob", "haha you are a noob"): A,
    Node(-11, Node(-22, Node(-33, Node(-44, End)))): LL,
    ADTc(i = 1234567890, s = "i am a strange loop"),
    ADT0("1234")
  )
}

@BenchmarkMode(Array(Mode.Throughput)) // 测试方法平均执行时间
@OutputTimeUnit(TimeUnit.SECONDS)      // 输出结果的时间粒度为微秒
@State(Scope.Thread)                   // 每个测试线程一个实例
class DefTest {

  import upickle.default._
  import upickle.default.{ReadWriter => RW, macroRW}

  import ADTs.ADT0
  import Defaults._
  import Generic.ADT
  import Hierarchy._
  import Recursive._
  type Data = ADT[Seq[(Int, Int)], String, A, LL, ADTc, ADT0]

  import io.circe._
  import io.circe.generic.semiauto._

  val rawCirceEncoder = {
    lazy val _w1: Encoder[Data]              = deriveEncoder
    implicit lazy val _w2: Encoder[A]        = deriveEncoder
    implicit lazy val _w3: Encoder[B]        = deriveEncoder
    implicit lazy val _w4: Encoder[C]        = deriveEncoder
    implicit lazy val _w5: Encoder[LL]       = deriveEncoder
    implicit lazy val _w6: Encoder[Node]     = deriveEncoder
    implicit lazy val _w7: Encoder[End.type] = deriveEncoder
    implicit lazy val _w8: Encoder[ADTc]     = deriveEncoder
    implicit lazy val _w9: Encoder[ADT0]     = deriveEncoder

    _w1
  }

  val upickleRW = {
    implicit lazy val _w1: RW[Data]     = macroRW
    implicit lazy val _w2: RW[A]        = macroRW
    implicit lazy val _w3: RW[B]        = macroRW
    implicit lazy val _w4: RW[C]        = macroRW
    implicit lazy val _w5: RW[LL]       = macroRW
    implicit lazy val _w6: RW[Node]     = macroRW
    implicit lazy val _w7: RW[End.type] = macroRW
    implicit lazy val _w8: RW[ADTc]     = macroRW
    implicit lazy val _w9: RW[ADT0]     = macroRW

    _w1
  }

  val a3 = {
    import asuna.test.circe.EncoderCircePoly._
    lazy val _w1: Encoder.AsObject[Data]          = AsunaCirceEncoder.encoder
    implicit lazy val _w2: Encoder[A]             = AsunaSealedEncoder.encoder
    implicit lazy val _w3: Encoder.AsObject[B]    = AsunaCirceEncoder.encoder
    implicit lazy val _w4: Encoder.AsObject[C]    = AsunaCirceEncoder.encoder
    implicit lazy val _w5: Encoder[LL]            = AsunaSealedEncoder.encoder
    implicit lazy val _w6: Encoder.AsObject[Node] = AsunaCirceEncoder.encoder
    implicit lazy val _w7: Encoder[End.type]      = AsunaCirceEncoder.caseObjectEncoder
    implicit lazy val _w8: Encoder.AsObject[ADTc] = AsunaCirceEncoder.encoder
    implicit lazy val _w9: Encoder.AsObject[ADT0] = AsunaCirceEncoder.encoder

    _w1
  }

  @Benchmark
  def upickleTest = {
    write(Aa.benchmarkSampleData)(upickleRW)
  }

  @Benchmark
  def asunaCirceTest = {
    a3(Aa.benchmarkSampleData).noSpaces
  }

  @Benchmark
  def rawCirceTest = {
    rawCirceEncoder(Aa.benchmarkSampleData).noSpaces
  }

  @TearDown
  def after = {
    val asunaCirceStr = a3(Aa.benchmarkSampleData).noSpaces
    val rawCirceStr   = rawCirceEncoder(Aa.benchmarkSampleData).noSpaces
    val upickleStr    = write(Aa.benchmarkSampleData)(upickleRW)
    println(s"asuna 结果: ${asunaCirceStr}")
    println(s"circe 结果: ${rawCirceStr}")
    println(s"upickle 结果: ${upickleStr}")
    println(asunaCirceStr == rawCirceStr)
    println(asunaCirceStr == upickleStr)
  }

}
