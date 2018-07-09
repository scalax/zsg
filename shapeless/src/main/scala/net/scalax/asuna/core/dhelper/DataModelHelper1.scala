package net.scalax.asuna.core

import shapeless.HNil

trait DModelTranHelper[Input, Output] {
  def apply(i: Input): Output
}

object DModelTranHelper extends DataModelHelper1 with DataModelHelper2 with DataModelHelper3 with DataModelHelper4 with DataModelHelper5 with DataModelHelper6

object DMHelper {

  def compile[A, B](d: A)(implicit cv1: DModelTranHelper[A, B]): B = {
    cv1(d)
  }

}

trait DataModelHelper1 {

  implicit def helper1Implicit1: DModelTranHelper[HNil, HNil] = {
    new DModelTranHelper[HNil, HNil] {
      override def apply(i: HNil): HNil = {
        i
      }
    }
  }

}