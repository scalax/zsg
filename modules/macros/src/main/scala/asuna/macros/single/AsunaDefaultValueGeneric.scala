package asuna.macros.single

import asuna.macros.single.utils.TypeHelper
import asuna.macros.{AllScalaMacroMethods, AsunaParameters}
import asuna.macros.utils.MacroMethods

import scala.language.experimental.macros

trait DefaultValue[T] {
  def value: Option[T]
}

object DefaultValue {
  def model[Model]: DefaultValueApply[Model] = new DefaultValueApply[Model]

  class DefaultValueApply[Model] {
    def to[R](m: Model => R)(o: => Option[R]): DefaultValue[R] = {
      new DefaultValue[R] {
        override def value: Option[R] = o
      }
    }
  }

  object DefaultValueApply {
    val value    = new DefaultValueApply[Any]
    def apply[T] = value.asInstanceOf[DefaultValueApply[T]]
  }

}

abstract class AsunaDefaultValueGeneric[H, DefaultValueType] {
  def defaultValues: DefaultValueType
}

object AsunaDefaultValueGeneric extends AsunaDefaultValueGenericMacroPoly {

  @inline def value[T, Model](t: DefaultValue.DefaultValueApply[Model] => T): AsunaDefaultValueGeneric[Model, T] = new AsunaDefaultValueGeneric[Model, T] {
    override def defaultValues: T = t(DefaultValue.DefaultValueApply[Model])
  }

}

trait AsunaDefaultValueGenericMacroPoly {

  implicit def macroImpl[H, II]: AsunaDefaultValueGeneric[H, II] = macro AsunaDefaultValueGenericMacroApply.MacroImpl.generic[H, II]

}

object AsunaDefaultValueGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends MacroMethods with AllScalaMacroMethods with TypeHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaDefaultValueGeneric[H, M]] = {
      try {
        val rSym = symbolOf[H]

        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        def props = caseClassMembersByType(hType)

        def defaultValue = props.map(i => q"""item.to(_.${i.fieldTermName})(Option.empty)""")
        val b            = companionOfSymbol(rSym)

        val proTypeTag = b.companionSymbol
          .map { s =>
            val apply = s.typeSignature.decl(TermName("apply")).asMethod
            apply.paramLists.head.map(_.asTerm).zipWithIndex.map {
              case (p, i) =>
                if (!p.isParamWithDefault) q"""item.to(_.${p.name})(Option.empty)"""
                else {
                  val getterName = TermName("apply$default$" + (i + 1))
                  q"""item.to(_.${p.name})(Some(${b.companionTree}.$getterName))"""
                }
            }
          }
          .getOrElse(defaultValue)

        val nameTag                            = proTypeTag
        def nameTagGen(tree: List[Tree]): Tree =
          /*if (tree.length == 1) {
            q"""..${tree}"""
          } else*/ if (tree.length <= AsunaParameters.maxPropertyNum) {
            q"""_root_.asuna.BuildContent.${TermName("tuple" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(AsunaParameters.maxPropertyNum).toList
            nameTagGen(groupedTree.map(s => q"""_root_.asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaDefaultValueGeneric[H, M]] {
          q"""_root_.asuna.macros.single.AsunaDefaultValueGeneric.value(item => ${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
