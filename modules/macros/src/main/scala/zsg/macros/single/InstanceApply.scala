package zsg.macros.single

import zsg.PropertyTag

class InstanceApply {
  def to[R]: PropertyTag[R] = PropertyTag[R]
}
object InstanceApply {
  private val value: InstanceApply = new InstanceApply
  def apply: InstanceApply         = value
}
