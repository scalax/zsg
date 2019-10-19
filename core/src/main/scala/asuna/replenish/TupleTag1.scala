package asuna

class TupleTag1[T1, M1 <: Message] extends TupleTag {
  override type AsunaTupleType = AsunaTuple1[T1]
  import impl._
  override type M[M <: Message] = TupleTag1[T1, M :-<>-: M1]

  def debug[K <: KindContext, I1 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1]
  ): Application[K, TupleTag1[T1, Message], TupleTypeHList1[I1]] =
    TupleTag1.tupleTagApplicationImplicit1(dapp1)
}
object TupleTag1 {
  implicit def tupleTagApplicationImplicit1[K <: KindContext, H1, T1 <: TypeHList, M1 <: Message](
    implicit t1: Application[K, H1, T1]
  ): Application[K, TupleTag1[H1, M1], TupleTypeHList1[T1]] =
    new Application[K, TupleTag1[H1, M1], TupleTypeHList1[T1]] {
      override def application(context: Context[K]): K#M[TupleTypeHList1[T1]] = {
        if (context.isReverse) {
          context.append(context.start, t1.application(context), TupleTypeHListPlus1.hlistPut1)
        } else {
          context.append(context.start, t1.application(context), TupleTypeHListPlus1.hlistPlus1)
        }
      }
    }
}
