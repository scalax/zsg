package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.mapper.decoder.DecoderInputTable
import net.scalax.asuna.mapper.decoder.macroImpl.DecoderCaseClassMapper

import scala.language.experimental.macros

trait DecoderBlackBoxInputTable {
  implicit def decoderDataGenImplicit[Table, Input, Output, Unused]: DecoderBlackBoxInputTable.Aux[DecoderBlackBoxInputTable, Table, Input, Output, Unused] =
    macro DecoderCaseClassMapper.BlackboxDecoderCaseClassMapperImpl
      .caseclassDecoderGeneric[DecoderBlackBoxInputTable, Table, Input, Output, Unused, Any, Nothing]
}

object DecoderBlackBoxInputTable extends DecoderBlackBoxInputTable {

  type Aux[Poly, Table, Input, Output, Unused] = DecoderInputTable[Poly, Table, Input, Output, Unused] { type TempRep = Any; type TempData = Nothing }

}
