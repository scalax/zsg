package zsg.testkit.tuple

import zio.Console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object TupleToStringTest1 extends DefaultRunnableSpec {

  import AppendTuple.given
  import zsg.scala.tuple.TupleHelper.given

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
      val assert14 = assert(tuple.asString(Scala3TupleData.i22))(equalTo(tuple.commonAsString(Scala3TupleData.i22)))
      val assert15 = assert(tuple.asString(Scala3TupleData.i27))(equalTo(tuple.commonAsString(Scala3TupleData.i27)))
      assert1 && assert2 && assert3 && assert4 && assert5 && assert6 && assert7 && assert8 && assert9 && assert10 && assert11 && assert12 && assert13
    }
  )

}
