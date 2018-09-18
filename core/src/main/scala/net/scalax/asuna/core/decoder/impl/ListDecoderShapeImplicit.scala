package net.scalax.asuna.core.decoder.impl

import net.scalax.asuna.core.decoder.{DecoderShape, SplitData}

trait ListDecoderShapeImplicit {

  implicit def listDateShapeExt[A, B, C, RepCol, DataCol](
      implicit shape: DecoderShape.Aux[A, B, C, RepCol, DataCol]
  ): DecoderShape.Aux[List[A], List[B], List[C], RepCol, DataCol] = {
    new DecoderShape[List[A], RepCol, DataCol] {
      self =>
      override type Target = List[C]
      override type Data   = List[B]
      override def wrapRep(base: List[A]): List[C] = base.map(shape.wrapRep)
      override def toLawRep(base: List[C], oldRep: RepCol): RepCol = base.foldLeft(oldRep) { (rep, item) =>
        shape.toLawRep(item, rep)
      }
      override def takeData(rep: List[C], oldData: DataCol): SplitData[List[B], DataCol] = {
        rep.foldLeft(SplitData(List.empty[B], oldData)) { (splitData, rep) =>
          val newSplit = shape.takeData(rep, splitData.left)
          SplitData(newSplit.current :: splitData.current, newSplit.left)
        }
      }
    }
  }

}
