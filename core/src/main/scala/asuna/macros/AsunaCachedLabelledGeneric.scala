package asuna.macros

import java.util

import asuna.{Context, KindContext}

import scala.language.experimental.macros

trait AsunaCachedLabelledGeneric[H, NameType] {
  val className: String
  protected def names: NameType
  def getName[K <: KindContext](context: Context[K]): NameType = {
    if (context.isReverse) {
      val value1 = AsunaCachedLabelledGeneric.reverseNameHashMap.get(className)
      if (value1 == null) {
        AsunaCachedLabelledGeneric.reverseNameHashMap.put(className, names)
        AsunaCachedLabelledGeneric.reverseNameHashMap.get(className).asInstanceOf[NameType]
      } else
        value1.asInstanceOf[NameType]
    } else {
      val value1 = AsunaCachedLabelledGeneric.nameHashMap.get(className)
      if (value1 == null) {
        AsunaCachedLabelledGeneric.nameHashMap.put(className, names)
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
    def name[N](className1: String, names1: => N): AsunaCachedLabelledGeneric[M, N] = new AsunaCachedLabelledGeneric[M, N] {
      override val className          = className1
      override protected def names: N = names1
    }
  }

  implicit def macroImpl[H, II]: AsunaCachedLabelledGeneric[H, II] = macro AsunaCachedLabelledGenericMacroApply.MacroImpl.generic[H, II]

}

object AsunaCachedLabelledGenericMacroApply {

  class MacroImpl(val c: scala.reflect.macros.blackbox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaCachedLabelledGeneric[H, M]] = {
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

        val nameTag = props.map { name =>
          q"""${Literal(Constant(name))}"""
        }
        //.grouped(8)
        //.toList
        //.map(s => q"""asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})""")
        def nameTagGen(tree: List[Tree]): Tree =
          /*if (tree.length == 1) {
            q"""..${tree}"""
          } else*/ if (tree.length <= 8) {
            q"""asuna.BuildContent.${TermName("tuple" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaCachedLabelledGeneric[H, M]] {
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
