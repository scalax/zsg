package net.scalax.asuna.core.encoder.impl

import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup }
import net.scalax.asuna.core.encoder.EncoderShape

trait ListEncoderShapeImplicit {

  implicit def listDateShapeExt[A, B, C, D](implicit shape: EncoderShape[A, B, C, D]): EncoderShape[List[A], List[B], List[C], D] = {
    new EncoderShape[List[A], List[B], List[C], D] { self =>
      override def wrapRep(base: List[A]): List[C] = base.map(shape.wrapRep)
      override def toLawRep(base: List[C], oldRep: List[D]): List[D] = {
        /*val l = base.map(shape.toLawRep)
        DataRepGroup(reps = l.flatMap(_.reps))*/
        base.foldLeft(oldRep) { (old, each) =>
          shape.toLawRep(each, old)
        }
      }
      override def buildData(data: List[B], rep: List[C], oldData: List[Any]): List[Any] = {
        /*val l = rep.zip(data).flatMap {
          case (eachRep, d) =>
            shape.buildData(d, eachRep).items
        }
        DataGroup(l)*/
        rep.zip(data).foldLeft(oldData) {
          case (old, (eachRep, eachData)) =>
            shape.buildData(eachData, eachRep, old)
        }
      }
    }
  }

}