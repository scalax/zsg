package net.scalax.asuna.mapper.common

import net.scalax.asuna.core.common.Placeholder

trait PropertyType[Pro] {
  def toPlaceholder: Placeholder[Pro] = Placeholder.value[Pro]
}

trait ModelGen[Model] {
  def apply[Pro](f: Model => Pro): PropertyType[Pro] = new PropertyType[Pro] {}
}

object ModelGen {
  def value[Model]: ModelGen[Model] = new ModelGen[Model] {}
}
