package net.scalax.asuna.mapper.common

import net.scalax.asuna.core.common.{++::, RNil, RepGroup, RepGroupContent}
import net.scalax.asuna.mapper.Placeholder

trait RepGroupColumnNonDefaultWrapper[-Col, Data, ColumnInfoType] {
  type Target
  @inline def inputColumn(rep: => Col, columnInfo: ColumnInfoType): Target
}

object RepGroupColumnNonDefaultWrapper extends RepGroupColumnNonDefaultWrapperImplicit1 {
  type Aux[-Col, Data, ColumnInfoType, T] = RepGroupColumnNonDefaultWrapper[Col, Data, ColumnInfoType] { type Target = T }
}

trait RepGroupColumnNonDefaultWrapperImplicit1 extends RepGroupColumnNonDefaultWrapperImplicit2 {

  implicit def rnilRepGroupColumnImplicit1[Data]: RepGroupColumnNonDefaultWrapper.Aux[RepGroup[RNil], Data, String, RepGroup[RNil]] =
    new RepGroupColumnNonDefaultWrapper[RepGroup[RNil], Data, String] {
      override type Target = RepGroup[RNil]
      @inline override def inputColumn(rep: => RepGroup[RNil], columnInfo: String): RepGroup[RNil] = rep
    }

  implicit def rnilRepGroupColumnImplicit2[Data]: RepGroupColumnNonDefaultWrapper.Aux[RepGroup[RNil], Data, List[String], RepGroup[RNil]] =
    new RepGroupColumnNonDefaultWrapper[RepGroup[RNil], Data, List[String]] {
      override type Target = RepGroup[RNil]
      @inline override def inputColumn(
          rep: => RepGroup[RNil]
        , columnInfo: List[String]
      ): RepGroup[RNil] = rep
    }

  implicit def rmultiplyRepGroupColumnImplicit1[NewHead, NewTail <: RepGroupContent, Data, TargetHead, TargetTail <: RepGroupContent](
      implicit
    head: RepGroupColumnNonDefaultWrapper.Aux[NewHead, Data, String, TargetHead]
    , tail: RepGroupColumnNonDefaultWrapper.Aux[RepGroup[NewTail], Data, String, RepGroup[TargetTail]]
  ): RepGroupColumnNonDefaultWrapper.Aux[RepGroup[NewHead ++:: NewTail], Data, String, RepGroup[TargetHead ++:: TargetTail]] =
    new RepGroupColumnNonDefaultWrapper[RepGroup[NewHead ++:: NewTail], Data, String] {
      override type Target = RepGroup[TargetHead ++:: TargetTail]
      @inline override def inputColumn(
          rep: => RepGroup[NewHead ++:: NewTail]
        , columnInfo1: String
      ): RepGroup[TargetHead ++:: TargetTail] = {
        val h = rep.repCol.head
        val t = rep.repCol.tail
        new RepGroup[TargetHead ++:: TargetTail] {
          override val repCol = ++::.apply(
              head.inputColumn(h, columnInfo = columnInfo1)
            , tail
              .inputColumn(new RepGroup[NewTail] {
                override val repCol = t
              }, columnInfo = columnInfo1)
              .repCol
          )
        }
      }
    }

  implicit def rmultiplyRepGroupColumnImplicit2[NewHead, NewTail <: RepGroupContent, Data, TargetHead, TargetTail <: RepGroupContent](
      implicit
    head: RepGroupColumnNonDefaultWrapper.Aux[NewHead, Data, List[String], TargetHead]
    , tail: RepGroupColumnNonDefaultWrapper.Aux[RepGroup[NewTail], Data, List[String], RepGroup[TargetTail]]
  ): RepGroupColumnNonDefaultWrapper.Aux[RepGroup[NewHead ++:: NewTail], Data, List[String], RepGroup[TargetHead ++:: TargetTail]] =
    new RepGroupColumnNonDefaultWrapper[RepGroup[NewHead ++:: NewTail], Data, List[String]] {
      override type Target = RepGroup[TargetHead ++:: TargetTail]
      @inline override def inputColumn(
          rep: => RepGroup[NewHead ++:: NewTail]
        , columnInfo1: List[String]
      ): RepGroup[TargetHead ++:: TargetTail] = {
        val h = rep.repCol.head
        val t = rep.repCol.tail
        new RepGroup[TargetHead ++:: TargetTail] {
          override val repCol = ++::.apply(
              head.inputColumn(h, columnInfo = columnInfo1)
            , tail
              .inputColumn(new RepGroup[NewTail] {
                override val repCol = t
              }, columnInfo = columnInfo1)
              .repCol
          )
        }
      }
    }

}

trait RepGroupColumnNonDefaultWrapperImplicit2 extends RepGroupColumnNonDefaultWrapperImplicit3 {

  implicit def repGroupRepGroupColumnImplicit1[Col, Data, Rep]
    : RepGroupColumnNonDefaultWrapper.Aux[SingleRepContentWithDefault[Col, Data], Data, String, SingleRepContentWithDefault[Col, Data]] =
    new RepGroupColumnNonDefaultWrapper[SingleRepContentWithDefault[Col, Data], Data, String] {
      override type Target = SingleRepContentWithDefault[Col, Data]
      @inline override def inputColumn(rep: => SingleRepContentWithDefault[Col, Data], columnInfo: String): SingleRepContentWithDefault[Col, Data] = rep
    }

