package org.scalax.asuna.circe.encoder.test

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._
import upickle.default.{ReadWriter => RW}
import asuna.testkit.circe.ACirce
import io.circe.Encoder

@BenchmarkMode(Array(Mode.Throughput)) // 测试方法平均执行时间
@OutputTimeUnit(TimeUnit.SECONDS)      // 输出结果的时间粒度为微秒
@State(Scope.Thread)                   // 每个测试线程一个实例
class Test01 {

  implicit def rw1: RW[Bar] = {
    import upickle.default.macroRW
    implicit def rw2: RW[Foo] = macroRW
    macroRW
  }

  def rawCirceEncoder: Encoder.AsObject[Bar] = {
    import io.circe.generic.semiauto._
    implicit def a1: Encoder.AsObject[Foo] = deriveEncoder
    deriveEncoder
  }

  def asunaEncoder: Encoder.AsObject[Bar] = {
    implicit def a1: Encoder.AsObject[Foo] = ACirce.encodeCaseClass
    ACirce.encodeCaseClass
  }

  val model: Bar = Model.bar

  @Benchmark
  def upickleTest = {
    import upickle.default._
    write(model)
  }

  @Benchmark
  def asunaCirceTest = {
    asunaEncoder(model).noSpaces
  }

  @Benchmark
  def rawCirceTest = {
    rawCirceEncoder(model).noSpaces
  }

}
