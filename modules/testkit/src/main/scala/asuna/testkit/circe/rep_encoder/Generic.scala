package asuna.testkit.circe.encoder

import asuna.{AsunaTuple2, TupleTag}
import asuna.macros.multiply.{AsunaMultiplyGeneric, AsunaMultiplyRepGeneric}

trait CirceGeneric {

  class CirceGenericApply1[Table, Model] {
    def encoder[II <: TupleTag](table: Table)(
      implicit i: AsunaMultiplyGeneric.Aux[Table, Model, II],
      m: AsunaMultiplyRepGeneric[Table, Model, AsunaTuple2[Int, List[String]]]
    ): AsunaTuple2[Int, List[String]] = m.rep(table)
  }
  def link[Table, Model]: CirceGenericApply1[Table, Model] = new CirceGenericApply1[Table, Model]

}

object CirceGeneric extends CirceGeneric

object Abc {
  val ab: Int          = 1
  val cd: List[String] = List.empty
}

case class K(ab: Long, cd: String)

object I {
  def main(i: Array[String]): Unit = {
    println(CirceGeneric.link[Abc.type, K].encoder(Abc).i1)
  }
}
