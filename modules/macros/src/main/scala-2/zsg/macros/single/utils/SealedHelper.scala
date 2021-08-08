package zsg.macros.single.utils

import scala.annotation.StaticAnnotation

trait SealedHelper {

  val c: scala.reflect.macros.blackbox.Context
  import c.universe._

  /** If a super-type is generic, find all the subtypes, but at the same time fill in all the generic type parameters that are based on the
    * super-type's concrete type
    * @author
    *   lihaoyi
    */
  def fleshedOutSubtypes(tpe: Type): Set[Type] = {
    def classSym(tpe: Type): ClassSymbol = {
      val sym = tpe.typeSymbol
      if (!sym.isClass)
        c.abort(c.enclosingPosition, s"$sym is not a class or trait")

      val classSym = sym.asClass
      classSym.typeSignature // Workaround for <https://issues.scala-lang.org/browse/SI-7755>

      classSym
    }

    for {
      subtypeSym <- classSym(tpe).knownDirectSubclasses.filter(!_.toString.contains("<local child>"))
      if subtypeSym.isType
      st          = subtypeSym.asType.toType
      baseClsArgs = st.baseType(tpe.typeSymbol).asInstanceOf[TypeRef].args
    } yield {
      tpe match {
        case ExistentialType(_, TypeRef(pre, sym, args)) =>
          st.substituteTypes(baseClsArgs.map(_.typeSymbol), args)
        case ExistentialType(_, _) => st
        case TypeRef(pre, sym, args) =>
          st.substituteTypes(baseClsArgs.map(_.typeSymbol), args)
      }
    }
  }

}
