package net.scalax.asuna.mapper.common

import net.scalax.asuna.core.common.{++::, RNil, RepGroup, RepGroupContent}

trait RepGroupColumnWrapper[-Col, Data, ColumnInfoType] {

  type Target

  @inline def inputColumn(rep: => Col, columnInfo: ColumnInfoType, defaultValue: => Data): Target

}

object RepGroupColumnWrapper extends RepGroupColumnWrapperImplicit1 {
  type Aux[-Col, Data, ColumnInfoType, T] = RepGroupColumnWrapper[Col, Data, ColumnInfoType] { type Target = T }

  def input[Data](columnInfo: String): ColInfoWrap[Data, String]             = new ColInfoWrap[Data, String](columnInfo)
  def input[Data](columnInfo: List[String]): ColInfoWrap[Data, List[String]] = new ColInfoWrap[Data, List[String]](columnInfo)

  class ColInfoWrap[Data, ColType](val columnInfo: ColType) extends AnyVal {
    def withDefault[Col, T](rep: => Col, defaultValue: => Data)(
        implicit w: RepGroupColumnWrapper.Aux[Col, Data, ColType, T]
    ): T = w.inputColumn(rep = rep, columnInfo = columnInfo, defaultValue = defaultValue)

    def withDefault[Col, T](rep: => Col)(
        implicit w: RepGroupColumnNonDefaultWrapper.Aux[Col, Data, ColType, T]
    ): T = w.inputColumn(rep = rep, columnInfo = columnInfo)
  }

}

trait RepGroupColumnWrapperImplicit1 extends RepGroupColumnWrapperImplicit2 {

  implicit def rnilRepGroupColumnImplicit1[Data]: RepGroupColumnWrapper.Aux[RepGroup[RNil], Data, String, RepGroup[RNil]] =
    new RepGroupColumnWrapper[RepGroup[RNil], Data, String] {
      override type Target = RepGroup[RNil]
      @inline override def inputColumn(rep: => RepGroup[RNil], columnInfo: String, defaultValue: => Data): RepGroup[RNil] =
        rep
    }

  implicit def rnilRepGroupColumnImplicit2[Data]: RepGroupColumnWrapper.Aux[RepGroup[RNil], Data, List[String], RepGroup[RNil]] =
    new RepGroupColumnWrapper[RepGroup[RNil], Data, List[String]] {
      override type Target = RepGroup[RNil]
      @inline override def inputColumn(
          rep: => RepGroup[RNil]
        , columnInfo: List[String]
        , defaultValue: => Data
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
        , defaultValue: => Data
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
        , defaultValue: => Data
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
    : RepGroupColumnWrapper.Aux[SingleRepContentWithDefault[Col, Data], Data, String, SingleRepContentWithDefault[Col, Data]] =
    new RepGroupColumnWrapper[SingleRepContentWithDefault[Col, Data], Data, String] {
      override type Target = SingleRepContentWithDefault[Col, Data]
      @inline override def inputColumn(
          rep: => SingleRepContentWithDefault[Col, Data]
        , columnInfo: String
        , defaultValue: => Data
      ): SingleRepContentWithDefault[Col, Data] = rep
    }

  implicit def repGroupRepGroupColumnImplicit2[Col, Data, Rep]
    : RepGroupColumnWrapper.Aux[SingleRepContentWithNonDefault[Col, Data], Data, String, SingleRepContentWithNonDefault[Col, Data]] =
    new RepGroupColumnWrapper[SingleRepContentWithNonDefault[Col, Data], Data, String] {
      override type Target = SingleRepContentWithNonDefault[Col, Data]
      @inline override def inputColumn(
          rep: => SingleRepContentWithNonDefault[Col, Data]
        , columnInfo: String
        , defaultValue: => Data
      ): SingleRepContentWithNonDefault[Col, Data] = rep
    }

  implicit def repGroupRepGroupColumnImplicit3[Col, Data, Rep]
    : RepGroupColumnWrapper.Aux[MutiplyRepContentWithDefault[Col, Data], Data, List[String], MutiplyRepContentWithDefault[Col, Data]] =
    new RepGroupColumnWrapper[MutiplyRepContentWithDefault[Col, Data], Data, List[String]] {
      override type Target = MutiplyRepContentWithDefault[Col, Data]
      @inline override def inputColumn(
          rep: => MutiplyRepContentWithDefault[Col, Data]
        , columnInfo: List[String]
        , defaultValue: => Data
      ): MutiplyRepContentWithDefault[Col, Data] = rep
    }

  implicit def repGroupRepGroupColumnImplicit4[Col, Data, Rep]
    : RepGroupColumnWrapper.Aux[MutiplyRepContentWithNonDefault[Col, Data], Data, List[String], MutiplyRepContentWithNonDefault[Col, Data]] =
    new RepGroupColumnWrapper[MutiplyRepContentWithNonDefault[Col, Data], Data, List[String]] {
      override type Target = MutiplyRepContentWithNonDefault[Col, Data]
      @inline override def inputColumn(
          rep: => MutiplyRepContentWithNonDefault[Col, Data]
        , columnInfo: List[String]
        , defaultValue: => Data
      ): MutiplyRepContentWithNonDefault[Col, Data] = rep
    }

}

trait RepGroupColumnWrapperImplicit3 {

  implicit def commonRepGroupColumnImplicit1[Col, Data, Rep]: RepGroupColumnWrapper.Aux[Col, Data, String, SingleRepContentWithDefault[Col, Data]] =
    new RepGroupColumnWrapper[Col, Data, String] {
      override type Target = SingleRepContentWithDefault[Col, Data]
      @inline override def inputColumn(repCol: => Col, columnInfo: String, default: => Data): SingleRepContentWithDefault[Col, Data] =
        new SingleRepContentWithDefault[Col, Data] {
          override def rep             = repCol
          override val singleModelName = columnInfo
          override def defaultValue    = default
        }
    }

  implicit def commonRepGroupColumnImplicit2[Col, Data, Rep]: RepGroupColumnWrapper.Aux[Col, Data, List[String], MutiplyRepContentWithDefault[Col, Data]] =
    new RepGroupColumnWrapper[Col, Data, List[String]] {
      override type Target = MutiplyRepContentWithDefault[Col, Data]
      @inline override def inputColumn(repCol: => Col, columnInfo: List[String], default: => Data): MutiplyRepContentWithDefault[Col, Data] =
        new MutiplyRepContentWithDefault[Col, Data] {
          override def rep              = repCol
          override val mutiplyModelName = columnInfo
          override def defaultValue     = default
        }
    }

}
