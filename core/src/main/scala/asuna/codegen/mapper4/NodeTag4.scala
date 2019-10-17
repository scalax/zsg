package asuna
import impl._
class NodeTag4[T1 <: ItemTag, M1 <: Message, T2 <: ItemTag, M2 <: Message, T3 <: ItemTag, M3 <: Message, T4 <: ItemTag, M4 <: Message] extends ItemTag {
  override type ItemType        = Item4[T1#ItemType, T2#ItemType, T3#ItemType, T4#ItemType]
  override type M[M <: Message] = NodeTag4[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4]
  def find0: T1#M[`Number： 0`] = throw new Exception("debugging...")
  def find1: T2#M[`Number： 1`] = throw new Exception("debugging...")
  def find2: T3#M[`Number： 2`] = throw new Exception("debugging...")
  def find3: T4#M[`Number： 3`] = throw new Exception("debugging...")
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, `Message： Please change .debug(context) to .find0.debug(context).`],
    dapp2: DebugApplication[K, T2, I2, `Message： Please change .debug(context) to .find1.debug(context).`],
    dapp3: DebugApplication[K, T3, I3, `Message： Please change .debug(context) to .find2.debug(context).`],
    dapp4: DebugApplication[K, T4, I4, `Message： Please change .debug(context) to .find3.debug(context).`]
  ): Application[K, NodeTag4[T1, M1, T2, M2, T3, M3, T4, M4], ItemTypeHList4[I1, I2, I3, I4]] =
    NodeTag4.noteTagApplicationImplicit4(dapp1, dapp2, dapp3, dapp4)
}
object NodeTag4 {
  implicit def noteTagApplicationImplicit4[
    K <: KindContext,
    H1 <: ItemTag,
    H2 <: ItemTag,
    H3 <: ItemTag,
    H4 <: ItemTag,
    T1 <: TypeHList,
    M1 <: Message,
    T2 <: TypeHList,
    M2 <: Message,
    T3 <: TypeHList,
    M3 <: Message,
    T4 <: TypeHList,
    M4 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4]
  ): Application[K, NodeTag4[H1, M1, H2, M2, H3, M3, H4, M4], ItemTypeHList4[T1, T2, T3, T4]] =
    new Application[K, NodeTag4[H1, M1, H2, M2, H3, M3, H4, M4], ItemTypeHList4[T1, T2, T3, T4]] {
      override def application(context: Context[K]): K#M[ItemTypeHList4[T1, T2, T3, T4]] = {
        if (context.isReverse) {
          context.append[ItemTypeHList3[T2, T3, T4], T1, ItemTypeHList4[T1, T2, T3, T4]](
            context.append[ItemTypeHList2[T3, T4], T2, ItemTypeHList3[T2, T3, T4]](
              context.append[ItemTypeHList1[T4], T3, ItemTypeHList2[T3, T4]](
                context.append[ItemTypeHList0, T4, ItemTypeHList1[T4]](context.start, t4.application(context), ItemTypeHListPlus1.hlistPlus1),
                t3.application(context),
                ItemTypeHListPlus2.put2
              ),
              t2.application(context),
              ItemTypeHListPlus3.put3
            ),
            t1.application(context),
            ItemTypeHListPlus4.put4
          )
//context.append(NodeTag3.noteTagApplicationImplicit3( t2  ,   t3  ,   t4  ).application(context), t1.application(context), ItemTypeHListPlus4.put4)
        } else {
          context.append[ItemTypeHList3[T1, T2, T3], T4, ItemTypeHList4[T1, T2, T3, T4]](
            context.append[ItemTypeHList2[T1, T2], T3, ItemTypeHList3[T1, T2, T3]](
              context.append[ItemTypeHList1[T1], T2, ItemTypeHList2[T1, T2]](
                context.append[ItemTypeHList0, T1, ItemTypeHList1[T1]](context.start, t1.application(context), ItemTypeHListPlus1.hlistPlus1),
                t2.application(context),
                ItemTypeHListPlus2.plus2
              ),
              t3.application(context),
              ItemTypeHListPlus3.plus3
            ),
            t4.application(context),
            ItemTypeHListPlus4.plus4
          )
//context.append(NodeTag3.noteTagApplicationImplicit3( t1  ,   t2  ,   t3  ).application(context), t4.application(context), ItemTypeHListPlus4.plus4)
        }
      }
    }
}
