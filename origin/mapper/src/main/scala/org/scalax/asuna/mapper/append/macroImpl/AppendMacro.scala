package org.scalax.asuna.mapper.append.macroImpl

import scala.reflect.macros.blackbox

sealed trait Message

trait P2SMessage extends Message {
  def isFromCurrent: Boolean
  def changeCurrent(isFrom: Boolean): P2SMessage
}

trait S2PMessage extends Message

sealed trait SendResult

sealed trait ParentResult extends SendResult

class ParentDone extends ParentResult
object ParentDone {
  val done: ParentDone = new ParentDone
}

sealed trait ParentContent extends ParentResult {
  def m: List[P2SMessage]
}

sealed trait SubResult extends SendResult

class SubDone extends SubResult
object SubDone {
  val done: SubDone = new SubDone
}

trait SubContent extends SubResult {
  def m: List[S2PMessage]
}

trait MacroActor[I <: blackbox.Context] {

  def c: I

}

trait MacroChildActor[I <: blackbox.Context] extends MacroActor[I] {

  override val c: I

  import c.universe._

  def sendToParent(i: S2PMessage): SubContent = {
    new SubContent {
      override def m = List(i)
    }
  }

  def sendToParent(i: List[S2PMessage]): SubContent = {
    new SubContent {
      override def m = i
    }
  }

  def done: SubDone = SubDone.done

  def tree: Tree

  def receive: PartialFunction[P2SMessage, (MacroChildActor[I], SubResult)]

}

trait MacroParentActor[I <: blackbox.Context] extends MacroActor[I] {

  override def c: I

  /*def sendToOther(i: P2SMessage): SendOtherMessage = {
    new SendOtherMessage {
      override def m = List(i)
    }
  }

  def sendToOther(i: List[P2SMessage]): SendOtherMessage = {
    new SendOtherMessage {
      override def m = i
    }
  }*/

  def sendToAll(i: P2SMessage): ParentContent = {
    new ParentContent {
      override def m = List(i)
    }
  }

  def sendToAll(i: List[P2SMessage]): ParentContent = {
    new ParentContent {
      override def m = i
    }
  }

  def done: ParentDone = ParentDone.done

  def init: ParentContent

  def receive: PartialFunction[S2PMessage, (MacroParentActor[I], ParentResult)]

}
