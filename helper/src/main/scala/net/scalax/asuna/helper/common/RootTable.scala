package net.scalax.asuna.helper

import scala.annotation.StaticAnnotation

class RootTable(order: Int = DefaultRootTableOrder.order) extends StaticAnnotation

object DefaultRootTableOrder {
  val order: Int = 0
}

class ReWriteProperty(name: String, order: Int = DefaultReWritePropertyOrder.order) extends StaticAnnotation

object DefaultReWritePropertyOrder {
  val order: Int = 0
}
class RootDataProperty[T]() extends StaticAnnotation
