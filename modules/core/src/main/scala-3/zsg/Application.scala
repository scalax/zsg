package zsg

trait Application[N <: Context, B, I <: TypeHList] {
  def application(context: N): context.T[I]
}

object Application {
  inline given [N <: Context, B1, B2, I1 <: TypeHList, I2 <: TypeHList](using
    a1: Application[N, B1, I1],
    a2: Application[N, B2, I2]
  ): Application[N, ItemTag2[B1, B2], Item2TypeHList[I1, I2]] = context =>
    context.append(a1.application(context), a2.application(context))(Plus.item2Plus)
}
