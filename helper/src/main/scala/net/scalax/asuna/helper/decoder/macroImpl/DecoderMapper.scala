package net.scalax.asuna.helper.decoder.macroImpl

import net.scalax.asuna.core.common.{ DelayTag, Placeholder }
import net.scalax.asuna.core.decoder.{ DecoderShape, DecoderShapeValue }
import net.scalax.asuna.helper.{ MacroColumnInfo, MacroColumnInfoContent, MacroColumnInfoImpl }
import net.scalax.asuna.helper.decoder.DecoderHelper
import net.scalax.asuna.shape.ShapeHelper

import scala.annotation.implicitNotFound
import scala.reflect.macros.blackbox.Context
import scala.language.higherKinds

trait PropertyType[Pro] {
  def delay[Abs]: DelayTag[Pro, Abs] = new DecoderHelper[Abs] {}.delay[Pro]
  def convertData(f: Any): Pro = f.asInstanceOf[Pro]
  def toPlaceholder: Placeholder[Pro] = Placeholder.value[Pro]
}

trait ModelGen[Model] {
  def apply[Pro](f: Model => Pro): PropertyType[Pro] = new PropertyType[Pro] {}
}

trait PropertyFunAbs[Abs] {
  self =>

  type Rep
  type Data
  type Out
  val rep: Rep
  val shape: DecoderShape[Rep, Data, Out, Abs]
  def sv: DecoderShapeValue[Data, Abs] = new DecoderShapeValue[Data, Abs] {
    override type RepType = self.Out
    override val rep: self.Out = self.shape.wrapRep(self.rep)
    override val shape: DecoderShape[self.Out, Data, self.Out, Abs] = self.shape.packed
  }
}

trait PropertyFun[R, D, O, Abs] extends PropertyFunAbs[Abs] {
  override type Rep = R
  override type Data = D
  override type Out = O
}

trait ProGen[A, B, C, PL, Abs] {
  protected def innperPro: PropertyFun[A, B, C, Abs]
  def unwrap(implicit pl: PL): PropertyFun[A, B, C, Abs] = innperPro
}

trait PropertyDataShapeUnwrap[R[_, _, _], Source, Table, Abs] {
  def unwrap(implicit cv: R[Source, Table, Abs]): R[Source, Table, Abs] = cv
}

object DecoderMapper {

  class DecoderMapperImpl(override val c: Context) extends MacroUtils.MacroUtilImpl {
    self =>

    import c.universe._

    def commonProUseInShape[Abs: c.WeakTypeTag, Table: c.WeakTypeTag, Model: c.WeakTypeTag](fieldName: String, modelName: TermName, isMissingField: Boolean) = {
      val traitName = c.freshName(fieldName + "ProShape") //s"$proName-pro-shape-trait"
      val defName = c.freshName(fieldName + "Gen")
      val columnInfoWrapTraitName = c.freshName(fieldName)
      val propertyType = weakTypeOf[PropertyType[_]]
      val decoderShape = weakTypeOf[DecoderShape[_, _, _, _]]
      val proGen = weakTypeOf[ProGen[_, _, _, _, _]]
      val propertyFun = weakTypeOf[PropertyFun[_, _, _, _]]
      val abs = weakTypeOf[Abs]
      val implicitNotFound = weakTypeOf[implicitNotFound]
      val macroColumnInfoContent = weakTypeOf[MacroColumnInfoContent]

      val columnInfo = weakTypeOf[MacroColumnInfo]
      val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]

