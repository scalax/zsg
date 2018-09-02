package net.scalax.asuna.helper.template
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.core.decoder.{ DecoderShape, SplitData }
import net.scalax.asuna.helper.decoder.macroImpl.PropertyType
import shapeless._
class CaseClassHelper1[Rep1, Data1](
  val rep1: Rep1,
  val property1: PropertyType[Data1],
  val column1: MacroColumnInfo) {
}
class CaseClassDataHelper1[Data1](
  val data1: Data1,
  val column1: MacroColumnInfo) {
}
object CaseClassHelper1 {
  implicit def caseClassHelper1EncoderImplicit[Rep1, Data1, Target1, RepCol, DataCol](
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
  implicit def caseClassHelper1DecoderImplicit[Rep1, Data1, Target1, RepCol, DataCol](
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
  val column2: MacroColumnInfo) {
}
object CaseClassHelper2 {
  implicit def caseClassHelper2EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, RepCol, DataCol](
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
  implicit def caseClassHelper2DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, RepCol, DataCol](
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
  val column3: MacroColumnInfo) {
}
object CaseClassHelper3 {
  implicit def caseClassHelper3EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, RepCol, DataCol](
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
  implicit def caseClassHelper3DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, RepCol, DataCol](
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
  val column4: MacroColumnInfo) {
}
object CaseClassHelper4 {
  implicit def caseClassHelper4EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, RepCol, DataCol](
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
  implicit def caseClassHelper4DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, RepCol, DataCol](
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
  val column5: MacroColumnInfo) {
}
object CaseClassHelper5 {
  implicit def caseClassHelper5EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, RepCol, DataCol](
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
  implicit def caseClassHelper5DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, RepCol, DataCol](
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
  val column6: MacroColumnInfo) {
}
object CaseClassHelper6 {
  implicit def caseClassHelper6EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, RepCol, DataCol](
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
  implicit def caseClassHelper6DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, RepCol, DataCol](
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
}
class CaseClassHelper7[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo) {
}
class CaseClassDataHelper7[Data1, Data2, Data3, Data4, Data5, Data6, Data7](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo) {
}
object CaseClassHelper7 {
  implicit def caseClassHelper7EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper7[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7], CaseClassDataHelper7[Data1, Data2, Data3, Data4, Data5, Data6, Data7], CaseClassHelper7[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper7[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7], CaseClassDataHelper7[Data1, Data2, Data3, Data4, Data5, Data6, Data7], RepCol, DataCol] {
      override type Target = CaseClassHelper7[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7]
      override def wrapRep(base: CaseClassHelper7[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7]): CaseClassHelper7[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7] = {
        new CaseClassHelper7(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7)
      }
      override def toLawRep(base: CaseClassHelper7[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7], oldRep: RepCol): RepCol = {
        val rep8 = oldRep
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper7[Data1, Data2, Data3, Data4, Data5, Data6, Data7], rep: CaseClassHelper7[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7], oldData: DataCol): DataCol = {
        val data8 = oldData
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper7DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper7[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7], CaseClassDataHelper7[Data1, Data2, Data3, Data4, Data5, Data6, Data7], CaseClassHelper7[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper7[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7], CaseClassDataHelper7[Data1, Data2, Data3, Data4, Data5, Data6, Data7], RepCol, DataCol] {
      override type Target = CaseClassHelper7[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7]
      override def wrapRep(base: CaseClassHelper7[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7]): CaseClassHelper7[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7] = {
        new CaseClassHelper7(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7)
      }
      override def toLawRep(base: CaseClassHelper7[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7], oldRep: RepCol): RepCol = {
        val rep8 = oldRep
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper7[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7], oldDataCol: DataCol): SplitData[CaseClassDataHelper7[Data1, Data2, Data3, Data4, Data5, Data6, Data7], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        SplitData(
          current = new CaseClassDataHelper7(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7),
          left = dataCol7)
      }
    }
  }
}
class CaseClassHelper8[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo) {
}
class CaseClassDataHelper8[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo) {
}
object CaseClassHelper8 {
  implicit def caseClassHelper8EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper8[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8], CaseClassDataHelper8[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8], CaseClassHelper8[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper8[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8], CaseClassDataHelper8[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8], RepCol, DataCol] {
      override type Target = CaseClassHelper8[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8]
      override def wrapRep(base: CaseClassHelper8[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8]): CaseClassHelper8[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8] = {
        new CaseClassHelper8(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8)
      }
      override def toLawRep(base: CaseClassHelper8[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8], oldRep: RepCol): RepCol = {
        val rep9 = oldRep
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper8[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8], rep: CaseClassHelper8[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8], oldData: DataCol): DataCol = {
        val data9 = oldData
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper8DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper8[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8], CaseClassDataHelper8[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8], CaseClassHelper8[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper8[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8], CaseClassDataHelper8[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8], RepCol, DataCol] {
      override type Target = CaseClassHelper8[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8]
      override def wrapRep(base: CaseClassHelper8[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8]): CaseClassHelper8[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8] = {
        new CaseClassHelper8(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8)
      }
      override def toLawRep(base: CaseClassHelper8[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8], oldRep: RepCol): RepCol = {
        val rep9 = oldRep
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper8[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8], oldDataCol: DataCol): SplitData[CaseClassDataHelper8[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        SplitData(
          current = new CaseClassDataHelper8(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8),
          left = dataCol8)
      }
    }
  }
}
class CaseClassHelper9[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo,
  val rep9: Rep9,
  val property9: PropertyType[Data9],
  val column9: MacroColumnInfo) {
}
class CaseClassDataHelper9[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo,
  val data9: Data9,
  val column9: MacroColumnInfo) {
}
object CaseClassHelper9 {
  implicit def caseClassHelper9EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper9[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9], CaseClassDataHelper9[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9], CaseClassHelper9[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper9[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9], CaseClassDataHelper9[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9], RepCol, DataCol] {
      override type Target = CaseClassHelper9[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9]
      override def wrapRep(base: CaseClassHelper9[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9]): CaseClassHelper9[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9] = {
        new CaseClassHelper9(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9)
      }
      override def toLawRep(base: CaseClassHelper9[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9], oldRep: RepCol): RepCol = {
        val rep10 = oldRep
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper9[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9], rep: CaseClassHelper9[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9], oldData: DataCol): DataCol = {
        val data10 = oldData
        val data9 = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper9DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper9[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9], CaseClassDataHelper9[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9], CaseClassHelper9[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper9[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9], CaseClassDataHelper9[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9], RepCol, DataCol] {
      override type Target = CaseClassHelper9[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9]
      override def wrapRep(base: CaseClassHelper9[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9]): CaseClassHelper9[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9] = {
        new CaseClassHelper9(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9)
      }
      override def toLawRep(base: CaseClassHelper9[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9], oldRep: RepCol): RepCol = {
        val rep10 = oldRep
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper9[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9], oldDataCol: DataCol): SplitData[CaseClassDataHelper9[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9) = shape9.value.takeData(rep.rep9, dataCol8)
        SplitData(
          current = new CaseClassDataHelper9(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8,
          data9 = item9,
          column9 = rep.column9),
          left = dataCol9)
      }
    }
  }
}
class CaseClassHelper10[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo,
  val rep9: Rep9,
  val property9: PropertyType[Data9],
  val column9: MacroColumnInfo,
  val rep10: Rep10,
  val property10: PropertyType[Data10],
  val column10: MacroColumnInfo) {
}
class CaseClassDataHelper10[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo,
  val data9: Data9,
  val column9: MacroColumnInfo,
  val data10: Data10,
  val column10: MacroColumnInfo) {
}
object CaseClassHelper10 {
  implicit def caseClassHelper10EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper10[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10], CaseClassDataHelper10[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10], CaseClassHelper10[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper10[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10], CaseClassDataHelper10[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10], RepCol, DataCol] {
      override type Target = CaseClassHelper10[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10]
      override def wrapRep(base: CaseClassHelper10[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10]): CaseClassHelper10[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10] = {
        new CaseClassHelper10(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10)
      }
      override def toLawRep(base: CaseClassHelper10[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10], oldRep: RepCol): RepCol = {
        val rep11 = oldRep
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper10[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10], rep: CaseClassHelper10[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10], oldData: DataCol): DataCol = {
        val data11 = oldData
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9 = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper10DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper10[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10], CaseClassDataHelper10[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10], CaseClassHelper10[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper10[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10], CaseClassDataHelper10[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10], RepCol, DataCol] {
      override type Target = CaseClassHelper10[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10]
      override def wrapRep(base: CaseClassHelper10[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10]): CaseClassHelper10[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10] = {
        new CaseClassHelper10(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10)
      }
      override def toLawRep(base: CaseClassHelper10[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10], oldRep: RepCol): RepCol = {
        val rep11 = oldRep
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper10[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10], oldDataCol: DataCol): SplitData[CaseClassDataHelper10[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9) = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        SplitData(
          current = new CaseClassDataHelper10(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8,
          data9 = item9,
          column9 = rep.column9,
          data10 = item10,
          column10 = rep.column10),
          left = dataCol10)
      }
    }
  }
}
class CaseClassHelper11[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo,
  val rep9: Rep9,
  val property9: PropertyType[Data9],
  val column9: MacroColumnInfo,
  val rep10: Rep10,
  val property10: PropertyType[Data10],
  val column10: MacroColumnInfo,
  val rep11: Rep11,
  val property11: PropertyType[Data11],
  val column11: MacroColumnInfo) {
}
class CaseClassDataHelper11[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo,
  val data9: Data9,
  val column9: MacroColumnInfo,
  val data10: Data10,
  val column10: MacroColumnInfo,
  val data11: Data11,
  val column11: MacroColumnInfo) {
}
object CaseClassHelper11 {
  implicit def caseClassHelper11EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper11[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11], CaseClassDataHelper11[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11], CaseClassHelper11[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper11[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11], CaseClassDataHelper11[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11], RepCol, DataCol] {
      override type Target = CaseClassHelper11[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11]
      override def wrapRep(base: CaseClassHelper11[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11]): CaseClassHelper11[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11] = {
        new CaseClassHelper11(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11)
      }
      override def toLawRep(base: CaseClassHelper11[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11], oldRep: RepCol): RepCol = {
        val rep12 = oldRep
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper11[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11], rep: CaseClassHelper11[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11], oldData: DataCol): DataCol = {
        val data12 = oldData
        val data11 = shape11.value.buildData(data.data11, rep.rep11, data12)
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9 = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper11DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper11[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11], CaseClassDataHelper11[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11], CaseClassHelper11[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper11[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11], CaseClassDataHelper11[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11], RepCol, DataCol] {
      override type Target = CaseClassHelper11[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11]
      override def wrapRep(base: CaseClassHelper11[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11]): CaseClassHelper11[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11] = {
        new CaseClassHelper11(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11)
      }
      override def toLawRep(base: CaseClassHelper11[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11], oldRep: RepCol): RepCol = {
        val rep12 = oldRep
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper11[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11], oldDataCol: DataCol): SplitData[CaseClassDataHelper11[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9) = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        val SplitData(item11, dataCol11) = shape11.value.takeData(rep.rep11, dataCol10)
        SplitData(
          current = new CaseClassDataHelper11(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8,
          data9 = item9,
          column9 = rep.column9,
          data10 = item10,
          column10 = rep.column10,
          data11 = item11,
          column11 = rep.column11),
          left = dataCol11)
      }
    }
  }
}
class CaseClassHelper12[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo,
  val rep9: Rep9,
  val property9: PropertyType[Data9],
  val column9: MacroColumnInfo,
  val rep10: Rep10,
  val property10: PropertyType[Data10],
  val column10: MacroColumnInfo,
  val rep11: Rep11,
  val property11: PropertyType[Data11],
  val column11: MacroColumnInfo,
  val rep12: Rep12,
  val property12: PropertyType[Data12],
  val column12: MacroColumnInfo) {
}
class CaseClassDataHelper12[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo,
  val data9: Data9,
  val column9: MacroColumnInfo,
  val data10: Data10,
  val column10: MacroColumnInfo,
  val data11: Data11,
  val column11: MacroColumnInfo,
  val data12: Data12,
  val column12: MacroColumnInfo) {
}
object CaseClassHelper12 {
  implicit def caseClassHelper12EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper12[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12], CaseClassDataHelper12[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12], CaseClassHelper12[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper12[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12], CaseClassDataHelper12[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12], RepCol, DataCol] {
      override type Target = CaseClassHelper12[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12]
      override def wrapRep(base: CaseClassHelper12[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12]): CaseClassHelper12[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12] = {
        new CaseClassHelper12(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12)
      }
      override def toLawRep(base: CaseClassHelper12[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12], oldRep: RepCol): RepCol = {
        val rep13 = oldRep
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper12[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12], rep: CaseClassHelper12[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12], oldData: DataCol): DataCol = {
        val data13 = oldData
        val data12 = shape12.value.buildData(data.data12, rep.rep12, data13)
        val data11 = shape11.value.buildData(data.data11, rep.rep11, data12)
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9 = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper12DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper12[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12], CaseClassDataHelper12[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12], CaseClassHelper12[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper12[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12], CaseClassDataHelper12[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12], RepCol, DataCol] {
      override type Target = CaseClassHelper12[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12]
      override def wrapRep(base: CaseClassHelper12[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12]): CaseClassHelper12[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12] = {
        new CaseClassHelper12(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12)
      }
      override def toLawRep(base: CaseClassHelper12[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12], oldRep: RepCol): RepCol = {
        val rep13 = oldRep
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper12[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12], oldDataCol: DataCol): SplitData[CaseClassDataHelper12[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9) = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        val SplitData(item11, dataCol11) = shape11.value.takeData(rep.rep11, dataCol10)
        val SplitData(item12, dataCol12) = shape12.value.takeData(rep.rep12, dataCol11)
        SplitData(
          current = new CaseClassDataHelper12(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8,
          data9 = item9,
          column9 = rep.column9,
          data10 = item10,
          column10 = rep.column10,
          data11 = item11,
          column11 = rep.column11,
          data12 = item12,
          column12 = rep.column12),
          left = dataCol12)
      }
    }
  }
}
class CaseClassHelper13[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo,
  val rep9: Rep9,
  val property9: PropertyType[Data9],
  val column9: MacroColumnInfo,
  val rep10: Rep10,
  val property10: PropertyType[Data10],
  val column10: MacroColumnInfo,
  val rep11: Rep11,
  val property11: PropertyType[Data11],
  val column11: MacroColumnInfo,
  val rep12: Rep12,
  val property12: PropertyType[Data12],
  val column12: MacroColumnInfo,
  val rep13: Rep13,
  val property13: PropertyType[Data13],
  val column13: MacroColumnInfo) {
}
class CaseClassDataHelper13[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo,
  val data9: Data9,
  val column9: MacroColumnInfo,
  val data10: Data10,
  val column10: MacroColumnInfo,
  val data11: Data11,
  val column11: MacroColumnInfo,
  val data12: Data12,
  val column12: MacroColumnInfo,
  val data13: Data13,
  val column13: MacroColumnInfo) {
}
object CaseClassHelper13 {
  implicit def caseClassHelper13EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[EncoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper13[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13], CaseClassDataHelper13[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13], CaseClassHelper13[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper13[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13], CaseClassDataHelper13[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13], RepCol, DataCol] {
      override type Target = CaseClassHelper13[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13]
      override def wrapRep(base: CaseClassHelper13[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13]): CaseClassHelper13[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13] = {
        new CaseClassHelper13(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13)
      }
      override def toLawRep(base: CaseClassHelper13[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13], oldRep: RepCol): RepCol = {
        val rep14 = oldRep
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper13[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13], rep: CaseClassHelper13[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13], oldData: DataCol): DataCol = {
        val data14 = oldData
        val data13 = shape13.value.buildData(data.data13, rep.rep13, data14)
        val data12 = shape12.value.buildData(data.data12, rep.rep12, data13)
        val data11 = shape11.value.buildData(data.data11, rep.rep11, data12)
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9 = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper13DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[DecoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper13[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13], CaseClassDataHelper13[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13], CaseClassHelper13[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper13[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13], CaseClassDataHelper13[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13], RepCol, DataCol] {
      override type Target = CaseClassHelper13[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13]
      override def wrapRep(base: CaseClassHelper13[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13]): CaseClassHelper13[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13] = {
        new CaseClassHelper13(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13)
      }
      override def toLawRep(base: CaseClassHelper13[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13], oldRep: RepCol): RepCol = {
        val rep14 = oldRep
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper13[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13], oldDataCol: DataCol): SplitData[CaseClassDataHelper13[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9) = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        val SplitData(item11, dataCol11) = shape11.value.takeData(rep.rep11, dataCol10)
        val SplitData(item12, dataCol12) = shape12.value.takeData(rep.rep12, dataCol11)
        val SplitData(item13, dataCol13) = shape13.value.takeData(rep.rep13, dataCol12)
        SplitData(
          current = new CaseClassDataHelper13(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8,
          data9 = item9,
          column9 = rep.column9,
          data10 = item10,
          column10 = rep.column10,
          data11 = item11,
          column11 = rep.column11,
          data12 = item12,
          column12 = rep.column12,
          data13 = item13,
          column13 = rep.column13),
          left = dataCol13)
      }
    }
  }
}
class CaseClassHelper14[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo,
  val rep9: Rep9,
  val property9: PropertyType[Data9],
  val column9: MacroColumnInfo,
  val rep10: Rep10,
  val property10: PropertyType[Data10],
  val column10: MacroColumnInfo,
  val rep11: Rep11,
  val property11: PropertyType[Data11],
  val column11: MacroColumnInfo,
  val rep12: Rep12,
  val property12: PropertyType[Data12],
  val column12: MacroColumnInfo,
  val rep13: Rep13,
  val property13: PropertyType[Data13],
  val column13: MacroColumnInfo,
  val rep14: Rep14,
  val property14: PropertyType[Data14],
  val column14: MacroColumnInfo) {
}
class CaseClassDataHelper14[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo,
  val data9: Data9,
  val column9: MacroColumnInfo,
  val data10: Data10,
  val column10: MacroColumnInfo,
  val data11: Data11,
  val column11: MacroColumnInfo,
  val data12: Data12,
  val column12: MacroColumnInfo,
  val data13: Data13,
  val column13: MacroColumnInfo,
  val data14: Data14,
  val column14: MacroColumnInfo) {
}
object CaseClassHelper14 {
  implicit def caseClassHelper14EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[EncoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[EncoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper14[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14], CaseClassDataHelper14[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14], CaseClassHelper14[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper14[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14], CaseClassDataHelper14[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14], RepCol, DataCol] {
      override type Target = CaseClassHelper14[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14]
      override def wrapRep(base: CaseClassHelper14[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14]): CaseClassHelper14[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14] = {
        new CaseClassHelper14(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14)
      }
      override def toLawRep(base: CaseClassHelper14[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14], oldRep: RepCol): RepCol = {
        val rep15 = oldRep
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper14[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14], rep: CaseClassHelper14[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14], oldData: DataCol): DataCol = {
        val data15 = oldData
        val data14 = shape14.value.buildData(data.data14, rep.rep14, data15)
        val data13 = shape13.value.buildData(data.data13, rep.rep13, data14)
        val data12 = shape12.value.buildData(data.data12, rep.rep12, data13)
        val data11 = shape11.value.buildData(data.data11, rep.rep11, data12)
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9 = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper14DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[DecoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[DecoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper14[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14], CaseClassDataHelper14[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14], CaseClassHelper14[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper14[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14], CaseClassDataHelper14[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14], RepCol, DataCol] {
      override type Target = CaseClassHelper14[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14]
      override def wrapRep(base: CaseClassHelper14[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14]): CaseClassHelper14[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14] = {
        new CaseClassHelper14(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14)
      }
      override def toLawRep(base: CaseClassHelper14[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14], oldRep: RepCol): RepCol = {
        val rep15 = oldRep
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper14[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14], oldDataCol: DataCol): SplitData[CaseClassDataHelper14[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9) = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        val SplitData(item11, dataCol11) = shape11.value.takeData(rep.rep11, dataCol10)
        val SplitData(item12, dataCol12) = shape12.value.takeData(rep.rep12, dataCol11)
        val SplitData(item13, dataCol13) = shape13.value.takeData(rep.rep13, dataCol12)
        val SplitData(item14, dataCol14) = shape14.value.takeData(rep.rep14, dataCol13)
        SplitData(
          current = new CaseClassDataHelper14(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8,
          data9 = item9,
          column9 = rep.column9,
          data10 = item10,
          column10 = rep.column10,
          data11 = item11,
          column11 = rep.column11,
          data12 = item12,
          column12 = rep.column12,
          data13 = item13,
          column13 = rep.column13,
          data14 = item14,
          column14 = rep.column14),
          left = dataCol14)
      }
    }
  }
}
class CaseClassHelper15[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo,
  val rep9: Rep9,
  val property9: PropertyType[Data9],
  val column9: MacroColumnInfo,
  val rep10: Rep10,
  val property10: PropertyType[Data10],
  val column10: MacroColumnInfo,
  val rep11: Rep11,
  val property11: PropertyType[Data11],
  val column11: MacroColumnInfo,
  val rep12: Rep12,
  val property12: PropertyType[Data12],
  val column12: MacroColumnInfo,
  val rep13: Rep13,
  val property13: PropertyType[Data13],
  val column13: MacroColumnInfo,
  val rep14: Rep14,
  val property14: PropertyType[Data14],
  val column14: MacroColumnInfo,
  val rep15: Rep15,
  val property15: PropertyType[Data15],
  val column15: MacroColumnInfo) {
}
class CaseClassDataHelper15[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo,
  val data9: Data9,
  val column9: MacroColumnInfo,
  val data10: Data10,
  val column10: MacroColumnInfo,
  val data11: Data11,
  val column11: MacroColumnInfo,
  val data12: Data12,
  val column12: MacroColumnInfo,
  val data13: Data13,
  val column13: MacroColumnInfo,
  val data14: Data14,
  val column14: MacroColumnInfo,
  val data15: Data15,
  val column15: MacroColumnInfo) {
}
object CaseClassHelper15 {
  implicit def caseClassHelper15EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[EncoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[EncoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[EncoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper15[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15], CaseClassDataHelper15[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15], CaseClassHelper15[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper15[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15], CaseClassDataHelper15[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15], RepCol, DataCol] {
      override type Target = CaseClassHelper15[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15]
      override def wrapRep(base: CaseClassHelper15[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15]): CaseClassHelper15[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15] = {
        new CaseClassHelper15(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15)
      }
      override def toLawRep(base: CaseClassHelper15[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15], oldRep: RepCol): RepCol = {
        val rep16 = oldRep
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper15[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15], rep: CaseClassHelper15[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15], oldData: DataCol): DataCol = {
        val data16 = oldData
        val data15 = shape15.value.buildData(data.data15, rep.rep15, data16)
        val data14 = shape14.value.buildData(data.data14, rep.rep14, data15)
        val data13 = shape13.value.buildData(data.data13, rep.rep13, data14)
        val data12 = shape12.value.buildData(data.data12, rep.rep12, data13)
        val data11 = shape11.value.buildData(data.data11, rep.rep11, data12)
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9 = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper15DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[DecoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[DecoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[DecoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper15[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15], CaseClassDataHelper15[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15], CaseClassHelper15[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper15[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15], CaseClassDataHelper15[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15], RepCol, DataCol] {
      override type Target = CaseClassHelper15[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15]
      override def wrapRep(base: CaseClassHelper15[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15]): CaseClassHelper15[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15] = {
        new CaseClassHelper15(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15)
      }
      override def toLawRep(base: CaseClassHelper15[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15], oldRep: RepCol): RepCol = {
        val rep16 = oldRep
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper15[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15], oldDataCol: DataCol): SplitData[CaseClassDataHelper15[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9) = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        val SplitData(item11, dataCol11) = shape11.value.takeData(rep.rep11, dataCol10)
        val SplitData(item12, dataCol12) = shape12.value.takeData(rep.rep12, dataCol11)
        val SplitData(item13, dataCol13) = shape13.value.takeData(rep.rep13, dataCol12)
        val SplitData(item14, dataCol14) = shape14.value.takeData(rep.rep14, dataCol13)
        val SplitData(item15, dataCol15) = shape15.value.takeData(rep.rep15, dataCol14)
        SplitData(
          current = new CaseClassDataHelper15(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8,
          data9 = item9,
          column9 = rep.column9,
          data10 = item10,
          column10 = rep.column10,
          data11 = item11,
          column11 = rep.column11,
          data12 = item12,
          column12 = rep.column12,
          data13 = item13,
          column13 = rep.column13,
          data14 = item14,
          column14 = rep.column14,
          data15 = item15,
          column15 = rep.column15),
          left = dataCol15)
      }
    }
  }
}
class CaseClassHelper16[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo,
  val rep9: Rep9,
  val property9: PropertyType[Data9],
  val column9: MacroColumnInfo,
  val rep10: Rep10,
  val property10: PropertyType[Data10],
  val column10: MacroColumnInfo,
  val rep11: Rep11,
  val property11: PropertyType[Data11],
  val column11: MacroColumnInfo,
  val rep12: Rep12,
  val property12: PropertyType[Data12],
  val column12: MacroColumnInfo,
  val rep13: Rep13,
  val property13: PropertyType[Data13],
  val column13: MacroColumnInfo,
  val rep14: Rep14,
  val property14: PropertyType[Data14],
  val column14: MacroColumnInfo,
  val rep15: Rep15,
  val property15: PropertyType[Data15],
  val column15: MacroColumnInfo,
  val rep16: Rep16,
  val property16: PropertyType[Data16],
  val column16: MacroColumnInfo) {
}
class CaseClassDataHelper16[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo,
  val data9: Data9,
  val column9: MacroColumnInfo,
  val data10: Data10,
  val column10: MacroColumnInfo,
  val data11: Data11,
  val column11: MacroColumnInfo,
  val data12: Data12,
  val column12: MacroColumnInfo,
  val data13: Data13,
  val column13: MacroColumnInfo,
  val data14: Data14,
  val column14: MacroColumnInfo,
  val data15: Data15,
  val column15: MacroColumnInfo,
  val data16: Data16,
  val column16: MacroColumnInfo) {
}
object CaseClassHelper16 {
  implicit def caseClassHelper16EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, Rep16, Data16, Target16, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[EncoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[EncoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[EncoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]],
    shape16: Lazy[EncoderShape.Aux[Rep16, Data16, Target16, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper16[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16], CaseClassDataHelper16[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16], CaseClassHelper16[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper16[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16], CaseClassDataHelper16[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16], RepCol, DataCol] {
      override type Target = CaseClassHelper16[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16]
      override def wrapRep(base: CaseClassHelper16[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16]): CaseClassHelper16[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16] = {
        new CaseClassHelper16(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15,
          rep16 = shape16.value.wrapRep(base.rep16),
          property16 = base.property16,
          column16 = base.column16)
      }
      override def toLawRep(base: CaseClassHelper16[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16], oldRep: RepCol): RepCol = {
        val rep17 = oldRep
        val rep16 = shape16.value.toLawRep(base.rep16, rep17)
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper16[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16], rep: CaseClassHelper16[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16], oldData: DataCol): DataCol = {
        val data17 = oldData
        val data16 = shape16.value.buildData(data.data16, rep.rep16, data17)
        val data15 = shape15.value.buildData(data.data15, rep.rep15, data16)
        val data14 = shape14.value.buildData(data.data14, rep.rep14, data15)
        val data13 = shape13.value.buildData(data.data13, rep.rep13, data14)
        val data12 = shape12.value.buildData(data.data12, rep.rep12, data13)
        val data11 = shape11.value.buildData(data.data11, rep.rep11, data12)
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9 = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper16DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, Rep16, Data16, Target16, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[DecoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[DecoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[DecoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]],
    shape16: Lazy[DecoderShape.Aux[Rep16, Data16, Target16, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper16[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16], CaseClassDataHelper16[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16], CaseClassHelper16[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper16[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16], CaseClassDataHelper16[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16], RepCol, DataCol] {
      override type Target = CaseClassHelper16[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16]
      override def wrapRep(base: CaseClassHelper16[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16]): CaseClassHelper16[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16] = {
        new CaseClassHelper16(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15,
          rep16 = shape16.value.wrapRep(base.rep16),
          property16 = base.property16,
          column16 = base.column16)
      }
      override def toLawRep(base: CaseClassHelper16[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16], oldRep: RepCol): RepCol = {
        val rep17 = oldRep
        val rep16 = shape16.value.toLawRep(base.rep16, rep17)
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper16[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16], oldDataCol: DataCol): SplitData[CaseClassDataHelper16[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9) = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        val SplitData(item11, dataCol11) = shape11.value.takeData(rep.rep11, dataCol10)
        val SplitData(item12, dataCol12) = shape12.value.takeData(rep.rep12, dataCol11)
        val SplitData(item13, dataCol13) = shape13.value.takeData(rep.rep13, dataCol12)
        val SplitData(item14, dataCol14) = shape14.value.takeData(rep.rep14, dataCol13)
        val SplitData(item15, dataCol15) = shape15.value.takeData(rep.rep15, dataCol14)
        val SplitData(item16, dataCol16) = shape16.value.takeData(rep.rep16, dataCol15)
        SplitData(
          current = new CaseClassDataHelper16(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8,
          data9 = item9,
          column9 = rep.column9,
          data10 = item10,
          column10 = rep.column10,
          data11 = item11,
          column11 = rep.column11,
          data12 = item12,
          column12 = rep.column12,
          data13 = item13,
          column13 = rep.column13,
          data14 = item14,
          column14 = rep.column14,
          data15 = item15,
          column15 = rep.column15,
          data16 = item16,
          column16 = rep.column16),
          left = dataCol16)
      }
    }
  }
}
class CaseClassHelper17[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo,
  val rep9: Rep9,
  val property9: PropertyType[Data9],
  val column9: MacroColumnInfo,
  val rep10: Rep10,
  val property10: PropertyType[Data10],
  val column10: MacroColumnInfo,
  val rep11: Rep11,
  val property11: PropertyType[Data11],
  val column11: MacroColumnInfo,
  val rep12: Rep12,
  val property12: PropertyType[Data12],
  val column12: MacroColumnInfo,
  val rep13: Rep13,
  val property13: PropertyType[Data13],
  val column13: MacroColumnInfo,
  val rep14: Rep14,
  val property14: PropertyType[Data14],
  val column14: MacroColumnInfo,
  val rep15: Rep15,
  val property15: PropertyType[Data15],
  val column15: MacroColumnInfo,
  val rep16: Rep16,
  val property16: PropertyType[Data16],
  val column16: MacroColumnInfo,
  val rep17: Rep17,
  val property17: PropertyType[Data17],
  val column17: MacroColumnInfo) {
}
class CaseClassDataHelper17[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo,
  val data9: Data9,
  val column9: MacroColumnInfo,
  val data10: Data10,
  val column10: MacroColumnInfo,
  val data11: Data11,
  val column11: MacroColumnInfo,
  val data12: Data12,
  val column12: MacroColumnInfo,
  val data13: Data13,
  val column13: MacroColumnInfo,
  val data14: Data14,
  val column14: MacroColumnInfo,
  val data15: Data15,
  val column15: MacroColumnInfo,
  val data16: Data16,
  val column16: MacroColumnInfo,
  val data17: Data17,
  val column17: MacroColumnInfo) {
}
object CaseClassHelper17 {
  implicit def caseClassHelper17EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, Rep16, Data16, Target16, Rep17, Data17, Target17, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[EncoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[EncoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[EncoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]],
    shape16: Lazy[EncoderShape.Aux[Rep16, Data16, Target16, RepCol, DataCol]],
    shape17: Lazy[EncoderShape.Aux[Rep17, Data17, Target17, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper17[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17], CaseClassDataHelper17[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17], CaseClassHelper17[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper17[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17], CaseClassDataHelper17[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17], RepCol, DataCol] {
      override type Target = CaseClassHelper17[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17]
      override def wrapRep(base: CaseClassHelper17[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17]): CaseClassHelper17[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17] = {
        new CaseClassHelper17(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15,
          rep16 = shape16.value.wrapRep(base.rep16),
          property16 = base.property16,
          column16 = base.column16,
          rep17 = shape17.value.wrapRep(base.rep17),
          property17 = base.property17,
          column17 = base.column17)
      }
      override def toLawRep(base: CaseClassHelper17[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17], oldRep: RepCol): RepCol = {
        val rep18 = oldRep
        val rep17 = shape17.value.toLawRep(base.rep17, rep18)
        val rep16 = shape16.value.toLawRep(base.rep16, rep17)
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper17[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17], rep: CaseClassHelper17[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17], oldData: DataCol): DataCol = {
        val data18 = oldData
        val data17 = shape17.value.buildData(data.data17, rep.rep17, data18)
        val data16 = shape16.value.buildData(data.data16, rep.rep16, data17)
        val data15 = shape15.value.buildData(data.data15, rep.rep15, data16)
        val data14 = shape14.value.buildData(data.data14, rep.rep14, data15)
        val data13 = shape13.value.buildData(data.data13, rep.rep13, data14)
        val data12 = shape12.value.buildData(data.data12, rep.rep12, data13)
        val data11 = shape11.value.buildData(data.data11, rep.rep11, data12)
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9 = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper17DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, Rep16, Data16, Target16, Rep17, Data17, Target17, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[DecoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[DecoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[DecoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]],
    shape16: Lazy[DecoderShape.Aux[Rep16, Data16, Target16, RepCol, DataCol]],
    shape17: Lazy[DecoderShape.Aux[Rep17, Data17, Target17, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper17[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17], CaseClassDataHelper17[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17], CaseClassHelper17[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper17[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17], CaseClassDataHelper17[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17], RepCol, DataCol] {
      override type Target = CaseClassHelper17[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17]
      override def wrapRep(base: CaseClassHelper17[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17]): CaseClassHelper17[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17] = {
        new CaseClassHelper17(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15,
          rep16 = shape16.value.wrapRep(base.rep16),
          property16 = base.property16,
          column16 = base.column16,
          rep17 = shape17.value.wrapRep(base.rep17),
          property17 = base.property17,
          column17 = base.column17)
      }
      override def toLawRep(base: CaseClassHelper17[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17], oldRep: RepCol): RepCol = {
        val rep18 = oldRep
        val rep17 = shape17.value.toLawRep(base.rep17, rep18)
        val rep16 = shape16.value.toLawRep(base.rep16, rep17)
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper17[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17], oldDataCol: DataCol): SplitData[CaseClassDataHelper17[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9) = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        val SplitData(item11, dataCol11) = shape11.value.takeData(rep.rep11, dataCol10)
        val SplitData(item12, dataCol12) = shape12.value.takeData(rep.rep12, dataCol11)
        val SplitData(item13, dataCol13) = shape13.value.takeData(rep.rep13, dataCol12)
        val SplitData(item14, dataCol14) = shape14.value.takeData(rep.rep14, dataCol13)
        val SplitData(item15, dataCol15) = shape15.value.takeData(rep.rep15, dataCol14)
        val SplitData(item16, dataCol16) = shape16.value.takeData(rep.rep16, dataCol15)
        val SplitData(item17, dataCol17) = shape17.value.takeData(rep.rep17, dataCol16)
        SplitData(
          current = new CaseClassDataHelper17(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8,
          data9 = item9,
          column9 = rep.column9,
          data10 = item10,
          column10 = rep.column10,
          data11 = item11,
          column11 = rep.column11,
          data12 = item12,
          column12 = rep.column12,
          data13 = item13,
          column13 = rep.column13,
          data14 = item14,
          column14 = rep.column14,
          data15 = item15,
          column15 = rep.column15,
          data16 = item16,
          column16 = rep.column16,
          data17 = item17,
          column17 = rep.column17),
          left = dataCol17)
      }
    }
  }
}
class CaseClassHelper18[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo,
  val rep9: Rep9,
  val property9: PropertyType[Data9],
  val column9: MacroColumnInfo,
  val rep10: Rep10,
  val property10: PropertyType[Data10],
  val column10: MacroColumnInfo,
  val rep11: Rep11,
  val property11: PropertyType[Data11],
  val column11: MacroColumnInfo,
  val rep12: Rep12,
  val property12: PropertyType[Data12],
  val column12: MacroColumnInfo,
  val rep13: Rep13,
  val property13: PropertyType[Data13],
  val column13: MacroColumnInfo,
  val rep14: Rep14,
  val property14: PropertyType[Data14],
  val column14: MacroColumnInfo,
  val rep15: Rep15,
  val property15: PropertyType[Data15],
  val column15: MacroColumnInfo,
  val rep16: Rep16,
  val property16: PropertyType[Data16],
  val column16: MacroColumnInfo,
  val rep17: Rep17,
  val property17: PropertyType[Data17],
  val column17: MacroColumnInfo,
  val rep18: Rep18,
  val property18: PropertyType[Data18],
  val column18: MacroColumnInfo) {
}
class CaseClassDataHelper18[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo,
  val data9: Data9,
  val column9: MacroColumnInfo,
  val data10: Data10,
  val column10: MacroColumnInfo,
  val data11: Data11,
  val column11: MacroColumnInfo,
  val data12: Data12,
  val column12: MacroColumnInfo,
  val data13: Data13,
  val column13: MacroColumnInfo,
  val data14: Data14,
  val column14: MacroColumnInfo,
  val data15: Data15,
  val column15: MacroColumnInfo,
  val data16: Data16,
  val column16: MacroColumnInfo,
  val data17: Data17,
  val column17: MacroColumnInfo,
  val data18: Data18,
  val column18: MacroColumnInfo) {
}
object CaseClassHelper18 {
  implicit def caseClassHelper18EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, Rep16, Data16, Target16, Rep17, Data17, Target17, Rep18, Data18, Target18, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[EncoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[EncoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[EncoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]],
    shape16: Lazy[EncoderShape.Aux[Rep16, Data16, Target16, RepCol, DataCol]],
    shape17: Lazy[EncoderShape.Aux[Rep17, Data17, Target17, RepCol, DataCol]],
    shape18: Lazy[EncoderShape.Aux[Rep18, Data18, Target18, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper18[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18], CaseClassDataHelper18[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18], CaseClassHelper18[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper18[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18], CaseClassDataHelper18[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18], RepCol, DataCol] {
      override type Target = CaseClassHelper18[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18]
      override def wrapRep(base: CaseClassHelper18[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18]): CaseClassHelper18[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18] = {
        new CaseClassHelper18(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15,
          rep16 = shape16.value.wrapRep(base.rep16),
          property16 = base.property16,
          column16 = base.column16,
          rep17 = shape17.value.wrapRep(base.rep17),
          property17 = base.property17,
          column17 = base.column17,
          rep18 = shape18.value.wrapRep(base.rep18),
          property18 = base.property18,
          column18 = base.column18)
      }
      override def toLawRep(base: CaseClassHelper18[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18], oldRep: RepCol): RepCol = {
        val rep19 = oldRep
        val rep18 = shape18.value.toLawRep(base.rep18, rep19)
        val rep17 = shape17.value.toLawRep(base.rep17, rep18)
        val rep16 = shape16.value.toLawRep(base.rep16, rep17)
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper18[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18], rep: CaseClassHelper18[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18], oldData: DataCol): DataCol = {
        val data19 = oldData
        val data18 = shape18.value.buildData(data.data18, rep.rep18, data19)
        val data17 = shape17.value.buildData(data.data17, rep.rep17, data18)
        val data16 = shape16.value.buildData(data.data16, rep.rep16, data17)
        val data15 = shape15.value.buildData(data.data15, rep.rep15, data16)
        val data14 = shape14.value.buildData(data.data14, rep.rep14, data15)
        val data13 = shape13.value.buildData(data.data13, rep.rep13, data14)
        val data12 = shape12.value.buildData(data.data12, rep.rep12, data13)
        val data11 = shape11.value.buildData(data.data11, rep.rep11, data12)
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9 = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper18DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, Rep16, Data16, Target16, Rep17, Data17, Target17, Rep18, Data18, Target18, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[DecoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[DecoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[DecoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]],
    shape16: Lazy[DecoderShape.Aux[Rep16, Data16, Target16, RepCol, DataCol]],
    shape17: Lazy[DecoderShape.Aux[Rep17, Data17, Target17, RepCol, DataCol]],
    shape18: Lazy[DecoderShape.Aux[Rep18, Data18, Target18, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper18[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18], CaseClassDataHelper18[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18], CaseClassHelper18[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper18[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18], CaseClassDataHelper18[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18], RepCol, DataCol] {
      override type Target = CaseClassHelper18[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18]
      override def wrapRep(base: CaseClassHelper18[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18]): CaseClassHelper18[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18] = {
        new CaseClassHelper18(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15,
          rep16 = shape16.value.wrapRep(base.rep16),
          property16 = base.property16,
          column16 = base.column16,
          rep17 = shape17.value.wrapRep(base.rep17),
          property17 = base.property17,
          column17 = base.column17,
          rep18 = shape18.value.wrapRep(base.rep18),
          property18 = base.property18,
          column18 = base.column18)
      }
      override def toLawRep(base: CaseClassHelper18[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18], oldRep: RepCol): RepCol = {
        val rep19 = oldRep
        val rep18 = shape18.value.toLawRep(base.rep18, rep19)
        val rep17 = shape17.value.toLawRep(base.rep17, rep18)
        val rep16 = shape16.value.toLawRep(base.rep16, rep17)
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper18[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18], oldDataCol: DataCol): SplitData[CaseClassDataHelper18[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9) = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        val SplitData(item11, dataCol11) = shape11.value.takeData(rep.rep11, dataCol10)
        val SplitData(item12, dataCol12) = shape12.value.takeData(rep.rep12, dataCol11)
        val SplitData(item13, dataCol13) = shape13.value.takeData(rep.rep13, dataCol12)
        val SplitData(item14, dataCol14) = shape14.value.takeData(rep.rep14, dataCol13)
        val SplitData(item15, dataCol15) = shape15.value.takeData(rep.rep15, dataCol14)
        val SplitData(item16, dataCol16) = shape16.value.takeData(rep.rep16, dataCol15)
        val SplitData(item17, dataCol17) = shape17.value.takeData(rep.rep17, dataCol16)
        val SplitData(item18, dataCol18) = shape18.value.takeData(rep.rep18, dataCol17)
        SplitData(
          current = new CaseClassDataHelper18(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8,
          data9 = item9,
          column9 = rep.column9,
          data10 = item10,
          column10 = rep.column10,
          data11 = item11,
          column11 = rep.column11,
          data12 = item12,
          column12 = rep.column12,
          data13 = item13,
          column13 = rep.column13,
          data14 = item14,
          column14 = rep.column14,
          data15 = item15,
          column15 = rep.column15,
          data16 = item16,
          column16 = rep.column16,
          data17 = item17,
          column17 = rep.column17,
          data18 = item18,
          column18 = rep.column18),
          left = dataCol18)
      }
    }
  }
}
class CaseClassHelper19[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo,
  val rep9: Rep9,
  val property9: PropertyType[Data9],
  val column9: MacroColumnInfo,
  val rep10: Rep10,
  val property10: PropertyType[Data10],
  val column10: MacroColumnInfo,
  val rep11: Rep11,
  val property11: PropertyType[Data11],
  val column11: MacroColumnInfo,
  val rep12: Rep12,
  val property12: PropertyType[Data12],
  val column12: MacroColumnInfo,
  val rep13: Rep13,
  val property13: PropertyType[Data13],
  val column13: MacroColumnInfo,
  val rep14: Rep14,
  val property14: PropertyType[Data14],
  val column14: MacroColumnInfo,
  val rep15: Rep15,
  val property15: PropertyType[Data15],
  val column15: MacroColumnInfo,
  val rep16: Rep16,
  val property16: PropertyType[Data16],
  val column16: MacroColumnInfo,
  val rep17: Rep17,
  val property17: PropertyType[Data17],
  val column17: MacroColumnInfo,
  val rep18: Rep18,
  val property18: PropertyType[Data18],
  val column18: MacroColumnInfo,
  val rep19: Rep19,
  val property19: PropertyType[Data19],
  val column19: MacroColumnInfo) {
}
class CaseClassDataHelper19[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo,
  val data9: Data9,
  val column9: MacroColumnInfo,
  val data10: Data10,
  val column10: MacroColumnInfo,
  val data11: Data11,
  val column11: MacroColumnInfo,
  val data12: Data12,
  val column12: MacroColumnInfo,
  val data13: Data13,
  val column13: MacroColumnInfo,
  val data14: Data14,
  val column14: MacroColumnInfo,
  val data15: Data15,
  val column15: MacroColumnInfo,
  val data16: Data16,
  val column16: MacroColumnInfo,
  val data17: Data17,
  val column17: MacroColumnInfo,
  val data18: Data18,
  val column18: MacroColumnInfo,
  val data19: Data19,
  val column19: MacroColumnInfo) {
}
object CaseClassHelper19 {
  implicit def caseClassHelper19EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, Rep16, Data16, Target16, Rep17, Data17, Target17, Rep18, Data18, Target18, Rep19, Data19, Target19, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[EncoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[EncoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[EncoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]],
    shape16: Lazy[EncoderShape.Aux[Rep16, Data16, Target16, RepCol, DataCol]],
    shape17: Lazy[EncoderShape.Aux[Rep17, Data17, Target17, RepCol, DataCol]],
    shape18: Lazy[EncoderShape.Aux[Rep18, Data18, Target18, RepCol, DataCol]],
    shape19: Lazy[EncoderShape.Aux[Rep19, Data19, Target19, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper19[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19], CaseClassDataHelper19[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19], CaseClassHelper19[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper19[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19], CaseClassDataHelper19[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19], RepCol, DataCol] {
      override type Target = CaseClassHelper19[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19]
      override def wrapRep(base: CaseClassHelper19[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19]): CaseClassHelper19[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19] = {
        new CaseClassHelper19(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15,
          rep16 = shape16.value.wrapRep(base.rep16),
          property16 = base.property16,
          column16 = base.column16,
          rep17 = shape17.value.wrapRep(base.rep17),
          property17 = base.property17,
          column17 = base.column17,
          rep18 = shape18.value.wrapRep(base.rep18),
          property18 = base.property18,
          column18 = base.column18,
          rep19 = shape19.value.wrapRep(base.rep19),
          property19 = base.property19,
          column19 = base.column19)
      }
      override def toLawRep(base: CaseClassHelper19[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19], oldRep: RepCol): RepCol = {
        val rep20 = oldRep
        val rep19 = shape19.value.toLawRep(base.rep19, rep20)
        val rep18 = shape18.value.toLawRep(base.rep18, rep19)
        val rep17 = shape17.value.toLawRep(base.rep17, rep18)
        val rep16 = shape16.value.toLawRep(base.rep16, rep17)
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper19[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19], rep: CaseClassHelper19[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19], oldData: DataCol): DataCol = {
        val data20 = oldData
        val data19 = shape19.value.buildData(data.data19, rep.rep19, data20)
        val data18 = shape18.value.buildData(data.data18, rep.rep18, data19)
        val data17 = shape17.value.buildData(data.data17, rep.rep17, data18)
        val data16 = shape16.value.buildData(data.data16, rep.rep16, data17)
        val data15 = shape15.value.buildData(data.data15, rep.rep15, data16)
        val data14 = shape14.value.buildData(data.data14, rep.rep14, data15)
        val data13 = shape13.value.buildData(data.data13, rep.rep13, data14)
        val data12 = shape12.value.buildData(data.data12, rep.rep12, data13)
        val data11 = shape11.value.buildData(data.data11, rep.rep11, data12)
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9 = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper19DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, Rep16, Data16, Target16, Rep17, Data17, Target17, Rep18, Data18, Target18, Rep19, Data19, Target19, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[DecoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[DecoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[DecoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]],
    shape16: Lazy[DecoderShape.Aux[Rep16, Data16, Target16, RepCol, DataCol]],
    shape17: Lazy[DecoderShape.Aux[Rep17, Data17, Target17, RepCol, DataCol]],
    shape18: Lazy[DecoderShape.Aux[Rep18, Data18, Target18, RepCol, DataCol]],
    shape19: Lazy[DecoderShape.Aux[Rep19, Data19, Target19, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper19[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19], CaseClassDataHelper19[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19], CaseClassHelper19[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper19[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19], CaseClassDataHelper19[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19], RepCol, DataCol] {
      override type Target = CaseClassHelper19[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19]
      override def wrapRep(base: CaseClassHelper19[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19]): CaseClassHelper19[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19] = {
        new CaseClassHelper19(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15,
          rep16 = shape16.value.wrapRep(base.rep16),
          property16 = base.property16,
          column16 = base.column16,
          rep17 = shape17.value.wrapRep(base.rep17),
          property17 = base.property17,
          column17 = base.column17,
          rep18 = shape18.value.wrapRep(base.rep18),
          property18 = base.property18,
          column18 = base.column18,
          rep19 = shape19.value.wrapRep(base.rep19),
          property19 = base.property19,
          column19 = base.column19)
      }
      override def toLawRep(base: CaseClassHelper19[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19], oldRep: RepCol): RepCol = {
        val rep20 = oldRep
        val rep19 = shape19.value.toLawRep(base.rep19, rep20)
        val rep18 = shape18.value.toLawRep(base.rep18, rep19)
        val rep17 = shape17.value.toLawRep(base.rep17, rep18)
        val rep16 = shape16.value.toLawRep(base.rep16, rep17)
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper19[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19], oldDataCol: DataCol): SplitData[CaseClassDataHelper19[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9) = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        val SplitData(item11, dataCol11) = shape11.value.takeData(rep.rep11, dataCol10)
        val SplitData(item12, dataCol12) = shape12.value.takeData(rep.rep12, dataCol11)
        val SplitData(item13, dataCol13) = shape13.value.takeData(rep.rep13, dataCol12)
        val SplitData(item14, dataCol14) = shape14.value.takeData(rep.rep14, dataCol13)
        val SplitData(item15, dataCol15) = shape15.value.takeData(rep.rep15, dataCol14)
        val SplitData(item16, dataCol16) = shape16.value.takeData(rep.rep16, dataCol15)
        val SplitData(item17, dataCol17) = shape17.value.takeData(rep.rep17, dataCol16)
        val SplitData(item18, dataCol18) = shape18.value.takeData(rep.rep18, dataCol17)
        val SplitData(item19, dataCol19) = shape19.value.takeData(rep.rep19, dataCol18)
        SplitData(
          current = new CaseClassDataHelper19(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8,
          data9 = item9,
          column9 = rep.column9,
          data10 = item10,
          column10 = rep.column10,
          data11 = item11,
          column11 = rep.column11,
          data12 = item12,
          column12 = rep.column12,
          data13 = item13,
          column13 = rep.column13,
          data14 = item14,
          column14 = rep.column14,
          data15 = item15,
          column15 = rep.column15,
          data16 = item16,
          column16 = rep.column16,
          data17 = item17,
          column17 = rep.column17,
          data18 = item18,
          column18 = rep.column18,
          data19 = item19,
          column19 = rep.column19),
          left = dataCol19)
      }
    }
  }
}
class CaseClassHelper20[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo,
  val rep9: Rep9,
  val property9: PropertyType[Data9],
  val column9: MacroColumnInfo,
  val rep10: Rep10,
  val property10: PropertyType[Data10],
  val column10: MacroColumnInfo,
  val rep11: Rep11,
  val property11: PropertyType[Data11],
  val column11: MacroColumnInfo,
  val rep12: Rep12,
  val property12: PropertyType[Data12],
  val column12: MacroColumnInfo,
  val rep13: Rep13,
  val property13: PropertyType[Data13],
  val column13: MacroColumnInfo,
  val rep14: Rep14,
  val property14: PropertyType[Data14],
  val column14: MacroColumnInfo,
  val rep15: Rep15,
  val property15: PropertyType[Data15],
  val column15: MacroColumnInfo,
  val rep16: Rep16,
  val property16: PropertyType[Data16],
  val column16: MacroColumnInfo,
  val rep17: Rep17,
  val property17: PropertyType[Data17],
  val column17: MacroColumnInfo,
  val rep18: Rep18,
  val property18: PropertyType[Data18],
  val column18: MacroColumnInfo,
  val rep19: Rep19,
  val property19: PropertyType[Data19],
  val column19: MacroColumnInfo,
  val rep20: Rep20,
  val property20: PropertyType[Data20],
  val column20: MacroColumnInfo) {
}
class CaseClassDataHelper20[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo,
  val data9: Data9,
  val column9: MacroColumnInfo,
  val data10: Data10,
  val column10: MacroColumnInfo,
  val data11: Data11,
  val column11: MacroColumnInfo,
  val data12: Data12,
  val column12: MacroColumnInfo,
  val data13: Data13,
  val column13: MacroColumnInfo,
  val data14: Data14,
  val column14: MacroColumnInfo,
  val data15: Data15,
  val column15: MacroColumnInfo,
  val data16: Data16,
  val column16: MacroColumnInfo,
  val data17: Data17,
  val column17: MacroColumnInfo,
  val data18: Data18,
  val column18: MacroColumnInfo,
  val data19: Data19,
  val column19: MacroColumnInfo,
  val data20: Data20,
  val column20: MacroColumnInfo) {
}
object CaseClassHelper20 {
  implicit def caseClassHelper20EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, Rep16, Data16, Target16, Rep17, Data17, Target17, Rep18, Data18, Target18, Rep19, Data19, Target19, Rep20, Data20, Target20, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[EncoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[EncoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[EncoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]],
    shape16: Lazy[EncoderShape.Aux[Rep16, Data16, Target16, RepCol, DataCol]],
    shape17: Lazy[EncoderShape.Aux[Rep17, Data17, Target17, RepCol, DataCol]],
    shape18: Lazy[EncoderShape.Aux[Rep18, Data18, Target18, RepCol, DataCol]],
    shape19: Lazy[EncoderShape.Aux[Rep19, Data19, Target19, RepCol, DataCol]],
    shape20: Lazy[EncoderShape.Aux[Rep20, Data20, Target20, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper20[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20], CaseClassDataHelper20[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20], CaseClassHelper20[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper20[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20], CaseClassDataHelper20[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20], RepCol, DataCol] {
      override type Target = CaseClassHelper20[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20]
      override def wrapRep(base: CaseClassHelper20[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20]): CaseClassHelper20[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20] = {
        new CaseClassHelper20(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15,
          rep16 = shape16.value.wrapRep(base.rep16),
          property16 = base.property16,
          column16 = base.column16,
          rep17 = shape17.value.wrapRep(base.rep17),
          property17 = base.property17,
          column17 = base.column17,
          rep18 = shape18.value.wrapRep(base.rep18),
          property18 = base.property18,
          column18 = base.column18,
          rep19 = shape19.value.wrapRep(base.rep19),
          property19 = base.property19,
          column19 = base.column19,
          rep20 = shape20.value.wrapRep(base.rep20),
          property20 = base.property20,
          column20 = base.column20)
      }
      override def toLawRep(base: CaseClassHelper20[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20], oldRep: RepCol): RepCol = {
        val rep21 = oldRep
        val rep20 = shape20.value.toLawRep(base.rep20, rep21)
        val rep19 = shape19.value.toLawRep(base.rep19, rep20)
        val rep18 = shape18.value.toLawRep(base.rep18, rep19)
        val rep17 = shape17.value.toLawRep(base.rep17, rep18)
        val rep16 = shape16.value.toLawRep(base.rep16, rep17)
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper20[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20], rep: CaseClassHelper20[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20], oldData: DataCol): DataCol = {
        val data21 = oldData
        val data20 = shape20.value.buildData(data.data20, rep.rep20, data21)
        val data19 = shape19.value.buildData(data.data19, rep.rep19, data20)
        val data18 = shape18.value.buildData(data.data18, rep.rep18, data19)
        val data17 = shape17.value.buildData(data.data17, rep.rep17, data18)
        val data16 = shape16.value.buildData(data.data16, rep.rep16, data17)
        val data15 = shape15.value.buildData(data.data15, rep.rep15, data16)
        val data14 = shape14.value.buildData(data.data14, rep.rep14, data15)
        val data13 = shape13.value.buildData(data.data13, rep.rep13, data14)
        val data12 = shape12.value.buildData(data.data12, rep.rep12, data13)
        val data11 = shape11.value.buildData(data.data11, rep.rep11, data12)
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9 = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper20DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, Rep16, Data16, Target16, Rep17, Data17, Target17, Rep18, Data18, Target18, Rep19, Data19, Target19, Rep20, Data20, Target20, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[DecoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[DecoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[DecoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]],
    shape16: Lazy[DecoderShape.Aux[Rep16, Data16, Target16, RepCol, DataCol]],
    shape17: Lazy[DecoderShape.Aux[Rep17, Data17, Target17, RepCol, DataCol]],
    shape18: Lazy[DecoderShape.Aux[Rep18, Data18, Target18, RepCol, DataCol]],
    shape19: Lazy[DecoderShape.Aux[Rep19, Data19, Target19, RepCol, DataCol]],
    shape20: Lazy[DecoderShape.Aux[Rep20, Data20, Target20, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper20[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20], CaseClassDataHelper20[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20], CaseClassHelper20[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper20[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20], CaseClassDataHelper20[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20], RepCol, DataCol] {
      override type Target = CaseClassHelper20[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20]
      override def wrapRep(base: CaseClassHelper20[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20]): CaseClassHelper20[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20] = {
        new CaseClassHelper20(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15,
          rep16 = shape16.value.wrapRep(base.rep16),
          property16 = base.property16,
          column16 = base.column16,
          rep17 = shape17.value.wrapRep(base.rep17),
          property17 = base.property17,
          column17 = base.column17,
          rep18 = shape18.value.wrapRep(base.rep18),
          property18 = base.property18,
          column18 = base.column18,
          rep19 = shape19.value.wrapRep(base.rep19),
          property19 = base.property19,
          column19 = base.column19,
          rep20 = shape20.value.wrapRep(base.rep20),
          property20 = base.property20,
          column20 = base.column20)
      }
      override def toLawRep(base: CaseClassHelper20[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20], oldRep: RepCol): RepCol = {
        val rep21 = oldRep
        val rep20 = shape20.value.toLawRep(base.rep20, rep21)
        val rep19 = shape19.value.toLawRep(base.rep19, rep20)
        val rep18 = shape18.value.toLawRep(base.rep18, rep19)
        val rep17 = shape17.value.toLawRep(base.rep17, rep18)
        val rep16 = shape16.value.toLawRep(base.rep16, rep17)
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper20[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20], oldDataCol: DataCol): SplitData[CaseClassDataHelper20[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9) = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        val SplitData(item11, dataCol11) = shape11.value.takeData(rep.rep11, dataCol10)
        val SplitData(item12, dataCol12) = shape12.value.takeData(rep.rep12, dataCol11)
        val SplitData(item13, dataCol13) = shape13.value.takeData(rep.rep13, dataCol12)
        val SplitData(item14, dataCol14) = shape14.value.takeData(rep.rep14, dataCol13)
        val SplitData(item15, dataCol15) = shape15.value.takeData(rep.rep15, dataCol14)
        val SplitData(item16, dataCol16) = shape16.value.takeData(rep.rep16, dataCol15)
        val SplitData(item17, dataCol17) = shape17.value.takeData(rep.rep17, dataCol16)
        val SplitData(item18, dataCol18) = shape18.value.takeData(rep.rep18, dataCol17)
        val SplitData(item19, dataCol19) = shape19.value.takeData(rep.rep19, dataCol18)
        val SplitData(item20, dataCol20) = shape20.value.takeData(rep.rep20, dataCol19)
        SplitData(
          current = new CaseClassDataHelper20(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8,
          data9 = item9,
          column9 = rep.column9,
          data10 = item10,
          column10 = rep.column10,
          data11 = item11,
          column11 = rep.column11,
          data12 = item12,
          column12 = rep.column12,
          data13 = item13,
          column13 = rep.column13,
          data14 = item14,
          column14 = rep.column14,
          data15 = item15,
          column15 = rep.column15,
          data16 = item16,
          column16 = rep.column16,
          data17 = item17,
          column17 = rep.column17,
          data18 = item18,
          column18 = rep.column18,
          data19 = item19,
          column19 = rep.column19,
          data20 = item20,
          column20 = rep.column20),
          left = dataCol20)
      }
    }
  }
}
class CaseClassHelper21[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20, Rep21, Data21](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo,
  val rep9: Rep9,
  val property9: PropertyType[Data9],
  val column9: MacroColumnInfo,
  val rep10: Rep10,
  val property10: PropertyType[Data10],
  val column10: MacroColumnInfo,
  val rep11: Rep11,
  val property11: PropertyType[Data11],
  val column11: MacroColumnInfo,
  val rep12: Rep12,
  val property12: PropertyType[Data12],
  val column12: MacroColumnInfo,
  val rep13: Rep13,
  val property13: PropertyType[Data13],
  val column13: MacroColumnInfo,
  val rep14: Rep14,
  val property14: PropertyType[Data14],
  val column14: MacroColumnInfo,
  val rep15: Rep15,
  val property15: PropertyType[Data15],
  val column15: MacroColumnInfo,
  val rep16: Rep16,
  val property16: PropertyType[Data16],
  val column16: MacroColumnInfo,
  val rep17: Rep17,
  val property17: PropertyType[Data17],
  val column17: MacroColumnInfo,
  val rep18: Rep18,
  val property18: PropertyType[Data18],
  val column18: MacroColumnInfo,
  val rep19: Rep19,
  val property19: PropertyType[Data19],
  val column19: MacroColumnInfo,
  val rep20: Rep20,
  val property20: PropertyType[Data20],
  val column20: MacroColumnInfo,
  val rep21: Rep21,
  val property21: PropertyType[Data21],
  val column21: MacroColumnInfo) {
}
class CaseClassDataHelper21[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20, Data21](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo,
  val data9: Data9,
  val column9: MacroColumnInfo,
  val data10: Data10,
  val column10: MacroColumnInfo,
  val data11: Data11,
  val column11: MacroColumnInfo,
  val data12: Data12,
  val column12: MacroColumnInfo,
  val data13: Data13,
  val column13: MacroColumnInfo,
  val data14: Data14,
  val column14: MacroColumnInfo,
  val data15: Data15,
  val column15: MacroColumnInfo,
  val data16: Data16,
  val column16: MacroColumnInfo,
  val data17: Data17,
  val column17: MacroColumnInfo,
  val data18: Data18,
  val column18: MacroColumnInfo,
  val data19: Data19,
  val column19: MacroColumnInfo,
  val data20: Data20,
  val column20: MacroColumnInfo,
  val data21: Data21,
  val column21: MacroColumnInfo) {
}
object CaseClassHelper21 {
  implicit def caseClassHelper21EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, Rep16, Data16, Target16, Rep17, Data17, Target17, Rep18, Data18, Target18, Rep19, Data19, Target19, Rep20, Data20, Target20, Rep21, Data21, Target21, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[EncoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[EncoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[EncoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]],
    shape16: Lazy[EncoderShape.Aux[Rep16, Data16, Target16, RepCol, DataCol]],
    shape17: Lazy[EncoderShape.Aux[Rep17, Data17, Target17, RepCol, DataCol]],
    shape18: Lazy[EncoderShape.Aux[Rep18, Data18, Target18, RepCol, DataCol]],
    shape19: Lazy[EncoderShape.Aux[Rep19, Data19, Target19, RepCol, DataCol]],
    shape20: Lazy[EncoderShape.Aux[Rep20, Data20, Target20, RepCol, DataCol]],
    shape21: Lazy[EncoderShape.Aux[Rep21, Data21, Target21, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper21[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20, Rep21, Data21], CaseClassDataHelper21[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20, Data21], CaseClassHelper21[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper21[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20, Rep21, Data21], CaseClassDataHelper21[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20, Data21], RepCol, DataCol] {
      override type Target = CaseClassHelper21[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21]
      override def wrapRep(base: CaseClassHelper21[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20, Rep21, Data21]): CaseClassHelper21[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21] = {
        new CaseClassHelper21(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15,
          rep16 = shape16.value.wrapRep(base.rep16),
          property16 = base.property16,
          column16 = base.column16,
          rep17 = shape17.value.wrapRep(base.rep17),
          property17 = base.property17,
          column17 = base.column17,
          rep18 = shape18.value.wrapRep(base.rep18),
          property18 = base.property18,
          column18 = base.column18,
          rep19 = shape19.value.wrapRep(base.rep19),
          property19 = base.property19,
          column19 = base.column19,
          rep20 = shape20.value.wrapRep(base.rep20),
          property20 = base.property20,
          column20 = base.column20,
          rep21 = shape21.value.wrapRep(base.rep21),
          property21 = base.property21,
          column21 = base.column21)
      }
      override def toLawRep(base: CaseClassHelper21[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21], oldRep: RepCol): RepCol = {
        val rep22 = oldRep
        val rep21 = shape21.value.toLawRep(base.rep21, rep22)
        val rep20 = shape20.value.toLawRep(base.rep20, rep21)
        val rep19 = shape19.value.toLawRep(base.rep19, rep20)
        val rep18 = shape18.value.toLawRep(base.rep18, rep19)
        val rep17 = shape17.value.toLawRep(base.rep17, rep18)
        val rep16 = shape16.value.toLawRep(base.rep16, rep17)
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper21[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20, Data21], rep: CaseClassHelper21[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21], oldData: DataCol): DataCol = {
        val data22 = oldData
        val data21 = shape21.value.buildData(data.data21, rep.rep21, data22)
        val data20 = shape20.value.buildData(data.data20, rep.rep20, data21)
        val data19 = shape19.value.buildData(data.data19, rep.rep19, data20)
        val data18 = shape18.value.buildData(data.data18, rep.rep18, data19)
        val data17 = shape17.value.buildData(data.data17, rep.rep17, data18)
        val data16 = shape16.value.buildData(data.data16, rep.rep16, data17)
        val data15 = shape15.value.buildData(data.data15, rep.rep15, data16)
        val data14 = shape14.value.buildData(data.data14, rep.rep14, data15)
        val data13 = shape13.value.buildData(data.data13, rep.rep13, data14)
        val data12 = shape12.value.buildData(data.data12, rep.rep12, data13)
        val data11 = shape11.value.buildData(data.data11, rep.rep11, data12)
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9 = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper21DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, Rep16, Data16, Target16, Rep17, Data17, Target17, Rep18, Data18, Target18, Rep19, Data19, Target19, Rep20, Data20, Target20, Rep21, Data21, Target21, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[DecoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[DecoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[DecoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]],
    shape16: Lazy[DecoderShape.Aux[Rep16, Data16, Target16, RepCol, DataCol]],
    shape17: Lazy[DecoderShape.Aux[Rep17, Data17, Target17, RepCol, DataCol]],
    shape18: Lazy[DecoderShape.Aux[Rep18, Data18, Target18, RepCol, DataCol]],
    shape19: Lazy[DecoderShape.Aux[Rep19, Data19, Target19, RepCol, DataCol]],
    shape20: Lazy[DecoderShape.Aux[Rep20, Data20, Target20, RepCol, DataCol]],
    shape21: Lazy[DecoderShape.Aux[Rep21, Data21, Target21, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper21[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20, Rep21, Data21], CaseClassDataHelper21[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20, Data21], CaseClassHelper21[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper21[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20, Rep21, Data21], CaseClassDataHelper21[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20, Data21], RepCol, DataCol] {
      override type Target = CaseClassHelper21[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21]
      override def wrapRep(base: CaseClassHelper21[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20, Rep21, Data21]): CaseClassHelper21[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21] = {
        new CaseClassHelper21(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15,
          rep16 = shape16.value.wrapRep(base.rep16),
          property16 = base.property16,
          column16 = base.column16,
          rep17 = shape17.value.wrapRep(base.rep17),
          property17 = base.property17,
          column17 = base.column17,
          rep18 = shape18.value.wrapRep(base.rep18),
          property18 = base.property18,
          column18 = base.column18,
          rep19 = shape19.value.wrapRep(base.rep19),
          property19 = base.property19,
          column19 = base.column19,
          rep20 = shape20.value.wrapRep(base.rep20),
          property20 = base.property20,
          column20 = base.column20,
          rep21 = shape21.value.wrapRep(base.rep21),
          property21 = base.property21,
          column21 = base.column21)
      }
      override def toLawRep(base: CaseClassHelper21[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21], oldRep: RepCol): RepCol = {
        val rep22 = oldRep
        val rep21 = shape21.value.toLawRep(base.rep21, rep22)
        val rep20 = shape20.value.toLawRep(base.rep20, rep21)
        val rep19 = shape19.value.toLawRep(base.rep19, rep20)
        val rep18 = shape18.value.toLawRep(base.rep18, rep19)
        val rep17 = shape17.value.toLawRep(base.rep17, rep18)
        val rep16 = shape16.value.toLawRep(base.rep16, rep17)
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper21[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21], oldDataCol: DataCol): SplitData[CaseClassDataHelper21[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20, Data21], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9) = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        val SplitData(item11, dataCol11) = shape11.value.takeData(rep.rep11, dataCol10)
        val SplitData(item12, dataCol12) = shape12.value.takeData(rep.rep12, dataCol11)
        val SplitData(item13, dataCol13) = shape13.value.takeData(rep.rep13, dataCol12)
        val SplitData(item14, dataCol14) = shape14.value.takeData(rep.rep14, dataCol13)
        val SplitData(item15, dataCol15) = shape15.value.takeData(rep.rep15, dataCol14)
        val SplitData(item16, dataCol16) = shape16.value.takeData(rep.rep16, dataCol15)
        val SplitData(item17, dataCol17) = shape17.value.takeData(rep.rep17, dataCol16)
        val SplitData(item18, dataCol18) = shape18.value.takeData(rep.rep18, dataCol17)
        val SplitData(item19, dataCol19) = shape19.value.takeData(rep.rep19, dataCol18)
        val SplitData(item20, dataCol20) = shape20.value.takeData(rep.rep20, dataCol19)
        val SplitData(item21, dataCol21) = shape21.value.takeData(rep.rep21, dataCol20)
        SplitData(
          current = new CaseClassDataHelper21(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8,
          data9 = item9,
          column9 = rep.column9,
          data10 = item10,
          column10 = rep.column10,
          data11 = item11,
          column11 = rep.column11,
          data12 = item12,
          column12 = rep.column12,
          data13 = item13,
          column13 = rep.column13,
          data14 = item14,
          column14 = rep.column14,
          data15 = item15,
          column15 = rep.column15,
          data16 = item16,
          column16 = rep.column16,
          data17 = item17,
          column17 = rep.column17,
          data18 = item18,
          column18 = rep.column18,
          data19 = item19,
          column19 = rep.column19,
          data20 = item20,
          column20 = rep.column20,
          data21 = item21,
          column21 = rep.column21),
          left = dataCol21)
      }
    }
  }
}
class CaseClassHelper22[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20, Rep21, Data21, Rep22, Data22](
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
  val column6: MacroColumnInfo,
  val rep7: Rep7,
  val property7: PropertyType[Data7],
  val column7: MacroColumnInfo,
  val rep8: Rep8,
  val property8: PropertyType[Data8],
  val column8: MacroColumnInfo,
  val rep9: Rep9,
  val property9: PropertyType[Data9],
  val column9: MacroColumnInfo,
  val rep10: Rep10,
  val property10: PropertyType[Data10],
  val column10: MacroColumnInfo,
  val rep11: Rep11,
  val property11: PropertyType[Data11],
  val column11: MacroColumnInfo,
  val rep12: Rep12,
  val property12: PropertyType[Data12],
  val column12: MacroColumnInfo,
  val rep13: Rep13,
  val property13: PropertyType[Data13],
  val column13: MacroColumnInfo,
  val rep14: Rep14,
  val property14: PropertyType[Data14],
  val column14: MacroColumnInfo,
  val rep15: Rep15,
  val property15: PropertyType[Data15],
  val column15: MacroColumnInfo,
  val rep16: Rep16,
  val property16: PropertyType[Data16],
  val column16: MacroColumnInfo,
  val rep17: Rep17,
  val property17: PropertyType[Data17],
  val column17: MacroColumnInfo,
  val rep18: Rep18,
  val property18: PropertyType[Data18],
  val column18: MacroColumnInfo,
  val rep19: Rep19,
  val property19: PropertyType[Data19],
  val column19: MacroColumnInfo,
  val rep20: Rep20,
  val property20: PropertyType[Data20],
  val column20: MacroColumnInfo,
  val rep21: Rep21,
  val property21: PropertyType[Data21],
  val column21: MacroColumnInfo,
  val rep22: Rep22,
  val property22: PropertyType[Data22],
  val column22: MacroColumnInfo) {
}
class CaseClassDataHelper22[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20, Data21, Data22](
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
  val column6: MacroColumnInfo,
  val data7: Data7,
  val column7: MacroColumnInfo,
  val data8: Data8,
  val column8: MacroColumnInfo,
  val data9: Data9,
  val column9: MacroColumnInfo,
  val data10: Data10,
  val column10: MacroColumnInfo,
  val data11: Data11,
  val column11: MacroColumnInfo,
  val data12: Data12,
  val column12: MacroColumnInfo,
  val data13: Data13,
  val column13: MacroColumnInfo,
  val data14: Data14,
  val column14: MacroColumnInfo,
  val data15: Data15,
  val column15: MacroColumnInfo,
  val data16: Data16,
  val column16: MacroColumnInfo,
  val data17: Data17,
  val column17: MacroColumnInfo,
  val data18: Data18,
  val column18: MacroColumnInfo,
  val data19: Data19,
  val column19: MacroColumnInfo,
  val data20: Data20,
  val column20: MacroColumnInfo,
  val data21: Data21,
  val column21: MacroColumnInfo,
  val data22: Data22,
  val column22: MacroColumnInfo) {
}
object CaseClassHelper22 {
  implicit def caseClassHelper22EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, Rep16, Data16, Target16, Rep17, Data17, Target17, Rep18, Data18, Target18, Rep19, Data19, Target19, Rep20, Data20, Target20, Rep21, Data21, Target21, Rep22, Data22, Target22, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[EncoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[EncoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[EncoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]],
    shape16: Lazy[EncoderShape.Aux[Rep16, Data16, Target16, RepCol, DataCol]],
    shape17: Lazy[EncoderShape.Aux[Rep17, Data17, Target17, RepCol, DataCol]],
    shape18: Lazy[EncoderShape.Aux[Rep18, Data18, Target18, RepCol, DataCol]],
    shape19: Lazy[EncoderShape.Aux[Rep19, Data19, Target19, RepCol, DataCol]],
    shape20: Lazy[EncoderShape.Aux[Rep20, Data20, Target20, RepCol, DataCol]],
    shape21: Lazy[EncoderShape.Aux[Rep21, Data21, Target21, RepCol, DataCol]],
    shape22: Lazy[EncoderShape.Aux[Rep22, Data22, Target22, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper22[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20, Rep21, Data21, Rep22, Data22], CaseClassDataHelper22[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20, Data21, Data22], CaseClassHelper22[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21, Target22, Data22], RepCol, DataCol] = {
    new EncoderShape[CaseClassHelper22[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20, Rep21, Data21, Rep22, Data22], CaseClassDataHelper22[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20, Data21, Data22], RepCol, DataCol] {
      override type Target = CaseClassHelper22[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21, Target22, Data22]
      override def wrapRep(base: CaseClassHelper22[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20, Rep21, Data21, Rep22, Data22]): CaseClassHelper22[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21, Target22, Data22] = {
        new CaseClassHelper22(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15,
          rep16 = shape16.value.wrapRep(base.rep16),
          property16 = base.property16,
          column16 = base.column16,
          rep17 = shape17.value.wrapRep(base.rep17),
          property17 = base.property17,
          column17 = base.column17,
          rep18 = shape18.value.wrapRep(base.rep18),
          property18 = base.property18,
          column18 = base.column18,
          rep19 = shape19.value.wrapRep(base.rep19),
          property19 = base.property19,
          column19 = base.column19,
          rep20 = shape20.value.wrapRep(base.rep20),
          property20 = base.property20,
          column20 = base.column20,
          rep21 = shape21.value.wrapRep(base.rep21),
          property21 = base.property21,
          column21 = base.column21,
          rep22 = shape22.value.wrapRep(base.rep22),
          property22 = base.property22,
          column22 = base.column22)
      }
      override def toLawRep(base: CaseClassHelper22[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21, Target22, Data22], oldRep: RepCol): RepCol = {
        val rep23 = oldRep
        val rep22 = shape22.value.toLawRep(base.rep22, rep23)
        val rep21 = shape21.value.toLawRep(base.rep21, rep22)
        val rep20 = shape20.value.toLawRep(base.rep20, rep21)
        val rep19 = shape19.value.toLawRep(base.rep19, rep20)
        val rep18 = shape18.value.toLawRep(base.rep18, rep19)
        val rep17 = shape17.value.toLawRep(base.rep17, rep18)
        val rep16 = shape16.value.toLawRep(base.rep16, rep17)
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(data: CaseClassDataHelper22[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20, Data21, Data22], rep: CaseClassHelper22[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21, Target22, Data22], oldData: DataCol): DataCol = {
        val data23 = oldData
        val data22 = shape22.value.buildData(data.data22, rep.rep22, data23)
        val data21 = shape21.value.buildData(data.data21, rep.rep21, data22)
        val data20 = shape20.value.buildData(data.data20, rep.rep20, data21)
        val data19 = shape19.value.buildData(data.data19, rep.rep19, data20)
        val data18 = shape18.value.buildData(data.data18, rep.rep18, data19)
        val data17 = shape17.value.buildData(data.data17, rep.rep17, data18)
        val data16 = shape16.value.buildData(data.data16, rep.rep16, data17)
        val data15 = shape15.value.buildData(data.data15, rep.rep15, data16)
        val data14 = shape14.value.buildData(data.data14, rep.rep14, data15)
        val data13 = shape13.value.buildData(data.data13, rep.rep13, data14)
        val data12 = shape12.value.buildData(data.data12, rep.rep12, data13)
        val data11 = shape11.value.buildData(data.data11, rep.rep11, data12)
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9 = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8 = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7 = shape7.value.buildData(data.data7, rep.rep7, data8)
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
  implicit def caseClassHelper22DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, Rep13, Data13, Target13, Rep14, Data14, Target14, Rep15, Data15, Target15, Rep16, Data16, Target16, Rep17, Data17, Target17, Rep18, Data18, Target18, Rep19, Data19, Target19, Rep20, Data20, Target20, Rep21, Data21, Target21, Rep22, Data22, Target22, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]],
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]],
    shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]],
    shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]],
    shape12: Lazy[DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]],
    shape13: Lazy[DecoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]],
    shape14: Lazy[DecoderShape.Aux[Rep14, Data14, Target14, RepCol, DataCol]],
    shape15: Lazy[DecoderShape.Aux[Rep15, Data15, Target15, RepCol, DataCol]],
    shape16: Lazy[DecoderShape.Aux[Rep16, Data16, Target16, RepCol, DataCol]],
    shape17: Lazy[DecoderShape.Aux[Rep17, Data17, Target17, RepCol, DataCol]],
    shape18: Lazy[DecoderShape.Aux[Rep18, Data18, Target18, RepCol, DataCol]],
    shape19: Lazy[DecoderShape.Aux[Rep19, Data19, Target19, RepCol, DataCol]],
    shape20: Lazy[DecoderShape.Aux[Rep20, Data20, Target20, RepCol, DataCol]],
    shape21: Lazy[DecoderShape.Aux[Rep21, Data21, Target21, RepCol, DataCol]],
    shape22: Lazy[DecoderShape.Aux[Rep22, Data22, Target22, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper22[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20, Rep21, Data21, Rep22, Data22], CaseClassDataHelper22[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20, Data21, Data22], CaseClassHelper22[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21, Target22, Data22], RepCol, DataCol] = {
    new DecoderShape[CaseClassHelper22[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20, Rep21, Data21, Rep22, Data22], CaseClassDataHelper22[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20, Data21, Data22], RepCol, DataCol] {
      override type Target = CaseClassHelper22[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21, Target22, Data22]
      override def wrapRep(base: CaseClassHelper22[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12, Rep13, Data13, Rep14, Data14, Rep15, Data15, Rep16, Data16, Rep17, Data17, Rep18, Data18, Rep19, Data19, Rep20, Data20, Rep21, Data21, Rep22, Data22]): CaseClassHelper22[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21, Target22, Data22] = {
        new CaseClassHelper22(
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
          column6 = base.column6,
          rep7 = shape7.value.wrapRep(base.rep7),
          property7 = base.property7,
          column7 = base.column7,
          rep8 = shape8.value.wrapRep(base.rep8),
          property8 = base.property8,
          column8 = base.column8,
          rep9 = shape9.value.wrapRep(base.rep9),
          property9 = base.property9,
          column9 = base.column9,
          rep10 = shape10.value.wrapRep(base.rep10),
          property10 = base.property10,
          column10 = base.column10,
          rep11 = shape11.value.wrapRep(base.rep11),
          property11 = base.property11,
          column11 = base.column11,
          rep12 = shape12.value.wrapRep(base.rep12),
          property12 = base.property12,
          column12 = base.column12,
          rep13 = shape13.value.wrapRep(base.rep13),
          property13 = base.property13,
          column13 = base.column13,
          rep14 = shape14.value.wrapRep(base.rep14),
          property14 = base.property14,
          column14 = base.column14,
          rep15 = shape15.value.wrapRep(base.rep15),
          property15 = base.property15,
          column15 = base.column15,
          rep16 = shape16.value.wrapRep(base.rep16),
          property16 = base.property16,
          column16 = base.column16,
          rep17 = shape17.value.wrapRep(base.rep17),
          property17 = base.property17,
          column17 = base.column17,
          rep18 = shape18.value.wrapRep(base.rep18),
          property18 = base.property18,
          column18 = base.column18,
          rep19 = shape19.value.wrapRep(base.rep19),
          property19 = base.property19,
          column19 = base.column19,
          rep20 = shape20.value.wrapRep(base.rep20),
          property20 = base.property20,
          column20 = base.column20,
          rep21 = shape21.value.wrapRep(base.rep21),
          property21 = base.property21,
          column21 = base.column21,
          rep22 = shape22.value.wrapRep(base.rep22),
          property22 = base.property22,
          column22 = base.column22)
      }
      override def toLawRep(base: CaseClassHelper22[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21, Target22, Data22], oldRep: RepCol): RepCol = {
        val rep23 = oldRep
        val rep22 = shape22.value.toLawRep(base.rep22, rep23)
        val rep21 = shape21.value.toLawRep(base.rep21, rep22)
        val rep20 = shape20.value.toLawRep(base.rep20, rep21)
        val rep19 = shape19.value.toLawRep(base.rep19, rep20)
        val rep18 = shape18.value.toLawRep(base.rep18, rep19)
        val rep17 = shape17.value.toLawRep(base.rep17, rep18)
        val rep16 = shape16.value.toLawRep(base.rep16, rep17)
        val rep15 = shape15.value.toLawRep(base.rep15, rep16)
        val rep14 = shape14.value.toLawRep(base.rep14, rep15)
        val rep13 = shape13.value.toLawRep(base.rep13, rep14)
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9 = shape9.value.toLawRep(base.rep9, rep10)
        val rep8 = shape8.value.toLawRep(base.rep8, rep9)
        val rep7 = shape7.value.toLawRep(base.rep7, rep8)
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(rep: CaseClassHelper22[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12, Target13, Data13, Target14, Data14, Target15, Data15, Target16, Data16, Target17, Data17, Target18, Data18, Target19, Data19, Target20, Data20, Target21, Data21, Target22, Data22], oldDataCol: DataCol): SplitData[CaseClassDataHelper22[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12, Data13, Data14, Data15, Data16, Data17, Data18, Data19, Data20, Data21, Data22], DataCol] = {
        val dataCol0 = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9) = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        val SplitData(item11, dataCol11) = shape11.value.takeData(rep.rep11, dataCol10)
        val SplitData(item12, dataCol12) = shape12.value.takeData(rep.rep12, dataCol11)
        val SplitData(item13, dataCol13) = shape13.value.takeData(rep.rep13, dataCol12)
        val SplitData(item14, dataCol14) = shape14.value.takeData(rep.rep14, dataCol13)
        val SplitData(item15, dataCol15) = shape15.value.takeData(rep.rep15, dataCol14)
        val SplitData(item16, dataCol16) = shape16.value.takeData(rep.rep16, dataCol15)
        val SplitData(item17, dataCol17) = shape17.value.takeData(rep.rep17, dataCol16)
        val SplitData(item18, dataCol18) = shape18.value.takeData(rep.rep18, dataCol17)
        val SplitData(item19, dataCol19) = shape19.value.takeData(rep.rep19, dataCol18)
        val SplitData(item20, dataCol20) = shape20.value.takeData(rep.rep20, dataCol19)
        val SplitData(item21, dataCol21) = shape21.value.takeData(rep.rep21, dataCol20)
        val SplitData(item22, dataCol22) = shape22.value.takeData(rep.rep22, dataCol21)
        SplitData(
          current = new CaseClassDataHelper22(
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
          column6 = rep.column6,
          data7 = item7,
          column7 = rep.column7,
          data8 = item8,
          column8 = rep.column8,
          data9 = item9,
          column9 = rep.column9,
          data10 = item10,
          column10 = rep.column10,
          data11 = item11,
          column11 = rep.column11,
          data12 = item12,
          column12 = rep.column12,
          data13 = item13,
          column13 = rep.column13,
          data14 = item14,
          column14 = rep.column14,
          data15 = item15,
          column15 = rep.column15,
          data16 = item16,
          column16 = rep.column16,
          data17 = item17,
          column17 = rep.column17,
          data18 = item18,
          column18 = rep.column18,
          data19 = item19,
          column19 = rep.column19,
          data20 = item20,
          column20 = rep.column20,
          data21 = item21,
          column21 = rep.column21,
          data22 = item22,
          column22 = rep.column22),
          left = dataCol22)
      }
    }
  }
}
