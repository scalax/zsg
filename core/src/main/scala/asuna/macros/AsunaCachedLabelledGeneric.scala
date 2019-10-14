package asuna.macros

import java.util

import asuna.{Context, ContextContent, KindContext}

import scala.language.experimental.macros

trait AsunaCachedLabelledGeneric[H] {
  type NameType
  val className: String
  protected def names: ContextContent[NameType]
  def getName[K <: KindContext](context: Context[K]): NameType = {
    if (context.isReverse) {
      val value1 = AsunaCachedLabelledGeneric.reverseNameHashMap.get(className)
      if (value1 == null) {
        AsunaCachedLabelledGeneric.reverseNameHashMap.put(className, names.withContext(context))
        AsunaCachedLabelledGeneric.reverseNameHashMap.get(className).asInstanceOf[NameType]
      } else
        value1.asInstanceOf[NameType]
    } else {
      val value1 = AsunaCachedLabelledGeneric.nameHashMap.get(className)
      if (value1 == null) {
        AsunaCachedLabelledGeneric.nameHashMap.put(className, names.withContext(context))
        AsunaCachedLabelledGeneric.nameHashMap.get(className).asInstanceOf[NameType]
      } else
        value1.asInstanceOf[NameType]
    }
  }
}

object AsunaCachedLabelledGeneric {

  val nameHashMap: util.HashMap[String, Any]        = new util.HashMap[String, Any]()
  val reverseNameHashMap: util.HashMap[String, Any] = new util.HashMap[String, Any]()

  def init[M]: CachedNameGenericApply[M] = new CachedNameGenericApply[M] {}

  trait CachedNameGenericApply[M] {
    def name[N](className1: String, names1: => ContextContent[N]): Aux[M, N] = new AsunaCachedLabelledGeneric[M] {
      override type NameType = N
      override val className                          = className1
      override protected def names: ContextContent[N] = names1
    }
  }

  type Aux[H, WW] = AsunaCachedLabelledGeneric[H] { type NameType = WW }

  implicit def appendMacroImpl[H, II]: AsunaCachedLabelledGeneric.Aux[H, II] = macro AsunaCachedLabelledGenericMacroApply.AppendMacroImpl1.generic[H, II]

}

object AsunaCachedLabelledGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.blackbox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaCachedLabelledGeneric.Aux[H, M]] = {
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
          .map(s => q"""asuna.BuildContent.${TermName("item" + s.length)}(..${s})""")
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""..${tree}"""
          } else if (tree.length < 8) {
            q"""asuna.BuildContent.${TermName("nodeItem" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""org.asuna.BuildContent.${TermName("nodeItem" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaCachedLabelledGeneric.Aux[H, M]] {
          q"""asuna.macros.AsunaCachedLabelledGeneric.init[${hType}].name(classOf[${hType}].getCanonicalName, ${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
