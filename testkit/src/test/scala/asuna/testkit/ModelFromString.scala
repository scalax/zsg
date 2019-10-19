package asuna.testkit

import asuna.macros.{AsunaGeneric, AsunaGetterGeneric, AsunaLabelledGeneric, AsunaSetterGeneric, PropertyTag}
import asuna.{AppendTag, Application, AsunaTuple0, Context, KindContext, Plus, TupleTag, TypeHList, TypeHList2}

trait ModelFromString[M, N] {
  def init(name: N): ModelDecoder[M]
}

trait ModelDecoder[M] {
  def init(str: String): (String, M)
}

class MContext extends KindContext {

  override type M[T <: TypeHList] = ModelFromString[T#H, T#T#H]

}

object decoderContext extends Context[MContext] {

  override def isReverse: Boolean = false

  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
    x: ModelFromString[X#H, X#T#H],
    y: ModelFromString[Y#H, Y#T#H],
    p: Plus[X, Y, Z]
  ): ModelFromString[Z#H, Z#T#H] = {
    (i2: Z#T#H) =>
      { (str: String) =>
        val t1         = x.init(p.sub.takeHead(i2))
        val t2         = y.init(p.sub.takeTail(i2))
        val (str1, d1) = t1.init(str)
        val (str2, d2) = t2.init(str1)
        (str2, p.plus(d1, d2))
      }
  }

  override def start: ModelFromString[AsunaTuple0, AsunaTuple0] = {
    i1: AsunaTuple0 =>
      { str: String =>
        (str, AsunaTuple0)
      }
  }

}

object out {

  def decoder[I1, I2 <: TupleTag, I3 <: TypeHList](
    implicit ii: AsunaGeneric.Aux[I1, I2],
    pp: Application[MContext, I2, I3],
    asunaSetterGeneric: AsunaSetterGeneric[I1, I3#H],
    asunaLabelledGeneric: AsunaLabelledGeneric[I1, I3#T#H]
  ): ModelDecoder[I1] = {
    { str: String =>
      val c         = pp.application(decoderContext)
      val i3        = c.init(asunaLabelledGeneric.names.withContext(decoderContext))
      val (str1, m) = i3.init(str)
      (str1, asunaSetterGeneric.setter(m))
    }
  }

  def reverseDecoder[I1, I2 <: TupleTag, I3 <: TypeHList](
    implicit ii: AsunaGeneric.Aux[I1, I2],
    pp: Application[MContext, I2, I3],
    asunaSetterGeneric: AsunaSetterGeneric[I1, I3#H],
    asunaLabelledGeneric: AsunaLabelledGeneric[I1, I3#T#H]
  ): ModelDecoder[I1] = {
    { str: String =>
      val reverseContext = decoderContext.reverse
      val c              = pp.application(reverseContext)
      val i3             = c.init(asunaLabelledGeneric.names.withContext(reverseContext))
      val (str1, m)      = i3.init(str)
      (str1, asunaSetterGeneric.setter(m))
    }
  }

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

  implicit val outImplicit1: Application[MContext, PropertyTag[String], TypeHList2[String, String]] =
    new Application[MContext, PropertyTag[String], TypeHList2[String, String]] {
      override def application(context: Context[MContext]): ModelFromString[String, String] = {
        new ModelFromString[String, String] {
          override def init(name: String): ModelDecoder[String] = {
            new ModelDecoder[String] {
              override def init(str: String): (String, String) = {
                val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
                val str2 = str1.takeWhile(s => s != ')')
                val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
                (str3, str2)
              }
            }
          }
        }
      }
    }

  implicit val outImplicit2: Application[MContext, PropertyTag[Int], TypeHList2[Int, String]] = new Application[MContext, PropertyTag[Int], TypeHList2[Int, String]] {
    override def application(context: Context[MContext]): ModelFromString[Int, String] = {
      new ModelFromString[Int, String] {
        override def init(name: String): ModelDecoder[Int] = {
          new ModelDecoder[Int] {
            override def init(str: String): (String, Int) = {
              val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
              val str2 = str1.takeWhile(s => s != ')')
              val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
              (str3, str2.toInt)
            }
          }
        }
      }
    }
  }

  implicit val outImplicit3: Application[MContext, PropertyTag[Long], TypeHList2[Long, String]] = new Application[MContext, PropertyTag[Long], TypeHList2[Long, String]] {
    override def application(context: Context[MContext]): ModelFromString[Long, String] = {
      new ModelFromString[Long, String] {
        override def init(name: String): ModelDecoder[Long] = {
          new ModelDecoder[Long] {
            override def init(str: String): (String, Long) = {
              val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
              val str2 = str1.takeWhile(s => s != ')')
              val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
              (str3, str2.toLong)
            }
          }
        }
      }
    }
  }

}
