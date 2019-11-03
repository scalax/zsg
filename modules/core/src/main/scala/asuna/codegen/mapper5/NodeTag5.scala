package asuna
import asuna.support.TypeHListPlus1
import asuna.support.TypeHListPlus2
import asuna.support.TypeHListPlus3
import asuna.support.TypeHListPlus4
import asuna.support.TypeHListPlus5
import impl._
final class NodeTag5[
  T1 <: TupleTag,
  M1 <: Message,
  T2 <: TupleTag,
  M2 <: Message,
  T3 <: TupleTag,
  M3 <: Message,
  T4 <: TupleTag,
  M4 <: Message,
  T5 <: TupleTag,
  M5 <: Message
] extends TupleTag {
  override final type AsunaTupleType  = AsunaTuple5[T1#AsunaTupleType, T2#AsunaTupleType, T3#AsunaTupleType, T4#AsunaTupleType, T5#AsunaTupleType]
  override final type M[M <: Message] = NodeTag5[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4, T5, M :-<>-: M5]
  def find0: T1#M[`Number： 0`] = throw new Exception("debugging...")
  def find1: T2#M[`Number： 1`] = throw new Exception("debugging...")
  def find2: T3#M[`Number： 2`] = throw new Exception("debugging...")
  def find3: T4#M[`Number： 3`] = throw new Exception("debugging...")
  def find4: T5#M[`Number： 4`] = throw new Exception("debugging...")
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList, I5 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, `Message： Please change .debug(context) to .find0.debug(context).`],
    dapp2: DebugApplication[K, T2, I2, `Message： Please change .debug(context) to .find1.debug(context).`],
    dapp3: DebugApplication[K, T3, I3, `Message： Please change .debug(context) to .find2.debug(context).`],
    dapp4: DebugApplication[K, T4, I4, `Message： Please change .debug(context) to .find3.debug(context).`],
    dapp5: DebugApplication[K, T5, I5, `Message： Please change .debug(context) to .find4.debug(context).`]
  ): Application[K, NodeTag5[T1, M1, T2, M2, T3, M3, T4, M4, T5, M5], TupleTypeHList5[I1, I2, I3, I4, I5]] =
    NodeTag5.noteTagApplicationImplicit5(dapp1, dapp2, dapp3, dapp4, dapp5)
}
final object NodeTag5 {
  final implicit def noteTagApplicationImplicit5[
    K <: KindContext,
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    T1 <: TypeHList,
    M1 <: Message,
    T2 <: TypeHList,
    M2 <: Message,
    T3 <: TypeHList,
    M3 <: Message,
    T4 <: TypeHList,
    M4 <: Message,
    T5 <: TypeHList,
    M5 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5]
  ): Application[K, NodeTag5[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5], TupleTypeHList5[T1, T2, T3, T4, T5]] = { context =>
    context.append[TupleTypeHList4[T2, T3, T4, T5], T1, TupleTypeHList5[T1, T2, T3, T4, T5]](
      context.append[TupleTypeHList3[T3, T4, T5], T2, TupleTypeHList4[T2, T3, T4, T5]](
        context.append[TupleTypeHList2[T4, T5], T3, TupleTypeHList3[T3, T4, T5]](
          context.append[TupleTypeHList1[T5], T4, TupleTypeHList2[T4, T5]](
            context.append[TupleTypeHList0, T5, TupleTypeHList1[T5]](context.start, t5.application(context), TypeHListPlus1.plus1),
            t4.application(context),
            TypeHListPlus2.plus2
          ),
          t3.application(context),
          TypeHListPlus3.plus3
        ),
        t2.application(context),
        TypeHListPlus4.plus4
      ),
      t1.application(context),
      TypeHListPlus5.plus5
    )
  }
}
