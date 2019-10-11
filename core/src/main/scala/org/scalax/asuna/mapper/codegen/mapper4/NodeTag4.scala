package org.scalax.asuna.mapper
import impl._
class NodeTag4[T1 <: ItemTag, M1 <: Message, T2 <: ItemTag, M2 <: Message, T3 <: ItemTag, M3 <: Message, T4 <: ItemTag, M4 <: Message] extends ItemTag {
  override type ItemType        = Item4[T1#ItemType, T2#ItemType, T3#ItemType, T4#ItemType]
  override type M[M <: Message] = NodeTag4[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4]
  def find0: T1#M[Asuna.`Number： 0`] = throw new Exception("debugging...")
  def find1: T2#M[Asuna.`Number： 1`] = throw new Exception("debugging...")
  def find2: T3#M[Asuna.`Number： 2`] = throw new Exception("debugging...")
  def find3: T4#M[Asuna.`Number： 3`] = throw new Exception("debugging...")
  def debug[K <: KindContext, I1 <: TypeParameter, I2 <: TypeParameter, I3 <: TypeParameter, I4 <: TypeParameter](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, Asuna.`Message： Please change .debug(context) to .find0.debug(context).`],
    dapp2: DebugApplication[K, T2, I2, Asuna.`Message： Please change .debug(context) to .find1.debug(context).`],
    dapp3: DebugApplication[K, T3, I3, Asuna.`Message： Please change .debug(context) to .find2.debug(context).`],
    dapp4: DebugApplication[K, T4, I4, Asuna.`Message： Please change .debug(context) to .find3.debug(context).`]
  ): Application[K, NodeTag4[T1, M1, T2, M2, T3, M3, T4, M4], ItemTypeParameter4[I1, I2, I3, I4]] =
    NodeTag4.noteTagApplicationImplicit4(dapp1, dapp2, dapp3, dapp4)
}
object NodeTag4 {
  implicit def noteTagApplicationImplicit4[
    K <: KindContext,
    H1 <: ItemTag,
    H2 <: ItemTag,
    H3 <: ItemTag,
    H4 <: ItemTag,
    T1 <: TypeParameter,
    M1 <: Message,
    T2 <: TypeParameter,
    M2 <: Message,
    T3 <: TypeParameter,
    M3 <: Message,
    T4 <: TypeParameter,
    M4 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4]
  ): Application[K, NodeTag4[H1, M1, H2, M2, H3, M3, H4, M4], ItemTypeParameter4[T1, T2, T3, T4]] =
    new Application[K, NodeTag4[H1, M1, H2, M2, H3, M3, H4, M4], ItemTypeParameter4[T1, T2, T3, T4]] {
      override def application(context: Context[K]): K#M[ItemTypeParameter4[T1, T2, T3, T4]] = {
        if (context.isReverse) {
          context.append(NodeTag3.noteTagApplicationImplicit3(t2, t3, t4).application(context), t1.application(context), ItemTypeParameterPlus4.put4)
        } else {
          context.append(NodeTag3.noteTagApplicationImplicit3(t1, t2, t3).application(context), t4.application(context), ItemTypeParameterPlus4.plus4)
        }
      }
    }
}
