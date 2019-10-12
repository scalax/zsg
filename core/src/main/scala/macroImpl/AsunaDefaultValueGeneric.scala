package org.scalax.asuna.mapper.macroImpl

import org.scalax.asuna.mapper.{Context, ContextContent, KindContext}

import scala.language.experimental.macros

trait DefaultValue[T] {
  def value: Option[T]
}

object DefaultValue {
  def model[Model]: ModelApply[Model] = new ModelApply[Model]

  class ModelApply[Model] {
    def to[R](m: Model => R)(o: => Option[R]): DefaultValue[R] = {
      new DefaultValue[R] {
        override def value: Option[R] = o
      }
    }
  }
}

trait AsunaDefaultValueGeneric[H] {
  type DefaultValueType
  def defaultValues: ContextContent[DefaultValueType]
}

object AsunaDefaultValueGeneric {

  def init[M]: AsunaDefaultValueGenericApply[M] = new AsunaDefaultValueGenericApply[M] {}

  trait AsunaDefaultValueGenericApply[M] {
    def defaultValue[N](dfv: ContextContent[N]): Aux[M, N] = new AsunaDefaultValueGeneric[M] {
      override type DefaultValueType = N
      override def defaultValues: ContextContent[N] = dfv
    }
  }

  type Aux[H, WW] = AsunaDefaultValueGeneric[H] { type DefaultValueType = WW }

  implicit def appendMacroImpl[H, II]: AsunaDefaultValueGeneric.Aux[H, II] = macro AsunaDefaultValueGenericMacroApply.AppendMacroImpl1.generic[H, II]

}

object AsunaDefaultValueGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaDefaultValueGeneric.Aux[H, M]] = {
      try {
        val h           = c.weakTypeOf[H]
        val hType       = h.resultType
        val hTypeSymbol = h.typeSymbol
        val hCompanion  = hTypeSymbol.companion
        val apply       = hCompanion.typeSignature.decl(TermName("apply")).asMethod

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

        val proTypeTag =
          apply.paramLists.head.map(_.asTerm).zipWithIndex.map {
            case (p, i) =>
              if (!p.isParamWithDefault) q"""org.scalax.asuna.mapper.macroImpl.DefaultValue.model[${hType}].to(_.${p.name})(Option.empty)"""
              else {
                val getterName = TermName("apply$default$" + (i + 1))
                q"""org.scalax.asuna.mapper.macroImpl.DefaultValue.model[${hType}].to(_.${p.name})(Some($hCompanion.$getterName))"""
              }
          }

        val nameTag = proTypeTag.grouped(8).toList.map(s => q"""org.scalax.asuna.mapper.BuildContent.${TermName("item" + s.length)}(..${s})""")
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""..${tree}"""
          } else if (tree.length < 8) {
            q"""org.scalax.asuna.mapper.BuildContent.${TermName("nodeItem" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""org.scalax.asuna.mapper.BuildContent.${TermName("nodeItem" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaDefaultValueGeneric.Aux[H, M]] {
          q"""org.scalax.asuna.mapper.macroImpl.AsunaDefaultValueGeneric.init[${hType}].defaultValue(${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
