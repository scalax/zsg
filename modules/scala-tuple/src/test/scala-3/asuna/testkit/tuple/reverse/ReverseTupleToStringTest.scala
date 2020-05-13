package asuna.testkit.tuple.reverse

import org.junit.Test
import org.junit.Assert._

class ReverseTupleToStringTest {

  import ReverseAppendTuple.{given _}
  import asuna.scala_tuple.ScalaTupleImplicits.{given _}

  @Test def test1: Unit = {
    assertEquals(reverseTuple.asString(ReverseTupleData.i10), "[" + ReverseTupleData.b10.toString + "]")
    assertEquals(reverseTuple.asString(ReverseTupleData.i11), "[" + ReverseTupleData.b11.toString + "]")
    assertEquals(reverseTuple.asString(ReverseTupleData.i12), "[" + ReverseTupleData.b12.toString + "]")
    assertEquals(reverseTuple.asString(ReverseTupleData.i13), "[" + ReverseTupleData.b13.toString + "]")
    //reverseTuple.asString(ReverseTupleData.i14) shouldBe "[" + ReverseTupleData.b14.toString + "]"
    //reverseTuple.asString(ReverseTupleData.i15) shouldBe "[" + ReverseTupleData.b15.toString + "]"

  }

}
