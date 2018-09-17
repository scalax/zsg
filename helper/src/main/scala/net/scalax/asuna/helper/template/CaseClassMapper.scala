package net.scalax.asuna.helper.mapper
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import net.scalax.asuna.helper.decoder.macroImpl.PropertyType
import net.scalax.asuna.helper.data.macroImpl.DataGenWrap
import net.scalax.asuna.helper.data.macroImpl.RepGroupColumnWrapper
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
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1]
    , wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Target2]
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
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1]
    , wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Target2]
    , wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Target3]
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
    wrap1: RepGroupColumnWrapper.Aux[Rep1, Data1, Target1]
    , wrap2: RepGroupColumnWrapper.Aux[Rep2, Data2, Target2]
    , wrap3: RepGroupColumnWrapper.Aux[Rep3, Data3, Target3]
    , wrap4: RepGroupColumnWrapper.Aux[Rep4, Data4, Target4]
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
}
trait CaseClassDataMapperHelper
object CaseClassDataMapperHelper {}
class CaseClassRepMapper1[
    Rep1
  , Data1
](
    val rep1: Rep1
  , val property1: PropertyType[Data1]
) {}
class CaseClassDataMapper1[
    Data1
](
    val data1: Data1
)
object CaseClassHelper1 {
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
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep2 = oldRep
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def buildData(
          data: CaseClassDataMapper1[
            Data1
        ]
        , rep: CaseClassRepMapper1[
            Target1
          , Data1
        ]
        , oldData: DataCol
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
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep2 = oldRep
        val rep1 = shape1.value.toLawRep(base.rep1, rep2)
        rep1
      }
      override def takeData(
          rep: CaseClassRepMapper1[
            Target1
          , Data1
        ]
        , oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper1[
          Data1
      ], DataCol] = {
        val dataCol0                   = oldDataCol
        val SplitData(item1, dataCol1) = shape1.value.takeData(rep.rep1, dataCol0)
        SplitData(
            current = new CaseClassDataMapper1(
              data1 = item1
          )
          , left = dataCol1
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
) {}
class CaseClassDataMapper2[
    Data1
  , Data2
](
    val data1: Data1
  , val data2: Data2
)
object CaseClassHelper2 {
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
        ]
        , oldRep: RepCol
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
        ]
        , rep: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ]
        , oldData: DataCol
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
        ]
        , oldRep: RepCol
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
        ]
        , oldDataCol: DataCol
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
          )
          , left = dataCol2
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
) {}
class CaseClassDataMapper3[
    Data1
  , Data2
  , Data3
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
)
object CaseClassHelper3 {
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
        ]
        , oldRep: RepCol
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
        ]
        , rep: CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ]
        , oldData: DataCol
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
        ]
        , oldRep: RepCol
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
        ]
        , oldDataCol: DataCol
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
          )
          , left = dataCol3
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
) {}
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
object CaseClassHelper4 {
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
        ]
        , oldRep: RepCol
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
        ]
        , rep: CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ]
        , oldData: DataCol
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
        ]
        , oldRep: RepCol
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
        ]
        , oldDataCol: DataCol
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
          )
          , left = dataCol4
        )
      }
    }
  }
}
