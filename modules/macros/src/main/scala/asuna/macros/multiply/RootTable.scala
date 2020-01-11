package asuna.macros.multiply

import scala.annotation.StaticAnnotation
import scala.language.experimental.macros

case class RootTable(order: Int = RootTable.defaultRootTableOrder) extends StaticAnnotation

object RootTable {
  val defaultRootTableOrder: Int = 0
}
