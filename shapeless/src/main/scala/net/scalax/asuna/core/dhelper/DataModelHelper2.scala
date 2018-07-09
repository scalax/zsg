package net.scalax.asuna.core

import net.scalax.asuna.core.decoder._
import shapeless.{ ::, HList, HNil }

trait DataModelHelper2 {

  implicit def helper2Implicit1[A, B <: HList, C <: HList](
    implicit
    cv1: DModelTranHelper[B, C]): DModelTranHelper[OutputData[A] :: B, A :: C] = {
    new DModelTranHelper[OutputData[A] :: B, A :: C] {
      override def apply(i: OutputData[A] :: B): A :: C = {
        val a :: b = i
        a.current :: cv1(b)
      }
    }
  }

  implicit def helper2Implicit2[A, B <: HList, C, D <: HList](
    implicit
    cv1: DModelTranHelper[B, D]): DModelTranHelper[IOData[A, C] :: B, IOData[A :: HNil, C :: D]] = {
    new DModelTranHelper[IOData[A, C] :: B, IOData[A :: HNil, C :: D]] {
      override def apply(input: IOData[A, C] :: B): IOData[A :: HNil, C :: D] = {
        val ac :: b = input
        val d = cv1(b)
        new IOData[A :: HNil, C :: D] {
          override def apply(i: A :: HNil): C :: D = {
            val a :: _ = i
            ac(a) :: d
          }
        }
      }
    }
  }

  implicit def helper2Implicit3[A, B <: HList, C, D <: HList](
    implicit
    cv1: DModelTranHelper[B, D]): DModelTranHelper[OutputSubData[A, C] :: B, OutputSubData[A :: D, C :: HNil]] = {
    new DModelTranHelper[OutputSubData[A, C] :: B, OutputSubData[A :: D, C :: HNil]] {
      override def apply(input: OutputSubData[A, C] :: B): OutputSubData[A :: D, C :: HNil] = {
        val ac :: b = input
        val d = cv1(b)
        new OutputSubData[A :: D, C :: HNil] {
          override val current: A :: D = ac.current :: d
          override val sub: C :: HNil = ac.sub :: HNil
        }
      }
    }
  }

  implicit def helper2Implicit4[A, B <: HList, C, D <: HList, E](
    implicit
    cv1: DModelTranHelper[B, D]): DModelTranHelper[DataModel[A, C, E] :: B, DataModel[A :: HNil, C :: D, E :: HNil]] = {
    new DModelTranHelper[DataModel[A, C, E] :: B, DataModel[A :: HNil, C :: D, E :: HNil]] {
      override def apply(input: DataModel[A, C, E] :: B): DataModel[A :: HNil, C :: D, E :: HNil] = {
        val ace :: b = input
        val d = cv1(b)
        new DataModel[A :: HNil, C :: D, E :: HNil] {
          override def apply(i: A :: HNil): C :: D = {
            val a :: _ = i
            ace.apply(a) :: d
          }
          override val sub: E :: HNil = ace.sub :: HNil
        }
      }
    }
  }

  implicit def helper2Implicit5[A, B <: HList, C, D <: HList](
    implicit
    cv1: DModelTranHelper[B, C :: D]): DModelTranHelper[SubOnly[A] :: B, OutputSubData[C :: D, A :: HNil]] = {
    new DModelTranHelper[SubOnly[A] :: B, OutputSubData[C :: D, A :: HNil]] {
      override def apply(input: SubOnly[A] :: B): OutputSubData[C :: D, A :: HNil] = {
        val a :: b = input
        val cd = cv1(b)
        new OutputSubData[C :: D, A :: HNil] {
          override def current: C :: D = cd
          override def sub: A :: HNil = a.sub :: HNil
        }
      }
    }
  }

  implicit def helper2Implicit6[A, B <: HList](
    implicit
    cv1: DModelTranHelper[B, HNil]): DModelTranHelper[SubOnly[A] :: B, SubOnly[A :: HNil]] = {
    new DModelTranHelper[SubOnly[A] :: B, SubOnly[A :: HNil]] {
      override def apply(input: SubOnly[A] :: B): SubOnly[A :: HNil] = {
        val a :: b = input
        val cd = cv1(b)
        new SubOnly[A :: HNil] {
          override def sub: A :: HNil = a.sub :: cd
        }
      }
    }
  }

}