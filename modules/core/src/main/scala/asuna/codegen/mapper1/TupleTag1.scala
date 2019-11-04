package asuna
import asuna.support.TypeHListPlus1
import impl._
final class TupleTag1[T1, M1 <: Message] extends TupleTag {
  override final type M[M <: Message] = TupleTag1[T1, M :-<>-: M1]
  def debug[K <: KindContext, I1 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1]
  ): Application[K, TupleTag1[T1, M1], TupleTypeHList1[I1]] =
    TupleTag1.tupleTagApplicationImplicit1(dapp1)
}
final object TupleTag1 {
  final implicit def tupleTagApplicationImplicit1[K <: KindContext, H1, T1 <: TypeHList, M1 <: Message](
    implicit t1: Application[K, H1, T1]
  ): Application[K, TupleTag1[H1, M1], TupleTypeHList1[T1]] = { context =>
    context.append[TupleTypeHList0, T1, TupleTypeHList1[T1]](context.start, t1.application(context), TypeHListPlus1.plus1)
  }
}
