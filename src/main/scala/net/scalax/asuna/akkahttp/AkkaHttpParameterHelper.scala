package net.scalax.asuna.akkahttp

import akka.http.scaladsl.server.directives.FormFieldDirectives.FieldMagnet
import akka.http.scaladsl.server.directives.{FormFieldDirectives, ParameterDirectives}
import akka.http.scaladsl.server.directives.ParameterDirectives.ParamMagnet
import akka.http.scaladsl.server.{Directive, Directive1, Route}
import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import net.scalax.asuna.helper.decoder.{DecoderContent, DecoderHelper, DecoderWrapperHelper}
import net.scalax.asuna.helper.encoder.RepColumnContent

trait AkkaFormFieldWrapAbs {

  type DataType
  val directive: Directive1[DataType]

}

trait AkkaFormFieldWrap[D] extends AkkaFormFieldWrapAbs {
  self =>

  override type DataType = D

  def map[R](r: D => R): AkkaFormFieldWrap[R] = {
    new AkkaFormFieldWrap[R] {
      override val directive: Directive1[R] = {
        self.directive.map(t => Tuple1(r(t)))
      }
    }
  }

}

trait ParameterWithName[D] {
  self =>

  def withName(name: String): Directive1[D]

  def map[R](r: D => R): ParameterWithName[R] = new ParameterWithName[R] {
    override def withName(name: String): Directive1[R] = self.withName(name).map(d => Tuple1(r(d)))
  }

}

trait LiteralColumn[D] {
  self =>

  def data: D

  def map[R](r: D => R): LiteralColumn[R] = new LiteralColumn[R] {
    override def data = r(self.data)
  }

}

trait AkkaHttpParameterHelper {

  trait FieldWrapExecable[Out, DataType] extends DecoderContent[Out, DataType] {
    def toDirective: Directive1[DataType]
  }

  object akkahttp
      extends DecoderHelper[List[AkkaFormFieldWrapAbs], List[Any]]
      with DecoderWrapperHelper[List[AkkaFormFieldWrapAbs], List[Any], FieldWrapExecable] {
    override def effect[Rep, D, Out](
        rep: Rep
    )(implicit shape: DecoderShape.Aux[Rep, D, Out, List[AkkaFormFieldWrapAbs], List[Any]]): FieldWrapExecable[Out, D] = {
      new FieldWrapExecable[Out, D] {
        override def toDirective: Directive1[D] = {
          val reps = shape.toLawRep(shape.wrapRep(rep), List.empty)
          reps
            .foldLeft(Directive { (gen: Tuple1[List[Any]] => Route) =>
              gen(Tuple1(List.empty[Any]))
            }) { (head, item) =>
              item.directive.flatMap { data =>
                head.map(h => Tuple1(data :: h))
              }
            }
            .map(list => Tuple1(shape.takeData(shape.wrapRep(rep), list.reverse).current))
        }
      }
    }
  }

  implicit def akkahttpParameterWithNameImplicit[D]
    : DecoderShape.Aux[RepColumnContent[ParameterWithName[D], D], D, AkkaFormFieldWrap[D], List[AkkaFormFieldWrapAbs], List[Any]] = {
    new DecoderShape[RepColumnContent[ParameterWithName[D], D], List[AkkaFormFieldWrapAbs], List[Any]] {
      override type Target = AkkaFormFieldWrap[D]
      override type Data   = D
      override def wrapRep(base: RepColumnContent[ParameterWithName[D], D]): AkkaFormFieldWrap[D] = new AkkaFormFieldWrap[D] {
        override val directive: Directive1[D] = base.rep.withName(base.columnInfo.modelColumnName)
      }
      override def toLawRep(base: AkkaFormFieldWrap[D], oldRep: List[AkkaFormFieldWrapAbs]): List[AkkaFormFieldWrapAbs] = base :: oldRep
      override def takeData(rep: AkkaFormFieldWrap[D], oldData: List[Any]): SplitData[D, List[Any]]                     = SplitData(oldData.head.asInstanceOf[D], oldData.tail)
    }
  }

