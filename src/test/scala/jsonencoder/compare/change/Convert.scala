import scala.language.higherKinds

trait Convert {
  type M[I <: HListYQ] <: HListYQ
  def convert[I <: HListYQ](i: I): M[I]
}

class CloneYQ extends Convert {
  override type M[I <: HListYQ] = I
  override def convert[I <: HListYQ](i: I): I = i
}

object CloneYQ extends CloneYQ

class ReverseYQ extends Convert {
  override type M[I <: HListYQ] = YQImpl[I#Target, I#Source]
  override def convert[I <: HListYQ](i: I): YQImpl[I#Target, I#Source] = new YQImpl(i.target, i.source)
}

object ReverseYQ extends ReverseYQ