  implicit def repGroupRepGroupColumnImplicit2[Col, Data, Rep]
    : RepGroupColumnNonDefaultWrapper.Aux[SingleRepContentWithNonDefault[Col, Data], Data, String, SingleRepContentWithNonDefault[Col, Data]] =
    new RepGroupColumnNonDefaultWrapper[SingleRepContentWithNonDefault[Col, Data], Data, String] {
      override type Target = SingleRepContentWithNonDefault[Col, Data]
      @inline override def inputColumn(rep: => SingleRepContentWithNonDefault[Col, Data], columnInfo: String): SingleRepContentWithNonDefault[Col, Data] = rep
    }

  implicit def repGroupRepGroupColumnImplicit3[Col, Data, Rep]
    : RepGroupColumnNonDefaultWrapper.Aux[SingleName, Data, String, SingleRepContentWithNonDefault[Placeholder, Data]] =
    new RepGroupColumnNonDefaultWrapper[SingleName, Data, String] {
      override type Target = SingleRepContentWithNonDefault[Placeholder, Data]
      @inline override def inputColumn(rep1: => SingleName, columnInfo: String): SingleRepContentWithNonDefault[Placeholder, Data] = {
        new SingleRepContentWithNonDefault[Placeholder, Data] {
          override def rep             = Placeholder.value
          override val singleModelName = rep1.singleName
        }
      }
    }

  implicit def repGroupRepGroupColumnImplicit4[Col, Data, Rep]
    : RepGroupColumnNonDefaultWrapper.Aux[MutiplyRepContentWithDefault[Col, Data], Data, List[String], MutiplyRepContentWithDefault[Col, Data]] =
    new RepGroupColumnNonDefaultWrapper[MutiplyRepContentWithDefault[Col, Data], Data, List[String]] {
      override type Target = MutiplyRepContentWithDefault[Col, Data]
      @inline override def inputColumn(rep: => MutiplyRepContentWithDefault[Col, Data], columnInfo: List[String]): MutiplyRepContentWithDefault[Col, Data] = rep
    }

  implicit def repGroupRepGroupColumnImplicit5[Col, Data, Rep]
    : RepGroupColumnNonDefaultWrapper.Aux[MutiplyRepContentWithNonDefault[Col, Data], Data, List[String], MutiplyRepContentWithNonDefault[Col, Data]] =
    new RepGroupColumnNonDefaultWrapper[MutiplyRepContentWithNonDefault[Col, Data], Data, List[String]] {
      override type Target = MutiplyRepContentWithNonDefault[Col, Data]
      @inline override def inputColumn(
          rep: => MutiplyRepContentWithNonDefault[Col, Data]
        , columnInfo: List[String]
      ): MutiplyRepContentWithNonDefault[Col, Data] = rep
    }

  implicit def repGroupRepGroupColumnImplicit6[Col, Data, Rep]
    : RepGroupColumnNonDefaultWrapper.Aux[MultiplyName, Data, List[String], MutiplyRepContentWithNonDefault[Placeholder, Data]] =
    new RepGroupColumnNonDefaultWrapper[MultiplyName, Data, List[String]] {
      override type Target = MutiplyRepContentWithNonDefault[Placeholder, Data]
      @inline override def inputColumn(
          rep1: => MultiplyName
        , columnInfo: List[String]
      ): MutiplyRepContentWithNonDefault[Placeholder, Data] = new MutiplyRepContentWithNonDefault[Placeholder, Data] {
        override def rep = Placeholder.value
        override val mutiplyModelName = rep1.multiplyName
      }
    }

}

trait RepGroupColumnNonDefaultWrapperImplicit3 {

  implicit def commonRepGroupColumnImplicit1[Col, Data, Rep]
    : RepGroupColumnNonDefaultWrapper.Aux[Col, Data, String, SingleRepContentWithNonDefault[Col, Data]] =
    new RepGroupColumnNonDefaultWrapper[Col, Data, String] {
      override type Target = SingleRepContentWithNonDefault[Col, Data]
      @inline override def inputColumn(repCol: => Col, columnInfo: String): SingleRepContentWithNonDefault[Col, Data] =
        new SingleRepContentWithNonDefault[Col, Data] {
          override def rep             = repCol
          override val singleModelName = columnInfo
        }
    }

  implicit def commonRepGroupColumnImplicit2[Col, Data, Rep]
    : RepGroupColumnNonDefaultWrapper.Aux[Col, Data, List[String], MutiplyRepContentWithNonDefault[Col, Data]] =
    new RepGroupColumnNonDefaultWrapper[Col, Data, List[String]] {
      override type Target = MutiplyRepContentWithNonDefault[Col, Data]
      @inline override def inputColumn(repCol: => Col, columnInfo: List[String]): MutiplyRepContentWithNonDefault[Col, Data] =
        new MutiplyRepContentWithNonDefault[Col, Data] {
          override def rep              = repCol
          override val mutiplyModelName = columnInfo
        }
    }

}
