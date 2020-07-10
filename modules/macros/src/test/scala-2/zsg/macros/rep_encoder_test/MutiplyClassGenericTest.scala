package zsg.macros.rep_encoder_test

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import zsg.{ApplicationX2, Context2, Plus2, PropertyTag, ZsgTuple0}
import zsg.macros.multiply.{RootTable, ZsgMultiplyGeneric, ZsgMultiplyRepGeneric}

import scala.annotation.meta.getter

class MutiplyClassGenericTest extends AnyFunSpec with Matchers {

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
    @(RootTable @getter)
    val obj: Abc.type
    val ab: String = "p"
  }

  case class K(ab: Long, cd: String, ef: Long)

  object model extends iii {
    override val obj = Abc
  }

  val linkModel = link[K].encoder(model: iii)

  describe("Rep Mapper") {
    it("should map mutiply class") {
      linkModel.i3: Long
      linkModel.i1: String
      linkModel.i2: List[String]

      linkModel.i3 shouldBe mmm.ef
      linkModel.i1 shouldBe model.ab
      linkModel.i2 shouldBe model.obj.cd

      linkModel.i1 should not be model.obj.ab
    }
  }

}
