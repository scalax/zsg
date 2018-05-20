package net.scalax.asuna.shape

import net.scalax.asuna.core._
import shapeless._

import scala.language.implicitConversions

trait ShapeHelpers {

  implicit def hnilDateShape[J]: DataShape[HNil, HNil, HNil, J] = {
    new DataShape[HNil, HNil, HNil, J] { self =>
      override def wrapRep(base: HNil): HNil = base
      override def toLawRep(base: HNil): DataRepGroup[J] = DataRepGroup(reps = List.empty, subs = List.empty)
      override def takeData(oldData: DataGroup, rep: HNil): Either[NotConvert, SplitData[HNil]] = Right(SplitData(current = HNil, left = oldData))
      override def buildData(splitData: HNil, rep: HNil): Either[NotConvert, DataGroup] = Right(DataGroup(items = List.empty, subs = List.empty))
    }
  }

  implicit def hlistDateShape[A, B <: HList, H, I <: HList, M, N <: HList, J](implicit head: DataShape[A, H, M, J], tail: DataShape[B, I, N, J]): DataShape[A :: B, H :: I, M :: N, J] = {

    new DataShape[A :: B, H :: I, M :: N, J] {
      self =>

      override def wrapRep(base: A :: B): M :: N = {
        val headRep :: tailRep = base
        head.wrapRep(headRep) :: tail.wrapRep(tailRep)
      }

      override def toLawRep(base: M :: N): DataRepGroup[J] = {
        val headRep :: tailRep = base
        val headGroup = head.toLawRep(headRep)
        val tailGroup = tail.toLawRep(tailRep)
        DataRepGroup(
          reps = headGroup.reps ::: tailGroup.reps,
          subs = headGroup.subs ::: tailGroup.subs)
      }

      override def takeData(oldData: DataGroup, rep: M :: N): Either[NotConvert, SplitData[H :: I]] = {
        val headRep :: tailRep = rep
        for {
          newData1 <- head.takeData(oldData, headRep).right
          newData2 <- tail.takeData(newData1.left, tailRep).right
        } yield {
          SplitData(newData1.current :: newData2.current, newData2.left)
        }
      }

      override def buildData(splitData: H :: I, rep: M :: N): Either[NotConvert, DataGroup] = {
        val headData :: tailData = splitData
        val headRep :: tailRep = rep
        for {
          newData1 <- head.buildData(headData, headRep).right
          newData2 <- tail.buildData(tailData, tailRep).right
        } yield {
          DataGroup(items = newData1.items ::: newData2.items, subs = newData1.subs ::: newData2.subs)
        }
      }
    }

  }

  implicit def liftToShapeValueExtendsionMethod[A, B, C, D](rep: A)(implicit shape: DataShape[A, B, C, D]): DataShapeValue[B, D] = {
    val rep1 = rep
    val shape1 = shape
    new DataShapeValue[B, D] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
  }

  implicit class shapeValueExt[A](rep: A) {
    def shaped[B, C, D](implicit shape: DataShape[A, B, C, D]): DataShapeValue[B, D] = {
      val rep1 = rep
      val shape1 = shape
      new DataShapeValue[B, D] {
        override type RepType = C
        override val rep = shape1.wrapRep(rep1)
        override val shape = shape1.packed
      }
    }
  }

  implicit class anyToRepGroupExt[A, B, C, D](rep1: A)(implicit shape: DataShape[A, B, C, D]) {
    def mixin[E, G, H](rep2: E)(implicit shape: DataShape[E, B, G, H]): RepGroup[E :: A :: HNil, B] = {
      new RepGroup[E :: A :: HNil, B] {
        override val repCol = rep2 :: rep1 :: HNil
      }
    }
  }

  implicit class anyToRepGroupExt2[A <: HList, B](rep1: RepGroup[A, B]) {
    def mixin[E, G, H](rep2: E)(implicit shape: DataShape[E, B, G, H]): RepGroup[E :: A, B] = {
      new RepGroup[E :: A, B] {
        override val repCol = rep2 :: rep1.repCol
      }
    }
  }

  implicit def hlistRepGroupImplicit[B, C <: HList, E, G, H](implicit shape: DataShape[B, E, G, H]): DataShape[RepGroup[B :: C, E], E, G, H] = {
    new DataShape[RepGroup[B :: C, E], E, G, H] {
      override def wrapRep(base: RepGroup[B :: C, E]): G = {
        val head :: _ = base.repCol
        shape.wrapRep(head)
      }
      override def toLawRep(base: G): DataRepGroup[H] = shape.toLawRep(base)
      override def takeData(oldData: DataGroup, rep: G): Either[NotConvert, SplitData[E]] = shape.takeData(oldData, rep)
      override def buildData(splitData: E, rep: G): Either[NotConvert, DataGroup] = shape.buildData(splitData, rep)
    }
  }

  implicit def hlistRepGroupImplicit2[B, C <: HList, F, G, H, I, J](implicit shape: DataShape[RepGroup[C, F], F, J, H]): DataShape[RepGroup[B :: C, F], F, J, H] = {
    new DataShape[RepGroup[B :: C, F], F, J, H] {
      override def wrapRep(base: RepGroup[B :: C, F]): J = {
        val _ :: tail = base.repCol
        val rGroup = new RepGroup[C, F] {
          override val repCol = tail
        }
        shape.wrapRep(rGroup)
      }
      override def toLawRep(base: J): DataRepGroup[H] = shape.toLawRep(base)
      override def takeData(oldData: DataGroup, rep: J): Either[NotConvert, SplitData[F]] = shape.takeData(oldData, rep)
      override def buildData(splitData: F, rep: J): Either[NotConvert, DataGroup] = shape.buildData(splitData, rep)
    }
  }

}