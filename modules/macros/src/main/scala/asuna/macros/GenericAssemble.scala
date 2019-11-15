package asuna.macros
import asuna.{Application3, Context3, TupleTag}

trait GenericAssemble[CaseClass, Generic <: TupleTag, Name, Value, Default] {

  type Self = GenericAssemble[CaseClass, Generic, Name, Value, Default]
  def generic: AsunaGeneric.Aux[CaseClass, Generic]
  def labelledGeneric: AsunaLabelledGeneric[CaseClass, Name]
  def getterGeneric: AsunaGetterGeneric[CaseClass, Value]
  def setterGeneric: AsunaSetterGeneric[CaseClass, Value]
  def defaultGeneric: AsunaDefaultValueGeneric[CaseClass, Default]

}

object GenericAssemble {
  class GenericAssembleApply[Case] {
    def assembleImplicit[Gen <: TupleTag, N, V, D](
      implicit asunaGeneric: AsunaGeneric.Aux[Case, Gen],
      application3: Application3[GenericTypeFunc, Gen, N, V, D],
      asunaLabelledGeneric: AsunaLabelledGeneric[Case, N],
      asunaGetterGeneric: AsunaGetterGeneric[Case, V],
      asunaSetterGeneric: AsunaSetterGeneric[Case, V],
      asunaDefaultValueGeneric: AsunaDefaultValueGeneric[Case, D]
    ): GenericAssemble[Case, Gen, N, V, D] = new GenericAssemble[Case, Gen, N, V, D] {

      override def generic: AsunaGeneric.Aux[Case, Gen] = {
        println("11" * 100)
        asunaGeneric
      }
      override def labelledGeneric: AsunaLabelledGeneric[Case, N] = {
        println("22" * 100)
        asunaLabelledGeneric
      }
      override def getterGeneric: AsunaGetterGeneric[Case, V] = {
        println("33" * 100)
        asunaGetterGeneric
      }
      override def setterGeneric: AsunaSetterGeneric[Case, V] = {
        println("44" * 100)
        asunaSetterGeneric
      }
      override def defaultGeneric: AsunaDefaultValueGeneric[Case, D] = {
        println("88" * 100)
        asunaDefaultValueGeneric
      }
    }
  }

  def apply[Case] = new GenericAssembleApply[Case]

  class GenericTypeFunc[Name, Value, Default]

  object GenericTypeFunc {
    implicit def implicit1[T]: Application3[GenericTypeFunc, PropertyTag[T], String, T, DefaultValue[T]] = {
      new Application3[GenericTypeFunc, PropertyTag[T], String, T, DefaultValue[T]] {
        override def application(context: Context3[GenericTypeFunc]): GenericTypeFunc[String, T, DefaultValue[T]] = {
          new GenericTypeFunc[String, T, DefaultValue[T]]
        }
      }
    }
  }

}
