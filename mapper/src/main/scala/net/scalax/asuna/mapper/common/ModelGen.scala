package org.scalax.asuna.mapper.common

trait PropertyType[P]

object PropertyType {
  def value[P]: PropertyType[P] = new PropertyType[P] {}
}

trait ModelGen[Model] {
  def withPro[P](func: Model => P): PropertyType[P] = PropertyType.value[P]
}

object ModelGen {
  def value[M]: ModelGen[M] = new ModelGen[M] {}
}
