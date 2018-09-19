package net.scalax.asuna.helper

import scala.annotation.StaticAnnotation

class RootTable(order: Int = DefaultRootTableOrder.order) extends StaticAnnotation

object DefaultRootTableOrder {
  val order: Int = 0
}
