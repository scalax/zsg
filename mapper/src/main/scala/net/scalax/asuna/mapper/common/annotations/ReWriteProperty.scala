package net.scalax.asuna.helper

import scala.annotation.StaticAnnotation

class ReWriteProperty(name: String, order: Int = ReWriteProperty.defaultReWritePropertyOrder) extends StaticAnnotation

object ReWriteProperty {
  val defaultReWritePropertyOrder: Int = 0
}
