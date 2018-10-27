package net.scalax.asuna.mapper.common

import net.scalax.asuna.core.common.Placeholder

import scala.language.implicitConversions

trait PropertyType[Pro]

object PropertyType {

  trait ModelApply[Model] {
    @inline def apply[F](f: Model => F): PropertyType[F] = null
  }

  @inline def fromModel[Model]: ModelApply[Model] = new ModelApply[Model] {}
  @inline def apply[Model]: PropertyType[Model]   = null

  trait ToPlaceholderApply[Pro] {
    @inline def toPlaceholder: Placeholder[Pro] = null
  }

  @inline implicit def propertyTypeToPlaceholderImplicit[Pro](p: PropertyType[Pro]): ToPlaceholderApply[Pro] = new ToPlaceholderApply[Pro] {}

}
