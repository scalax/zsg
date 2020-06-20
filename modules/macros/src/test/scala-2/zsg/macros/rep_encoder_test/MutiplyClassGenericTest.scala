package zsg.macros.rep_encoder_test

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import zsg.{Application2, PropertyTag}
import zsg.macros.multiply.{RootTable, ZsgMultiplyGeneric, ZsgMultiplyRepGeneric}

import scala.annotation.meta.getter

class MutiplyClassGenericTest extends AnyFunSpec with Matchers {

  class CirceGenericApply1[Table, Model] {
    def encoder[II, M](table: Table)(
      implicit i: ZsgMultiplyGeneric.Aux[Table, Model, II],
      p: Application2[Getter, II, M],
      m: ZsgMultiplyRepGeneric[Table, Model, M]
    ): M = m.rep(table)
  }

  class Getter[Tag, Model]

  object Getter {
    implicit def implicit1[I]: Getter[PropertyTag[I], I] = new Getter[PropertyTag[I], I]
  }

  def link[Table, Model]: CirceGenericApply1[Table, Model] = new CirceGenericApply1[Table, Model]

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

  val linkModel = link[iii, K].encoder(model)

  describe("Rep Mapper") {
    it("should map mutiply class") {
      linkModel.i2.i1: Long
      linkModel.i1.i1: String
      linkModel.i1.i2: List[String]

      linkModel.i2.i1 shouldBe mmm.ef
      linkModel.i1.i1 shouldBe model.ab
      linkModel.i1.i2 shouldBe model.obj.cd

      linkModel.i1.i1 should not be model.obj.ab
    }
  }

}
