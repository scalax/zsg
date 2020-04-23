package asuna.sample03_macros_code_generation.deficient

import asuna.{AsunaTuple1, AsunaTuple2}
import asuna.macros.single.deficient.{AsunaTupleLabelledGeneric, DeficientProperty, ModelProperty}

object AsunaTupleLabelledGenericCodeGenSample extends App {

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

  def model[T, P](implicit i: AsunaTupleLabelledGeneric[T, P]): P = i.names()

  val up = model[TupleModel, AsunaTuple2[AsunaTuple2[AsunaTuple2[String, String], AsunaTuple2[String, String]], AsunaTuple1[AsunaTuple1[String]]]]

  println(up.i1.i1.i1) //name
  println(up.i1.i2.i1) //a5

}
