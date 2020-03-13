package asuna
final class AppendTag[T] {
  type Tag = T
  def tag: T = throw new Exception("debuging...")
}
object AppendTag {
  final val tag                            = new AppendTag[Any]
   @inline  final def apply[T]: AppendTag[T] = tag.asInstanceOf[AppendTag[T]]
   @inline  final def lift[T](tag : => AppendTag[T]): AppendTag[T] = AppendTag[T]
       @inline  final def tag[T1 ](t1 : AppendTag[T1] ): AppendTag[TupleTag1[T1 ]] = AppendTag[TupleTag1[T1 ]]
       @inline  final def nodeTag[T1 <: TupleTag ](t1: AppendTag[T1] ): AppendTag[NodeTag1[T1 ]] = AppendTag[NodeTag1[T1 ]]
       @inline  final def tag[T1  , T2 ](t1 : AppendTag[T1]  , t2 : AppendTag[T2] ): AppendTag[TupleTag2[T1  , T2 ]] = AppendTag[TupleTag2[T1  , T2 ]]
       @inline  final def nodeTag[T1 <: TupleTag  , T2 <: TupleTag ](t1: AppendTag[T1]  , t2 : AppendTag[T2] ): AppendTag[NodeTag2[T1  , T2]] = AppendTag[NodeTag2[T1  , T2 ]]
       @inline  final def mergeTag[T1 <: TupleTag  , T2 <: TupleTag , Target <: TupleTag](t1: AppendTag[T1]  , t2 : AppendTag[T2] )( implicit  i: Merge2[T1  , T2 , Target]): AppendTag[Target] = AppendTag[Target]
       @inline  final def liftTag[F[_], Tag , X1](context: Context1[F])(t1: AppendTag[Tag])( implicit  app: Application1[F, Tag , X1]): F[X1] = app.application(context)
       @inline  final def liftTag[F[_ , _], Tag , X1 , X2](context: Context2[F])(t1: AppendTag[Tag])( implicit  app: Application2[F, Tag , X1 , X2]): F[X1 , X2] = app.application(context)
       @inline  final def liftTag[F[_ , _ , _], Tag , X1 , X2 , X3](context: Context3[F])(t1: AppendTag[Tag])( implicit  app: Application3[F, Tag , X1 , X2 , X3]): F[X1 , X2 , X3] = app.application(context)
       @inline  final def liftTag[F[_ , _ , _ , _], Tag , X1 , X2 , X3 , X4](context: Context4[F])(t1: AppendTag[Tag])( implicit  app: Application4[F, Tag , X1 , X2 , X3 , X4]): F[X1 , X2 , X3 , X4] = app.application(context)
       @inline  final def liftTag[F[_ , _ , _ , _ , _], Tag , X1 , X2 , X3 , X4 , X5](context: Context5[F])(t1: AppendTag[Tag])( implicit  app: Application5[F, Tag , X1 , X2 , X3 , X4 , X5]): F[X1 , X2 , X3 , X4 , X5] = app.application(context)
       @inline  final def liftTag[F[_ , _ , _ , _ , _ , _], Tag , X1 , X2 , X3 , X4 , X5 , X6](context: Context6[F])(t1: AppendTag[Tag])( implicit  app: Application6[F, Tag , X1 , X2 , X3 , X4 , X5 , X6]): F[X1 , X2 , X3 , X4 , X5 , X6] = app.application(context)
       @inline  final def liftTag[F[_ , _ , _ , _ , _ , _ , _], Tag , X1 , X2 , X3 , X4 , X5 , X6 , X7](context: Context7[F])(t1: AppendTag[Tag])( implicit  app: Application7[F, Tag , X1 , X2 , X3 , X4 , X5 , X6 , X7]): F[X1 , X2 , X3 , X4 , X5 , X6 , X7] = app.application(context)
       @inline  final def liftTag[F[_ , _ , _ , _ , _ , _ , _ , _], Tag , X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8](context: Context8[F])(t1: AppendTag[Tag])( implicit  app: Application8[F, Tag , X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8]): F[X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8] = app.application(context)
}
