package net.scalax.asuna.helper.data.macroImpl

import net.scalax.asuna.mapper.common.{CaseClassMapper, InputTable, ModelGen}
import net.scalax.asuna.mapper.common.macroImpl.{BaseCaseClassMapperUtils, TableFieldsGen}
import net.scalax.asuna.mapper.encoder.EncoderDataGen

import scala.annotation.tailrec

object EncoderCaseClassMapper {

  class EncoderCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends BaseCaseClassMapperUtils with TableFieldsGen {

    import c.universe._

    def caseclassEncoderGeneric[Output: c.WeakTypeTag, Table: c.WeakTypeTag, Rep: c.WeakTypeTag, TempData: c.WeakTypeTag]
      : c.Expr[InputTable[Table, EncoderDataGen.Aux[Output, Rep, TempData]]] = {
      val rep             = weakTypeOf[Rep]
      val tempData        = weakTypeOf[TempData]
      val output          = weakTypeOf[Output]
      val table           = weakTypeOf[Table]
      val outputModelGen  = weakTypeOf[ModelGen[Output]]
      val inputTable      = weakTypeOf[InputTable[Table, EncoderDataGen.Aux[Output, Rep, TempData]]]
      val caseClassMapper = weakTypeOf[CaseClassMapper]
      val encoderDataGen  = weakTypeOf[EncoderDataGen[Output]]

      val modelGenName = c.freshName("modelGen")
      val tableName    = c.freshName("tableInstance")

      val outputFieldNames = output.members
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map { s =>
          (s, s.name)
        }
        .collect { case (member, TermName(n)) => (member, n.trim) }
        .toList
        .reverse

      val tableFieldNames = fetchTableFields1111(table)

      def mgDef = q"""val ${TermName(modelGenName)}: $outputModelGen = ${outputModelGen.typeSymbol.companion}.value[$output]"""

      /*val (fieldsPrepare, _) = outputFieldNames.foldLeft((List.empty[FieldName], 0)) {
        case ((nameList, lawIndex), (member, strName)) =>
          val newLawIndex = lawIndex + 1
          val usePlaceHolder = tableFieldNames.find { s =>
            s.key match {
              case Left(SingleKey(r)) =>
                r == strName
              case Right(MutiplyKey(mk, _)) =>
                mk.contains(strName)
            }
          }

          val fieldName = FieldName(
              tableFields = usePlaceHolder
            , lawModelMember = member
            , law = strName
            , lawIndex = newLawIndex
            , mapperIndex = newLawIndex
            , needInput = false
            , needSub = false
          )

          ((fieldName :: nameList), newLawIndex)
      }*/

      val (fieldsPrepare, _, _) = outputFieldNames.foldLeft((List.empty[FieldName], 0, 0)) {
        case ((nameList, lawIndex, helperIndex), (member, strName)) =>
          val newLawIndex = lawIndex + 1

          val alreadExists = nameList.exists { s =>
            s.tableFields
              .map(
                  c =>
                  c.key match {
                    case Left(SingleKey(r)) =>
                      r == strName
                    case Right(MutiplyKey(mk, _)) =>
                      mk.contains(strName)
                  }
              )
              .getOrElse(false)
          }
          if (alreadExists)
            (nameList, lawIndex, helperIndex)
          else {
            val usePlaceHolder = tableFieldNames.find { s =>
              s.key match {
                case Left(SingleKey(r)) =>
                  r == strName
                case Right(MutiplyKey(mk, _)) =>
                  mk.contains(strName)
              }
            }

            val newHelperIndex = helperIndex + 1
            val fieldName = FieldName(
                tableFields = usePlaceHolder
              , lawModelMember = member
              , law = strName
              , lawIndex = newLawIndex
              , mapperIndex = newHelperIndex
              , needInput = false
              , needSub = false
            )
            ((fieldName :: nameList), newLawIndex, newHelperIndex)
          }
      }

      @tailrec
      def setCaseClass(treeList: List[Tree]): List[Tree] = {
        if (treeList.size == 1)
          treeList
        else {
          val upper = treeList.grouped(maxNum).toList.map { items =>
            val q =
              q"""
           ${caseClassMapper.typeSymbol.companion}.withData(
                 ..${items.zipWithIndex.flatMap {
                case (field, index) =>
                  val plusIndex = index + 1
                  List(
                      q"""${TermName("data" + plusIndex.toString)} = ${field}"""
                  )
              }}
                 )
          """

            q
          }
          setCaseClass(upper)
        }
      }

      def initSetCaseClass(nameList: List[FieldName]): List[Tree] = {
        nameList.grouped(maxNum).toList.map { item =>
          val q =
            q"""
           ${caseClassMapper.typeSymbol.companion}.withData(
                 ..${item.zipWithIndex.flatMap {
              case (fieldItem, index) =>
                val plusIndex = index + 1
                fieldItem.tableFields.flatMap(
                    s =>
                    s.key match {
                      case Left(_) =>
                        Option.empty
                      case Right(i) =>
                        Option(i)
                    }
                ) match {
                  case Some(MutiplyKey(keys, typeRef)) =>
                    List(
                        q"""${TermName("data" + plusIndex.toString)} = ${typeRef.typeSymbol.companion}(..${keys
                        .map(key => q"""${TermName(key)} = caseClass.${TermName(key)}""")})"""
                    )

                  case _ =>
                    List(
                        q"""${TermName("data" + plusIndex.toString)} = caseClass.${TermName(fieldItem.law)}"""
                    )
                }

            }}
                 )
          """

          q
        }
      }

      def fullSetCaseClass(nameList: List[FieldName]): Tree = setCaseClass(initSetCaseClass(nameList)).head

      val fields = fieldsPrepare

      val q = c.Expr[InputTable[Table, EncoderDataGen.Aux[Output, Rep, TempData]]] {
        q"""
        ${inputTable.typeSymbol.companion}{ ${TermName(tableName)}: ${table} =>
          $mgDef
          ${encoderDataGen.typeSymbol.companion}
          .fromDataGenWrap[$output](${toRepMapper(fields = fields, tableName = tableName, modelGenName = modelGenName)}.dataGenWrap) { (caseClass, rep) =>
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
