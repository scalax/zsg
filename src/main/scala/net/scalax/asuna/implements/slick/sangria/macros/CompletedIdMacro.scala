package org.scalax.asuna.sangria.macroImpls

import java.util.UUID

import org.scalax.asuna.sangria.CompletedId

import scala.reflect.macros.blackbox.Context

object CompletedIdMacro {

  class CompletedIdMacroImpl(val c: Context) {

    import c.universe._

    def impl: c.Expr[CompletedId[String]] = {
      val uuidStr = Literal(Constant(UUID.randomUUID.toString))
      c.Expr[CompletedId[String]] {
        q"""new _root_.org.scalax.asuna.sangria.CompletedId[String] {
          override val id: String = ${uuidStr}
        }"""
      }
    }

  }

}
