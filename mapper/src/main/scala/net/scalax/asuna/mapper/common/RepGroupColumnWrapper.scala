package net.scalax.asuna.mapper.common

import net.scalax.asuna.core.common.{++::, RNil, RepGroup, RepGroupContent}

trait RepGroupColumnWrapper[-Col, Data, ColumnInfoType] {

  type Target

  @inline def inputColumn(rep: => Col, columnInfo: ColumnInfoType, defaultValue: => Option[Data]): Target

}

object RepGroupColumnWrapper extends RepGroupColumnWrapperImplicit1 {
  type Aux[-Col, Data, ColumnInfoType, T] = RepGroupColumnWrapper[Col, Data, ColumnInfoType] { type Target = T }
}

trait RepGroupColumnWrapperImplicit1 extends RepGroupColumnWrapperImplicit2 {

  implicit def rnilRepGroupColumnImplicit1[Data]: RepGroupColumnWrapper.Aux[RepGroup[RNil], Data, String, RepGroup[RNil]] =
    new RepGroupColumnWrapper[RepGroup[RNil], Data, String] {
      override type Target = RepGroup[RNil]
      @inline override def inputColumn(rep: => RepGroup[RNil], columnInfo: String, defaultValue: => Option[Data]): RepGroup[RNil] = rep
    }

  implicit def rnilRepGroupColumnImplicit2[Data]: RepGroupColumnWrapper.Aux[RepGroup[RNil], Data, List[String], RepGroup[RNil]] =
    new RepGroupColumnWrapper[RepGroup[RNil], Data, List[String]] {
      override type Target = RepGroup[RNil]
      @inline override def inputColumn(
          rep: => RepGroup[RNil]
        , columnInfo: List[String]
        , defaultValue: => Option[Data]
      ): RepGroup[RNil] = rep
    }

  implicit def rmultiplyRepGroupColumnImplicit1[NewHead, NewTail <: RepGroupContent, Data, TargetHead, TargetTail <: RepGroupContent](
      implicit
    head: RepGroupColumnWrapper.Aux[NewHead, Data, String, TargetHead]
    , tail: RepGroupColumnWrapper.Aux[RepGroup[NewTail], Data, String, RepGroup[TargetTail]]
  ): RepGroupColumnWrapper.Aux[RepGroup[NewHead ++:: NewTail], Data, String, RepGroup[TargetHead ++:: TargetTail]] =
    new RepGroupColumnWrapper[RepGroup[NewHead ++:: NewTail], Data, String] {
      override type Target = RepGroup[TargetHead ++:: TargetTail]
      @inline override def inputColumn(
          rep: => RepGroup[NewHead ++:: NewTail]
        , columnInfo1: String
        , defaultValue: => Option[Data]
      ): RepGroup[TargetHead ++:: TargetTail] = {
        val h = rep.repCol.head
        val t = rep.repCol.tail
        new RepGroup[TargetHead ++:: TargetTail] {
          override val repCol = ++::.apply(
              head.inputColumn(h, columnInfo = columnInfo1, defaultValue)
            , tail
              .inputColumn(new RepGroup[NewTail] {
                override val repCol = t
              }, columnInfo = columnInfo1, defaultValue)
              .repCol
          )
        }
      }

    }

  implicit def rmultiplyRepGroupColumnImplicit2[NewHead, NewTail <: RepGroupContent, Data, TargetHead, TargetTail <: RepGroupContent](
      implicit
    head: RepGroupColumnWrapper.Aux[NewHead, Data, List[String], TargetHead]
    , tail: RepGroupColumnWrapper.Aux[RepGroup[NewTail], Data, List[String], RepGroup[TargetTail]]
  ): RepGroupColumnWrapper.Aux[RepGroup[NewHead ++:: NewTail], Data, List[String], RepGroup[TargetHead ++:: TargetTail]] =
    new RepGroupColumnWrapper[RepGroup[NewHead ++:: NewTail], Data, List[String]] {
      override type Target = RepGroup[TargetHead ++:: TargetTail]
      @inline override def inputColumn(
          rep: => RepGroup[NewHead ++:: NewTail]
        , columnInfo1: List[String]
        , defaultValue: => Option[Data]
      ): RepGroup[TargetHead ++:: TargetTail] = {
        val h = rep.repCol.head
        val t = rep.repCol.tail
        new RepGroup[TargetHead ++:: TargetTail] {
          override val repCol = ++::.apply(
              head.inputColumn(h, columnInfo = columnInfo1, defaultValue)
            , tail
              .inputColumn(new RepGroup[NewTail] {
                override val repCol = t
              }, columnInfo = columnInfo1, defaultValue)
              .repCol
          )
        }
      }

    }

}

trait RepGroupColumnWrapperImplicit2 extends RepGroupColumnWrapperImplicit3 {

  implicit def repGroupRepGroupColumnImplicit1[Col, Data, Rep]
    : RepGroupColumnWrapper.Aux[SingleRepContent[Col, Data], Data, String, SingleRepContent[Col, Data]] =
    new RepGroupColumnWrapper[SingleRepContent[Col, Data], Data, String] {
      override type Target = SingleRepContent[Col, Data]
      @inline override def inputColumn(
          rep: => SingleRepContent[Col, Data]
        , columnInfo: String
        , defaultValue: => Option[Data]
      ): SingleRepContent[Col, Data] =
        rep

    }

  implicit def repGroupRepGroupColumnImplicit2[Col, Data, Rep]
    : RepGroupColumnWrapper.Aux[MutiplyRepContent[Col, Data], Data, List[String], MutiplyRepContent[Col, Data]] =
    new RepGroupColumnWrapper[MutiplyRepContent[Col, Data], Data, List[String]] {
      override type Target = MutiplyRepContent[Col, Data]
      @inline override def inputColumn(
          rep: => MutiplyRepContent[Col, Data]
        , columnInfo: List[String]
        , defaultValue: => Option[Data]
      ): MutiplyRepContent[Col, Data] = rep

    }

}

trait RepGroupColumnWrapperImplicit3 {

  implicit def commonRepGroupColumnImplicit1[Col, Data, Rep]: RepGroupColumnWrapper.Aux[Col, Data, String, SingleRepContent[Col, Data]] =
    new RepGroupColumnWrapper[Col, Data, String] {
      override type Target = SingleRepContent[Col, Data]
      @inline override def inputColumn(rep: => Col, columnInfo: String, defaultValue: => Option[Data]): SingleRepContent[Col, Data] =
        new impl.SingleRepContentImpl[Col, Data](repCol = rep, singleModelName = columnInfo, default = defaultValue)
    }

  implicit def commonRepGroupColumnImplicit2[Col, Data, Rep]: RepGroupColumnWrapper.Aux[Col, Data, List[String], MutiplyRepContent[Col, Data]] =
    new RepGroupColumnWrapper[Col, Data, List[String]] {
      override type Target = MutiplyRepContent[Col, Data]
      @inline override def inputColumn(
          rep: => Col
        , columnInfo: List[String]
        , defaultValue: => Option[Data]
      ): MutiplyRepContent[Col, Data] =
        new impl.MutiplyRepContentImpl[Col, Data](repCol = rep, mutiplyModelName = columnInfo, default = defaultValue)
    }

}
