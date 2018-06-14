package net.scalax.asuna.core

import shapeless._
import tag._

trait DataModelHelper4 {

  implicit def helper4Implicit1[A, B <: HList, C <: HList, D](
    implicit
    cv1: DModelTranHelper[B, OutputSubData[C, D]]): DModelTranHelper[(A @@ OutputData) :: B, OutputSubData[A :: C, D]] = {
    new DModelTranHelper[(A @@ OutputData) :: B, OutputSubData[A :: C, D]] {
      override def apply(input: (A @@ OutputData) :: B): OutputSubData[A :: C, D] = {
        val a :: b = input
        val cd = cv1(b)
        new OutputSubData[A :: C, D] {
          override def current: A :: C = (a: A) :: cd.current
          override def sub: D = cd.sub
        }
      }
    }
  }

  implicit def helper4Implicit2[A, B <: HList, C, D <: HList, E](
    implicit
    cv1: DModelTranHelper[B, OutputSubData[D, E]]): DModelTranHelper[IOData[A, C] :: B, DataModel[A, C :: D, E]] = {
    new DModelTranHelper[IOData[A, C] :: B, DataModel[A, C :: D, E]] {
      override def apply(input: IOData[A, C] :: B): DataModel[A, C :: D, E] = {
        val ac :: b = input
        val de = cv1(b)
        new DataModel[A, C :: D, E] {
          override def current: A => C :: D = { (a: A) => ac(a) :: de.current }
          override def sub: E = de.sub
        }
      }
    }
  }

  implicit def helper4Implicit3[A, B <: HList, C, D <: HList, E <: HList](
    implicit
    cv1: DModelTranHelper[B, OutputSubData[D, E]]): DModelTranHelper[OutputSubData[A, C] :: B, OutputSubData[A :: D, C :: E]] = {
    new DModelTranHelper[OutputSubData[A, C] :: B, OutputSubData[A :: D, C :: E]] {
      override def apply(input: OutputSubData[A, C] :: B): OutputSubData[A :: D, C :: E] = {
        val ac :: b = input
        val de = cv1(b)
        new OutputSubData[A :: D, C :: E] {
          override def current: A :: D = ac.current :: de.current
          override def sub: C :: E = ac.sub :: de.sub
        }
      }
    }
  }

  implicit def helper4Implicit4[A, B <: HList, C, D <: HList, E <: HList, F](
    implicit
    cv1: DModelTranHelper[B, OutputSubData[D, E]]): DModelTranHelper[DataModel[A, C, F] :: B, DataModel[A, C :: D, F :: E]] = {
    new DModelTranHelper[DataModel[A, C, F] :: B, DataModel[A, C :: D, F :: E]] {
      override def apply(input: DataModel[A, C, F] :: B): DataModel[A, C :: D, F :: E] = {
        val acf :: b = input
        val de = cv1(b)
        new DataModel[A, C :: D, F :: E] {
          override def current: A => C :: D = { (a: A) => acf.current(a) :: de.current }
          override def sub: F :: E = acf.sub :: de.sub
        }
      }
    }
  }

}