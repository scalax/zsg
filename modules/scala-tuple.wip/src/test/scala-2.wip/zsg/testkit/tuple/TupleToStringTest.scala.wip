package zsg.testkit.tuple

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object TupleToStringTest extends DefaultRunnableSpec {

  import AppendTuple._
  import zsg.scala_tuple.ScalaTupleImplicits._

  override def spec = suite("Tuple Mapper 2")(
    test("auto map to string 1") {
      val assert1 = assert(tuple.asString(TupleData.i10))(equalTo("[" + TupleData.i10.toString + "]"))
      val assert2 = assert(tuple.asString(TupleData.i11))(equalTo("[" + TupleData.i11.toString + "]"))
      val assert3 = assert(tuple.asString(TupleData.i12))(equalTo("[" + TupleData.i12.toString + "]"))
      val assert4 = assert(tuple.asString(TupleData.i13))(equalTo("[" + TupleData.i13.toString + "]"))
      //tuple.asString(TupleData.i14) shouldBe "[" + TupleData.i14.toString + "]"
      //tuple.asString(TupleData.i15) shouldBe "[" + TupleData.i15.toString + "]"
      assert1 && assert2 && assert3 && assert4
    },
    test("auto map to string 2") {
      val assert1 = assert(tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int)](TupleData.i10.toString()))(
        equalTo(TupleData.i10)
      )
      val assert2 = assert(
        tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int)](TupleData.i11.toString())
      )(equalTo(TupleData.i11))
      val assert3 =
        assert(tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int)](TupleData.i12.toString()))(
          equalTo(TupleData.i12)
        )
      val assert4 =
        assert(
          tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int)](TupleData.i13.toString())
        )(equalTo(TupleData.i13))
      val assert5 = assert(
        tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int, (Int, Int))](
          TupleData.i14.toString()
        )
      )(
        equalTo(TupleData.i14)
      )
      val assert6 =
        assert(
          tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int, (Int, Int, String), Int)](
            TupleData.i15.toString()
          )
        )(
          equalTo(
            TupleData.i15
          )
        )
      assert1 && assert2 && assert3 && assert4 && assert5 && assert6
    }
  )

}
