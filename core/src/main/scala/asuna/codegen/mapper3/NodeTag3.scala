package asuna
import asuna.support.AnyHListTypeHListPlus
import asuna.support.HListTypeHListPlus1
import asuna.support.HListTypeHList1
import asuna.support.HListTypeHListPlus2
import asuna.support.HListTypeHList2
import asuna.support.HListToTupleTypeHListPlus3
import impl._
class NodeTag3[T1 <: TupleTag, M1 <: Message, T2 <: TupleTag, M2 <: Message, T3 <: TupleTag, M3 <: Message] extends TupleTag {
  override type AsunaTupleType  = AsunaTuple3[T1#AsunaTupleType, T2#AsunaTupleType, T3#AsunaTupleType]
  override type M[M <: Message] = NodeTag3[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3]
  def find0: T1#M[`Number： 0`] = throw new Exception("debugging...")
  def find1: T2#M[`Number： 1`] = throw new Exception("debugging...")
  def find2: T3#M[`Number： 2`] = throw new Exception("debugging...")
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, `Message： Please change .debug(context) to .find0.debug(context).`],
    dapp2: DebugApplication[K, T2, I2, `Message： Please change .debug(context) to .find1.debug(context).`],
    dapp3: DebugApplication[K, T3, I3, `Message： Please change .debug(context) to .find2.debug(context).`]
  ): Application[K, NodeTag3[T1, M1, T2, M2, T3, M3], TupleTypeHList3[I1, I2, I3]] =
    NodeTag3.noteTagApplicationImplicit3(dapp1, dapp2, dapp3)
}
object NodeTag3 {
  implicit def noteTagApplicationImplicit3[
    K <: KindContext,
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    T1 <: TypeHList,
    M1 <: Message,
    T2 <: TypeHList,
    M2 <: Message,
    T3 <: TypeHList,
    M3 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3]
  ): Application[K, NodeTag3[H1, M1, H2, M2, H3, M3], TupleTypeHList3[T1, T2, T3]] =
    new Application[K, NodeTag3[H1, M1, H2, M2, H3, M3], TupleTypeHList3[T1, T2, T3]] {
      override def application(context: Context[K]): K#M[TupleTypeHList3[T1, T2, T3]] = {
        if (context.isReverse) {
          context.append[HListTypeHList2[T3, T2], T1, TupleTypeHList3[T1, T2, T3]](
            context.append[HListTypeHList1[T3], T2, HListTypeHList2[T3, T2]](
              context.append[TupleTypeHList0, T3, HListTypeHList1[T3]](context.start, t3.application(context), HListTypeHListPlus1.plus1),
              t2.application(context),
              HListTypeHListPlus2.plus2
            ),
            t1.application(context),
            HListToTupleTypeHListPlus3.put3
          )
        } else {
          context.append[HListTypeHList2[T1, T2], T3, TupleTypeHList3[T1, T2, T3]](
            context.append[HListTypeHList1[T1], T2, HListTypeHList2[T1, T2]](
              context.append[TupleTypeHList0, T1, HListTypeHList1[T1]](context.start, t1.application(context), HListTypeHListPlus1.plus1),
              t2.application(context),
              HListTypeHListPlus2.plus2
            ),
            t3.application(context),
            HListToTupleTypeHListPlus3.plus3
          )
        }
      }
    }
}
