package net.scalax.asuna.mapper.common

trait DataGenDataTag {
  type TempData
}

trait DataGenWrap[+TempRep] extends DataGenDataTag {
  override type TempData
  def rep: TempRep
}

object DataGenWrap {
  type Aux[+TempRep, TData] = DataGenWrap[TempRep] { type TempData = TData }
}
