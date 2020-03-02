package asuna.testkit.tuple

import org.junit.Test
import org.junit.Assert._

class TupleToStringTest {

  import AppendTuple.given
  import asuna.scala_tuple.ScalaTupleImplicits.given

  @Test def test1: Unit = {
    assertEquals(tuple.asString(TupleData.i10), "[" + TupleData.i10.toString + "]")
    assertEquals(tuple.asString(TupleData.i11), "[" + TupleData.i11.toString + "]")
    assertEquals(tuple.asString(TupleData.i12), "[" + TupleData.i12.toString + "]")
    assertEquals(tuple.asString(TupleData.i13), "[" + TupleData.i13.toString + "]")
    //tuple.asString(TupleData.i14) shouldBe "[" + TupleData.i14.toString + "]"
    //tuple.asString(TupleData.i15) shouldBe "[" + TupleData.i15.toString + "]"
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

}
