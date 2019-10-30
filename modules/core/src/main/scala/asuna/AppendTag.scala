package asuna

class AppendTag[T] {
  def tag: T = throw new Exception("debuging...")
}

object AppendTag {
  def apply[T] = new AppendTag[T]
}
