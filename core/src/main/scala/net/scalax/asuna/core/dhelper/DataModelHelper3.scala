package net.scalax.asuna.core

import shapeless._
import tag._

trait DataModelHelper3 {

  implicit def helper3Implicit1[A, B <: HList, C, D <: HList](
    implicit
    cv1: DModelTranHelper[B, IOData[C, D]]): DModelTranHelper[(A @@ OutputData) :: B, IOData[C, A :: D]] = {
    new DModelTranHelper[(A @@ OutputData) :: B, IOData[C, A :: D]] {
      override def apply(input: (A @@ OutputData) :: B): IOData[C, A :: D] = {
        val a :: b = input
        new IOData[C, A :: D] {
          override def apply(i: C): A :: D = {
            (a: A) :: cv1(b)(i)
          }
        }
      }
    }
  }

  implicit def helper3Implicit2[A, B <: HList, C, D <: HList, E <: HList](
    implicit
    cv1: DModelTranHelper[B, IOData[D, E]]): DModelTranHelper[IOData[A, C] :: B, IOData[A :: D, C :: E]] = {
    new DModelTranHelper[IOData[A, C] :: B, IOData[A :: D, C :: E]] {
      override def apply(input: IOData[A, C] :: B): IOData[A :: D, C :: E] = {
        val ac :: b = input
        new IOData[A :: D, C :: E] {
          override def apply(i: A :: D): C :: E = {
            val a :: d = i
            ac(a) :: cv1(b)(d)
          }
        }
      }
    }
  }

  implicit def helper3Implicit3[A, B <: HList, C, D, E <: HList](
    implicit
    cv1: DModelTranHelper[B, IOData[D, E]]): DModelTranHelper[OutputSubData[A, C] :: B, DataModel[D, A :: E, C :: HNil]] = {
    new DModelTranHelper[OutputSubData[A, C] :: B, DataModel[D, A :: E, C :: HNil]] {
      override def apply(input: OutputSubData[A, C] :: B): DataModel[D, A :: E, C :: HNil] = {
        val ac :: b = input
        new DataModel[D, A :: E, C :: HNil] {
          override val current: D => A :: E = { (d: D) => ac.current :: cv1(b)(d) }
          override val sub: C :: HNil = ac.sub :: HNil
        }
      }
    }
  }

  implicit def helper3Implicit4[A, B <: HList, C, D <: HList, E <: HList, F](
    implicit
    cv1: DModelTranHelper[B, IOData[D, E]]): DModelTranHelper[DataModel[A, C, F] :: B, DataModel[A :: D, C :: E, F]] = {
    new DModelTranHelper[DataModel[A, C, F] :: B, DataModel[A :: D, C :: E, F]] {
      override def apply(input: DataModel[A, C, F] :: B): DataModel[A :: D, C :: E, F] = {
        new DataModel[A :: D, C :: E, F] {
          val acf :: b = input
          override val current: A :: D => C :: E = { (ad: A :: D) =>
            val a :: d = ad
            acf.current(a) :: cv1(b)(d)
          }
          override val sub: F = acf.sub
        }
      }
    }
  }

}