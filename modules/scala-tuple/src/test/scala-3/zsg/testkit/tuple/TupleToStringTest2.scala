package zsg.testkit.tuple

import zio.Console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object TupleToStringTest2 extends DefaultRunnableSpec {

  import AppendTuple.given
  import zsg.scala.tuple.TupleHelper.given

  override def spec = suite("Tuple Mapper 2")(
    test("auto map to string 2") {
      val assert11 = assert(tuple.asString(TupleData.i20))(equalTo(tuple.commonAsString(TupleData.i20)))
      val assert12 = assert(tuple.asString(TupleData.i21))(equalTo(tuple.commonAsString(TupleData.i21)))
      val assert13 = assert(tuple.asString(TupleData.i22))(equalTo(tuple.commonAsString(TupleData.i22)))
      val assert14 = assert(tuple.asString(Scala3TupleData.i27))(equalTo(tuple.commonAsString(Scala3TupleData.i27)))
      assert11 && assert12 && assert13
    }
  )

}
