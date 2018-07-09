package net.scalax.asuna.core.decoder.impl

import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup }
import net.scalax.asuna.core.decoder.{ DecoderShape, SplitData }

trait ListDecoderShapeImplicit {

  implicit def listDateShapeExt[A, B, C, D](implicit shape: DecoderShape[A, B, C, D]): DecoderShape[List[A], List[B], List[C], D] = {
    new DecoderShape[List[A], List[B], List[C], D] { self =>
      override def wrapRep(base: List[A]): List[C] = base.map(shape.wrapRep)
      override def toLawRep(base: List[C]): DataRepGroup[D] = {
        val l = base.map(shape.toLawRep)
        DataRepGroup(reps = l.flatMap(_.reps))
      }
      override def takeData(oldData: DataGroup, rep: List[C]): SplitData[List[B]] = {
        rep.foldLeft(
          SplitData(current = List.empty[B], left = oldData)) {
            case (SplitData(splCurrent, splLeft), eachRep) =>
              val SplitData(currentData, currentLeft) = shape.takeData(splLeft, eachRep)
              SplitData(current = currentData :: splCurrent, left = currentLeft)
          }
      }
    }
  }

}