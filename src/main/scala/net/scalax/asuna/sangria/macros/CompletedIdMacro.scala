package net.scalax.asuna.sangria.macroImpls

import java.util.UUID

import net.scalax.asuna.sangria.CompletedId

import scala.reflect.macros.blackbox.Context
import scala.language.experimental.macros

object CompletedIdMacro {

  class CompletedIdMacroImpl(val c: Context) {

    import c.universe._

    def impl: c.Expr[CompletedId[String]] = {
      val uuidStr = Literal(Constant(UUID.randomUUID.toString))
      c.Expr[CompletedId[String]] {
        q"""new _root_.net.scalax.asuna.sangria.CompletedId[String] {
          override val id: String = ${uuidStr}
        }"""
      }
    }

  }

}