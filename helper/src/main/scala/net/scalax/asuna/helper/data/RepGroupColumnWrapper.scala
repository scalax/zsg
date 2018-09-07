package net.scalax.asuna.helper.data.macroImpl

import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.encoder.HListEncoderShapeWrap

trait RepGroupColumnWrapper[Col, Data] {

  type Target

  def inputColumn(rep: Col, columnInfo: MacroColumnInfo): Target

}

object RepGroupColumnWrapper extends RepGroupColumnWrapperImplicit1 with RepGroupColumnWrapperImplicit2 {
  type Aux[Col, Data, T] = RepGroupColumnWrapper[Col, Data] { type Target = T }
}

trait RepGroupColumnWrapperImplicit1 {

}

trait RepGroupColumnWrapperImplicit2 {

  implicit def commonRepGroupColumnImplicit[Col, Data, Rep]: RepGroupColumnWrapper.Aux[Col, Data, HListEncoderShapeWrap[Col, Data]] = new RepGroupColumnWrapper[Col, Data] {
    override type Target = HListEncoderShapeWrap[Col, Data]
    override def inputColumn(rep: Col, columnInfo: MacroColumnInfo): HListEncoderShapeWrap[Col, Data] = {
      val rep1 = rep
      val columnInfo1 = columnInfo
      new HListEncoderShapeWrap[Col, Data] {
        override val rep = rep1
        override val columnInfo = columnInfo1
      }
    }
  }

}