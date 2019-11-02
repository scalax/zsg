package asuna.testkit.tuple

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class TupleToStringTest extends AnyFunSpec with Matchers {

  import AppendTuple._

  describe("A tuple") {
    it("should generic to a encoder") {
      tuple.asString(TupleData.i10) shouldBe "[" + TupleData.i10.toString + "]"
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

    it("should generic to a decoder") {
      tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int)](TupleData.i10.toString()) shouldBe TupleData.i10
      tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int)](TupleData.i11.toString()) shouldBe TupleData.i11
      tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int)](TupleData.i12.toString()) shouldBe TupleData.i12
      tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int)](TupleData.i13.toString()) shouldBe TupleData.i13
      tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int, (Int, Int))](TupleData.i14.toString()) shouldBe TupleData.i14
      tuple
        .fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int, (Int, Int, String), Int)](TupleData.i15.toString()) shouldBe TupleData.i15
      tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, (Int, Int, String, String), Int, Int, Int)](
        TupleData.i16.toString()
      ) shouldBe TupleData.i16
      tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, (Int, Int, String, String, String), Int, Int, Int, String)](
        TupleData.i17.toString()
      ) shouldBe TupleData.i17
      tuple.fromString[
        (String, String, Int, Int, Long, String, String, String, Int, Int, Int, (Int, Int, String, String, String, String), Int, Int, Int, Int, String, String)
      ](TupleData.i18.toString()) shouldBe TupleData.i18
      tuple.fromString[
        (String, String, Int, Int, Long, String, String, String, Int, (Int, Int, String, String, String, String, Int), Int, Int, Int, Int, Int, Int, String, String, Int)
      ](TupleData.i19.toString()) shouldBe TupleData.i19
      tuple.fromString[
        (
          String,
          String,
          Int,
          Int,
          Long,
          String,
          String,
          String,
          Int,
          Int,
          Int,
          (Int, Int, String, String, String, String, Int, Long),
          Int,
          Int,
          Int,
          Int,
          String,
          String,
          Int,
          Int
        )
      ](TupleData.i20.toString()) shouldBe TupleData.i20
      tuple.fromString[
        (
          String,
          String,
          Int,
          Int,
          Long,
          String,
          String,
          String,
          Int,
          Int,
          Int,
          Int,
          Int,
          (
            Int,
            Int,
            String,
            String,
            String,
            String,
            Int,
            (String, (String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, (Int, Int, String, String, String), Int, Int, Int, String)),
            Int
          ),
          Int,
          Int,
          String,
          String,
          Int,
          Int,
          Long
        )
      ](TupleData.i21.toString()) shouldBe TupleData.i21
      tuple.fromString[
        (
          String,
          String,
          Int,
          Int,
          Long,
          String,
          String,
          String,
          Int,
          Int,
          Int,
          Int,
          Int,
          (Int, Int, String, String, String, String, Int, Int, Int, Long),
          Int,
          Int,
          String,
          String,
          Int,
          Int,
          Long,
          Int
        )
      ](TupleData.i22.toString()) shouldBe TupleData.i22
    }
  }

}
