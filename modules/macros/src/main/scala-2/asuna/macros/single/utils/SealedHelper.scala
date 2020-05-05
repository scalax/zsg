package asuna.macros.single.utils

trait SealedHelper {

  val c: scala.reflect.macros.blackbox.Context
  import c.universe._

  /**
    * If a super-type is generic, find all the subtypes, but at the same time
    * fill in all the generic type parameters that are based on the super-type's
    * concrete type
    * @author lihaoyi
    */
  def fleshedOutSubtypes(tpe: Type): Set[Type] = {
    for {
      subtypeSym <- tpe.typeSymbol.asClass.knownDirectSubclasses.filter(!_.toString.contains("<local child>"))
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
