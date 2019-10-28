package asuna.testkit.tupleTest

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class TupleToStringTest extends AnyFunSpec with Matchers {

  import AppendTuple._

  describe("A tuple") {
    it("should generic to a encoder") {
      tuple.asString(TupleData.i11) shouldBe "[" + TupleData.i11.toString + "]"
      tuple.asString(TupleData.i12) shouldBe "[" + TupleData.i12.toString + "]"
      tuple.asString(TupleData.i13) shouldBe "[" + TupleData.i13.toString + "]"
      tuple.asString(TupleData.i14) shouldBe "[" + TupleData.i14.toString + "]"
      tuple.asString(TupleData.i15) shouldBe "[" + TupleData.i15.toString + "]"
      tuple.asString(TupleData.i16) shouldBe "[" + TupleData.i16.toString + "]"
      tuple.asString(TupleData.i17) shouldBe "[" + TupleData.i17.toString + "]"
      tuple.asString(TupleData.i18) shouldBe "[" + TupleData.i18.toString + "]"
      tuple.asString(TupleData.i19) shouldBe "[" + TupleData.i19.toString + "]"
      tuple.asString(TupleData.i20) shouldBe "[" + TupleData.i20.toString + "]"
      tuple.asString(TupleData.i21) shouldBe "[" + TupleData.i21.toString + "]"
      tuple.asString(TupleData.i22) shouldBe "[" + TupleData.i22.toString + "]"
    }
  }

}
