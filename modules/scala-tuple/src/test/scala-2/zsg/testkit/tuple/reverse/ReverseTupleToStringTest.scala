package zsg.testkit.tuple.reverse

import org.junit.Test
import org.junit.Assert._

class ReverseTupleToStringTest {

  import ReverseAppendTuple._
  import zsg.scala_tuple.ScalaTupleImplicits._

  @Test def test1: Unit = {
    assertEquals(reverseTuple.asString(ReverseTupleData.i10), "[" + ReverseTupleData.b10.toString + "]")
    assertEquals(reverseTuple.asString(ReverseTupleData.i11), "[" + ReverseTupleData.b11.toString + "]")
    assertEquals(reverseTuple.asString(ReverseTupleData.i12), "[" + ReverseTupleData.b12.toString + "]")
    assertEquals(reverseTuple.asString(ReverseTupleData.i13), "[" + ReverseTupleData.b13.toString + "]")
  }

}
