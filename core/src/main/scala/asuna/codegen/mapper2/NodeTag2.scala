package asuna
import impl._
class NodeTag2[T1 <: TupleTag, M1 <: Message, T2 <: TupleTag, M2 <: Message] extends TupleTag {
  override type AsunaTupleType  = AsunaTuple2[T1#AsunaTupleType, T2#AsunaTupleType]
  override type M[M <: Message] = NodeTag2[T1, M :-<>-: M1, T2, M :-<>-: M2]
  def find0: T1#M[`Number： 0`] = throw new Exception("debugging...")
  def find1: T2#M[`Number： 1`] = throw new Exception("debugging...")
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, `Message： Please change .debug(context) to .find0.debug(context).`],
    dapp2: DebugApplication[K, T2, I2, `Message： Please change .debug(context) to .find1.debug(context).`]
  ): Application[K, NodeTag2[T1, M1, T2, M2], TupleTypeHList2[I1, I2]] =
    NodeTag2.noteTagApplicationImplicit2(dapp1, dapp2)
}
object NodeTag2 {
  implicit def noteTagApplicationImplicit2[K <: KindContext, H1 <: TupleTag, H2 <: TupleTag, T1 <: TypeHList, M1 <: Message, T2 <: TypeHList, M2 <: Message](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2]
  ): Application[K, NodeTag2[H1, M1, H2, M2], TupleTypeHList2[T1, T2]] =
    new Application[K, NodeTag2[H1, M1, H2, M2], TupleTypeHList2[T1, T2]] {
      override def application(context: Context[K]): K#M[TupleTypeHList2[T1, T2]] = {
        if (context.isReverse) {
          context.append[TupleTypeHList1[T2], T1, TupleTypeHList2[T1, T2]](
            context.append[TupleTypeHList0, T2, TupleTypeHList1[T2]](context.start, t2.application(context), TupleTypeHListPlus1.hlistPlus1),
            t1.application(context),
            TupleTypeHListPlus2.put2
          )
//context.append(NodeTag1.noteTagApplicationImplicit1( t2  ).application(context), t1.application(context), TupleTypeHListPlus2.put2)
        } else {
          context.append[TupleTypeHList1[T1], T2, TupleTypeHList2[T1, T2]](
            context.append[TupleTypeHList0, T1, TupleTypeHList1[T1]](context.start, t1.application(context), TupleTypeHListPlus1.hlistPlus1),
            t2.application(context),
            TupleTypeHListPlus2.plus2
          )
//context.append(NodeTag1.noteTagApplicationImplicit1( t1  ).application(context), t2.application(context), TupleTypeHListPlus2.plus2)
        }
      }
    }
}
