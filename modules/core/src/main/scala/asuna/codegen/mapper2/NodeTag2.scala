package asuna
import asuna.support.TypeHListPlus1
import asuna.support.TypeHListPlus2
import impl._
final class NodeTag2[T1 <: TupleTag, M1 <: Message, T2 <: TupleTag, M2 <: Message] extends TupleTag {
  override final type M[M <: Message] = NodeTag2[T1, M :-<>-: M1, T2, M :-<>-: M2]
  def find0: T1#M[`Number： 0`] = throw new Exception("debugging...")
  def find1: T2#M[`Number： 1`] = throw new Exception("debugging...")
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, `Message： Please change .debug(context) to .find0.debug(context).`],
    dapp2: DebugApplication[K, T2, I2, `Message： Please change .debug(context) to .find1.debug(context).`]
  ): Application[K, NodeTag2[T1, M1, T2, M2], TupleTypeHList2[I1, I2]] =
    NodeTag2.noteTagApplicationImplicit2(dapp1, dapp2)
}
final object NodeTag2 {
  final implicit def noteTagApplicationImplicit2[K <: KindContext, H1 <: TupleTag, H2 <: TupleTag, T1 <: TypeHList, M1 <: Message, T2 <: TypeHList, M2 <: Message](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2]
  ): Application[K, NodeTag2[H1, M1, H2, M2], TupleTypeHList2[T1, T2]] = { context =>
    context.append[TupleTypeHList1[T2], T1, TupleTypeHList2[T1, T2]](
      context.append[TupleTypeHList0, T2, TupleTypeHList1[T2]](context.start, t2.application(context), TypeHListPlus1.plus1),
      t1.application(context),
      TypeHListPlus2.plus2
    )
  }
}
