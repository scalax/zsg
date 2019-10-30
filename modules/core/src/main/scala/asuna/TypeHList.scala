package asuna

trait TypeHList {
  type H
  type T <: TypeHList
}

class NoData

object NoData {
  val value: NoData = new NoData
}

class TypeHNil extends TypeHList {
  override type H = NoData
  override type T = TypeHNil
}
