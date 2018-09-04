package net.scalax.asuna.helper.template
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.core.decoder.{ DecoderShape, SplitData }
import net.scalax.asuna.helper.decoder.macroImpl.PropertyType
import net.scalax.asuna.helper.SetterContent
import net.scalax.asuna.helper.CaseModelContent2222
import net.scalax.asuna.helper.data.macroImpl.DataGenWrap
import shapeless._
trait CaseClassHelper
object CaseClassHelper {
  def withRep[Rep1, Data1](
    rep1: Rep1,
    property1: PropertyType[Data1],
    column1: MacroColumnInfo): CaseClassHelper1[Rep1, Data1] = {
    new CaseClassHelper1(
      rep1 = rep1,
      property1 = property1,
      column1 = column1)
  }
  def withRep[Rep1, Data1, Rep2, Data2](
    rep1: Rep1,
    property1: PropertyType[Data1],
    column1: MacroColumnInfo,
    rep2: Rep2,
    property2: PropertyType[Data2],
    column2: MacroColumnInfo): CaseClassHelper2[Rep1, Data1, Rep2, Data2] = {
    new CaseClassHelper2(
      rep1 = rep1,
      property1 = property1,
      column1 = column1,
      rep2 = rep2,
      property2 = property2,
      column2 = column2)
  }
  def withRep[Rep1, Data1, Rep2, Data2, Rep3, Data3](
    rep1: Rep1,
    property1: PropertyType[Data1],
    column1: MacroColumnInfo,
    rep2: Rep2,
    property2: PropertyType[Data2],
    column2: MacroColumnInfo,
    rep3: Rep3,
    property3: PropertyType[Data3],
    column3: MacroColumnInfo): CaseClassHelper3[Rep1, Data1, Rep2, Data2, Rep3, Data3] = {
    new CaseClassHelper3(
      rep1 = rep1,
      property1 = property1,
      column1 = column1,
      rep2 = rep2,
      property2 = property2,
      column2 = column2,
      rep3 = rep3,
      property3 = property3,
      column3 = column3)
  }
  def withRep[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4](
    rep1: Rep1,
    property1: PropertyType[Data1],
    column1: MacroColumnInfo,
    rep2: Rep2,
    property2: PropertyType[Data2],
    column2: MacroColumnInfo,
    rep3: Rep3,
    property3: PropertyType[Data3],
    column3: MacroColumnInfo,
    rep4: Rep4,
    property4: PropertyType[Data4],
    column4: MacroColumnInfo): CaseClassHelper4[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4] = {
    new CaseClassHelper4(
      rep1 = rep1,
      property1 = property1,
      column1 = column1,
      rep2 = rep2,
      property2 = property2,
      column2 = column2,
      rep3 = rep3,
      property3 = property3,
      column3 = column3,
      rep4 = rep4,
      property4 = property4,
      column4 = column4)
  }
  def withRep[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5](
    rep1: Rep1,
    property1: PropertyType[Data1],
    column1: MacroColumnInfo,
    rep2: Rep2,
    property2: PropertyType[Data2],
    column2: MacroColumnInfo,
    rep3: Rep3,
    property3: PropertyType[Data3],
    column3: MacroColumnInfo,
    rep4: Rep4,
    property4: PropertyType[Data4],
    column4: MacroColumnInfo,
    rep5: Rep5,
    property5: PropertyType[Data5],
    column5: MacroColumnInfo): CaseClassHelper5[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5] = {
    new CaseClassHelper5(
      rep1 = rep1,
      property1 = property1,
      column1 = column1,
      rep2 = rep2,
      property2 = property2,
      column2 = column2,
      rep3 = rep3,
      property3 = property3,
      column3 = column3,
      rep4 = rep4,
      property4 = property4,
      column4 = column4,
      rep5 = rep5,
      property5 = property5,
      column5 = column5)
  }
  def withRep[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6](
    rep1: Rep1,
    property1: PropertyType[Data1],
    column1: MacroColumnInfo,
    rep2: Rep2,
    property2: PropertyType[Data2],
    column2: MacroColumnInfo,
    rep3: Rep3,
    property3: PropertyType[Data3],
    column3: MacroColumnInfo,
    rep4: Rep4,
    property4: PropertyType[Data4],
    column4: MacroColumnInfo,
    rep5: Rep5,
    property5: PropertyType[Data5],
    column5: MacroColumnInfo,
    rep6: Rep6,
    property6: PropertyType[Data6],
    column6: MacroColumnInfo): CaseClassHelper6[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6] = {
    new CaseClassHelper6(
      rep1 = rep1,
      property1 = property1,
      column1 = column1,
      rep2 = rep2,
      property2 = property2,
      column2 = column2,
      rep3 = rep3,
      property3 = property3,
      column3 = column3,
      rep4 = rep4,
      property4 = property4,
      column4 = column4,
      rep5 = rep5,
      property5 = property5,
      column5 = column5,
      rep6 = rep6,
      property6 = property6,
      column6 = column6)
  }
}
trait CaseClassDataHelper
object CaseClassDataHelper {
  def withDataDescribe[Rep1, Data1](
    rep1: Rep1,
    property1: PropertyType[Data1],
    column1: MacroColumnInfo): DataGenWrap.Aux[CaseClassHelper1[Rep1, Data1], CaseClassDataHelper1[Data1]] = {
    DataGenWrap.value[CaseClassHelper1[Rep1, Data1], CaseClassDataHelper1[Data1]](new CaseClassHelper1(
      rep1 = rep1,
      property1 = property1,
      column1 = column1))
  }
  def withDataDescribe[Rep1, Data1, Rep2, Data2](
    rep1: Rep1,
    property1: PropertyType[Data1],
    column1: MacroColumnInfo,
    rep2: Rep2,
    property2: PropertyType[Data2],
    column2: MacroColumnInfo): DataGenWrap.Aux[CaseClassHelper2[Rep1, Data1, Rep2, Data2], CaseClassDataHelper2[Data1, Data2]] = {
    DataGenWrap.value[CaseClassHelper2[Rep1, Data1, Rep2, Data2], CaseClassDataHelper2[Data1, Data2]](new CaseClassHelper2(
      rep1 = rep1,
      property1 = property1,
      column1 = column1,
      rep2 = rep2,
      property2 = property2,
      column2 = column2))
  }
  def withDataDescribe[Rep1, Data1, Rep2, Data2, Rep3, Data3](
    rep1: Rep1,
    property1: PropertyType[Data1],
    column1: MacroColumnInfo,
    rep2: Rep2,
    property2: PropertyType[Data2],
    column2: MacroColumnInfo,
    rep3: Rep3,
    property3: PropertyType[Data3],
    column3: MacroColumnInfo): DataGenWrap.Aux[CaseClassHelper3[Rep1, Data1, Rep2, Data2, Rep3, Data3], CaseClassDataHelper3[Data1, Data2, Data3]] = {
    DataGenWrap.value[CaseClassHelper3[Rep1, Data1, Rep2, Data2, Rep3, Data3], CaseClassDataHelper3[Data1, Data2, Data3]](new CaseClassHelper3(
      rep1 = rep1,
      property1 = property1,
      column1 = column1,
      rep2 = rep2,
      property2 = property2,
      column2 = column2,
      rep3 = rep3,
      property3 = property3,
      column3 = column3))
  }
  def withDataDescribe[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4](
    rep1: Rep1,
    property1: PropertyType[Data1],
    column1: MacroColumnInfo,
    rep2: Rep2,
    property2: PropertyType[Data2],
    column2: MacroColumnInfo,
    rep3: Rep3,
    property3: PropertyType[Data3],
    column3: MacroColumnInfo,
    rep4: Rep4,
    property4: PropertyType[Data4],
    column4: MacroColumnInfo): DataGenWrap.Aux[CaseClassHelper4[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4], CaseClassDataHelper4[Data1, Data2, Data3, Data4]] = {
    DataGenWrap.value[CaseClassHelper4[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4], CaseClassDataHelper4[Data1, Data2, Data3, Data4]](new CaseClassHelper4(
      rep1 = rep1,
      property1 = property1,
      column1 = column1,
      rep2 = rep2,
      property2 = property2,
      column2 = column2,
      rep3 = rep3,
      property3 = property3,
      column3 = column3,
      rep4 = rep4,
      property4 = property4,
      column4 = column4))
  }
  def withDataDescribe[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5](
    rep1: Rep1,
    property1: PropertyType[Data1],
    column1: MacroColumnInfo,
    rep2: Rep2,
    property2: PropertyType[Data2],
    column2: MacroColumnInfo,
    rep3: Rep3,
    property3: PropertyType[Data3],
    column3: MacroColumnInfo,
    rep4: Rep4,
    property4: PropertyType[Data4],
    column4: MacroColumnInfo,
    rep5: Rep5,
    property5: PropertyType[Data5],
    column5: MacroColumnInfo): DataGenWrap.Aux[CaseClassHelper5[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5], CaseClassDataHelper5[Data1, Data2, Data3, Data4, Data5]] = {
    DataGenWrap.value[CaseClassHelper5[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5], CaseClassDataHelper5[Data1, Data2, Data3, Data4, Data5]](new CaseClassHelper5(
      rep1 = rep1,
      property1 = property1,
      column1 = column1,
      rep2 = rep2,
      property2 = property2,
      column2 = column2,
      rep3 = rep3,
      property3 = property3,
      column3 = column3,
      rep4 = rep4,
      property4 = property4,
      column4 = column4,
      rep5 = rep5,
      property5 = property5,
      column5 = column5))
  }
  def withDataDescribe[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6](
    rep1: Rep1,
    property1: PropertyType[Data1],
    column1: MacroColumnInfo,
    rep2: Rep2,
    property2: PropertyType[Data2],
    column2: MacroColumnInfo,
    rep3: Rep3,
    property3: PropertyType[Data3],
    column3: MacroColumnInfo,
    rep4: Rep4,
    property4: PropertyType[Data4],
    column4: MacroColumnInfo,
    rep5: Rep5,
    property5: PropertyType[Data5],
    column5: MacroColumnInfo,
    rep6: Rep6,
    property6: PropertyType[Data6],
    column6: MacroColumnInfo): DataGenWrap.Aux[CaseClassHelper6[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6], CaseClassDataHelper6[Data1, Data2, Data3, Data4, Data5, Data6]] = {
    DataGenWrap.value[CaseClassHelper6[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6], CaseClassDataHelper6[Data1, Data2, Data3, Data4, Data5, Data6]](new CaseClassHelper6(
      rep1 = rep1,
      property1 = property1,
      column1 = column1,
      rep2 = rep2,
      property2 = property2,
      column2 = column2,
      rep3 = rep3,
      property3 = property3,
      column3 = column3,
      rep4 = rep4,
      property4 = property4,
      column4 = column4,
      rep5 = rep5,
      property5 = property5,
      column5 = column5,
      rep6 = rep6,
      property6 = property6,
      column6 = column6))
  }
}
class CaseClassHelper1[Rep1, Data1](
  val rep1: Rep1,
  val property1: PropertyType[Data1],
  val column1: MacroColumnInfo) {
}
class CaseClassDataHelper1[Data1](
  val data1: Data1,
  val column1: MacroColumnInfo) extends CaseClassDataHelperAbs {
  override def toSetterContent(setterContent: SetterContent): SetterContent = {
    val setterContent2 = setterContent
    val setterContent1 = CaseModelContent2222.set(setterContent2, column1.modelColumnSymbol, data1)
    setterContent1
  }
}
object CaseClassDataHelper1 {
  def fromModel[Rep1, Data1](rep: CaseClassHelper1[Rep1, Data1], cv: Symbol => Any): CaseClassDataHelper1[Data1] = {
    new CaseClassDataHelper1(
      data1 = cv(rep.column1.modelColumnSymbol).asInstanceOf[Data1],
      column1 = rep.column1)
  }
}
object CaseClassHelper1 {
  implicit def caseClassHelper1EncoderGen[Rep1, Data1, Target1, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper1[Rep1, Data1], CaseClassDataHelper1[Data1], CaseClassHelper1[Target1, Data1], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper1[Rep1, Data1], CaseClassDataHelper1[Data1], RepCol, DataCol] {
      override type Target = CaseClassHelper1[Target1, Data1]
      override def wrapRep(base: CaseClassHelper1[Rep1, Data1]): CaseClassHelper1[Target1, Data1] = {
        new CaseClassHelper1(
          rep1 = shape1.value.wrapRep(base.rep1),
          property1 = base.property1,
          column1 = base.column1)
      }
      override def toLawRep(base: CaseClassHelper1[Target1, Data1], oldRep: RepCol): RepCol = {
        val rep2 = oldRep
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper1[Data1], rep: CaseClassHelper1[Target1, Data1], oldData: DataCol): DataCol = {
        val data2 = oldData
        val data1 = shape1.value.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper1EncoderImplicit[Rep1, Data1, Target1, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper1[Rep1, Data1], Symbol => Any, CaseClassHelper1[Target1, Data1], RepCol, DataCol] = {
    caseClassHelper1EncoderGen(
      shape1).emap { (rep, s: Symbol => Any) => CaseClassDataHelper1.fromModel(rep, s) }
  }
  implicit def caseClassHelper1DecoderGen[Rep1, Data1, Target1, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper1[Rep1, Data1], CaseClassDataHelper1[Data1], CaseClassHelper1[Target1, Data1], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper1[Rep1, Data1], CaseClassDataHelper1[Data1], RepCol, DataCol] {
      override type Target = CaseClassHelper1[Target1, Data1]
      override def wrapRep(base: CaseClassHelper1[Rep1, Data1]): CaseClassHelper1[Target1, Data1] = {
        new CaseClassHelper1(
          rep1 = shape1.value.wrapRep(base.rep1),
          property1 = base.property1,
          column1 = base.column1)
      }
      override def toLawRep(base: CaseClassHelper1[Target1, Data1], oldRep: RepCol): RepCol = {
        val rep2 = oldRep
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper1[Target1, Data1], oldDataCol: DataCol): SplitData[CaseClassDataHelper1[Data1], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        SplitData(
          current = new CaseClassDataHelper1(
            data1 = item1,
            column1 = rep.column1),
          left = dataCol1)
      }
    }
  }
  implicit def caseClassHelper1DecoderImplicit[Rep1, Data1, Target1, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper1[Rep1, Data1], SetterContent => SetterContent, CaseClassHelper1[Target1, Data1], RepCol, DataCol] = {
    caseClassHelper1DecoderGen(
      shape1).dmap((rep, s) => s.toSetterContent _)
  }
}
class CaseClassHelper2[Rep1, Data1, Rep2, Data2](
  val rep1: Rep1,
  val property1: PropertyType[Data1],
  val column1: MacroColumnInfo,
  val rep2: Rep2,
  val property2: PropertyType[Data2],
  val column2: MacroColumnInfo) {
}
class CaseClassDataHelper2[Data1, Data2](
  val data1: Data1,
  val column1: MacroColumnInfo,
  val data2: Data2,
  val column2: MacroColumnInfo) extends CaseClassDataHelperAbs {
  override def toSetterContent(setterContent: SetterContent): SetterContent = {
    val setterContent3 = setterContent
    val setterContent2 = CaseModelContent2222.set(setterContent3, column2.modelColumnSymbol, data2)
    val setterContent1 = CaseModelContent2222.set(setterContent2, column1.modelColumnSymbol, data1)
    setterContent1
  }
}
object CaseClassDataHelper2 {
  def fromModel[Rep1, Data1, Rep2, Data2](rep: CaseClassHelper2[Rep1, Data1, Rep2, Data2], cv: Symbol => Any): CaseClassDataHelper2[Data1, Data2] = {
    new CaseClassDataHelper2(
      data1 = cv(rep.column1.modelColumnSymbol).asInstanceOf[Data1],
      column1 = rep.column1,
      data2 = cv(rep.column2.modelColumnSymbol).asInstanceOf[Data2],
      column2 = rep.column2)
  }
}
object CaseClassHelper2 {
  implicit def caseClassHelper2EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper2[Rep1, Data1, Rep2, Data2], CaseClassDataHelper2[Data1, Data2], CaseClassHelper2[Target1, Data1, Target2, Data2], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper2[Rep1, Data1, Rep2, Data2], CaseClassDataHelper2[Data1, Data2], RepCol, DataCol] {
      override type Target = CaseClassHelper2[Target1, Data1, Target2, Data2]
      override def wrapRep(base: CaseClassHelper2[Rep1, Data1, Rep2, Data2]): CaseClassHelper2[Target1, Data1, Target2, Data2] = {
        new CaseClassHelper2(
          rep1 = shape1.value.wrapRep(base.rep1),
          property1 = base.property1,
          column1 = base.column1,
          rep2 = shape2.value.wrapRep(base.rep2),
          property2 = base.property2,
          column2 = base.column2)
      }
      override def toLawRep(base: CaseClassHelper2[Target1, Data1, Target2, Data2], oldRep: RepCol): RepCol = {
        val rep3 = oldRep
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper2[Data1, Data2], rep: CaseClassHelper2[Target1, Data1, Target2, Data2], oldData: DataCol): DataCol = {
        val data3 = oldData
        val data2 = shape2.value.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.value.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper2EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper2[Rep1, Data1, Rep2, Data2], Symbol => Any, CaseClassHelper2[Target1, Data1, Target2, Data2], RepCol, DataCol] = {
    caseClassHelper2EncoderGen(
      shape1,
      shape2).emap { (rep, s: Symbol => Any) => CaseClassDataHelper2.fromModel(rep, s) }
  }
  implicit def caseClassHelper2DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper2[Rep1, Data1, Rep2, Data2], CaseClassDataHelper2[Data1, Data2], CaseClassHelper2[Target1, Data1, Target2, Data2], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper2[Rep1, Data1, Rep2, Data2], CaseClassDataHelper2[Data1, Data2], RepCol, DataCol] {
      override type Target = CaseClassHelper2[Target1, Data1, Target2, Data2]
      override def wrapRep(base: CaseClassHelper2[Rep1, Data1, Rep2, Data2]): CaseClassHelper2[Target1, Data1, Target2, Data2] = {
        new CaseClassHelper2(
          rep1 = shape1.value.wrapRep(base.rep1),
          property1 = base.property1,
          column1 = base.column1,
          rep2 = shape2.value.wrapRep(base.rep2),
          property2 = base.property2,
          column2 = base.column2)
      }
      override def toLawRep(base: CaseClassHelper2[Target1, Data1, Target2, Data2], oldRep: RepCol): RepCol = {
        val rep3 = oldRep
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper2[Target1, Data1, Target2, Data2], oldDataCol: DataCol): SplitData[CaseClassDataHelper2[Data1, Data2], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        SplitData(
          current = new CaseClassDataHelper2(
            data1 = item1,
            column1 = rep.column1,
            data2 = item2,
            column2 = rep.column2),
          left = dataCol2)
      }
    }
  }
  implicit def caseClassHelper2DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper2[Rep1, Data1, Rep2, Data2], SetterContent => SetterContent, CaseClassHelper2[Target1, Data1, Target2, Data2], RepCol, DataCol] = {
    caseClassHelper2DecoderGen(
      shape1,
      shape2).dmap((rep, s) => s.toSetterContent _)
  }
}
class CaseClassHelper3[Rep1, Data1, Rep2, Data2, Rep3, Data3](
  val rep1: Rep1,
  val property1: PropertyType[Data1],
  val column1: MacroColumnInfo,
  val rep2: Rep2,
  val property2: PropertyType[Data2],
  val column2: MacroColumnInfo,
  val rep3: Rep3,
  val property3: PropertyType[Data3],
  val column3: MacroColumnInfo) {
}
class CaseClassDataHelper3[Data1, Data2, Data3](
  val data1: Data1,
  val column1: MacroColumnInfo,
  val data2: Data2,
  val column2: MacroColumnInfo,
  val data3: Data3,
  val column3: MacroColumnInfo) extends CaseClassDataHelperAbs {
  override def toSetterContent(setterContent: SetterContent): SetterContent = {
    val setterContent4 = setterContent
    val setterContent3 = CaseModelContent2222.set(setterContent4, column3.modelColumnSymbol, data3)
    val setterContent2 = CaseModelContent2222.set(setterContent3, column2.modelColumnSymbol, data2)
    val setterContent1 = CaseModelContent2222.set(setterContent2, column1.modelColumnSymbol, data1)
    setterContent1
  }
}
object CaseClassDataHelper3 {
  def fromModel[Rep1, Data1, Rep2, Data2, Rep3, Data3](rep: CaseClassHelper3[Rep1, Data1, Rep2, Data2, Rep3, Data3], cv: Symbol => Any): CaseClassDataHelper3[Data1, Data2, Data3] = {
    new CaseClassDataHelper3(
      data1 = cv(rep.column1.modelColumnSymbol).asInstanceOf[Data1],
      column1 = rep.column1,
      data2 = cv(rep.column2.modelColumnSymbol).asInstanceOf[Data2],
      column2 = rep.column2,
      data3 = cv(rep.column3.modelColumnSymbol).asInstanceOf[Data3],
      column3 = rep.column3)
  }
}
object CaseClassHelper3 {
  implicit def caseClassHelper3EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper3[Rep1, Data1, Rep2, Data2, Rep3, Data3], CaseClassDataHelper3[Data1, Data2, Data3], CaseClassHelper3[Target1, Data1, Target2, Data2, Target3, Data3], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper3[Rep1, Data1, Rep2, Data2, Rep3, Data3], CaseClassDataHelper3[Data1, Data2, Data3], RepCol, DataCol] {
      override type Target = CaseClassHelper3[Target1, Data1, Target2, Data2, Target3, Data3]
      override def wrapRep(base: CaseClassHelper3[Rep1, Data1, Rep2, Data2, Rep3, Data3]): CaseClassHelper3[Target1, Data1, Target2, Data2, Target3, Data3] = {
        new CaseClassHelper3(
          rep1 = shape1.value.wrapRep(base.rep1),
          property1 = base.property1,
          column1 = base.column1,
          rep2 = shape2.value.wrapRep(base.rep2),
          property2 = base.property2,
          column2 = base.column2,
          rep3 = shape3.value.wrapRep(base.rep3),
          property3 = base.property3,
          column3 = base.column3)
      }
      override def toLawRep(base: CaseClassHelper3[Target1, Data1, Target2, Data2, Target3, Data3], oldRep: RepCol): RepCol = {
        val rep4 = oldRep
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper3[Data1, Data2, Data3], rep: CaseClassHelper3[Target1, Data1, Target2, Data2, Target3, Data3], oldData: DataCol): DataCol = {
        val data4 = oldData
        val data3 = shape3.value.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.value.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.value.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper3EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper3[Rep1, Data1, Rep2, Data2, Rep3, Data3], Symbol => Any, CaseClassHelper3[Target1, Data1, Target2, Data2, Target3, Data3], RepCol, DataCol] = {
    caseClassHelper3EncoderGen(
      shape1,
      shape2,
      shape3).emap { (rep, s: Symbol => Any) => CaseClassDataHelper3.fromModel(rep, s) }
  }
  implicit def caseClassHelper3DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper3[Rep1, Data1, Rep2, Data2, Rep3, Data3], CaseClassDataHelper3[Data1, Data2, Data3], CaseClassHelper3[Target1, Data1, Target2, Data2, Target3, Data3], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper3[Rep1, Data1, Rep2, Data2, Rep3, Data3], CaseClassDataHelper3[Data1, Data2, Data3], RepCol, DataCol] {
      override type Target = CaseClassHelper3[Target1, Data1, Target2, Data2, Target3, Data3]
      override def wrapRep(base: CaseClassHelper3[Rep1, Data1, Rep2, Data2, Rep3, Data3]): CaseClassHelper3[Target1, Data1, Target2, Data2, Target3, Data3] = {
        new CaseClassHelper3(
          rep1 = shape1.value.wrapRep(base.rep1),
          property1 = base.property1,
          column1 = base.column1,
          rep2 = shape2.value.wrapRep(base.rep2),
          property2 = base.property2,
          column2 = base.column2,
          rep3 = shape3.value.wrapRep(base.rep3),
          property3 = base.property3,
          column3 = base.column3)
      }
      override def toLawRep(base: CaseClassHelper3[Target1, Data1, Target2, Data2, Target3, Data3], oldRep: RepCol): RepCol = {
        val rep4 = oldRep
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper3[Target1, Data1, Target2, Data2, Target3, Data3], oldDataCol: DataCol): SplitData[CaseClassDataHelper3[Data1, Data2, Data3], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        SplitData(
          current = new CaseClassDataHelper3(
            data1 = item1,
            column1 = rep.column1,
            data2 = item2,
            column2 = rep.column2,
            data3 = item3,
            column3 = rep.column3),
          left = dataCol3)
      }
    }
  }
  implicit def caseClassHelper3DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper3[Rep1, Data1, Rep2, Data2, Rep3, Data3], SetterContent => SetterContent, CaseClassHelper3[Target1, Data1, Target2, Data2, Target3, Data3], RepCol, DataCol] = {
    caseClassHelper3DecoderGen(
      shape1,
      shape2,
      shape3).dmap((rep, s) => s.toSetterContent _)
  }
}
class CaseClassHelper4[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4](
  val rep1: Rep1,
  val property1: PropertyType[Data1],
  val column1: MacroColumnInfo,
  val rep2: Rep2,
  val property2: PropertyType[Data2],
  val column2: MacroColumnInfo,
  val rep3: Rep3,
  val property3: PropertyType[Data3],
  val column3: MacroColumnInfo,
  val rep4: Rep4,
  val property4: PropertyType[Data4],
  val column4: MacroColumnInfo) {
}
class CaseClassDataHelper4[Data1, Data2, Data3, Data4](
  val data1: Data1,
  val column1: MacroColumnInfo,
  val data2: Data2,
  val column2: MacroColumnInfo,
  val data3: Data3,
  val column3: MacroColumnInfo,
  val data4: Data4,
  val column4: MacroColumnInfo) extends CaseClassDataHelperAbs {
  override def toSetterContent(setterContent: SetterContent): SetterContent = {
    val setterContent5 = setterContent
    val setterContent4 = CaseModelContent2222.set(setterContent5, column4.modelColumnSymbol, data4)
    val setterContent3 = CaseModelContent2222.set(setterContent4, column3.modelColumnSymbol, data3)
    val setterContent2 = CaseModelContent2222.set(setterContent3, column2.modelColumnSymbol, data2)
    val setterContent1 = CaseModelContent2222.set(setterContent2, column1.modelColumnSymbol, data1)
    setterContent1
  }
}
object CaseClassDataHelper4 {
  def fromModel[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4](rep: CaseClassHelper4[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4], cv: Symbol => Any): CaseClassDataHelper4[Data1, Data2, Data3, Data4] = {
    new CaseClassDataHelper4(
      data1 = cv(rep.column1.modelColumnSymbol).asInstanceOf[Data1],
      column1 = rep.column1,
      data2 = cv(rep.column2.modelColumnSymbol).asInstanceOf[Data2],
      column2 = rep.column2,
      data3 = cv(rep.column3.modelColumnSymbol).asInstanceOf[Data3],
      column3 = rep.column3,
      data4 = cv(rep.column4.modelColumnSymbol).asInstanceOf[Data4],
      column4 = rep.column4)
  }
}
object CaseClassHelper4 {
  implicit def caseClassHelper4EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper4[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4], CaseClassDataHelper4[Data1, Data2, Data3, Data4], CaseClassHelper4[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper4[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4], CaseClassDataHelper4[Data1, Data2, Data3, Data4], RepCol, DataCol] {
      override type Target = CaseClassHelper4[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4]
      override def wrapRep(base: CaseClassHelper4[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4]): CaseClassHelper4[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4] = {
        new CaseClassHelper4(
          rep1 = shape1.value.wrapRep(base.rep1),
          property1 = base.property1,
          column1 = base.column1,
          rep2 = shape2.value.wrapRep(base.rep2),
          property2 = base.property2,
          column2 = base.column2,
          rep3 = shape3.value.wrapRep(base.rep3),
          property3 = base.property3,
          column3 = base.column3,
          rep4 = shape4.value.wrapRep(base.rep4),
          property4 = base.property4,
          column4 = base.column4)
      }
      override def toLawRep(base: CaseClassHelper4[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4], oldRep: RepCol): RepCol = {
        val rep5 = oldRep
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper4[Data1, Data2, Data3, Data4], rep: CaseClassHelper4[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4], oldData: DataCol): DataCol = {
        val data5 = oldData
        val data4 = shape4.value.buildData(data.data4, rep.rep4, data5)
        val data3 = shape3.value.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.value.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.value.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper4EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper4[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4], Symbol => Any, CaseClassHelper4[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4], RepCol, DataCol] = {
    caseClassHelper4EncoderGen(
      shape1,
      shape2,
      shape3,
      shape4).emap { (rep, s: Symbol => Any) => CaseClassDataHelper4.fromModel(rep, s) }
  }
  implicit def caseClassHelper4DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper4[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4], CaseClassDataHelper4[Data1, Data2, Data3, Data4], CaseClassHelper4[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper4[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4], CaseClassDataHelper4[Data1, Data2, Data3, Data4], RepCol, DataCol] {
      override type Target = CaseClassHelper4[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4]
      override def wrapRep(base: CaseClassHelper4[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4]): CaseClassHelper4[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4] = {
        new CaseClassHelper4(
          rep1 = shape1.value.wrapRep(base.rep1),
          property1 = base.property1,
          column1 = base.column1,
          rep2 = shape2.value.wrapRep(base.rep2),
          property2 = base.property2,
          column2 = base.column2,
          rep3 = shape3.value.wrapRep(base.rep3),
          property3 = base.property3,
          column3 = base.column3,
          rep4 = shape4.value.wrapRep(base.rep4),
          property4 = base.property4,
          column4 = base.column4)
      }
      override def toLawRep(base: CaseClassHelper4[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4], oldRep: RepCol): RepCol = {
        val rep5 = oldRep
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper4[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4], oldDataCol: DataCol): SplitData[CaseClassDataHelper4[Data1, Data2, Data3, Data4], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        SplitData(
          current = new CaseClassDataHelper4(
            data1 = item1,
            column1 = rep.column1,
            data2 = item2,
            column2 = rep.column2,
            data3 = item3,
            column3 = rep.column3,
            data4 = item4,
            column4 = rep.column4),
          left = dataCol4)
      }
    }
  }
  implicit def caseClassHelper4DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper4[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4], SetterContent => SetterContent, CaseClassHelper4[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4], RepCol, DataCol] = {
    caseClassHelper4DecoderGen(
      shape1,
      shape2,
      shape3,
      shape4).dmap((rep, s) => s.toSetterContent _)
  }
}
class CaseClassHelper5[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5](
  val rep1: Rep1,
  val property1: PropertyType[Data1],
  val column1: MacroColumnInfo,
  val rep2: Rep2,
  val property2: PropertyType[Data2],
  val column2: MacroColumnInfo,
  val rep3: Rep3,
  val property3: PropertyType[Data3],
  val column3: MacroColumnInfo,
  val rep4: Rep4,
  val property4: PropertyType[Data4],
  val column4: MacroColumnInfo,
  val rep5: Rep5,
  val property5: PropertyType[Data5],
  val column5: MacroColumnInfo) {
}
class CaseClassDataHelper5[Data1, Data2, Data3, Data4, Data5](
  val data1: Data1,
  val column1: MacroColumnInfo,
  val data2: Data2,
  val column2: MacroColumnInfo,
  val data3: Data3,
  val column3: MacroColumnInfo,
  val data4: Data4,
  val column4: MacroColumnInfo,
  val data5: Data5,
  val column5: MacroColumnInfo) extends CaseClassDataHelperAbs {
  override def toSetterContent(setterContent: SetterContent): SetterContent = {
    val setterContent6 = setterContent
    val setterContent5 = CaseModelContent2222.set(setterContent6, column5.modelColumnSymbol, data5)
    val setterContent4 = CaseModelContent2222.set(setterContent5, column4.modelColumnSymbol, data4)
    val setterContent3 = CaseModelContent2222.set(setterContent4, column3.modelColumnSymbol, data3)
    val setterContent2 = CaseModelContent2222.set(setterContent3, column2.modelColumnSymbol, data2)
    val setterContent1 = CaseModelContent2222.set(setterContent2, column1.modelColumnSymbol, data1)
    setterContent1
  }
}
object CaseClassDataHelper5 {
  def fromModel[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5](rep: CaseClassHelper5[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5], cv: Symbol => Any): CaseClassDataHelper5[Data1, Data2, Data3, Data4, Data5] = {
    new CaseClassDataHelper5(
      data1 = cv(rep.column1.modelColumnSymbol).asInstanceOf[Data1],
      column1 = rep.column1,
      data2 = cv(rep.column2.modelColumnSymbol).asInstanceOf[Data2],
      column2 = rep.column2,
      data3 = cv(rep.column3.modelColumnSymbol).asInstanceOf[Data3],
      column3 = rep.column3,
      data4 = cv(rep.column4.modelColumnSymbol).asInstanceOf[Data4],
      column4 = rep.column4,
      data5 = cv(rep.column5.modelColumnSymbol).asInstanceOf[Data5],
      column5 = rep.column5)
  }
}
object CaseClassHelper5 {
  implicit def caseClassHelper5EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper5[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5], CaseClassDataHelper5[Data1, Data2, Data3, Data4, Data5], CaseClassHelper5[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper5[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5], CaseClassDataHelper5[Data1, Data2, Data3, Data4, Data5], RepCol, DataCol] {
      override type Target = CaseClassHelper5[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5]
      override def wrapRep(base: CaseClassHelper5[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5]): CaseClassHelper5[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5] = {
        new CaseClassHelper5(
          rep1 = shape1.value.wrapRep(base.rep1),
          property1 = base.property1,
          column1 = base.column1,
          rep2 = shape2.value.wrapRep(base.rep2),
          property2 = base.property2,
          column2 = base.column2,
          rep3 = shape3.value.wrapRep(base.rep3),
          property3 = base.property3,
          column3 = base.column3,
          rep4 = shape4.value.wrapRep(base.rep4),
          property4 = base.property4,
          column4 = base.column4,
          rep5 = shape5.value.wrapRep(base.rep5),
          property5 = base.property5,
          column5 = base.column5)
      }
      override def toLawRep(base: CaseClassHelper5[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5], oldRep: RepCol): RepCol = {
        val rep6 = oldRep
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper5[Data1, Data2, Data3, Data4, Data5], rep: CaseClassHelper5[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5], oldData: DataCol): DataCol = {
        val data6 = oldData
        val data5 = shape5.value.buildData(data.data5, rep.rep5, data6)
        val data4 = shape4.value.buildData(data.data4, rep.rep4, data5)
        val data3 = shape3.value.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.value.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.value.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper5EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper5[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5], Symbol => Any, CaseClassHelper5[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5], RepCol, DataCol] = {
    caseClassHelper5EncoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5).emap { (rep, s: Symbol => Any) => CaseClassDataHelper5.fromModel(rep, s) }
  }
  implicit def caseClassHelper5DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper5[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5], CaseClassDataHelper5[Data1, Data2, Data3, Data4, Data5], CaseClassHelper5[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper5[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5], CaseClassDataHelper5[Data1, Data2, Data3, Data4, Data5], RepCol, DataCol] {
      override type Target = CaseClassHelper5[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5]
      override def wrapRep(base: CaseClassHelper5[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5]): CaseClassHelper5[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5] = {
        new CaseClassHelper5(
          rep1 = shape1.value.wrapRep(base.rep1),
          property1 = base.property1,
          column1 = base.column1,
          rep2 = shape2.value.wrapRep(base.rep2),
          property2 = base.property2,
          column2 = base.column2,
          rep3 = shape3.value.wrapRep(base.rep3),
          property3 = base.property3,
          column3 = base.column3,
          rep4 = shape4.value.wrapRep(base.rep4),
          property4 = base.property4,
          column4 = base.column4,
          rep5 = shape5.value.wrapRep(base.rep5),
          property5 = base.property5,
          column5 = base.column5)
      }
      override def toLawRep(base: CaseClassHelper5[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5], oldRep: RepCol): RepCol = {
        val rep6 = oldRep
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper5[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5], oldDataCol: DataCol): SplitData[CaseClassDataHelper5[Data1, Data2, Data3, Data4, Data5], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        SplitData(
          current = new CaseClassDataHelper5(
            data1 = item1,
            column1 = rep.column1,
            data2 = item2,
            column2 = rep.column2,
            data3 = item3,
            column3 = rep.column3,
            data4 = item4,
            column4 = rep.column4,
            data5 = item5,
            column5 = rep.column5),
          left = dataCol5)
      }
    }
  }
  implicit def caseClassHelper5DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper5[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5], SetterContent => SetterContent, CaseClassHelper5[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5], RepCol, DataCol] = {
    caseClassHelper5DecoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5).dmap((rep, s) => s.toSetterContent _)
  }
}
class CaseClassHelper6[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6](
  val rep1: Rep1,
  val property1: PropertyType[Data1],
  val column1: MacroColumnInfo,
  val rep2: Rep2,
  val property2: PropertyType[Data2],
  val column2: MacroColumnInfo,
  val rep3: Rep3,
  val property3: PropertyType[Data3],
  val column3: MacroColumnInfo,
  val rep4: Rep4,
  val property4: PropertyType[Data4],
  val column4: MacroColumnInfo,
  val rep5: Rep5,
  val property5: PropertyType[Data5],
  val column5: MacroColumnInfo,
  val rep6: Rep6,
  val property6: PropertyType[Data6],
  val column6: MacroColumnInfo) {
}
class CaseClassDataHelper6[Data1, Data2, Data3, Data4, Data5, Data6](
  val data1: Data1,
  val column1: MacroColumnInfo,
  val data2: Data2,
  val column2: MacroColumnInfo,
  val data3: Data3,
  val column3: MacroColumnInfo,
  val data4: Data4,
  val column4: MacroColumnInfo,
  val data5: Data5,
  val column5: MacroColumnInfo,
  val data6: Data6,
  val column6: MacroColumnInfo) extends CaseClassDataHelperAbs {
  override def toSetterContent(setterContent: SetterContent): SetterContent = {
    val setterContent7 = setterContent
    val setterContent6 = CaseModelContent2222.set(setterContent7, column6.modelColumnSymbol, data6)
    val setterContent5 = CaseModelContent2222.set(setterContent6, column5.modelColumnSymbol, data5)
    val setterContent4 = CaseModelContent2222.set(setterContent5, column4.modelColumnSymbol, data4)
    val setterContent3 = CaseModelContent2222.set(setterContent4, column3.modelColumnSymbol, data3)
    val setterContent2 = CaseModelContent2222.set(setterContent3, column2.modelColumnSymbol, data2)
    val setterContent1 = CaseModelContent2222.set(setterContent2, column1.modelColumnSymbol, data1)
    setterContent1
  }
}
object CaseClassDataHelper6 {
  def fromModel[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6](rep: CaseClassHelper6[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6], cv: Symbol => Any): CaseClassDataHelper6[Data1, Data2, Data3, Data4, Data5, Data6] = {
    new CaseClassDataHelper6(
      data1 = cv(rep.column1.modelColumnSymbol).asInstanceOf[Data1],
      column1 = rep.column1,
      data2 = cv(rep.column2.modelColumnSymbol).asInstanceOf[Data2],
      column2 = rep.column2,
      data3 = cv(rep.column3.modelColumnSymbol).asInstanceOf[Data3],
      column3 = rep.column3,
      data4 = cv(rep.column4.modelColumnSymbol).asInstanceOf[Data4],
      column4 = rep.column4,
      data5 = cv(rep.column5.modelColumnSymbol).asInstanceOf[Data5],
      column5 = rep.column5,
      data6 = cv(rep.column6.modelColumnSymbol).asInstanceOf[Data6],
      column6 = rep.column6)
  }
}
object CaseClassHelper6 {
  implicit def caseClassHelper6EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper6[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6], CaseClassDataHelper6[Data1, Data2, Data3, Data4, Data5, Data6], CaseClassHelper6[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper6[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6], CaseClassDataHelper6[Data1, Data2, Data3, Data4, Data5, Data6], RepCol, DataCol] {
      override type Target = CaseClassHelper6[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6]
      override def wrapRep(base: CaseClassHelper6[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6]): CaseClassHelper6[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6] = {
        new CaseClassHelper6(
          rep1 = shape1.value.wrapRep(base.rep1),
          property1 = base.property1,
          column1 = base.column1,
          rep2 = shape2.value.wrapRep(base.rep2),
          property2 = base.property2,
          column2 = base.column2,
          rep3 = shape3.value.wrapRep(base.rep3),
          property3 = base.property3,
          column3 = base.column3,
          rep4 = shape4.value.wrapRep(base.rep4),
          property4 = base.property4,
          column4 = base.column4,
          rep5 = shape5.value.wrapRep(base.rep5),
          property5 = base.property5,
          column5 = base.column5,
          rep6 = shape6.value.wrapRep(base.rep6),
          property6 = base.property6,
          column6 = base.column6)
      }
      override def toLawRep(base: CaseClassHelper6[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6], oldRep: RepCol): RepCol = {
        val rep7 = oldRep
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper6[Data1, Data2, Data3, Data4, Data5, Data6], rep: CaseClassHelper6[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6], oldData: DataCol): DataCol = {
        val data7 = oldData
        val data6 = shape6.value.buildData(data.data6, rep.rep6, data7)
        val data5 = shape5.value.buildData(data.data5, rep.rep5, data6)
        val data4 = shape4.value.buildData(data.data4, rep.rep4, data5)
        val data3 = shape3.value.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.value.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.value.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper6EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper6[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6], Symbol => Any, CaseClassHelper6[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6], RepCol, DataCol] = {
    caseClassHelper6EncoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5,
      shape6).emap { (rep, s: Symbol => Any) => CaseClassDataHelper6.fromModel(rep, s) }
  }
  implicit def caseClassHelper6DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper6[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6], CaseClassDataHelper6[Data1, Data2, Data3, Data4, Data5, Data6], CaseClassHelper6[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper6[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6], CaseClassDataHelper6[Data1, Data2, Data3, Data4, Data5, Data6], RepCol, DataCol] {
      override type Target = CaseClassHelper6[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6]
      override def wrapRep(base: CaseClassHelper6[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6]): CaseClassHelper6[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6] = {
        new CaseClassHelper6(
          rep1 = shape1.value.wrapRep(base.rep1),
          property1 = base.property1,
          column1 = base.column1,
          rep2 = shape2.value.wrapRep(base.rep2),
          property2 = base.property2,
          column2 = base.column2,
          rep3 = shape3.value.wrapRep(base.rep3),
          property3 = base.property3,
          column3 = base.column3,
          rep4 = shape4.value.wrapRep(base.rep4),
          property4 = base.property4,
          column4 = base.column4,
          rep5 = shape5.value.wrapRep(base.rep5),
          property5 = base.property5,
          column5 = base.column5,
          rep6 = shape6.value.wrapRep(base.rep6),
          property6 = base.property6,
          column6 = base.column6)
      }
      override def toLawRep(base: CaseClassHelper6[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6], oldRep: RepCol): RepCol = {
        val rep7 = oldRep
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper6[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6], oldDataCol: DataCol): SplitData[CaseClassDataHelper6[Data1, Data2, Data3, Data4, Data5, Data6], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        SplitData(
          current = new CaseClassDataHelper6(
            data1 = item1,
            column1 = rep.column1,
            data2 = item2,
            column2 = rep.column2,
            data3 = item3,
            column3 = rep.column3,
            data4 = item4,
            column4 = rep.column4,
            data5 = item5,
            column5 = rep.column5,
            data6 = item6,
            column6 = rep.column6),
          left = dataCol6)
      }
    }
  }
  implicit def caseClassHelper6DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper6[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6], SetterContent => SetterContent, CaseClassHelper6[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6], RepCol, DataCol] = {
    caseClassHelper6DecoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5,
      shape6).dmap((rep, s) => s.toSetterContent _)
  }
}
