package net.scalax.asuna.mapper.common

trait DataGenWrap {
  self =>

  type TempData
  type TempRep
  def rep: TempRep

}

object DataGenWrap {

  type Aux[Rep, Temp] = DataGenWrap { type TempRep = Rep; type TempData = Temp }

  def value[Rep, Temp](rep: Rep): DataGenWrap.Aux[Rep, Temp] = {
    val rep1 = rep
    new DataGenWrap {
      override type TempData = Temp
      override type TempRep  = Rep
      override val rep = rep1
    }
  }

}
