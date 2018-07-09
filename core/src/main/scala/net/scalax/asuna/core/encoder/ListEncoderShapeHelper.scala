package net.scalax.asuna.shape

import net.scalax.asuna.core._
import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup }

trait ListEncoderShapeHelper {

  implicit def listDateShapeExt[A, B, C, D](implicit shape: EncoderShape[A, B, C, D]): EncoderShape[List[A], List[B], List[C], D] = {
    new EncoderShape[List[A], List[B], List[C], D] { self =>
      override def wrapRep(base: List[A]): List[C] = base.map(shape.wrapRep)
      override def toLawRep(base: List[C]): DataRepGroup[D] = {
        val l = base.map(shape.toLawRep)
        DataRepGroup(reps = l.flatMap(_.reps))
      }
      override def buildData(data: List[B], rep: List[C]): DataGroup = {
        val l = rep.zip(data).flatMap {
          case (eachRep, d) =>
            shape.buildData(d, eachRep).items
        }
        DataGroup(l)
      }
    }
  }

}