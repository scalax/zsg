package net.scalax.asuna.core

import shapeless._

trait DataModelHelper6 {

  implicit def helper6Implicit1[A, B <: HList, C <: HList](
    implicit
    cv1: DModelTranHelper[B, SubOnly[C]]): DModelTranHelper[OutputData[A] :: B, OutputSubData[A :: HNil, C]] = {
    new DModelTranHelper[OutputData[A] :: B, OutputSubData[A :: HNil, C]] {
      override def apply(input: OutputData[A] :: B): OutputSubData[A :: HNil, C] = {
        val a :: b = input
        val c = cv1(b)
        new OutputSubData[A :: HNil, C] {
          override def current: A :: HNil = a.current :: HNil
          override def sub: C = c.sub
        }
      }
    }
  }

  implicit def helper6Implicit2[A, B <: HList, C, D <: HList](
    implicit
    cv1: DModelTranHelper[B, SubOnly[D]]): DModelTranHelper[IOData[A, C] :: B, DataModel[A :: HNil, C :: HNil, D]] = {
    new DModelTranHelper[IOData[A, C] :: B, DataModel[A :: HNil, C :: HNil, D]] {
      override def apply(input: IOData[A, C] :: B): DataModel[A :: HNil, C :: HNil, D] = {
        val ac :: b = input
        val d = cv1(b)
        new DataModel[A :: HNil, C :: HNil, D] {
          override def apply(i: A :: HNil): C :: HNil = {
            val a :: _ = i
            ac(a) :: HNil
          }
          override def sub: D = d.sub
        }
      }
    }
  }

  implicit def helper6Implicit3[A, B <: HList, C, D <: HList](
    implicit
    cv1: DModelTranHelper[B, SubOnly[D]]): DModelTranHelper[OutputSubData[A, C] :: B, OutputSubData[A :: HNil, C :: D]] = {
    new DModelTranHelper[OutputSubData[A, C] :: B, OutputSubData[A :: HNil, C :: D]] {
      override def apply(input: OutputSubData[A, C] :: B): OutputSubData[A :: HNil, C :: D] = {
        val ac :: b = input
        val d = cv1(b)
        new OutputSubData[A :: HNil, C :: D] {
          override def current: A :: HNil = ac.current :: HNil
          override def sub: C :: D = ac.sub :: d.sub
        }
      }
    }
  }

  implicit def helper6Implicit4[A, B <: HList, C, D <: HList, E](
    implicit
    cv1: DModelTranHelper[B, SubOnly[D]]): DModelTranHelper[DataModel[A, C, E] :: B, DataModel[A :: HNil, C :: HNil, E :: D]] = {
    new DModelTranHelper[DataModel[A, C, E] :: B, DataModel[A :: HNil, C :: HNil, E :: D]] {
      override def apply(input: DataModel[A, C, E] :: B): DataModel[A :: HNil, C :: HNil, E :: D] = {
        val ace :: b = input
        val d = cv1(b)
        new DataModel[A :: HNil, C :: HNil, E :: D] {
          override def apply(i: A :: HNil): C :: HNil = {
            val a :: _ = i
            ace.apply(a) :: HNil
          }

          override def sub: E :: D = ace.sub :: d.sub
        }
      }
    }
  }

  implicit def helper6Implicit5[A, B <: HList, C <: HList](
    implicit
    cv1: DModelTranHelper[B, SubOnly[C]]): DModelTranHelper[SubOnly[A] :: B, SubOnly[A :: C]] = {
    new DModelTranHelper[SubOnly[A] :: B, SubOnly[A :: C]] {
      override def apply(input: SubOnly[A] :: B): SubOnly[A :: C] = {
        val a :: b = input
        val c = cv1(b)
        new SubOnly[A :: C] {
          override def sub: A :: C = a.sub :: c.sub
        }
      }
    }
  }

}