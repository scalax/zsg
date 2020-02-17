package asuna

final class AppendTag[T] {
  type Tag = T
  def tag: T = throw new Exception("debuging...")
}

object AppendTag {
  final val tag                            = new AppendTag[Any]
  inline final def apply[T]: AppendTag[T] = tag.asInstanceOf[AppendTag[T]]
}