package zsg.json.encoder.benchmark

import java.util.concurrent.TimeUnit

import zsg.testkit.circe.ACirce
import org.openjdk.jmh.annotations._
import zsg.json.model.adt.ADTBenchmarkModel

@BenchmarkMode(Array(Mode.Throughput)) // 测试方法平均执行时间
@OutputTimeUnit(TimeUnit.SECONDS)      // 输出结果的时间粒度为微秒
@State(Scope.Thread)                   // 每个测试线程一个实例
class JsonADTEncoderBenchmark {

  import upickle.default.{ReadWriter => RW, macroRW}
  import upickle.default._

  import zsg.json.model.adt.ADTs.ADT0
  import zsg.json.model.adt.Defaults._
  import zsg.json.model.adt.Generic.ADT
  import zsg.json.model.adt.Hierarchy._
  import zsg.json.model.adt.Recursive._
  type Data = ADT[Seq[(Int, Int)], String, A, LL, ADTc, ADT0]

  import io.circe._
  import io.circe.generic.semiauto._

  val rawCirceEncoder: Encoder[Data] = {
    implicit lazy val _w2: Encoder[A]        = deriveEncoder
    implicit lazy val _w3: Encoder[B]        = deriveEncoder
    implicit lazy val _w4: Encoder[C]        = deriveEncoder
    implicit lazy val _w5: Encoder[LL]       = deriveEncoder
    implicit lazy val _w6: Encoder[Node]     = deriveEncoder
    implicit lazy val _w7: Encoder[End.type] = deriveEncoder
    implicit lazy val _w8: Encoder[ADTc]     = deriveEncoder
    implicit lazy val _w9: Encoder[ADT0]     = deriveEncoder

    deriveEncoder
  }

  implicit val upickleRW: RW[Data] = {
    implicit lazy val _w2: RW[A]        = macroRW
    implicit lazy val _w3: RW[B]        = macroRW
    implicit lazy val _w4: RW[C]        = macroRW
    implicit lazy val _w5: RW[LL]       = macroRW
    implicit lazy val _w6: RW[Node]     = macroRW
    implicit lazy val _w7: RW[End.type] = macroRW
    implicit lazy val _w8: RW[ADTc]     = macroRW
    implicit lazy val _w9: RW[ADT0]     = macroRW
    macroRW
  }

  object asunaEncoder {
    implicit val _w2: Encoder[A]        = ACirce.encodeSealed
    implicit val _w3: Encoder[B]        = ACirce.encodeCaseClass
    implicit val _w4: Encoder[C]        = ACirce.encodeCaseClass
    implicit val _w5: Encoder[LL]       = ACirce.encodeSealed
    implicit val _w6: Encoder[Node]     = ACirce.encodeCaseClass
    implicit val _w7: Encoder[End.type] = ACirce.encodeCaseObject
    implicit val _w8: Encoder[ADTc]     = ACirce.encodeCaseClass
    implicit val _w9: Encoder[ADT0]     = ACirce.encodeCaseClass
    implicit val _wData: Encoder[Data]  = ACirce.encodeCaseClass
  }

  @Benchmark
  def upickleTest = {
    import upickle.default._
    write(ADTBenchmarkModel.benchmarkSampleData)
  }

  @Benchmark
  def zsgCirceTest = {
    asunaEncoder._wData(ADTBenchmarkModel.benchmarkSampleData).noSpaces
  }

  @Benchmark
  def vBaseCirceTest = {
    rawCirceEncoder(ADTBenchmarkModel.benchmarkSampleData).noSpaces
  }

  @TearDown
  def after: Unit = {
    val zsgCirceStr = asunaEncoder._wData(ADTBenchmarkModel.benchmarkSampleData).noSpaces
    val rawCirceStr   = rawCirceEncoder(ADTBenchmarkModel.benchmarkSampleData).noSpaces
    val upickleStr    = write(ADTBenchmarkModel.benchmarkSampleData)(upickleRW)
    println(s"zsg 结果: ${zsgCirceStr}")
    println(s"circe 结果: ${rawCirceStr}")
    println(s"upickle 结果: ${upickleStr}")
    println(s"zsgCirceStr == rawCirceStr: ${zsgCirceStr == rawCirceStr}")
    println(s"zsgCirceStr == upickleStr: ${zsgCirceStr == upickleStr}")
  }

}
