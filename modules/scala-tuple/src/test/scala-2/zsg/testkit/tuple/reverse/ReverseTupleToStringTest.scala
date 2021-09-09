package zsg.testkit.tuple.reverse

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object ReverseTupleToStringTest extends DefaultRunnableSpec {

  import ReverseAppendTuple._
  import zsg.scala.tuple.TupleHelper._

  override def spec = suite("Tuple Mapper")(test("auto map to string") {
    val assert1  = assert(reverseTuple.asString(ReverseTupleData.i10))(equalTo(reverseTuple.commonAsString(ReverseTupleData.i10)))
    val assert2  = assert(reverseTuple.asString(ReverseTupleData.i11))(equalTo(reverseTuple.commonAsString(ReverseTupleData.i11)))
    val assert3  = assert(reverseTuple.asString(ReverseTupleData.i12))(equalTo(reverseTuple.commonAsString(ReverseTupleData.i12)))
    val assert4  = assert(reverseTuple.asString(ReverseTupleData.i13))(equalTo(reverseTuple.commonAsString(ReverseTupleData.i13)))
    val assert5  = assert(reverseTuple.asString(ReverseTupleData.i14))(equalTo(reverseTuple.commonAsString(ReverseTupleData.i14)))
    val assert6  = assert(reverseTuple.asString(ReverseTupleData.i15))(equalTo(reverseTuple.commonAsString(ReverseTupleData.i15)))
    val assert7  = assert(reverseTuple.asString(ReverseTupleData.i16))(equalTo(reverseTuple.commonAsString(ReverseTupleData.i16)))
    val assert8  = assert(reverseTuple.asString(ReverseTupleData.i17))(equalTo(reverseTuple.commonAsString(ReverseTupleData.i17)))
    val assert9  = assert(reverseTuple.asString(ReverseTupleData.i18))(equalTo(reverseTuple.commonAsString(ReverseTupleData.i18)))
    val assert10 = assert(reverseTuple.asString(ReverseTupleData.i19))(equalTo(reverseTuple.commonAsString(ReverseTupleData.i19)))
    val assert11 = assert(reverseTuple.asString(ReverseTupleData.i20))(equalTo(reverseTuple.commonAsString(ReverseTupleData.i20)))
    val assert12 = assert(reverseTuple.asString(ReverseTupleData.i21))(equalTo(reverseTuple.commonAsString(ReverseTupleData.i21)))
    val assert13 = assert(reverseTuple.asString(ReverseTupleData.i22))(equalTo(reverseTuple.commonAsString(ReverseTupleData.i22)))
    assert1 && assert2 && assert3 && assert4 && assert5 && assert6 && assert7 && assert8 && assert9 && assert10 && assert11 && assert12 && assert13
  })

}
