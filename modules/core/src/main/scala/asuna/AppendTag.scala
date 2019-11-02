package asuna

class AppendTag[T] {
  type Tag = T
  def tag: T = throw new Exception("debuging...")
}

object AppendTag {
  val tag                            = new AppendTag[Any]
  @inline def apply[T]: AppendTag[T] = tag.asInstanceOf[AppendTag[T]]
}
