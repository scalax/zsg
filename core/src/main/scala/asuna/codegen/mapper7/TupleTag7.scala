package asuna
import asuna.support.AnyHListTypeHListPlus
import asuna.support.HListTypeHListPlus1
import asuna.support.HListTypeHList1
import asuna.support.HListTypeHListPlus2
import asuna.support.HListTypeHList2
import asuna.support.HListTypeHListPlus3
import asuna.support.HListTypeHList3
import asuna.support.HListTypeHListPlus4
import asuna.support.HListTypeHList4
import asuna.support.HListTypeHListPlus5
import asuna.support.HListTypeHList5
import asuna.support.HListTypeHListPlus6
import asuna.support.HListTypeHList6
import asuna.support.HListToTupleTypeHListPlus7
import impl._
class TupleTag7[T1, M1 <: Message, T2, M2 <: Message, T3, M3 <: Message, T4, M4 <: Message, T5, M5 <: Message, T6, M6 <: Message, T7, M7 <: Message] extends TupleTag {
  override type AsunaTupleType  = AsunaTuple7[T1, T2, T3, T4, T5, T6, T7]
  override type M[M <: Message] = TupleTag7[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4, T5, M :-<>-: M5, T6, M :-<>-: M6, T7, M :-<>-: M7]
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList, I5 <: TypeHList, I6 <: TypeHList, I7 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1],
    dapp2: DebugItemApplication[K, T2, I2, M2],
    dapp3: DebugItemApplication[K, T3, I3, M3],
    dapp4: DebugItemApplication[K, T4, I4, M4],
    dapp5: DebugItemApplication[K, T5, I5, M5],
    dapp6: DebugItemApplication[K, T6, I6, M6],
    dapp7: DebugItemApplication[K, T7, I7, M7]
  ): Application[K, TupleTag7[T1, M1, T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7], TupleTypeHList7[I1, I2, I3, I4, I5, I6, I7]] =
    TupleTag7.tupleTagApplicationImplicit7(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7)
}
object TupleTag7 {
  implicit def tupleTagApplicationImplicit7[
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
  ): Application[K, TupleTag7[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7], TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] =
    new Application[K, TupleTag7[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7], TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] {
      override def application(context: Context[K]): K#M[TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] = {
        if (context.isReverse) {
          context.append[HListTypeHList6[T7, T6, T5, T4, T3, T2], T1, TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]](
            context.append[HListTypeHList5[T7, T6, T5, T4, T3], T2, HListTypeHList6[T7, T6, T5, T4, T3, T2]](
              context.append[HListTypeHList4[T7, T6, T5, T4], T3, HListTypeHList5[T7, T6, T5, T4, T3]](
                context.append[HListTypeHList3[T7, T6, T5], T4, HListTypeHList4[T7, T6, T5, T4]](
                  context.append[HListTypeHList2[T7, T6], T5, HListTypeHList3[T7, T6, T5]](
                    context.append[HListTypeHList1[T7], T6, HListTypeHList2[T7, T6]](
                      context.append[TupleTypeHList0, T7, HListTypeHList1[T7]](context.start, t7.application(context), HListTypeHListPlus1.plus1),
                      t6.application(context),
                      HListTypeHListPlus2.plus2
                    ),
                    t5.application(context),
                    HListTypeHListPlus3.plus3
                  ),
                  t4.application(context),
                  HListTypeHListPlus4.plus4
                ),
                t3.application(context),
                HListTypeHListPlus5.plus5
              ),
              t2.application(context),
              HListTypeHListPlus6.plus6
            ),
            t1.application(context),
            HListToTupleTypeHListPlus7.put7
          )
        } else {
          context.append[HListTypeHList6[T1, T2, T3, T4, T5, T6], T7, TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]](
            context.append[HListTypeHList5[T1, T2, T3, T4, T5], T6, HListTypeHList6[T1, T2, T3, T4, T5, T6]](
              context.append[HListTypeHList4[T1, T2, T3, T4], T5, HListTypeHList5[T1, T2, T3, T4, T5]](
                context.append[HListTypeHList3[T1, T2, T3], T4, HListTypeHList4[T1, T2, T3, T4]](
                  context.append[HListTypeHList2[T1, T2], T3, HListTypeHList3[T1, T2, T3]](
                    context.append[HListTypeHList1[T1], T2, HListTypeHList2[T1, T2]](
                      context.append[TupleTypeHList0, T1, HListTypeHList1[T1]](context.start, t1.application(context), HListTypeHListPlus1.plus1),
                      t2.application(context),
                      HListTypeHListPlus2.plus2
                    ),
                    t3.application(context),
                    HListTypeHListPlus3.plus3
                  ),
                  t4.application(context),
                  HListTypeHListPlus4.plus4
                ),
                t5.application(context),
                HListTypeHListPlus5.plus5
              ),
              t6.application(context),
              HListTypeHListPlus6.plus6
            ),
            t7.application(context),
            HListToTupleTypeHListPlus7.plus7
          )
        }
      }
    }
}
