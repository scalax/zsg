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
class NodeTag7[
  T1 <: TupleTag,
  M1 <: Message,
  T2 <: TupleTag,
  M2 <: Message,
  T3 <: TupleTag,
  M3 <: Message,
  T4 <: TupleTag,
  M4 <: Message,
  T5 <: TupleTag,
  M5 <: Message,
  T6 <: TupleTag,
  M6 <: Message,
  T7 <: TupleTag,
  M7 <: Message
] extends TupleTag {
  override type AsunaTupleType =
    AsunaTuple7[T1#AsunaTupleType, T2#AsunaTupleType, T3#AsunaTupleType, T4#AsunaTupleType, T5#AsunaTupleType, T6#AsunaTupleType, T7#AsunaTupleType]
  override type M[M <: Message] = NodeTag7[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4, T5, M :-<>-: M5, T6, M :-<>-: M6, T7, M :-<>-: M7]
  def find0: T1#M[`Number： 0`] = throw new Exception("debugging...")
  def find1: T2#M[`Number： 1`] = throw new Exception("debugging...")
  def find2: T3#M[`Number： 2`] = throw new Exception("debugging...")
  def find3: T4#M[`Number： 3`] = throw new Exception("debugging...")
  def find4: T5#M[`Number： 4`] = throw new Exception("debugging...")
  def find5: T6#M[`Number： 5`] = throw new Exception("debugging...")
  def find6: T7#M[`Number： 6`] = throw new Exception("debugging...")
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList, I5 <: TypeHList, I6 <: TypeHList, I7 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, `Message： Please change .debug(context) to .find0.debug(context).`],
    dapp2: DebugApplication[K, T2, I2, `Message： Please change .debug(context) to .find1.debug(context).`],
    dapp3: DebugApplication[K, T3, I3, `Message： Please change .debug(context) to .find2.debug(context).`],
    dapp4: DebugApplication[K, T4, I4, `Message： Please change .debug(context) to .find3.debug(context).`],
    dapp5: DebugApplication[K, T5, I5, `Message： Please change .debug(context) to .find4.debug(context).`],
    dapp6: DebugApplication[K, T6, I6, `Message： Please change .debug(context) to .find5.debug(context).`],
    dapp7: DebugApplication[K, T7, I7, `Message： Please change .debug(context) to .find6.debug(context).`]
  ): Application[K, NodeTag7[T1, M1, T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7], TupleTypeHList7[I1, I2, I3, I4, I5, I6, I7]] =
    NodeTag7.noteTagApplicationImplicit7(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7)
}
object NodeTag7 {
  implicit def noteTagApplicationImplicit7[
    K <: KindContext,
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
    H7 <: TupleTag,
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
    M6 <: Message,
    T7 <: TypeHList,
    M7 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7]
  ): Application[K, NodeTag7[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7], TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] =
    new Application[K, NodeTag7[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7], TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] {
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
