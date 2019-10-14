package asuna
import impl._
class NodeTag2[T1 <: ItemTag, M1 <: Message, T2 <: ItemTag, M2 <: Message] extends ItemTag {
  override type ItemType        = Item2[T1#ItemType, T2#ItemType]
  override type M[M <: Message] = NodeTag2[T1, M :-<>-: M1, T2, M :-<>-: M2]
  def find0: T1#M[`Number： 0`] = throw new Exception("debugging...")
  def find1: T2#M[`Number： 1`] = throw new Exception("debugging...")
  def debug[K <: KindContext, I1 <: TypeParameter, I2 <: TypeParameter](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, `Message： Please change .debug(context) to .find0.debug(context).`],
    dapp2: DebugApplication[K, T2, I2, `Message： Please change .debug(context) to .find1.debug(context).`]
  ): Application[K, NodeTag2[T1, M1, T2, M2], ItemTypeParameter2[I1, I2]] =
    NodeTag2.noteTagApplicationImplicit2(dapp1, dapp2)
}
object NodeTag2 {
  implicit def noteTagApplicationImplicit2[K <: KindContext, H1 <: ItemTag, H2 <: ItemTag, T1 <: TypeParameter, M1 <: Message, T2 <: TypeParameter, M2 <: Message](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2]
  ): Application[K, NodeTag2[H1, M1, H2, M2], ItemTypeParameter2[T1, T2]] =
    new Application[K, NodeTag2[H1, M1, H2, M2], ItemTypeParameter2[T1, T2]] {
      override def application(context: Context[K]): K#M[ItemTypeParameter2[T1, T2]] = {
        if (context.isReverse) {
          context.append[ItemTypeParameter1[T2], T1, ItemTypeParameter2[T1, T2]](
            context.append[ItemTypeParameter0, T2, ItemTypeParameter1[T2]](context.start, t2.application(context), ItemTypeParameterPlus1.hlistPlus1),
            t1.application(context),
            ItemTypeParameterPlus2.put2
          )
//context.append(NodeTag1.noteTagApplicationImplicit1( t2  ).application(context), t1.application(context), ItemTypeParameterPlus2.put2)
        } else {
          context.append[ItemTypeParameter1[T1], T2, ItemTypeParameter2[T1, T2]](
            context.append[ItemTypeParameter0, T1, ItemTypeParameter1[T1]](context.start, t1.application(context), ItemTypeParameterPlus1.hlistPlus1),
            t2.application(context),
            ItemTypeParameterPlus2.plus2
          )
//context.append(NodeTag1.noteTagApplicationImplicit1( t1  ).application(context), t2.application(context), ItemTypeParameterPlus2.plus2)
        }
      }
    }
}
