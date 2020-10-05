package zsg.macros.rep_encoder_test

import zsg.{ApplicationX2, Context2, Plus2, PropertyTag, ZsgTuple0}
import zsg.macros.multiply.{RootTable, ZsgMultiplyGeneric, ZsgMultiplyRepGeneric}

import zio._
import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

import scala.annotation.meta.getter

object MutiplyClassGenericTest extends DefaultRunnableSpec {

  class GetterContext extends Context2[Getter] {
    override def append[X1, X2, Y1, Y2, Z1, Z2](x: Getter[X1, X2], y: Getter[Y1, Y2])(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): Getter[Z1, Z2] = new Getter[Z1, Z2]
    override val start: Getter[ZsgTuple0, ZsgTuple0]                                                                                    = new Getter[ZsgTuple0, ZsgTuple0]
  }

  object GetterContext {
    val value: GetterContext = new GetterContext
  }

  class CirceGenericApply2[Model] {
    def encoder[Table, II, M](table: Table)(implicit
      i: ZsgMultiplyGeneric.Aux[Table, Model, II],
      p: ApplicationX2[Getter, GetterContext, II, M],
      m: ZsgMultiplyRepGeneric[Table, Model, M]
    ): M = m.rep(table)
  }

  class Getter[Tag, Model]

  object Getter {
    implicit def implicit1[I]: Getter[PropertyTag[I], I] = new Getter[PropertyTag[I], I]
  }

  def link[Model]: CirceGenericApply2[Model] = new CirceGenericApply2[Model]

  case class InstanceModel(ab: Long, cd: String, ef: Long)

  object mmm {
    val ef: Long = 123456789
  }
  object Abc {
    val ab: Int          = 1
    val cd: List[String] = List("1234")
    @(RootTable @getter)
    val mmmab = mmm
  }
  trait iii {
    val obj: Abc.type
    val ab: String = "p"
  }
  object model extends iii {
    @(RootTable @getter)
    override val obj        = Abc
    override val ab: String = "override p"
  }

  def spec = suite("Rep Mapper")(
    zio.test.test("should map mutiply class") {
      val linkModel = link[InstanceModel].encoder(model)

      linkModel.i3: Long
      linkModel.i1: String
      linkModel.i2: List[String]

      val assert1 = assert(linkModel.i3)(equalTo(mmm.ef))
      val assert2 = assert(linkModel.i3)(equalTo(model.obj.mmmab.ef))
      val assert3 = assert(linkModel.i1)(equalTo(model.ab))
      val assert4 = assert(linkModel.i2)(equalTo(model.obj.cd))
      val assert5 = !assert(linkModel.i1: Any)(equalTo(model.obj.ab: Any))
      assert1 && assert2 && assert3 && assert4 && assert5
    }
  )

}
