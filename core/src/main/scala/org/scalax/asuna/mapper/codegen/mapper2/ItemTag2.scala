package org.scalax.asuna.mapper
import impl._
class ItemTag2[T1, M1 <: Message, T2, M2 <: Message] extends ItemTag {
  override type ItemType        = Item2[T1, T2]
  override type M[M <: Message] = ItemTag2[T1, M :-<>-: M1, T2, M :-<>-: M2]
  def debug[K <: KindContext, I1 <: TypeParameter, I2 <: TypeParameter](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1],
    dapp2: DebugItemApplication[K, T2, I2, M2]
  ): Application[K, ItemTag2[T1, M1, T2, M2], ItemTypeParameter2[I1, I2]] =
    ItemTag2.itemTagApplicationImplicit2(dapp1, dapp2)
}
object ItemTag2 {
  implicit def itemTagApplicationImplicit2[K <: KindContext, H1, H2, T1 <: TypeParameter, T2 <: TypeParameter, M1 <: Message, M2 <: Message](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2]
  ): Application[K, ItemTag2[H1, M1, H2, M2], ItemTypeParameter2[T1, T2]] =
    new Application[K, ItemTag2[H1, M1, H2, M2], ItemTypeParameter2[T1, T2]] {
      override def application(context: Context[K]): K#M[ItemTypeParameter2[T1, T2]] = {
        if (context.isReverse) {
          context.append[ItemTypeParameter1[T2], T1, ItemTypeParameter2[T1, T2]](
            context.append[ItemTypeParameter0, T2, ItemTypeParameter1[T2]](context.start, t2.application(context), ItemTypeParameterPlus1.hlistPlus1),
            t1.application(context),
            ItemTypeParameterPlus2.put2
          )
//context.append(ItemTag1.itemTagApplicationImplicit1( t2  ).application(context), t1.application(context), ItemTypeParameterPlus2.put2)
        } else {
          context.append[ItemTypeParameter1[T1], T2, ItemTypeParameter2[T1, T2]](
            context.append[ItemTypeParameter0, T1, ItemTypeParameter1[T1]](context.start, t1.application(context), ItemTypeParameterPlus1.hlistPlus1),
            t2.application(context),
            ItemTypeParameterPlus2.plus2
          )
//context.append(ItemTag1.itemTagApplicationImplicit1( t1  ).application(context), t2.application(context), ItemTypeParameterPlus2.plus2)
        }
      }
    }
}
