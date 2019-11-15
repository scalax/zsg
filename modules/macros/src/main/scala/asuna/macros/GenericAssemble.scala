package asuna.macros
import asuna.{Application3, Context3, TupleTag}

trait GenericAssemble[CaseClass, Generic <: TupleTag, Name, Value, Default] {
  self =>
  type GenericSelf = GenericAssemble[CaseClass, Generic, Name, Value, Default]
  def genericSelf: GenericSelf = self

  def generic: AsunaGeneric.Aux[CaseClass, Generic]
  def labelledGeneric: AsunaLabelledGeneric[CaseClass, Name]
  def getterGeneric: AsunaGetterGeneric[CaseClass, Value]
  def setterGeneric: AsunaSetterGeneric[CaseClass, Value]
  def defaultGeneric: AsunaDefaultValueGeneric[CaseClass, Default]

}

object GenericAssemble {
   def rawImplicit[Case,Gen <: TupleTag, N, V, D](
  implicit asunaGeneric: AsunaGeneric.Aux[Case, Gen],
  application3: =>Application3[GenericTypeFunc, Gen, N, V, D],
  asunaLabelledGeneric: AsunaLabelledGeneric[Case, N],
  asunaGetterGeneric: AsunaGetterGeneric[Case, V],
  asunaSetterGeneric: AsunaSetterGeneric[Case, V],
  asunaDefaultValueGeneric: AsunaDefaultValueGeneric[Case, D]
  ): GenericAssemble[Case, Gen, N, V, D] = new GenericAssemble[Case, Gen, N, V, D] {
    override val generic: AsunaGeneric.Aux[Case, Gen] = {
      asunaGeneric
    }
    override val labelledGeneric: AsunaLabelledGeneric[Case, N] = {
      asunaLabelledGeneric
    }
    override val getterGeneric: AsunaGetterGeneric[Case, V] = {
      asunaGetterGeneric
    }
    override val setterGeneric: AsunaSetterGeneric[Case, V] = {
      asunaSetterGeneric
    }
    override val defaultGeneric: AsunaDefaultValueGeneric[Case, D] = {
      asunaDefaultValueGeneric
    }
  }

  /*class GenericAssembleApply[Case] {
    def assembleImplicit[Gen <: TupleTag, N, V, D](
      implicit asunaGeneric: AsunaGeneric.Aux[Case, Gen],
      application3: Application3[GenericTypeFunc, Gen, N, V, D],
      asunaLabelledGeneric: AsunaLabelledGeneric[Case, N],
      asunaGetterGeneric: AsunaGetterGeneric[Case, V],
      asunaSetterGeneric: AsunaSetterGeneric[Case, V],
      asunaDefaultValueGeneric: AsunaDefaultValueGeneric[Case, D]
    ): GenericAssemble[Case, Gen, N, V, D] = new GenericAssemble[Case, Gen, N, V, D] {
      override val generic: AsunaGeneric.Aux[Case, Gen] = {
        asunaGeneric
      }
      override val labelledGeneric: AsunaLabelledGeneric[Case, N] = {
        asunaLabelledGeneric
      }
      override val getterGeneric: AsunaGetterGeneric[Case, V] = {
        asunaGetterGeneric
      }
      override val setterGeneric: AsunaSetterGeneric[Case, V] = {
        asunaSetterGeneric
      }
      override val defaultGeneric: AsunaDefaultValueGeneric[Case, D] = {
        asunaDefaultValueGeneric
      }
    }
  }

  def apply[Case] = new GenericAssembleApply[Case]*/

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
