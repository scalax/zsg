package asuna
import impl._
class ItemTag4[T1, M1 <: Message, T2, M2 <: Message, T3, M3 <: Message, T4, M4 <: Message] extends ItemTag {
  override type ItemType        = Item4[T1, T2, T3, T4]
  override type M[M <: Message] = ItemTag4[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4]
  def debug[K <: KindContext, I1 <: TypeParameter, I2 <: TypeParameter, I3 <: TypeParameter, I4 <: TypeParameter](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1],
    dapp2: DebugItemApplication[K, T2, I2, M2],
    dapp3: DebugItemApplication[K, T3, I3, M3],
    dapp4: DebugItemApplication[K, T4, I4, M4]
  ): Application[K, ItemTag4[T1, M1, T2, M2, T3, M3, T4, M4], ItemTypeParameter4[I1, I2, I3, I4]] =
    ItemTag4.itemTagApplicationImplicit4(dapp1, dapp2, dapp3, dapp4)
}
object ItemTag4 {
  implicit def itemTagApplicationImplicit4[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    T1 <: TypeParameter,
    T2 <: TypeParameter,
    T3 <: TypeParameter,
    T4 <: TypeParameter,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4]
  ): Application[K, ItemTag4[H1, M1, H2, M2, H3, M3, H4, M4], ItemTypeParameter4[T1, T2, T3, T4]] =
    new Application[K, ItemTag4[H1, M1, H2, M2, H3, M3, H4, M4], ItemTypeParameter4[T1, T2, T3, T4]] {
      override def application(context: Context[K]): K#M[ItemTypeParameter4[T1, T2, T3, T4]] = {
        if (context.isReverse) {
          context.append[ItemTypeParameter3[T2, T3, T4], T1, ItemTypeParameter4[T1, T2, T3, T4]](
            context.append[ItemTypeParameter2[T3, T4], T2, ItemTypeParameter3[T2, T3, T4]](
              context.append[ItemTypeParameter1[T4], T3, ItemTypeParameter2[T3, T4]](
                context.append[ItemTypeParameter0, T4, ItemTypeParameter1[T4]](context.start, t4.application(context), ItemTypeParameterPlus1.hlistPlus1),
                t3.application(context),
                ItemTypeParameterPlus2.put2
              ),
              t2.application(context),
              ItemTypeParameterPlus3.put3
            ),
            t1.application(context),
            ItemTypeParameterPlus4.put4
          )
//context.append(ItemTag3.itemTagApplicationImplicit3( t2  ,   t3  ,   t4  ).application(context), t1.application(context), ItemTypeParameterPlus4.put4)
        } else {
          context.append[ItemTypeParameter3[T1, T2, T3], T4, ItemTypeParameter4[T1, T2, T3, T4]](
            context.append[ItemTypeParameter2[T1, T2], T3, ItemTypeParameter3[T1, T2, T3]](
              context.append[ItemTypeParameter1[T1], T2, ItemTypeParameter2[T1, T2]](
                context.append[ItemTypeParameter0, T1, ItemTypeParameter1[T1]](context.start, t1.application(context), ItemTypeParameterPlus1.hlistPlus1),
                t2.application(context),
                ItemTypeParameterPlus2.plus2
              ),
              t3.application(context),
              ItemTypeParameterPlus3.plus3
            ),
            t4.application(context),
            ItemTypeParameterPlus4.plus4
          )
//context.append(ItemTag3.itemTagApplicationImplicit3( t1  ,   t2  ,   t3  ).application(context), t4.application(context), ItemTypeParameterPlus4.plus4)
        }
      }
    }
}
