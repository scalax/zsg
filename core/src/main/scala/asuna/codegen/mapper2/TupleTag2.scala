package asuna
import impl._
class TupleTag2[T1, M1 <: Message, T2, M2 <: Message] extends TupleTag {
  override type AsunaTupleType  = AsunaTuple2[T1, T2]
  override type M[M <: Message] = TupleTag2[T1, M :-<>-: M1, T2, M :-<>-: M2]
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1],
    dapp2: DebugItemApplication[K, T2, I2, M2]
  ): Application[K, TupleTag2[T1, M1, T2, M2], TupleTypeHList2[I1, I2]] =
    TupleTag2.tupleTagApplicationImplicit2(dapp1, dapp2)
}
object TupleTag2 {
  implicit def tupleTagApplicationImplicit2[K <: KindContext, H1, H2, T1 <: TypeHList, T2 <: TypeHList, M1 <: Message, M2 <: Message](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2]
  ): Application[K, TupleTag2[H1, M1, H2, M2], TupleTypeHList2[T1, T2]] =
    new Application[K, TupleTag2[H1, M1, H2, M2], TupleTypeHList2[T1, T2]] {
      override def application(context: Context[K]): K#M[TupleTypeHList2[T1, T2]] = {
        if (context.isReverse) {
          context.append[HListTypeHList1[T2], T1, TupleTypeHList2[T1, T2]](
            context.append[TupleTypeHList0, T2, HListTypeHList1[T2]](context.start, t2.application(context), AnyHListTypeHListPlus.hlistPlus1),
            t1.application(context),
            HListToTupleTypeHListPlus2.put2
          )
        } else {
          context.append[HListTypeHList1[T1], T2, TupleTypeHList2[T1, T2]](
            context.append[TupleTypeHList0, T1, HListTypeHList1[T1]](context.start, t1.application(context), AnyHListTypeHListPlus.hlistPlus1),
            t2.application(context),
            HListToTupleTypeHListPlus2.plus2
          )
        }
      }
    }
}
