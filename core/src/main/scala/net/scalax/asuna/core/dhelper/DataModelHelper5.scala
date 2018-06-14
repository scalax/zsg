package net.scalax.asuna.core

import shapeless._
import tag._

trait DataModelHelper5 {

  implicit def helper5Implicit1[A, B <: HList, C, D <: HList, E](
    implicit
    cv1: DModelTranHelper[B, DataModel[C, D, E]]): DModelTranHelper[(A @@ OutputData) :: B, DataModel[C, A :: D, E]] = {
    new DModelTranHelper[(A @@ OutputData) :: B, DataModel[C, A :: D, E]] {
      override def apply(input: (A @@ OutputData) :: B): DataModel[C, A :: D, E] = {
        val a :: b = input
        val cde = cv1(b)
        new DataModel[C, A :: D, E] {
          override val current: C => A :: D = { (c: C) => (a: A) :: cde.current(c) }
          override val sub: E = cde.sub
        }
      }
    }
  }

  implicit def helper5Implicit2[A, B <: HList, C <: HList, D <: HList, E, F](
    implicit
    cv1: DModelTranHelper[B, DataModel[C, D, E]]): DModelTranHelper[IOData[A, F] :: B, DataModel[A :: C, F :: D, E]] = {
    new DModelTranHelper[IOData[A, F] :: B, DataModel[A :: C, F :: D, E]] {
      override def apply(input: IOData[A, F] :: B): DataModel[A :: C, F :: D, E] = {
        val af :: b = input
        val cde = cv1(b)
        new DataModel[A :: C, F :: D, E] {
          override val current: A :: C => F :: D = { (ac: A :: C) =>
            val a :: c = ac
            af(a) :: cde.current(c)
          }
          override val sub: E = cde.sub
        }
      }
    }
  }

  implicit def helper5Implicit3[A, B <: HList, C, D <: HList, E <: HList, F](
    implicit
    cv1: DModelTranHelper[B, DataModel[C, D, E]]): DModelTranHelper[OutputSubData[A, F] :: B, DataModel[C, A :: D, F :: E]] = {
    new DModelTranHelper[OutputSubData[A, F] :: B, DataModel[C, A :: D, F :: E]] {
      override def apply(input: OutputSubData[A, F] :: B): DataModel[C, A :: D, F :: E] = {
        val af :: b = input
        val cde = cv1(b)
        new DataModel[C, A :: D, F :: E] {
          override val current: C => A :: D = { (c: C) => af.current :: cde.current(c) }
          override val sub: F :: E = af.sub :: cde.sub
        }
      }
    }
  }

  implicit def helper5Implicit4[A, B <: HList, C <: HList, D <: HList, E <: HList, F, G](
    implicit
    cv1: DModelTranHelper[B, DataModel[C, D, E]]): DModelTranHelper[DataModel[A, F, G] :: B, DataModel[A :: C, F :: D, G :: E]] = {
    new DModelTranHelper[DataModel[A, F, G] :: B, DataModel[A :: C, F :: D, G :: E]] {
      override def apply(input: DataModel[A, F, G] :: B): DataModel[A :: C, F :: D, G :: E] = {
        val afg :: b = input
        val cde = cv1(b)
        new DataModel[A :: C, F :: D, G :: E] {
          override val current: A :: C => F :: D = { (ac: A :: C) =>
            val a :: c = ac
            afg.current(a) :: cde.current(c)
          }
          override val sub: G :: E = afg.sub :: cde.sub
        }
      }
    }
  }

}