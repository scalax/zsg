package net.scalax.asuna.core

import shapeless._

trait DataModel[A, B, C] {
  self =>

  val current: A => B
  val sub: C

  def toImpl: DataModelImpl[A, B, C] = {
    self match {
      case m: DataModelImpl[A, B, C] => m
      case _ => DataModelImpl(current = self.current, sub = self.sub)
    }
  }

}

object DataModel {

  def simpleDModelDirectTran[T]: DModelDirectTran[T, T] = {
    new DModelDirectTran[T, T] {
      override def tran(model: T): T = model
    }
  }

  def compile[A <: HList, B, C](model: A)(implicit cv2: DModelHListTran[A, B], cv3: DModelDirectTran[B, C] = simpleDModelDirectTran[B]): C = {
    cv3.tran(cv2.tran(model))
  }

  trait DModelHListTran[T, R] {
    def tran(model: T): R
  }

  trait DModelDirectTran[T, R] {
    def tran(model: T): R
  }

  trait ModelParamTran[Output, Input] {
    def tran(param: Input): Output
  }

  implicit def dModelParamHlistImplicit1: ModelParamTran[HNil, HNil] = {
    new ModelParamTran[HNil, HNil] {
      override def tran(param: HNil): HNil = {
        param
      }
    }
  }

  implicit def dModelParamHlistImplicit2[A <: HList, B <: HList, C <: HList, D](implicit cv2: TypeConfirm.HList[A], cv3: ModelParamTran[B, C], cv4: ModelParamTran[A, D]): ModelParamTran[A :: B, D :: C] = {
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

  implicit def dModelParamHlistImplicit4[A, B <: HList, C <: HList, E](implicit cv2: TypeConfirm.Empty[A], cv3: ModelParamTran[B, C]): ModelParamTran[A :: B, C] = {
    new ModelParamTran[A :: B, C] {
      override def tran(param: C): A :: B = {
        EmptyData.value.asInstanceOf[A] :: cv3.tran(param)
      }
    }
  }

  def compileHListFunction[A, B, C](f: A => B)(implicit cv1: ModelParamTran[A, C]): C => B = {
    { (param: C) =>
      f(cv1.tran(param))
    }
  }

  val func1 = compileHListFunction { (p: String :: EmptyData :: String :: EmptyData :: EmptyData :: EmptyData :: (Int :: EmptyData :: EmptyData :: (EmptyData :: String :: EmptyData :: EmptyData :: EmptyData :: HNil) :: String :: EmptyData :: HNil) :: Int :: HNil) => p }
  val cdef = func1("name1" :: "name2" :: (3 :: ("fsartert" :: HNil) :: "hahhah" :: HNil) :: 6 :: HNil)
  cdef

  sealed trait DataConfirm
  trait SureEmptyData extends DataConfirm
  trait DefinedData extends DataConfirm
  trait HListData extends DataConfirm

  trait WrapDataConfirm[R] {
    type DCType <: DataConfirm
  }
  object WrapDataConfirm {
    type Aux[E <: DataConfirm, R] = WrapDataConfirm[R] { type DCType = E }
    type Empty[R] = Aux[SureEmptyData, R]
    type Defined[R] = Aux[DefinedData, R]
    type HList[R] = Aux[HListData, R]
  }
  trait TypeConfirm[R] {
    type DCType <: DataConfirm

  }
  object TypeConfirm {
    type Aux[E <: DataConfirm, R] = TypeConfirm[R] { type DCType = E }
    type Empty[R] = Aux[SureEmptyData, R]
    type Defined[R] = Aux[DefinedData, R]
    type HList[R] = Aux[HListData, R]
  }

  implicit def emptyDataWrapImplicit: WrapDataConfirm.Empty[EmptyData] = {
    object impl extends WrapDataConfirm[EmptyData] { type DCType = SureEmptyData }
    impl
  }

  implicit def hlistDataWrapImplicit[T <: HList]: WrapDataConfirm.HList[T] = {
    object impl extends WrapDataConfirm[T] { type DCType = HListData }
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

  def ee[A](a: A)(implicit cv: TypeConfirm.Empty[A]): A = a
  //编译失败
  //ee("s3f64wa56r4ew54ra5wr")
  ee(EmptyData.value)

  def ff[A](a: A)(implicit cv: TypeConfirm.Defined[A]): A = a
  ff("s3f64wa56r4ew54ra5wr")
  //编译失败
  //ff(EmptyData.value)

}

case class DataModelImpl[A, B, C](override val current: A => B, override val sub: C) extends DataModel[A, B, C]

trait EmptyData

object EmptyData {
  val value: EmptyData = new EmptyData {}
}