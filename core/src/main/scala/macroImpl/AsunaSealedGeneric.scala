package org.scalax.asuna.mapper.macroImpl

import org.scalax.asuna.mapper.AppendTag
import org.scalax.asuna.mapper.ItemTag

import scala.language.experimental.macros

trait AsunaSealedGeneric[H] {
  type Sealed <: ItemTag
  def tag: Sealed
}

object AsunaSealedGeneric {

  def init[M]: GenericApply[M] = new GenericApply[M] {}

  trait GenericApply[M] {
    def generic[WW <: ItemTag](implicit i: AsunaSealedGeneric.Aux[M, WW]): AsunaSealedGeneric.Aux[M, WW] = i

    def init1[K <: ItemTag](i: AppendTag[K]): Aux[M, K] = {
      new AsunaSealedGeneric[M] {
        override type Sealed = K
        override def tag = throw new Exception("debugging")
      }
    }
  }

  type Aux[H, II <: ItemTag] = AsunaSealedGeneric[H] { type Sealed = II }

  implicit def appendMacroImpl[H, II <: ItemTag]: AsunaSealedGeneric.Aux[H, II] = macro AsunaSealedGenericMacroApply.AppendMacroImpl1.generic[H, II]

}

object AsunaSealedGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    /**
      * If a super-type is generic, find all the subtypes, but at the same time
      * fill in all the generic type parameters that are based on the super-type's
      * concrete type
      * Created by lihaoyi
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

    def generic[H: c.WeakTypeTag, M <: ItemTag: c.WeakTypeTag]: c.Expr[AsunaSealedGeneric.Aux[H, M]] = {
      try {
        val h     = weakTypeOf[H]
        val hType = h.resultType

        val props = fleshedOutSubtypes(hType)

        val proTypeTag = props.map(s => q"""org.scalax.asuna.mapper.AppendTag[${s}]""")

        val typeTag = proTypeTag.grouped(8).toList.map(i => q"""org.scalax.asuna.mapper.BuildContent.tag(..${i})""")
        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""org.scalax.asuna.mapper.BuildContent.lift(..${tree})"""
          } else if (tree.length < 8) {
            q"""org.scalax.asuna.mapper.BuildContent.lift(org.scalax.asuna.mapper.BuildContent.nodeTag(..${tree}))"""
          } else {
            val groupedTree = tree.grouped(8).toList
            typeTagGen(groupedTree.map(s => q"""org.scalax.asuna.mapper.BuildContent.nodeTag(..${s})"""))
          }

        println(q"""org.scalax.asuna.mapper.macroImpl.AsunaSealedGeneric.init[${hType}].init1(${typeTagGen(typeTag)})""")
        c.Expr[AsunaSealedGeneric.Aux[H, M]] {
          q"""org.scalax.asuna.mapper.macroImpl.AsunaSealedGeneric.init[${hType}].init1(${typeTagGen(typeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
