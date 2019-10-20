package asuna.testkit

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class TupleToStringTest extends AnyFunSpec with Matchers {

  import tuple._
  import asuna.tuple.ScalaTupleApplicationImplicits._

  describe("A tuple") {
    it("should generic to a encoder") {
      /*println(asString(TupleData.i14))
      println(TupleData.i14)*/
      asString(TupleData.i10) shouldBe "[" + TupleData.i10.toString + "]"
      asString(TupleData.i11) shouldBe "[" + TupleData.i11.toString + "]"
      asString(TupleData.i12) shouldBe "[" + TupleData.i12.toString + "]"
      asString(TupleData.i13) shouldBe "[" + TupleData.i13.toString + "]"
      asString(TupleData.i14) shouldBe "[" + TupleData.i14.toString + "]"
      asString(TupleData.i15) shouldBe "[" + TupleData.i15.toString + "]"
      asString(TupleData.i16) shouldBe "[" + TupleData.i16.toString + "]"
      asString(TupleData.i17) shouldBe "[" + TupleData.i17.toString + "]"
      asString(TupleData.i18) shouldBe "[" + TupleData.i18.toString + "]"
      asString(TupleData.i19) shouldBe "[" + TupleData.i19.toString + "]"
      asString(TupleData.i20) shouldBe "[" + TupleData.i20.toString + "]"
      asString(TupleData.i21) shouldBe "[" + TupleData.i21.toString + "]"
      asString(TupleData.i22) shouldBe "[" + TupleData.i22.toString + "]"
    }
  }

}
