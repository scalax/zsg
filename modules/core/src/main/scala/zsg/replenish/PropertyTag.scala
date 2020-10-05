package zsg
trait PropertyTag[T]

object PropertyTag {
  val value: PropertyTag[Any]  = new PropertyTag[Any] {}
  def apply[T]: PropertyTag[T] = value.asInstanceOf[PropertyTag[T]]
}
