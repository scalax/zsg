package org.scalax.asuna.mapper.append.macroImpl

import org.scalax.asuna.mapper.AppendTag
import org.scalax.asuna.mapper.item.{ItemTag, MessageContent}

import scala.language.experimental.macros

class ModelApply[I] {
  def to[R](m: I => R): AppendTag[R] = new AppendTag[R]
}

trait WrapTag {
  type Tag <: ItemTag
  type DebugType <: ItemTag
}

class WrapTagImpl[TT <: ItemTag, DBType <: ItemTag] extends WrapTag {
  override type Tag       = TT
  override type DebugType = DBType
}

trait AsunaGeneric[H] {
  type WT <: WrapTag
  def tag: AppendTag[WT#Tag]
  def debugInstance: WT#DebugType //WT#Tag#InputMessage[WT#DebugType]#Result
}

object AsunaGeneric {

  def init[M] = new GenericApply[M] {}

  trait GenericApply[M] {
    def generic[WW <: WrapTag](implicit i: AsunaGeneric.Aux[M, WW]): AsunaGeneric.Aux[M, WW] = i

    def init1[K <: ItemTag, K1 <: MessageContent](i: AppendTag[K], debugTag: AppendTag[K1]): Aux[M, WrapTagImpl[K, K#InputMessage[K1]#Result]] = {
      new AsunaGeneric[M] {
        override type WT = WrapTagImpl[K, K#InputMessage[K1]#Result]
        override def tag                                      = i
        override def debugInstance: K#InputMessage[K1]#Result = throw new Exception("debugging...")
      }
    }
  }

  type Aux[H, WW <: WrapTag] = AsunaGeneric[H] { type WT = WW }

  implicit def appendMacroImpl[H, II <: WrapTag, T]: AsunaGeneric.Aux[H, II] = macro AsunaGenericMacroApply.AppendMacroImpl1.generic[H, II]

}

object AsunaGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M <: WrapTag: c.WeakTypeTag]: c.Expr[AsunaGeneric.Aux[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.typeSymbol

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

        val proTypeTag = props.map(s => q"""new org.scalax.asuna.mapper.append.macroImpl.ModelApply[${hType}].to(_.${TermName(s)})""")
        val typeTag = if (proTypeTag.length <= 22) {
          q"""org.scalax.asuna.mapper.item.BuildTagContect.lift(org.scalax.asuna.mapper.item.BuildTagContect.tag(..${proTypeTag}))"""
        } else {
          q"""org.scalax.asuna.mapper.item.BuildTagContect.lift(org.scalax.asuna.mapper.item.BuildTagContect.nodeTag(..${proTypeTag
            .grouped(22)
            .toList
            .map(i => q"""org.scalax.asuna.mapper.item.BuildTagContect.tag(..${i})""")}))"""
        }

        val proSize = props.size

        val reverseProps = props.reverse.zipWithIndex.map { case (item, index) => (item, props.size - (index + 1)) }

        val inputMessage =
          q"""{
             ..${reverseProps.map { case (name, index) => q"""class ${TypeName(s"第${index + 1}列${name}找不到 implicit")} extends org.scalax.asuna.mapper.item.Message""" }}
new org.scalax.asuna.mapper.AppendTag[
           ${reverseProps.foldLeft(tq"""org.scalax.asuna.mapper.item.ZeroMessageContent""": Tree) {
            case (tree, (name, index))                 => tq"""org.scalax.asuna.mapper.item.MessageContentImpl[${TypeName(s"第${index + 1}列${name}找不到 implicit")}, ${tree}]"""
          }}]
      }"""

        c.Expr[AsunaGeneric.Aux[H, M]] {
          q"""org.scalax.asuna.mapper.append.macroImpl.AsunaGeneric.init[${hType}].init1(${typeTag}, ${inputMessage})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
