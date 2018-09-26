package net.scalax.asuna.core.formatter.impl

import net.scalax.asuna.core.decoder.SplitData
import net.scalax.asuna.core.formatter.FormatterShape

trait ListFormatterShapeImplicit {

  implicit def listDateShapeExt[A, B, C, RepCol, EncoderDataCol, DecoderDataCol](
      implicit shape: FormatterShape.Aux[A, B, C, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[List[A], List[B], List[C], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[List[A], RepCol, EncoderDataCol, DecoderDataCol] {
      self =>
      override type Target = List[C]
      override type Data   = List[B]
      override def wrapRep(base: List[A]): List[C] = base.map(shape.wrapRep)
      override def toLawRep(base: List[C], oldRep: RepCol): RepCol = base.foldLeft(oldRep) { (rep, item) =>
        shape.toLawRep(item, rep)
      }
      override def takeData(rep: List[C], oldData: DecoderDataCol): SplitData[List[B], DecoderDataCol] = {
        rep.foldLeft(SplitData(List.empty[B], oldData)) { (splitData, rep) =>
          val newSplit = shape.takeData(rep, splitData.left)
          SplitData(newSplit.current :: splitData.current, newSplit.left)
        }
      }

      override def buildData(data: List[B], rep: List[C], oldData: EncoderDataCol): EncoderDataCol = {
        rep
          .foldLeft((data, oldData)) {
            case ((eachDataList, list), eachRep) =>
              (eachDataList.tail, shape.buildData(eachDataList.head, eachRep, list))
          }
          ._2
      }
    }
  }

}
