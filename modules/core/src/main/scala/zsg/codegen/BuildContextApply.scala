package zsg
object BuildContextApply {
        final class BuildContextApply1[F[_]](val context: Context1[F]) {
            def tuple[X1](
                i: F[X1]
            ): F[ZsgTuple1[X1]] = {
                context.append(context.start, i)(ZsgTuple1.cachePlus1WithTypeParameter0)
            }
            def tuple[Y1, X1](
                i1: F[Y1],
                i2: F[X1]
            ): F[ZsgTuple2[Y1, X1]] = {
                context.append(i2, i1)(ZsgTuple2.cachePlus1WithTypeParameter1)
            }
            def nodeTuple[X1 <: TupleTag](
                i: F[X1]
            ): F[NodeTuple1[X1]] = {
                context.append(context.start, i)(NodeTuple1.cachePlus1WithTypeParameter0)
            }
            def nodeTuple[Y1 <: TupleTag, X1 <: TupleTag](
                i1: F[Y1],
                i2: F[X1]
            ): F[NodeTuple2[Y1, X1]] = {
                context.append(i2, i1)(NodeTuple2.cachePlus1WithTypeParameter1)
            }
        }
        final class BuildContextApply2[F[_ , _]](val context: Context2[F]) {
            def tuple[X1 , X2](
                i: F[X1 , X2]
            ): F[ZsgTuple1[X1] , ZsgTuple1[X2]] = {
                context.append(context.start, i)(ZsgTuple1.cachePlus2WithTypeParameter0)
            }
            def tuple[Y1 , Y2, X1 , X2](
                i1: F[Y1 , Y2],
                i2: F[X1 , X2]
            ): F[ZsgTuple2[Y1, X1] , ZsgTuple2[Y2, X2]] = {
                context.append(i2, i1)(ZsgTuple2.cachePlus2WithTypeParameter1)
            }
            def nodeTuple[X1 <: TupleTag , X2 <: TupleTag](
                i: F[X1 , X2]
            ): F[NodeTuple1[X1] , NodeTuple1[X2]] = {
                context.append(context.start, i)(NodeTuple1.cachePlus2WithTypeParameter0)
            }
            def nodeTuple[Y1 <: TupleTag , Y2 <: TupleTag, X1 <: TupleTag , X2 <: TupleTag](
                i1: F[Y1 , Y2],
                i2: F[X1 , X2]
            ): F[NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2]] = {
                context.append(i2, i1)(NodeTuple2.cachePlus2WithTypeParameter1)
            }
        }
        final class BuildContextApply3[F[_ , _ , _]](val context: Context3[F]) {
            def tuple[X1 , X2 , X3](
                i: F[X1 , X2 , X3]
            ): F[ZsgTuple1[X1] , ZsgTuple1[X2] , ZsgTuple1[X3]] = {
                context.append(context.start, i)(ZsgTuple1.cachePlus3WithTypeParameter0)
            }
            def tuple[Y1 , Y2 , Y3, X1 , X2 , X3](
                i1: F[Y1 , Y2 , Y3],
                i2: F[X1 , X2 , X3]
            ): F[ZsgTuple2[Y1, X1] , ZsgTuple2[Y2, X2] , ZsgTuple2[Y3, X3]] = {
                context.append(i2, i1)(ZsgTuple2.cachePlus3WithTypeParameter1)
            }
            def nodeTuple[X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag](
                i: F[X1 , X2 , X3]
            ): F[NodeTuple1[X1] , NodeTuple1[X2] , NodeTuple1[X3]] = {
                context.append(context.start, i)(NodeTuple1.cachePlus3WithTypeParameter0)
            }
            def nodeTuple[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag, X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag](
                i1: F[Y1 , Y2 , Y3],
                i2: F[X1 , X2 , X3]
            ): F[NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3]] = {
                context.append(i2, i1)(NodeTuple2.cachePlus3WithTypeParameter1)
            }
        }
        final class BuildContextApply4[F[_ , _ , _ , _]](val context: Context4[F]) {
            def tuple[X1 , X2 , X3 , X4](
                i: F[X1 , X2 , X3 , X4]
            ): F[ZsgTuple1[X1] , ZsgTuple1[X2] , ZsgTuple1[X3] , ZsgTuple1[X4]] = {
                context.append(context.start, i)(ZsgTuple1.cachePlus4WithTypeParameter0)
            }
            def tuple[Y1 , Y2 , Y3 , Y4, X1 , X2 , X3 , X4](
                i1: F[Y1 , Y2 , Y3 , Y4],
                i2: F[X1 , X2 , X3 , X4]
            ): F[ZsgTuple2[Y1, X1] , ZsgTuple2[Y2, X2] , ZsgTuple2[Y3, X3] , ZsgTuple2[Y4, X4]] = {
                context.append(i2, i1)(ZsgTuple2.cachePlus4WithTypeParameter1)
            }
            def nodeTuple[X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag](
                i: F[X1 , X2 , X3 , X4]
            ): F[NodeTuple1[X1] , NodeTuple1[X2] , NodeTuple1[X3] , NodeTuple1[X4]] = {
                context.append(context.start, i)(NodeTuple1.cachePlus4WithTypeParameter0)
            }
            def nodeTuple[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag, X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag](
                i1: F[Y1 , Y2 , Y3 , Y4],
                i2: F[X1 , X2 , X3 , X4]
            ): F[NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4]] = {
                context.append(i2, i1)(NodeTuple2.cachePlus4WithTypeParameter1)
            }
        }
        final class BuildContextApply5[F[_ , _ , _ , _ , _]](val context: Context5[F]) {
            def tuple[X1 , X2 , X3 , X4 , X5](
                i: F[X1 , X2 , X3 , X4 , X5]
            ): F[ZsgTuple1[X1] , ZsgTuple1[X2] , ZsgTuple1[X3] , ZsgTuple1[X4] , ZsgTuple1[X5]] = {
                context.append(context.start, i)(ZsgTuple1.cachePlus5WithTypeParameter0)
            }
            def tuple[Y1 , Y2 , Y3 , Y4 , Y5, X1 , X2 , X3 , X4 , X5](
                i1: F[Y1 , Y2 , Y3 , Y4 , Y5],
                i2: F[X1 , X2 , X3 , X4 , X5]
            ): F[ZsgTuple2[Y1, X1] , ZsgTuple2[Y2, X2] , ZsgTuple2[Y3, X3] , ZsgTuple2[Y4, X4] , ZsgTuple2[Y5, X5]] = {
                context.append(i2, i1)(ZsgTuple2.cachePlus5WithTypeParameter1)
            }
            def nodeTuple[X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag](
                i: F[X1 , X2 , X3 , X4 , X5]
            ): F[NodeTuple1[X1] , NodeTuple1[X2] , NodeTuple1[X3] , NodeTuple1[X4] , NodeTuple1[X5]] = {
                context.append(context.start, i)(NodeTuple1.cachePlus5WithTypeParameter0)
            }
            def nodeTuple[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag, X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag](
                i1: F[Y1 , Y2 , Y3 , Y4 , Y5],
                i2: F[X1 , X2 , X3 , X4 , X5]
            ): F[NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5]] = {
                context.append(i2, i1)(NodeTuple2.cachePlus5WithTypeParameter1)
            }
        }
        final class BuildContextApply6[F[_ , _ , _ , _ , _ , _]](val context: Context6[F]) {
            def tuple[X1 , X2 , X3 , X4 , X5 , X6](
                i: F[X1 , X2 , X3 , X4 , X5 , X6]
            ): F[ZsgTuple1[X1] , ZsgTuple1[X2] , ZsgTuple1[X3] , ZsgTuple1[X4] , ZsgTuple1[X5] , ZsgTuple1[X6]] = {
                context.append(context.start, i)(ZsgTuple1.cachePlus6WithTypeParameter0)
            }
            def tuple[Y1 , Y2 , Y3 , Y4 , Y5 , Y6, X1 , X2 , X3 , X4 , X5 , X6](
                i1: F[Y1 , Y2 , Y3 , Y4 , Y5 , Y6],
                i2: F[X1 , X2 , X3 , X4 , X5 , X6]
            ): F[ZsgTuple2[Y1, X1] , ZsgTuple2[Y2, X2] , ZsgTuple2[Y3, X3] , ZsgTuple2[Y4, X4] , ZsgTuple2[Y5, X5] , ZsgTuple2[Y6, X6]] = {
                context.append(i2, i1)(ZsgTuple2.cachePlus6WithTypeParameter1)
            }
            def nodeTuple[X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag , X6 <: TupleTag](
                i: F[X1 , X2 , X3 , X4 , X5 , X6]
            ): F[NodeTuple1[X1] , NodeTuple1[X2] , NodeTuple1[X3] , NodeTuple1[X4] , NodeTuple1[X5] , NodeTuple1[X6]] = {
                context.append(context.start, i)(NodeTuple1.cachePlus6WithTypeParameter0)
            }
            def nodeTuple[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag, X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag , X6 <: TupleTag](
                i1: F[Y1 , Y2 , Y3 , Y4 , Y5 , Y6],
                i2: F[X1 , X2 , X3 , X4 , X5 , X6]
            ): F[NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6]] = {
                context.append(i2, i1)(NodeTuple2.cachePlus6WithTypeParameter1)
            }
        }
        final class BuildContextApply7[F[_ , _ , _ , _ , _ , _ , _]](val context: Context7[F]) {
            def tuple[X1 , X2 , X3 , X4 , X5 , X6 , X7](
                i: F[X1 , X2 , X3 , X4 , X5 , X6 , X7]
            ): F[ZsgTuple1[X1] , ZsgTuple1[X2] , ZsgTuple1[X3] , ZsgTuple1[X4] , ZsgTuple1[X5] , ZsgTuple1[X6] , ZsgTuple1[X7]] = {
                context.append(context.start, i)(ZsgTuple1.cachePlus7WithTypeParameter0)
            }
            def tuple[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7, X1 , X2 , X3 , X4 , X5 , X6 , X7](
                i1: F[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7],
                i2: F[X1 , X2 , X3 , X4 , X5 , X6 , X7]
            ): F[ZsgTuple2[Y1, X1] , ZsgTuple2[Y2, X2] , ZsgTuple2[Y3, X3] , ZsgTuple2[Y4, X4] , ZsgTuple2[Y5, X5] , ZsgTuple2[Y6, X6] , ZsgTuple2[Y7, X7]] = {
                context.append(i2, i1)(ZsgTuple2.cachePlus7WithTypeParameter1)
            }
            def nodeTuple[X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag , X6 <: TupleTag , X7 <: TupleTag](
                i: F[X1 , X2 , X3 , X4 , X5 , X6 , X7]
            ): F[NodeTuple1[X1] , NodeTuple1[X2] , NodeTuple1[X3] , NodeTuple1[X4] , NodeTuple1[X5] , NodeTuple1[X6] , NodeTuple1[X7]] = {
                context.append(context.start, i)(NodeTuple1.cachePlus7WithTypeParameter0)
            }
            def nodeTuple[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag , Y7 <: TupleTag, X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag , X6 <: TupleTag , X7 <: TupleTag](
                i1: F[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7],
                i2: F[X1 , X2 , X3 , X4 , X5 , X6 , X7]
            ): F[NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6] , NodeTuple2[Y7, X7]] = {
                context.append(i2, i1)(NodeTuple2.cachePlus7WithTypeParameter1)
            }
        }
        final class BuildContextApply8[F[_ , _ , _ , _ , _ , _ , _ , _]](val context: Context8[F]) {
            def tuple[X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8](
                i: F[X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8]
            ): F[ZsgTuple1[X1] , ZsgTuple1[X2] , ZsgTuple1[X3] , ZsgTuple1[X4] , ZsgTuple1[X5] , ZsgTuple1[X6] , ZsgTuple1[X7] , ZsgTuple1[X8]] = {
                context.append(context.start, i)(ZsgTuple1.cachePlus8WithTypeParameter0)
            }
            def tuple[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8, X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8](
                i1: F[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8],
                i2: F[X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8]
            ): F[ZsgTuple2[Y1, X1] , ZsgTuple2[Y2, X2] , ZsgTuple2[Y3, X3] , ZsgTuple2[Y4, X4] , ZsgTuple2[Y5, X5] , ZsgTuple2[Y6, X6] , ZsgTuple2[Y7, X7] , ZsgTuple2[Y8, X8]] = {
                context.append(i2, i1)(ZsgTuple2.cachePlus8WithTypeParameter1)
            }
            def nodeTuple[X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag , X6 <: TupleTag , X7 <: TupleTag , X8 <: TupleTag](
                i: F[X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8]
            ): F[NodeTuple1[X1] , NodeTuple1[X2] , NodeTuple1[X3] , NodeTuple1[X4] , NodeTuple1[X5] , NodeTuple1[X6] , NodeTuple1[X7] , NodeTuple1[X8]] = {
                context.append(context.start, i)(NodeTuple1.cachePlus8WithTypeParameter0)
            }
            def nodeTuple[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag , Y7 <: TupleTag , Y8 <: TupleTag, X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag , X6 <: TupleTag , X7 <: TupleTag , X8 <: TupleTag](
                i1: F[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8],
                i2: F[X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8]
            ): F[NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6] , NodeTuple2[Y7, X7] , NodeTuple2[Y8, X8]] = {
                context.append(i2, i1)(NodeTuple2.cachePlus8WithTypeParameter1)
            }
        }
        def apply[F[_]](context: Context1[F]): BuildContextApply1[F] = new BuildContextApply1(context)
        def apply[F[_ , _]](context: Context2[F]): BuildContextApply2[F] = new BuildContextApply2(context)
        def apply[F[_ , _ , _]](context: Context3[F]): BuildContextApply3[F] = new BuildContextApply3(context)
        def apply[F[_ , _ , _ , _]](context: Context4[F]): BuildContextApply4[F] = new BuildContextApply4(context)
        def apply[F[_ , _ , _ , _ , _]](context: Context5[F]): BuildContextApply5[F] = new BuildContextApply5(context)
        def apply[F[_ , _ , _ , _ , _ , _]](context: Context6[F]): BuildContextApply6[F] = new BuildContextApply6(context)
        def apply[F[_ , _ , _ , _ , _ , _ , _]](context: Context7[F]): BuildContextApply7[F] = new BuildContextApply7(context)
        def apply[F[_ , _ , _ , _ , _ , _ , _ , _]](context: Context8[F]): BuildContextApply8[F] = new BuildContextApply8(context)
}
