package net.scalax.asuna.mapper.common
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import shapeless._
trait CaseClassMapper
object CaseClassMapper {
  def withRep[
      Rep1
    , Data1
    , Target1
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , column1: MacroColumnInfo
  )(
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1]
  ): CaseClassRepMapper1[
      Target1
    , Data1
  ] = {
    new CaseClassRepMapper1(
        rep1 = wrap1.inputColumn(rep1, column1)
      , property1 = property1
    )
  }
  def withRep[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , column1: MacroColumnInfo
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , column2: MacroColumnInfo
  )(
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Target2]
  ): CaseClassRepMapper2[
      Target1
    , Data1
    , Target2
    , Data2
  ] = {
    new CaseClassRepMapper2(
        rep1 = wrap1.inputColumn(rep1, column1)
      , property1 = property1
      , rep2 = wrap2.inputColumn(rep2, column2)
      , property2 = property2
    )
  }
  def withRep[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , column1: MacroColumnInfo
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , column2: MacroColumnInfo
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , column3: MacroColumnInfo
  )(
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Target3]
  ): CaseClassRepMapper3[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
  ] = {
    new CaseClassRepMapper3(
        rep1 = wrap1.inputColumn(rep1, column1)
      , property1 = property1
      , rep2 = wrap2.inputColumn(rep2, column2)
      , property2 = property2
      , rep3 = wrap3.inputColumn(rep3, column3)
      , property3 = property3
    )
  }
  def withRep[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , column1: MacroColumnInfo
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , column2: MacroColumnInfo
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , column3: MacroColumnInfo
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , column4: MacroColumnInfo
  )(
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Target3],
    wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Target4]
  ): CaseClassRepMapper4[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
  ] = {
    new CaseClassRepMapper4(
        rep1 = wrap1.inputColumn(rep1, column1)
      , property1 = property1
      , rep2 = wrap2.inputColumn(rep2, column2)
      , property2 = property2
      , rep3 = wrap3.inputColumn(rep3, column3)
      , property3 = property3
      , rep4 = wrap4.inputColumn(rep4, column4)
      , property4 = property4
    )
  }
  def withRep[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , column1: MacroColumnInfo
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , column2: MacroColumnInfo
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , column3: MacroColumnInfo
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , column4: MacroColumnInfo
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , column5: MacroColumnInfo
  )(
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Target3],
    wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Target4],
    wrap5: RepGroupColumnWrapper.Aux[Rep5, Data5, Target5]
  ): CaseClassRepMapper5[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
  ] = {
    new CaseClassRepMapper5(
        rep1 = wrap1.inputColumn(rep1, column1)
      , property1 = property1
      , rep2 = wrap2.inputColumn(rep2, column2)
      , property2 = property2
      , rep3 = wrap3.inputColumn(rep3, column3)
      , property3 = property3
      , rep4 = wrap4.inputColumn(rep4, column4)
      , property4 = property4
      , rep5 = wrap5.inputColumn(rep5, column5)
      , property5 = property5
    )
  }
  def withRep[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , column1: MacroColumnInfo
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , column2: MacroColumnInfo
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , column3: MacroColumnInfo
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , column4: MacroColumnInfo
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , column5: MacroColumnInfo
    , rep6: Rep6
    , property6: PropertyType[Data6]
    , column6: MacroColumnInfo
  )(
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Target3],
    wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Target4],
    wrap5: RepGroupColumnWrapper.Aux[Rep5, Data5, Target5],
    wrap6: RepGroupColumnWrapper.Aux[Rep6, Data6, Target6]
  ): CaseClassRepMapper6[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
  ] = {
    new CaseClassRepMapper6(
        rep1 = wrap1.inputColumn(rep1, column1)
      , property1 = property1
      , rep2 = wrap2.inputColumn(rep2, column2)
      , property2 = property2
      , rep3 = wrap3.inputColumn(rep3, column3)
      , property3 = property3
      , rep4 = wrap4.inputColumn(rep4, column4)
      , property4 = property4
      , rep5 = wrap5.inputColumn(rep5, column5)
      , property5 = property5
      , rep6 = wrap6.inputColumn(rep6, column6)
      , property6 = property6
    )
  }
  def withRep[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , column1: MacroColumnInfo
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , column2: MacroColumnInfo
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , column3: MacroColumnInfo
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , column4: MacroColumnInfo
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , column5: MacroColumnInfo
    , rep6: Rep6
    , property6: PropertyType[Data6]
    , column6: MacroColumnInfo
    , rep7: Rep7
    , property7: PropertyType[Data7]
    , column7: MacroColumnInfo
  )(
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Target3],
    wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Target4],
    wrap5: RepGroupColumnWrapper.Aux[Rep5, Data5, Target5],
    wrap6: RepGroupColumnWrapper.Aux[Rep6, Data6, Target6],
    wrap7: RepGroupColumnWrapper.Aux[Rep7, Data7, Target7]
  ): CaseClassRepMapper7[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
  ] = {
    new CaseClassRepMapper7(
        rep1 = wrap1.inputColumn(rep1, column1)
      , property1 = property1
      , rep2 = wrap2.inputColumn(rep2, column2)
      , property2 = property2
      , rep3 = wrap3.inputColumn(rep3, column3)
      , property3 = property3
      , rep4 = wrap4.inputColumn(rep4, column4)
      , property4 = property4
      , rep5 = wrap5.inputColumn(rep5, column5)
      , property5 = property5
      , rep6 = wrap6.inputColumn(rep6, column6)
      , property6 = property6
      , rep7 = wrap7.inputColumn(rep7, column7)
      , property7 = property7
    )
  }
  def withRep[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , column1: MacroColumnInfo
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , column2: MacroColumnInfo
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , column3: MacroColumnInfo
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , column4: MacroColumnInfo
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , column5: MacroColumnInfo
    , rep6: Rep6
    , property6: PropertyType[Data6]
    , column6: MacroColumnInfo
    , rep7: Rep7
    , property7: PropertyType[Data7]
    , column7: MacroColumnInfo
    , rep8: Rep8
    , property8: PropertyType[Data8]
    , column8: MacroColumnInfo
  )(
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Target3],
    wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Target4],
    wrap5: RepGroupColumnWrapper.Aux[Rep5, Data5, Target5],
    wrap6: RepGroupColumnWrapper.Aux[Rep6, Data6, Target6],
    wrap7: RepGroupColumnWrapper.Aux[Rep7, Data7, Target7],
    wrap8: RepGroupColumnWrapper.Aux[Rep8, Data8, Target8]
  ): CaseClassRepMapper8[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
  ] = {
    new CaseClassRepMapper8(
        rep1 = wrap1.inputColumn(rep1, column1)
      , property1 = property1
      , rep2 = wrap2.inputColumn(rep2, column2)
      , property2 = property2
      , rep3 = wrap3.inputColumn(rep3, column3)
      , property3 = property3
      , rep4 = wrap4.inputColumn(rep4, column4)
      , property4 = property4
      , rep5 = wrap5.inputColumn(rep5, column5)
      , property5 = property5
      , rep6 = wrap6.inputColumn(rep6, column6)
      , property6 = property6
      , rep7 = wrap7.inputColumn(rep7, column7)
      , property7 = property7
      , rep8 = wrap8.inputColumn(rep8, column8)
      , property8 = property8
    )
  }
  def withRep[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , column1: MacroColumnInfo
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , column2: MacroColumnInfo
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , column3: MacroColumnInfo
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , column4: MacroColumnInfo
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , column5: MacroColumnInfo
    , rep6: Rep6
    , property6: PropertyType[Data6]
    , column6: MacroColumnInfo
    , rep7: Rep7
    , property7: PropertyType[Data7]
    , column7: MacroColumnInfo
    , rep8: Rep8
    , property8: PropertyType[Data8]
    , column8: MacroColumnInfo
    , rep9: Rep9
    , property9: PropertyType[Data9]
    , column9: MacroColumnInfo
  )(
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Target3],
    wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Target4],
    wrap5: RepGroupColumnWrapper.Aux[Rep5, Data5, Target5],
    wrap6: RepGroupColumnWrapper.Aux[Rep6, Data6, Target6],
    wrap7: RepGroupColumnWrapper.Aux[Rep7, Data7, Target7],
    wrap8: RepGroupColumnWrapper.Aux[Rep8, Data8, Target8],
    wrap9: RepGroupColumnWrapper.Aux[Rep9, Data9, Target9]
  ): CaseClassRepMapper9[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
  ] = {
    new CaseClassRepMapper9(
        rep1 = wrap1.inputColumn(rep1, column1)
      , property1 = property1
      , rep2 = wrap2.inputColumn(rep2, column2)
      , property2 = property2
      , rep3 = wrap3.inputColumn(rep3, column3)
      , property3 = property3
      , rep4 = wrap4.inputColumn(rep4, column4)
      , property4 = property4
      , rep5 = wrap5.inputColumn(rep5, column5)
      , property5 = property5
      , rep6 = wrap6.inputColumn(rep6, column6)
      , property6 = property6
      , rep7 = wrap7.inputColumn(rep7, column7)
      , property7 = property7
      , rep8 = wrap8.inputColumn(rep8, column8)
      , property8 = property8
      , rep9 = wrap9.inputColumn(rep9, column9)
      , property9 = property9
    )
  }
  def withRep[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , column1: MacroColumnInfo
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , column2: MacroColumnInfo
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , column3: MacroColumnInfo
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , column4: MacroColumnInfo
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , column5: MacroColumnInfo
    , rep6: Rep6
    , property6: PropertyType[Data6]
    , column6: MacroColumnInfo
    , rep7: Rep7
    , property7: PropertyType[Data7]
    , column7: MacroColumnInfo
    , rep8: Rep8
    , property8: PropertyType[Data8]
    , column8: MacroColumnInfo
    , rep9: Rep9
    , property9: PropertyType[Data9]
    , column9: MacroColumnInfo
    , rep10: Rep10
    , property10: PropertyType[Data10]
    , column10: MacroColumnInfo
  )(
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Target3],
    wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Target4],
    wrap5: RepGroupColumnWrapper.Aux[Rep5, Data5, Target5],
    wrap6: RepGroupColumnWrapper.Aux[Rep6, Data6, Target6],
    wrap7: RepGroupColumnWrapper.Aux[Rep7, Data7, Target7],
    wrap8: RepGroupColumnWrapper.Aux[Rep8, Data8, Target8],
    wrap9: RepGroupColumnWrapper.Aux[Rep9, Data9, Target9],
    wrap10: RepGroupColumnWrapper.Aux[Rep10, Data10, Target10]
  ): CaseClassRepMapper10[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
  ] = {
    new CaseClassRepMapper10(
        rep1 = wrap1.inputColumn(rep1, column1)
      , property1 = property1
      , rep2 = wrap2.inputColumn(rep2, column2)
      , property2 = property2
      , rep3 = wrap3.inputColumn(rep3, column3)
      , property3 = property3
      , rep4 = wrap4.inputColumn(rep4, column4)
      , property4 = property4
      , rep5 = wrap5.inputColumn(rep5, column5)
      , property5 = property5
      , rep6 = wrap6.inputColumn(rep6, column6)
      , property6 = property6
      , rep7 = wrap7.inputColumn(rep7, column7)
      , property7 = property7
      , rep8 = wrap8.inputColumn(rep8, column8)
      , property8 = property8
      , rep9 = wrap9.inputColumn(rep9, column9)
      , property9 = property9
      , rep10 = wrap10.inputColumn(rep10, column10)
      , property10 = property10
    )
  }
  def withRep[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
    , Rep11
    , Data11
    , Target11
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , column1: MacroColumnInfo
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , column2: MacroColumnInfo
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , column3: MacroColumnInfo
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , column4: MacroColumnInfo
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , column5: MacroColumnInfo
    , rep6: Rep6
    , property6: PropertyType[Data6]
    , column6: MacroColumnInfo
    , rep7: Rep7
    , property7: PropertyType[Data7]
    , column7: MacroColumnInfo
    , rep8: Rep8
    , property8: PropertyType[Data8]
    , column8: MacroColumnInfo
    , rep9: Rep9
    , property9: PropertyType[Data9]
    , column9: MacroColumnInfo
    , rep10: Rep10
    , property10: PropertyType[Data10]
    , column10: MacroColumnInfo
    , rep11: Rep11
    , property11: PropertyType[Data11]
    , column11: MacroColumnInfo
  )(
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Target3],
    wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Target4],
    wrap5: RepGroupColumnWrapper.Aux[Rep5, Data5, Target5],
    wrap6: RepGroupColumnWrapper.Aux[Rep6, Data6, Target6],
    wrap7: RepGroupColumnWrapper.Aux[Rep7, Data7, Target7],
    wrap8: RepGroupColumnWrapper.Aux[Rep8, Data8, Target8],
    wrap9: RepGroupColumnWrapper.Aux[Rep9, Data9, Target9],
    wrap10: RepGroupColumnWrapper.Aux[Rep10, Data10, Target10],
    wrap11: RepGroupColumnWrapper.Aux[Rep11, Data11, Target11]
  ): CaseClassRepMapper11[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
  ] = {
    new CaseClassRepMapper11(
        rep1 = wrap1.inputColumn(rep1, column1)
      , property1 = property1
      , rep2 = wrap2.inputColumn(rep2, column2)
      , property2 = property2
      , rep3 = wrap3.inputColumn(rep3, column3)
      , property3 = property3
      , rep4 = wrap4.inputColumn(rep4, column4)
      , property4 = property4
      , rep5 = wrap5.inputColumn(rep5, column5)
      , property5 = property5
      , rep6 = wrap6.inputColumn(rep6, column6)
      , property6 = property6
      , rep7 = wrap7.inputColumn(rep7, column7)
      , property7 = property7
      , rep8 = wrap8.inputColumn(rep8, column8)
      , property8 = property8
      , rep9 = wrap9.inputColumn(rep9, column9)
      , property9 = property9
      , rep10 = wrap10.inputColumn(rep10, column10)
      , property10 = property10
      , rep11 = wrap11.inputColumn(rep11, column11)
      , property11 = property11
    )
  }
  def withRep[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
    , Rep11
    , Data11
    , Target11
    , Rep12
    , Data12
    , Target12
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , column1: MacroColumnInfo
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , column2: MacroColumnInfo
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , column3: MacroColumnInfo
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , column4: MacroColumnInfo
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , column5: MacroColumnInfo
    , rep6: Rep6
    , property6: PropertyType[Data6]
    , column6: MacroColumnInfo
    , rep7: Rep7
    , property7: PropertyType[Data7]
    , column7: MacroColumnInfo
    , rep8: Rep8
    , property8: PropertyType[Data8]
    , column8: MacroColumnInfo
    , rep9: Rep9
    , property9: PropertyType[Data9]
    , column9: MacroColumnInfo
    , rep10: Rep10
    , property10: PropertyType[Data10]
    , column10: MacroColumnInfo
    , rep11: Rep11
    , property11: PropertyType[Data11]
    , column11: MacroColumnInfo
    , rep12: Rep12
    , property12: PropertyType[Data12]
    , column12: MacroColumnInfo
  )(
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Target3],
    wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Target4],
    wrap5: RepGroupColumnWrapper.Aux[Rep5, Data5, Target5],
    wrap6: RepGroupColumnWrapper.Aux[Rep6, Data6, Target6],
    wrap7: RepGroupColumnWrapper.Aux[Rep7, Data7, Target7],
    wrap8: RepGroupColumnWrapper.Aux[Rep8, Data8, Target8],
    wrap9: RepGroupColumnWrapper.Aux[Rep9, Data9, Target9],
    wrap10: RepGroupColumnWrapper.Aux[Rep10, Data10, Target10],
    wrap11: RepGroupColumnWrapper.Aux[Rep11, Data11, Target11],
    wrap12: RepGroupColumnWrapper.Aux[Rep12, Data12, Target12]
  ): CaseClassRepMapper12[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
    , Target12
    , Data12
  ] = {
    new CaseClassRepMapper12(
        rep1 = wrap1.inputColumn(rep1, column1)
      , property1 = property1
      , rep2 = wrap2.inputColumn(rep2, column2)
      , property2 = property2
      , rep3 = wrap3.inputColumn(rep3, column3)
      , property3 = property3
      , rep4 = wrap4.inputColumn(rep4, column4)
      , property4 = property4
      , rep5 = wrap5.inputColumn(rep5, column5)
      , property5 = property5
      , rep6 = wrap6.inputColumn(rep6, column6)
      , property6 = property6
      , rep7 = wrap7.inputColumn(rep7, column7)
      , property7 = property7
      , rep8 = wrap8.inputColumn(rep8, column8)
      , property8 = property8
      , rep9 = wrap9.inputColumn(rep9, column9)
      , property9 = property9
      , rep10 = wrap10.inputColumn(rep10, column10)
      , property10 = property10
      , rep11 = wrap11.inputColumn(rep11, column11)
      , property11 = property11
      , rep12 = wrap12.inputColumn(rep12, column12)
      , property12 = property12
    )
  }
  def withLawRep[
      Rep1
    , Data1
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
  ): CaseClassRepMapper1[
      Rep1
    , Data1
  ] = {
    new CaseClassRepMapper1(
        rep1 = rep1
      , property1 = property1
    )
  }
  def withLawRep[
      Rep1
    , Data1
    , Rep2
    , Data2
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , rep2: Rep2
    , property2: PropertyType[Data2]
  ): CaseClassRepMapper2[
      Rep1
    , Data1
    , Rep2
    , Data2
  ] = {
    new CaseClassRepMapper2(
        rep1 = rep1
      , property1 = property1
      , rep2 = rep2
      , property2 = property2
    )
  }
  def withLawRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , rep3: Rep3
    , property3: PropertyType[Data3]
  ): CaseClassRepMapper3[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
  ] = {
    new CaseClassRepMapper3(
        rep1 = rep1
      , property1 = property1
      , rep2 = rep2
      , property2 = property2
      , rep3 = rep3
      , property3 = property3
    )
  }
  def withLawRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , rep4: Rep4
    , property4: PropertyType[Data4]
  ): CaseClassRepMapper4[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
  ] = {
    new CaseClassRepMapper4(
        rep1 = rep1
      , property1 = property1
      , rep2 = rep2
      , property2 = property2
      , rep3 = rep3
      , property3 = property3
      , rep4 = rep4
      , property4 = property4
    )
  }
  def withLawRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , rep5: Rep5
    , property5: PropertyType[Data5]
  ): CaseClassRepMapper5[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
  ] = {
    new CaseClassRepMapper5(
        rep1 = rep1
      , property1 = property1
      , rep2 = rep2
      , property2 = property2
      , rep3 = rep3
      , property3 = property3
      , rep4 = rep4
      , property4 = property4
      , rep5 = rep5
      , property5 = property5
    )
  }
  def withLawRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , rep6: Rep6
    , property6: PropertyType[Data6]
  ): CaseClassRepMapper6[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
  ] = {
    new CaseClassRepMapper6(
        rep1 = rep1
      , property1 = property1
      , rep2 = rep2
      , property2 = property2
      , rep3 = rep3
      , property3 = property3
      , rep4 = rep4
      , property4 = property4
      , rep5 = rep5
      , property5 = property5
      , rep6 = rep6
      , property6 = property6
    )
  }
  def withLawRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , rep6: Rep6
    , property6: PropertyType[Data6]
    , rep7: Rep7
    , property7: PropertyType[Data7]
  ): CaseClassRepMapper7[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
  ] = {
    new CaseClassRepMapper7(
        rep1 = rep1
      , property1 = property1
      , rep2 = rep2
      , property2 = property2
      , rep3 = rep3
      , property3 = property3
      , rep4 = rep4
      , property4 = property4
      , rep5 = rep5
      , property5 = property5
      , rep6 = rep6
      , property6 = property6
      , rep7 = rep7
      , property7 = property7
    )
  }
  def withLawRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , rep6: Rep6
    , property6: PropertyType[Data6]
    , rep7: Rep7
    , property7: PropertyType[Data7]
    , rep8: Rep8
    , property8: PropertyType[Data8]
  ): CaseClassRepMapper8[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
  ] = {
    new CaseClassRepMapper8(
        rep1 = rep1
      , property1 = property1
      , rep2 = rep2
      , property2 = property2
      , rep3 = rep3
      , property3 = property3
      , rep4 = rep4
      , property4 = property4
      , rep5 = rep5
      , property5 = property5
      , rep6 = rep6
      , property6 = property6
      , rep7 = rep7
      , property7 = property7
      , rep8 = rep8
      , property8 = property8
    )
  }
  def withLawRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , rep6: Rep6
    , property6: PropertyType[Data6]
    , rep7: Rep7
    , property7: PropertyType[Data7]
    , rep8: Rep8
    , property8: PropertyType[Data8]
    , rep9: Rep9
    , property9: PropertyType[Data9]
  ): CaseClassRepMapper9[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
  ] = {
    new CaseClassRepMapper9(
        rep1 = rep1
      , property1 = property1
      , rep2 = rep2
      , property2 = property2
      , rep3 = rep3
      , property3 = property3
      , rep4 = rep4
      , property4 = property4
      , rep5 = rep5
      , property5 = property5
      , rep6 = rep6
      , property6 = property6
      , rep7 = rep7
      , property7 = property7
      , rep8 = rep8
      , property8 = property8
      , rep9 = rep9
      , property9 = property9
    )
  }
  def withLawRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , rep6: Rep6
    , property6: PropertyType[Data6]
    , rep7: Rep7
    , property7: PropertyType[Data7]
    , rep8: Rep8
    , property8: PropertyType[Data8]
    , rep9: Rep9
    , property9: PropertyType[Data9]
    , rep10: Rep10
    , property10: PropertyType[Data10]
  ): CaseClassRepMapper10[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
  ] = {
    new CaseClassRepMapper10(
        rep1 = rep1
      , property1 = property1
      , rep2 = rep2
      , property2 = property2
      , rep3 = rep3
      , property3 = property3
      , rep4 = rep4
      , property4 = property4
      , rep5 = rep5
      , property5 = property5
      , rep6 = rep6
      , property6 = property6
      , rep7 = rep7
      , property7 = property7
      , rep8 = rep8
      , property8 = property8
      , rep9 = rep9
      , property9 = property9
      , rep10 = rep10
      , property10 = property10
    )
  }
  def withLawRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , rep6: Rep6
    , property6: PropertyType[Data6]
    , rep7: Rep7
    , property7: PropertyType[Data7]
    , rep8: Rep8
    , property8: PropertyType[Data8]
    , rep9: Rep9
    , property9: PropertyType[Data9]
    , rep10: Rep10
    , property10: PropertyType[Data10]
    , rep11: Rep11
    , property11: PropertyType[Data11]
  ): CaseClassRepMapper11[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
  ] = {
    new CaseClassRepMapper11(
        rep1 = rep1
      , property1 = property1
      , rep2 = rep2
      , property2 = property2
      , rep3 = rep3
      , property3 = property3
      , rep4 = rep4
      , property4 = property4
      , rep5 = rep5
      , property5 = property5
      , rep6 = rep6
      , property6 = property6
      , rep7 = rep7
      , property7 = property7
      , rep8 = rep8
      , property8 = property8
      , rep9 = rep9
      , property9 = property9
      , rep10 = rep10
      , property10 = property10
      , rep11 = rep11
      , property11 = property11
    )
  }
  def withLawRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
  ](
      rep1: Rep1
    , property1: PropertyType[Data1]
    , rep2: Rep2
    , property2: PropertyType[Data2]
    , rep3: Rep3
    , property3: PropertyType[Data3]
    , rep4: Rep4
    , property4: PropertyType[Data4]
    , rep5: Rep5
    , property5: PropertyType[Data5]
    , rep6: Rep6
    , property6: PropertyType[Data6]
    , rep7: Rep7
    , property7: PropertyType[Data7]
    , rep8: Rep8
    , property8: PropertyType[Data8]
    , rep9: Rep9
    , property9: PropertyType[Data9]
    , rep10: Rep10
    , property10: PropertyType[Data10]
    , rep11: Rep11
    , property11: PropertyType[Data11]
    , rep12: Rep12
    , property12: PropertyType[Data12]
  ): CaseClassRepMapper12[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
  ] = {
    new CaseClassRepMapper12(
        rep1 = rep1
      , property1 = property1
      , rep2 = rep2
      , property2 = property2
      , rep3 = rep3
      , property3 = property3
      , rep4 = rep4
      , property4 = property4
      , rep5 = rep5
      , property5 = property5
      , rep6 = rep6
      , property6 = property6
      , rep7 = rep7
      , property7 = property7
      , rep8 = rep8
      , property8 = property8
      , rep9 = rep9
      , property9 = property9
      , rep10 = rep10
      , property10 = property10
      , rep11 = rep11
      , property11 = property11
      , rep12 = rep12
      , property12 = property12
    )
  }
  def withData[
      Data1
  ](
      data1: Data1
  ): CaseClassDataMapper1[
      Data1
  ] = {
    new CaseClassDataMapper1(
        data1 = data1
    )
  }
  def withData[
      Data1
    , Data2
  ](
      data1: Data1
    , data2: Data2
  ): CaseClassDataMapper2[
      Data1
    , Data2
  ] = {
    new CaseClassDataMapper2(
        data1 = data1
      , data2 = data2
    )
  }
  def withData[
      Data1
    , Data2
    , Data3
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
  ): CaseClassDataMapper3[
      Data1
    , Data2
    , Data3
  ] = {
    new CaseClassDataMapper3(
        data1 = data1
      , data2 = data2
      , data3 = data3
    )
  }
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
  ): CaseClassDataMapper4[
      Data1
    , Data2
    , Data3
    , Data4
  ] = {
    new CaseClassDataMapper4(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
    )
  }
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
  ): CaseClassDataMapper5[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ] = {
    new CaseClassDataMapper5(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
    )
  }
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
  ): CaseClassDataMapper6[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ] = {
    new CaseClassDataMapper6(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
    )
  }
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
    , data7: Data7
  ): CaseClassDataMapper7[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ] = {
    new CaseClassDataMapper7(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
      , data7 = data7
    )
  }
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
    , data7: Data7
    , data8: Data8
  ): CaseClassDataMapper8[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ] = {
    new CaseClassDataMapper8(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
      , data7 = data7
      , data8 = data8
    )
  }
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
    , data7: Data7
    , data8: Data8
    , data9: Data9
  ): CaseClassDataMapper9[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ] = {
    new CaseClassDataMapper9(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
      , data7 = data7
      , data8 = data8
      , data9 = data9
    )
  }
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
    , data7: Data7
    , data8: Data8
    , data9: Data9
    , data10: Data10
  ): CaseClassDataMapper10[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ] = {
    new CaseClassDataMapper10(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
      , data7 = data7
      , data8 = data8
      , data9 = data9
      , data10 = data10
    )
  }
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
    , data7: Data7
    , data8: Data8
    , data9: Data9
    , data10: Data10
    , data11: Data11
  ): CaseClassDataMapper11[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ] = {
    new CaseClassDataMapper11(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
      , data7 = data7
      , data8 = data8
      , data9 = data9
      , data10 = data10
      , data11 = data11
    )
  }
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
    , data7: Data7
    , data8: Data8
    , data9: Data9
    , data10: Data10
    , data11: Data11
    , data12: Data12
  ): CaseClassDataMapper12[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ] = {
    new CaseClassDataMapper12(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
      , data7 = data7
      , data8 = data8
      , data9 = data9
      , data10 = data10
      , data11 = data11
      , data12 = data12
    )
  }
}
trait CaseClassDataMapperHelper
object CaseClassDataMapperHelper {}
class CaseClassRepMapper1[
    Rep1
  , Data1
](
    val rep1: Rep1
  , val property1: PropertyType[Data1]
) {
  self =>
  lazy val propertyType: PropertyType[CaseClassDataMapper1[
      Data1
  ]] = new PropertyType[CaseClassDataMapper1[
      Data1
  ]] {}
  lazy val dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper1[
      Rep1
    , Data1
  ], CaseClassDataMapper1[
      Data1
  ]] = DataGenWrap.value[CaseClassRepMapper1[
      Rep1
    , Data1
  ], CaseClassDataMapper1[
      Data1
  ]](self)
}
class CaseClassDataMapper1[
    Data1
](
    val data1: Data1
)
object CaseClassRepMapper1 {
  implicit def caseClassHelper1EncoderGen[Rep1, Data1, Target1, RepCol, DataCol](
      implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
  ): EncoderShape.Aux[CaseClassRepMapper1[
      Rep1
    , Data1
  ], CaseClassDataMapper1[
      Data1
  ], CaseClassRepMapper1[
      Target1
    , Data1
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper1[
        Rep1
      , Data1
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper1[
          Target1
        , Data1
      ]
      override type Data = CaseClassDataMapper1[
          Data1
      ]
      override def wrapRep(
        base: CaseClassRepMapper1[
            Rep1
          , Data1
        ]
      ): CaseClassRepMapper1[
          Target1
        , Data1
      ] = {
        new CaseClassRepMapper1(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper1[
            Target1
          , Data1
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep2 = oldRep
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(
        data: CaseClassDataMapper1[
            Data1
        ],
        rep: CaseClassRepMapper1[
            Target1
          , Data1
        ],
        oldData: DataCol
      ): DataCol = {
        val data2 = oldData
        val data1 = shape1.value.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper1DecoderGen[Rep1, Data1, Target1, RepCol, DataCol](
      implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
  ): DecoderShape.Aux[CaseClassRepMapper1[
      Rep1
    , Data1
  ], CaseClassDataMapper1[
      Data1
  ], CaseClassRepMapper1[
      Target1
    , Data1
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper1[
        Rep1
      , Data1
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper1[
          Target1
        , Data1
      ]
      override type Data = CaseClassDataMapper1[
          Data1
      ]
      override def wrapRep(
        base: CaseClassRepMapper1[
            Rep1
          , Data1
        ]
      ): CaseClassRepMapper1[
          Target1
        , Data1
      ] = {
        new CaseClassRepMapper1(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper1[
            Target1
          , Data1
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep2 = oldRep
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(
        rep: CaseClassRepMapper1[
            Target1
          , Data1
        ],
        oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper1[
          Data1
      ], DataCol] = {
        val dataCol0                   = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        SplitData(
          current = new CaseClassDataMapper1(
              data1 = item1
          ),
          left = dataCol1
        )
      }
    }
  }
}
class CaseClassRepMapper2[
    Rep1
  , Data1
  , Rep2
  , Data2
](
    val rep1: Rep1
  , val property1: PropertyType[Data1]
  , val rep2: Rep2
  , val property2: PropertyType[Data2]
) {
  self =>
  lazy val propertyType: PropertyType[CaseClassDataMapper2[
      Data1
    , Data2
  ]] = new PropertyType[CaseClassDataMapper2[
      Data1
    , Data2
  ]] {}
  lazy val dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper2[
      Rep1
    , Data1
    , Rep2
    , Data2
  ], CaseClassDataMapper2[
      Data1
    , Data2
  ]] = DataGenWrap.value[CaseClassRepMapper2[
      Rep1
    , Data1
    , Rep2
    , Data2
  ], CaseClassDataMapper2[
      Data1
    , Data2
  ]](self)
}
class CaseClassDataMapper2[
    Data1
  , Data2
](
    val data1: Data1
  , val data2: Data2
)
object CaseClassRepMapper2 {
  implicit def caseClassHelper2EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, RepCol, DataCol](
      implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
  ): EncoderShape.Aux[CaseClassRepMapper2[
      Rep1
    , Data1
    , Rep2
    , Data2
  ], CaseClassDataMapper2[
      Data1
    , Data2
  ], CaseClassRepMapper2[
      Target1
    , Data1
    , Target2
    , Data2
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper2[
        Rep1
      , Data1
      , Rep2
      , Data2
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper2[
          Target1
        , Data1
        , Target2
        , Data2
      ]
      override type Data = CaseClassDataMapper2[
          Data1
        , Data2
      ]
      override def wrapRep(
        base: CaseClassRepMapper2[
            Rep1
          , Data1
          , Rep2
          , Data2
        ]
      ): CaseClassRepMapper2[
          Target1
        , Data1
        , Target2
        , Data2
      ] = {
        new CaseClassRepMapper2(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep3 = oldRep
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(
        data: CaseClassDataMapper2[
            Data1
          , Data2
        ],
        rep: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ],
        oldData: DataCol
      ): DataCol = {
        val data3 = oldData
        val data2 = shape2.value.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.value.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper2DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, RepCol, DataCol](
      implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
  ): DecoderShape.Aux[CaseClassRepMapper2[
      Rep1
    , Data1
    , Rep2
    , Data2
  ], CaseClassDataMapper2[
      Data1
    , Data2
  ], CaseClassRepMapper2[
      Target1
    , Data1
    , Target2
    , Data2
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper2[
        Rep1
      , Data1
      , Rep2
      , Data2
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper2[
          Target1
        , Data1
        , Target2
        , Data2
      ]
      override type Data = CaseClassDataMapper2[
          Data1
        , Data2
      ]
      override def wrapRep(
        base: CaseClassRepMapper2[
            Rep1
          , Data1
          , Rep2
          , Data2
        ]
      ): CaseClassRepMapper2[
          Target1
        , Data1
        , Target2
        , Data2
      ] = {
        new CaseClassRepMapper2(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep3 = oldRep
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(
        rep: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ],
        oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper2[
          Data1
        , Data2
      ], DataCol] = {
        val dataCol0                   = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        SplitData(
          current = new CaseClassDataMapper2(
              data1 = item1
            , data2 = item2
          ),
          left = dataCol2
        )
      }
    }
  }
}
class CaseClassRepMapper3[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
](
    val rep1: Rep1
  , val property1: PropertyType[Data1]
  , val rep2: Rep2
  , val property2: PropertyType[Data2]
  , val rep3: Rep3
  , val property3: PropertyType[Data3]
) {
  self =>
  lazy val propertyType: PropertyType[CaseClassDataMapper3[
      Data1
    , Data2
    , Data3
  ]] = new PropertyType[CaseClassDataMapper3[
      Data1
    , Data2
    , Data3
  ]] {}
  lazy val dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper3[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
  ], CaseClassDataMapper3[
      Data1
    , Data2
    , Data3
  ]] = DataGenWrap.value[CaseClassRepMapper3[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
  ], CaseClassDataMapper3[
      Data1
    , Data2
    , Data3
  ]](self)
}
class CaseClassDataMapper3[
    Data1
  , Data2
  , Data3
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
)
object CaseClassRepMapper3 {
  implicit def caseClassHelper3EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, RepCol, DataCol](
      implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
  ): EncoderShape.Aux[CaseClassRepMapper3[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
  ], CaseClassDataMapper3[
      Data1
    , Data2
    , Data3
  ], CaseClassRepMapper3[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper3[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper3[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
      ]
      override type Data = CaseClassDataMapper3[
          Data1
        , Data2
        , Data3
      ]
      override def wrapRep(
        base: CaseClassRepMapper3[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
        ]
      ): CaseClassRepMapper3[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
      ] = {
        new CaseClassRepMapper3(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep4 = oldRep
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(
        data: CaseClassDataMapper3[
            Data1
          , Data2
          , Data3
        ],
        rep: CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ],
        oldData: DataCol
      ): DataCol = {
        val data4 = oldData
        val data3 = shape3.value.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.value.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.value.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper3DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, RepCol, DataCol](
      implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
  ): DecoderShape.Aux[CaseClassRepMapper3[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
  ], CaseClassDataMapper3[
      Data1
    , Data2
    , Data3
  ], CaseClassRepMapper3[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper3[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper3[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
      ]
      override type Data = CaseClassDataMapper3[
          Data1
        , Data2
        , Data3
      ]
      override def wrapRep(
        base: CaseClassRepMapper3[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
        ]
      ): CaseClassRepMapper3[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
      ] = {
        new CaseClassRepMapper3(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep4 = oldRep
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(
        rep: CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ],
        oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper3[
          Data1
        , Data2
        , Data3
      ], DataCol] = {
        val dataCol0                   = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        SplitData(
          current = new CaseClassDataMapper3(
              data1 = item1
            , data2 = item2
            , data3 = item3
          ),
          left = dataCol3
        )
      }
    }
  }
}
class CaseClassRepMapper4[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
](
    val rep1: Rep1
  , val property1: PropertyType[Data1]
  , val rep2: Rep2
  , val property2: PropertyType[Data2]
  , val rep3: Rep3
  , val property3: PropertyType[Data3]
  , val rep4: Rep4
  , val property4: PropertyType[Data4]
) {
  self =>
  lazy val propertyType: PropertyType[CaseClassDataMapper4[
      Data1
    , Data2
    , Data3
    , Data4
  ]] = new PropertyType[CaseClassDataMapper4[
      Data1
    , Data2
    , Data3
    , Data4
  ]] {}
  lazy val dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper4[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
  ], CaseClassDataMapper4[
      Data1
    , Data2
    , Data3
    , Data4
  ]] = DataGenWrap.value[CaseClassRepMapper4[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
  ], CaseClassDataMapper4[
      Data1
    , Data2
    , Data3
    , Data4
  ]](self)
}
class CaseClassDataMapper4[
    Data1
  , Data2
  , Data3
  , Data4
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
)
object CaseClassRepMapper4 {
  implicit def caseClassHelper4EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, RepCol, DataCol](
      implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
  ): EncoderShape.Aux[CaseClassRepMapper4[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
  ], CaseClassDataMapper4[
      Data1
    , Data2
    , Data3
    , Data4
  ], CaseClassRepMapper4[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper4[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper4[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
      ]
      override type Data = CaseClassDataMapper4[
          Data1
        , Data2
        , Data3
        , Data4
      ]
      override def wrapRep(
        base: CaseClassRepMapper4[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
        ]
      ): CaseClassRepMapper4[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
      ] = {
        new CaseClassRepMapper4(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep5 = oldRep
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(
        data: CaseClassDataMapper4[
            Data1
          , Data2
          , Data3
          , Data4
        ],
        rep: CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ],
        oldData: DataCol
      ): DataCol = {
        val data5 = oldData
        val data4 = shape4.value.buildData(data.data4, rep.rep4, data5)
        val data3 = shape3.value.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.value.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.value.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper4DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, RepCol, DataCol](
      implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
  ): DecoderShape.Aux[CaseClassRepMapper4[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
  ], CaseClassDataMapper4[
      Data1
    , Data2
    , Data3
    , Data4
  ], CaseClassRepMapper4[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper4[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper4[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
      ]
      override type Data = CaseClassDataMapper4[
          Data1
        , Data2
        , Data3
        , Data4
      ]
      override def wrapRep(
        base: CaseClassRepMapper4[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
        ]
      ): CaseClassRepMapper4[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
      ] = {
        new CaseClassRepMapper4(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep5 = oldRep
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(
        rep: CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ],
        oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper4[
          Data1
        , Data2
        , Data3
        , Data4
      ], DataCol] = {
        val dataCol0                   = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        SplitData(
          current = new CaseClassDataMapper4(
              data1 = item1
            , data2 = item2
            , data3 = item3
            , data4 = item4
          ),
          left = dataCol4
        )
      }
    }
  }
}
class CaseClassRepMapper5[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
](
    val rep1: Rep1
  , val property1: PropertyType[Data1]
  , val rep2: Rep2
  , val property2: PropertyType[Data2]
  , val rep3: Rep3
  , val property3: PropertyType[Data3]
  , val rep4: Rep4
  , val property4: PropertyType[Data4]
  , val rep5: Rep5
  , val property5: PropertyType[Data5]
) {
  self =>
  lazy val propertyType: PropertyType[CaseClassDataMapper5[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ]] = new PropertyType[CaseClassDataMapper5[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ]] {}
  lazy val dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper5[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
  ], CaseClassDataMapper5[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ]] = DataGenWrap.value[CaseClassRepMapper5[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
  ], CaseClassDataMapper5[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ]](self)
}
class CaseClassDataMapper5[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
)
object CaseClassRepMapper5 {
  implicit def caseClassHelper5EncoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
  ): EncoderShape.Aux[CaseClassRepMapper5[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
  ], CaseClassDataMapper5[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ], CaseClassRepMapper5[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper5[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper5[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
      ]
      override type Data = CaseClassDataMapper5[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
      ]
      override def wrapRep(
        base: CaseClassRepMapper5[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
        ]
      ): CaseClassRepMapper5[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
      ] = {
        new CaseClassRepMapper5(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper5[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep6 = oldRep
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(
        data: CaseClassDataMapper5[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
        ],
        rep: CaseClassRepMapper5[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
        ],
        oldData: DataCol
      ): DataCol = {
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
  implicit def caseClassHelper5DecoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
  ): DecoderShape.Aux[CaseClassRepMapper5[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
  ], CaseClassDataMapper5[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ], CaseClassRepMapper5[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper5[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper5[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
      ]
      override type Data = CaseClassDataMapper5[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
      ]
      override def wrapRep(
        base: CaseClassRepMapper5[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
        ]
      ): CaseClassRepMapper5[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
      ] = {
        new CaseClassRepMapper5(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper5[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep6 = oldRep
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(
        rep: CaseClassRepMapper5[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
        ],
        oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper5[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
      ], DataCol] = {
        val dataCol0                   = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        SplitData(
          current = new CaseClassDataMapper5(
              data1 = item1
            , data2 = item2
            , data3 = item3
            , data4 = item4
            , data5 = item5
          ),
          left = dataCol5
        )
      }
    }
  }
}
class CaseClassRepMapper6[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
](
    val rep1: Rep1
  , val property1: PropertyType[Data1]
  , val rep2: Rep2
  , val property2: PropertyType[Data2]
  , val rep3: Rep3
  , val property3: PropertyType[Data3]
  , val rep4: Rep4
  , val property4: PropertyType[Data4]
  , val rep5: Rep5
  , val property5: PropertyType[Data5]
  , val rep6: Rep6
  , val property6: PropertyType[Data6]
) {
  self =>
  lazy val propertyType: PropertyType[CaseClassDataMapper6[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ]] = new PropertyType[CaseClassDataMapper6[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ]] {}
  lazy val dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper6[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
  ], CaseClassDataMapper6[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ]] = DataGenWrap.value[CaseClassRepMapper6[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
  ], CaseClassDataMapper6[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ]](self)
}
class CaseClassDataMapper6[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
)
object CaseClassRepMapper6 {
  implicit def caseClassHelper6EncoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    Rep6,
    Data6,
    Target6,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
    , shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]
  ): EncoderShape.Aux[CaseClassRepMapper6[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
  ], CaseClassDataMapper6[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ], CaseClassRepMapper6[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper6[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper6[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
      ]
      override type Data = CaseClassDataMapper6[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
      ]
      override def wrapRep(
        base: CaseClassRepMapper6[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
        ]
      ): CaseClassRepMapper6[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
      ] = {
        new CaseClassRepMapper6(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
          , rep6 = shape6.value.wrapRep(base.rep6)
          , property6 = base.property6
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper6[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep7 = oldRep
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(
        data: CaseClassDataMapper6[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
        ],
        rep: CaseClassRepMapper6[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
        ],
        oldData: DataCol
      ): DataCol = {
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
  implicit def caseClassHelper6DecoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    Rep6,
    Data6,
    Target6,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
    , shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]
  ): DecoderShape.Aux[CaseClassRepMapper6[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
  ], CaseClassDataMapper6[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ], CaseClassRepMapper6[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper6[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper6[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
      ]
      override type Data = CaseClassDataMapper6[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
      ]
      override def wrapRep(
        base: CaseClassRepMapper6[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
        ]
      ): CaseClassRepMapper6[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
      ] = {
        new CaseClassRepMapper6(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
          , rep6 = shape6.value.wrapRep(base.rep6)
          , property6 = base.property6
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper6[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep7 = oldRep
        val rep6 = shape6.value.toLawRep(base.rep6, rep7)
        val rep5 = shape5.value.toLawRep(base.rep5, rep6)
        val rep4 = shape4.value.toLawRep(base.rep4, rep5)
        val rep3 = shape3.value.toLawRep(base.rep3, rep4)
        val rep2 = shape2.value.toLawRep(base.rep2, rep3)
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(
        rep: CaseClassRepMapper6[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
        ],
        oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper6[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
      ], DataCol] = {
        val dataCol0                   = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        SplitData(
          current = new CaseClassDataMapper6(
              data1 = item1
            , data2 = item2
            , data3 = item3
            , data4 = item4
            , data5 = item5
            , data6 = item6
          ),
          left = dataCol6
        )
      }
    }
  }
}
class CaseClassRepMapper7[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
  , Rep7
  , Data7
](
    val rep1: Rep1
  , val property1: PropertyType[Data1]
  , val rep2: Rep2
  , val property2: PropertyType[Data2]
  , val rep3: Rep3
  , val property3: PropertyType[Data3]
  , val rep4: Rep4
  , val property4: PropertyType[Data4]
  , val rep5: Rep5
  , val property5: PropertyType[Data5]
  , val rep6: Rep6
  , val property6: PropertyType[Data6]
  , val rep7: Rep7
  , val property7: PropertyType[Data7]
) {
  self =>
  lazy val propertyType: PropertyType[CaseClassDataMapper7[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ]] = new PropertyType[CaseClassDataMapper7[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ]] {}
  lazy val dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper7[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
  ], CaseClassDataMapper7[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ]] = DataGenWrap.value[CaseClassRepMapper7[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
  ], CaseClassDataMapper7[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ]](self)
}
class CaseClassDataMapper7[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
  , val data7: Data7
)
object CaseClassRepMapper7 {
  implicit def caseClassHelper7EncoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    Rep6,
    Data6,
    Target6,
    Rep7,
    Data7,
    Target7,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
    , shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]
    , shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]
  ): EncoderShape.Aux[CaseClassRepMapper7[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
  ], CaseClassDataMapper7[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ], CaseClassRepMapper7[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper7[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper7[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
      ]
      override type Data = CaseClassDataMapper7[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
      ]
      override def wrapRep(
        base: CaseClassRepMapper7[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
        ]
      ): CaseClassRepMapper7[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
      ] = {
        new CaseClassRepMapper7(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
          , rep6 = shape6.value.wrapRep(base.rep6)
          , property6 = base.property6
          , rep7 = shape7.value.wrapRep(base.rep7)
          , property7 = base.property7
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper7[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
        ],
        oldRep: RepCol
      ): RepCol = {
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
      override def buildData(
        data: CaseClassDataMapper7[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
        ],
        rep: CaseClassRepMapper7[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
        ],
        oldData: DataCol
      ): DataCol = {
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
  implicit def caseClassHelper7DecoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    Rep6,
    Data6,
    Target6,
    Rep7,
    Data7,
    Target7,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
    , shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]
    , shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]
  ): DecoderShape.Aux[CaseClassRepMapper7[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
  ], CaseClassDataMapper7[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ], CaseClassRepMapper7[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper7[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper7[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
      ]
      override type Data = CaseClassDataMapper7[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
      ]
      override def wrapRep(
        base: CaseClassRepMapper7[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
        ]
      ): CaseClassRepMapper7[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
      ] = {
        new CaseClassRepMapper7(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
          , rep6 = shape6.value.wrapRep(base.rep6)
          , property6 = base.property6
          , rep7 = shape7.value.wrapRep(base.rep7)
          , property7 = base.property7
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper7[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
        ],
        oldRep: RepCol
      ): RepCol = {
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
      override def takeData(
        rep: CaseClassRepMapper7[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
        ],
        oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper7[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
      ], DataCol] = {
        val dataCol0                   = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        SplitData(
          current = new CaseClassDataMapper7(
              data1 = item1
            , data2 = item2
            , data3 = item3
            , data4 = item4
            , data5 = item5
            , data6 = item6
            , data7 = item7
          ),
          left = dataCol7
        )
      }
    }
  }
}
class CaseClassRepMapper8[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
  , Rep7
  , Data7
  , Rep8
  , Data8
](
    val rep1: Rep1
  , val property1: PropertyType[Data1]
  , val rep2: Rep2
  , val property2: PropertyType[Data2]
  , val rep3: Rep3
  , val property3: PropertyType[Data3]
  , val rep4: Rep4
  , val property4: PropertyType[Data4]
  , val rep5: Rep5
  , val property5: PropertyType[Data5]
  , val rep6: Rep6
  , val property6: PropertyType[Data6]
  , val rep7: Rep7
  , val property7: PropertyType[Data7]
  , val rep8: Rep8
  , val property8: PropertyType[Data8]
) {
  self =>
  lazy val propertyType: PropertyType[CaseClassDataMapper8[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ]] = new PropertyType[CaseClassDataMapper8[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ]] {}
  lazy val dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper8[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
  ], CaseClassDataMapper8[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ]] = DataGenWrap.value[CaseClassRepMapper8[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
  ], CaseClassDataMapper8[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ]](self)
}
class CaseClassDataMapper8[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
  , val data7: Data7
  , val data8: Data8
)
object CaseClassRepMapper8 {
  implicit def caseClassHelper8EncoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    Rep6,
    Data6,
    Target6,
    Rep7,
    Data7,
    Target7,
    Rep8,
    Data8,
    Target8,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
    , shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]
    , shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]
    , shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]]
  ): EncoderShape.Aux[CaseClassRepMapper8[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
  ], CaseClassDataMapper8[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ], CaseClassRepMapper8[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper8[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper8[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
      ]
      override type Data = CaseClassDataMapper8[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
      ]
      override def wrapRep(
        base: CaseClassRepMapper8[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
        ]
      ): CaseClassRepMapper8[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
      ] = {
        new CaseClassRepMapper8(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
          , rep6 = shape6.value.wrapRep(base.rep6)
          , property6 = base.property6
          , rep7 = shape7.value.wrapRep(base.rep7)
          , property7 = base.property7
          , rep8 = shape8.value.wrapRep(base.rep8)
          , property8 = base.property8
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper8[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
        ],
        oldRep: RepCol
      ): RepCol = {
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
      override def buildData(
        data: CaseClassDataMapper8[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
        ],
        rep: CaseClassRepMapper8[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
        ],
        oldData: DataCol
      ): DataCol = {
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
  implicit def caseClassHelper8DecoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    Rep6,
    Data6,
    Target6,
    Rep7,
    Data7,
    Target7,
    Rep8,
    Data8,
    Target8,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
    , shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]
    , shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]
    , shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]]
  ): DecoderShape.Aux[CaseClassRepMapper8[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
  ], CaseClassDataMapper8[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ], CaseClassRepMapper8[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper8[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper8[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
      ]
      override type Data = CaseClassDataMapper8[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
      ]
      override def wrapRep(
        base: CaseClassRepMapper8[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
        ]
      ): CaseClassRepMapper8[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
      ] = {
        new CaseClassRepMapper8(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
          , rep6 = shape6.value.wrapRep(base.rep6)
          , property6 = base.property6
          , rep7 = shape7.value.wrapRep(base.rep7)
          , property7 = base.property7
          , rep8 = shape8.value.wrapRep(base.rep8)
          , property8 = base.property8
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper8[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
        ],
        oldRep: RepCol
      ): RepCol = {
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
      override def takeData(
        rep: CaseClassRepMapper8[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
        ],
        oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper8[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
      ], DataCol] = {
        val dataCol0                   = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2) = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3) = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4) = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5) = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6) = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7) = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8) = shape8.value.takeData(rep.rep8, dataCol7)
        SplitData(
          current = new CaseClassDataMapper8(
              data1 = item1
            , data2 = item2
            , data3 = item3
            , data4 = item4
            , data5 = item5
            , data6 = item6
            , data7 = item7
            , data8 = item8
          ),
          left = dataCol8
        )
      }
    }
  }
}
class CaseClassRepMapper9[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
  , Rep7
  , Data7
  , Rep8
  , Data8
  , Rep9
  , Data9
](
    val rep1: Rep1
  , val property1: PropertyType[Data1]
  , val rep2: Rep2
  , val property2: PropertyType[Data2]
  , val rep3: Rep3
  , val property3: PropertyType[Data3]
  , val rep4: Rep4
  , val property4: PropertyType[Data4]
  , val rep5: Rep5
  , val property5: PropertyType[Data5]
  , val rep6: Rep6
  , val property6: PropertyType[Data6]
  , val rep7: Rep7
  , val property7: PropertyType[Data7]
  , val rep8: Rep8
  , val property8: PropertyType[Data8]
  , val rep9: Rep9
  , val property9: PropertyType[Data9]
) {
  self =>
  lazy val propertyType: PropertyType[CaseClassDataMapper9[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ]] = new PropertyType[CaseClassDataMapper9[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ]] {}
  lazy val dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper9[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
  ], CaseClassDataMapper9[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ]] = DataGenWrap.value[CaseClassRepMapper9[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
  ], CaseClassDataMapper9[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ]](self)
}
class CaseClassDataMapper9[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
  , Data9
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
  , val data7: Data7
  , val data8: Data8
  , val data9: Data9
)
object CaseClassRepMapper9 {
  implicit def caseClassHelper9EncoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    Rep6,
    Data6,
    Target6,
    Rep7,
    Data7,
    Target7,
    Rep8,
    Data8,
    Target8,
    Rep9,
    Data9,
    Target9,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
    , shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]
    , shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]
    , shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]]
    , shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]]
  ): EncoderShape.Aux[CaseClassRepMapper9[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
  ], CaseClassDataMapper9[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ], CaseClassRepMapper9[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper9[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper9[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
      ]
      override type Data = CaseClassDataMapper9[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
      ]
      override def wrapRep(
        base: CaseClassRepMapper9[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
        ]
      ): CaseClassRepMapper9[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
      ] = {
        new CaseClassRepMapper9(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
          , rep6 = shape6.value.wrapRep(base.rep6)
          , property6 = base.property6
          , rep7 = shape7.value.wrapRep(base.rep7)
          , property7 = base.property7
          , rep8 = shape8.value.wrapRep(base.rep8)
          , property8 = base.property8
          , rep9 = shape9.value.wrapRep(base.rep9)
          , property9 = base.property9
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper9[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep10 = oldRep
        val rep9  = shape9.value.toLawRep(base.rep9, rep10)
        val rep8  = shape8.value.toLawRep(base.rep8, rep9)
        val rep7  = shape7.value.toLawRep(base.rep7, rep8)
        val rep6  = shape6.value.toLawRep(base.rep6, rep7)
        val rep5  = shape5.value.toLawRep(base.rep5, rep6)
        val rep4  = shape4.value.toLawRep(base.rep4, rep5)
        val rep3  = shape3.value.toLawRep(base.rep3, rep4)
        val rep2  = shape2.value.toLawRep(base.rep2, rep3)
        val rep1  = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(
        data: CaseClassDataMapper9[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
          , Data9
        ],
        rep: CaseClassRepMapper9[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
        ],
        oldData: DataCol
      ): DataCol = {
        val data10 = oldData
        val data9  = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8  = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7  = shape7.value.buildData(data.data7, rep.rep7, data8)
        val data6  = shape6.value.buildData(data.data6, rep.rep6, data7)
        val data5  = shape5.value.buildData(data.data5, rep.rep5, data6)
        val data4  = shape4.value.buildData(data.data4, rep.rep4, data5)
        val data3  = shape3.value.buildData(data.data3, rep.rep3, data4)
        val data2  = shape2.value.buildData(data.data2, rep.rep2, data3)
        val data1  = shape1.value.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper9DecoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    Rep6,
    Data6,
    Target6,
    Rep7,
    Data7,
    Target7,
    Rep8,
    Data8,
    Target8,
    Rep9,
    Data9,
    Target9,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
    , shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]
    , shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]
    , shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]]
    , shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]]
  ): DecoderShape.Aux[CaseClassRepMapper9[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
  ], CaseClassDataMapper9[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ], CaseClassRepMapper9[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper9[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper9[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
      ]
      override type Data = CaseClassDataMapper9[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
      ]
      override def wrapRep(
        base: CaseClassRepMapper9[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
        ]
      ): CaseClassRepMapper9[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
      ] = {
        new CaseClassRepMapper9(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
          , rep6 = shape6.value.wrapRep(base.rep6)
          , property6 = base.property6
          , rep7 = shape7.value.wrapRep(base.rep7)
          , property7 = base.property7
          , rep8 = shape8.value.wrapRep(base.rep8)
          , property8 = base.property8
          , rep9 = shape9.value.wrapRep(base.rep9)
          , property9 = base.property9
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper9[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep10 = oldRep
        val rep9  = shape9.value.toLawRep(base.rep9, rep10)
        val rep8  = shape8.value.toLawRep(base.rep8, rep9)
        val rep7  = shape7.value.toLawRep(base.rep7, rep8)
        val rep6  = shape6.value.toLawRep(base.rep6, rep7)
        val rep5  = shape5.value.toLawRep(base.rep5, rep6)
        val rep4  = shape4.value.toLawRep(base.rep4, rep5)
        val rep3  = shape3.value.toLawRep(base.rep3, rep4)
        val rep2  = shape2.value.toLawRep(base.rep2, rep3)
        val rep1  = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(
        rep: CaseClassRepMapper9[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
        ],
        oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper9[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
      ], DataCol] = {
        val dataCol0                   = oldDataCol
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
            current = new CaseClassDataMapper9(
              data1 = item1
            , data2 = item2
            , data3 = item3
            , data4 = item4
            , data5 = item5
            , data6 = item6
            , data7 = item7
            , data8 = item8
            , data9 = item9
          )
          , left = dataCol9
        )
      }
    }
  }
}
class CaseClassRepMapper10[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
  , Rep7
  , Data7
  , Rep8
  , Data8
  , Rep9
  , Data9
  , Rep10
  , Data10
](
    val rep1: Rep1
  , val property1: PropertyType[Data1]
  , val rep2: Rep2
  , val property2: PropertyType[Data2]
  , val rep3: Rep3
  , val property3: PropertyType[Data3]
  , val rep4: Rep4
  , val property4: PropertyType[Data4]
  , val rep5: Rep5
  , val property5: PropertyType[Data5]
  , val rep6: Rep6
  , val property6: PropertyType[Data6]
  , val rep7: Rep7
  , val property7: PropertyType[Data7]
  , val rep8: Rep8
  , val property8: PropertyType[Data8]
  , val rep9: Rep9
  , val property9: PropertyType[Data9]
  , val rep10: Rep10
  , val property10: PropertyType[Data10]
) {
  self =>
  lazy val propertyType: PropertyType[CaseClassDataMapper10[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ]] = new PropertyType[CaseClassDataMapper10[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ]] {}
  lazy val dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper10[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
  ], CaseClassDataMapper10[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ]] = DataGenWrap.value[CaseClassRepMapper10[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
  ], CaseClassDataMapper10[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ]](self)
}
class CaseClassDataMapper10[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
  , Data9
  , Data10
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
  , val data7: Data7
  , val data8: Data8
  , val data9: Data9
  , val data10: Data10
)
object CaseClassRepMapper10 {
  implicit def caseClassHelper10EncoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    Rep6,
    Data6,
    Target6,
    Rep7,
    Data7,
    Target7,
    Rep8,
    Data8,
    Target8,
    Rep9,
    Data9,
    Target9,
    Rep10,
    Data10,
    Target10,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
    , shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]
    , shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]
    , shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]]
    , shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]]
    , shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]]
  ): EncoderShape.Aux[CaseClassRepMapper10[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
  ], CaseClassDataMapper10[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ], CaseClassRepMapper10[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper10[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper10[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
      ]
      override type Data = CaseClassDataMapper10[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
      ]
      override def wrapRep(
        base: CaseClassRepMapper10[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
        ]
      ): CaseClassRepMapper10[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
      ] = {
        new CaseClassRepMapper10(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
          , rep6 = shape6.value.wrapRep(base.rep6)
          , property6 = base.property6
          , rep7 = shape7.value.wrapRep(base.rep7)
          , property7 = base.property7
          , rep8 = shape8.value.wrapRep(base.rep8)
          , property8 = base.property8
          , rep9 = shape9.value.wrapRep(base.rep9)
          , property9 = base.property9
          , rep10 = shape10.value.wrapRep(base.rep10)
          , property10 = base.property10
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper10[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep11 = oldRep
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9  = shape9.value.toLawRep(base.rep9, rep10)
        val rep8  = shape8.value.toLawRep(base.rep8, rep9)
        val rep7  = shape7.value.toLawRep(base.rep7, rep8)
        val rep6  = shape6.value.toLawRep(base.rep6, rep7)
        val rep5  = shape5.value.toLawRep(base.rep5, rep6)
        val rep4  = shape4.value.toLawRep(base.rep4, rep5)
        val rep3  = shape3.value.toLawRep(base.rep3, rep4)
        val rep2  = shape2.value.toLawRep(base.rep2, rep3)
        val rep1  = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(
        data: CaseClassDataMapper10[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
          , Data9
          , Data10
        ],
        rep: CaseClassRepMapper10[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
        ],
        oldData: DataCol
      ): DataCol = {
        val data11 = oldData
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9  = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8  = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7  = shape7.value.buildData(data.data7, rep.rep7, data8)
        val data6  = shape6.value.buildData(data.data6, rep.rep6, data7)
        val data5  = shape5.value.buildData(data.data5, rep.rep5, data6)
        val data4  = shape4.value.buildData(data.data4, rep.rep4, data5)
        val data3  = shape3.value.buildData(data.data3, rep.rep3, data4)
        val data2  = shape2.value.buildData(data.data2, rep.rep2, data3)
        val data1  = shape1.value.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper10DecoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    Rep6,
    Data6,
    Target6,
    Rep7,
    Data7,
    Target7,
    Rep8,
    Data8,
    Target8,
    Rep9,
    Data9,
    Target9,
    Rep10,
    Data10,
    Target10,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
    , shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]
    , shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]
    , shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]]
    , shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]]
    , shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]]
  ): DecoderShape.Aux[CaseClassRepMapper10[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
  ], CaseClassDataMapper10[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ], CaseClassRepMapper10[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper10[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper10[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
      ]
      override type Data = CaseClassDataMapper10[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
      ]
      override def wrapRep(
        base: CaseClassRepMapper10[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
        ]
      ): CaseClassRepMapper10[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
      ] = {
        new CaseClassRepMapper10(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
          , rep6 = shape6.value.wrapRep(base.rep6)
          , property6 = base.property6
          , rep7 = shape7.value.wrapRep(base.rep7)
          , property7 = base.property7
          , rep8 = shape8.value.wrapRep(base.rep8)
          , property8 = base.property8
          , rep9 = shape9.value.wrapRep(base.rep9)
          , property9 = base.property9
          , rep10 = shape10.value.wrapRep(base.rep10)
          , property10 = base.property10
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper10[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep11 = oldRep
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9  = shape9.value.toLawRep(base.rep9, rep10)
        val rep8  = shape8.value.toLawRep(base.rep8, rep9)
        val rep7  = shape7.value.toLawRep(base.rep7, rep8)
        val rep6  = shape6.value.toLawRep(base.rep6, rep7)
        val rep5  = shape5.value.toLawRep(base.rep5, rep6)
        val rep4  = shape4.value.toLawRep(base.rep4, rep5)
        val rep3  = shape3.value.toLawRep(base.rep3, rep4)
        val rep2  = shape2.value.toLawRep(base.rep2, rep3)
        val rep1  = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(
        rep: CaseClassRepMapper10[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
        ],
        oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper10[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
      ], DataCol] = {
        val dataCol0                     = oldDataCol
        val SplitData(item1, dataCol1)   = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2)   = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3)   = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4)   = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5)   = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6)   = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7)   = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8)   = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9)   = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        SplitData(
            current = new CaseClassDataMapper10(
              data1 = item1
            , data2 = item2
            , data3 = item3
            , data4 = item4
            , data5 = item5
            , data6 = item6
            , data7 = item7
            , data8 = item8
            , data9 = item9
            , data10 = item10
          )
          , left = dataCol10
        )
      }
    }
  }
}
class CaseClassRepMapper11[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
  , Rep7
  , Data7
  , Rep8
  , Data8
  , Rep9
  , Data9
  , Rep10
  , Data10
  , Rep11
  , Data11
](
    val rep1: Rep1
  , val property1: PropertyType[Data1]
  , val rep2: Rep2
  , val property2: PropertyType[Data2]
  , val rep3: Rep3
  , val property3: PropertyType[Data3]
  , val rep4: Rep4
  , val property4: PropertyType[Data4]
  , val rep5: Rep5
  , val property5: PropertyType[Data5]
  , val rep6: Rep6
  , val property6: PropertyType[Data6]
  , val rep7: Rep7
  , val property7: PropertyType[Data7]
  , val rep8: Rep8
  , val property8: PropertyType[Data8]
  , val rep9: Rep9
  , val property9: PropertyType[Data9]
  , val rep10: Rep10
  , val property10: PropertyType[Data10]
  , val rep11: Rep11
  , val property11: PropertyType[Data11]
) {
  self =>
  lazy val propertyType: PropertyType[CaseClassDataMapper11[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ]] = new PropertyType[CaseClassDataMapper11[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ]] {}
  lazy val dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper11[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
  ], CaseClassDataMapper11[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ]] = DataGenWrap.value[CaseClassRepMapper11[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
  ], CaseClassDataMapper11[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ]](self)
}
class CaseClassDataMapper11[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
  , Data9
  , Data10
  , Data11
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
  , val data7: Data7
  , val data8: Data8
  , val data9: Data9
  , val data10: Data10
  , val data11: Data11
)
object CaseClassRepMapper11 {
  implicit def caseClassHelper11EncoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    Rep6,
    Data6,
    Target6,
    Rep7,
    Data7,
    Target7,
    Rep8,
    Data8,
    Target8,
    Rep9,
    Data9,
    Target9,
    Rep10,
    Data10,
    Target10,
    Rep11,
    Data11,
    Target11,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
    , shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]
    , shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]
    , shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]]
    , shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]]
    , shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]]
    , shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]]
  ): EncoderShape.Aux[CaseClassRepMapper11[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
  ], CaseClassDataMapper11[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ], CaseClassRepMapper11[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper11[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper11[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
      ]
      override type Data = CaseClassDataMapper11[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
      ]
      override def wrapRep(
        base: CaseClassRepMapper11[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
          , Rep11
          , Data11
        ]
      ): CaseClassRepMapper11[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
      ] = {
        new CaseClassRepMapper11(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
          , rep6 = shape6.value.wrapRep(base.rep6)
          , property6 = base.property6
          , rep7 = shape7.value.wrapRep(base.rep7)
          , property7 = base.property7
          , rep8 = shape8.value.wrapRep(base.rep8)
          , property8 = base.property8
          , rep9 = shape9.value.wrapRep(base.rep9)
          , property9 = base.property9
          , rep10 = shape10.value.wrapRep(base.rep10)
          , property10 = base.property10
          , rep11 = shape11.value.wrapRep(base.rep11)
          , property11 = base.property11
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper11[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep12 = oldRep
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9  = shape9.value.toLawRep(base.rep9, rep10)
        val rep8  = shape8.value.toLawRep(base.rep8, rep9)
        val rep7  = shape7.value.toLawRep(base.rep7, rep8)
        val rep6  = shape6.value.toLawRep(base.rep6, rep7)
        val rep5  = shape5.value.toLawRep(base.rep5, rep6)
        val rep4  = shape4.value.toLawRep(base.rep4, rep5)
        val rep3  = shape3.value.toLawRep(base.rep3, rep4)
        val rep2  = shape2.value.toLawRep(base.rep2, rep3)
        val rep1  = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(
        data: CaseClassDataMapper11[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
          , Data9
          , Data10
          , Data11
        ],
        rep: CaseClassRepMapper11[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
        ],
        oldData: DataCol
      ): DataCol = {
        val data12 = oldData
        val data11 = shape11.value.buildData(data.data11, rep.rep11, data12)
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9  = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8  = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7  = shape7.value.buildData(data.data7, rep.rep7, data8)
        val data6  = shape6.value.buildData(data.data6, rep.rep6, data7)
        val data5  = shape5.value.buildData(data.data5, rep.rep5, data6)
        val data4  = shape4.value.buildData(data.data4, rep.rep4, data5)
        val data3  = shape3.value.buildData(data.data3, rep.rep3, data4)
        val data2  = shape2.value.buildData(data.data2, rep.rep2, data3)
        val data1  = shape1.value.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper11DecoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    Rep6,
    Data6,
    Target6,
    Rep7,
    Data7,
    Target7,
    Rep8,
    Data8,
    Target8,
    Rep9,
    Data9,
    Target9,
    Rep10,
    Data10,
    Target10,
    Rep11,
    Data11,
    Target11,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
    , shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]
    , shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]
    , shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]]
    , shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]]
    , shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]]
    , shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]]
  ): DecoderShape.Aux[CaseClassRepMapper11[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
  ], CaseClassDataMapper11[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ], CaseClassRepMapper11[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper11[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper11[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
      ]
      override type Data = CaseClassDataMapper11[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
      ]
      override def wrapRep(
        base: CaseClassRepMapper11[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
          , Rep11
          , Data11
        ]
      ): CaseClassRepMapper11[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
      ] = {
        new CaseClassRepMapper11(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
          , rep6 = shape6.value.wrapRep(base.rep6)
          , property6 = base.property6
          , rep7 = shape7.value.wrapRep(base.rep7)
          , property7 = base.property7
          , rep8 = shape8.value.wrapRep(base.rep8)
          , property8 = base.property8
          , rep9 = shape9.value.wrapRep(base.rep9)
          , property9 = base.property9
          , rep10 = shape10.value.wrapRep(base.rep10)
          , property10 = base.property10
          , rep11 = shape11.value.wrapRep(base.rep11)
          , property11 = base.property11
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper11[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep12 = oldRep
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9  = shape9.value.toLawRep(base.rep9, rep10)
        val rep8  = shape8.value.toLawRep(base.rep8, rep9)
        val rep7  = shape7.value.toLawRep(base.rep7, rep8)
        val rep6  = shape6.value.toLawRep(base.rep6, rep7)
        val rep5  = shape5.value.toLawRep(base.rep5, rep6)
        val rep4  = shape4.value.toLawRep(base.rep4, rep5)
        val rep3  = shape3.value.toLawRep(base.rep3, rep4)
        val rep2  = shape2.value.toLawRep(base.rep2, rep3)
        val rep1  = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(
        rep: CaseClassRepMapper11[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
        ],
        oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper11[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
      ], DataCol] = {
        val dataCol0                     = oldDataCol
        val SplitData(item1, dataCol1)   = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2)   = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3)   = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4)   = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5)   = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6)   = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7)   = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8)   = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9)   = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        val SplitData(item11, dataCol11) = shape11.value.takeData(rep.rep11, dataCol10)
        SplitData(
            current = new CaseClassDataMapper11(
              data1 = item1
            , data2 = item2
            , data3 = item3
            , data4 = item4
            , data5 = item5
            , data6 = item6
            , data7 = item7
            , data8 = item8
            , data9 = item9
            , data10 = item10
            , data11 = item11
          )
          , left = dataCol11
        )
      }
    }
  }
}
class CaseClassRepMapper12[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
  , Rep7
  , Data7
  , Rep8
  , Data8
  , Rep9
  , Data9
  , Rep10
  , Data10
  , Rep11
  , Data11
  , Rep12
  , Data12
](
    val rep1: Rep1
  , val property1: PropertyType[Data1]
  , val rep2: Rep2
  , val property2: PropertyType[Data2]
  , val rep3: Rep3
  , val property3: PropertyType[Data3]
  , val rep4: Rep4
  , val property4: PropertyType[Data4]
  , val rep5: Rep5
  , val property5: PropertyType[Data5]
  , val rep6: Rep6
  , val property6: PropertyType[Data6]
  , val rep7: Rep7
  , val property7: PropertyType[Data7]
  , val rep8: Rep8
  , val property8: PropertyType[Data8]
  , val rep9: Rep9
  , val property9: PropertyType[Data9]
  , val rep10: Rep10
  , val property10: PropertyType[Data10]
  , val rep11: Rep11
  , val property11: PropertyType[Data11]
  , val rep12: Rep12
  , val property12: PropertyType[Data12]
) {
  self =>
  lazy val propertyType: PropertyType[CaseClassDataMapper12[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ]] = new PropertyType[CaseClassDataMapper12[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ]] {}
  lazy val dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper12[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
  ], CaseClassDataMapper12[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ]] = DataGenWrap.value[CaseClassRepMapper12[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
  ], CaseClassDataMapper12[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ]](self)
}
class CaseClassDataMapper12[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
  , Data9
  , Data10
  , Data11
  , Data12
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
  , val data7: Data7
  , val data8: Data8
  , val data9: Data9
  , val data10: Data10
  , val data11: Data11
  , val data12: Data12
)
object CaseClassRepMapper12 {
  implicit def caseClassHelper12EncoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    Rep6,
    Data6,
    Target6,
    Rep7,
    Data7,
    Target7,
    Rep8,
    Data8,
    Target8,
    Rep9,
    Data9,
    Target9,
    Rep10,
    Data10,
    Target10,
    Rep11,
    Data11,
    Target11,
    Rep12,
    Data12,
    Target12,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
    , shape6: Lazy[EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]
    , shape7: Lazy[EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]
    , shape8: Lazy[EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]]
    , shape9: Lazy[EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]]
    , shape10: Lazy[EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]]
    , shape11: Lazy[EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]]
    , shape12: Lazy[EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]]
  ): EncoderShape.Aux[CaseClassRepMapper12[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
  ], CaseClassDataMapper12[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ], CaseClassRepMapper12[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
    , Target12
    , Data12
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper12[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
      , Rep12
      , Data12
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper12[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
      ]
      override type Data = CaseClassDataMapper12[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
        , Data12
      ]
      override def wrapRep(
        base: CaseClassRepMapper12[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
          , Rep11
          , Data11
          , Rep12
          , Data12
        ]
      ): CaseClassRepMapper12[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
      ] = {
        new CaseClassRepMapper12(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
          , rep6 = shape6.value.wrapRep(base.rep6)
          , property6 = base.property6
          , rep7 = shape7.value.wrapRep(base.rep7)
          , property7 = base.property7
          , rep8 = shape8.value.wrapRep(base.rep8)
          , property8 = base.property8
          , rep9 = shape9.value.wrapRep(base.rep9)
          , property9 = base.property9
          , rep10 = shape10.value.wrapRep(base.rep10)
          , property10 = base.property10
          , rep11 = shape11.value.wrapRep(base.rep11)
          , property11 = base.property11
          , rep12 = shape12.value.wrapRep(base.rep12)
          , property12 = base.property12
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper12[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep13 = oldRep
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9  = shape9.value.toLawRep(base.rep9, rep10)
        val rep8  = shape8.value.toLawRep(base.rep8, rep9)
        val rep7  = shape7.value.toLawRep(base.rep7, rep8)
        val rep6  = shape6.value.toLawRep(base.rep6, rep7)
        val rep5  = shape5.value.toLawRep(base.rep5, rep6)
        val rep4  = shape4.value.toLawRep(base.rep4, rep5)
        val rep3  = shape3.value.toLawRep(base.rep3, rep4)
        val rep2  = shape2.value.toLawRep(base.rep2, rep3)
        val rep1  = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(
        data: CaseClassDataMapper12[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
          , Data9
          , Data10
          , Data11
          , Data12
        ],
        rep: CaseClassRepMapper12[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
        ],
        oldData: DataCol
      ): DataCol = {
        val data13 = oldData
        val data12 = shape12.value.buildData(data.data12, rep.rep12, data13)
        val data11 = shape11.value.buildData(data.data11, rep.rep11, data12)
        val data10 = shape10.value.buildData(data.data10, rep.rep10, data11)
        val data9  = shape9.value.buildData(data.data9, rep.rep9, data10)
        val data8  = shape8.value.buildData(data.data8, rep.rep8, data9)
        val data7  = shape7.value.buildData(data.data7, rep.rep7, data8)
        val data6  = shape6.value.buildData(data.data6, rep.rep6, data7)
        val data5  = shape5.value.buildData(data.data5, rep.rep5, data6)
        val data4  = shape4.value.buildData(data.data4, rep.rep4, data5)
        val data3  = shape3.value.buildData(data.data3, rep.rep3, data4)
        val data2  = shape2.value.buildData(data.data2, rep.rep2, data3)
        val data1  = shape1.value.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper12DecoderGen[
    Rep1,
    Data1,
    Target1,
    Rep2,
    Data2,
    Target2,
    Rep3,
    Data3,
    Target3,
    Rep4,
    Data4,
    Target4,
    Rep5,
    Data5,
    Target5,
    Rep6,
    Data6,
    Target6,
    Rep7,
    Data7,
    Target7,
    Rep8,
    Data8,
    Target8,
    Rep9,
    Data9,
    Target9,
    Rep10,
    Data10,
    Target10,
    Rep11,
    Data11,
    Target11,
    Rep12,
    Data12,
    Target12,
    RepCol,
    DataCol
  ](
      implicit
    shape1: Lazy[DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]]
    , shape2: Lazy[DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]]
    , shape3: Lazy[DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]]
    , shape4: Lazy[DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]]
    , shape5: Lazy[DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]]
    , shape6: Lazy[DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]]
    , shape7: Lazy[DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]]
    , shape8: Lazy[DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]]
    , shape9: Lazy[DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]]
    , shape10: Lazy[DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]]
    , shape11: Lazy[DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]]
    , shape12: Lazy[DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]]
  ): DecoderShape.Aux[CaseClassRepMapper12[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
  ], CaseClassDataMapper12[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ], CaseClassRepMapper12[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
    , Target12
    , Data12
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper12[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
      , Rep12
      , Data12
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper12[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
      ]
      override type Data = CaseClassDataMapper12[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
        , Data12
      ]
      override def wrapRep(
        base: CaseClassRepMapper12[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
          , Rep11
          , Data11
          , Rep12
          , Data12
        ]
      ): CaseClassRepMapper12[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
      ] = {
        new CaseClassRepMapper12(
            rep1 = shape1.value.wrapRep(base.rep1)
          , property1 = base.property1
          , rep2 = shape2.value.wrapRep(base.rep2)
          , property2 = base.property2
          , rep3 = shape3.value.wrapRep(base.rep3)
          , property3 = base.property3
          , rep4 = shape4.value.wrapRep(base.rep4)
          , property4 = base.property4
          , rep5 = shape5.value.wrapRep(base.rep5)
          , property5 = base.property5
          , rep6 = shape6.value.wrapRep(base.rep6)
          , property6 = base.property6
          , rep7 = shape7.value.wrapRep(base.rep7)
          , property7 = base.property7
          , rep8 = shape8.value.wrapRep(base.rep8)
          , property8 = base.property8
          , rep9 = shape9.value.wrapRep(base.rep9)
          , property9 = base.property9
          , rep10 = shape10.value.wrapRep(base.rep10)
          , property10 = base.property10
          , rep11 = shape11.value.wrapRep(base.rep11)
          , property11 = base.property11
          , rep12 = shape12.value.wrapRep(base.rep12)
          , property12 = base.property12
        )
      }
      override def toLawRep(
        base: CaseClassRepMapper12[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep13 = oldRep
        val rep12 = shape12.value.toLawRep(base.rep12, rep13)
        val rep11 = shape11.value.toLawRep(base.rep11, rep12)
        val rep10 = shape10.value.toLawRep(base.rep10, rep11)
        val rep9  = shape9.value.toLawRep(base.rep9, rep10)
        val rep8  = shape8.value.toLawRep(base.rep8, rep9)
        val rep7  = shape7.value.toLawRep(base.rep7, rep8)
        val rep6  = shape6.value.toLawRep(base.rep6, rep7)
        val rep5  = shape5.value.toLawRep(base.rep5, rep6)
        val rep4  = shape4.value.toLawRep(base.rep4, rep5)
        val rep3  = shape3.value.toLawRep(base.rep3, rep4)
        val rep2  = shape2.value.toLawRep(base.rep2, rep3)
        val rep1  = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(
        rep: CaseClassRepMapper12[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
        ],
        oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper12[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
        , Data12
      ], DataCol] = {
        val dataCol0                     = oldDataCol
        val SplitData(item1, dataCol1)   = shape1.value.takeData(rep.rep1, dataCol0)
        val SplitData(item2, dataCol2)   = shape2.value.takeData(rep.rep2, dataCol1)
        val SplitData(item3, dataCol3)   = shape3.value.takeData(rep.rep3, dataCol2)
        val SplitData(item4, dataCol4)   = shape4.value.takeData(rep.rep4, dataCol3)
        val SplitData(item5, dataCol5)   = shape5.value.takeData(rep.rep5, dataCol4)
        val SplitData(item6, dataCol6)   = shape6.value.takeData(rep.rep6, dataCol5)
        val SplitData(item7, dataCol7)   = shape7.value.takeData(rep.rep7, dataCol6)
        val SplitData(item8, dataCol8)   = shape8.value.takeData(rep.rep8, dataCol7)
        val SplitData(item9, dataCol9)   = shape9.value.takeData(rep.rep9, dataCol8)
        val SplitData(item10, dataCol10) = shape10.value.takeData(rep.rep10, dataCol9)
        val SplitData(item11, dataCol11) = shape11.value.takeData(rep.rep11, dataCol10)
        val SplitData(item12, dataCol12) = shape12.value.takeData(rep.rep12, dataCol11)
        SplitData(
            current = new CaseClassDataMapper12(
              data1 = item1
            , data2 = item2
            , data3 = item3
            , data4 = item4
            , data5 = item5
            , data6 = item6
            , data7 = item7
            , data8 = item8
            , data9 = item9
            , data10 = item10
            , data11 = item11
            , data12 = item12
          )
          , left = dataCol12
        )
      }
    }
  }
}
