package org.scalax.asuna.mapper.append

import org.scalax.asuna.mapper.append.macroImpl._

import scala.collection.immutable.Queue
import scala.reflect.macros.blackbox

trait MacroContent[I <: blackbox.Context] {

  val c: I

  import c.universe._

  def init: ResultContent
  def children: List[MacroChildActor[c.type]]

  def genChildren: List[MacroChildActor[c.type]] = {
    val message1 = init.m.map(s => (s.changeCurrent(false), -1))
    genChildrenImpl(Queue(message1: _*), children.zipWithIndex)
  }

  def result: List[Tree] = genChildren.map(_.tree)

  def genChildrenImpl(pQueue: Queue[(MacroMessage, Int)], pActors: List[(MacroChildActor[c.type], Int)]): List[MacroChildActor[c.type]] = {

    val (pQueue1, pActor1) = pQueue.dequeueOption match {
      case Some(((_: DoneResult, _: Int), i)) =>
        (i, pActors)
      case Some(((content: MacroMessage, index: Int), i)) =>
        val (newActors2, sQueue1) = pActors.map {
          case (d, sIndex) =>
            val (nsActor1, subContent) = if (index == sIndex) {
              d.receive(content.changeCurrent(true))
            } else {
              d.receive(content.changeCurrent(false))
            }
            ((nsActor1, sIndex), subContent match {
              case _: DoneResult    => List.empty
              case n: ResultContent => n.m.map(s => (s, sIndex))
            })
        }.unzip
        (i.enqueue(sQueue1.flatten), newActors2)
      case None =>
        (pQueue, pActors)
    }

    if (pQueue1.isEmpty) {
      pActor1.map(_._1)
    } else {
      genChildrenImpl(pQueue1, pActor1)
    }

  }

}
