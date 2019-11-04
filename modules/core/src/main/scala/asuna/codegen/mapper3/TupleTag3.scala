package asuna
import asuna.support.TypeHListPlus1
import asuna.support.TypeHListPlus2
import asuna.support.TypeHListPlus3
import impl._
final class TupleTag3[T1, M1 <: Message, T2, M2 <: Message, T3, M3 <: Message] extends TupleTag {
  override final type M[M <: Message] = TupleTag3[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3]
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1],
    dapp2: DebugItemApplication[K, T2, I2, M2],
    dapp3: DebugItemApplication[K, T3, I3, M3]
  ): Application[K, TupleTag3[T1, M1, T2, M2, T3, M3], TupleTypeHList3[I1, I2, I3]] =
    TupleTag3.tupleTagApplicationImplicit3(dapp1, dapp2, dapp3)
}
final object TupleTag3 {
  final implicit def tupleTagApplicationImplicit3[
    K <: KindContext,
    H1,
    H2,
    H3,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3]
  ): Application[K, TupleTag3[H1, M1, H2, M2, H3, M3], TupleTypeHList3[T1, T2, T3]] = { context =>
    context.append[TupleTypeHList2[T2, T3], T1, TupleTypeHList3[T1, T2, T3]](
      context.append[TupleTypeHList1[T3], T2, TupleTypeHList2[T2, T3]](
        context.append[TupleTypeHList0, T3, TupleTypeHList1[T3]](context.start, t3.application(context), TypeHListPlus1.plus1),
        t2.application(context),
        TypeHListPlus2.plus2
      ),
      t1.application(context),
      TypeHListPlus3.plus3
    )
  }
}
