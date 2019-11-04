package asuna

import asuna.support.heterogeneous.HList

final class AnyTypeHList extends TypeHList {
  override final type H = Any
  override final type T = AnyTypeHList
}

final class AnyHListTypeHList extends TypeHList {
  override final type H = HList
  override final type T = AnyHListTypeHList
}
