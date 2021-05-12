package zsg.testkit.tuple.reverse

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object ReverseTupleToStringTest extends DefaultRunnableSpec {

  import ReverseAppendTuple._

  override def spec = suite("Tuple Mapper")(test("auto map to string") {
    val assert1 = assert(reverseTuple.asString(ReverseTupleData.i10))(equalTo("[" + ReverseTupleData.b10.toString + "]"))
    val assert2 = assert(reverseTuple.asString(ReverseTupleData.i11))(equalTo("[" + ReverseTupleData.b11.toString + "]"))
    val assert3 = assert(reverseTuple.asString(ReverseTupleData.i12))(equalTo("[" + ReverseTupleData.b12.toString + "]"))
    val assert4 = assert(reverseTuple.asString(ReverseTupleData.i13))(equalTo("[" + ReverseTupleData.b13.toString + "]"))
    assert1 && assert2 && assert3 && assert4
  })

}
