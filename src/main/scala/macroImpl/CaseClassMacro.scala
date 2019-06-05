package org.scalax.asuna.mapper.append.macroImpl

import org.scalax.asuna.mapper.AppendTag
import org.scalax.asuna.mapper.item.{ItemTag, MessageContent}

import scala.language.experimental.macros

class ModelApply[I] {
  def to[R](m: I => R): AppendTag[R] = new AppendTag[R]
}

trait WrapTag {
  type GenericType
  type Tag <: ItemTag
  type NameType
  type DebugType <: ItemTag
}

class WrapTagImpl[GT, TT <: ItemTag, NN, DBType <: ItemTag] extends WrapTag {
  override type GenericType = GT
  override type Tag         = TT
  override type NameType    = NN
  override type DebugType   = DBType
}

trait AsunaGeneric[H] {
  type WT <: WrapTag
  def tag: AppendTag[WT#Tag]
  def getter: H => WT#GenericType
  def setter: WT#GenericType => H
  def names: WT#NameType
  def debugInstance: WT#DebugType //WT#Tag#InputMessage[WT#DebugType]#Result
}

object AsunaGeneric {

  def init[M] = new GenericApply[M] {}

  trait GenericApply[M] {
    def generic[WW <: WrapTag](implicit i: AsunaGeneric.Aux[M, WW]): AsunaGeneric.Aux[M, WW] = i

    def init1[K <: ItemTag, K1 <: MessageContent](i: AppendTag[K], debugTag: AppendTag[K1]): GenericApply1[M, K, K1] = new GenericApply1[M, K, K1] {
      override def init2[T](ii: M => K#XyyItemType, mm: K#XyyItemType => M, n: T): Aux[M, WrapTagImpl[K#XyyItemType, K, T, K#InputMessage[K1]#Result]] = {
        new AsunaGeneric[M] {
          override type WT = WrapTagImpl[K#XyyItemType, K, T, K#InputMessage[K1]#Result]
          override def tag                                      = i
          override def getter                                   = ii
          override def setter                                   = mm
          override def names                                    = n
          override def debugInstance: K#InputMessage[K1]#Result = throw new Exception("debugging...")
        }
      }
    }
  }

  trait GenericApply1[M, K <: ItemTag, K1 <: MessageContent] {
    def init2[T](ii: M => K#XyyItemType, mm: K#XyyItemType => M, n: T): Aux[M, WrapTagImpl[K#XyyItemType, K, T, K#InputMessage[K1]#Result]]
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

        val nameTag = if (proTypeTag.length <= 22) {
          q"""(s: ${h}) => { org.scalax.asuna.mapper.item.BuildTagContect.${TermName("item" + proTypeTag.length)}(..${props.map(s => q"""s.${TermName(s)}""")}) }"""
        } else {
          q"""(s: ${h}) => {
          org.scalax.asuna.mapper.item.BuildTagContect.${TermName("item" + proTypeTag.grouped(22).length)}(..${props.grouped(22).toList.map { ii =>
            q"""org.scalax.asuna.mapper.item.BuildTagContect.${TermName("item" + ii.length)}(..${ii.map { p =>
              q"""s.${TermName(p)}"""
            }})"""
          }})
          }"""
        }

        val nameProTag = if (proTypeTag.length <= 22) {
          q"""org.scalax.asuna.mapper.item.BuildTagContect.${TermName("item" + proTypeTag.length)}(..${props.map(s => q"""${Literal(Constant(s))}""")})"""
        } else {
          q"""org.scalax.asuna.mapper.item.BuildTagContect.${TermName("item" + proTypeTag.grouped(22).length)}(..${props.grouped(22).toList.map { ii =>
            q"""org.scalax.asuna.mapper.item.BuildTagContect.${TermName("item" + ii.length)}(..${ii.map { p =>
              q"""${Literal(Constant(p))}"""
            }})"""
          }})"""
        }

        val proSize = props.size

        def inputItem: List[(String, Tree)] = {
          if (proSize < 22) {
            props.zipWithIndex.map {
              case (r, index) =>
                (r, q"""item.${TermName("i" + (index + 1))}""")
            }
          } else {
            props
              .grouped(22)
              .zipWithIndex
              .map {
                case (item, index) =>
                  item.zipWithIndex.map { case (item1, index1) => (item1, q"""item.${TermName("i" + (index + 1))}.${TermName("i" + (index1 + 1))}""") }
              }
              .flatten
              .toList
          }
        }

        val inputFunc = q"""{ item => ${hType.companion}.apply(..${inputItem.map { case (item, m) => q"""${TermName(item)} = ${m}""" }}) }"""

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
          q"""org.scalax.asuna.mapper.append.macroImpl.AsunaGeneric.init[${hType}].init1(${typeTag}, ${inputMessage}).init2(${nameTag}, ${inputFunc}, ${nameProTag})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
