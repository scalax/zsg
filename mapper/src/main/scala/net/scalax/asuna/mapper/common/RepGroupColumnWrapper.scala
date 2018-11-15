package net.scalax.asuna.mapper.common

import net.scalax.asuna.core.common.{++::, RNil, RepGroup, RepGroupContent}

trait RepGroupColumnWrapper[-Col, Data, ColumnInfoType <: MacroColumnInfo] {

  type Target

  @inline def inputColumn(rep: => Col, columnInfo: ColumnInfoType, defaultValue: => Option[Data]): Target

}

object RepGroupColumnWrapper extends RepGroupColumnWrapperImplicit1 {
  type Aux[-Col, Data, ColumnInfoType <: MacroColumnInfo, T] = RepGroupColumnWrapper[Col, Data, ColumnInfoType] { type Target = T }

  /*@inline def apply[Col, Data, ColumnInfoType <: MacroColumnInfo, Target](
      rep: => Col
    , columnInfo: ColumnInfoType
    , propertyType: PropertyType[Data]
  )(implicit repGroupColumnWrapper: RepGroupColumnWrapper.Aux[Col, Data, ColumnInfoType, Target]): Target = {
    repGroupColumnWrapper.inputColumn(rep, columnInfo, Option.empty)
  }

  @inline def apply[Col, Data, ColumnInfoType <: MacroColumnInfo, Target](
      rep: => Col
    , columnInfo: ColumnInfoType
    , propertyType: PropertyType[Data]
    , defaultValue: => Data
  )(implicit repGroupColumnWrapper: RepGroupColumnWrapper.Aux[Col, Data, ColumnInfoType, Target]): Target = {
    repGroupColumnWrapper.inputColumn(rep, columnInfo, Option(defaultValue))
  }*/

}

trait RepGroupColumnWrapperImplicit1 extends RepGroupColumnWrapperImplicit2 {

  implicit def rnilRepGroupColumnImplicit1[Data]: RepGroupColumnWrapper.Aux[RepGroup[RNil], Data, SingleColumnInfo, RepGroup[RNil]] =
    new RepGroupColumnWrapper[RepGroup[RNil], Data, SingleColumnInfo] {
      override type Target = RepGroup[RNil]
      @inline override def inputColumn(rep: => RepGroup[RNil], columnInfo: SingleColumnInfo, defaultValue: => Option[Data]): RepGroup[RNil] = rep
    }

  implicit def rnilRepGroupColumnImplicit2[Data]: RepGroupColumnWrapper.Aux[RepGroup[RNil], Data, MutiplyColumnInfo, RepGroup[RNil]] =
    new RepGroupColumnWrapper[RepGroup[RNil], Data, MutiplyColumnInfo] {
      override type Target = RepGroup[RNil]
      @inline override def inputColumn(rep: => RepGroup[RNil], columnInfo: MutiplyColumnInfo, defaultValue: => Option[Data]): RepGroup[RNil] = rep
    }

  implicit def rmultiplyRepGroupColumnImplicit1[NewHead, NewTail <: RepGroupContent, Data, TargetHead, TargetTail <: RepGroupContent](
      implicit
    head: RepGroupColumnWrapper.Aux[NewHead, Data, SingleColumnInfo, TargetHead]
    , tail: RepGroupColumnWrapper.Aux[RepGroup[NewTail], Data, SingleColumnInfo, RepGroup[TargetTail]]
  ): RepGroupColumnWrapper.Aux[RepGroup[NewHead ++:: NewTail], Data, SingleColumnInfo, RepGroup[TargetHead ++:: TargetTail]] =
    new RepGroupColumnWrapper[RepGroup[NewHead ++:: NewTail], Data, SingleColumnInfo] {
      override type Target = RepGroup[TargetHead ++:: TargetTail]
      @inline override def inputColumn(
          rep: => RepGroup[NewHead ++:: NewTail]
        , columnInfo1: SingleColumnInfo
        , defaultValue: => Option[Data]
      ): RepGroup[TargetHead ++:: TargetTail] = {
        val h = rep.repCol.head
        val t = rep.repCol.tail
        new RepGroup[TargetHead ++:: TargetTail] {
          override val repCol = ++::.apply(
              head.inputColumn(h, columnInfo1, defaultValue)
            , tail
              .inputColumn(new RepGroup[NewTail] {
                override val repCol = t
              }, columnInfo1, defaultValue)
              .repCol
          )
        }
      }

    }

