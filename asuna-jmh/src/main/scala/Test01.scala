package org.scalax.asuna.circe.encoder.test

import java.util.concurrent.TimeUnit

import asuna.test.AsunaCirceEncoder
import io.circe.Encoder
import org.openjdk.jmh.annotations._

@BenchmarkMode(Array(Mode.Throughput)) // 测试方法平均执行时间
@OutputTimeUnit(TimeUnit.SECONDS)      // 输出结果的时间粒度为微秒
@State(Scope.Thread)                   // 每个测试线程一个实例
class AbcTest {

  import upickle.default._
  import upickle.default.{ReadWriter => RW, macroRW}

  implicit  def rw1: RW[Foo] = macroRW
  implicit  def rw2: RW[Bar] = macroRW

  def rawCirceEncoder = {
    import io.circe.generic.semiauto._
    implicit def a1: Encoder[Foo] = deriveEncoder
    deriveEncoder[Bar]
  }

  def a3 = {
    import asuna.test.circe.CircePoly._
    implicit def a1: Encoder.AsObject[Foo] = AsunaCirceEncoder.encoder
    def a2: Encoder.AsObject[Bar]          = AsunaCirceEncoder.encoder
    a2
  }

  val model: Bar = Model.bar

  @Benchmark
  def upickleTest = {
    write(model)
  }

  @Benchmark
  def asunaCirceTest = {
    a3(model).noSpaces
  }

  @Benchmark
  def rawCirceTest = {
    rawCirceEncoder(model).noSpaces
  }

}
