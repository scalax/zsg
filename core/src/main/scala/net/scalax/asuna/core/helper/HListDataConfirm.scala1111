package net.scalax.asuna.core.helper

import net.scalax.asuna.core.EmptyData
import shapeless._

object HListDF {

  trait SureEmptyData extends DataConfirm
  trait HListData extends DataConfirm

  type WrapEmpty[R] = WrapDataConfirm.Aux[SureEmptyData, R]
  type WrapHList[R] = WrapDataConfirm.Aux[HListData, R]

  type TypeEmpty[R] = TypeConfirm.Aux[SureEmptyData, R]
  type TypeHList[R] = TypeConfirm.Aux[HListData, R]

}

trait HListDataConfirm {

  implicit def emptyDataWrapImplicit: HListDF.WrapEmpty[EmptyData] = {
    object impl extends WrapDataConfirm[EmptyData] { type DCType = HListDF.SureEmptyData }
    impl
  }

  implicit def hlistDataWrapImplicit[T <: HList]: HListDF.WrapHList[T] = {
    object impl extends WrapDataConfirm[T] { type DCType = HListDF.HListData }
    impl
  }

  def definedDatatWrapExtract[T]: WrapDataConfirm.Defined[T] = {
    object impl extends WrapDataConfirm[T] { type DCType = DefinedData }
    impl
  }

  implicit def typeConfirmImplicit[A, T <: DataConfirm](implicit cv: WrapDataConfirm.Aux[T, A] = definedDatatWrapExtract[A]): TypeConfirm.Aux[cv.DCType, A] = {
    object impl extends TypeConfirm[A] { type DCType = cv.DCType }
    impl
  }

  /*def ee[A](a: A)(implicit cv: TypeEmpty[A]): A = a
  //编译失败
  //ee("s3f64wa56r4ew54ra5wr")
  ee(EmptyData.value)

  def ff[A](a: A)(implicit cv: TypeConfirm.Defined[A]): A = a
  ff("s3f64wa56r4ew54ra5wr")
  //编译失败
  //ff(EmptyData.value)*/

}