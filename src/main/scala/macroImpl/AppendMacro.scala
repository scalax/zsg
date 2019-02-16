package org.scalax.asuna.mapper.append.macroImpl

import scala.reflect.macros.blackbox

trait MacroMessage {
  def isFromCurrent: Boolean
  def changeCurrent(isFrom: Boolean): MacroMessage
}

sealed trait SendResult

class DoneResult extends SendResult
object DoneResult {
  val done: DoneResult = new DoneResult
}

trait ResultContent extends SendResult {
  def m: List[MacroMessage]
}

trait MacroActor[I <: blackbox.Context] {
  def c: I
}

trait MacroChildActor[I <: blackbox.Context] extends MacroActor[I] {

  override val c: I

  import c.universe._

  def send(i: MacroMessage): ResultContent = {
    new ResultContent {
      override def m = List(i)
    }
  }

  def send(i: List[MacroMessage]): ResultContent = {
    new ResultContent {
      override def m = i
    }
  }

  def done: DoneResult = DoneResult.done

  def tree: Tree

  def receive: PartialFunction[MacroMessage, (MacroChildActor[I], SendResult)]

}
