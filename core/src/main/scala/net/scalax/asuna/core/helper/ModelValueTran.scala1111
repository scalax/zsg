package net.scalax.asuna.core.helper

import net.scalax.asuna.core._
import shapeless._

trait ModelValueTran[Output, Input] {
  def tran(param: Output): Input
}

object ModelValueTran {

  implicit def dModelParamHlistImplicit1: ModelValueTran[HNil, HNil] = {
    new ModelValueTran[HNil, HNil] {
      override def tran(param: HNil): HNil = {
        param
      }
    }
  }

  implicit def dModelParamHlistImplicit2[A <: HList, B <: HList, C <: HList, D](implicit cv2: HListDF.TypeHList[A], cv3: ModelValueTran[B, C], cv4: ModelValueTran[A, D]): ModelValueTran[A :: B, D :: C] = {
    new ModelValueTran[A :: B, D :: C] {
      override def tran(param: A :: B): D :: C = {
        val h :: t = param
        cv4.tran(h) :: cv3.tran(t)
      }
    }
  }

  implicit def dModelParamHlistImplicit3[A, B <: HList, C <: HList](implicit cv2: TypeConfirm.Defined[A], cv3: ModelValueTran[B, C]): ModelValueTran[A :: B, A :: C] = {
    new ModelValueTran[A :: B, A :: C] {
      override def tran(param: A :: B): A :: C = {
        val h :: t = param
        h :: cv3.tran(t)
      }
    }
  }

  implicit def dModelParamHlistImplicit4[A, B <: HList, C <: HList, E](implicit cv2: HListDF.TypeEmpty[A], cv3: ModelValueTran[B, C]): ModelValueTran[A :: B, C] = {
    new ModelValueTran[A :: B, C] {
      override def tran(param: A :: B): C = {
        val _ :: b = param
        cv3.tran(b)
      }
    }
  }

}

trait ModelValueTranHelper extends HListDataConfirm {

  def compileHListValue[A, C](f: A)(implicit cv1: ModelValueTran[A, C]): C = {
    cv1.tran(f)
  }

  val xa = compileHListValue(EmptyData.value :: 2 :: "32" :: EmptyData.value ::
    (45645 :: "23sdfs" :: 234L :: (3434d :: "sdfsfsser" :: 23424 :: EmptyData.value :: EmptyData.value :: HNil) ::
      23 :: EmptyData.value :: EmptyData.value :: EmptyData.value :: HNil) :: "1345" :: EmptyData.value :: HNil)

  xa

}