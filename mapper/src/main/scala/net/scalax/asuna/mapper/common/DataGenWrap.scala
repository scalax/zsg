package net.scalax.asuna.mapper.common

trait DataGenWrap {

  type TempData
  type TempRep
  def rep: TempRep

}

object DataGenWrap {
  type Aux[Rep, Temp] = DataGenWrap { type TempRep = Rep; type TempData = Temp }
}