      val wtTT = c.weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[Table]]
      val wtMT = c.weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[Model]]

      val wtTRT = c.weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[() => String]]
      val wtMRT = c.weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[() => String]]
      /*q"""
      val ${TermName(fieldName)} = {
        @$implicitNotFound(msg = "属性 id 中，Shape 的数据类型 $${ShapeData} 和实体类的数据类型 $${ProData} 不对应")
        trait ${TypeName(traitName)}[ShapeData, ProData]
        object ${TermName(traitName)} {
          implicit def propertyImplicit1[S, T](implicit cv: S <:< T): ${TypeName(traitName)}[S, T] = new ${TypeName(traitName)}[S, T] {}
        }
        implicit val ${TermName(c.freshName)}: $columnInfo = ${columnInfoImpl.typeSymbol.companion}(
          tableColumnName = ${Literal(Constant(fieldName))},
          modelColumnName = ${Literal(Constant(fieldName))},
          tableWeakTypeTag = _root_.scala.Predef.implicitly[${wtTT}],
          modelTag = _root_.scala.Predef.implicitly[${wtMT}],
          tableRepWeakTypeTag = _root_.scala.Predef.implicitly[${wtTRT}],
          modelRepTag = _root_.scala.Predef.implicitly[${wtMRT}]
        )
        def ${TermName(defName)}[A, B, C, D](rep: A, pro: ${propertyType.typeSymbol}[D])(implicit shape: ${decoderShape.typeSymbol}[A, B, C, $abs]): ${proGen.typeSymbol}[A, B, C, ${TypeName(traitName)}[B, D], $abs] = {
          new ${proGen.typeSymbol}[A, B, C, ${TypeName(traitName)}[B, D], $abs] {
            override protected def innperPro: ${propertyFun.typeSymbol}[A, B, C, $abs] = {
              val rep1 = rep
              val shape1 = shape
              new ${propertyFun.typeSymbol}[A, B, C, $abs] {
                override val rep: A = rep1
                override val shape = shape1
              }
            }
          }
        }
        ${TermName(defName)}(${modelName}.${TermName(fieldName)}, mg(_.${TermName(fieldName)})).unwrap.sv
      }
      """*/
      q"""
      val ${TermName(fieldName)} = {
        @$implicitNotFound(msg = ${Literal(Constant(s"属性 ${TermName} 中，Shape 的数据类型 $${ShapeData} 和实体类的数据类型 $${ProData} 不对应"))})
        trait ${TypeName(traitName)}[ShapeData, ProData]
        object ${TermName(traitName)} {
          implicit def propertyImplicit1[S, T](implicit cv: T <:< S): ${TypeName(traitName)}[S, T] = new ${TypeName(traitName)}[S, T] {}
        }
        def ${TermName(defName)}[A, B, C, D](rep: A, pro: ${propertyType.typeSymbol}[D])(implicit shape: ${decoderShape.typeSymbol}[A, B, C, $abs]): ${proGen.typeSymbol}[A, B, C, ${TypeName(traitName)}[B, D], $abs] = {
          new ${proGen.typeSymbol}[A, B, C, ${TypeName(traitName)}[B, D], $abs] {
            override protected def innperPro: ${propertyFun.typeSymbol}[A, B, C, $abs] = {
              val rep1 = rep
              val shape1 = shape
              new ${propertyFun.typeSymbol}[A, B, C, $abs] {
                override val rep: A = rep1
                override val shape = shape1
              }
            }
          }
        }

        trait ${TypeName(columnInfoWrapTraitName)} extends $macroColumnInfoContent {

        def output = ${
        if (isMissingField) {
          q"""${TermName(defName)}(mg(_.${TermName(fieldName)}).toPlaceholder, mg(_.${TermName(fieldName)})).unwrap.sv"""
        } else {
          q"""${TermName(defName)}(${modelName}.${TermName(fieldName)}, mg(_.${TermName(fieldName)})).unwrap.sv"""
        }
      }
        }

        object ${TermName(columnInfoWrapTraitName)} extends ${TypeName(columnInfoWrapTraitName)} {
          override implicit def columnInfo = ${columnInfoImpl.typeSymbol.companion}(
            tableColumnName = ${Literal(Constant(fieldName))},
            modelColumnName = ${Literal(Constant(fieldName))}
          )
        }

        ${TermName(columnInfoWrapTraitName)}.output
      }
      """
    }

    def impl[Table: c.WeakTypeTag, Case: c.WeakTypeTag, Abs: c.WeakTypeTag]: c.Expr[Table => DecoderShapeValue[Case, Abs]] = {
      val caseClass = weakTypeOf[Case]
      val table = weakTypeOf[Table]
      val modelGen = weakTypeOf[ModelGen[Case]]
      val allHelper = weakTypeOf[DecoderHelper[Abs]]
      val shapeHelper = weakTypeOf[ShapeHelper]

      //val fieldNameStrs = caseClass.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.map(_.name).collect { case TermName(n) => n.trim }.toList
      val modelFieldNames = caseClass.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.map(_.name).collect { case TermName(n) => n.trim }.toList
      val fieldNamesInTable = table.members.filter { s => s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod) }.map(_.name).collect { case TermName(n) => n.trim }.toList
      val misFieldsInTable = modelFieldNames.filter(n => !fieldNamesInTable.contains(n))

      def mgDef = q"""
          lazy val mg: $modelGen = new $modelGen {}
        """

      def toShape(namePare: List[String]) = {
        val proNames = namePare
        val listSymbol = weakTypeOf[List[_]].typeSymbol.companion
        val proSuffix = c.freshName

        val pqMatch = pq"""$listSymbol(..${proNames.map(fName => pq"""${TermName(fName + proSuffix)} @ (_: Any)""")})"""
        q"""
          new $allHelper{ }.shaped(
            List(..${proNames.map(fName => q"""${TermName(fName)}.dmap(s => s: Any)""")})
          ).dmap { case $pqMatch =>
            ${caseClass.typeSymbol.companion}(..${proNames.map(fName => q"""${TermName(fName)} = mg(_.${TermName(fName)}).convertData(${TermName(fName + proSuffix)})""")})
          }"""
      }

      val q = c.Expr[Table => DecoderShapeValue[Case, Abs]] {
        val repModelTermName = c.freshName
        q"""
          { (${TermName(repModelTermName)}: $table) =>
            object CaseClassGenImpl extends $shapeHelper {
              $mgDef
              ..${modelFieldNames.map { proName => commonProUseInShape[Abs, Table, Case](fieldName = proName, modelName = TermName(repModelTermName), isMissingField = misFieldsInTable.contains(proName)) }}
              val dataShapeValue = ${toShape(modelFieldNames)}
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