package net.scalax.asuna.core

import shapeless.{ ::, HList }

trait DataModelHelper5 {

  implicit def helper5Implicit1[A, B <: HList, C, D <: HList, E](
    implicit
    cv1: DModelTranHelper[B, DataModel[C, D, E]]): DModelTranHelper[OutputData[A] :: B, DataModel[C, A :: D, E]] = {
    new DModelTranHelper[OutputData[A] :: B, DataModel[C, A :: D, E]] {
      override def apply(input: OutputData[A] :: B): DataModel[C, A :: D, E] = {
        val a :: b = input
        val cde = cv1(b)
        new DataModel[C, A :: D, E] {
          override def apply(c: C): A :: D = a.current :: cde.apply(c)
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
          override def apply(ac: A :: C): F :: D = {
            val a :: c = ac
            af(a) :: cde.apply(c)
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
          override def apply(c: C): A :: D = { af.current :: cde.apply(c) }
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
          override def apply(ac: A :: C): F :: D = {
            val a :: c = ac
            afg.apply(a) :: cde.apply(c)
          }
          override val sub: G :: E = afg.sub :: cde.sub
        }
      }
    }
  }

  implicit def helper5Implicit5[A, B <: HList, C, D <: HList, E <: HList](
    implicit
    cv1: DModelTranHelper[B, DataModel[C, D, E]]): DModelTranHelper[SubOnly[A] :: B, DataModel[C, D, A :: E]] = {
    new DModelTranHelper[SubOnly[A] :: B, DataModel[C, D, A :: E]] {
      override def apply(input: SubOnly[A] :: B): DataModel[C, D, A :: E] = {
        val a :: b = input
        val cde = cv1(b)
        new DataModel[C, D, A :: E] {
          override def apply(c: C): D = cde.apply(c)
          override def sub: A :: E = a.sub :: cde.sub
        }
      }
    }
  }

}