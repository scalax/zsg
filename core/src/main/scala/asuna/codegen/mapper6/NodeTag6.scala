package asuna
import impl._
class NodeTag6[
  T1 <: ItemTag,
  M1 <: Message,
  T2 <: ItemTag,
  M2 <: Message,
  T3 <: ItemTag,
  M3 <: Message,
  T4 <: ItemTag,
  M4 <: Message,
  T5 <: ItemTag,
  M5 <: Message,
  T6 <: ItemTag,
  M6 <: Message
] extends ItemTag {
  override type ItemType        = AsunaTuple6[T1#ItemType, T2#ItemType, T3#ItemType, T4#ItemType, T5#ItemType, T6#ItemType]
  override type M[M <: Message] = NodeTag6[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4, T5, M :-<>-: M5, T6, M :-<>-: M6]
  def find0: T1#M[`Number： 0`] = throw new Exception("debugging...")
  def find1: T2#M[`Number： 1`] = throw new Exception("debugging...")
  def find2: T3#M[`Number： 2`] = throw new Exception("debugging...")
  def find3: T4#M[`Number： 3`] = throw new Exception("debugging...")
  def find4: T5#M[`Number： 4`] = throw new Exception("debugging...")
  def find5: T6#M[`Number： 5`] = throw new Exception("debugging...")
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList, I5 <: TypeHList, I6 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, `Message： Please change .debug(context) to .find0.debug(context).`],
    dapp2: DebugApplication[K, T2, I2, `Message： Please change .debug(context) to .find1.debug(context).`],
    dapp3: DebugApplication[K, T3, I3, `Message： Please change .debug(context) to .find2.debug(context).`],
    dapp4: DebugApplication[K, T4, I4, `Message： Please change .debug(context) to .find3.debug(context).`],
    dapp5: DebugApplication[K, T5, I5, `Message： Please change .debug(context) to .find4.debug(context).`],
    dapp6: DebugApplication[K, T6, I6, `Message： Please change .debug(context) to .find5.debug(context).`]
  ): Application[K, NodeTag6[T1, M1, T2, M2, T3, M3, T4, M4, T5, M5, T6, M6], TupleTypeHList6[I1, I2, I3, I4, I5, I6]] =
    NodeTag6.noteTagApplicationImplicit6(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6)
}
object NodeTag6 {
  implicit def noteTagApplicationImplicit6[
    K <: KindContext,
    H1 <: ItemTag,
    H2 <: ItemTag,
    H3 <: ItemTag,
    H4 <: ItemTag,
    H5 <: ItemTag,
    H6 <: ItemTag,
    T1 <: TypeHList,
    M1 <: Message,
    T2 <: TypeHList,
    M2 <: Message,
    T3 <: TypeHList,
    M3 <: Message,
    T4 <: TypeHList,
    M4 <: Message,
    T5 <: TypeHList,
    M5 <: Message,
    T6 <: TypeHList,
    M6 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6]
  ): Application[K, NodeTag6[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6], TupleTypeHList6[T1, T2, T3, T4, T5, T6]] =
    new Application[K, NodeTag6[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6], TupleTypeHList6[T1, T2, T3, T4, T5, T6]] {
      override def application(context: Context[K]): K#M[TupleTypeHList6[T1, T2, T3, T4, T5, T6]] = {
        if (context.isReverse) {
          context.append[TupleTypeHList5[T2, T3, T4, T5, T6], T1, TupleTypeHList6[T1, T2, T3, T4, T5, T6]](
            context.append[TupleTypeHList4[T3, T4, T5, T6], T2, TupleTypeHList5[T2, T3, T4, T5, T6]](
              context.append[TupleTypeHList3[T4, T5, T6], T3, TupleTypeHList4[T3, T4, T5, T6]](
                context.append[TupleTypeHList2[T5, T6], T4, TupleTypeHList3[T4, T5, T6]](
                  context.append[TupleTypeHList1[T6], T5, TupleTypeHList2[T5, T6]](
                    context.append[TupleTypeHList0, T6, TupleTypeHList1[T6]](context.start, t6.application(context), TupleTypeHListPlus1.hlistPlus1),
                    t5.application(context),
                    TupleTypeHListPlus2.put2
                  ),
                  t4.application(context),
                  TupleTypeHListPlus3.put3
                ),
                t3.application(context),
                TupleTypeHListPlus4.put4
              ),
              t2.application(context),
              TupleTypeHListPlus5.put5
            ),
            t1.application(context),
            TupleTypeHListPlus6.put6
          )
//context.append(NodeTag5.noteTagApplicationImplicit5( t2  ,   t3  ,   t4  ,   t5  ,   t6  ).application(context), t1.application(context), TupleTypeHListPlus6.put6)
        } else {
          context.append[TupleTypeHList5[T1, T2, T3, T4, T5], T6, TupleTypeHList6[T1, T2, T3, T4, T5, T6]](
            context.append[TupleTypeHList4[T1, T2, T3, T4], T5, TupleTypeHList5[T1, T2, T3, T4, T5]](
              context.append[TupleTypeHList3[T1, T2, T3], T4, TupleTypeHList4[T1, T2, T3, T4]](
                context.append[TupleTypeHList2[T1, T2], T3, TupleTypeHList3[T1, T2, T3]](
                  context.append[TupleTypeHList1[T1], T2, TupleTypeHList2[T1, T2]](
                    context.append[TupleTypeHList0, T1, TupleTypeHList1[T1]](context.start, t1.application(context), TupleTypeHListPlus1.hlistPlus1),
                    t2.application(context),
                    TupleTypeHListPlus2.plus2
                  ),
                  t3.application(context),
                  TupleTypeHListPlus3.plus3
                ),
                t4.application(context),
                TupleTypeHListPlus4.plus4
              ),
              t5.application(context),
              TupleTypeHListPlus5.plus5
            ),
            t6.application(context),
            TupleTypeHListPlus6.plus6
          )
//context.append(NodeTag5.noteTagApplicationImplicit5( t1  ,   t2  ,   t3  ,   t4  ,   t5  ).application(context), t6.application(context), TupleTypeHListPlus6.plus6)
        }
      }
    }
}
