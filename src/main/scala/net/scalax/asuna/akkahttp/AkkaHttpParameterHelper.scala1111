package net.scalax.asuna.akkahttp

import akka.http.scaladsl.server.directives.FormFieldDirectives.FieldMagnet
import akka.http.scaladsl.server.directives.{ FormFieldDirectives, ParameterDirectives }
import akka.http.scaladsl.server.directives.ParameterDirectives.ParamMagnet
import akka.http.scaladsl.server.{ Directive, Directive1, Route }
import net.scalax.asuna.core.common.{ AtomicColumn, DataGroup, DataRepGroup, Placeholder }
import net.scalax.asuna.core.decoder.{ DecoderShape, SplitData }
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.decoder.{ DecoderContent, DecoderHelper, DecoderWrapperHelper }

trait AkkaFormFieldWrapAbs {

  type DataType
  val directive: Directive1[DataType]

}

trait AkkaFormFieldWrap[D] extends AkkaFormFieldWrapAbs with AtomicColumn[D, AkkaFormFieldWrapAbs] {
  self =>

  override def common: AkkaFormFieldWrapAbs = self

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

  object akkahttp extends DecoderHelper[AkkaFormFieldWrapAbs] with DecoderWrapperHelper[AkkaFormFieldWrapAbs, FieldWrapExecable] {
    override def effect[Rep, D, Out](rep: Rep)(implicit shape: DecoderShape[Rep, D, Out, AkkaFormFieldWrapAbs]): FieldWrapExecable[Out, D] = {
      new FieldWrapExecable[Out, D] {
        override def toDirective: Directive1[D] = {
          val reps = shape.toLawRep(shape.wrapRep(rep)).reps
          reps.foldLeft(Directive { (gen: Tuple1[List[Any]] => Route) => gen(Tuple1(List.empty[Any])) }) { (head, item) =>
            item.directive.flatMap { data => head.map(h => Tuple1(data :: h)) }
          }.map(list => Tuple1(shape.takeData(DataGroup(list.reverse), shape.wrapRep(rep)).current))
        }
      }
    }
  }

  implicit def akkahttpParameterWithNameImplicit[D](implicit macroColumnInfo: MacroColumnInfo): DecoderShape[ParameterWithName[D], D, AkkaFormFieldWrap[D], AkkaFormFieldWrapAbs] = {
    new DecoderShape[ParameterWithName[D], D, AkkaFormFieldWrap[D], AkkaFormFieldWrapAbs] {
      override def wrapRep(base: ParameterWithName[D]): AkkaFormFieldWrap[D] = new AkkaFormFieldWrap[D] {
        override val directive: Directive1[D] = base.withName(macroColumnInfo.modelColumnName)
      }
      override def toLawRep(base: AkkaFormFieldWrap[D]): DataRepGroup[AkkaFormFieldWrapAbs] = DataRepGroup(List(base))
      override def takeData(oldData: DataGroup, rep: AkkaFormFieldWrap[D]): SplitData[D] = SplitData(oldData.items.head.asInstanceOf[D], DataGroup(oldData.items.tail))
    }
  }

  implicit def akkahttpDirective1Implicit[D]: DecoderShape[Directive1[D], D, AkkaFormFieldWrap[D], AkkaFormFieldWrapAbs] = {
    new DecoderShape[Directive1[D], D, AkkaFormFieldWrap[D], AkkaFormFieldWrapAbs] {
      override def wrapRep(base: Directive1[D]): AkkaFormFieldWrap[D] = new AkkaFormFieldWrap[D] {
        override val directive: Directive1[D] = base
      }
      override def toLawRep(base: AkkaFormFieldWrap[D]): DataRepGroup[AkkaFormFieldWrapAbs] = DataRepGroup(List(base))
      override def takeData(oldData: DataGroup, rep: AkkaFormFieldWrap[D]): SplitData[D] = SplitData(oldData.items.head.asInstanceOf[D], DataGroup(oldData.items.tail))
    }
  }

  implicit def akkahttpPlaceholderImplicit[D](implicit macroColumnInfo: MacroColumnInfo, fsu: akka.http.scaladsl.unmarshalling.FromStrictFormFieldUnmarshaller[D]): DecoderShape[Placeholder[D], D, AkkaFormFieldWrap[D], AkkaFormFieldWrapAbs] = {
    new DecoderShape[Placeholder[D], D, AkkaFormFieldWrap[D], AkkaFormFieldWrapAbs] {
      override def wrapRep(base: Placeholder[D]): AkkaFormFieldWrap[D] = new AkkaFormFieldWrap[D] {
        override val directive: Directive1[D] = helper.formFieldAs[D].withName(macroColumnInfo.modelColumnName)
      }
      override def toLawRep(base: AkkaFormFieldWrap[D]): DataRepGroup[AkkaFormFieldWrapAbs] = DataRepGroup(List(base))
      override def takeData(oldData: DataGroup, rep: AkkaFormFieldWrap[D]): SplitData[D] = SplitData(oldData.items.head.asInstanceOf[D], DataGroup(oldData.items.tail))
    }
  }

  implicit def akkahttpLiteralColumnImplicit[D]: DecoderShape[LiteralColumn[D], D, LiteralColumn[D], AkkaFormFieldWrapAbs] = {
    new DecoderShape[LiteralColumn[D], D, LiteralColumn[D], AkkaFormFieldWrapAbs] {
      override def wrapRep(base: LiteralColumn[D]): LiteralColumn[D] = base
      override def toLawRep(base: LiteralColumn[D]): DataRepGroup[AkkaFormFieldWrapAbs] = DataRepGroup(List.empty)
      override def takeData(oldData: DataGroup, rep: LiteralColumn[D]): SplitData[D] = SplitData(rep.data, oldData)
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