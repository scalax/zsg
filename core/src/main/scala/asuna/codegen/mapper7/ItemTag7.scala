package asuna
import impl._
class ItemTag7[T1, M1 <: Message, T2, M2 <: Message, T3, M3 <: Message, T4, M4 <: Message, T5, M5 <: Message, T6, M6 <: Message, T7, M7 <: Message] extends ItemTag {
  override type ItemType        = Item7[T1, T2, T3, T4, T5, T6, T7]
  override type M[M <: Message] = ItemTag7[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4, T5, M :-<>-: M5, T6, M :-<>-: M6, T7, M :-<>-: M7]
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList, I5 <: TypeHList, I6 <: TypeHList, I7 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1],
    dapp2: DebugItemApplication[K, T2, I2, M2],
    dapp3: DebugItemApplication[K, T3, I3, M3],
    dapp4: DebugItemApplication[K, T4, I4, M4],
    dapp5: DebugItemApplication[K, T5, I5, M5],
    dapp6: DebugItemApplication[K, T6, I6, M6],
    dapp7: DebugItemApplication[K, T7, I7, M7]
  ): Application[K, ItemTag7[T1, M1, T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7], ItemTypeHList7[I1, I2, I3, I4, I5, I6, I7]] =
    ItemTag7.itemTagApplicationImplicit7(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7)
}
object ItemTag7 {
  implicit def itemTagApplicationImplicit7[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
    M7 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7]
  ): Application[K, ItemTag7[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7], ItemTypeHList7[T1, T2, T3, T4, T5, T6, T7]] =
    new Application[K, ItemTag7[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7], ItemTypeHList7[T1, T2, T3, T4, T5, T6, T7]] {
      override def application(context: Context[K]): K#M[ItemTypeHList7[T1, T2, T3, T4, T5, T6, T7]] = {
        if (context.isReverse) {
          context.append[ItemTypeHList6[T2, T3, T4, T5, T6, T7], T1, ItemTypeHList7[T1, T2, T3, T4, T5, T6, T7]](
            context.append[ItemTypeHList5[T3, T4, T5, T6, T7], T2, ItemTypeHList6[T2, T3, T4, T5, T6, T7]](
              context.append[ItemTypeHList4[T4, T5, T6, T7], T3, ItemTypeHList5[T3, T4, T5, T6, T7]](
                context.append[ItemTypeHList3[T5, T6, T7], T4, ItemTypeHList4[T4, T5, T6, T7]](
                  context.append[ItemTypeHList2[T6, T7], T5, ItemTypeHList3[T5, T6, T7]](
                    context.append[ItemTypeHList1[T7], T6, ItemTypeHList2[T6, T7]](
                      context.append[ItemTypeHList0, T7, ItemTypeHList1[T7]](context.start, t7.application(context), ItemTypeHListPlus1.hlistPlus1),
                      t6.application(context),
                      ItemTypeHListPlus2.put2
                    ),
                    t5.application(context),
                    ItemTypeHListPlus3.put3
                  ),
                  t4.application(context),
                  ItemTypeHListPlus4.put4
                ),
                t3.application(context),
                ItemTypeHListPlus5.put5
              ),
              t2.application(context),
              ItemTypeHListPlus6.put6
            ),
            t1.application(context),
            ItemTypeHListPlus7.put7
          )
//context.append(ItemTag6.itemTagApplicationImplicit6( t2  ,   t3  ,   t4  ,   t5  ,   t6  ,   t7  ).application(context), t1.application(context), ItemTypeHListPlus7.put7)
        } else {
          context.append[ItemTypeHList6[T1, T2, T3, T4, T5, T6], T7, ItemTypeHList7[T1, T2, T3, T4, T5, T6, T7]](
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
            ),
            t7.application(context),
            ItemTypeHListPlus7.plus7
          )
//context.append(ItemTag6.itemTagApplicationImplicit6( t1  ,   t2  ,   t3  ,   t4  ,   t5  ,   t6  ).application(context), t7.application(context), ItemTypeHListPlus7.plus7)
        }
      }
    }
}
