package asuna.testkit.circe.encoder

import asuna.{AsunaTuple2, AsunaTuple3, TupleTag}
import asuna.macros.multiply.{AsunaMultiplyGeneric, AsunaMultiplyRepGeneric, RootTable}

trait CirceGeneric {

  class CirceGenericApply1[Table, Model] {
    def encoder[II <: TupleTag](table: Table)(
      implicit i: AsunaMultiplyGeneric.Aux[Table, Model, II],
      m: AsunaMultiplyRepGeneric[Table, Model, AsunaTuple3[String, List[String], Long]]
    ): AsunaTuple3[String, List[String], Long] = m.rep(table)
  }
  def link[Table, Model]: CirceGenericApply1[Table, Model] = new CirceGenericApply1[Table, Model]

}

object CirceGeneric extends CirceGeneric

object mmm {
  val ef: Long = 123456789
}

object Abc {
  val ab: Int          = 1
  val cd: List[String] = List("1234")
  @RootTable val mmmab = mmm
}

trait iii {
  @RootTable val obj: Abc.type
  val ab: String = "miaomiaomiao"
}

case class K(ab: Long, cd: String, ef: Long)

object I {
  def main(i: Array[String]): Unit = {
    println(
      CirceGeneric
        .link[iii, K]
        .encoder(new iii {
          override val obj = Abc
        })
        .i3
    )
  }
}
