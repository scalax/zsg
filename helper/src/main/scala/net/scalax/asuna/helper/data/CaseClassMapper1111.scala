package net.scalax.asuna.helper.data.macroImpl

import java.util.UUID

import net.scalax.asuna.helper.decoder.macroImpl.ModelGen
import net.scalax.asuna.helper.MacroColumnInfoImpl
import net.scalax.asuna.helper.encoder.{EncoderWitCol, InputTable}
import net.scalax.asuna.helper.mapper.CaseClassMapper
import net.scalax.asuna.helper.template.CaseClassDataHelper

import scala.annotation.tailrec

object CaseClassMapperMacro {

  val maxNum = 4

  case class FieldNames(law: String, shapeValueName: String, lawIndex: Int, helperIndex: Int, needInput: Boolean, needSub: Boolean, usePlaceHolder: Boolean)

  class DecoderMapperImpl(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    def caseclassDecoderGeneric[Input: c.WeakTypeTag, Output: c.WeakTypeTag, Sub: c.WeakTypeTag, Table: c.WeakTypeTag, Rep: c.WeakTypeTag, TempData: c.WeakTypeTag]
      : c.Expr[InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]] = {
      val rep                 = weakTypeOf[Rep]
      val tempData            = weakTypeOf[TempData]
      val input               = weakTypeOf[Input]
      val output              = weakTypeOf[Output]
      val sub                 = weakTypeOf[Sub]
      val table               = weakTypeOf[Table]
      val outputModelGen      = weakTypeOf[ModelGen[Output]]
      val columnInfoImpl      = weakTypeOf[MacroColumnInfoImpl]
      val caseClassDataHelper = weakTypeOf[CaseClassDataHelper]
      val encoderWitColType   = weakTypeOf[EncoderWitCol]
      val lazyData            = weakTypeOf[LazyData[Input, Output, Sub]]
      val inputTable          = weakTypeOf[InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]]

      val mgVar    = "mg" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")
      val tableVar = "table" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")

      val inputFieldNames = input.members
        .filter { s =>
          s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod)
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList
      val outputFieldNames = output.members
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList
        .reverse
      val subFieldNames = sub.members
        .filter { s =>
          s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod)
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList
      val tableFieldNames = table.members
        .filter { s =>
          s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod)
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList

      def mgDef = List(q"""
        val ${TermName(mgVar)}: $outputModelGen = ${outputModelGen.typeSymbol.companion}.value[$output]
        """)

      def propertyName(name: String) =
        q"""
           ${TermName(mgVar)}(_.${TermName(name)})
         """

      def commonProUseInShape(modelName: String, fieldName: FieldNames, usePlaceHolder: Boolean) = {
        val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]

