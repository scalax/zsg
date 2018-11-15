package net.scalax.asuna.mapper.common
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.core.encoder.EncoderShapeValue
import net.scalax.asuna.mapper.encoder.EncoderWrapperHelper
import net.scalax.asuna.mapper.encoder.EncoderContent
import net.scalax.asuna.mapper.encoder.EncoderDebugShape
import net.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import net.scalax.asuna.core.decoder.DecoderShapeValue
import net.scalax.asuna.mapper.decoder.DecoderWrapperHelper
import net.scalax.asuna.mapper.decoder.DecoderContent
import net.scalax.asuna.mapper.decoder.DecoderDebugShape
import net.scalax.asuna.core.formatter.FormatterShape
import net.scalax.asuna.core.formatter.FormatterShapeValue
import net.scalax.asuna.mapper.formatter.FormatterWrapperHelper
import net.scalax.asuna.mapper.formatter.FormatterContent
import net.scalax.asuna.mapper.formatter.FormatterDebugShape
import scala.language.higherKinds
trait BaseClassRep {
  type DataType
}
trait CaseClassMapper
object CaseClassMapper {
  def inputColumnRep[
      Rep1
    , Column1 <: MacroColumnInfo
  ](
      rep1: Rep1
    , column1: Column1
  ): RepDataSetter11[
      Rep1
    , Column1
  ] = {
    new RepDataSetter11[
        Rep1
      , Column1
    ] {
      override def withDataType[
          Data1
      ](
          defaultValue1: => Option[Data1]
      ): RepDataSetter21[
          Rep1
        , Column1
        , Data1
      ] = {
        new RepDataSetter21[
            Rep1
          , Column1
          , Data1
        ] {
          override def output[
              Target1
          ](
            implicit
            wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Column1, Target1]
          ) = {
            new CaseClassRepMapper1[
                Target1
              , Data1
            ](
                rep1 = wrap1.inputColumn(rep = rep1, columnInfo = column1, defaultValue = defaultValue1)
            )
          }
        }
      }
    }
  }
  def mergeRep[
      Rep1 <: BaseClassRep
  ](
      rep1: Rep1
  ): CaseClassRepMapper1[
      Rep1
    , Rep1#DataType
  ] = {
    new CaseClassRepMapper1[
        Rep1
      , Rep1#DataType
    ](
        rep1 = rep1
    )
  }
  def inputColumnRep[
      Rep1
    , Column1 <: MacroColumnInfo
    , Rep2
    , Column2 <: MacroColumnInfo
  ](
      rep1: Rep1
    , column1: Column1
    , rep2: Rep2
    , column2: Column2
  ): RepDataSetter12[
      Rep1
    , Column1
    , Rep2
    , Column2
  ] = {
    new RepDataSetter12[
        Rep1
      , Column1
      , Rep2
      , Column2
    ] {
      override def withDataType[
          Data1
        , Data2
      ](
          defaultValue1: => Option[Data1]
        , defaultValue2: => Option[Data2]
      ): RepDataSetter22[
          Rep1
        , Column1
        , Data1
        , Rep2
        , Column2
        , Data2
      ] = {
        new RepDataSetter22[
            Rep1
          , Column1
          , Data1
          , Rep2
          , Column2
          , Data2
        ] {
          override def output[
              Target1
            , Target2
          ](
            implicit
            wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Column1, Target1],
            wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Column2, Target2]
          ) = {
            new CaseClassRepMapper2[
                Target1
              , Data1
              , Target2
              , Data2
            ](
                rep1 = wrap1.inputColumn(rep = rep1, columnInfo = column1, defaultValue = defaultValue1)
              , rep2 = wrap2.inputColumn(rep = rep2, columnInfo = column2, defaultValue = defaultValue2)
            )
          }
        }
      }
    }
  }
  def mergeRep[
      Rep1 <: BaseClassRep
    , Rep2 <: BaseClassRep
  ](
      rep1: Rep1
    , rep2: Rep2
  ): CaseClassRepMapper2[
      Rep1
    , Rep1#DataType
    , Rep2
    , Rep2#DataType
  ] = {
    new CaseClassRepMapper2[
        Rep1
      , Rep1#DataType
      , Rep2
      , Rep2#DataType
    ](
        rep1 = rep1
      , rep2 = rep2
    )
  }
  def inputColumnRep[
      Rep1
    , Column1 <: MacroColumnInfo
    , Rep2
    , Column2 <: MacroColumnInfo
    , Rep3
    , Column3 <: MacroColumnInfo
  ](
      rep1: Rep1
    , column1: Column1
    , rep2: Rep2
    , column2: Column2
    , rep3: Rep3
    , column3: Column3
  ): RepDataSetter13[
      Rep1
    , Column1
    , Rep2
    , Column2
    , Rep3
    , Column3
  ] = {
    new RepDataSetter13[
        Rep1
      , Column1
      , Rep2
      , Column2
      , Rep3
      , Column3
    ] {
      override def withDataType[
          Data1
        , Data2
        , Data3
      ](
          defaultValue1: => Option[Data1]
        , defaultValue2: => Option[Data2]
        , defaultValue3: => Option[Data3]
      ): RepDataSetter23[
          Rep1
        , Column1
        , Data1
        , Rep2
        , Column2
        , Data2
        , Rep3
        , Column3
        , Data3
      ] = {
        new RepDataSetter23[
            Rep1
          , Column1
          , Data1
          , Rep2
          , Column2
          , Data2
          , Rep3
          , Column3
          , Data3
        ] {
          override def output[
              Target1
            , Target2
            , Target3
          ](
            implicit
            wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Column1, Target1],
            wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Column2, Target2],
            wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Column3, Target3]
          ) = {
            new CaseClassRepMapper3[
                Target1
              , Data1
              , Target2
              , Data2
              , Target3
              , Data3
            ](
                rep1 = wrap1.inputColumn(rep = rep1, columnInfo = column1, defaultValue = defaultValue1)
              , rep2 = wrap2.inputColumn(rep = rep2, columnInfo = column2, defaultValue = defaultValue2)
              , rep3 = wrap3.inputColumn(rep = rep3, columnInfo = column3, defaultValue = defaultValue3)
            )
          }
        }
      }
    }
  }
  def mergeRep[
      Rep1 <: BaseClassRep
    , Rep2 <: BaseClassRep
    , Rep3 <: BaseClassRep
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
  ): CaseClassRepMapper3[
      Rep1
    , Rep1#DataType
    , Rep2
    , Rep2#DataType
    , Rep3
    , Rep3#DataType
  ] = {
    new CaseClassRepMapper3[
        Rep1
      , Rep1#DataType
      , Rep2
      , Rep2#DataType
      , Rep3
      , Rep3#DataType
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
    )
  }
  def inputColumnRep[
      Rep1
    , Column1 <: MacroColumnInfo
    , Rep2
    , Column2 <: MacroColumnInfo
    , Rep3
    , Column3 <: MacroColumnInfo
    , Rep4
    , Column4 <: MacroColumnInfo
  ](
      rep1: Rep1
    , column1: Column1
    , rep2: Rep2
    , column2: Column2
    , rep3: Rep3
    , column3: Column3
    , rep4: Rep4
    , column4: Column4
  ): RepDataSetter14[
      Rep1
    , Column1
    , Rep2
    , Column2
    , Rep3
    , Column3
    , Rep4
    , Column4
  ] = {
    new RepDataSetter14[
        Rep1
      , Column1
      , Rep2
      , Column2
      , Rep3
      , Column3
      , Rep4
      , Column4
    ] {
      override def withDataType[
          Data1
        , Data2
        , Data3
        , Data4
      ](
          defaultValue1: => Option[Data1]
        , defaultValue2: => Option[Data2]
        , defaultValue3: => Option[Data3]
        , defaultValue4: => Option[Data4]
      ): RepDataSetter24[
          Rep1
        , Column1
        , Data1
        , Rep2
        , Column2
        , Data2
        , Rep3
        , Column3
        , Data3
        , Rep4
        , Column4
        , Data4
      ] = {
        new RepDataSetter24[
            Rep1
          , Column1
          , Data1
          , Rep2
          , Column2
          , Data2
          , Rep3
          , Column3
          , Data3
          , Rep4
          , Column4
          , Data4
        ] {
          override def output[
              Target1
            , Target2
            , Target3
            , Target4
          ](
            implicit
            wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Column1, Target1],
            wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Column2, Target2],
            wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Column3, Target3],
            wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Column4, Target4]
          ) = {
            new CaseClassRepMapper4[
                Target1
              , Data1
              , Target2
              , Data2
              , Target3
              , Data3
              , Target4
              , Data4
            ](
                rep1 = wrap1.inputColumn(rep = rep1, columnInfo = column1, defaultValue = defaultValue1)
              , rep2 = wrap2.inputColumn(rep = rep2, columnInfo = column2, defaultValue = defaultValue2)
              , rep3 = wrap3.inputColumn(rep = rep3, columnInfo = column3, defaultValue = defaultValue3)
              , rep4 = wrap4.inputColumn(rep = rep4, columnInfo = column4, defaultValue = defaultValue4)
            )
          }
        }
      }
    }
  }
  def mergeRep[
      Rep1 <: BaseClassRep
    , Rep2 <: BaseClassRep
    , Rep3 <: BaseClassRep
    , Rep4 <: BaseClassRep
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
  ): CaseClassRepMapper4[
      Rep1
    , Rep1#DataType
    , Rep2
    , Rep2#DataType
    , Rep3
    , Rep3#DataType
    , Rep4
    , Rep4#DataType
  ] = {
    new CaseClassRepMapper4[
        Rep1
      , Rep1#DataType
      , Rep2
      , Rep2#DataType
      , Rep3
      , Rep3#DataType
      , Rep4
      , Rep4#DataType
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
    )
  }
  def inputColumnRep[
      Rep1
    , Column1 <: MacroColumnInfo
    , Rep2
    , Column2 <: MacroColumnInfo
    , Rep3
    , Column3 <: MacroColumnInfo
    , Rep4
    , Column4 <: MacroColumnInfo
    , Rep5
    , Column5 <: MacroColumnInfo
  ](
      rep1: Rep1
    , column1: Column1
    , rep2: Rep2
    , column2: Column2
    , rep3: Rep3
    , column3: Column3
    , rep4: Rep4
    , column4: Column4
    , rep5: Rep5
    , column5: Column5
  ): RepDataSetter15[
      Rep1
    , Column1
    , Rep2
    , Column2
    , Rep3
    , Column3
    , Rep4
    , Column4
    , Rep5
    , Column5
  ] = {
    new RepDataSetter15[
        Rep1
      , Column1
      , Rep2
      , Column2
      , Rep3
      , Column3
      , Rep4
      , Column4
      , Rep5
      , Column5
    ] {
      override def withDataType[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
      ](
          defaultValue1: => Option[Data1]
        , defaultValue2: => Option[Data2]
        , defaultValue3: => Option[Data3]
        , defaultValue4: => Option[Data4]
        , defaultValue5: => Option[Data5]
      ): RepDataSetter25[
          Rep1
        , Column1
        , Data1
        , Rep2
        , Column2
        , Data2
        , Rep3
        , Column3
        , Data3
        , Rep4
        , Column4
        , Data4
        , Rep5
        , Column5
        , Data5
      ] = {
        new RepDataSetter25[
            Rep1
          , Column1
          , Data1
          , Rep2
          , Column2
          , Data2
          , Rep3
          , Column3
          , Data3
          , Rep4
          , Column4
          , Data4
          , Rep5
          , Column5
          , Data5
        ] {
          override def output[
              Target1
            , Target2
            , Target3
            , Target4
            , Target5
          ](
            implicit
            wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Column1, Target1],
            wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Column2, Target2],
            wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Column3, Target3],
            wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Column4, Target4],
            wrap5: RepGroupColumnWrapper.Aux[Rep5, Data5, Column5, Target5]
          ) = {
            new CaseClassRepMapper5[
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
            ](
                rep1 = wrap1.inputColumn(rep = rep1, columnInfo = column1, defaultValue = defaultValue1)
              , rep2 = wrap2.inputColumn(rep = rep2, columnInfo = column2, defaultValue = defaultValue2)
              , rep3 = wrap3.inputColumn(rep = rep3, columnInfo = column3, defaultValue = defaultValue3)
              , rep4 = wrap4.inputColumn(rep = rep4, columnInfo = column4, defaultValue = defaultValue4)
              , rep5 = wrap5.inputColumn(rep = rep5, columnInfo = column5, defaultValue = defaultValue5)
            )
          }
        }
      }
    }
  }
  def mergeRep[
      Rep1 <: BaseClassRep
    , Rep2 <: BaseClassRep
    , Rep3 <: BaseClassRep
    , Rep4 <: BaseClassRep
    , Rep5 <: BaseClassRep
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
  ): CaseClassRepMapper5[
      Rep1
    , Rep1#DataType
    , Rep2
    , Rep2#DataType
    , Rep3
    , Rep3#DataType
    , Rep4
    , Rep4#DataType
    , Rep5
    , Rep5#DataType
  ] = {
    new CaseClassRepMapper5[
        Rep1
      , Rep1#DataType
      , Rep2
      , Rep2#DataType
      , Rep3
      , Rep3#DataType
      , Rep4
      , Rep4#DataType
      , Rep5
      , Rep5#DataType
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
    )
  }
  def inputColumnRep[
      Rep1
    , Column1 <: MacroColumnInfo
    , Rep2
    , Column2 <: MacroColumnInfo
    , Rep3
    , Column3 <: MacroColumnInfo
    , Rep4
    , Column4 <: MacroColumnInfo
    , Rep5
    , Column5 <: MacroColumnInfo
    , Rep6
    , Column6 <: MacroColumnInfo
  ](
      rep1: Rep1
    , column1: Column1
    , rep2: Rep2
    , column2: Column2
    , rep3: Rep3
    , column3: Column3
    , rep4: Rep4
    , column4: Column4
    , rep5: Rep5
    , column5: Column5
    , rep6: Rep6
    , column6: Column6
  ): RepDataSetter16[
      Rep1
    , Column1
    , Rep2
    , Column2
    , Rep3
    , Column3
    , Rep4
    , Column4
    , Rep5
    , Column5
    , Rep6
    , Column6
  ] = {
    new RepDataSetter16[
        Rep1
      , Column1
      , Rep2
      , Column2
      , Rep3
      , Column3
      , Rep4
      , Column4
      , Rep5
      , Column5
      , Rep6
      , Column6
    ] {
      override def withDataType[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
      ](
          defaultValue1: => Option[Data1]
        , defaultValue2: => Option[Data2]
        , defaultValue3: => Option[Data3]
        , defaultValue4: => Option[Data4]
        , defaultValue5: => Option[Data5]
        , defaultValue6: => Option[Data6]
      ): RepDataSetter26[
          Rep1
        , Column1
        , Data1
        , Rep2
        , Column2
        , Data2
        , Rep3
        , Column3
        , Data3
        , Rep4
        , Column4
        , Data4
        , Rep5
        , Column5
        , Data5
        , Rep6
        , Column6
        , Data6
      ] = {
        new RepDataSetter26[
            Rep1
          , Column1
          , Data1
          , Rep2
          , Column2
          , Data2
          , Rep3
          , Column3
          , Data3
          , Rep4
          , Column4
          , Data4
          , Rep5
          , Column5
          , Data5
          , Rep6
          , Column6
          , Data6
        ] {
          override def output[
              Target1
            , Target2
            , Target3
            , Target4
            , Target5
            , Target6
          ](
            implicit
            wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Column1, Target1],
            wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Column2, Target2],
            wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Column3, Target3],
            wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Column4, Target4],
            wrap5: RepGroupColumnWrapper.Aux[Rep5, Data5, Column5, Target5],
            wrap6: RepGroupColumnWrapper.Aux[Rep6, Data6, Column6, Target6]
          ) = {
            new CaseClassRepMapper6[
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
            ](
                rep1 = wrap1.inputColumn(rep = rep1, columnInfo = column1, defaultValue = defaultValue1)
              , rep2 = wrap2.inputColumn(rep = rep2, columnInfo = column2, defaultValue = defaultValue2)
              , rep3 = wrap3.inputColumn(rep = rep3, columnInfo = column3, defaultValue = defaultValue3)
              , rep4 = wrap4.inputColumn(rep = rep4, columnInfo = column4, defaultValue = defaultValue4)
              , rep5 = wrap5.inputColumn(rep = rep5, columnInfo = column5, defaultValue = defaultValue5)
              , rep6 = wrap6.inputColumn(rep = rep6, columnInfo = column6, defaultValue = defaultValue6)
            )
          }
        }
      }
    }
  }
  def mergeRep[
      Rep1 <: BaseClassRep
    , Rep2 <: BaseClassRep
    , Rep3 <: BaseClassRep
    , Rep4 <: BaseClassRep
    , Rep5 <: BaseClassRep
    , Rep6 <: BaseClassRep
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
  ): CaseClassRepMapper6[
      Rep1
    , Rep1#DataType
    , Rep2
    , Rep2#DataType
    , Rep3
    , Rep3#DataType
    , Rep4
    , Rep4#DataType
    , Rep5
    , Rep5#DataType
    , Rep6
    , Rep6#DataType
  ] = {
    new CaseClassRepMapper6[
        Rep1
      , Rep1#DataType
      , Rep2
      , Rep2#DataType
      , Rep3
      , Rep3#DataType
      , Rep4
      , Rep4#DataType
      , Rep5
      , Rep5#DataType
      , Rep6
      , Rep6#DataType
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
    )
  }
  def inputColumnRep[
      Rep1
    , Column1 <: MacroColumnInfo
    , Rep2
    , Column2 <: MacroColumnInfo
    , Rep3
    , Column3 <: MacroColumnInfo
    , Rep4
    , Column4 <: MacroColumnInfo
    , Rep5
    , Column5 <: MacroColumnInfo
    , Rep6
    , Column6 <: MacroColumnInfo
    , Rep7
    , Column7 <: MacroColumnInfo
  ](
      rep1: Rep1
    , column1: Column1
    , rep2: Rep2
    , column2: Column2
    , rep3: Rep3
    , column3: Column3
    , rep4: Rep4
    , column4: Column4
    , rep5: Rep5
    , column5: Column5
    , rep6: Rep6
    , column6: Column6
    , rep7: Rep7
    , column7: Column7
  ): RepDataSetter17[
      Rep1
    , Column1
    , Rep2
    , Column2
    , Rep3
    , Column3
    , Rep4
    , Column4
    , Rep5
    , Column5
    , Rep6
    , Column6
    , Rep7
    , Column7
  ] = {
    new RepDataSetter17[
        Rep1
      , Column1
      , Rep2
      , Column2
      , Rep3
      , Column3
      , Rep4
      , Column4
      , Rep5
      , Column5
      , Rep6
      , Column6
      , Rep7
      , Column7
    ] {
      override def withDataType[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
      ](
          defaultValue1: => Option[Data1]
        , defaultValue2: => Option[Data2]
        , defaultValue3: => Option[Data3]
        , defaultValue4: => Option[Data4]
        , defaultValue5: => Option[Data5]
        , defaultValue6: => Option[Data6]
        , defaultValue7: => Option[Data7]
      ): RepDataSetter27[
          Rep1
        , Column1
        , Data1
        , Rep2
        , Column2
        , Data2
        , Rep3
        , Column3
        , Data3
        , Rep4
        , Column4
        , Data4
        , Rep5
        , Column5
        , Data5
        , Rep6
        , Column6
        , Data6
        , Rep7
        , Column7
        , Data7
      ] = {
        new RepDataSetter27[
            Rep1
          , Column1
          , Data1
          , Rep2
          , Column2
          , Data2
          , Rep3
          , Column3
          , Data3
          , Rep4
          , Column4
          , Data4
          , Rep5
          , Column5
          , Data5
          , Rep6
          , Column6
          , Data6
          , Rep7
          , Column7
          , Data7
        ] {
          override def output[
              Target1
            , Target2
            , Target3
            , Target4
            , Target5
            , Target6
            , Target7
          ](
            implicit
            wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Column1, Target1],
            wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Column2, Target2],
            wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Column3, Target3],
            wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Column4, Target4],
            wrap5: RepGroupColumnWrapper.Aux[Rep5, Data5, Column5, Target5],
            wrap6: RepGroupColumnWrapper.Aux[Rep6, Data6, Column6, Target6],
            wrap7: RepGroupColumnWrapper.Aux[Rep7, Data7, Column7, Target7]
          ) = {
            new CaseClassRepMapper7[
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
            ](
                rep1 = wrap1.inputColumn(rep = rep1, columnInfo = column1, defaultValue = defaultValue1)
              , rep2 = wrap2.inputColumn(rep = rep2, columnInfo = column2, defaultValue = defaultValue2)
              , rep3 = wrap3.inputColumn(rep = rep3, columnInfo = column3, defaultValue = defaultValue3)
              , rep4 = wrap4.inputColumn(rep = rep4, columnInfo = column4, defaultValue = defaultValue4)
              , rep5 = wrap5.inputColumn(rep = rep5, columnInfo = column5, defaultValue = defaultValue5)
              , rep6 = wrap6.inputColumn(rep = rep6, columnInfo = column6, defaultValue = defaultValue6)
              , rep7 = wrap7.inputColumn(rep = rep7, columnInfo = column7, defaultValue = defaultValue7)
            )
          }
        }
      }
    }
  }
  def mergeRep[
      Rep1 <: BaseClassRep
    , Rep2 <: BaseClassRep
    , Rep3 <: BaseClassRep
    , Rep4 <: BaseClassRep
    , Rep5 <: BaseClassRep
    , Rep6 <: BaseClassRep
    , Rep7 <: BaseClassRep
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
  ): CaseClassRepMapper7[
      Rep1
    , Rep1#DataType
    , Rep2
    , Rep2#DataType
    , Rep3
    , Rep3#DataType
    , Rep4
    , Rep4#DataType
    , Rep5
    , Rep5#DataType
    , Rep6
    , Rep6#DataType
    , Rep7
    , Rep7#DataType
  ] = {
    new CaseClassRepMapper7[
        Rep1
      , Rep1#DataType
      , Rep2
      , Rep2#DataType
      , Rep3
      , Rep3#DataType
      , Rep4
      , Rep4#DataType
      , Rep5
      , Rep5#DataType
      , Rep6
      , Rep6#DataType
      , Rep7
      , Rep7#DataType
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
    )
  }
  def inputRep[
      Rep1
  ](
      rep1: Rep1
  ): RepSetter1[
      Rep1
  ] = {
    new RepSetter1[
        Rep1
    ] {
      override def withDataType[
          Data1
      ]: CaseClassRepMapper1[
          Rep1
        , Data1
      ] = {
        new CaseClassRepMapper1[
            Rep1
          , Data1
        ](
            rep1 = rep1
        )
      }
    }
  }
  def inputRep[
      Rep1
    , Rep2
  ](
      rep1: Rep1
    , rep2: Rep2
  ): RepSetter2[
      Rep1
    , Rep2
  ] = {
    new RepSetter2[
        Rep1
      , Rep2
    ] {
      override def withDataType[
          Data1
        , Data2
      ]: CaseClassRepMapper2[
          Rep1
        , Data1
        , Rep2
        , Data2
      ] = {
        new CaseClassRepMapper2[
            Rep1
          , Data1
          , Rep2
          , Data2
        ](
            rep1 = rep1
          , rep2 = rep2
        )
      }
    }
  }
  def inputRep[
      Rep1
    , Rep2
    , Rep3
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
  ): RepSetter3[
      Rep1
    , Rep2
    , Rep3
  ] = {
    new RepSetter3[
        Rep1
      , Rep2
      , Rep3
    ] {
      override def withDataType[
          Data1
        , Data2
        , Data3
      ]: CaseClassRepMapper3[
          Rep1
        , Data1
        , Rep2
        , Data2
        , Rep3
        , Data3
      ] = {
        new CaseClassRepMapper3[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
        ](
            rep1 = rep1
          , rep2 = rep2
          , rep3 = rep3
        )
      }
    }
  }
  def inputRep[
      Rep1
    , Rep2
    , Rep3
    , Rep4
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
  ): RepSetter4[
      Rep1
    , Rep2
    , Rep3
    , Rep4
  ] = {
    new RepSetter4[
        Rep1
      , Rep2
      , Rep3
      , Rep4
    ] {
      override def withDataType[
          Data1
        , Data2
        , Data3
        , Data4
      ]: CaseClassRepMapper4[
          Rep1
        , Data1
        , Rep2
        , Data2
        , Rep3
        , Data3
        , Rep4
        , Data4
      ] = {
        new CaseClassRepMapper4[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
        ](
            rep1 = rep1
          , rep2 = rep2
          , rep3 = rep3
          , rep4 = rep4
        )
      }
    }
  }
  def inputRep[
      Rep1
    , Rep2
    , Rep3
    , Rep4
    , Rep5
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
  ): RepSetter5[
      Rep1
    , Rep2
    , Rep3
    , Rep4
    , Rep5
  ] = {
    new RepSetter5[
        Rep1
      , Rep2
      , Rep3
      , Rep4
      , Rep5
    ] {
      override def withDataType[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
      ]: CaseClassRepMapper5[
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
        new CaseClassRepMapper5[
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
            rep1 = rep1
          , rep2 = rep2
          , rep3 = rep3
          , rep4 = rep4
          , rep5 = rep5
        )
      }
    }
  }
  def inputRep[
      Rep1
    , Rep2
    , Rep3
    , Rep4
    , Rep5
    , Rep6
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
  ): RepSetter6[
      Rep1
    , Rep2
    , Rep3
    , Rep4
    , Rep5
    , Rep6
  ] = {
    new RepSetter6[
        Rep1
      , Rep2
      , Rep3
      , Rep4
      , Rep5
      , Rep6
    ] {
      override def withDataType[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
      ]: CaseClassRepMapper6[
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
        new CaseClassRepMapper6[
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
            rep1 = rep1
          , rep2 = rep2
          , rep3 = rep3
          , rep4 = rep4
          , rep5 = rep5
          , rep6 = rep6
        )
      }
    }
  }
  def inputRep[
      Rep1
    , Rep2
    , Rep3
    , Rep4
    , Rep5
    , Rep6
    , Rep7
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
  ): RepSetter7[
      Rep1
    , Rep2
    , Rep3
    , Rep4
    , Rep5
    , Rep6
    , Rep7
  ] = {
    new RepSetter7[
        Rep1
      , Rep2
      , Rep3
      , Rep4
      , Rep5
      , Rep6
      , Rep7
    ] {
      override def withDataType[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
      ]: CaseClassRepMapper7[
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
        new CaseClassRepMapper7[
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
            rep1 = rep1
          , rep2 = rep2
          , rep3 = rep3
          , rep4 = rep4
          , rep5 = rep5
          , rep6 = rep6
          , rep7 = rep7
        )
      }
    }
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
}
class CaseClassRepMapper1[
    Rep1
  , Data1
](
    val rep1: Rep1
) extends BaseClassRep {
  self =>
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper1. You can replace selfInfo with\n" +
      "i1(context)\nto find the missing column."
    , "0.0.1"
  )
  def selfInfo: CaseClassRepMapper1[
      Rep1
    , Data1
  ] = self
  def i1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol]): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol]): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep1, Data1, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  override type DataType = CaseClassDataMapper1[
      Data1
  ]
  def dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper1[
      Rep1
    , Data1
  ], CaseClassDataMapper1[
      Data1
  ]] = new DataGenWrap {
    override type TempRep = CaseClassRepMapper1[
        Rep1
      , Data1
    ]
    override type TempData = CaseClassDataMapper1[
        Data1
    ]
    override val rep = self
  }
}
trait RepSetter1[
    Rep1
] {
  def withDataType[
      Data1
  ]: CaseClassRepMapper1[
      Rep1
    , Data1
  ]
}
trait RepDataSetter11[
    Rep1
  , Column1 <: MacroColumnInfo
] {
  def withDataType[
      Data1
  ](
      defaultValue1: => Option[Data1]
  ): RepDataSetter21[
      Rep1
    , Column1
    , Data1
  ]
}
trait RepDataSetter21[
    Rep1
  , Column1 <: MacroColumnInfo
  , Data1
] {
  def output[
      Target1
  ](
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Column1, Target1]
  ): CaseClassRepMapper1[
      Target1
    , Data1
  ]
}
class CaseClassDataMapper1[
    Data1
](
    val data1: Data1
)
object CaseClassRepMapper1 {
  implicit def caseClassHelper1EncoderGen[Rep1, Data1, Target1, RepCol, DataCol](
      implicit
    shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
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
        base: => CaseClassRepMapper1[
            Rep1
          , Data1
        ]
      ): CaseClassRepMapper1[
          Target1
        , Data1
      ] = {
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
          )
          .withDataType[
              Data1
          ]
      }
      override def buildRep(
        base: CaseClassRepMapper1[
            Target1
          , Data1
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep2 = oldRep
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        val data1 = shape1.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper1DecoderGen[Rep1, Data1, Target1, RepCol, DataCol](
      implicit
    shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
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
        base: => CaseClassRepMapper1[
            Rep1
          , Data1
        ]
      ): CaseClassRepMapper1[
          Target1
        , Data1
      ] = {
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
          )
          .withDataType[
              Data1
          ]
      }
      override def buildRep(
        base: CaseClassRepMapper1[
            Target1
          , Data1
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep2 = oldRep
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        val dataCol0 = oldDataCol
        val split1   = shape1.takeData(rep.rep1, dataCol0)
        SplitData(
          current = new CaseClassDataMapper1(
              data1 = split1.current
          ),
          left = split1.left
        )
      }
    }
  }
  implicit def caseClassHelper1FormatterGen[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol](
      implicit
    shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper1[
      Rep1
    , Data1
  ], CaseClassDataMapper1[
      Data1
  ], CaseClassRepMapper1[
      Target1
    , Data1
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper1[
        Rep1
      , Data1
    ], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = CaseClassRepMapper1[
          Target1
        , Data1
      ]
      override type Data = CaseClassDataMapper1[
          Data1
      ]
      override def wrapRep(
        base: => CaseClassRepMapper1[
            Rep1
          , Data1
        ]
      ): CaseClassRepMapper1[
          Target1
        , Data1
      ] = {
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
          )
          .withDataType[
              Data1
          ]
      }
      override def buildRep(
        base: CaseClassRepMapper1[
            Target1
          , Data1
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep2 = oldRep
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data2 = oldData
        val data1 = shape1.buildData(data.data1, rep.rep1, data2)
        data1
      }
      override def takeData(
        rep: CaseClassRepMapper1[
            Target1
          , Data1
        ],
        oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper1[
          Data1
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol
        val split1   = shape1.takeData(rep.rep1, dataCol0)
        SplitData(
          current = new CaseClassDataMapper1(
              data1 = split1.current
          ),
          left = split1.left
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
  , val rep2: Rep2
) extends BaseClassRep {
  self =>
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper2. You can replace selfInfo with\n" +
      "i1(context)\ni2(context)\nto find the missing column."
    , "0.0.1"
  )
  def selfInfo: CaseClassRepMapper2[
      Rep1
    , Data1
    , Rep2
    , Data2
  ] = self
  def i1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol]): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol]): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep1, Data1, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol]): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol]): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep2, Data2, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  override type DataType = CaseClassDataMapper2[
      Data1
    , Data2
  ]
  def dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper2[
      Rep1
    , Data1
    , Rep2
    , Data2
  ], CaseClassDataMapper2[
      Data1
    , Data2
  ]] = new DataGenWrap {
    override type TempRep = CaseClassRepMapper2[
        Rep1
      , Data1
      , Rep2
      , Data2
    ]
    override type TempData = CaseClassDataMapper2[
        Data1
      , Data2
    ]
    override val rep = self
  }
}
trait RepSetter2[
    Rep1
  , Rep2
] {
  def withDataType[
      Data1
    , Data2
  ]: CaseClassRepMapper2[
      Rep1
    , Data1
    , Rep2
    , Data2
  ]
}
trait RepDataSetter12[
    Rep1
  , Column1 <: MacroColumnInfo
  , Rep2
  , Column2 <: MacroColumnInfo
] {
  def withDataType[
      Data1
    , Data2
  ](
      defaultValue1: => Option[Data1]
    , defaultValue2: => Option[Data2]
  ): RepDataSetter22[
      Rep1
    , Column1
    , Data1
    , Rep2
    , Column2
    , Data2
  ]
}
trait RepDataSetter22[
    Rep1
  , Column1 <: MacroColumnInfo
  , Data1
  , Rep2
  , Column2 <: MacroColumnInfo
  , Data2
] {
  def output[
      Target1
    , Target2
  ](
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Column1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Column2, Target2]
  ): CaseClassRepMapper2[
      Target1
    , Data1
    , Target2
    , Data2
  ]
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
    shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
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
        base: => CaseClassRepMapper2[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
          )
          .withDataType[
              Data1
            , Data2
          ]
      }
      override def buildRep(
        base: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep3 = oldRep
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        val data2 = shape2.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper2DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, RepCol, DataCol](
      implicit
    shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
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
        base: => CaseClassRepMapper2[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
          )
          .withDataType[
              Data1
            , Data2
          ]
      }
      override def buildRep(
        base: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep3 = oldRep
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        val dataCol0 = oldDataCol
        val split1   = shape1.takeData(rep.rep1, dataCol0)
        val split2   = shape2.takeData(rep.rep2, split1.left)
        SplitData(
          current = new CaseClassDataMapper2(
              data1 = split1.current
            , data2 = split2.current
          ),
          left = split2.left
        )
      }
    }
  }
  implicit def caseClassHelper2FormatterGen[Rep1, Data1, Target1, Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol](
      implicit
    shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper2[
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
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper2[
        Rep1
      , Data1
      , Rep2
      , Data2
    ], RepCol, EncoderDataCol, DecoderDataCol] {
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
        base: => CaseClassRepMapper2[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
          )
          .withDataType[
              Data1
            , Data2
          ]
      }
      override def buildRep(
        base: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ],
        oldRep: RepCol
      ): RepCol = {
        val rep3 = oldRep
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data3 = oldData
        val data2 = shape2.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.buildData(data.data1, rep.rep1, data2)
        data1
      }
      override def takeData(
        rep: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ],
        oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper2[
          Data1
        , Data2
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol
        val split1   = shape1.takeData(rep.rep1, dataCol0)
        val split2   = shape2.takeData(rep.rep2, split1.left)
        SplitData(
          current = new CaseClassDataMapper2(
              data1 = split1.current
            , data2 = split2.current
          ),
          left = split2.left
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
  , val rep2: Rep2
  , val rep3: Rep3
) extends BaseClassRep {
  self =>
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper3. You can replace selfInfo with\n" +
      "i1(context)\ni2(context)\ni3(context)\nto find the missing column."
    , "0.0.1"
  )
  def selfInfo: CaseClassRepMapper3[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
  ] = self
  def i1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol]): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol]): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep1, Data1, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol]): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol]): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep2, Data2, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol]): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol]): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep3, Data3, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  override type DataType = CaseClassDataMapper3[
      Data1
    , Data2
    , Data3
  ]
  def dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper3[
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
  ]] = new DataGenWrap {
    override type TempRep = CaseClassRepMapper3[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
    ]
    override type TempData = CaseClassDataMapper3[
        Data1
      , Data2
      , Data3
    ]
    override val rep = self
  }
}
trait RepSetter3[
    Rep1
  , Rep2
  , Rep3
] {
  def withDataType[
      Data1
    , Data2
    , Data3
  ]: CaseClassRepMapper3[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
  ]
}
trait RepDataSetter13[
    Rep1
  , Column1 <: MacroColumnInfo
  , Rep2
  , Column2 <: MacroColumnInfo
  , Rep3
  , Column3 <: MacroColumnInfo
] {
  def withDataType[
      Data1
    , Data2
    , Data3
  ](
      defaultValue1: => Option[Data1]
    , defaultValue2: => Option[Data2]
    , defaultValue3: => Option[Data3]
  ): RepDataSetter23[
      Rep1
    , Column1
    , Data1
    , Rep2
    , Column2
    , Data2
    , Rep3
    , Column3
    , Data3
  ]
}
trait RepDataSetter23[
    Rep1
  , Column1 <: MacroColumnInfo
  , Data1
  , Rep2
  , Column2 <: MacroColumnInfo
  , Data2
  , Rep3
  , Column3 <: MacroColumnInfo
  , Data3
] {
  def output[
      Target1
    , Target2
    , Target3
  ](
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Column1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Column2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Column3, Target3]
  ): CaseClassRepMapper3[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
  ]
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
    shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
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
        base: => CaseClassRepMapper3[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
          ]
      }
      override def buildRep(
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
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        val data3 = shape3.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper3DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, RepCol, DataCol](
      implicit
    shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
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
        base: => CaseClassRepMapper3[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
          ]
      }
      override def buildRep(
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
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        val dataCol0 = oldDataCol
        val split1   = shape1.takeData(rep.rep1, dataCol0)
        val split2   = shape2.takeData(rep.rep2, split1.left)
        val split3   = shape3.takeData(rep.rep3, split2.left)
        SplitData(
          current = new CaseClassDataMapper3(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
          ),
          left = split3.left
        )
      }
    }
  }
  implicit def caseClassHelper3FormatterGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol](
      implicit
    shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper3[
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
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper3[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
    ], RepCol, EncoderDataCol, DecoderDataCol] {
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
        base: => CaseClassRepMapper3[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
          ]
      }
      override def buildRep(
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
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data4 = oldData
        val data3 = shape3.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.buildData(data.data1, rep.rep1, data2)
        data1
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
        oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper3[
          Data1
        , Data2
        , Data3
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol
        val split1   = shape1.takeData(rep.rep1, dataCol0)
        val split2   = shape2.takeData(rep.rep2, split1.left)
        val split3   = shape3.takeData(rep.rep3, split2.left)
        SplitData(
          current = new CaseClassDataMapper3(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
          ),
          left = split3.left
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
  , val rep2: Rep2
  , val rep3: Rep3
  , val rep4: Rep4
) extends BaseClassRep {
  self =>
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper4. You can replace selfInfo with\n" +
      "i1(context)\ni2(context)\ni3(context)\ni4(context)\nto find the missing column."
    , "0.0.1"
  )
  def selfInfo: CaseClassRepMapper4[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
  ] = self
  def i1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol]): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol]): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep1, Data1, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol]): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol]): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep2, Data2, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol]): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol]): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep3, Data3, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i4[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol]): EncoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i4[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol]): DecoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i4[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep4, Data4, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  override type DataType = CaseClassDataMapper4[
      Data1
    , Data2
    , Data3
    , Data4
  ]
  def dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper4[
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
  ]] = new DataGenWrap {
    override type TempRep = CaseClassRepMapper4[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
    ]
    override type TempData = CaseClassDataMapper4[
        Data1
      , Data2
      , Data3
      , Data4
    ]
    override val rep = self
  }
}
trait RepSetter4[
    Rep1
  , Rep2
  , Rep3
  , Rep4
] {
  def withDataType[
      Data1
    , Data2
    , Data3
    , Data4
  ]: CaseClassRepMapper4[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
  ]
}
trait RepDataSetter14[
    Rep1
  , Column1 <: MacroColumnInfo
  , Rep2
  , Column2 <: MacroColumnInfo
  , Rep3
  , Column3 <: MacroColumnInfo
  , Rep4
  , Column4 <: MacroColumnInfo
] {
  def withDataType[
      Data1
    , Data2
    , Data3
    , Data4
  ](
      defaultValue1: => Option[Data1]
    , defaultValue2: => Option[Data2]
    , defaultValue3: => Option[Data3]
    , defaultValue4: => Option[Data4]
  ): RepDataSetter24[
      Rep1
    , Column1
    , Data1
    , Rep2
    , Column2
    , Data2
    , Rep3
    , Column3
    , Data3
    , Rep4
    , Column4
    , Data4
  ]
}
trait RepDataSetter24[
    Rep1
  , Column1 <: MacroColumnInfo
  , Data1
  , Rep2
  , Column2 <: MacroColumnInfo
  , Data2
  , Rep3
  , Column3 <: MacroColumnInfo
  , Data3
  , Rep4
  , Column4 <: MacroColumnInfo
  , Data4
] {
  def output[
      Target1
    , Target2
    , Target3
    , Target4
  ](
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Column1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Column2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Column3, Target3],
    wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Column4, Target4]
  ): CaseClassRepMapper4[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
  ]
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
    shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
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
        base: => CaseClassRepMapper4[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
            , rep4 = shape4.wrapRep(base.rep4)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
            , Data4
          ]
      }
      override def buildRep(
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
        val rep4 = shape4.buildRep(base.rep4, rep5)
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        val data4 = shape4.buildData(data.data4, rep.rep4, data5)
        val data3 = shape3.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.buildData(data.data1, rep.rep1, data2)
        data1
      }
    }
  }
  implicit def caseClassHelper4DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, RepCol, DataCol](
      implicit
    shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
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
        base: => CaseClassRepMapper4[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
            , rep4 = shape4.wrapRep(base.rep4)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
            , Data4
          ]
      }
      override def buildRep(
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
        val rep4 = shape4.buildRep(base.rep4, rep5)
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        val dataCol0 = oldDataCol
        val split1   = shape1.takeData(rep.rep1, dataCol0)
        val split2   = shape2.takeData(rep.rep2, split1.left)
        val split3   = shape3.takeData(rep.rep3, split2.left)
        val split4   = shape4.takeData(rep.rep4, split3.left)
        SplitData(
          current = new CaseClassDataMapper4(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
          ),
          left = split4.left
        )
      }
    }
  }
  implicit def caseClassHelper4FormatterGen[
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
    RepCol,
    EncoderDataCol,
    DecoderDataCol
  ](
      implicit
    shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
    , shape4: FormatterShape.Aux[Rep4, Data4, Target4, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper4[
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
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper4[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
    ], RepCol, EncoderDataCol, DecoderDataCol] {
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
        base: => CaseClassRepMapper4[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
            , rep4 = shape4.wrapRep(base.rep4)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
            , Data4
          ]
      }
      override def buildRep(
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
        val rep4 = shape4.buildRep(base.rep4, rep5)
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data5 = oldData
        val data4 = shape4.buildData(data.data4, rep.rep4, data5)
        val data3 = shape3.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.buildData(data.data1, rep.rep1, data2)
        data1
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
        oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper4[
          Data1
        , Data2
        , Data3
        , Data4
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol
        val split1   = shape1.takeData(rep.rep1, dataCol0)
        val split2   = shape2.takeData(rep.rep2, split1.left)
        val split3   = shape3.takeData(rep.rep3, split2.left)
        val split4   = shape4.takeData(rep.rep4, split3.left)
        SplitData(
          current = new CaseClassDataMapper4(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
          ),
          left = split4.left
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
  , val rep2: Rep2
  , val rep3: Rep3
  , val rep4: Rep4
  , val rep5: Rep5
) extends BaseClassRep {
  self =>
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper5. You can replace selfInfo with\n" +
      "i1(context)\ni2(context)\ni3(context)\ni4(context)\ni5(context)\nto find the missing column."
    , "0.0.1"
  )
  def selfInfo: CaseClassRepMapper5[
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
  ] = self
  def i1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol]): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol]): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep1, Data1, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol]): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol]): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep2, Data2, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol]): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol]): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep3, Data3, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i4[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol]): EncoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i4[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol]): DecoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i4[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep4, Data4, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i5[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol]): EncoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i5[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol]): DecoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i5[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep5, Data5, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  override type DataType = CaseClassDataMapper5[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ]
  def dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper5[
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
  ]] = new DataGenWrap {
    override type TempRep = CaseClassRepMapper5[
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
    override type TempData = CaseClassDataMapper5[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
    ]
    override val rep = self
  }
}
trait RepSetter5[
    Rep1
  , Rep2
  , Rep3
  , Rep4
  , Rep5
] {
  def withDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ]: CaseClassRepMapper5[
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
}
trait RepDataSetter15[
    Rep1
  , Column1 <: MacroColumnInfo
  , Rep2
  , Column2 <: MacroColumnInfo
  , Rep3
  , Column3 <: MacroColumnInfo
  , Rep4
  , Column4 <: MacroColumnInfo
  , Rep5
  , Column5 <: MacroColumnInfo
] {
  def withDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ](
      defaultValue1: => Option[Data1]
    , defaultValue2: => Option[Data2]
    , defaultValue3: => Option[Data3]
    , defaultValue4: => Option[Data4]
    , defaultValue5: => Option[Data5]
  ): RepDataSetter25[
      Rep1
    , Column1
    , Data1
    , Rep2
    , Column2
    , Data2
    , Rep3
    , Column3
    , Data3
    , Rep4
    , Column4
    , Data4
    , Rep5
    , Column5
    , Data5
  ]
}
trait RepDataSetter25[
    Rep1
  , Column1 <: MacroColumnInfo
  , Data1
  , Rep2
  , Column2 <: MacroColumnInfo
  , Data2
  , Rep3
  , Column3 <: MacroColumnInfo
  , Data3
  , Rep4
  , Column4 <: MacroColumnInfo
  , Data4
  , Rep5
  , Column5 <: MacroColumnInfo
  , Data5
] {
  def output[
      Target1
    , Target2
    , Target3
    , Target4
    , Target5
  ](
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Column1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Column2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Column3, Target3],
    wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Column4, Target4],
    wrap5: RepGroupColumnWrapper.Aux[Rep5, Data5, Column5, Target5]
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
  ]
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
    shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
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
        base: => CaseClassRepMapper5[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
            , rep4 = shape4.wrapRep(base.rep4)
            , rep5 = shape5.wrapRep(base.rep5)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
            , Data4
            , Data5
          ]
      }
      override def buildRep(
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
        val rep5 = shape5.buildRep(base.rep5, rep6)
        val rep4 = shape4.buildRep(base.rep4, rep5)
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        val data5 = shape5.buildData(data.data5, rep.rep5, data6)
        val data4 = shape4.buildData(data.data4, rep.rep4, data5)
        val data3 = shape3.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.buildData(data.data1, rep.rep1, data2)
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
    shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
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
        base: => CaseClassRepMapper5[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
            , rep4 = shape4.wrapRep(base.rep4)
            , rep5 = shape5.wrapRep(base.rep5)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
            , Data4
            , Data5
          ]
      }
      override def buildRep(
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
        val rep5 = shape5.buildRep(base.rep5, rep6)
        val rep4 = shape4.buildRep(base.rep4, rep5)
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        val dataCol0 = oldDataCol
        val split1   = shape1.takeData(rep.rep1, dataCol0)
        val split2   = shape2.takeData(rep.rep2, split1.left)
        val split3   = shape3.takeData(rep.rep3, split2.left)
        val split4   = shape4.takeData(rep.rep4, split3.left)
        val split5   = shape5.takeData(rep.rep5, split4.left)
        SplitData(
            current = new CaseClassDataMapper5(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
          )
          , left = split5.left
        )
      }
    }
  }
  implicit def caseClassHelper5FormatterGen[
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
    EncoderDataCol,
    DecoderDataCol
  ](
      implicit
    shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
    , shape4: FormatterShape.Aux[Rep4, Data4, Target4, RepCol, EncoderDataCol, DecoderDataCol]
    , shape5: FormatterShape.Aux[Rep5, Data5, Target5, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper5[
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
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper5[
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
    ], RepCol, EncoderDataCol, DecoderDataCol] {
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
        base: => CaseClassRepMapper5[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
            , rep4 = shape4.wrapRep(base.rep4)
            , rep5 = shape5.wrapRep(base.rep5)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
            , Data4
            , Data5
          ]
      }
      override def buildRep(
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
        val rep5 = shape5.buildRep(base.rep5, rep6)
        val rep4 = shape4.buildRep(base.rep4, rep5)
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data6 = oldData
        val data5 = shape5.buildData(data.data5, rep.rep5, data6)
        val data4 = shape4.buildData(data.data4, rep.rep4, data5)
        val data3 = shape3.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.buildData(data.data1, rep.rep1, data2)
        data1
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
        oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper5[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol
        val split1   = shape1.takeData(rep.rep1, dataCol0)
        val split2   = shape2.takeData(rep.rep2, split1.left)
        val split3   = shape3.takeData(rep.rep3, split2.left)
        val split4   = shape4.takeData(rep.rep4, split3.left)
        val split5   = shape5.takeData(rep.rep5, split4.left)
        SplitData(
            current = new CaseClassDataMapper5(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
          )
          , left = split5.left
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
  , val rep2: Rep2
  , val rep3: Rep3
  , val rep4: Rep4
  , val rep5: Rep5
  , val rep6: Rep6
) extends BaseClassRep {
  self =>
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper6. You can replace selfInfo with\n" +
      "i1(context)\ni2(context)\ni3(context)\ni4(context)\ni5(context)\ni6(context)\nto find the missing column."
    , "0.0.1"
  )
  def selfInfo: CaseClassRepMapper6[
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
  ] = self
  def i1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol]): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol]): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep1, Data1, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol]): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol]): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep2, Data2, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol]): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol]): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep3, Data3, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i4[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol]): EncoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i4[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol]): DecoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i4[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep4, Data4, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i5[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol]): EncoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i5[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol]): DecoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i5[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep5, Data5, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i6[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol]): EncoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i6[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol]): DecoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i6[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep6, Data6, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  override type DataType = CaseClassDataMapper6[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ]
  def dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper6[
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
  ]] = new DataGenWrap {
    override type TempRep = CaseClassRepMapper6[
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
    override type TempData = CaseClassDataMapper6[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
    ]
    override val rep = self
  }
}
trait RepSetter6[
    Rep1
  , Rep2
  , Rep3
  , Rep4
  , Rep5
  , Rep6
] {
  def withDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ]: CaseClassRepMapper6[
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
}
trait RepDataSetter16[
    Rep1
  , Column1 <: MacroColumnInfo
  , Rep2
  , Column2 <: MacroColumnInfo
  , Rep3
  , Column3 <: MacroColumnInfo
  , Rep4
  , Column4 <: MacroColumnInfo
  , Rep5
  , Column5 <: MacroColumnInfo
  , Rep6
  , Column6 <: MacroColumnInfo
] {
  def withDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ](
      defaultValue1: => Option[Data1]
    , defaultValue2: => Option[Data2]
    , defaultValue3: => Option[Data3]
    , defaultValue4: => Option[Data4]
    , defaultValue5: => Option[Data5]
    , defaultValue6: => Option[Data6]
  ): RepDataSetter26[
      Rep1
    , Column1
    , Data1
    , Rep2
    , Column2
    , Data2
    , Rep3
    , Column3
    , Data3
    , Rep4
    , Column4
    , Data4
    , Rep5
    , Column5
    , Data5
    , Rep6
    , Column6
    , Data6
  ]
}
trait RepDataSetter26[
    Rep1
  , Column1 <: MacroColumnInfo
  , Data1
  , Rep2
  , Column2 <: MacroColumnInfo
  , Data2
  , Rep3
  , Column3 <: MacroColumnInfo
  , Data3
  , Rep4
  , Column4 <: MacroColumnInfo
  , Data4
  , Rep5
  , Column5 <: MacroColumnInfo
  , Data5
  , Rep6
  , Column6 <: MacroColumnInfo
  , Data6
] {
  def output[
      Target1
    , Target2
    , Target3
    , Target4
    , Target5
    , Target6
  ](
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Column1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Column2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Column3, Target3],
    wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Column4, Target4],
    wrap5: RepGroupColumnWrapper.Aux[Rep5, Data5, Column5, Target5],
    wrap6: RepGroupColumnWrapper.Aux[Rep6, Data6, Column6, Target6]
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
  ]
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
    shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
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
        base: => CaseClassRepMapper6[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
            , rep4 = shape4.wrapRep(base.rep4)
            , rep5 = shape5.wrapRep(base.rep5)
            , rep6 = shape6.wrapRep(base.rep6)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
            , Data4
            , Data5
            , Data6
          ]
      }
      override def buildRep(
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
        val rep6 = shape6.buildRep(base.rep6, rep7)
        val rep5 = shape5.buildRep(base.rep5, rep6)
        val rep4 = shape4.buildRep(base.rep4, rep5)
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        val data6 = shape6.buildData(data.data6, rep.rep6, data7)
        val data5 = shape5.buildData(data.data5, rep.rep5, data6)
        val data4 = shape4.buildData(data.data4, rep.rep4, data5)
        val data3 = shape3.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.buildData(data.data1, rep.rep1, data2)
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
    shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
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
        base: => CaseClassRepMapper6[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
            , rep4 = shape4.wrapRep(base.rep4)
            , rep5 = shape5.wrapRep(base.rep5)
            , rep6 = shape6.wrapRep(base.rep6)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
            , Data4
            , Data5
            , Data6
          ]
      }
      override def buildRep(
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
        val rep6 = shape6.buildRep(base.rep6, rep7)
        val rep5 = shape5.buildRep(base.rep5, rep6)
        val rep4 = shape4.buildRep(base.rep4, rep5)
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        val dataCol0 = oldDataCol
        val split1   = shape1.takeData(rep.rep1, dataCol0)
        val split2   = shape2.takeData(rep.rep2, split1.left)
        val split3   = shape3.takeData(rep.rep3, split2.left)
        val split4   = shape4.takeData(rep.rep4, split3.left)
        val split5   = shape5.takeData(rep.rep5, split4.left)
        val split6   = shape6.takeData(rep.rep6, split5.left)
        SplitData(
            current = new CaseClassDataMapper6(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
          )
          , left = split6.left
        )
      }
    }
  }
  implicit def caseClassHelper6FormatterGen[
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
    EncoderDataCol,
    DecoderDataCol
  ](
      implicit
    shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
    , shape4: FormatterShape.Aux[Rep4, Data4, Target4, RepCol, EncoderDataCol, DecoderDataCol]
    , shape5: FormatterShape.Aux[Rep5, Data5, Target5, RepCol, EncoderDataCol, DecoderDataCol]
    , shape6: FormatterShape.Aux[Rep6, Data6, Target6, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper6[
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
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper6[
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
    ], RepCol, EncoderDataCol, DecoderDataCol] {
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
        base: => CaseClassRepMapper6[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
            , rep4 = shape4.wrapRep(base.rep4)
            , rep5 = shape5.wrapRep(base.rep5)
            , rep6 = shape6.wrapRep(base.rep6)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
            , Data4
            , Data5
            , Data6
          ]
      }
      override def buildRep(
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
        val rep6 = shape6.buildRep(base.rep6, rep7)
        val rep5 = shape5.buildRep(base.rep5, rep6)
        val rep4 = shape4.buildRep(base.rep4, rep5)
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data7 = oldData
        val data6 = shape6.buildData(data.data6, rep.rep6, data7)
        val data5 = shape5.buildData(data.data5, rep.rep5, data6)
        val data4 = shape4.buildData(data.data4, rep.rep4, data5)
        val data3 = shape3.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.buildData(data.data1, rep.rep1, data2)
        data1
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
        oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper6[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol
        val split1   = shape1.takeData(rep.rep1, dataCol0)
        val split2   = shape2.takeData(rep.rep2, split1.left)
        val split3   = shape3.takeData(rep.rep3, split2.left)
        val split4   = shape4.takeData(rep.rep4, split3.left)
        val split5   = shape5.takeData(rep.rep5, split4.left)
        val split6   = shape6.takeData(rep.rep6, split5.left)
        SplitData(
            current = new CaseClassDataMapper6(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
          )
          , left = split6.left
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
  , val rep2: Rep2
  , val rep3: Rep3
  , val rep4: Rep4
  , val rep5: Rep5
  , val rep6: Rep6
  , val rep7: Rep7
) extends BaseClassRep {
  self =>
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper7. You can replace selfInfo with\n" +
      "i1(context)\ni2(context)\ni3(context)\ni4(context)\ni5(context)\ni6(context)\ni7(context)\nto find the missing column."
    , "0.0.1"
  )
  def selfInfo: CaseClassRepMapper7[
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
  ] = self
  def i1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol]): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol]): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep1, Data1, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol]): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol]): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep2, Data2, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol]): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol]): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep3, Data3, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i4[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol]): EncoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i4[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol]): DecoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i4[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep4, Data4, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i5[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol]): EncoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i5[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol]): DecoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i5[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep5, Data5, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i6[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol]): EncoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i6[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol]): DecoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i6[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep6, Data6, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i7[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target](
    context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: EncoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol]): EncoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7)
    val shape1  = debugShape.shape.packed
    new EncoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i7[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target](
    context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(implicit debugShape: DecoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol]): DecoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7)
    val shape1  = debugShape.shape.packed
    new DecoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  def i7[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target](
    context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
    implicit debugShape: FormatterDebugShape.Aux[Rep7, Data7, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7)
    val shape1  = debugShape.shape.packed
    new FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target
      override val rep   = target1
      override val shape = shape1
    }
  }
  override type DataType = CaseClassDataMapper7[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ]
  def dataGenWrap: DataGenWrap.Aux[CaseClassRepMapper7[
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
  ]] = new DataGenWrap {
    override type TempRep = CaseClassRepMapper7[
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
    override type TempData = CaseClassDataMapper7[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
    ]
    override val rep = self
  }
}
trait RepSetter7[
    Rep1
  , Rep2
  , Rep3
  , Rep4
  , Rep5
  , Rep6
  , Rep7
] {
  def withDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ]: CaseClassRepMapper7[
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
}
trait RepDataSetter17[
    Rep1
  , Column1 <: MacroColumnInfo
  , Rep2
  , Column2 <: MacroColumnInfo
  , Rep3
  , Column3 <: MacroColumnInfo
  , Rep4
  , Column4 <: MacroColumnInfo
  , Rep5
  , Column5 <: MacroColumnInfo
  , Rep6
  , Column6 <: MacroColumnInfo
  , Rep7
  , Column7 <: MacroColumnInfo
] {
  def withDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ](
      defaultValue1: => Option[Data1]
    , defaultValue2: => Option[Data2]
    , defaultValue3: => Option[Data3]
    , defaultValue4: => Option[Data4]
    , defaultValue5: => Option[Data5]
    , defaultValue6: => Option[Data6]
    , defaultValue7: => Option[Data7]
  ): RepDataSetter27[
      Rep1
    , Column1
    , Data1
    , Rep2
    , Column2
    , Data2
    , Rep3
    , Column3
    , Data3
    , Rep4
    , Column4
    , Data4
    , Rep5
    , Column5
    , Data5
    , Rep6
    , Column6
    , Data6
    , Rep7
    , Column7
    , Data7
  ]
}
trait RepDataSetter27[
    Rep1
  , Column1 <: MacroColumnInfo
  , Data1
  , Rep2
  , Column2 <: MacroColumnInfo
  , Data2
  , Rep3
  , Column3 <: MacroColumnInfo
  , Data3
  , Rep4
  , Column4 <: MacroColumnInfo
  , Data4
  , Rep5
  , Column5 <: MacroColumnInfo
  , Data5
  , Rep6
  , Column6 <: MacroColumnInfo
  , Data6
  , Rep7
  , Column7 <: MacroColumnInfo
  , Data7
] {
  def output[
      Target1
    , Target2
    , Target3
    , Target4
    , Target5
    , Target6
    , Target7
  ](
    implicit
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Column1, Target1],
    wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Column2, Target2],
    wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Column3, Target3],
    wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Column4, Target4],
    wrap5: RepGroupColumnWrapper.Aux[Rep5, Data5, Column5, Target5],
    wrap6: RepGroupColumnWrapper.Aux[Rep6, Data6, Column6, Target6],
    wrap7: RepGroupColumnWrapper.Aux[Rep7, Data7, Column7, Target7]
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
  ]
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
    shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
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
        base: => CaseClassRepMapper7[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
            , rep4 = shape4.wrapRep(base.rep4)
            , rep5 = shape5.wrapRep(base.rep5)
            , rep6 = shape6.wrapRep(base.rep6)
            , rep7 = shape7.wrapRep(base.rep7)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
            , Data4
            , Data5
            , Data6
            , Data7
          ]
      }
      override def buildRep(
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
        val rep7 = shape7.buildRep(base.rep7, rep8)
        val rep6 = shape6.buildRep(base.rep6, rep7)
        val rep5 = shape5.buildRep(base.rep5, rep6)
        val rep4 = shape4.buildRep(base.rep4, rep5)
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        val data7 = shape7.buildData(data.data7, rep.rep7, data8)
        val data6 = shape6.buildData(data.data6, rep.rep6, data7)
        val data5 = shape5.buildData(data.data5, rep.rep5, data6)
        val data4 = shape4.buildData(data.data4, rep.rep4, data5)
        val data3 = shape3.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.buildData(data.data1, rep.rep1, data2)
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
    shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
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
        base: => CaseClassRepMapper7[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
            , rep4 = shape4.wrapRep(base.rep4)
            , rep5 = shape5.wrapRep(base.rep5)
            , rep6 = shape6.wrapRep(base.rep6)
            , rep7 = shape7.wrapRep(base.rep7)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
            , Data4
            , Data5
            , Data6
            , Data7
          ]
      }
      override def buildRep(
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
        val rep7 = shape7.buildRep(base.rep7, rep8)
        val rep6 = shape6.buildRep(base.rep6, rep7)
        val rep5 = shape5.buildRep(base.rep5, rep6)
        val rep4 = shape4.buildRep(base.rep4, rep5)
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        val dataCol0 = oldDataCol
        val split1   = shape1.takeData(rep.rep1, dataCol0)
        val split2   = shape2.takeData(rep.rep2, split1.left)
        val split3   = shape3.takeData(rep.rep3, split2.left)
        val split4   = shape4.takeData(rep.rep4, split3.left)
        val split5   = shape5.takeData(rep.rep5, split4.left)
        val split6   = shape6.takeData(rep.rep6, split5.left)
        val split7   = shape7.takeData(rep.rep7, split6.left)
        SplitData(
            current = new CaseClassDataMapper7(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
          )
          , left = split7.left
        )
      }
    }
  }
  implicit def caseClassHelper7FormatterGen[
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
    EncoderDataCol,
    DecoderDataCol
  ](
      implicit
    shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
    , shape4: FormatterShape.Aux[Rep4, Data4, Target4, RepCol, EncoderDataCol, DecoderDataCol]
    , shape5: FormatterShape.Aux[Rep5, Data5, Target5, RepCol, EncoderDataCol, DecoderDataCol]
    , shape6: FormatterShape.Aux[Rep6, Data6, Target6, RepCol, EncoderDataCol, DecoderDataCol]
    , shape7: FormatterShape.Aux[Rep7, Data7, Target7, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper7[
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
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper7[
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
    ], RepCol, EncoderDataCol, DecoderDataCol] {
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
        base: => CaseClassRepMapper7[
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
        CaseClassMapper
          .inputRep(
              rep1 = shape1.wrapRep(base.rep1)
            , rep2 = shape2.wrapRep(base.rep2)
            , rep3 = shape3.wrapRep(base.rep3)
            , rep4 = shape4.wrapRep(base.rep4)
            , rep5 = shape5.wrapRep(base.rep5)
            , rep6 = shape6.wrapRep(base.rep6)
            , rep7 = shape7.wrapRep(base.rep7)
          )
          .withDataType[
              Data1
            , Data2
            , Data3
            , Data4
            , Data5
            , Data6
            , Data7
          ]
      }
      override def buildRep(
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
        val rep7 = shape7.buildRep(base.rep7, rep8)
        val rep6 = shape6.buildRep(base.rep6, rep7)
        val rep5 = shape5.buildRep(base.rep5, rep6)
        val rep4 = shape4.buildRep(base.rep4, rep5)
        val rep3 = shape3.buildRep(base.rep3, rep4)
        val rep2 = shape2.buildRep(base.rep2, rep3)
        val rep1 = shape1.buildRep(base.rep1, rep2)
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
        oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data8 = oldData
        val data7 = shape7.buildData(data.data7, rep.rep7, data8)
        val data6 = shape6.buildData(data.data6, rep.rep6, data7)
        val data5 = shape5.buildData(data.data5, rep.rep5, data6)
        val data4 = shape4.buildData(data.data4, rep.rep4, data5)
        val data3 = shape3.buildData(data.data3, rep.rep3, data4)
        val data2 = shape2.buildData(data.data2, rep.rep2, data3)
        val data1 = shape1.buildData(data.data1, rep.rep1, data2)
        data1
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
        oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper7[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol
        val split1   = shape1.takeData(rep.rep1, dataCol0)
        val split2   = shape2.takeData(rep.rep2, split1.left)
        val split3   = shape3.takeData(rep.rep3, split2.left)
        val split4   = shape4.takeData(rep.rep4, split3.left)
        val split5   = shape5.takeData(rep.rep5, split4.left)
        val split6   = shape6.takeData(rep.rep6, split5.left)
        val split7   = shape7.takeData(rep.rep7, split6.left)
        SplitData(
            current = new CaseClassDataMapper7(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
          )
          , left = split7.left
        )
      }
    }
  }
}
