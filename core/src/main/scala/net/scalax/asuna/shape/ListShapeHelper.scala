package net.scalax.asuna.shape

import net.scalax.asuna.core._

import scala.language.implicitConversions

trait ListShapeHelper {

  implicit def listDateShapeExt[A, B, C, D](implicit shape: DataShape[A, B, C, D]): DataShape[List[A], List[B], List[C], D] = {
    new DataShape[List[A], List[B], List[C], D] { self =>
      override def wrapRep(base: List[A]): List[C] = base.map(shape.wrapRep)
      override def toLawRep(base: List[C]): DataRepGroup[D] = {
        val l = base.map(shape.toLawRep)
        DataRepGroup(reps = l.flatMap(_.reps))
      }
      override def takeData(oldData: DataGroup, rep: List[C]): Either[NotConvert, SplitData[List[B]]] = {
        rep.foldLeft(
          Right(SplitData(current = List.empty[B], left = oldData)): Either[NotConvert, SplitData[List[B]]]) { (splEt, eachRep) =>
            splEt.right.flatMap { spl =>
              val currTakeEt = shape.takeData(spl.left, eachRep)
              currTakeEt.right.map { currTake =>
                SplitData(current = currTake.current :: spl.current, left = currTake.left)
              }
            }
          }
      }
      override def buildData(splitData: List[B], rep: List[C]): Either[NotConvert, DataGroup] = {
        val l = splitData.zip(rep)
        val dg = l.map { case (d, r) => shape.buildData(d, r) }
        dg.foldLeft(
          Right(DataGroup(items = List.empty[Any])): Either[NotConvert, DataGroup]) {
            case (frontEt, backEt) =>
              frontEt.right.flatMap { front =>
                backEt.right.map { back =>
                  DataGroup(items = front.items ::: back.items)
                }
              }
          }
      }
    }
  }

}