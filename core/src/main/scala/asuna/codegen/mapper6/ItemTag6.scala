package asuna
import impl._
class ItemTag6[T1, M1 <: Message, T2, M2 <: Message, T3, M3 <: Message, T4, M4 <: Message, T5, M5 <: Message, T6, M6 <: Message] extends ItemTag {
  override type ItemType        = Item6[T1, T2, T3, T4, T5, T6]
  override type M[M <: Message] = ItemTag6[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4, T5, M :-<>-: M5, T6, M :-<>-: M6]
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList, I5 <: TypeHList, I6 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1],
    dapp2: DebugItemApplication[K, T2, I2, M2],
    dapp3: DebugItemApplication[K, T3, I3, M3],
    dapp4: DebugItemApplication[K, T4, I4, M4],
    dapp5: DebugItemApplication[K, T5, I5, M5],
    dapp6: DebugItemApplication[K, T6, I6, M6]
  ): Application[K, ItemTag6[T1, M1, T2, M2, T3, M3, T4, M4, T5, M5, T6, M6], ItemTypeHList6[I1, I2, I3, I4, I5, I6]] =
    ItemTag6.itemTagApplicationImplicit6(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6)
}
object ItemTag6 {
  implicit def itemTagApplicationImplicit6[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6]
  ): Application[K, ItemTag6[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6], ItemTypeHList6[T1, T2, T3, T4, T5, T6]] =
    new Application[K, ItemTag6[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6], ItemTypeHList6[T1, T2, T3, T4, T5, T6]] {
      override def application(context: Context[K]): K#M[ItemTypeHList6[T1, T2, T3, T4, T5, T6]] = {
        if (context.isReverse) {
          context.append[ItemTypeHList5[T2, T3, T4, T5, T6], T1, ItemTypeHList6[T1, T2, T3, T4, T5, T6]](
            context.append[ItemTypeHList4[T3, T4, T5, T6], T2, ItemTypeHList5[T2, T3, T4, T5, T6]](
              context.append[ItemTypeHList3[T4, T5, T6], T3, ItemTypeHList4[T3, T4, T5, T6]](
                context.append[ItemTypeHList2[T5, T6], T4, ItemTypeHList3[T4, T5, T6]](
                  context.append[ItemTypeHList1[T6], T5, ItemTypeHList2[T5, T6]](
                    context.append[ItemTypeHList0, T6, ItemTypeHList1[T6]](context.start, t6.application(context), ItemTypeHListPlus1.hlistPlus1),
                    t5.application(context),
                    ItemTypeHListPlus2.put2
                  ),
                  t4.application(context),
                  ItemTypeHListPlus3.put3
                ),
                t3.application(context),
                ItemTypeHListPlus4.put4
              ),
              t2.application(context),
              ItemTypeHListPlus5.put5
            ),
            t1.application(context),
            ItemTypeHListPlus6.put6
          )
//context.append(ItemTag5.itemTagApplicationImplicit5( t2  ,   t3  ,   t4  ,   t5  ,   t6  ).application(context), t1.application(context), ItemTypeHListPlus6.put6)
        } else {
          context.append[ItemTypeHList5[T1, T2, T3, T4, T5], T6, ItemTypeHList6[T1, T2, T3, T4, T5, T6]](
            context.append[ItemTypeHList4[T1, T2, T3, T4], T5, ItemTypeHList5[T1, T2, T3, T4, T5]](
              context.append[ItemTypeHList3[T1, T2, T3], T4, ItemTypeHList4[T1, T2, T3, T4]](
                context.append[ItemTypeHList2[T1, T2], T3, ItemTypeHList3[T1, T2, T3]](
                  context.append[ItemTypeHList1[T1], T2, ItemTypeHList2[T1, T2]](
                    context.append[ItemTypeHList0, T1, ItemTypeHList1[T1]](context.start, t1.application(context), ItemTypeHListPlus1.hlistPlus1),
                    t2.application(context),
                    ItemTypeHListPlus2.plus2
                  ),
                  t3.application(context),
                  ItemTypeHListPlus3.plus3
                ),
                t4.application(context),
                ItemTypeHListPlus4.plus4
              ),
              t5.application(context),
              ItemTypeHListPlus5.plus5
            ),
            t6.application(context),
            ItemTypeHListPlus6.plus6
          )
//context.append(ItemTag5.itemTagApplicationImplicit5( t1  ,   t2  ,   t3  ,   t4  ,   t5  ).application(context), t6.application(context), ItemTypeHListPlus6.plus6)
        }
      }
    }
}
