package net.scalax.asuna.mapper.common.annotations

import scala.annotation.StaticAnnotation

class OverrideProperty(name: String, order: Int = OverrideProperty.defaultReWritePropertyOrder) extends StaticAnnotation

object OverrideProperty {
  val defaultReWritePropertyOrder: Int = 0
}
