package asuna.sample03_macros_code_generation.deficient

import asuna.{AppendTag, NodeTag1, NodeTag2, PropertyTag0, TupleTag, TupleTag1, TupleTag2}
import asuna.macros.single.deficient.{AsunaTupleGeneric, DeficientProperty, ModelProperty}

object AsunaTupleGenericCodeGenSample extends App {

  class Test1
  class Test2
  class Test3 {
    override def toString: String = "test3: String"
  }
  class Test4
  case class Model2[T](age: T, a3: Test3, a7: Test2)

  case class Model1[T](name: String, age: T, a3: Test3, a4: Long, a5: Test4, a6: Test1, a7: Test2, a8: Test3)
  trait TupleModel {
    @ModelProperty
    def model: Model1[T]
    type T
    @DeficientProperty
    def tuple: Model2[T]
  }

  class TupleModelImplicitApply[TraitType] {
    def model[T <: TupleTag](implicit i: AsunaTupleGeneric.Aux[TupleModel, T]): AppendTag[T] = i.tag
  }

  def tupleModel[TraitType]: TupleModelImplicitApply[TraitType] = new TupleModelImplicitApply[TraitType]

  val up = tupleModel[TupleModel].model

  up: AppendTag[
    NodeTag2[NodeTag2[TupleTag2[PropertyTag0[String], PropertyTag0[Long]], TupleTag2[PropertyTag0[Test4], PropertyTag0[Test1]]], NodeTag1[TupleTag1[PropertyTag0[Test3]]]]
  ]

}
