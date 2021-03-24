package zsg

import zsg.macros.single.{ColumnName, GenericColumnName, ZsgLabelledTypeGeneric}

case class TestModel(i1: String, iassfasf2: Int, i3: String)

object TestModel extends App {
  class bb[T] {
    def model[M](implicit modelgeneric: ZsgLabelledTypeGeneric.Aux[T, M]): M = modelgeneric.tag
  }
  def cc[T](n: ColumnName[T])(implicit nn: GenericColumnName[T]): String = nn.value
  def model[T]: bb[T]                                                    = new bb[T]

  println(cc(model[TestModel].model.i2))
}
