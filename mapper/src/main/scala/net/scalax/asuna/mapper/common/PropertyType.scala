package net.scalax.asuna.mapper.common

import net.scalax.asuna.core.common.Placeholder

import scala.language.implicitConversions

trait PropertyType[Pro]

object PropertyType {

  trait ModelApply[Model] {
    def apply[F](f: Model => F): PropertyType[F] = null
  }

  def fromModel[Model]: ModelApply[Model] = new ModelApply[Model] {}
  def apply[Model]: PropertyType[Model]   = null

  trait ToPlaceholderApply[Pro] {
    def toPlaceholder: Placeholder[Pro] = null

  }

  implicit def propertyTypeToPlaceholderImplicit[Pro](p: PropertyType[Pro]): ToPlaceholderApply[Pro] = new ToPlaceholderApply[Pro] {}

}
