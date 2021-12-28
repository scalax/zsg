package zsg.macros.rep_encoder_test

import zsg.{Application, Context, Plus, PropertyTag, TypeAlias, TypeFunction, TypeHList}
import zsg.macros.multiply.{RootTable, ZsgMultiplyGeneric, ZsgMultiplyRepGeneric}

import scala.annotation.meta.getter

object MutiplyClassGenericPrepareTest {

  class GetterType extends TypeFunction {
    override type H[T <: TypeHList] = Getter[T#Head]
  }
  object GetterType {
    implicit def implicit1[I]: Application[GetterType, PropertyTag[I], TypeAlias.TypeHList1[I]] =
      new Application[GetterType, PropertyTag[I], TypeAlias.TypeHList1[I]] {
        override def application(context: Context[GetterType]): Getter[I] = new Getter[I]
      }
  }

  object GetterContext extends Context[GetterType] {
    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: Getter[X#Head], y: Getter[Y#Head])(
      plus: Plus[X, Y, Z]
    ): Getter[Z#Head] = new Getter[Z#Head]
  }

  class CirceGenericApply2[Model] {
    def encoder[Table, II, M <: TypeHList](table: Table)(implicit
      i: ZsgMultiplyGeneric.Aux[Table, Model, II],
      p: Application[GetterType, II, M],
      m: ZsgMultiplyRepGeneric[Table, Model, M#Head]
    ): M#Head = m.rep(table)
  }

  class Getter[Model]

  def link[Model]: CirceGenericApply2[Model] = new CirceGenericApply2[Model]

  case class InstanceModel(ab: Long, cd: String, ef: Long)

  object mmm {
    val ef: Long = 123456789
  }
  object Abc {
    val ab: Int          = 1
    val cd: List[String] = List("1234")
    @RootTable
    val mmmab = mmm
  }
  trait iii {
    val obj: Abc.type
    val ab: String = "p"
  }
  object model extends iii {
    @RootTable
    override val obj        = Abc
    override val ab: String = "override p"
  }

}
