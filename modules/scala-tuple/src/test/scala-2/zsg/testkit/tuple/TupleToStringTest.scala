package zsg.testkit.tuple

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object TupleToStringTest extends DefaultRunnableSpec {

  import AppendTuple._
  import zsg.scala.tuple.TupleHelper._

  override def spec = suite("Tuple Mapper 2")(
    test("auto map to string 1") {
      val assert1  = assert(tuple.asString(TupleData.i10))(equalTo(tuple.commonAsString(TupleData.i10)))
      val assert2  = assert(tuple.asString(TupleData.i11))(equalTo(tuple.commonAsString(TupleData.i11)))
      val assert3  = assert(tuple.asString(TupleData.i12))(equalTo(tuple.commonAsString(TupleData.i12)))
      val assert4  = assert(tuple.asString(TupleData.i13))(equalTo(tuple.commonAsString(TupleData.i13)))
      val assert5  = assert(tuple.asString(TupleData.i14))(equalTo(tuple.commonAsString(TupleData.i14)))
      val assert6  = assert(tuple.asString(TupleData.i15))(equalTo(tuple.commonAsString(TupleData.i15)))
      val assert7  = assert(tuple.asString(TupleData.i16))(equalTo(tuple.commonAsString(TupleData.i16)))
      val assert8  = assert(tuple.asString(TupleData.i17))(equalTo(tuple.commonAsString(TupleData.i17)))
      val assert9  = assert(tuple.asString(TupleData.i18))(equalTo(tuple.commonAsString(TupleData.i18)))
      val assert10 = assert(tuple.asString(TupleData.i19))(equalTo(tuple.commonAsString(TupleData.i19)))
      val assert11 = assert(tuple.asString(TupleData.i20))(equalTo(tuple.commonAsString(TupleData.i20)))
      val assert12 = assert(tuple.asString(TupleData.i21))(equalTo(tuple.commonAsString(TupleData.i21)))
      val assert13 = assert(tuple.asString(TupleData.i22))(equalTo(tuple.commonAsString(TupleData.i22)))
      assert1 && assert2 && assert3 && assert4 && assert5 && assert6 && assert7 && assert8 && assert9 && assert10 && assert11 && assert12 && assert13
    },
    test("auto map to string 2") {
      val assert1 = assert(
        tuple.gen[(String, String, Int, Int, Long, String, String, String, Int, Int)].fromString(tuple.commonAsString1(TupleData.i10))
      )(equalTo(TupleData.i10))
      val assert2 = assert(
        tuple.gen[(String, String, Int, Int, Long, String, String, String, Int, Int, Int)].fromString(tuple.commonAsString1(TupleData.i11))
      )(equalTo(TupleData.i11))
      val assert3 =
        assert(
          tuple
            .gen[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int)]
            .fromString(tuple.commonAsString1(TupleData.i12))
        )(equalTo(TupleData.i12))
      val assert4 =
        assert(
          tuple
            .gen[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int)]
            .fromString(tuple.commonAsString1(TupleData.i13))
        )(equalTo(TupleData.i13))
      val assert5 = assert(
        tuple
          .gen[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int, (Int, Int))]
          .fromString(
            tuple.commonAsString1(TupleData.i14)
          )
      )(equalTo(TupleData.i14))
      val assert6 =
        assert(
          tuple
            .gen[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int, (Int, Int, String), Int)]
            .fromString(tuple.commonAsString1(TupleData.i15))
        )(equalTo(TupleData.i15))
      val assert7 =
        assert(
          tuple
            .gen[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, (Int, Int, String, String), Int, Int, Int)]
            .fromString(tuple.commonAsString1(TupleData.i16))
        )(equalTo(TupleData.i16))
      assert1 && assert2 && assert3 && assert4 && assert5 && assert6 && assert7
    }
  )

}
