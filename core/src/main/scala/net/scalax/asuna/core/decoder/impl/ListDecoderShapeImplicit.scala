package org.scalax.asuna.core.decoder.impl

import org.scalax.asuna.core.decoder.{DecoderShape, SplitData}

trait ListDecoderShapeImplicit {

  implicit def listDateShapeExt[A, B, C, RepCol, DataCol](
      implicit shape: DecoderShape.Aux[A, B, C, RepCol, DataCol]
  ): DecoderShape.Aux[List[A], List[B], List[C], RepCol, DataCol] = {
    new DecoderShape[List[A], RepCol, DataCol] {
      self =>
      override type Target = List[C]
      override type Data   = List[B]
      override def wrapRep(base: => List[A]): List[C] = base.map(s => shape.wrapRep(s))
      override def buildRep(base: List[C], oldRep: RepCol): RepCol = base.foldLeft(oldRep) { (rep, item) =>
        shape.buildRep(item, rep)
      }
      override def takeData(rep: List[C], oldData: DataCol): SplitData[List[B], DataCol] = {
        rep.reverse.foldLeft(SplitData(List.empty[B], oldData)) { (splitData, rep) =>
          val newSplit = shape.takeData(rep, splitData.left)
          SplitData(newSplit.current :: splitData.current, newSplit.left)
        }
      }
    }
  }

}
