package asuna

class ItemTag1[T1, M1 <: Message] extends ItemTag {
  override type ItemType = Item1[T1]
  import impl._
  override type M[M <: Message] = ItemTag1[T1, M :-<>-: M1]

  def debug[K <: KindContext, I1 <: TypeParameter](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1]
  ): Application[K, ItemTag1[T1, Message], ItemTypeParameter1[I1]] =
    ItemTag1.itemTagApplicationImplicit1(dapp1)
}
object ItemTag1 {
  implicit def itemTagApplicationImplicit1[K <: KindContext, H1, T1 <: TypeParameter, M1 <: Message](
    implicit t1: Application[K, H1, T1]
  ): Application[K, ItemTag1[H1, M1], ItemTypeParameter1[T1]] =
    new Application[K, ItemTag1[H1, M1], ItemTypeParameter1[T1]] {
      override def application(context: Context[K]): K#M[ItemTypeParameter1[T1]] = {
        if (context.isReverse) {
          context.append(context.start, t1.application(context), ItemTypeParameterPlus1.hlistPut1)
        } else {
          context.append(context.start, t1.application(context), ItemTypeParameterPlus1.hlistPlus1)
        }
      }
    }
}
