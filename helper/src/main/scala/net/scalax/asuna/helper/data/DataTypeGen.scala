package net.scalax.asuna.helper.data.macroImpl

trait DecoderDataGenAbs[Output] {

  type TempData
  type TempRep

  def rep: TempRep
  def to(caseModel: Output, tempRep: TempRep): TempData

}

object DecoderDataGenAbs {
  type Aux[Output, Rep, Temp] = DecoderDataGenAbs[Output] { type TempRep = Rep; type TempData = Temp }
}

trait DecoderDataGen[Input, Output, Sub] {

  type TempData
  type TempRep
  def rep: TempRep

  def to(caseModel: LazyData[Input, Output, Sub], tempRep: TempRep): TempData

}

object DecoderDataGen {

  type Aux[Input, Output, Sub, Rep, Temp] = DecoderDataGen[Input, Output, Sub] { type TempRep = Rep; type TempData = Temp }

}

trait EncoderDataGen[Output] {

  type TempData
  type TempRep
  def rep: TempRep

  def from(caseModel: Output, tempRep: TempRep): TempData

}

object EncoderDataGen {

  type Aux[Output, Rep, Temp] = EncoderDataGen[Output] { type TempRep = Rep; type TempData = Temp }

}

trait DataGenWrap {
  self =>

  type TempData
  type TempRep
  def rep: TempRep

  def asDecoder[Input, Output, Sub](f: (LazyData[Input, Output, Sub], TempRep) => TempData): DecoderDataGen.Aux[Input, Output, Sub, TempRep, TempData] = new DecoderDataGen[Input, Output, Sub] {
    override type TempData = self.TempData
    override type TempRep = self.TempRep
    override def to(caseModel: LazyData[Input, Output, Sub], tempRep: TempRep): TempData = f(caseModel, tempRep)
    override val rep = self.rep
  }
  def asEncoder[Output](f: (Output, TempRep) => TempData): EncoderDataGen.Aux[Output, TempRep, TempData] = new EncoderDataGen[Output] {
    override type TempData = self.TempData
    override type TempRep = self.TempRep
    override def from(caseModel: Output, tempRep: TempRep): TempData = f(caseModel, tempRep)
    override val rep = self.rep
  }

}

object DataGenWrap {

  type Aux[Rep, Temp] = DataGenWrap { type TempRep = Rep; type TempData = Temp }

  def value[Rep, Temp](rep: Rep): DataGenWrap.Aux[Rep, Temp] = {
    val rep1 = rep
    new DataGenWrap {
      override type TempData = Temp
      override type TempRep = Rep
      override val rep = rep1
    }
  }

}