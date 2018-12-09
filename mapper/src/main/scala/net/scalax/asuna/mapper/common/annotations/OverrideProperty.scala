package org.scalax.asuna.mapper.common.annotations

import scala.annotation.StaticAnnotation

case class OverrideProperty(name: String, order: Int = OverrideProperty.defaultReWritePropertyOrder) extends StaticAnnotation

object OverrideProperty {
  val defaultReWritePropertyOrder: Int = 0
}
