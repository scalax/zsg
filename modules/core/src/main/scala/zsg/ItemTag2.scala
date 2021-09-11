package zsg

class ItemTag2[I1, I2]

object ItemTag2 {
  val itemTagAny                                      = new ItemTag2[Any, Any]
  def apply[I1, I2]: ItemTag2[I1, I2]                 = itemTagAny.asInstanceOf[ItemTag2[I1, I2]]
  def apply[I1, I2](i1: I1, i2: I2): ItemTag2[I1, I2] = apply[I1, I2]
}
