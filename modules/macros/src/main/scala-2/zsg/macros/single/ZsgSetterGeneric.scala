package zsg.macros.single

import zsg.macros.single.utils.TypeHelper
import zsg.macros.{AllScalaMacroMethods, ZsgParameters}
import zsg.macros.utils.MacroMethods

import scala.annotation.tailrec
import scala.language.experimental.macros
import scala.collection.compat._

trait ZsgSetterGeneric[H, GenericType] {
  def setter(gen: GenericType): H
}

object ZsgSetterGeneric {

  def value[Model, GenericType](i: GenericType => Model): ZsgSetterGeneric[Model, GenericType] =
    new ZsgSetterGeneric[Model, GenericType] {
      override def setter(gen: GenericType): Model = i(gen)
    }

  implicit def macroImpl[H, M]: ZsgSetterGeneric[H, M] = macro ZsgSetterGenericMacroApply.MacroImpl.generic[H, M]

}

object ZsgSetterGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends MacroMethods with AllScalaMacroMethods with TypeHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[ZsgSetterGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType
        val s     = symbolOf[H]
        val b     = companionOfSymbol(s)

        val props = caseClassMembersByType(hType)

        def toTupleTree(prop: List[ModelField]): Any = {
          if (prop.size > 3) {
            @tailrec
            def maxSize(old: Int): Int = {
              val temp = old * ZsgParameters.maxPropertyNum
              if (temp < prop.size) maxSize(temp) else old
            }
            val size = maxSize(1)
            (toTupleTree(prop.take(size)), toTupleTree(prop.drop(size)))
          } else if (prop.size == 3) ((prop(0), prop(1)), prop(2))
          else if (prop.size == 2) (prop(0), prop(1))
          else prop(0)
        }

        val i1Term = TermName("i1")
        val i2Term = TermName("i2")

        def toPropertyList(n: Any): Vector[(ModelField, Tree => Tree)] = n match {
          case n: ModelField => Vector((n, (s: Tree) => s))
          case (n1: ModelField, n2: ModelField) =>
            val item1 = (n1, (s: Tree) => q"""$s.$i1Term""")
            val item2 = (n2, (s: Tree) => q"""$s.$i2Term""")
            Vector(item1, item2)
          case (t1, n: ModelField) =>
            val list1 = toPropertyList(t1).map(s => (s._1, (t: Tree) => s._2(q"""$t.$i1Term""")))
            val item2 = (n, (s: Tree) => q"""$s.$i2Term""")
            vectorAppend(list1, item2)
          case (t1, t2) =>
            val list1 = toPropertyList(t1).map(s => (s._1, (t: Tree) => s._2(q"""$t.$i1Term""")))
            val list2 = toPropertyList(t2).map(s => (s._1, (t: Tree) => s._2(q"""$t.$i2Term""")))
            vectorAppendAll(list1, list2)
        }

        val casei = toPropertyList(toTupleTree(props))

        val inputFunc = q"""_root_.zsg.macros.single.ZsgSetterGeneric.value(item => ${b.companionTree}.apply(..${casei.map {
          case (item, m) =>
            namedParam(item.fieldTermName, m(Ident(TermName("item"))))
        }}))"""

        c.Expr[ZsgSetterGeneric[H, M]] {
          inputFunc
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
