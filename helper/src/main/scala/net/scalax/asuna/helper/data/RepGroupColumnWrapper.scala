package net.scalax.asuna.helper.data.macroImpl

import net.scalax.asuna.core.common.{++::, RNil, RepGroup, RepGroupContent}
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.encoder.HListEncoderShapeWrap

trait RepGroupColumnWrapper[Col, Data] {

  type Target

  def inputColumn(rep: Col, columnInfo: MacroColumnInfo): Target

}

object RepGroupColumnWrapper extends RepGroupColumnWrapperImplicit1 {
  type Aux[Col, Data, T] = RepGroupColumnWrapper[Col, Data] { type Target = T }
}

trait RepGroupColumnWrapperImplicit1 extends RepGroupColumnWrapperImplicit2 {

  implicit def rnilRepGroupColumnImplicit[Data]: RepGroupColumnWrapper.Aux[RepGroup[RNil], Data, RepGroup[RNil]] = new RepGroupColumnWrapper[RepGroup[RNil], Data] {
    override type Target = RepGroup[RNil]
    override def inputColumn(rep: RepGroup[RNil], columnInfo: MacroColumnInfo): RepGroup[RNil] = {
      rep
    }
  }

  implicit def rmultiplyRepGroupColumnImplicit[NewHead, NewTail <: RepGroupContent, Data, TargetHead, TargetTail <: RepGroupContent](
      implicit
    head: RepGroupColumnWrapper.Aux[NewHead, Data, TargetHead]
    , tail: RepGroupColumnWrapper.Aux[RepGroup[NewTail], Data, RepGroup[TargetTail]]
  ): RepGroupColumnWrapper.Aux[RepGroup[NewHead ++:: NewTail], Data, RepGroup[TargetHead ++:: TargetTail]] = new RepGroupColumnWrapper[RepGroup[NewHead ++:: NewTail], Data] {
    override type Target = RepGroup[TargetHead ++:: TargetTail]
    override def inputColumn(rep: RepGroup[NewHead ++:: NewTail], columnInfo: MacroColumnInfo): RepGroup[TargetHead ++:: TargetTail] = {
      val h ++:: t    = rep.repCol
      val columnInfo1 = columnInfo
      new RepGroup[TargetHead ++:: TargetTail] {
        override val repCol = ++::.apply(
            head.inputColumn(h, columnInfo1)
          , tail
            .inputColumn(new RepGroup[NewTail] {
              override val repCol = t
            }, columnInfo1)
            .repCol
        )
      }
    }
  }

}

trait RepGroupColumnWrapperImplicit2 {

  implicit def commonRepGroupColumnImplicit[Col, Data, Rep]: RepGroupColumnWrapper.Aux[Col, Data, HListEncoderShapeWrap[Col, Data]] = new RepGroupColumnWrapper[Col, Data] {
    override type Target = HListEncoderShapeWrap[Col, Data]
    override def inputColumn(rep: Col, columnInfo: MacroColumnInfo): HListEncoderShapeWrap[Col, Data] = {
      val rep1        = rep
      val columnInfo1 = columnInfo
      new HListEncoderShapeWrap[Col, Data] {
        override val rep        = rep1
        override val columnInfo = columnInfo1
      }
    }
  }

}
