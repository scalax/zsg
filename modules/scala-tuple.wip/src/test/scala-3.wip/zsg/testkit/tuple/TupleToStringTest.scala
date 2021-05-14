package zsg.testkit.tuple

/*import org.junit.Test
import org.junit.Assert._

class TupleToStringTest {

  import AppendTuple.{given _}
  import zsg.scala_tuple.ScalaTupleImplicits.{given _}

  @Test def test1: Unit = {
    assertEquals(tuple.asString(TupleData.i10), "[" + TupleData.i10.toString + "]")
    assertEquals(tuple.asString(TupleData.i11), "[" + TupleData.i11.toString + "]")
    assertEquals(tuple.asString(TupleData.i12), "[" + TupleData.i12.toString + "]")
    assertEquals(tuple.asString(TupleData.i13), "[" + TupleData.i13.toString + "]")
  }

  @Test def test2: Unit = {
    assertEquals(tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int)](TupleData.i10.toString()), TupleData.i10)
    assertEquals(tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int)](TupleData.i11.toString()), TupleData.i11)
    assertEquals(tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int)](TupleData.i12.toString()), TupleData.i12)
    assertEquals(tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int)](TupleData.i13.toString()), TupleData.i13)
    assertEquals(tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int, (Int, Int))](TupleData.i14.toString()), TupleData.i14)
    assertEquals(
      tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int, (Int, Int, String), Int)](TupleData.i15.toString()),
      TupleData.i15
    )
  }

}*/

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object TupleToStringTest extends DefaultRunnableSpec {

  import AppendTuple.given
  import zsg.scala_tuple.ScalaTupleImplicits.given

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
      val assert1 = assert(tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int)](TupleData.i10.toString()))(equalTo(TupleData.i10))
      val assert2 = assert(tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int)](TupleData.i11.toString()))(equalTo(TupleData.i11))
      val assert3 =
        assert(tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int)](TupleData.i12.toString()))(equalTo(TupleData.i12))
      val assert4 =
        assert(tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int)](TupleData.i13.toString()))(equalTo(TupleData.i13))
      val assert5 = assert(tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int, (Int, Int))](TupleData.i14.toString()))(
        equalTo(TupleData.i14)
      )
      val assert6 =
        assert(tuple.fromString[(String, String, Int, Int, Long, String, String, String, Int, Int, Int, Int, Int, (Int, Int, String), Int)](TupleData.i15.toString()))(
          equalTo(
            TupleData.i15
          )
        )
      assert1 && assert2 && assert3 && assert4 && assert5 && assert6
    }
  )

}

