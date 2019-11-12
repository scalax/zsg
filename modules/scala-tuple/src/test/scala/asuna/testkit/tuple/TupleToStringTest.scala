package asuna.testkit.tuple

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class TupleToStringTest extends AnyFunSpec with Matchers {

  import AppendTuple._
  import asuna.scala_tuple.ScalaTupleImplicits._

  describe("A tuple") {
    it("should generic to a encoder") {
      tuple.asString(TupleData.i10) shouldBe "[" + TupleData.i10.toString + "]"
      tuple.asString(TupleData.i11) shouldBe "[" + TupleData.i11.toString + "]"
      tuple.asString(TupleData.i12) shouldBe "[" + TupleData.i12.toString + "]"
      tuple.asString(TupleData.i13) shouldBe "[" + TupleData.i13.toString + "]"
      //tuple.asString(TupleData.i14) shouldBe "[" + TupleData.i14.toString + "]"
      //tuple.asString(TupleData.i15) shouldBe "[" + TupleData.i15.toString + "]"
    }

    it("should generic to a decoder") {
      tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int)](TupleData.i10.toString()) shouldBe TupleData.i10
      tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int)](TupleData.i11.toString()) shouldBe TupleData.i11
      tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int)](TupleData.i12.toString()) shouldBe TupleData.i12
      tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int)](TupleData.i13.toString()) shouldBe TupleData.i13
      tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int, (Int, Int))](TupleData.i14.toString()) shouldBe TupleData.i14
      tuple
        .fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int, (Int, Int, String), Int)](TupleData.i15.toString()) shouldBe TupleData.i15
    }
  }

}
