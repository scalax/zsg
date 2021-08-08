package zsg.macros.case_class_test

sealed trait PropertyItem

case class IntProperty(i: Int) extends PropertyItem {
  override def toString = s"Int(${i})"
}

case class StringProperty(i: String) extends PropertyItem {
  override def toString = s"String(${i})"
}

case class LongProperty(i: Long) extends PropertyItem {
  override def toString = s"Long(${i})"
}

case class DefaultValue(value: Option[PropertyItem], fieldIndex: Int)

case class FieldModel(value: PropertyItem, fieldIndex: Int, fieldName: String, typeName: String)
