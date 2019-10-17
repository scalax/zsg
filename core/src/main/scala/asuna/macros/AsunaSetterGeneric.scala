package asuna.macros

import asuna._

import scala.language.experimental.macros

trait AsunaSetterGeneric[H, GenericType] {
  def setter: GenericType => H
}

class PropertySetter[T] {
  def to[R](i: T => R): AppendTag[R] = new AppendTag[R]
}
object PropertySetter {
  def apply[T]: PropertySetter[T] = new PropertySetter[T]
}

object AsunaSetterGeneric {

  def init[T1]: AsunaSetterApply1[T1] = new AsunaSetterApply1[T1] {}
  trait AsunaSetterApply1[T1] {
    def to[T2 <: ItemTag](appendTag: AppendTag[T2])(c: T2#ItemType => T1): AsunaSetterGeneric[T1, T2#ItemType] = new AsunaSetterGeneric[T1, T2#ItemType] {
      override def setter: T2#ItemType => T1 = c
    }
  }

  implicit def appendMacroImpl[H, M]: AsunaSetterGeneric[H, M] = macro AsunaSetterGenericMacroApply.AppendMacroImpl1.generic[H, M]

}

object AsunaSetterGenericCodeGenSample {

  case class Test10(i1: String, i2: Int, i3: Int, i4: Long, i5: String, i6: List[String], i7: Long, i8: Option[Long], i9: List[Long], i10: String)
  val genResult: AsunaSetterGeneric[Test10, Item2[Item8[String, Int, Int, Long, String, List[String], Long, Option[Long]], Item2[List[Long], String]]] = {
    val pro = PropertySetter[Test10]
    AsunaSetterGeneric
      .init[Test10]
      .to(BuildContent.lift(BuildContent.nodeTag(
        BuildContent.tag(pro.to(_.i1), pro.to(_.i2), pro.to(_.i3), pro.to(_.i4), pro.to(_.i5), pro.to(_.i6), pro.to(_.i7), pro.to(_.i8)),
        BuildContent.tag(pro.to(_.i9), pro.to(_.i10))
      ))) { i =>
        Test10(i.i1.i1, i.i1.i2, i.i1.i3, i.i1.i4, i.i1.i5, i.i1.i6, i.i1.i7, i.i1.i8, i.i2.i1, i.i2.i2)
      }
  }

}

object AsunaSetterGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.blackbox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaSetterGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = h.members.toList
          .filter { s =>
            s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor
          }
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }
          .reverse

        val proTypeTag =
          props.map(s => q"""asuna.macros.PropertySetter[${hType}].to(_.${TermName(s)})""").grouped(8).toList.map(s => q"""asuna.BuildContent.tag(..${s})""")

        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""asuna.BuildContent.lift(..${tree})"""
          } else if (tree.length < 8) {
            q"""asuna.BuildContent.lift(asuna.BuildContent.nodeTag(..${tree}))"""
          } else {
            val groupedTree = tree.grouped(8).toList
            typeTagGen(groupedTree.map(s => q"""asuna.BuildContent.nodeTag(..${s})"""))
          }

        def toItemImpl(max: Int, initList: List[(String, Tree => Tree)]): List[(String, Tree => Tree)] =
          if (initList.size > max) {
            val i = initList.zipWithIndex.map {
              case ((str, t), index) =>
                (str, { t1: Tree =>
                  t(q"""${t1}.${TermName("i" + ((index / max % 8) + 1).toString)}""")
                })
            }
            toItemImpl(max * 8, i)
          } else initList

        val preList = props.zipWithIndex.map {
          case (str, index) =>
            (str, { t1: Tree =>
              q"""${t1}.${TermName("i" + (index % 8 + 1).toString)}"""
            })
        }

        val casei = toItemImpl(8, preList)

        val inputFunc = q"""{ item => ${hType.typeSymbol.companion}.apply(..${casei.map { case (item, m) => q"""${TermName(item)} = ${m(Ident(TermName("item")))}""" }}) }"""

        c.Expr[AsunaSetterGeneric[H, M]] {
          q"""asuna.macros.AsunaSetterGeneric.init[${hType}].to(${typeTagGen(proTypeTag)})(${inputFunc})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
