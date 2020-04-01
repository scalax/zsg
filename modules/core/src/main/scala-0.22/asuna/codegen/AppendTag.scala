package asuna
final class AppendTag[T] {
  type Tag = T
  def tag: T = throw new Exception("debuging...")
}
object AppendTag {
    final val tag                            = new AppendTag[Any]
     inline  final def apply[T]: AppendTag[T] = tag.asInstanceOf[AppendTag[T]]
     inline  final def lift[T](tag : => AppendTag[T]): AppendTag[T] = AppendTag[T]
         inline  final def tag[T1 ](t1 : AppendTag[T1] ): AppendTag[TupleTag1[T1 ]] = AppendTag[TupleTag1[T1 ]]
         inline  final def nodeTag[T1 <: TupleTag ](t1: AppendTag[T1] ): AppendTag[NodeTag1[T1 ]] = AppendTag[NodeTag1[T1 ]]
         inline  final def tag[T1  , T2 ](t1 : AppendTag[T1]  , t2 : AppendTag[T2] ): AppendTag[TupleTag2[T1  , T2 ]] = AppendTag[TupleTag2[T1  , T2 ]]
         inline  final def nodeTag[T1 <: TupleTag  , T2 <: TupleTag ](t1: AppendTag[T1]  , t2 : AppendTag[T2] ): AppendTag[NodeTag2[T1  , T2]] = AppendTag[NodeTag2[T1  , T2 ]]
         inline  final def liftTag[F[_], Tag , X1](context: Context1[F])(t1: AppendTag[Tag])( given  app: Application1[F, Tag , X1]): F[X1] = app.application(context)
         inline  final def mergeTag[T1, Target](t1: AppendTag[T1] )( given  i: Merge1[T1 , Target]): AppendTag[Target] = AppendTag[Target]
         inline  final def liftTag[F[_ , _], Tag , X1 , X2](context: Context2[F])(t1: AppendTag[Tag])( given  app: Application2[F, Tag , X1 , X2]): F[X1 , X2] = app.application(context)
         inline  final def mergeTag[T1 , T2, Target](t1: AppendTag[T1]  , t2 : AppendTag[T2] )( given  i: Merge2[T1  , T2 , Target]): AppendTag[Target] = AppendTag[Target]
         inline  final def liftTag[F[_ , _ , _], Tag , X1 , X2 , X3](context: Context3[F])(t1: AppendTag[Tag])( given  app: Application3[F, Tag , X1 , X2 , X3]): F[X1 , X2 , X3] = app.application(context)
         inline  final def mergeTag[T1 , T2 , T3, Target](t1: AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3] )( given  i: Merge3[T1  , T2  , T3 , Target]): AppendTag[Target] = AppendTag[Target]
         inline  final def liftTag[F[_ , _ , _ , _], Tag , X1 , X2 , X3 , X4](context: Context4[F])(t1: AppendTag[Tag])( given  app: Application4[F, Tag , X1 , X2 , X3 , X4]): F[X1 , X2 , X3 , X4] = app.application(context)
         inline  final def mergeTag[T1 , T2 , T3 , T4, Target](t1: AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3]  , t4 : AppendTag[T4] )( given  i: Merge4[T1  , T2  , T3  , T4 , Target]): AppendTag[Target] = AppendTag[Target]
         inline  final def liftTag[F[_ , _ , _ , _ , _], Tag , X1 , X2 , X3 , X4 , X5](context: Context5[F])(t1: AppendTag[Tag])( given  app: Application5[F, Tag , X1 , X2 , X3 , X4 , X5]): F[X1 , X2 , X3 , X4 , X5] = app.application(context)
         inline  final def mergeTag[T1 , T2 , T3 , T4 , T5, Target](t1: AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3]  , t4 : AppendTag[T4]  , t5 : AppendTag[T5] )( given  i: Merge5[T1  , T2  , T3  , T4  , T5 , Target]): AppendTag[Target] = AppendTag[Target]
         inline  final def liftTag[F[_ , _ , _ , _ , _ , _], Tag , X1 , X2 , X3 , X4 , X5 , X6](context: Context6[F])(t1: AppendTag[Tag])( given  app: Application6[F, Tag , X1 , X2 , X3 , X4 , X5 , X6]): F[X1 , X2 , X3 , X4 , X5 , X6] = app.application(context)
         inline  final def mergeTag[T1 , T2 , T3 , T4 , T5 , T6, Target](t1: AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3]  , t4 : AppendTag[T4]  , t5 : AppendTag[T5]  , t6 : AppendTag[T6] )( given  i: Merge6[T1  , T2  , T3  , T4  , T5  , T6 , Target]): AppendTag[Target] = AppendTag[Target]
         inline  final def liftTag[F[_ , _ , _ , _ , _ , _ , _], Tag , X1 , X2 , X3 , X4 , X5 , X6 , X7](context: Context7[F])(t1: AppendTag[Tag])( given  app: Application7[F, Tag , X1 , X2 , X3 , X4 , X5 , X6 , X7]): F[X1 , X2 , X3 , X4 , X5 , X6 , X7] = app.application(context)
         inline  final def mergeTag[T1 , T2 , T3 , T4 , T5 , T6 , T7, Target](t1: AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3]  , t4 : AppendTag[T4]  , t5 : AppendTag[T5]  , t6 : AppendTag[T6]  , t7 : AppendTag[T7] )( given  i: Merge7[T1  , T2  , T3  , T4  , T5  , T6  , T7 , Target]): AppendTag[Target] = AppendTag[Target]
         inline  final def liftTag[F[_ , _ , _ , _ , _ , _ , _ , _], Tag , X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8](context: Context8[F])(t1: AppendTag[Tag])( given  app: Application8[F, Tag , X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8]): F[X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8] = app.application(context)
         inline  final def mergeTag[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8, Target](t1: AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3]  , t4 : AppendTag[T4]  , t5 : AppendTag[T5]  , t6 : AppendTag[T6]  , t7 : AppendTag[T7]  , t8 : AppendTag[T8] )( given  i: Merge8[T1  , T2  , T3  , T4  , T5  , T6  , T7  , T8 , Target]): AppendTag[Target] = AppendTag[Target]
}
