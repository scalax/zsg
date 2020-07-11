package zsg.json.encoder.benchmark

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._
import upickle.default.{ReadWriter => RW}
import zsg.testkit.circe.ACirce
import io.circe.Encoder
import zsg.json.model.case_class.{Bar, BenchmarkModel, Foo}

@BenchmarkMode(Array(Mode.Throughput)) // 测试方法平均执行时间
@OutputTimeUnit(TimeUnit.SECONDS)      // 输出结果的时间粒度为微秒
@State(Scope.Thread)                   // 每个测试线程一个实例
class JsonEncoderBenchmark {

  object uPickleRW {
    import upickle.default.macroRW
    implicit val barRW: RW[Bar] = macroRW
    implicit val fooRW: RW[Foo] = macroRW
  }

  object rawCirceEncoder {
    import io.circe.generic.semiauto._
    implicit val barEncoder: Encoder.AsObject[Bar] = deriveEncoder
    implicit val fooEncoder: Encoder.AsObject[Foo] = deriveEncoder
  }

  object zsgEncoder {
    implicit val barEncoder: Encoder.AsObject[Bar] = ACirce.encodeCaseClass
    implicit val fooEncoder: Encoder.AsObject[Foo] = ACirce.encodeCaseClass
  }

  val model: Bar = BenchmarkModel.bar

  @Benchmark
  def uPickleEncode: String = {
    import upickle.default._
    write(model)(uPickleRW.barRW)
  }

  @Benchmark
  def rawCirceEncode: String = {
    rawCirceEncoder.barEncoder(model).noSpaces
  }

  @Benchmark
  def zsgCirceEncode: String = {
    zsgEncoder.barEncoder(model).noSpaces
  }

}
