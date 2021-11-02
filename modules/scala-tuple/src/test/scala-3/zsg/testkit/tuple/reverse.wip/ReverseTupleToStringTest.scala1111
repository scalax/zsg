package zsg.testkit.tuple.reverse

/*import org.junit.Test
import org.junit.Assert._

class ReverseTupleToStringTest {

  import ReverseAppendTuple.{given _}
  import zsg.scala_tuple.ScalaTupleImplicits.{given _}

  @Test def test1: Unit = {
    assertEquals(reverseTuple.asString(ReverseTupleData.i10), "[" + ReverseTupleData.b10.toString + "]")
    assertEquals(reverseTuple.asString(ReverseTupleData.i11), "[" + ReverseTupleData.b11.toString + "]")
    assertEquals(reverseTuple.asString(ReverseTupleData.i12), "[" + ReverseTupleData.b12.toString + "]")
    assertEquals(reverseTuple.asString(ReverseTupleData.i13), "[" + ReverseTupleData.b13.toString + "]")
  }

}*/

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object ReverseTupleToStringTest extends DefaultRunnableSpec {

  import ReverseAppendTuple.given
  import zsg.scala_tuple.ScalaTupleImplicits.given

  override def spec = suite("Tuple Mapper")(test("auto map to string") {
    val assert1 = assert(reverseTuple.asString(ReverseTupleData.i10))(equalTo("[" + ReverseTupleData.b10.toString + "]"))
    val assert2 = assert(reverseTuple.asString(ReverseTupleData.i11))(equalTo("[" + ReverseTupleData.b11.toString + "]"))
    val assert3 = assert(reverseTuple.asString(ReverseTupleData.i12))(equalTo("[" + ReverseTupleData.b12.toString + "]"))
    val assert4 = assert(reverseTuple.asString(ReverseTupleData.i13))(equalTo("[" + ReverseTupleData.b13.toString + "]"))
    assert1 && assert2 && assert3 && assert4
  })

}

