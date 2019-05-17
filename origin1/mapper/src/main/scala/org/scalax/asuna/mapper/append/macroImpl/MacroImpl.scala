package org.scalax.asuna.mapper.append

import org.scalax.asuna.mapper.append.macroImpl._

import scala.collection.immutable.Queue
import scala.reflect.macros.blackbox

trait MacroContent[I <: blackbox.Context] {

  val c: I

  import c.universe._

  def parent: MacroParentActor[c.type]
  def children: List[MacroChildActor[c.type]]

  def genChildren: List[MacroChildActor[c.type]] = {
    val message1 = parent.init.m.map(s => (s, -1))
    genChildrenImpl(Queue(message1: _*), Queue.empty, children.zipWithIndex, parent)
  }

  def result: List[Tree] = genChildren.map(_.tree)

  def genChildrenImpl(pQueue: Queue[(P2SMessage, Int)],
                      sQueue: Queue[(S2PMessage, Int)],
                      sActors: List[(MacroChildActor[c.type], Int)],
                      pActor: MacroParentActor[c.type]): List[MacroChildActor[c.type]] = {

    val (pQueue1, sQueue1, sActors1, pActor1) = pQueue.dequeueOption match {
      case Some(((_: ParentDone, _: Int), i)) =>
        (i, sQueue, sActors, pActor)
      case Some(((content: P2SMessage, index: Int), i)) =>
        val (newActors2, sQueue1) = sActors.map {
          case (d, sIndex) =>
            val (nsActor1, subContent) = if (index == sIndex) {
              d.receive(content.changeCurrent(true))
            } else {
              d.receive(content.changeCurrent(false))
            }
            ((nsActor1, sIndex), subContent match {
              case _: SubDone    => List.empty
              case n: SubContent => n.m.map(s => (s, sIndex))
            })
        }.unzip
        (i, sQueue.enqueue(sQueue1.flatten), newActors2, pActor)
      case None =>
        (pQueue, sQueue, sActors, pActor)
    }

    val (i2, sQueue2, sActors2, pActor2) = sQueue1.dequeueOption match {
      case Some(((_: SubDone, _: Int), i)) =>
        (pQueue1, i, sActors1, pActor1)
      case Some(((content: S2PMessage, index: Int), i)) =>
        val (newPActor, m) = pActor1.receive(content)
        (pQueue1.enqueue(m match {
          case _: ParentDone    => List.empty
          case n: ParentContent => n.m.map(r => (r, index))
        }), i, sActors1, newPActor)
      case None =>
        (pQueue1, sQueue1, sActors1, pActor1)
    }

    if (i2.isEmpty && sQueue2.isEmpty) {
      sActors1.map(_._1)
    } else {
      genChildrenImpl(i2, sQueue2, sActors2, pActor2)
    }

  }

}
