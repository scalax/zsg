package zsg

abstract class Application[F <: TypeFunction, Boot, Target <: TypeHList] {
  def application(context: Context[F]): F#H[Target]
}

object Application {
  implicit def applicationImplicit2[F <: TypeFunction, Boot1, Boot2, Target1 <: TypeHList, Target2 <: TypeHList](implicit
    i1: Application[F, Boot1, Target1],
    i2: Application[F, Boot2, Target2]
  ): Application[F, ItemTag2[Boot1, Boot2], Item2TypeHList[Target1, Target2]] =
    new Application[F, ItemTag2[Boot1, Boot2], Item2TypeHList[Target1, Target2]] {
      def application(context: Context[F]): F#H[Item2TypeHList[Target1, Target2]] =
        context.append(i1.application(context), i2.application(context))(Plus.item2Plus)
    }
}
