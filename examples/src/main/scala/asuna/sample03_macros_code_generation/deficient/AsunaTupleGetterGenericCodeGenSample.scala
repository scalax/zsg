package asuna.sample03_macros_code_generation.deficient

import asuna.{AsunaTuple1, AsunaTuple2}
import asuna.macros.single.deficient.{AsunaTupleApply, AsunaTupleGetterGeneric, DeficientProperty, ModelProperty}

object AsunaTupleGetterGenericCodeGenSample extends App {

  class Test1
  class Test2
  class Test3 {
    override def toString: String = "test3: String"
  }
  class Test4 {
    override def toString: String = "test4"
  }
  case class Model2[T](age: T, a3: Test3, a7: Test2)

  case class Model1[T](name: String, age: T, a3: Test3, a4: Long, a5: Test4, a6: Test1, a7: Test2, a8: Test3)
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

  def model[T, P](implicit i: AsunaTupleGetterGeneric[T, P]): AsunaTupleGetterGeneric[T, P] = i

  val up = model[TupleModel, AsunaTuple2[AsunaTuple2[AsunaTuple2[String, Long], AsunaTuple2[Test4, Test1]], AsunaTuple1[AsunaTuple1[Test3]]]]

  val model                                                                                                   = Model1(name = "name", age = 1234, a3 = new Test3, a4 = 2, a5 = new Test4, a6 = new Test1, a7 = new Test2, a8 = new Test3)
  def tupleModel[T](model1: Model1[T])(implicit i: AsunaTupleApply[Model1[T], TupleModelImpl[T]]): TupleModel = i.toTuple(model1)

  val p = tupleModel(model)

  val pp = up.getter(p)

  println(pp.i1.i1.i1) //name
  println(pp.i1.i2.i1) //test4

}
