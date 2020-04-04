package asuna.sample03_macros_code_generation.deficient

import asuna.macros.single.deficient.{AsunaDeficientToTupleApply, DeficientProperty, ModelProperty}

object AsunaDeficientToTupleApplyCodeGenSample extends App {

  class Test111
  class Test222
  class Test333
  class Test444
  case class Model2[T](age: T, a3: Test333)

  case class Model1[T](name: String, age: T, a3: Test333, a4: Long)
  trait TupleModel {
    @ModelProperty
    def model2222: Model1[T]
    type T
    @DeficientProperty
    def tuple1111: Model2[T]
  }

  //def tupleModel[T]: AsunaDeficientToTupleApply[Model1[T], TupleModel] = implicitly

  //val model2 = tupleModel.toTuple(Model1("123", 456, new Test333, 123))

  //println(model2.model2222)

  def tupleModel[T]: AsunaDeficientToTupleApply[Model1[T], TupleModel] =
    (((gen) => {
      type T1 = T
      final class $anon extends asuna.sample03_macros_code_generation.deficient.AsunaDeficientToTupleApplyCodeGenSample.TupleModel { deficientApplySelf =>
        override def tuple1111 = Model2(age = deficientApplySelf.model2222.age, a3 = deficientApplySelf.model2222.a3);
        override type T = T1
        override val model2222 = gen
      };
      new $anon()
    }): _root_.asuna.macros.single.deficient.AsunaDeficientToTupleApply[asuna.sample03_macros_code_generation.deficient.AsunaDeficientToTupleApplyCodeGenSample.Model1[T], asuna.sample03_macros_code_generation.deficient.AsunaDeficientToTupleApplyCodeGenSample.TupleModel])

  val model2 = tupleModel.toTuple(Model1("123", 456, new Test333, 123))
  println(model2.model2222)

}
