package net.scalax.asuna.sangria

import net.scalax.asuna.sangria.macroImpls.CompletedIdMacro

import scala.language.experimental.macros

trait CompletedId[T] {
  def id: T
}

object CompletedId {

  implicit def stringCompletedId: CompletedId[String] = macro CompletedIdMacro.CompletedIdMacroImpl.impl

}