package org.scalax.asuna.mapper.macroImpl

import java.util

import org.scalax.asuna.mapper.{Context, ContextContent, KindContext}

import scala.language.experimental.macros

trait AsunaCachedNameGeneric[H] {
  type NameType
  val className: String
  def names: ContextContent[NameType]
  def getName[K <: KindContext](context: Context[K]): NameType = {
    if (context.isReverse) {
      val value1 = AsunaCachedNameGeneric.reverseNameHashMap.get(className)
      if (value1 == null) {
        AsunaCachedNameGeneric.reverseNameHashMap.put(className, names.withContext(context))
        AsunaCachedNameGeneric.reverseNameHashMap.get(className).asInstanceOf[NameType]
      } else
        value1.asInstanceOf[NameType]
    } else {
      val value1 = AsunaCachedNameGeneric.nameHashMap.get(className)
      if (value1 == null) {
        AsunaCachedNameGeneric.nameHashMap.put(className, names.withContext(context))
        AsunaCachedNameGeneric.nameHashMap.get(className).asInstanceOf[NameType]
      } else
        value1.asInstanceOf[NameType]
    }
  }
}

object AsunaCachedNameGeneric {

  val nameHashMap: util.HashMap[String, Any]        = new util.HashMap[String, Any]()
  val reverseNameHashMap: util.HashMap[String, Any] = new util.HashMap[String, Any]()

  def init[M]: CachedNameGenericApply[M] = new CachedNameGenericApply[M] {}

  trait CachedNameGenericApply[M] {
    def name[N](className1: String, names1: => ContextContent[N]): Aux[M, N] = new AsunaCachedNameGeneric[M] {
      override type NameType = N
      override val className                = className1
      override def names: ContextContent[N] = names1
    }
  }

  type Aux[H, WW] = AsunaCachedNameGeneric[H] { type NameType = WW }

  implicit def appendMacroImpl[H, II]: AsunaCachedNameGeneric.Aux[H, II] = macro AsunaCachedNameGenericMacroApply.AppendMacroImpl1.generic[H, II]

}

object AsunaCachedNameGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaCachedNameGeneric.Aux[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = hType.members.toList
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

        val nameTag = props
          .map { name =>
            q"""${Literal(Constant(name))}"""
          }
          .grouped(8)
          .toList
          .map(s => q"""org.scalax.asuna.mapper.BuildContent.${TermName("item" + s.length)}(..${s})""")
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""..${tree}"""
          } else if (tree.length < 8) {
            q"""org.scalax.asuna.mapper.BuildContent.${TermName("nodeItem" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""org.scalax.asuna.mapper.BuildContent.${TermName("nodeItem" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaCachedNameGeneric.Aux[H, M]] {
          q"""org.scalax.asuna.mapper.macroImpl.CachedNameGeneric.init[${hType}].name(classOf[${hType}].getCanonicalName, ${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
