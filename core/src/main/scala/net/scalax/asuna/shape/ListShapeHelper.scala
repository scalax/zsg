package net.scalax.asuna.shape

import net.scalax.asuna.core._
import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup }

trait ListShapeHelper {

  implicit def listDateShapeExt[A, B, C, D](implicit shape: DataShape[A, B, C, D]): DataShape[List[A], List[B], List[C], D] = {
    new DataShape[List[A], List[B], List[C], D] { self =>
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