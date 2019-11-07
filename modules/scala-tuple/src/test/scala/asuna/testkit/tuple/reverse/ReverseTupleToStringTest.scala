package asuna.testkit.tuple.reverse

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class ReverseTupleToStringTest extends AnyFunSpec with Matchers {

  import ReverseAppendTuple._
  import asuna.ScalaTupleImplicits._

  describe("A reverse tuple") {
    it("should generic to a encoder") {
      reverseTuple.asString(ReverseTupleData.i10) shouldBe "[" + ReverseTupleData.b10.toString + "]"
      reverseTuple.asString(ReverseTupleData.i11) shouldBe "[" + ReverseTupleData.b11.toString + "]"
      reverseTuple.asString(ReverseTupleData.i12) shouldBe "[" + ReverseTupleData.b12.toString + "]"
      reverseTuple.asString(ReverseTupleData.i13) shouldBe "[" + ReverseTupleData.b13.toString + "]"
      //reverseTuple.asString(ReverseTupleData.i14) shouldBe "[" + ReverseTupleData.b14.toString + "]"
      //reverseTuple.asString(ReverseTupleData.i15) shouldBe "[" + ReverseTupleData.b15.toString + "]"

    }
  }

}
