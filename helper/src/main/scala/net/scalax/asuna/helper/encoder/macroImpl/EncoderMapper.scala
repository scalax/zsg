package net.scalax.asuna.helper.encoder.macroImpl

import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }
import net.scalax.asuna.helper.{ ColumnInfo, ColumnInfoImpl }
import net.scalax.asuna.helper.decoder.macroImpl.{ ModelGen, PropertyType }
import net.scalax.asuna.helper.encoder.{ EncoderHelper, HListEncoderShapeImplicit }
import net.scalax.asuna.shape.ShapeHelper

import scala.annotation.implicitNotFound
import scala.reflect.macros.blackbox.Context

object EncoderMapper {

  trait PropertyEncoderFunAbs[Abs] {
    self =>

    type Rep
    type Data
    type Out
    val rep: Rep
    val shape: EncoderShape[Rep, Data, Out, Abs]
    def sv: EncoderShapeValue[Data, Abs] = new EncoderShapeValue[Data, Abs] {
      override type RepType = self.Out
      override val rep: self.Out = self.shape.wrapRep(self.rep)
      override val shape = self.shape.packed
    }
  }

  trait PropertyEncoderFun[R, D, O, Abs] extends PropertyEncoderFunAbs[Abs] {
    override type Rep = R
    override type Data = D
    override type Out = O
  }

  trait EncoderProGen[A, B, C, PL, Abs] {
    protected def innperPro: PropertyEncoderFun[A, B, C, Abs]
    def unwrap(implicit pl: PL): PropertyEncoderFun[A, B, C, Abs] = innperPro
  }

  class EncoderMapperImpl(val c: Context) {
    self =>

    import c.universe._

    def commonProUseInShape[Abs: c.WeakTypeTag, Table: c.WeakTypeTag, Model: c.WeakTypeTag](fieldName: String, modelName: TermName, isOutPutSub: Boolean) = {
      val traitName = c.freshName(fieldName + "ProShape") //s"$proName-pro-shape-trait"
      val defName = c.freshName(fieldName + "Gen")
      val propertyType = weakTypeOf[PropertyType[_]]
      val encoderShape = weakTypeOf[EncoderShape[_, _, _, _]]
      val proGen = weakTypeOf[EncoderProGen[_, _, _, _, _]]
      val propertyEncoderFun = weakTypeOf[PropertyEncoderFun[_, _, _, _]]
      val abs = weakTypeOf[Abs]
      val implicitNotFound = weakTypeOf[implicitNotFound]
      val columnInfo = weakTypeOf[ColumnInfo]
      val columnInfoImpl = weakTypeOf[ColumnInfoImpl[_, _, _, _]]

      val wtTT = c.weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[Table]]
      val wtMT = c.weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[Model]]

      val wtTRT = c.weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[() => String]]
      val wtMRT = c.weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[() => String]]

      q"""
      val ${TermName(fieldName)} = {
        @$implicitNotFound(msg = "属性 id 中，Shape 的数据类型 $${ShapeData} 和实体类的数据类型 $${ProData} 不对应")
        trait ${TypeName(traitName)}[ShapeData, ProData]
        object ${TermName(traitName)} {
          implicit def propertyImplicit1[S, T](implicit cv: T <:< S): ${TypeName(traitName)}[S, T] = new ${TypeName(traitName)}[S, T] {}
        }
        implicit val ${TermName(c.freshName)}: $columnInfo = ${columnInfoImpl.typeSymbol.companion}(
             tableColumnName = ${Literal(Constant(fieldName))},
             modelColumnName = ${Literal(Constant(fieldName))},
             tableWeakTypeTag = _root_.scala.Predef.implicitly[${wtTT}],
             modelTag = _root_.scala.Predef.implicitly[${wtMT}],
             tableRepWeakTypeTag = _root_.scala.Predef.implicitly[${wtTRT}],
             modelRepTag = _root_.scala.Predef.implicitly[${wtMRT}]
        )
        def ${TermName(defName)}[A, B, C, D](rep: A, pro: ${propertyType.typeSymbol}[D])(implicit shape: ${encoderShape.typeSymbol}[A, B, C, $abs]): ${proGen.typeSymbol}[A, B, C, ${TypeName(traitName)}[B, D], $abs] = {
          new ${proGen.typeSymbol}[A, B, C, ${TypeName(traitName)}[B, D], $abs] {
            override protected def innperPro: ${propertyEncoderFun.typeSymbol}[A, B, C, $abs] = {
              val rep1 = rep
              val shape1 = shape
              new ${propertyEncoderFun.typeSymbol}[A, B, C, $abs] {
                override val rep: A = rep1
                override val shape = shape1
              }
            }
          }
        }
        ${TermName(defName)}(${modelName}.${TermName(fieldName)}, mg(_.${TermName(fieldName)})).unwrap.sv
      }
      """
    }

    def impl[Table: c.WeakTypeTag, Case: c.WeakTypeTag, Abs: c.WeakTypeTag]: c.Expr[Table => EncoderShapeValue[Case, Abs]] = {
      val caseClass = weakTypeOf[Case]
      val table = weakTypeOf[Table]
      val modelGen = weakTypeOf[ModelGen[Case]]
      val allHelper = weakTypeOf[EncoderHelper[Abs]]

      val shapeHelper = weakTypeOf[ShapeHelper]
      val hListEncoderShapeImplicit = weakTypeOf[HListEncoderShapeImplicit]

      val fieldNames = caseClass.members.collect { case s if s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal => s.name }.toList
      val fieldNameStrs = fieldNames.map(_.toString.trim)

      def mgDef = q"""
          lazy val mg: $modelGen = new $modelGen {}
        """

      def toShape(namePare: List[String]) = {
        val proNames = namePare
        val termVar1 = TermName(c.freshName)
        val func = q"""
        { ($termVar1: $caseClass) =>
          ${proNames.reverse.foldLeft(q"_root_.shapeless.HNil": Tree)((f, b) => q"_root_.shapeless.::($termVar1.${TermName(b)}, $f)")}
        }
        """

        q"""
        new $allHelper{ }.shaped(
          ${proNames.reverse.foldLeft(q"_root_.shapeless.HNil": Tree)((f, b) => q"_root_.shapeless.::(${TermName(b)}, $f)")}
        ).emap($func)
        """
      }

      val q = c.Expr[Table => EncoderShapeValue[Case, Abs]] {
        val repModelTermName = c.freshName
        q"""
          { (${TermName(repModelTermName)}: $table) =>
            object CaseClassGenImpl extends $shapeHelper with $hListEncoderShapeImplicit {
              $mgDef
              ..${fieldNameStrs.map { case proName => commonProUseInShape[Abs, Table, Case](fieldName = proName, modelName = TermName(repModelTermName), isOutPutSub = false) }}
              val dataShapeValue = ${toShape(fieldNameStrs)}
            }
            CaseClassGenImpl.dataShapeValue
          }
        """
      }
      //println(q)
      q
    }

  }

}