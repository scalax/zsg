package net.scalax.asuna.core.helper

import net.scalax.asuna.core._
import shapeless._

trait ModelParamTran[Output, Input] {
  def tran(param: Input): Output
}

object ModelParamTran {

  implicit def dModelParamHlistImplicit1: ModelParamTran[HNil, HNil] = {
    new ModelParamTran[HNil, HNil] {
      override def tran(param: HNil): HNil = {
        param
      }
    }
  }

  implicit def dModelParamHlistImplicit2[A <: HList, B <: HList, C <: HList, D](implicit cv2: HListDF.TypeHList[A], cv3: ModelParamTran[B, C], cv4: ModelParamTran[A, D]): ModelParamTran[A :: B, D :: C] = {
    new ModelParamTran[A :: B, D :: C] {
      override def tran(param: D :: C): A :: B = {
        val h :: t = param
        cv4.tran(h) :: cv3.tran(t)
      }
    }
  }

  implicit def dModelParamHlistImplicit3[A, B <: HList, C <: HList](implicit cv2: TypeConfirm.Defined[A], cv3: ModelParamTran[B, C]): ModelParamTran[A :: B, A :: C] = {
    new ModelParamTran[A :: B, A :: C] {
      override def tran(param: A :: C): A :: B = {
        val h :: t = param
        h :: cv3.tran(t)
      }
    }
  }

  implicit def dModelParamHlistImplicit4[A, B <: HList, C <: HList, E](implicit cv2: HListDF.TypeEmpty[A], cv3: ModelParamTran[B, C]): ModelParamTran[A :: B, C] = {
    new ModelParamTran[A :: B, C] {
      override def tran(param: C): A :: B = {
        EmptyData.value.asInstanceOf[A] :: cv3.tran(param)
      }
    }
  }

}

trait ModelParamTranHelper extends HListDataConfirm {

  def compileHListFunction[A, B, C](f: A => B)(implicit cv1: ModelParamTran[A, C]): C => B = {
    { (param: C) =>
      f(cv1.tran(param))
    }
  }

  val func1 = compileHListFunction { (p: String :: EmptyData :: String :: EmptyData :: EmptyData :: EmptyData :: (Int :: EmptyData :: EmptyData :: (EmptyData :: String :: EmptyData :: EmptyData :: EmptyData :: HNil) :: String :: EmptyData :: HNil) :: Int :: HNil) => p }
  val cdef = func1("name1" :: "name2" :: (3 :: ("fsartert" :: HNil) :: "hahhah" :: HNil) :: 6 :: HNil)
  cdef

}