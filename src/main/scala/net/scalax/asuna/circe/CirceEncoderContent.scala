package net.scalax.asuna.core

import io.circe.Encoder
import net.scalax.asuna.circe.{ HaveCirceImplicit, UseAsunaImplicit }

import scala.reflect.macros.whitebox

trait CirceEncoderContent[D] {
  type TargetType
  val encoderOpt: Option[Encoder[D]]
}

object CirceEncoderContent {
  type Aux[D, T] = CirceEncoderContent[D] { type TargetType = T }

  def asunaEncoder[D]: Aux[D, UseAsunaImplicit] = {
    object impl extends CirceEncoderContent[D] {
      override type TargetType = UseAsunaImplicit
      override val encoderOpt = Option.empty
    }
    impl
  }

  def circeEncoder[D](implicit encoder: Encoder[D]): Aux[D, HaveCirceImplicit] = {
    val encoder1 = encoder
    object impl extends CirceEncoderContent[D] {
      override type TargetType = HaveCirceImplicit
      override val encoderOpt = Option(encoder1)
    }
    impl
  }

  import scala.language.experimental.macros

  implicit def circeEncoderContentImplicit[D, R]: Aux[D, R] = macro wrapImpl.inferImpl[D, R]

  object wrapImpl {
    def inferImplicitInPrefixContext[T: c.WeakTypeTag](c: whitebox.Context): c.Tree = {
      import c.universe._
      val encoder = weakTypeOf[Encoder[T]]
      c.typecheck(
        q"""{
          import ${c.prefix}._
          _root_.scala.Predef.implicitly[$encoder]
          }""",
        silent = true)
    }

    def inferImpl[T: c.WeakTypeTag, R: c.WeakTypeTag](c: whitebox.Context): c.Tree = {
      import c.universe._
      val encoderWrap = weakTypeOf[CirceEncoderContent[T]].typeSymbol.companion
      val t = weakTypeOf[T]
      val haveCirceImplicit = weakTypeOf[HaveCirceImplicit]
      val useAsunaImplicit = weakTypeOf[UseAsunaImplicit]
      val encoder = weakTypeOf[Encoder[T]]
      val q = inferImplicitInPrefixContext[T](c) match {
        case EmptyTree => q"$encoderWrap.asunaEncoder[$t]: $encoderWrap.Aux[$t,$useAsunaImplicit]"
        case _ => q"$encoderWrap.circeEncoder[$t](_root_.scala.Predef.implicitly[$encoder]): $encoderWrap.Aux[$t,$haveCirceImplicit]"
      }
      q
    }
  }

}