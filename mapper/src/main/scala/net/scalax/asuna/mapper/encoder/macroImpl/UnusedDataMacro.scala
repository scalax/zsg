package net.scalax.asuna.mapper.encoder.macroImpl

import scala.language.experimental.macros

object UnusedDataMacro {

  trait UnusedDataTran[Source, Target] extends Function1[Source, Target] {
    self =>
    override def apply(s: Source): Target
    override def compose[A](g: A => Source): UnusedDataTran[A, Target] = new UnusedDataTran[A, Target] {
      override def apply(s: A): Target = self.apply(g(s))
    }
    override def andThen[A](g: Target => A): UnusedDataTran[Source, A] = new UnusedDataTran[Source, A] {
      override def apply(s: Source): A = g(self.apply(s))
    }
  }

  object UnusedDataTran {
    implicit def dataImplicit[Source, Target]: UnusedDataTran[Source, Target] = macro UnusedDataMacroImpl.add[Source, Target]
  }

  class UnusedDataMacroImpl(val c: scala.reflect.macros.blackbox.Context) {

    import c.universe._

    def add[Source: c.WeakTypeTag, Target: c.WeakTypeTag]: c.Expr[UnusedDataTran[Source, Target]] = {
      val source         = weakTypeOf[Source]
      val target         = weakTypeOf[Target]
      val UnusedDataTran = weakTypeOf[UnusedDataTran[Source, Target]]

      val modelName = c.freshName("model")

      val outputFieldNames = target.members
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList
        .reverse

      val q = c.Expr[UnusedDataTran[Source, Target]] {
        q"""
        new ${UnusedDataTran} {
          override def apply(${TermName(modelName)}: ${source}): ${target} = {
            ${target.typeSymbol.companion}.apply(..${outputFieldNames.map { s =>
          q"""${TermName(s)} = ${TermName(modelName)}.${TermName(s)}"""
        }})
          }
        }: ${UnusedDataTran}
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }

  }

}
