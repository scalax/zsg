package zsg.macros.multiply.utils

import zsg.macros.multiply.RootTable

import scala.annotation.meta.getter
import scala.language.experimental.macros

trait PropertyOverrideHelper {

  val c: scala.reflect.macros.blackbox.Context

  import c.universe._

  def tablePropsGen(keys: List[String], field: Symbol, rootType: Type, mapping: Map[String, List[String]]): Map[String, List[String]] = {
    val newRootType  = field.typeSignatureIn(rootType)
    val TermName(n1) = field.name
    val fieldName    = n1.trim
    val newMapping1  = mapping + ((fieldName, keys))

    val orderOpt = field.annotations
      .map(_.tree)
      .collect {
        case q"""new ${classDef}(${Literal(Constant(num: Int))})""" if classDef.tpe.<:<(weakTypeOf[RootTable @getter]) =>
          num
        case q"""new ${classDef}(${_})""" if classDef.tpe.<:<(weakTypeOf[RootTable @getter]) =>
          RootTable.apply$default$1
      }
      .headOption

    orderOpt match {
      case Some(_) =>
        val newMapList = newRootType.members.toList
          .filter(_.isTerm)
          .map(s => (s.name, s))
          .collect { case (TermName(n), s) =>
            val proName = n.trim
            (proName, s)
          }
          .reverse
          .map { case (r, s) => tablePropsGen(keys ::: r :: Nil, s, s.typeSignatureIn(newRootType), Map.empty) }
        newMapList.foldLeft(newMapping1) { (start, m) => start ++ m }

      case _ => newMapping1
    }
  }

}
