package zsg.macros.single

import zsg.macros.single.utils.TypeHelper
import zsg.macros.{AllScalaMacroMethods, ZsgParameters}
import zsg.macros.utils.MacroMethods

import scala.language.experimental.macros
import scala.collection.compat._

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

abstract class ZsgDefaultValueGeneric[H, DefaultValueType] {
  def defaultValues: DefaultValueType
}

class ZsgDefaultValue {
  type ModelType[M] = ZsgDefaultValueGenericImpl1[M]
  class ZsgDefaultValueGenericImpl1[Model] {
    type GenericType[G] = ZsgDefaultValueGeneric[Model, G]
  }
}

object ZsgDefaultValueGeneric {

  @inline def value[T, Model](t: DefaultValue.DefaultValueApply[Model] => T): ZsgDefaultValueGeneric[Model, T] =
    new ZsgDefaultValueGeneric[Model, T] {
      override def defaultValues: T = t(DefaultValue.DefaultValueApply[Model])
    }

  implicit def macroImpl[H, II]: ZsgDefaultValueGeneric[H, II] = macro ZsgDefaultValueGenericMacroApply.MacroImpl.generic[H, II]

}

object ZsgDefaultValueGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends MacroMethods with AllScalaMacroMethods with TypeHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[ZsgDefaultValueGeneric[H, M]] = {
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
            apply.paramLists.head.map(_.asTerm).zipWithIndex.map { case (p, i) =>
              if (!p.isParamWithDefault) q"""item.to(_.${p.name})(Option.empty)"""
              else {
                val getterName = TermName("apply$default$" + (i + 1))
                q"""item.to(_.${p.name})(Some(${b.companionTree}.$getterName))"""
              }
            }
          }
          .getOrElse(defaultValue)

        val nameTag = proTypeTag
        def nameTagGen(tree: List[Tree]): Tree = if (tree.length == 1) q"""..${tree}"""
        else {
          val groupedTree = tree.grouped(ZsgParameters.maxPropertyNum).to(List)
          nameTagGen(groupedTree.map(s => if (s.size > 1) q"""new _root_.zsg.ZsgTuple2(..${s})""" else q"""..$s"""))
        }

        c.Expr[ZsgDefaultValueGeneric[H, M]] {
          q"""_root_.zsg.macros.single.ZsgDefaultValueGeneric.value(item => ${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
