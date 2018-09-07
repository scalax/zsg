package net.scalax.asuna.shape

import net.scalax.asuna.core.common.{ ++::, RNil, RepGroup, RepGroupContent }
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.data.macroImpl.RepGroupColumnWrapper

trait ShapeHelper {

  implicit class anyToRepGroupExt[A](rep1: A) {
    def mixin[E](rep2: E): RepGroup[E ++:: A ++:: RNil] = {
      new RepGroup[E ++:: A ++:: RNil] {
        override val repCol = rep2 ++:: rep1 ++:: RNil.value
      }
    }
  }

  implicit def rnilRepGroupColumnImplicit[Data]: RepGroupColumnWrapper.Aux[RepGroup[RNil], Data, RepGroup[RNil]] = new RepGroupColumnWrapper[RepGroup[RNil], Data] {
    override type Target = RepGroup[RNil]
    override def inputColumn(rep: RepGroup[RNil], columnInfo: MacroColumnInfo): RepGroup[RNil] = {
      rep
    }
  }

  implicit def rmultiplyRepGroupColumnImplicit[NewHead, NewTail <: RepGroupContent, Data, TargetHead, TargetTail <: RepGroupContent](
    implicit
    head: RepGroupColumnWrapper.Aux[NewHead, Data, TargetHead],
    tail: RepGroupColumnWrapper.Aux[RepGroup[NewTail], Data, RepGroup[TargetTail]]): RepGroupColumnWrapper.Aux[RepGroup[NewHead ++:: NewTail], Data, RepGroup[TargetHead ++:: TargetTail]] = new RepGroupColumnWrapper[RepGroup[NewHead ++:: NewTail], Data] {
    override type Target = RepGroup[TargetHead ++:: TargetTail]
    override def inputColumn(rep: RepGroup[NewHead ++:: NewTail], columnInfo: MacroColumnInfo): RepGroup[TargetHead ++:: TargetTail] = {
      val h ++:: t = rep.repCol
      val columnInfo1 = columnInfo
      new RepGroup[TargetHead ++:: TargetTail] {
        override val repCol = ++::.apply(head.inputColumn(h, columnInfo1), tail.inputColumn(new RepGroup[NewTail] {
          override val repCol = t
        }, columnInfo1).repCol)
      }
    }
  }

}