package asuna

import scala.language.higherKinds

trait TypeHList {
  type H
  type T <: TypeHList
}

class AnyTypeHList extends TypeHList {
  override type H = Any
  override type T = AnyTypeHList
}

class NoData

object NoData {
  val value: NoData = new NoData
}

class TypeHNil extends TypeHList {
  override type H = NoData
  override type T = TypeHNil
}
