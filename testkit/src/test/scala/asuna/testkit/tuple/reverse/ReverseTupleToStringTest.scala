package asuna.testkit.tuple.reverse

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class ReverseTupleToStringTest extends AnyFunSpec with Matchers {

  import ReverseAppendTuple._

  describe("A reverse tuple") {
    it("should generic to a encoder") {

      tuple.asString(ReverseTupleData.i11) shouldBe "[" + ReverseTupleData.b11.toString + "]"
      tuple.asString(ReverseTupleData.i12) shouldBe "[" + ReverseTupleData.b12.toString + "]"
      tuple.asString(ReverseTupleData.i13) shouldBe "[" + ReverseTupleData.b13.toString + "]"
      tuple.asString(ReverseTupleData.i14) shouldBe "[" + ReverseTupleData.b14.toString + "]"
      tuple.asString(ReverseTupleData.i15) shouldBe "[" + ReverseTupleData.b15.toString + "]"
      tuple.asString(ReverseTupleData.i16) shouldBe "[" + ReverseTupleData.b16.toString + "]"
      tuple.asString(ReverseTupleData.i17) shouldBe "[" + ReverseTupleData.b17.toString + "]"
      tuple.asString(ReverseTupleData.i18) shouldBe "[" + ReverseTupleData.b18.toString + "]"
      tuple.asString(ReverseTupleData.i19) shouldBe "[" + ReverseTupleData.b19.toString + "]"
      tuple.asString(ReverseTupleData.i20) shouldBe "[" + ReverseTupleData.b20.toString + "]"
      tuple.asString(ReverseTupleData.i21) shouldBe "[" + ReverseTupleData.b21.toString + "]"
      tuple.asString(ReverseTupleData.i22) shouldBe "[" + ReverseTupleData.b22.toString + "]"

    }
  }

}
