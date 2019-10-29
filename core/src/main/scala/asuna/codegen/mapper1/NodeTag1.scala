package asuna
import asuna.support.HListTypeHListPlus1
import impl._
class NodeTag1[T1 <: TupleTag, M1 <: Message] extends TupleTag {
  override type AsunaTupleType  = AsunaTuple1[T1#AsunaTupleType]
  override type M[M <: Message] = NodeTag1[T1, M :-<>-: M1]
  def find0: T1#M[`Number： 0`] = throw new Exception("debugging...")
  def debug[K <: KindContext, I1 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, `Message： Please change .debug(context) to .find0.debug(context).`]
  ): Application[K, NodeTag1[T1, M1], TupleTypeHList1[I1]] =
    NodeTag1.noteTagApplicationImplicit1(dapp1)
}
object NodeTag1 {
  implicit def noteTagApplicationImplicit1[K <: KindContext, H1 <: TupleTag, T1 <: TypeHList, M1 <: Message](
    implicit t1: Application[K, H1, T1]
  ): Application[K, NodeTag1[H1, M1], TupleTypeHList1[T1]] =
    new Application[K, NodeTag1[H1, M1], TupleTypeHList1[T1]] {
      override def application(context: Context[K]): K#M[TupleTypeHList1[T1]] = {
        context.append[TupleTypeHList0, T1, TupleTypeHList1[T1]](context.start, t1.application(context), HListTypeHListPlus1.plus1)
      }
    }
}
