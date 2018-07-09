package net.scalax.asuna.shape

import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup, RepGroup }
import net.scalax.asuna.core.decoder.{ DecoderShape, SplitData }
import shapeless.{ ::, HList }

trait RepGroupShapeHelper {

  implicit def hlistRepGroupImplicit[B, C <: HList, E, G, H](implicit shape: DecoderShape[B, E, G, H]): DecoderShape[RepGroup[B :: C, E], E, G, H] = {
    new DecoderShape[RepGroup[B :: C, E], E, G, H] {
      override def wrapRep(base: RepGroup[B :: C, E]): G = {
        val head :: _ = base.repCol
        shape.wrapRep(head)
      }
      override def toLawRep(base: G): DataRepGroup[H] = shape.toLawRep(base)
      override def takeData(oldData: DataGroup, rep: G): SplitData[E] = shape.takeData(oldData, rep)
    }
  }

  implicit def hlistRepGroupImplicit2[B, C <: HList, F, G, H, I, J](implicit shape: DecoderShape[RepGroup[C, F], F, J, H]): DecoderShape[RepGroup[B :: C, F], F, J, H] = {
    new DecoderShape[RepGroup[B :: C, F], F, J, H] {
      override def wrapRep(base: RepGroup[B :: C, F]): J = {
        val _ :: tail = base.repCol
        val rGroup = new RepGroup[C, F] {
          override val repCol = tail
        }
        shape.wrapRep(rGroup)
      }
      override def toLawRep(base: J): DataRepGroup[H] = shape.toLawRep(base)
      override def takeData(oldData: DataGroup, rep: J): SplitData[F] = shape.takeData(oldData, rep)
    }
  }

}