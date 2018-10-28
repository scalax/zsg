package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.mapper.encoder.macroImpl.EncoderCaseClassMapper

import scala.language.experimental.macros

trait EncoderBlackBoxInputTable {
  implicit def encoderDataGenImplicit[Table, Input, Output, Unused]: EncoderBlackBoxInputTable.Aux[EncoderBlackBoxInputTable, Table, Input, Output, Unused] =
    macro EncoderCaseClassMapper.BlackboxEncoderCaseClassMapperImpl.caseclassEncoderGeneric[EncoderBlackBoxInputTable, Input, Output, Unused, Table, Any, Any]
}

object EncoderBlackBoxInputTable extends EncoderBlackBoxInputTable {

  type Aux[Poly, Table, Input, Output, Unused] = EncoderInputTable[Poly, Table, Input, Output, Unused] { type TempRep = Any; type TempData = Any }

}
