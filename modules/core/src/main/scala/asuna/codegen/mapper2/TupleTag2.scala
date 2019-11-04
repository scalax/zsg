package asuna
import asuna.support.TypeHListPlus1
import asuna.support.TypeHListPlus2
import impl._
final class TupleTag2[T1, M1 <: Message, T2, M2 <: Message] extends TupleTag {
  override final type M[M <: Message] = TupleTag2[T1, M :-<>-: M1, T2, M :-<>-: M2]
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1],
    dapp2: DebugItemApplication[K, T2, I2, M2]
  ): Application[K, TupleTag2[T1, M1, T2, M2], TupleTypeHList2[I1, I2]] =
    TupleTag2.tupleTagApplicationImplicit2(dapp1, dapp2)
}
final object TupleTag2 {
  final implicit def tupleTagApplicationImplicit2[K <: KindContext, H1, H2, T1 <: TypeHList, T2 <: TypeHList, M1 <: Message, M2 <: Message](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2]
  ): Application[K, TupleTag2[H1, M1, H2, M2], TupleTypeHList2[T1, T2]] = { context =>
    context.append[TupleTypeHList1[T2], T1, TupleTypeHList2[T1, T2]](
      context.append[TupleTypeHList0, T2, TupleTypeHList1[T2]](context.start, t2.application(context), TypeHListPlus1.plus1),
      t1.application(context),
      TypeHListPlus2.plus2
    )
  }
}
