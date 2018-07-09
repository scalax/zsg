package net.scalax.asuna.core.decoder

import net.scalax.asuna.core.common.DataGroup

case class SplitData[T](current: T, left: DataGroup)