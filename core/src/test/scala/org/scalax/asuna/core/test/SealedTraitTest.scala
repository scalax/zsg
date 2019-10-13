package org.scalax.asuna.core.test

import org.scalax.asuna.mapper.ItemTag
import org.scalax.asuna.mapper.macroImpl.AsunaSealedGeneric

sealed trait Abc[T]
class AA[T](ii: T, iiii: String) extends Abc[T]
class BB[T](ii: T, iiii: String) extends Abc[T]

class SealedTraitTest {

  def init[H]: GenericApply1[H] = new GenericApply1[H]

  class GenericApply1[H] {
    def generic[T <: ItemTag](implicit asunaSealedGeneric: AsunaSealedGeneric.Aux[H, T]): AsunaSealedGeneric.Aux[H, T] = asunaSealedGeneric
  }

  init[Abc[String]].generic.tag

}