  implicit def akkahttpDirective1Implicit[D]: DecoderShape.Aux[Directive1[D], D, AkkaFormFieldWrap[D], List[AkkaFormFieldWrapAbs], List[Any]] = {
    new DecoderShape[Directive1[D], List[AkkaFormFieldWrapAbs], List[Any]] {
      override type Target = AkkaFormFieldWrap[D]
      override type Data   = D
      override def wrapRep(base: Directive1[D]): AkkaFormFieldWrap[D] = new AkkaFormFieldWrap[D] {
        override val directive: Directive1[D] = base
      }
      override def toLawRep(base: AkkaFormFieldWrap[D], oldRep: List[AkkaFormFieldWrapAbs]): List[AkkaFormFieldWrapAbs] = base :: oldRep
      override def takeData(rep: AkkaFormFieldWrap[D], oldData: List[Any]): SplitData[D, List[Any]]                     = SplitData(oldData.head.asInstanceOf[D], oldData.tail)
    }
  }

  implicit def akkahttpPlaceholderImplicit[D](
      implicit fsu: akka.http.scaladsl.unmarshalling.FromStrictFormFieldUnmarshaller[D]
  ): DecoderShape.Aux[RepColumnContent[Placeholder[D], D], D, AkkaFormFieldWrap[D], List[AkkaFormFieldWrapAbs], List[Any]] = {
    new DecoderShape[RepColumnContent[Placeholder[D], D], List[AkkaFormFieldWrapAbs], List[Any]] {
      override type Target = AkkaFormFieldWrap[D]
      override type Data   = D
      override def wrapRep(base: RepColumnContent[Placeholder[D], D]): AkkaFormFieldWrap[D] = new AkkaFormFieldWrap[D] {
        override val directive: Directive1[D] = helper.formFieldAs[D].withName(base.columnInfo.modelColumnName)
      }
      override def toLawRep(base: AkkaFormFieldWrap[D], oldRep: List[AkkaFormFieldWrapAbs]): List[AkkaFormFieldWrapAbs] = base :: oldRep
      override def takeData(rep: AkkaFormFieldWrap[D], oldData: List[Any]): SplitData[D, List[Any]]                     = SplitData(oldData.head.asInstanceOf[D], oldData.tail)
    }
  }

  implicit def akkahttpLiteralColumnImplicit[D]: DecoderShape.Aux[LiteralColumn[D], D, LiteralColumn[D], List[AkkaFormFieldWrapAbs], List[Any]] = {
    new DecoderShape[LiteralColumn[D], List[AkkaFormFieldWrapAbs], List[Any]] {
      override type Target = LiteralColumn[D]
      override type Data   = D
      override def wrapRep(base: LiteralColumn[D]): LiteralColumn[D]                                                = base
      override def toLawRep(base: LiteralColumn[D], oldRep: List[AkkaFormFieldWrapAbs]): List[AkkaFormFieldWrapAbs] = oldRep
      override def takeData(rep: LiteralColumn[D], oldData: List[Any]): SplitData[D, List[Any]]                     = SplitData(rep.data, oldData)
    }
  }

  trait Helper {

    import akka.http.scaladsl._
    import akka.http.scaladsl.server.Directives

    object LiteralColumn {
      def apply[D](d: D): LiteralColumn[D] = new LiteralColumn[D] {
        override def data: D = d
      }
    }

    def parameter: ParameterWithName[String] = new ParameterWithName[String] {
      override def withName(name: String): Directive1[String] = {
        Directives.parameter(name)
      }
    }

    def parameterAs[T](implicit fsu: unmarshalling.FromStringUnmarshaller[T]): ParameterWithName[T] = new ParameterWithName[T] {
      override def withName(name: String): Directive1[T] = {
        import Directives._
        Directives.parameter(ParamMagnet(name.as[T])(ParameterDirectives.ParamDef.forNR(fsu)))
      }
    }

    def formField: ParameterWithName[String] = new ParameterWithName[String] {
      override def withName(name: String): Directive1[String] = {
        Directives.formField(name)
      }
    }

    def formFieldAs[T](implicit fsu: unmarshalling.FromStrictFormFieldUnmarshaller[T]): ParameterWithName[T] = new ParameterWithName[T] {
      override def withName(name: String): Directive1[T] = {
        import Directives._
        Directives.formField(FieldMagnet(name.as[T])(FormFieldDirectives.FieldDef.forNR(fsu)))
      }
    }

    def cookie: ParameterWithName[String] = new ParameterWithName[String] {
      override def withName(name: String): Directive1[String] = {
        Directives.cookie(name).map(pair => Tuple1(pair.value))
      }
    }

    def optionalCookie: ParameterWithName[Option[String]] = new ParameterWithName[Option[String]] {
      override def withName(name: String): Directive1[Option[String]] = {
        Directives.optionalCookie(name).map(optPair => Tuple1(optPair.map(_.value)))
      }
    }

  }

  object helper extends Helper

}
