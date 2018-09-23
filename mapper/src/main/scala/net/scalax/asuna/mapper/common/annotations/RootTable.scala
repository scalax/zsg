package net.scalax.asuna.mapper.common.annotations

import scala.annotation.StaticAnnotation

class RootTable(order: Int = RootTable.defaultRootTableOrder) extends StaticAnnotation

object RootTable {
  val defaultRootTableOrder: Int = 0
}
