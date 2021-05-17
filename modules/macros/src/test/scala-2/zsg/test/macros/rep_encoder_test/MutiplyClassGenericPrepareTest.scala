package zsg.macros.rep_encoder_test

import zsg.{Application2, Context2, Plus2, PropertyTag}
import zsg.macros.multiply.{RootTable, ZsgMultiplyGeneric, ZsgMultiplyRepGeneric}

import scala.annotation.meta.getter

object MutiplyClassGenericPrepareTest {

  class GetterContext extends Context2[Getter] {
    override def append[X1, X2, Y1, Y2, Z1, Z2](x: Getter[X1, X2], y: Getter[Y1, Y2])(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): Getter[Z1, Z2] =
      new Getter[Z1, Z2]
  }

  object GetterContext {
    val value: GetterContext = new GetterContext
  }

  class CirceGenericApply2[Model] {
    def encoder[Table, II, M](table: Table)(implicit
      i: ZsgMultiplyGeneric.Aux[Table, Model, II],
      p: Application2[Getter, GetterContext, II, M],
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

}
