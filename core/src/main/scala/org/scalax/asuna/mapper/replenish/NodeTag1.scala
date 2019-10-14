package asuna
import impl._

class NodeTag1[T1 <: ItemTag, M1 <: Message] extends ItemTag {
  override type ItemType        = Item1[T1#ItemType]
  override type M[M <: Message] = NodeTag1[T1, M :-<>-: M1]

  def debug[K <: KindContext, I1 <: TypeParameter](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, `Message： Please change .debug(context) to .find0.debug(context).`]
  ): Application[K, NodeTag1[T1, M1], ItemTypeParameter1[I1]] =
    NodeTag1.noteTagApplicationImplicit1(dapp1)
}
object NodeTag1 {
  implicit def noteTagApplicationImplicit1[
    K <: KindContext,
    H1 <: ItemTag,
    T1 <: TypeParameter,
    M1 <: Message
  ](
    implicit t1: Application[K, H1, T1]
  ): Application[K, NodeTag1[H1, M1], ItemTypeParameter1[T1]] =
    new Application[K, NodeTag1[H1, M1], ItemTypeParameter1[T1]] {
      override def application(context: Context[K]): K#M[ItemTypeParameter1[T1]] = {
        if (context.isReverse) {
          context.append(context.start, t1.application(context), ItemTypeParameterPlus1.hlistPut1)
        } else {
          context.append(context.start, t1.application(context), ItemTypeParameterPlus1.hlistPlus1)
        }
      }
    }
}
