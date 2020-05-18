package zsg.testkit.circe.encoder

import zsg.{NodeTuple2, ZsgTuple1, ZsgTuple2}
import zsg.macros.multiply.{AsunaMultiplyGeneric, AsunaMultiplyRepGeneric, RootTable}

import scala.annotation.meta.getter

trait CirceGeneric {

  class CirceGenericApply1[Table, Model] {

    def encoder[II](table: Table)(
      implicit i: AsunaMultiplyGeneric.Aux[Table, Model, II],
      m: AsunaMultiplyRepGeneric[Table, Model, NodeTuple2[ZsgTuple2[String, List[String]], ZsgTuple1[Long]]]
    ): NodeTuple2[ZsgTuple2[String, List[String]], ZsgTuple1[Long]] = m.rep(table)
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
  @(RootTable @getter)
  val mmmab = mmm
}

trait iii {
  @(RootTable @getter)
  val obj: Abc.type
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
        .i2
        .i1
    )
  }
}
