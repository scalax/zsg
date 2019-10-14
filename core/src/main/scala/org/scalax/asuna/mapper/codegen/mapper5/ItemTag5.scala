package org.scalax.asuna.mapper
import impl._
class ItemTag5[T1, M1 <: Message, T2, M2 <: Message, T3, M3 <: Message, T4, M4 <: Message, T5, M5 <: Message] extends ItemTag {
  override type ItemType        = Item5[T1, T2, T3, T4, T5]
  override type M[M <: Message] = ItemTag5[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4, T5, M :-<>-: M5]
  def debug[K <: KindContext, I1 <: TypeParameter, I2 <: TypeParameter, I3 <: TypeParameter, I4 <: TypeParameter, I5 <: TypeParameter](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1],
    dapp2: DebugItemApplication[K, T2, I2, M2],
    dapp3: DebugItemApplication[K, T3, I3, M3],
    dapp4: DebugItemApplication[K, T4, I4, M4],
    dapp5: DebugItemApplication[K, T5, I5, M5]
  ): Application[K, ItemTag5[T1, M1, T2, M2, T3, M3, T4, M4, T5, M5], ItemTypeParameter5[I1, I2, I3, I4, I5]] =
    ItemTag5.itemTagApplicationImplicit5(dapp1, dapp2, dapp3, dapp4, dapp5)
}
object ItemTag5 {
  implicit def itemTagApplicationImplicit5[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    T1 <: TypeParameter,
    T2 <: TypeParameter,
    T3 <: TypeParameter,
    T4 <: TypeParameter,
    T5 <: TypeParameter,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5]
  ): Application[K, ItemTag5[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5], ItemTypeParameter5[T1, T2, T3, T4, T5]] =
    new Application[K, ItemTag5[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5], ItemTypeParameter5[T1, T2, T3, T4, T5]] {
      override def application(context: Context[K]): K#M[ItemTypeParameter5[T1, T2, T3, T4, T5]] = {
        if (context.isReverse) {
          context.append[ItemTypeParameter4[T2, T3, T4, T5], T1, ItemTypeParameter5[T1, T2, T3, T4, T5]](
            context.append[ItemTypeParameter3[T3, T4, T5], T2, ItemTypeParameter4[T2, T3, T4, T5]](
              context.append[ItemTypeParameter2[T4, T5], T3, ItemTypeParameter3[T3, T4, T5]](
                context.append[ItemTypeParameter1[T5], T4, ItemTypeParameter2[T4, T5]](
                  context.append[ItemTypeParameter0, T5, ItemTypeParameter1[T5]](context.start, t5.application(context), ItemTypeParameterPlus1.hlistPlus1),
                  t4.application(context),
                  ItemTypeParameterPlus2.put2
                ),
                t3.application(context),
                ItemTypeParameterPlus3.put3
              ),
              t2.application(context),
              ItemTypeParameterPlus4.put4
            ),
            t1.application(context),
            ItemTypeParameterPlus5.put5
          )
//context.append(ItemTag4.itemTagApplicationImplicit4( t2  ,   t3  ,   t4  ,   t5  ).application(context), t1.application(context), ItemTypeParameterPlus5.put5)
        } else {
          context.append[ItemTypeParameter4[T1, T2, T3, T4], T5, ItemTypeParameter5[T1, T2, T3, T4, T5]](
            context.append[ItemTypeParameter3[T1, T2, T3], T4, ItemTypeParameter4[T1, T2, T3, T4]](
              context.append[ItemTypeParameter2[T1, T2], T3, ItemTypeParameter3[T1, T2, T3]](
                context.append[ItemTypeParameter1[T1], T2, ItemTypeParameter2[T1, T2]](
                  context.append[ItemTypeParameter0, T1, ItemTypeParameter1[T1]](context.start, t1.application(context), ItemTypeParameterPlus1.hlistPlus1),
                  t2.application(context),
                  ItemTypeParameterPlus2.plus2
                ),
                t3.application(context),
                ItemTypeParameterPlus3.plus3
              ),
              t4.application(context),
              ItemTypeParameterPlus4.plus4
            ),
            t5.application(context),
            ItemTypeParameterPlus5.plus5
          )
//context.append(ItemTag4.itemTagApplicationImplicit4( t1  ,   t2  ,   t3  ,   t4  ).application(context), t5.application(context), ItemTypeParameterPlus5.plus5)
        }
      }
    }
}