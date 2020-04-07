package asuna.sample03_macros_code_generation.deficient

import asuna.macros.single.deficient.{AsunaTupleApply, DeficientProperty, ModelProperty}

object AsunaTupleApplyCodeGenSample extends App {

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
    def model: Model1[T]
    type T
    @DeficientProperty
    def tuple: Model2[T]
  }
  trait TupleModelImpl[T1] extends TupleModel {
    override type T = T1
  }

  def tupleModel[T](model1: Model1[T])(implicit i: AsunaTupleApply[Model1[T], TupleModelImpl[T]]): TupleModel = i.toTuple(model1)

  val model2 = tupleModel(Model1("123", 456, new Test3, 123))
  println(model2.model)
  println(model2.tuple)

}
