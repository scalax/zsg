package asuna.macros

import java.util

import asuna.{BuildContent, Context, ContextContent, Item2, Item8, KindContext}

import scala.language.experimental.macros

trait AsunaCachedLabelledGeneric[H, NameType] {
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
    def name[N](className1: String, names1: => ContextContent[N]): AsunaCachedLabelledGeneric[M, N] = new AsunaCachedLabelledGeneric[M, N] {
      override val className                          = className1
      override protected def names: ContextContent[N] = names1
    }
  }

  implicit def appendMacroImpl[H, II]: AsunaCachedLabelledGeneric[H, II] = macro AsunaCachedLabelledGenericMacroApply.MacroImpl.generic[H, II]

}

object AsunaCachedLabelledGenericCodeGenSample {

  case class Test10(i1: String, i2: Int, i3: Int, i4: Long, i5: String, i6: List[String], i7: Long, i8: Option[Long], i9: List[Long], i10: String)
  val genResult: AsunaCachedLabelledGeneric[Test10, Item2[Item8[String, String, String, String, String, String, String, String], Item2[String, String]]] =
    AsunaCachedLabelledGeneric
      .init[Test10]
      .name(classOf[Test10].getCanonicalName, BuildContent.nodeItem2(BuildContent.item8("i1", "i2", "i3", "i4", "i5", "i6", "i7", "i8"), BuildContent.item2("i9", "i10")))

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