  implicit def rmultiplyRepGroupColumnImplicit2[NewHead, NewTail <: RepGroupContent, Data, TargetHead, TargetTail <: RepGroupContent](
      implicit
    head: RepGroupColumnWrapper.Aux[NewHead, Data, MutiplyColumnInfo, TargetHead]
    , tail: RepGroupColumnWrapper.Aux[RepGroup[NewTail], Data, MutiplyColumnInfo, RepGroup[TargetTail]]
  ): RepGroupColumnWrapper.Aux[RepGroup[NewHead ++:: NewTail], Data, MutiplyColumnInfo, RepGroup[TargetHead ++:: TargetTail]] =
    new RepGroupColumnWrapper[RepGroup[NewHead ++:: NewTail], Data, MutiplyColumnInfo] {
      override type Target = RepGroup[TargetHead ++:: TargetTail]
      @inline override def inputColumn(
          rep: => RepGroup[NewHead ++:: NewTail]
        , columnInfo1: MutiplyColumnInfo
        , defaultValue: => Option[Data]
      ): RepGroup[TargetHead ++:: TargetTail] = {
        val h = rep.repCol.head
        val t = rep.repCol.tail
        new RepGroup[TargetHead ++:: TargetTail] {
          override val repCol = ++::.apply(
              head.inputColumn(h, columnInfo1, defaultValue)
            , tail
              .inputColumn(new RepGroup[NewTail] {
                override val repCol = t
              }, columnInfo1, defaultValue)
              .repCol
          )
        }
      }

    }

}

trait RepGroupColumnWrapperImplicit2 extends RepGroupColumnWrapperImplicit3 {

  implicit def repGroupRepGroupColumnImplicit1[Col, Data, Rep]
    : RepGroupColumnWrapper.Aux[SingleRepContent[Col, Data], Data, SingleColumnInfo, SingleRepContent[Col, Data]] =
    new RepGroupColumnWrapper[SingleRepContent[Col, Data], Data, SingleColumnInfo] {
      override type Target = SingleRepContent[Col, Data]
      @inline override def inputColumn(
          rep: => SingleRepContent[Col, Data]
        , columnInfo: SingleColumnInfo
        , defaultValue: => Option[Data]
      ): SingleRepContent[Col, Data] =
        rep

    }

  implicit def repGroupRepGroupColumnImplicit2[Col, Data, Rep]
    : RepGroupColumnWrapper.Aux[MutiplyRepContent[Col, Data], Data, MutiplyColumnInfo, MutiplyRepContent[Col, Data]] =
    new RepGroupColumnWrapper[MutiplyRepContent[Col, Data], Data, MutiplyColumnInfo] {
      override type Target = MutiplyRepContent[Col, Data]
      @inline override def inputColumn(
          rep: => MutiplyRepContent[Col, Data]
        , columnInfo: MutiplyColumnInfo
        , defaultValue: => Option[Data]
      ): MutiplyRepContent[Col, Data] = rep

    }

}

trait RepGroupColumnWrapperImplicit3 {

  implicit def commonRepGroupColumnImplicit1[Col, Data, Rep]: RepGroupColumnWrapper.Aux[Col, Data, SingleColumnInfo, SingleRepContent[Col, Data]] =
    new RepGroupColumnWrapper[Col, Data, SingleColumnInfo] {
      override type Target = SingleRepContent[Col, Data]
      @inline override def inputColumn(rep1: => Col, columnInfo1: SingleColumnInfo, defaultValue1: => Option[Data]): SingleRepContent[Col, Data] =
        new SingleRepContent[Col, Data] {
          override def rep          = rep1
          override val columnInfo   = columnInfo1
          override def defaultValue = defaultValue1
        }
    }

  implicit def commonRepGroupColumnImplicit2[Col, Data, Rep]: RepGroupColumnWrapper.Aux[Col, Data, MutiplyColumnInfo, MutiplyRepContent[Col, Data]] =
    new RepGroupColumnWrapper[Col, Data, MutiplyColumnInfo] {
      override type Target = MutiplyRepContent[Col, Data]
      @inline override def inputColumn(rep1: => Col, columnInfo1: MutiplyColumnInfo, defaultValue1: => Option[Data]): MutiplyRepContent[Col, Data] =
        new MutiplyRepContent[Col, Data] {
          override def rep          = rep1
          override val columnInfo   = columnInfo1
          override def defaultValue = defaultValue1
        }
    }

}
