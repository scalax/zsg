package asuna

import asuna.support.heterogeneous.HList

class AnyTypeHList extends TypeHList {
  override type H = Any
  override type T = AnyTypeHList
}

class AnyHListTypeHList extends TypeHList {
  override type H = HList
  override type T = AnyHListTypeHList
}
