package net.scalax.asuna.circe.another

import io.circe.Encoder
import net.scalax.asuna.circe.{ CirceAsunaEncoder, EmptyCirceTable }
import net.scalax.asuna.helper.encoder.{ EncoderHelper, ForTableInput }

import scala.language.experimental.macros
import scala.reflect.macros.whitebox

trait CirceEncoderConfirmOrder[T] {
  val encoderOpt: Option[Encoder[T]]
  val inputTableOpt: Option[ForTableInput[EmptyCirceTable, T, CirceAsunaEncoder]]
}

object CirceEncoderConfirmOrder {

  implicit def circeEncoderContentImplicit[D]: CirceEncoderConfirmOrder[D] = macro CirceMacro.AsunaCirceEncoderHelper.inferImpl[D]

  def needCirce[D](encoder: Encoder[D]): CirceEncoderConfirmOrder[D] = {
    new CirceEncoderConfirmOrder[D] {
      override val encoderOpt = Option(encoder)
      override val inputTableOpt = Option.empty
    }
  }

  def needInputTable[D](it: ForTableInput[EmptyCirceTable, D, CirceAsunaEncoder]): CirceEncoderConfirmOrder[D] = {
    new CirceEncoderConfirmOrder[D] {
      override val encoderOpt = Option.empty
      override val inputTableOpt = Option(it)
    }
  }

}

trait HaveCirceEncoderTag
object HaveCirceEncoderTag {
  val haveCirceEncoderTagInstance: HaveCirceEncoderTag = new HaveCirceEncoderTag {}
}

trait UseAsunaEncoderTag
object UseAsunaEncoderTag {
  val useAsunaEncoderTagInstance: UseAsunaEncoderTag = new UseAsunaEncoderTag {}
}

object CirceMacro {

  case class ImplicitExists(circe: Boolean, asuna: Boolean)

  def inferImplicitInPrefixContext[T: c.WeakTypeTag](c: whitebox.Context): ImplicitExists = {
    import c.universe._
    val encoder = weakTypeOf[Encoder[T]]
    val inputTable = weakTypeOf[ForTableInput[EmptyCirceTable, T, CirceAsunaEncoder]]
    println(s"22-$inputTable")
    val circeExists = c.typecheck(
      q"""{
          import ${c.prefix}._
          _root_.scala.Predef.implicitly[$encoder]
          }""",
      silent = true) match {
        case EmptyTree => false
        case _ => true
      }
    println(s"33-circeExists-$circeExists")

    val tree2 = q"""{
          import ${c.prefix}._
          _root_.scala.Predef.implicitly[$inputTable]
          }"""

    val asunaExists = c.typecheck(
      tree2,
      silent = true) match {
      case EmptyTree => false
      case _ => true
    }
    println(s"33-asunaExists-$asunaExists")
    println(s"66-$tree2")
    ImplicitExists(circe = circeExists, asuna = asunaExists)
  }

  object AsunaCirceEncoderHelper {

    def inferImpl[T: c.WeakTypeTag](c: whitebox.Context): c.Tree = {
      import c.universe._
      try {
        val circeConfirm = weakTypeOf[CirceEncoderConfirmOrder[T]]
        val haveCirceImplicit = weakTypeOf[HaveCirceEncoderTag]
        val encoderHelper = weakTypeOf[EncoderHelper[CirceAsunaEncoder]]
        val t = weakTypeOf[T]
        val circeEncoder = weakTypeOf[Encoder[T]]
        val emptyCirceTable = weakTypeOf[EmptyCirceTable]
        val inputTable = weakTypeOf[ForTableInput[EmptyCirceTable, T, CirceAsunaEncoder]]
        val implicitConfirmResult = inferImplicitInPrefixContext[T](c)
        println(s"11-${t}-${inputTable}-${implicitConfirmResult}\n")
        val q = implicitConfirmResult match {
          case ImplicitExists(true, _) =>
            q"${circeConfirm.typeSymbol.companion}.needCirce[$t](_root_.scala.Predef.implicitly[$circeEncoder]): $circeConfirm"
          case ImplicitExists(false, true) =>
            q"${circeConfirm.typeSymbol.companion}.needInputTable[$t](_root_.scala.Predef.implicitly[$inputTable]): $circeConfirm"
          case ImplicitExists(false, false) =>
            q"${circeConfirm.typeSymbol.companion}.needInputTable[$t](new $encoderHelper { }.caseOnly[$emptyCirceTable, $t]): $circeConfirm"
        }
        q
      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }

  }
}