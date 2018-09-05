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
  def withRep[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7](
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
    column6: MacroColumnInfo,
    rep7: Rep7,
    property7: PropertyType[Data7],
    column7: MacroColumnInfo): CaseClassHelper7[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7] = {
    new CaseClassHelper7(
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
      column6 = column6,
      rep7 = rep7,
      property7 = property7,
      column7 = column7)
  }
  def withRep[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8](
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
    column6: MacroColumnInfo,
    rep7: Rep7,
    property7: PropertyType[Data7],
    column7: MacroColumnInfo,
    rep8: Rep8,
    property8: PropertyType[Data8],
    column8: MacroColumnInfo): CaseClassHelper8[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8] = {
    new CaseClassHelper8(
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
      column6 = column6,
      rep7 = rep7,
      property7 = property7,
      column7 = column7,
      rep8 = rep8,
      property8 = property8,
      column8 = column8)
  }
  def withRep[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9](
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
    column6: MacroColumnInfo,
    rep7: Rep7,
    property7: PropertyType[Data7],
    column7: MacroColumnInfo,
    rep8: Rep8,
    property8: PropertyType[Data8],
    column8: MacroColumnInfo,
    rep9: Rep9,
    property9: PropertyType[Data9],
    column9: MacroColumnInfo): CaseClassHelper9[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9] = {
    new CaseClassHelper9(
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
      column6 = column6,
      rep7 = rep7,
      property7 = property7,
      column7 = column7,
      rep8 = rep8,
      property8 = property8,
      column8 = column8,
      rep9 = rep9,
      property9 = property9,
      column9 = column9)
  }
  def withRep[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10](
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
    column6: MacroColumnInfo,
    rep7: Rep7,
    property7: PropertyType[Data7],
    column7: MacroColumnInfo,
    rep8: Rep8,
    property8: PropertyType[Data8],
    column8: MacroColumnInfo,
    rep9: Rep9,
    property9: PropertyType[Data9],
    column9: MacroColumnInfo,
    rep10: Rep10,
    property10: PropertyType[Data10],
    column10: MacroColumnInfo): CaseClassHelper10[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10] = {
    new CaseClassHelper10(
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
      column6 = column6,
      rep7 = rep7,
      property7 = property7,
      column7 = column7,
      rep8 = rep8,
      property8 = property8,
      column8 = column8,
      rep9 = rep9,
      property9 = property9,
      column9 = column9,
      rep10 = rep10,
      property10 = property10,
      column10 = column10)
  }
  def withRep[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11](
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
    column6: MacroColumnInfo,
    rep7: Rep7,
    property7: PropertyType[Data7],
    column7: MacroColumnInfo,
    rep8: Rep8,
    property8: PropertyType[Data8],
    column8: MacroColumnInfo,
    rep9: Rep9,
    property9: PropertyType[Data9],
    column9: MacroColumnInfo,
    rep10: Rep10,
    property10: PropertyType[Data10],
    column10: MacroColumnInfo,
    rep11: Rep11,
    property11: PropertyType[Data11],
    column11: MacroColumnInfo): CaseClassHelper11[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11] = {
    new CaseClassHelper11(
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
      column6 = column6,
      rep7 = rep7,
      property7 = property7,
      column7 = column7,
      rep8 = rep8,
      property8 = property8,
      column8 = column8,
      rep9 = rep9,
      property9 = property9,
      column9 = column9,
      rep10 = rep10,
      property10 = property10,
      column10 = column10,
      rep11 = rep11,
      property11 = property11,
      column11 = column11)
  }
  def withRep[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12](
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
    column6: MacroColumnInfo,
    rep7: Rep7,
    property7: PropertyType[Data7],
    column7: MacroColumnInfo,
    rep8: Rep8,
    property8: PropertyType[Data8],
    column8: MacroColumnInfo,
    rep9: Rep9,
    property9: PropertyType[Data9],
    column9: MacroColumnInfo,
    rep10: Rep10,
    property10: PropertyType[Data10],
    column10: MacroColumnInfo,
    rep11: Rep11,
    property11: PropertyType[Data11],
    column11: MacroColumnInfo,
    rep12: Rep12,
    property12: PropertyType[Data12],
    column12: MacroColumnInfo): CaseClassHelper12[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12] = {
    new CaseClassHelper12(
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
      column6 = column6,
      rep7 = rep7,
      property7 = property7,
      column7 = column7,
      rep8 = rep8,
      property8 = property8,
      column8 = column8,
      rep9 = rep9,
      property9 = property9,
      column9 = column9,
      rep10 = rep10,
      property10 = property10,
      column10 = column10,
      rep11 = rep11,
      property11 = property11,
      column11 = column11,
      rep12 = rep12,
      property12 = property12,
      column12 = column12)
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
  def withDataDescribe[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7](
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
    column6: MacroColumnInfo,
    rep7: Rep7,
    property7: PropertyType[Data7],
    column7: MacroColumnInfo): DataGenWrap.Aux[CaseClassHelper7[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7], CaseClassDataHelper7[Data1, Data2, Data3, Data4, Data5, Data6, Data7]] = {
    DataGenWrap.value[CaseClassHelper7[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7], CaseClassDataHelper7[Data1, Data2, Data3, Data4, Data5, Data6, Data7]](new CaseClassHelper7(
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
      column6 = column6,
      rep7 = rep7,
      property7 = property7,
      column7 = column7))
  }
  def withDataDescribe[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8](
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
    column6: MacroColumnInfo,
    rep7: Rep7,
    property7: PropertyType[Data7],
    column7: MacroColumnInfo,
    rep8: Rep8,
    property8: PropertyType[Data8],
    column8: MacroColumnInfo): DataGenWrap.Aux[CaseClassHelper8[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8], CaseClassDataHelper8[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8]] = {
    DataGenWrap.value[CaseClassHelper8[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8], CaseClassDataHelper8[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8]](new CaseClassHelper8(
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
      column6 = column6,
      rep7 = rep7,
      property7 = property7,
      column7 = column7,
      rep8 = rep8,
      property8 = property8,
      column8 = column8))
  }
  def withDataDescribe[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9](
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
    column6: MacroColumnInfo,
    rep7: Rep7,
    property7: PropertyType[Data7],
    column7: MacroColumnInfo,
    rep8: Rep8,
    property8: PropertyType[Data8],
    column8: MacroColumnInfo,
    rep9: Rep9,
    property9: PropertyType[Data9],
    column9: MacroColumnInfo): DataGenWrap.Aux[CaseClassHelper9[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9], CaseClassDataHelper9[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9]] = {
    DataGenWrap.value[CaseClassHelper9[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9], CaseClassDataHelper9[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9]](new CaseClassHelper9(
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
      column6 = column6,
      rep7 = rep7,
      property7 = property7,
      column7 = column7,
      rep8 = rep8,
      property8 = property8,
      column8 = column8,
      rep9 = rep9,
      property9 = property9,
      column9 = column9))
  }
  def withDataDescribe[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10](
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
    column6: MacroColumnInfo,
    rep7: Rep7,
    property7: PropertyType[Data7],
    column7: MacroColumnInfo,
    rep8: Rep8,
    property8: PropertyType[Data8],
    column8: MacroColumnInfo,
    rep9: Rep9,
    property9: PropertyType[Data9],
    column9: MacroColumnInfo,
    rep10: Rep10,
    property10: PropertyType[Data10],
    column10: MacroColumnInfo): DataGenWrap.Aux[CaseClassHelper10[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10], CaseClassDataHelper10[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10]] = {
    DataGenWrap.value[CaseClassHelper10[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10], CaseClassDataHelper10[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10]](new CaseClassHelper10(
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
      column6 = column6,
      rep7 = rep7,
      property7 = property7,
      column7 = column7,
      rep8 = rep8,
      property8 = property8,
      column8 = column8,
      rep9 = rep9,
      property9 = property9,
      column9 = column9,
      rep10 = rep10,
      property10 = property10,
      column10 = column10))
  }
  def withDataDescribe[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11](
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
    column6: MacroColumnInfo,
    rep7: Rep7,
    property7: PropertyType[Data7],
    column7: MacroColumnInfo,
    rep8: Rep8,
    property8: PropertyType[Data8],
    column8: MacroColumnInfo,
    rep9: Rep9,
    property9: PropertyType[Data9],
    column9: MacroColumnInfo,
    rep10: Rep10,
    property10: PropertyType[Data10],
    column10: MacroColumnInfo,
    rep11: Rep11,
    property11: PropertyType[Data11],
    column11: MacroColumnInfo): DataGenWrap.Aux[CaseClassHelper11[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11], CaseClassDataHelper11[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11]] = {
    DataGenWrap.value[CaseClassHelper11[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11], CaseClassDataHelper11[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11]](new CaseClassHelper11(
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
      column6 = column6,
      rep7 = rep7,
      property7 = property7,
      column7 = column7,
      rep8 = rep8,
      property8 = property8,
      column8 = column8,
      rep9 = rep9,
      property9 = property9,
      column9 = column9,
      rep10 = rep10,
      property10 = property10,
      column10 = column10,
      rep11 = rep11,
      property11 = property11,
      column11 = column11))
  }
  def withDataDescribe[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12](
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
    column6: MacroColumnInfo,
    rep7: Rep7,
    property7: PropertyType[Data7],
    column7: MacroColumnInfo,
    rep8: Rep8,
    property8: PropertyType[Data8],
    column8: MacroColumnInfo,
    rep9: Rep9,
    property9: PropertyType[Data9],
    column9: MacroColumnInfo,
    rep10: Rep10,
    property10: PropertyType[Data10],
    column10: MacroColumnInfo,
    rep11: Rep11,
    property11: PropertyType[Data11],
    column11: MacroColumnInfo,
    rep12: Rep12,
    property12: PropertyType[Data12],
    column12: MacroColumnInfo): DataGenWrap.Aux[CaseClassHelper12[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12], CaseClassDataHelper12[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12]] = {
    DataGenWrap.value[CaseClassHelper12[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12], CaseClassDataHelper12[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12]](new CaseClassHelper12(
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
      column6 = column6,
      rep7 = rep7,
      property7 = property7,
      column7 = column7,
      rep8 = rep8,
      property8 = property8,
      column8 = column8,
      rep9 = rep9,
      property9 = property9,
      column9 = column9,
      rep10 = rep10,
      property10 = property10,
      column10 = column10,
      rep11 = rep11,
      property11 = property11,
      column11 = column11,
      rep12 = rep12,
      property12 = property12,
      column12 = column12))
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
  val column7: MacroColumnInfo) extends CaseClassDataHelperAbs {
  override def toSetterContent(setterContent: SetterContent): SetterContent = {
    val setterContent8 = setterContent
    val setterContent7 = CaseModelContent2222.set(setterContent8, column7.modelColumnSymbol, data7)
    val setterContent6 = CaseModelContent2222.set(setterContent7, column6.modelColumnSymbol, data6)
    val setterContent5 = CaseModelContent2222.set(setterContent6, column5.modelColumnSymbol, data5)
    val setterContent4 = CaseModelContent2222.set(setterContent5, column4.modelColumnSymbol, data4)
    val setterContent3 = CaseModelContent2222.set(setterContent4, column3.modelColumnSymbol, data3)
    val setterContent2 = CaseModelContent2222.set(setterContent3, column2.modelColumnSymbol, data2)
    val setterContent1 = CaseModelContent2222.set(setterContent2, column1.modelColumnSymbol, data1)
    setterContent1
  }
}
object CaseClassDataHelper7 {
  def fromModel[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7](rep: CaseClassHelper7[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7], cv: Symbol => Any): CaseClassDataHelper7[Data1, Data2, Data3, Data4, Data5, Data6, Data7] = {
    new CaseClassDataHelper7(
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
      column6 = rep.column6,
      data7 = cv(rep.column7.modelColumnSymbol).asInstanceOf[Data7],
      column7 = rep.column7)
  }
}
object CaseClassHelper7 {
  implicit def caseClassHelper7EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, RepCol, DataCol](
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
  implicit def caseClassHelper7EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper7[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7], Symbol => Any, CaseClassHelper7[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7], RepCol, DataCol] = {
    caseClassHelper7EncoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5,
      shape6,
      shape7).emap { (rep, s: Symbol => Any) => CaseClassDataHelper7.fromModel(rep, s) }
  }
  implicit def caseClassHelper7DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, RepCol, DataCol](
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
  implicit def caseClassHelper7DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper7[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7], SetterContent => SetterContent, CaseClassHelper7[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7], RepCol, DataCol] = {
    caseClassHelper7DecoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5,
      shape6,
      shape7).dmap((rep, s) => s.toSetterContent _)
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
  val column8: MacroColumnInfo) extends CaseClassDataHelperAbs {
  override def toSetterContent(setterContent: SetterContent): SetterContent = {
    val setterContent9 = setterContent
    val setterContent8 = CaseModelContent2222.set(setterContent9, column8.modelColumnSymbol, data8)
    val setterContent7 = CaseModelContent2222.set(setterContent8, column7.modelColumnSymbol, data7)
    val setterContent6 = CaseModelContent2222.set(setterContent7, column6.modelColumnSymbol, data6)
    val setterContent5 = CaseModelContent2222.set(setterContent6, column5.modelColumnSymbol, data5)
    val setterContent4 = CaseModelContent2222.set(setterContent5, column4.modelColumnSymbol, data4)
    val setterContent3 = CaseModelContent2222.set(setterContent4, column3.modelColumnSymbol, data3)
    val setterContent2 = CaseModelContent2222.set(setterContent3, column2.modelColumnSymbol, data2)
    val setterContent1 = CaseModelContent2222.set(setterContent2, column1.modelColumnSymbol, data1)
    setterContent1
  }
}
object CaseClassDataHelper8 {
  def fromModel[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8](rep: CaseClassHelper8[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8], cv: Symbol => Any): CaseClassDataHelper8[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8] = {
    new CaseClassDataHelper8(
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
      column6 = rep.column6,
      data7 = cv(rep.column7.modelColumnSymbol).asInstanceOf[Data7],
      column7 = rep.column7,
      data8 = cv(rep.column8.modelColumnSymbol).asInstanceOf[Data8],
      column8 = rep.column8)
  }
}
object CaseClassHelper8 {
  implicit def caseClassHelper8EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, RepCol, DataCol](
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
  implicit def caseClassHelper8EncoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, RepCol, DataCol](
    implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper8[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8], Symbol => Any, CaseClassHelper8[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8], RepCol, DataCol] = {
    caseClassHelper8EncoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5,
      shape6,
      shape7,
      shape8).emap { (rep, s: Symbol => Any) => CaseClassDataHelper8.fromModel(rep, s) }
  }
  implicit def caseClassHelper8DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, RepCol, DataCol](
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
  implicit def caseClassHelper8DecoderImplicit[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, RepCol, DataCol](
    implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]],
    shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]],
    shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]],
    shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]],
    shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]],
    shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]],
    shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]],
    shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper8[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8], SetterContent => SetterContent, CaseClassHelper8[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8], RepCol, DataCol] = {
    caseClassHelper8DecoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5,
      shape6,
      shape7,
      shape8).dmap((rep, s) => s.toSetterContent _)
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
  val column9: MacroColumnInfo) extends CaseClassDataHelperAbs {
  override def toSetterContent(setterContent: SetterContent): SetterContent = {
    val setterContent10 = setterContent
    val setterContent9 = CaseModelContent2222.set(setterContent10, column9.modelColumnSymbol, data9)
    val setterContent8 = CaseModelContent2222.set(setterContent9, column8.modelColumnSymbol, data8)
    val setterContent7 = CaseModelContent2222.set(setterContent8, column7.modelColumnSymbol, data7)
    val setterContent6 = CaseModelContent2222.set(setterContent7, column6.modelColumnSymbol, data6)
    val setterContent5 = CaseModelContent2222.set(setterContent6, column5.modelColumnSymbol, data5)
    val setterContent4 = CaseModelContent2222.set(setterContent5, column4.modelColumnSymbol, data4)
    val setterContent3 = CaseModelContent2222.set(setterContent4, column3.modelColumnSymbol, data3)
    val setterContent2 = CaseModelContent2222.set(setterContent3, column2.modelColumnSymbol, data2)
    val setterContent1 = CaseModelContent2222.set(setterContent2, column1.modelColumnSymbol, data1)
    setterContent1
  }
}
object CaseClassDataHelper9 {
  def fromModel[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9](rep: CaseClassHelper9[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9], cv: Symbol => Any): CaseClassDataHelper9[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9] = {
    new CaseClassDataHelper9(
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
      column6 = rep.column6,
      data7 = cv(rep.column7.modelColumnSymbol).asInstanceOf[Data7],
      column7 = rep.column7,
      data8 = cv(rep.column8.modelColumnSymbol).asInstanceOf[Data8],
      column8 = rep.column8,
      data9 = cv(rep.column9.modelColumnSymbol).asInstanceOf[Data9],
      column9 = rep.column9)
  }
}
object CaseClassHelper9 {
  implicit def caseClassHelper9EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, RepCol, DataCol](
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
    shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper9[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9], Symbol => Any, CaseClassHelper9[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9], RepCol, DataCol] = {
    caseClassHelper9EncoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5,
      shape6,
      shape7,
      shape8,
      shape9).emap { (rep, s: Symbol => Any) => CaseClassDataHelper9.fromModel(rep, s) }
  }
  implicit def caseClassHelper9DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, RepCol, DataCol](
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
    shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper9[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9], SetterContent => SetterContent, CaseClassHelper9[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9], RepCol, DataCol] = {
    caseClassHelper9DecoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5,
      shape6,
      shape7,
      shape8,
      shape9).dmap((rep, s) => s.toSetterContent _)
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
  val column10: MacroColumnInfo) extends CaseClassDataHelperAbs {
  override def toSetterContent(setterContent: SetterContent): SetterContent = {
    val setterContent11 = setterContent
    val setterContent10 = CaseModelContent2222.set(setterContent11, column10.modelColumnSymbol, data10)
    val setterContent9 = CaseModelContent2222.set(setterContent10, column9.modelColumnSymbol, data9)
    val setterContent8 = CaseModelContent2222.set(setterContent9, column8.modelColumnSymbol, data8)
    val setterContent7 = CaseModelContent2222.set(setterContent8, column7.modelColumnSymbol, data7)
    val setterContent6 = CaseModelContent2222.set(setterContent7, column6.modelColumnSymbol, data6)
    val setterContent5 = CaseModelContent2222.set(setterContent6, column5.modelColumnSymbol, data5)
    val setterContent4 = CaseModelContent2222.set(setterContent5, column4.modelColumnSymbol, data4)
    val setterContent3 = CaseModelContent2222.set(setterContent4, column3.modelColumnSymbol, data3)
    val setterContent2 = CaseModelContent2222.set(setterContent3, column2.modelColumnSymbol, data2)
    val setterContent1 = CaseModelContent2222.set(setterContent2, column1.modelColumnSymbol, data1)
    setterContent1
  }
}
object CaseClassDataHelper10 {
  def fromModel[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10](rep: CaseClassHelper10[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10], cv: Symbol => Any): CaseClassDataHelper10[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10] = {
    new CaseClassDataHelper10(
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
      column6 = rep.column6,
      data7 = cv(rep.column7.modelColumnSymbol).asInstanceOf[Data7],
      column7 = rep.column7,
      data8 = cv(rep.column8.modelColumnSymbol).asInstanceOf[Data8],
      column8 = rep.column8,
      data9 = cv(rep.column9.modelColumnSymbol).asInstanceOf[Data9],
      column9 = rep.column9,
      data10 = cv(rep.column10.modelColumnSymbol).asInstanceOf[Data10],
      column10 = rep.column10)
  }
}
object CaseClassHelper10 {
  implicit def caseClassHelper10EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, RepCol, DataCol](
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
    shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper10[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10], Symbol => Any, CaseClassHelper10[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10], RepCol, DataCol] = {
    caseClassHelper10EncoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5,
      shape6,
      shape7,
      shape8,
      shape9,
      shape10).emap { (rep, s: Symbol => Any) => CaseClassDataHelper10.fromModel(rep, s) }
  }
  implicit def caseClassHelper10DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, RepCol, DataCol](
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
    shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper10[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10], SetterContent => SetterContent, CaseClassHelper10[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10], RepCol, DataCol] = {
    caseClassHelper10DecoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5,
      shape6,
      shape7,
      shape8,
      shape9,
      shape10).dmap((rep, s) => s.toSetterContent _)
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
  val column11: MacroColumnInfo) extends CaseClassDataHelperAbs {
  override def toSetterContent(setterContent: SetterContent): SetterContent = {
    val setterContent12 = setterContent
    val setterContent11 = CaseModelContent2222.set(setterContent12, column11.modelColumnSymbol, data11)
    val setterContent10 = CaseModelContent2222.set(setterContent11, column10.modelColumnSymbol, data10)
    val setterContent9 = CaseModelContent2222.set(setterContent10, column9.modelColumnSymbol, data9)
    val setterContent8 = CaseModelContent2222.set(setterContent9, column8.modelColumnSymbol, data8)
    val setterContent7 = CaseModelContent2222.set(setterContent8, column7.modelColumnSymbol, data7)
    val setterContent6 = CaseModelContent2222.set(setterContent7, column6.modelColumnSymbol, data6)
    val setterContent5 = CaseModelContent2222.set(setterContent6, column5.modelColumnSymbol, data5)
    val setterContent4 = CaseModelContent2222.set(setterContent5, column4.modelColumnSymbol, data4)
    val setterContent3 = CaseModelContent2222.set(setterContent4, column3.modelColumnSymbol, data3)
    val setterContent2 = CaseModelContent2222.set(setterContent3, column2.modelColumnSymbol, data2)
    val setterContent1 = CaseModelContent2222.set(setterContent2, column1.modelColumnSymbol, data1)
    setterContent1
  }
}
object CaseClassDataHelper11 {
  def fromModel[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11](rep: CaseClassHelper11[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11], cv: Symbol => Any): CaseClassDataHelper11[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11] = {
    new CaseClassDataHelper11(
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
      column6 = rep.column6,
      data7 = cv(rep.column7.modelColumnSymbol).asInstanceOf[Data7],
      column7 = rep.column7,
      data8 = cv(rep.column8.modelColumnSymbol).asInstanceOf[Data8],
      column8 = rep.column8,
      data9 = cv(rep.column9.modelColumnSymbol).asInstanceOf[Data9],
      column9 = rep.column9,
      data10 = cv(rep.column10.modelColumnSymbol).asInstanceOf[Data10],
      column10 = rep.column10,
      data11 = cv(rep.column11.modelColumnSymbol).asInstanceOf[Data11],
      column11 = rep.column11)
  }
}
object CaseClassHelper11 {
  implicit def caseClassHelper11EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, RepCol, DataCol](
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
    shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper11[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11], Symbol => Any, CaseClassHelper11[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11], RepCol, DataCol] = {
    caseClassHelper11EncoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5,
      shape6,
      shape7,
      shape8,
      shape9,
      shape10,
      shape11).emap { (rep, s: Symbol => Any) => CaseClassDataHelper11.fromModel(rep, s) }
  }
  implicit def caseClassHelper11DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, RepCol, DataCol](
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
    shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper11[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11], SetterContent => SetterContent, CaseClassHelper11[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11], RepCol, DataCol] = {
    caseClassHelper11DecoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5,
      shape6,
      shape7,
      shape8,
      shape9,
      shape10,
      shape11).dmap((rep, s) => s.toSetterContent _)
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
  val column12: MacroColumnInfo) extends CaseClassDataHelperAbs {
  override def toSetterContent(setterContent: SetterContent): SetterContent = {
    val setterContent13 = setterContent
    val setterContent12 = CaseModelContent2222.set(setterContent13, column12.modelColumnSymbol, data12)
    val setterContent11 = CaseModelContent2222.set(setterContent12, column11.modelColumnSymbol, data11)
    val setterContent10 = CaseModelContent2222.set(setterContent11, column10.modelColumnSymbol, data10)
    val setterContent9 = CaseModelContent2222.set(setterContent10, column9.modelColumnSymbol, data9)
    val setterContent8 = CaseModelContent2222.set(setterContent9, column8.modelColumnSymbol, data8)
    val setterContent7 = CaseModelContent2222.set(setterContent8, column7.modelColumnSymbol, data7)
    val setterContent6 = CaseModelContent2222.set(setterContent7, column6.modelColumnSymbol, data6)
    val setterContent5 = CaseModelContent2222.set(setterContent6, column5.modelColumnSymbol, data5)
    val setterContent4 = CaseModelContent2222.set(setterContent5, column4.modelColumnSymbol, data4)
    val setterContent3 = CaseModelContent2222.set(setterContent4, column3.modelColumnSymbol, data3)
    val setterContent2 = CaseModelContent2222.set(setterContent3, column2.modelColumnSymbol, data2)
    val setterContent1 = CaseModelContent2222.set(setterContent2, column1.modelColumnSymbol, data1)
    setterContent1
  }
}
object CaseClassDataHelper12 {
  def fromModel[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12](rep: CaseClassHelper12[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12], cv: Symbol => Any): CaseClassDataHelper12[Data1, Data2, Data3, Data4, Data5, Data6, Data7, Data8, Data9, Data10, Data11, Data12] = {
    new CaseClassDataHelper12(
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
      column6 = rep.column6,
      data7 = cv(rep.column7.modelColumnSymbol).asInstanceOf[Data7],
      column7 = rep.column7,
      data8 = cv(rep.column8.modelColumnSymbol).asInstanceOf[Data8],
      column8 = rep.column8,
      data9 = cv(rep.column9.modelColumnSymbol).asInstanceOf[Data9],
      column9 = rep.column9,
      data10 = cv(rep.column10.modelColumnSymbol).asInstanceOf[Data10],
      column10 = rep.column10,
      data11 = cv(rep.column11.modelColumnSymbol).asInstanceOf[Data11],
      column11 = rep.column11,
      data12 = cv(rep.column12.modelColumnSymbol).asInstanceOf[Data12],
      column12 = rep.column12)
  }
}
object CaseClassHelper12 {
  implicit def caseClassHelper12EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, RepCol, DataCol](
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
    shape12: Lazy[EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]]): EncoderShape.Aux[CaseClassHelper12[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12], Symbol => Any, CaseClassHelper12[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12], RepCol, DataCol] = {
    caseClassHelper12EncoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5,
      shape6,
      shape7,
      shape8,
      shape9,
      shape10,
      shape11,
      shape12).emap { (rep, s: Symbol => Any) => CaseClassDataHelper12.fromModel(rep, s) }
  }
  implicit def caseClassHelper12DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, Rep5, Data5, Target5, Rep6, Data6, Target6, Rep7, Data7, Target7, Rep8, Data8, Target8, Rep9, Data9, Target9, Rep10, Data10, Target10, Rep11, Data11, Target11, Rep12, Data12, Target12, RepCol, DataCol](
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
    shape12: Lazy[DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]]): DecoderShape.Aux[CaseClassHelper12[Rep1, Data1, Rep2, Data2, Rep3, Data3, Rep4, Data4, Rep5, Data5, Rep6, Data6, Rep7, Data7, Rep8, Data8, Rep9, Data9, Rep10, Data10, Rep11, Data11, Rep12, Data12], SetterContent => SetterContent, CaseClassHelper12[Target1, Data1, Target2, Data2, Target3, Data3, Target4, Data4, Target5, Data5, Target6, Data6, Target7, Data7, Target8, Data8, Target9, Data9, Target10, Data10, Target11, Data11, Target12, Data12], RepCol, DataCol] = {
    caseClassHelper12DecoderGen(
      shape1,
      shape2,
      shape3,
      shape4,
      shape5,
      shape6,
      shape7,
      shape8,
      shape9,
      shape10,
      shape11,
      shape12).dmap((rep, s) => s.toSetterContent _)
  }
}
