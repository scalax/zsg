package net.scalax.asuna.core.encoder.impl

import net.scalax.asuna.core.encoder.EncoderShape

trait ListEncoderShapeImplicit {

  implicit def listDateShapeExt[A, B, C, RepCol, DataCol](implicit shape: EncoderShape[A, B, C, RepCol, DataCol]): EncoderShape[List[A], List[B], List[C], RepCol, DataCol] = {
    new EncoderShape[List[A], List[B], List[C], RepCol, DataCol] { self =>
      override def wrapRep(base: List[A]): List[C] = base.map(shape.wrapRep)
      override def toLawRep(base: List[C], oldRep: RepCol): RepCol = {
        base.foldLeft(oldRep) { (old, each) =>
          shape.toLawRep(each, old)
        }
      }
      override def buildData(data: List[B], rep: List[C], oldData: DataCol): DataCol = {
        /*rep.zip(data).foldLeft(oldData) {
          case (old, (eachRep, eachData)) =>
            shape.buildData(eachData, eachRep, old)
        }*/
        rep.foldLeft((data, oldData)) {
          case ((eachDataList, list), eachRep) =>
            (eachDataList.tail, shape.buildData(eachDataList.head, eachRep, list))
        }._2
      }
    }
  }

}