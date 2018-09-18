package net.scalax.asuna.helper.data.macroImpl

import java.util.UUID

import net.scalax.asuna.helper.decoder.macroImpl.ModelGen
import net.scalax.asuna.helper.MacroColumnInfoImpl
import net.scalax.asuna.helper.encoder.{EncoderWitCol, InputTable}
import net.scalax.asuna.helper.mapper.CaseClassMapper

import scala.annotation.tailrec

object CaseClassMapperMacro {

  val maxNum = 12

  case class FieldNames(law: String, shapeValueName: String, lawIndex: Int, helperIndex: Int, deepIndex: List[Int] = List.empty, needInput: Boolean, needSub: Boolean, usePlaceHolder: Boolean)

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
      val caseClassDataHelper = weakTypeOf[CaseClassMapper]
      val encoderWitColType   = weakTypeOf[EncoderWitCol]
      val lazyData            = weakTypeOf[LazyData[Input, Output, Sub]]
      val inputTable          = weakTypeOf[InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]]

      val mgVar    = "mg" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")
      val tableVar = "table" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")

      //Model to input's fields
      val inputFieldNames = input.members
        .filter { s =>
          s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod)
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList
      //Model to output's fields
      //Some not confirm to inputFieldNames is use to map to the table
      val outputFieldNames = output.members
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList
      //.reverse
      //Model to sub's fields
      val subFieldNames = sub.members
        .filter { s =>
          s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod)
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList
      //Table fields
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
            , deepIndex = List.empty
            , needInput = needInput
            , needSub = subFieldNames.contains(name)
            , usePlaceHolder = usePlaceHolder
          )
          ((fieldName :: nameList), newLawIndex, newHelperIndex)
      }

      val needToMapFields = fieldsPrepare.filter(s => !s.needInput)

      @tailrec
      def withDataDescribeFunc(treeList: List[Tree]): List[Tree] = {
        if (treeList.size == 1) {
          treeList
        } else {
          val newList = treeList.grouped(maxNum).toList.map { subList =>
            q"""${caseClassDataHelper.typeSymbol.companion}.withLawRep(..${subList.flatMap(t => List(t, q"""${t}.propertyType"""))})
         """
          }
          withDataDescribeFunc(newList)
        }
      }

      def initProperty(treeList: List[FieldNames]): List[Tree] = {
        treeList.grouped(maxNum).toList.map { subList =>
          val q = q"""
          ${caseClassDataHelper.typeSymbol.companion}.withRep(..${subList.filter(s => !s.needInput).zipWithIndex.flatMap {
            case (field, index) =>
              val plusIndex = index + 1
              List(
                  q"""${TermName("rep" + plusIndex)} = ${commonProUseInShape(modelName = tableVar, fieldName = field, usePlaceHolder = field.usePlaceHolder)}"""
                , q"""${TermName("property" + plusIndex)} = ${propertyName(field.law)}"""
                , q"""${TermName("column" + plusIndex)} = ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(field.law))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))}),
              modelColumnName = ${Literal(Constant(field.law))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))})
            )"""
              )
          }})
          """
          q
        }
      }

      def genProperty(treeList: List[FieldNames]): Tree = withDataDescribeFunc(initProperty(treeList)).head

      /*@tailrec
      def getProDeepImpl(lawIndex: Int, totalSize: Int, list: List[Int]): List[Int] =
        if (lawIndex > 0)
          getProDeepImpl((lawIndex - 1) / maxNum, (totalSize) / maxNum, (((lawIndex - 1) % maxNum) + 1) :: list)
        else if (totalSize > 0)
          getProDeepImpl(0, (totalSize) / maxNum, (((totalSize - 1) % maxNum) + 1) :: list)
        else
          list

      def getProDeep(lawIndex: Int): List[Int] = getProDeepImpl(lawIndex, fieldsPrepare.filter(s => !s.needInput).size, List.empty)*/

      def appendIndexToTree(tree: Tree, deepIndex: List[Int]): Tree = {
        deepIndex.foldLeft(tree) { (treeItem, index) =>
          q"""$treeItem.${TermName("data" + index.toString)}"""
        }
      }

      @tailrec
      def countDeepImpl[T](base: List[T])(cv: T => List[FieldNames]): List[FieldNames] = {
        base match {
          case head :: Nil =>
            cv(head)
          case l =>
            val groupedList = l.grouped(maxNum).toList

            countDeepImpl(groupedList)(_.zipWithIndex.flatMap {
              case (list, index) =>
                cv(list).map(r => r.copy(deepIndex = (index + 1) :: r.deepIndex))
            })
        }
      }

      def countDeep(base: List[FieldNames]) = countDeepImpl(base)(s => List(s))

      val deepFields = countDeep(fieldsPrepare.filter(s => !s.needInput))

      val fields    = deepFields.reverse.zip(deepFields.reverse)
      val subFields = deepFields.filter(s => s.needSub).reverse.zip(deepFields.filter(s => s.needSub).reverse)

      val q = c.Expr[InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]] {
        q"""
        ${inputTable.typeSymbol.companion}{ ${TermName(tableVar)}: ${table} =>
          ..$mgDef
          ${genProperty(needToMapFields)}
          .dataGenWrap
          .asDecoder { (tempData, rep) =>
            ${lazyData.typeSymbol.companion}.init(gen = {s: ${input} => ${output.typeSymbol.companion}(
              ..${List(
            fields.map {
            case (field1, field2) => q"""${TermName(field1.law)} = ${appendIndexToTree(q"""tempData""", field2.deepIndex)}"""
          }
          , fieldsPrepare.filter(_.needInput).map { field =>
            q"""${TermName(field.law)} = s.${TermName(field.law)}"""
          }
        ).flatten}

            ) }, sub = ${sub.typeSymbol.companion}(..${subFields.map { case (field1, field2) => q"""${TermName(field1.law)} = ${appendIndexToTree(q"""tempData""", field1.deepIndex)}""" }}))
          }
        }
        """

        /*q"""
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
        """*/
      }
      //println(q + "\n" + "22" * 100)
      q
    }
  }

  class EncoderMapperImpl(val c: scala.reflect.macros.whitebox.Context) {

    import c.universe._

    case class FieldNames(law: String, lawIndex: Int, /*deepIndex: List[Int],*/ needInput: Boolean, needSub: Boolean, usePlaceHolder: Boolean)

    def caseclassEncoderGeneric[Output: c.WeakTypeTag, Table: c.WeakTypeTag, Rep: c.WeakTypeTag, TempData: c.WeakTypeTag]: c.Expr[InputTable[Table, EncoderDataGen.Aux[Output, Rep, TempData]]] = {
      val rep                 = weakTypeOf[Rep]
      val tempData            = weakTypeOf[TempData]
      val output              = weakTypeOf[Output]
      val table               = weakTypeOf[Table]
      val outputModelGen      = weakTypeOf[ModelGen[Output]]
      val columnInfoImpl      = weakTypeOf[MacroColumnInfoImpl]
      val caseClassDataHelper = weakTypeOf[CaseClassMapper]
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

      val (fieldsPrepare, _) = outputFieldNames.foldLeft((List.empty[FieldNames], 0)) {
        case ((nameList, lawIndex), name) =>
          val newLawIndex    = lawIndex + 1
          val usePlaceHolder = !tableFieldNames.contains(name)
          val fieldName      = FieldNames(law = name, lawIndex = newLawIndex, needInput = false, needSub = false, usePlaceHolder = usePlaceHolder)
          ((fieldName :: nameList), newLawIndex)
      }

      //println(fieldsPrepare)

      @tailrec
      def withDataDescribeFunc(treeList: List[Tree]): List[Tree] = {
        if (treeList.size == 1) {
          treeList
        } else {
          val newList = treeList.grouped(maxNum).toList.map { subList =>
            q"""${caseClassDataHelper.typeSymbol.companion}.withLawRep(..${subList.flatMap(t => List(t, q"""${t}.propertyType"""))})
         """
          }
          /*if (newList.size == 1)
            newList
          else*/
          withDataDescribeFunc(newList)
        }
      }

      def initProperty(treeList: List[FieldNames]): List[Tree] = {
        treeList
          .grouped(maxNum)
          .map { subList =>
            val q = q"""
          ${caseClassDataHelper.typeSymbol.companion}.withRep(..${subList.filter(s => !s.needInput).zipWithIndex.flatMap {
              case (field, index) =>
                val plusIndex = index + 1
                List(
                    q"""${TermName("rep" + plusIndex)} = ${commonProUseInShape(modelName = tableVar, fieldName = field, usePlaceHolder = field.usePlaceHolder)}"""
                  , q"""${TermName("property" + plusIndex)} = ${propertyName(field.law)}"""
                  , q"""${TermName("column" + plusIndex)} = ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(field.law))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))}),
              modelColumnName = ${Literal(Constant(field.law))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))})
            )"""
                )
            }})
          """
            q
          }
          .toList
      }

      def genProperty(treeList: List[FieldNames]): Tree = {
        withDataDescribeFunc(initProperty(treeList)).head
      }

      def setCaseClass(treeList: List[Tree]): List[Tree] = {
        if (treeList.size == 1)
          treeList
        else {
          val upper = treeList.grouped(maxNum).toList.map { items =>
            val q =
              q"""
          new ${TermName("_root_")}.${TermName("net")}.${TermName("scalax")}.${TermName("asuna")}.${TermName("helper")}.${TermName("mapper")}.${TypeName(s"CaseClassDataMapper${items.size}")}(
                 ..${items.zipWithIndex.flatMap {
                case (field, index) =>
                  val plusIndex = index + 1
                  List(
                      q"""${TermName("data" + plusIndex.toString)} = ${field}"""
                    //, q"""${TermName("property" + plusIndex.toString)} = ${field}.propertyType"""
                  )
              }}
                 )
          """

            q
          }
          setCaseClass(upper)
        }
      }

      def initSetCaseClass(nameList: List[FieldNames]): List[Tree] = {
        nameList.grouped(maxNum).toList.map { item =>
          val q =
            q"""
          new ${TermName("_root_")}.${TermName("net")}.${TermName("scalax")}.${TermName("asuna")}.${TermName("helper")}.${TermName("mapper")}.${TypeName(s"CaseClassDataMapper${item.size}")}(
                 ..${item.zipWithIndex.flatMap {
              case (fieldItem, index) =>
                val plusIndex = index + 1
                List(
                    q"""${TermName("data" + plusIndex.toString)} = caseClass.${TermName(fieldItem.law)}"""
                )
            }}
                 )
          """

          q
        }
      }

      def fullSetCaseClass(nameList: List[FieldNames]): Tree = {
        setCaseClass(initSetCaseClass(nameList)).head
      }

      val fields = fieldsPrepare

      val q = c.Expr[InputTable[Table, EncoderDataGen.Aux[Output, Rep, TempData]]] {
        q"""
        ${inputTable.typeSymbol.companion}{ ${TermName(tableVar)}: ${table} =>
          ..$mgDef
          ${genProperty(fields)}
          .dataGenWrap
          .asEncoder[$output] { (caseClass, rep) =>
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
