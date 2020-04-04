package asuna.sample03_macros_code_generation.deficient

import asuna.macros.single.deficient.{AsunaDeficientToTupleApply, DeficientProperty, ModelProperty}

object AsunaDeficientToTupleApplyCodeGenSample extends App {

  class Test1
  class Test2
  class Test3 {
    override def toString: String = "test3: String"
  }
  class Test4
  case class Model2[T](age: T, a3: Test3)

  case class Model1[T](name: String, age: T, a3: Test3, a4: Long)
  trait TupleModel {
    @ModelProperty
    def model2222: Model1[T]
    type T
    @DeficientProperty
    def tuple1111: Model2[T]
  }
  trait TupleModelImpl[T1] extends TupleModel {
    override type T = T1
  }

  def tupleModel[T]: AsunaDeficientToTupleApply[Model1[T], TupleModelImpl[T], TupleModel] = implicitly

  val model2 = tupleModel.toTuple(Model1("123", 456, new Test3, 123))
  println(model2.model2222)
  println(model2.tuple1111)

}
