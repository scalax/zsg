package net.scalax.asuna.core

import shapeless._
import tag._

trait DataModelHelper2 {

  implicit def helper2Implicit1[A, B <: HList, C <: HList](
    implicit
    cv1: DModelTranHelper[B, C]): DModelTranHelper[(A @@ OutputData) :: B, A :: C] = {
    new DModelTranHelper[(A @@ OutputData) :: B, A :: C] {
      override def apply(i: (A @@ OutputData) :: B): A :: C = {
        val a :: b = i
        (a: A) :: cv1(b)
      }
    }
  }

  implicit def helper2Implicit2[A, B <: HList, C, D <: HList](
    implicit
    cv1: DModelTranHelper[B, D]): DModelTranHelper[IOData[A, C] :: B, IOData[A, C :: D]] = {
    new DModelTranHelper[IOData[A, C] :: B, IOData[A, C :: D]] {
      override def apply(input: IOData[A, C] :: B): IOData[A, C :: D] = {
        val ac :: b = input
        val d = cv1(b)
        new IOData[A, C :: D] {
          override def apply(i: A): C :: D = {
            ac(i) :: d
          }
        }
      }
    }
  }

  implicit def helper2Implicit3[A, B <: HList, C, D <: HList](
    implicit
    cv1: DModelTranHelper[B, D]): DModelTranHelper[OutputSubData[A, C] :: B, OutputSubData[A :: D, C]] = {
    new DModelTranHelper[OutputSubData[A, C] :: B, OutputSubData[A :: D, C]] {
      override def apply(input: OutputSubData[A, C] :: B): OutputSubData[A :: D, C] = {
        val ac :: b = input
        val d = cv1(b)
        new OutputSubData[A :: D, C] {
          override val current: A :: D = ac.current :: d
          override val sub: C = ac.sub
        }
      }
    }
  }

  implicit def helper2Implicit4[A, B <: HList, C, D <: HList, E](
    implicit
    cv1: DModelTranHelper[B, D]): DModelTranHelper[DataModel[A, C, E] :: B, DataModel[A, C :: D, E]] = {
    new DModelTranHelper[DataModel[A, C, E] :: B, DataModel[A, C :: D, E]] {
      override def apply(input: DataModel[A, C, E] :: B): DataModel[A, C :: D, E] = {
        val ace :: b = input
        val d = cv1(b)
        new DataModel[A, C :: D, E] {
          override val current: A => C :: D = { (a: A) => ace.current(a) :: d }
          override val sub: E = ace.sub
        }
      }
    }
  }

}