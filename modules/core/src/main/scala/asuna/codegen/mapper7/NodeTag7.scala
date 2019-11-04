package asuna
import asuna.support.TypeHListPlus1
import asuna.support.TypeHListPlus2
import asuna.support.TypeHListPlus3
import asuna.support.TypeHListPlus4
import asuna.support.TypeHListPlus5
import asuna.support.TypeHListPlus6
import asuna.support.TypeHListPlus7
import impl._
final class NodeTag7[
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
  override final type M[M <: Message] = NodeTag7[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4, T5, M :-<>-: M5, T6, M :-<>-: M6, T7, M :-<>-: M7]
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
final object NodeTag7 {
  final implicit def noteTagApplicationImplicit7[
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
  ): Application[K, NodeTag7[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7], TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] = { context =>
    context.append[TupleTypeHList6[T2, T3, T4, T5, T6, T7], T1, TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]](
      context.append[TupleTypeHList5[T3, T4, T5, T6, T7], T2, TupleTypeHList6[T2, T3, T4, T5, T6, T7]](
        context.append[TupleTypeHList4[T4, T5, T6, T7], T3, TupleTypeHList5[T3, T4, T5, T6, T7]](
          context.append[TupleTypeHList3[T5, T6, T7], T4, TupleTypeHList4[T4, T5, T6, T7]](
            context.append[TupleTypeHList2[T6, T7], T5, TupleTypeHList3[T5, T6, T7]](
              context.append[TupleTypeHList1[T7], T6, TupleTypeHList2[T6, T7]](
                context.append[TupleTypeHList0, T7, TupleTypeHList1[T7]](context.start, t7.application(context), TypeHListPlus1.plus1),
                t6.application(context),
                TypeHListPlus2.plus2
              ),
              t5.application(context),
              TypeHListPlus3.plus3
            ),
            t4.application(context),
            TypeHListPlus4.plus4
          ),
          t3.application(context),
          TypeHListPlus5.plus5
        ),
        t2.application(context),
        TypeHListPlus6.plus6
      ),
      t1.application(context),
      TypeHListPlus7.plus7
    )
  }
}
