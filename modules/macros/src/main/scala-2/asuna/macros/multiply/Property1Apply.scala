package asuna.macros.multiply

import asuna.{AppendTag, PropertyTag1}

import scala.language.experimental.macros

class Property1Apply[Table, Model] {

  def to[Rep, Pro](i: Table => Rep, i2: Model => Pro): AppendTag[PropertyTag1[Rep, Pro]] = AppendTag[PropertyTag1[Rep, Pro]]

}

object Property1Apply {
  val value: Property1Apply[Any, Any]                   = new Property1Apply[Any, Any]
  def apply[Table, Model]: Property1Apply[Table, Model] = value.asInstanceOf[Property1Apply[Table, Model]]
}
