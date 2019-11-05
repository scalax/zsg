package asuna

import asuna.support.heterogeneous._

trait TypeHList {
  type H
  type T <: TypeHList
}

final class TypeHNil extends TypeHList {
  override final type H = NoData
  override final type T = TypeHNil
}
