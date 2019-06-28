object Test01 extends App {

  trait Space {
    type Current
    type Sub <: Space
    def current: Current
    def sub: Sub
  }

  class `黄土` extends Space {
    self =>
    override val current: String = "黄土"
    override type Current = String
    override type Sub     = `黄土`
    override def sub: `黄土` = self
  }

  class `地面` extends Space {
    self =>
    override val current: String = "地狱"
    override type Current = String
    override type Sub     = `地狱`
    override def sub: `地狱` = new `地狱`
  }

  class `地狱` extends Space {
    self =>
    override val current: String = "地狱"
    override type Current = String
    override type Sub     = `地狱`
    override def sub: `地狱` = self
  }

  class `你自己1` extends Space {
    self =>
    override val current: String = "相信黄泉的我自己"
    override type Current = String
    override type Sub     = `黄土`
    override def sub: `黄土` = new `黄土`
  }

  class `你自己2` extends Space {
    self =>
    override val current: String = "相信地狱的我自己"
    override type Current = String
    override type Sub     = `地面`
    override def sub: `地面` = new `地面`
  }

  class `天空1` extends Space {
    self =>
    override val current: String = "天空1"
    override type Current = String
    override type Sub     = `你自己1`
    override def sub: `你自己1` = new `你自己1`
  }

  class `天空2` extends Space {
    self =>
    override val current: String = "天空2"
    override type Current = String
    override type Sub     = `你自己2`
    override def sub: `你自己2` = new `你自己2`
  }

}
