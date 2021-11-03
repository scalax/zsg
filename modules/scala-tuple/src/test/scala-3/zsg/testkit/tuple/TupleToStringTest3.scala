package zsg.testkit.tuple

import zio.Console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object TupleToStringTest3 extends DefaultRunnableSpec {

  import AppendTuple.given
  import zsg.scala.tuple.TupleHelper.given

  override def spec = suite("Tuple Mapper 2")(
    test("auto map to string 3") {
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
