package asuna.testkit

import asuna.{Application, AsunaTuple0, Context, KindContext, Plus, TypeHList, TypeHList1}

trait TupleEncoder[M] {
  def apply(model: M, appendable: List[String]): List[String]
  def body(model: M): String
}

class TContext extends KindContext {
  override type M[I <: TypeHList] = TupleEncoder[I#H]
}

object tupleContext extends Context[TContext] {

  override def isReverse: Boolean = true

  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
    x: TupleEncoder[X#H],
    y: TupleEncoder[Y#H],
    p: Plus[X, Y, Z]
  ): TupleEncoder[Z#H] = new TupleEncoder[Z#H] {
    override def apply(model: Z#H, appendable: List[String]): List[String] = y(p.takeTail(model), x(p.takeHead(model), appendable))
    override def body(model: Z#H): String                                  = apply(model, List.empty).mkString("(", ",", ")")
  }

  override def start: TupleEncoder[AsunaTuple0] = new TupleEncoder[AsunaTuple0] {
    override def apply(model: AsunaTuple0, appendable: List[String]): List[String] = appendable
    override def body(model: AsunaTuple0): String                                  = "()"
  }

}

object tuple {

  implicit def decoderImplicit[I1, I2 <: TypeHList](
    implicit
    pp: Application[TContext, I1, I2],
    convert: I1 <:< I2#H
  ): TupleEncoder[I1] = {
    val encoder1 = pp.application(tupleContext)
    new TupleEncoder[I1] {
      override def apply(model: I1, appendable: List[String]): List[String] = {
        println("1111" + encoder1.apply(model, List.empty).mkString("(", ",", ")"))
        encoder1.apply(model, List.empty).mkString("(", ",", ")") :: appendable
        //encoder1.apply(model, appendable)
      }
      override def body(model: I1): String = apply(model, List.empty) match {
        case List(i)               => i
        case list @ (head :: tail) => list.mkString("(", ",", ")")
      }
    }
  }

  def asString[T1](model: T1)(implicit tupleEncoder: TupleEncoder[T1]): String = s"[${tupleEncoder.body(model)}]"

  /*def reverseDecoder[I1, I2 <: TupleTag, I3 <: TypeHList](
    implicit ii: AsunaGeneric.Aux[I1, I2],
    pp: Application[MContext, I2, I3],
    asunaSetterGeneric: AsunaSetterGeneric[I1, I3#H]
  ): ModelDecoder[I1] = {
    { str: String =>
      val reverseContext = decoderContext.reverse
      val c              = pp.application(reverseContext)
      val (str1, m)      = c.init(str)
      (str1, asunaSetterGeneric.setter(m))
    }
  }*/

  /*def init1[I2 <: TupleTag](appendTag: AppendTag[I2]) = new ToStringApply2[I2]

  class ToStringApply2[I2 <: TupleTag] {
    def init2[I3 <: TypeHList](implicit app1: Application[IContext, I2, I3]) = new ToStringApply3[I2, I3] {
      override def app: Application[IContext, I2, I3] = app1
    }
  }

  trait ToStringApply3[I2 <: TupleTag, I3 <: TypeHList] {
    def app: Application[IContext, I2, I3]
    def encode[Model](ii: Model => I3#H, name: I3#T#H): ListEncoder[Model] = new ListEncoder[Model] {
      override def encode(model: Model): List[(PropertyItem, String)] = {
        app.application(i)(ii(model), name).init(List.empty)
      }
    }
  }*/

  implicit val tupleImplicit1: Application[TContext, String, TypeHList1[String]] = new Application[TContext, String, TypeHList1[String]] {
    override def application(context: Context[TContext]): TupleEncoder[String] = {
      new TupleEncoder[String] {
        override def apply(model: String, appendable: List[String]): List[String] = model :: appendable
        override def body(model: String): String                                  = model
      }
    }
  }

  implicit val tupleImplicit2: Application[TContext, Int, TypeHList1[Int]] = new Application[TContext, Int, TypeHList1[Int]] {
    override def application(context: Context[TContext]): TupleEncoder[Int] = {
      new TupleEncoder[Int] {
        override def apply(model: Int, appendable: List[String]): List[String] = String.valueOf(model) :: appendable
        override def body(model: Int): String                                  = String.valueOf(model)
      }
    }
  }

  implicit val tupleImplicit3: Application[TContext, Long, TypeHList1[Long]] = new Application[TContext, Long, TypeHList1[Long]] {
    override def application(context: Context[TContext]): TupleEncoder[Long] = {
      new TupleEncoder[Long] {
        override def apply(model: Long, appendable: List[String]): List[String] = String.valueOf(model) :: appendable
        override def body(model: Long): String                                  = String.valueOf(model)
      }
    }
  }

}