        val q1 =
          q"""
        {
            ${if (usePlaceHolder) {
            q"""
            ${encoderWitColType.typeSymbol.companion}.toWrap(${TermName(mgVar)}(_.${TermName(fieldName.law)}).toPlaceholder, ${TermName(mgVar)}(_.${TermName(fieldName.law)}), ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(fieldName.law))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(fieldName.law))}),
              modelColumnName = ${Literal(Constant(fieldName.law))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(fieldName.law))})
            ))
           """
          } else {
            q"""
            ${encoderWitColType.typeSymbol.companion}.toWrap(${TermName(modelName)}.${TermName(fieldName.law)}, ${TermName(mgVar)}(_.${TermName(fieldName.law)}), ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(fieldName.law))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(fieldName.law))}),
              modelColumnName = ${Literal(Constant(fieldName.law))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(fieldName.law))})
            ))
           """
          }}
        }
    """

        val q =
          q"""
        {
            ${if (usePlaceHolder) {
            q"""
            ${TermName(mgVar)}(_.${TermName(fieldName.law)}).toPlaceholder
           """
          } else {
            q"""
            ${TermName(modelName)}.${TermName(fieldName.law)}
           """
          }}
        }
    """
        q
      }

      val (fieldsPrepare, _, _) = outputFieldNames.foldLeft((List.empty[FieldNames], 0, 0)) {
        case ((nameList, lawIndex, helperIndex), name) =>
          val newLawIndex    = lawIndex + 1
          val needInput      = inputFieldNames.contains(name)
          val usePlaceHolder = !tableFieldNames.contains(name)
          val newHelperIndex = if (!needInput) {
            helperIndex + 1
          } else helperIndex
          val fieldName = FieldNames(
              law = name
            , shapeValueName = name
            , lawIndex = newLawIndex
            , helperIndex = newHelperIndex
            , needInput = needInput
            , needSub = subFieldNames.contains(name)
            , usePlaceHolder = usePlaceHolder
          )
          ((fieldName :: nameList), newLawIndex, newHelperIndex)
      }

      val fields = fieldsPrepare

      val q = c.Expr[InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]] {
        q"""
            ${inputTable.typeSymbol.companion}{ ${TermName(tableVar)}: ${table} =>
           ..$mgDef
           ${caseClassDataHelper.typeSymbol.companion}.withDataDescribe(..${fields.filter(s => !s.needInput).flatMap { field =>
          List(
              q"""${TermName("rep" + field.helperIndex)} = ${commonProUseInShape(modelName = tableVar, fieldName = field, usePlaceHolder = field.usePlaceHolder)}"""
            , q"""${TermName("property" + field.helperIndex)} = ${propertyName(field.law)}"""
            , q"""${TermName("column" + field.helperIndex)} = ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(field.law))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))}),
              modelColumnName = ${Literal(Constant(field.law))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))})
            )"""
          )
        }}).asDecoder { (tempData, rep) =>
                 ${lazyData.typeSymbol.companion}.init(gen = {s: ${input} => ${output.typeSymbol.companion}(
                 ..${fields.map(field => q"""${TermName(field.law)} = ${if (field.needInput) q"""s.${TermName(field.law)}""" else q"""tempData.${TermName("data" + field.helperIndex)}"""}""")}
                 ) }, sub = ${sub.typeSymbol.companion}(..${fields.filter(_.needSub).map(field => q"""${TermName(field.law)} = tempData.${TermName("data" + field.helperIndex)}""")}))
            }
            }
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }
  }

  class EncoderMapperImpl(val c: scala.reflect.macros.whitebox.Context) {

    import c.universe._

    case class FieldNames(law: String, lawIndex: Int, deepIndex: List[Int], needInput: Boolean, needSub: Boolean, usePlaceHolder: Boolean)

    def caseclassEncoderGeneric[Output: c.WeakTypeTag, Table: c.WeakTypeTag, Rep: c.WeakTypeTag, TempData: c.WeakTypeTag]: c.Expr[InputTable[Table, EncoderDataGen.Aux[Output, Rep, TempData]]] = {
      val rep                 = weakTypeOf[Rep]
      val tempData            = weakTypeOf[TempData]
      val output              = weakTypeOf[Output]
      val table               = weakTypeOf[Table]
      val outputModelGen      = weakTypeOf[ModelGen[Output]]
      val columnInfoImpl      = weakTypeOf[MacroColumnInfoImpl]
      val caseClassDataHelper = weakTypeOf[CaseClassMapper]
      val encoderWitColType   = weakTypeOf[EncoderWitCol]
      val inputTable          = weakTypeOf[InputTable[_, _]]

      val mgVar    = "mg" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")
      val tableVar = "table" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")

      val outputFieldNames = output.members
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList
        .reverse
      val tableFieldNames = table.members
        .filter { s =>
          s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod)
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList

      def mgDef = List(q"""
        val ${TermName(mgVar)}: $outputModelGen = ${outputModelGen.typeSymbol.companion}.value[$output]
        """)

      def propertyName(name: String) =
        q"""
           ${TermName(mgVar)}(_.${TermName(name)})
         """

      def commonProUseInShape(modelName: String, fieldName: FieldNames, usePlaceHolder: Boolean) = {
        val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]

        val q =
          q"""
        {
            ${if (usePlaceHolder) {
            q"""
            ${TermName(mgVar)}(_.${TermName(fieldName.law)}).toPlaceholder
           """
          } else {
            q"""
            ${TermName(modelName)}.${TermName(fieldName.law)}
           """
          }}
        }
    """
        q
      }

      @tailrec
      def fromGroupSizeImpl(max: Int, groupSize: Int, index: Int, preList: List[Int]): List[Int] = {
        if (groupSize < max)
          fromGroupSizeImpl(max, groupSize * groupSize, index, preList ::: (index % groupSize) :: List.empty)
        else
          preList
      }

      def fromGroupSize(max: Int, index: Int): List[Int] = fromGroupSizeImpl(max, maxNum, index, List.empty)

      val totalSize = outputFieldNames.size

      val (fieldsPrepare, _) = outputFieldNames.foldLeft((List.empty[FieldNames], 0)) {
        case ((nameList, lawIndex), name) =>
          val newLawIndex    = lawIndex + 1
          val usePlaceHolder = !tableFieldNames.contains(name)
          val fieldName      = FieldNames(law = name, lawIndex = newLawIndex, deepIndex = fromGroupSize(totalSize, newLawIndex), needInput = false, needSub = false, usePlaceHolder = usePlaceHolder)
          ((fieldName :: nameList), newLawIndex)
      }
      @tailrec
      def withDataDescribeFunc(treeList: List[Tree]): List[Tree] = {
        val newList = treeList.grouped(maxNum).map { subList =>
          q"""${caseClassDataHelper.typeSymbol.companion}.withDataDescribe(..${subList})
         """
        }
        if (newList.size == 1)
          newList.toList
        else
          withDataDescribeFunc(newList.toList)
      }

      def initProperty(treeList: List[FieldNames]): List[Tree] = {
        treeList
          .grouped(maxNum)
          .map { subList =>
            q"""
          ${caseClassDataHelper.typeSymbol.companion}.withDataDescribe(..${subList.filter(s => !s.needInput).flatMap { field =>
              List(
                  q"""${TermName("rep" + field.deepIndex.head)} = ${commonProUseInShape(modelName = tableVar, fieldName = field, usePlaceHolder = field.usePlaceHolder)}"""
                , q"""${TermName("property" + field.deepIndex.head)} = ${propertyName(field.law)}"""
                , q"""${TermName("column" + field.deepIndex.head)} = ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(field.law))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))}),
              modelColumnName = ${Literal(Constant(field.law))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))})
            )"""
              )
            }})
          """
          }
          .toList
      }

      def setCaseClass(treeList: List[(List[Int], Tree)]): List[Tree] = {
        val upper = treeList
          .grouped(maxNum)
          .map { item =>
            val q = item.map {
              case (deepIndex, subList) =>
                q"""
          new ${TermName("_root_")}.${TermName("net")}.${TermName("scalax")}.${TermName("asuna")}.${TermName("helper")}.${TermName("template")}.${TypeName(s"CaseClassDataMapper${item.size}")}(
                 ..${item.flatMap(
                    field =>
                    List(
                        q"""${TermName("data" + field._1.head.toString)} = ${field._2}"""
                    )
                )}
                 )
          """

            }

            (item.head._1.tail, q)
          }
          .toList
        if (upper.size > 1)
          setCaseClass(treeList)
        else treeList.map(_._2)
      }

      def initSetCaseClass(nameList: List[FieldNames]): List[(List[Int], Tree)] = {
        nameList
          .grouped(maxNum)
          .map { item =>
            val q =
              q"""
          new ${TermName("_root_")}.${TermName("net")}.${TermName("scalax")}.${TermName("asuna")}.${TermName("helper")}.${TermName("template")}.${TypeName(s"CaseClassDataMapper${item.size}")}(
                 ..${item.zipWithIndex.map {
                case (fieldItem, index) =>
                  List(
                      q"""${TermName("data" + index)} = caseClass.${TermName(fieldItem.law)}"""
                  )
              }}
                 )
          """

            (item.head.deepIndex.tail, q)
          }
          .toList
      }

      def fullSetCaseClass(nameList: List[FieldNames]): Tree = {
        setCaseClass(initSetCaseClass(nameList)).head
      }

      val fields = fieldsPrepare

      val q = c.Expr[InputTable[Table, EncoderDataGen.Aux[Output, Rep, TempData]]] {
        val aa = weakTypeOf[EncoderDataGen.Aux[Output, Rep, TempData]]
        q"""
           ${inputTable.typeSymbol.companion}{ ${TermName(tableVar)}: ${table} =>
           ..$mgDef
           ${initProperty(fields)}.asEncoder[$output] { (caseClass, rep) =>
               ${fullSetCaseClass(fields)}
            }
            }
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }

  }

}
