package net.scalax.asuna.mapper.common

trait DataGenTag {
  type TempData
}

trait DataGenWrap extends DataGenTag {
  type TempData
  type TempRep
  def rep: TempRep
}

object DataGenWrap {
  type Aux[Rep, Temp] = DataGenWrap { type TempRep = Rep; type TempData = Temp }
}
