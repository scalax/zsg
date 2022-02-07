package zsg.scala.tuple
import zsg.TypeHList
import zsg.Application
import zsg.Context
import zsg.Plus
trait TupleHelper extends TupleHelper23 {
  given [T <: Context, Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2]
  ): Application[T, Tuple2[Boot1, Boot2], Tuple2TypeHList[Target1, Target2]] =
    context => context.append(v1.application(context), v2.application(context))(Tuple22Plus.tuple22Plus1)
  given [T <: Context, Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3]
  ): Application[T, Tuple3[Boot1, Boot2, Boot3], Tuple3TypeHList[Target1, Target2, Target3]] =
    context =>
      context.append(context.append(v1.application(context), v2.application(context))(Plus.item2Plus), v3.application(context))(
        Tuple22Plus.tuple22Plus2
      )
  given [T <: Context, Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList](
    using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4]
  ): Application[T, Tuple4[Boot1, Boot2, Boot3, Boot4], Tuple4TypeHList[Target1, Target2, Target3, Target4]] =
    context =>
      context.append(
        context.append(context.append(v1.application(context), v2.application(context))(Plus.item2Plus), v3.application(context))(
          Plus.item2Plus
        ),
        v4.application(context)
      )(Tuple22Plus.tuple22Plus3)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5]
  ): Application[T, Tuple5[Boot1, Boot2, Boot3, Boot4, Boot5], Tuple5TypeHList[Target1, Target2, Target3, Target4, Target5]] =
    context =>
      context.append(
        context.append(
          context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
          context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
        )(Plus.item2Plus),
        v5.application(context)
      )(Tuple22Plus.tuple22Plus4)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6]
  ): Application[T, Tuple6[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6], Tuple6TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
            context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
          )(Plus.item2Plus),
          v5.application(context)
        )(Plus.item2Plus),
        v6.application(context)
      )(Tuple22Plus.tuple22Plus5)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7]
  ): Application[T, Tuple7[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7], Tuple7TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
            context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
          )(Plus.item2Plus),
          context.append(v5.application(context), v6.application(context))(Plus.item2Plus)
        )(Plus.item2Plus),
        v7.application(context)
      )(Tuple22Plus.tuple22Plus6)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8]
  ): Application[T, Tuple8[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8], Tuple8TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
            context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
          )(Plus.item2Plus),
          context.append(context.append(v5.application(context), v6.application(context))(Plus.item2Plus), v7.application(context))(
            Plus.item2Plus
          )
        )(Plus.item2Plus),
        v8.application(context)
      )(Tuple22Plus.tuple22Plus7)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList,
    Boot9,
    Target9 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8],
    v9: Application[T, Boot9, Target9]
  ): Application[T, Tuple9[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9], Tuple9TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
            context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
          )(Plus.item2Plus),
          context.append(
            context.append(v5.application(context), v6.application(context))(Plus.item2Plus),
            context.append(v7.application(context), v8.application(context))(Plus.item2Plus)
          )(Plus.item2Plus)
        )(Plus.item2Plus),
        v9.application(context)
      )(Tuple22Plus.tuple22Plus8)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList,
    Boot9,
    Target9 <: TypeHList,
    Boot10,
    Target10 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8],
    v9: Application[T, Boot9, Target9],
    v10: Application[T, Boot10, Target10]
  ): Application[T, Tuple10[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9, Boot10], Tuple10TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
              context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(
              context.append(v5.application(context), v6.application(context))(Plus.item2Plus),
              context.append(v7.application(context), v8.application(context))(Plus.item2Plus)
            )(Plus.item2Plus)
          )(Plus.item2Plus),
          v9.application(context)
        )(Plus.item2Plus),
        v10.application(context)
      )(Tuple22Plus.tuple22Plus9)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList,
    Boot9,
    Target9 <: TypeHList,
    Boot10,
    Target10 <: TypeHList,
    Boot11,
    Target11 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8],
    v9: Application[T, Boot9, Target9],
    v10: Application[T, Boot10, Target10],
    v11: Application[T, Boot11, Target11]
  ): Application[T, Tuple11[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9, Boot10, Boot11], Tuple11TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
              context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(
              context.append(v5.application(context), v6.application(context))(Plus.item2Plus),
              context.append(v7.application(context), v8.application(context))(Plus.item2Plus)
            )(Plus.item2Plus)
          )(Plus.item2Plus),
          context.append(v9.application(context), v10.application(context))(Plus.item2Plus)
        )(Plus.item2Plus),
        v11.application(context)
      )(Tuple22Plus.tuple22Plus10)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList,
    Boot9,
    Target9 <: TypeHList,
    Boot10,
    Target10 <: TypeHList,
    Boot11,
    Target11 <: TypeHList,
    Boot12,
    Target12 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8],
    v9: Application[T, Boot9, Target9],
    v10: Application[T, Boot10, Target10],
    v11: Application[T, Boot11, Target11],
    v12: Application[T, Boot12, Target12]
  ): Application[T, Tuple12[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9, Boot10, Boot11, Boot12], Tuple12TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
              context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(
              context.append(v5.application(context), v6.application(context))(Plus.item2Plus),
              context.append(v7.application(context), v8.application(context))(Plus.item2Plus)
            )(Plus.item2Plus)
          )(Plus.item2Plus),
          context.append(context.append(v9.application(context), v10.application(context))(Plus.item2Plus), v11.application(context))(
            Plus.item2Plus
          )
        )(Plus.item2Plus),
        v12.application(context)
      )(Tuple22Plus.tuple22Plus11)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList,
    Boot9,
    Target9 <: TypeHList,
    Boot10,
    Target10 <: TypeHList,
    Boot11,
    Target11 <: TypeHList,
    Boot12,
    Target12 <: TypeHList,
    Boot13,
    Target13 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8],
    v9: Application[T, Boot9, Target9],
    v10: Application[T, Boot10, Target10],
    v11: Application[T, Boot11, Target11],
    v12: Application[T, Boot12, Target12],
    v13: Application[T, Boot13, Target13]
  ): Application[T, Tuple13[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13
  ], Tuple13TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
              context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(
              context.append(v5.application(context), v6.application(context))(Plus.item2Plus),
              context.append(v7.application(context), v8.application(context))(Plus.item2Plus)
            )(Plus.item2Plus)
          )(Plus.item2Plus),
          context.append(
            context.append(v9.application(context), v10.application(context))(Plus.item2Plus),
            context.append(v11.application(context), v12.application(context))(Plus.item2Plus)
          )(Plus.item2Plus)
        )(Plus.item2Plus),
        v13.application(context)
      )(Tuple22Plus.tuple22Plus12)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList,
    Boot9,
    Target9 <: TypeHList,
    Boot10,
    Target10 <: TypeHList,
    Boot11,
    Target11 <: TypeHList,
    Boot12,
    Target12 <: TypeHList,
    Boot13,
    Target13 <: TypeHList,
    Boot14,
    Target14 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8],
    v9: Application[T, Boot9, Target9],
    v10: Application[T, Boot10, Target10],
    v11: Application[T, Boot11, Target11],
    v12: Application[T, Boot12, Target12],
    v13: Application[T, Boot13, Target13],
    v14: Application[T, Boot14, Target14]
  ): Application[T, Tuple14[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14
  ], Tuple14TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
              context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(
              context.append(v5.application(context), v6.application(context))(Plus.item2Plus),
              context.append(v7.application(context), v8.application(context))(Plus.item2Plus)
            )(Plus.item2Plus)
          )(Plus.item2Plus),
          context.append(
            context.append(
              context.append(v9.application(context), v10.application(context))(Plus.item2Plus),
              context.append(v11.application(context), v12.application(context))(Plus.item2Plus)
            )(Plus.item2Plus),
            v13.application(context)
          )(Plus.item2Plus)
        )(Plus.item2Plus),
        v14.application(context)
      )(Tuple22Plus.tuple22Plus13)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList,
    Boot9,
    Target9 <: TypeHList,
    Boot10,
    Target10 <: TypeHList,
    Boot11,
    Target11 <: TypeHList,
    Boot12,
    Target12 <: TypeHList,
    Boot13,
    Target13 <: TypeHList,
    Boot14,
    Target14 <: TypeHList,
    Boot15,
    Target15 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8],
    v9: Application[T, Boot9, Target9],
    v10: Application[T, Boot10, Target10],
    v11: Application[T, Boot11, Target11],
    v12: Application[T, Boot12, Target12],
    v13: Application[T, Boot13, Target13],
    v14: Application[T, Boot14, Target14],
    v15: Application[T, Boot15, Target15]
  ): Application[T, Tuple15[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15
  ], Tuple15TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
              context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(
              context.append(v5.application(context), v6.application(context))(Plus.item2Plus),
              context.append(v7.application(context), v8.application(context))(Plus.item2Plus)
            )(Plus.item2Plus)
          )(Plus.item2Plus),
          context.append(
            context.append(
              context.append(v9.application(context), v10.application(context))(Plus.item2Plus),
              context.append(v11.application(context), v12.application(context))(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(v13.application(context), v14.application(context))(Plus.item2Plus)
          )(Plus.item2Plus)
        )(Plus.item2Plus),
        v15.application(context)
      )(Tuple22Plus.tuple22Plus14)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList,
    Boot9,
    Target9 <: TypeHList,
    Boot10,
    Target10 <: TypeHList,
    Boot11,
    Target11 <: TypeHList,
    Boot12,
    Target12 <: TypeHList,
    Boot13,
    Target13 <: TypeHList,
    Boot14,
    Target14 <: TypeHList,
    Boot15,
    Target15 <: TypeHList,
    Boot16,
    Target16 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8],
    v9: Application[T, Boot9, Target9],
    v10: Application[T, Boot10, Target10],
    v11: Application[T, Boot11, Target11],
    v12: Application[T, Boot12, Target12],
    v13: Application[T, Boot13, Target13],
    v14: Application[T, Boot14, Target14],
    v15: Application[T, Boot15, Target15],
    v16: Application[T, Boot16, Target16]
  ): Application[T, Tuple16[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15,
    Boot16
  ], Tuple16TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15,
    Target16
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
              context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(
              context.append(v5.application(context), v6.application(context))(Plus.item2Plus),
              context.append(v7.application(context), v8.application(context))(Plus.item2Plus)
            )(Plus.item2Plus)
          )(Plus.item2Plus),
          context.append(
            context.append(
              context.append(v9.application(context), v10.application(context))(Plus.item2Plus),
              context.append(v11.application(context), v12.application(context))(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(context.append(v13.application(context), v14.application(context))(Plus.item2Plus), v15.application(context))(
              Plus.item2Plus
            )
          )(Plus.item2Plus)
        )(Plus.item2Plus),
        v16.application(context)
      )(Tuple22Plus.tuple22Plus15)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList,
    Boot9,
    Target9 <: TypeHList,
    Boot10,
    Target10 <: TypeHList,
    Boot11,
    Target11 <: TypeHList,
    Boot12,
    Target12 <: TypeHList,
    Boot13,
    Target13 <: TypeHList,
    Boot14,
    Target14 <: TypeHList,
    Boot15,
    Target15 <: TypeHList,
    Boot16,
    Target16 <: TypeHList,
    Boot17,
    Target17 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8],
    v9: Application[T, Boot9, Target9],
    v10: Application[T, Boot10, Target10],
    v11: Application[T, Boot11, Target11],
    v12: Application[T, Boot12, Target12],
    v13: Application[T, Boot13, Target13],
    v14: Application[T, Boot14, Target14],
    v15: Application[T, Boot15, Target15],
    v16: Application[T, Boot16, Target16],
    v17: Application[T, Boot17, Target17]
  ): Application[T, Tuple17[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15,
    Boot16,
    Boot17
  ], Tuple17TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15,
    Target16,
    Target17
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
              context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(
              context.append(v5.application(context), v6.application(context))(Plus.item2Plus),
              context.append(v7.application(context), v8.application(context))(Plus.item2Plus)
            )(Plus.item2Plus)
          )(Plus.item2Plus),
          context.append(
            context.append(
              context.append(v9.application(context), v10.application(context))(Plus.item2Plus),
              context.append(v11.application(context), v12.application(context))(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(
              context.append(v13.application(context), v14.application(context))(Plus.item2Plus),
              context.append(v15.application(context), v16.application(context))(Plus.item2Plus)
            )(Plus.item2Plus)
          )(Plus.item2Plus)
        )(Plus.item2Plus),
        v17.application(context)
      )(Tuple22Plus.tuple22Plus16)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList,
    Boot9,
    Target9 <: TypeHList,
    Boot10,
    Target10 <: TypeHList,
    Boot11,
    Target11 <: TypeHList,
    Boot12,
    Target12 <: TypeHList,
    Boot13,
    Target13 <: TypeHList,
    Boot14,
    Target14 <: TypeHList,
    Boot15,
    Target15 <: TypeHList,
    Boot16,
    Target16 <: TypeHList,
    Boot17,
    Target17 <: TypeHList,
    Boot18,
    Target18 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8],
    v9: Application[T, Boot9, Target9],
    v10: Application[T, Boot10, Target10],
    v11: Application[T, Boot11, Target11],
    v12: Application[T, Boot12, Target12],
    v13: Application[T, Boot13, Target13],
    v14: Application[T, Boot14, Target14],
    v15: Application[T, Boot15, Target15],
    v16: Application[T, Boot16, Target16],
    v17: Application[T, Boot17, Target17],
    v18: Application[T, Boot18, Target18]
  ): Application[T, Tuple18[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15,
    Boot16,
    Boot17,
    Boot18
  ], Tuple18TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15,
    Target16,
    Target17,
    Target18
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
                context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
              )(Plus.item2Plus),
              context.append(
                context.append(v5.application(context), v6.application(context))(Plus.item2Plus),
                context.append(v7.application(context), v8.application(context))(Plus.item2Plus)
              )(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(
              context.append(
                context.append(v9.application(context), v10.application(context))(Plus.item2Plus),
                context.append(v11.application(context), v12.application(context))(Plus.item2Plus)
              )(Plus.item2Plus),
              context.append(
                context.append(v13.application(context), v14.application(context))(Plus.item2Plus),
                context.append(v15.application(context), v16.application(context))(Plus.item2Plus)
              )(Plus.item2Plus)
            )(Plus.item2Plus)
          )(Plus.item2Plus),
          v17.application(context)
        )(Plus.item2Plus),
        v18.application(context)
      )(Tuple22Plus.tuple22Plus17)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList,
    Boot9,
    Target9 <: TypeHList,
    Boot10,
    Target10 <: TypeHList,
    Boot11,
    Target11 <: TypeHList,
    Boot12,
    Target12 <: TypeHList,
    Boot13,
    Target13 <: TypeHList,
    Boot14,
    Target14 <: TypeHList,
    Boot15,
    Target15 <: TypeHList,
    Boot16,
    Target16 <: TypeHList,
    Boot17,
    Target17 <: TypeHList,
    Boot18,
    Target18 <: TypeHList,
    Boot19,
    Target19 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8],
    v9: Application[T, Boot9, Target9],
    v10: Application[T, Boot10, Target10],
    v11: Application[T, Boot11, Target11],
    v12: Application[T, Boot12, Target12],
    v13: Application[T, Boot13, Target13],
    v14: Application[T, Boot14, Target14],
    v15: Application[T, Boot15, Target15],
    v16: Application[T, Boot16, Target16],
    v17: Application[T, Boot17, Target17],
    v18: Application[T, Boot18, Target18],
    v19: Application[T, Boot19, Target19]
  ): Application[T, Tuple19[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15,
    Boot16,
    Boot17,
    Boot18,
    Boot19
  ], Tuple19TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15,
    Target16,
    Target17,
    Target18,
    Target19
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
                context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
              )(Plus.item2Plus),
              context.append(
                context.append(v5.application(context), v6.application(context))(Plus.item2Plus),
                context.append(v7.application(context), v8.application(context))(Plus.item2Plus)
              )(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(
              context.append(
                context.append(v9.application(context), v10.application(context))(Plus.item2Plus),
                context.append(v11.application(context), v12.application(context))(Plus.item2Plus)
              )(Plus.item2Plus),
              context.append(
                context.append(v13.application(context), v14.application(context))(Plus.item2Plus),
                context.append(v15.application(context), v16.application(context))(Plus.item2Plus)
              )(Plus.item2Plus)
            )(Plus.item2Plus)
          )(Plus.item2Plus),
          context.append(v17.application(context), v18.application(context))(Plus.item2Plus)
        )(Plus.item2Plus),
        v19.application(context)
      )(Tuple22Plus.tuple22Plus18)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList,
    Boot9,
    Target9 <: TypeHList,
    Boot10,
    Target10 <: TypeHList,
    Boot11,
    Target11 <: TypeHList,
    Boot12,
    Target12 <: TypeHList,
    Boot13,
    Target13 <: TypeHList,
    Boot14,
    Target14 <: TypeHList,
    Boot15,
    Target15 <: TypeHList,
    Boot16,
    Target16 <: TypeHList,
    Boot17,
    Target17 <: TypeHList,
    Boot18,
    Target18 <: TypeHList,
    Boot19,
    Target19 <: TypeHList,
    Boot20,
    Target20 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8],
    v9: Application[T, Boot9, Target9],
    v10: Application[T, Boot10, Target10],
    v11: Application[T, Boot11, Target11],
    v12: Application[T, Boot12, Target12],
    v13: Application[T, Boot13, Target13],
    v14: Application[T, Boot14, Target14],
    v15: Application[T, Boot15, Target15],
    v16: Application[T, Boot16, Target16],
    v17: Application[T, Boot17, Target17],
    v18: Application[T, Boot18, Target18],
    v19: Application[T, Boot19, Target19],
    v20: Application[T, Boot20, Target20]
  ): Application[T, Tuple20[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15,
    Boot16,
    Boot17,
    Boot18,
    Boot19,
    Boot20
  ], Tuple20TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15,
    Target16,
    Target17,
    Target18,
    Target19,
    Target20
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
                context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
              )(Plus.item2Plus),
              context.append(
                context.append(v5.application(context), v6.application(context))(Plus.item2Plus),
                context.append(v7.application(context), v8.application(context))(Plus.item2Plus)
              )(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(
              context.append(
                context.append(v9.application(context), v10.application(context))(Plus.item2Plus),
                context.append(v11.application(context), v12.application(context))(Plus.item2Plus)
              )(Plus.item2Plus),
              context.append(
                context.append(v13.application(context), v14.application(context))(Plus.item2Plus),
                context.append(v15.application(context), v16.application(context))(Plus.item2Plus)
              )(Plus.item2Plus)
            )(Plus.item2Plus)
          )(Plus.item2Plus),
          context.append(context.append(v17.application(context), v18.application(context))(Plus.item2Plus), v19.application(context))(
            Plus.item2Plus
          )
        )(Plus.item2Plus),
        v20.application(context)
      )(Tuple22Plus.tuple22Plus19)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList,
    Boot9,
    Target9 <: TypeHList,
    Boot10,
    Target10 <: TypeHList,
    Boot11,
    Target11 <: TypeHList,
    Boot12,
    Target12 <: TypeHList,
    Boot13,
    Target13 <: TypeHList,
    Boot14,
    Target14 <: TypeHList,
    Boot15,
    Target15 <: TypeHList,
    Boot16,
    Target16 <: TypeHList,
    Boot17,
    Target17 <: TypeHList,
    Boot18,
    Target18 <: TypeHList,
    Boot19,
    Target19 <: TypeHList,
    Boot20,
    Target20 <: TypeHList,
    Boot21,
    Target21 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8],
    v9: Application[T, Boot9, Target9],
    v10: Application[T, Boot10, Target10],
    v11: Application[T, Boot11, Target11],
    v12: Application[T, Boot12, Target12],
    v13: Application[T, Boot13, Target13],
    v14: Application[T, Boot14, Target14],
    v15: Application[T, Boot15, Target15],
    v16: Application[T, Boot16, Target16],
    v17: Application[T, Boot17, Target17],
    v18: Application[T, Boot18, Target18],
    v19: Application[T, Boot19, Target19],
    v20: Application[T, Boot20, Target20],
    v21: Application[T, Boot21, Target21]
  ): Application[T, Tuple21[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15,
    Boot16,
    Boot17,
    Boot18,
    Boot19,
    Boot20,
    Boot21
  ], Tuple21TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15,
    Target16,
    Target17,
    Target18,
    Target19,
    Target20,
    Target21
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
                context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
              )(Plus.item2Plus),
              context.append(
                context.append(v5.application(context), v6.application(context))(Plus.item2Plus),
                context.append(v7.application(context), v8.application(context))(Plus.item2Plus)
              )(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(
              context.append(
                context.append(v9.application(context), v10.application(context))(Plus.item2Plus),
                context.append(v11.application(context), v12.application(context))(Plus.item2Plus)
              )(Plus.item2Plus),
              context.append(
                context.append(v13.application(context), v14.application(context))(Plus.item2Plus),
                context.append(v15.application(context), v16.application(context))(Plus.item2Plus)
              )(Plus.item2Plus)
            )(Plus.item2Plus)
          )(Plus.item2Plus),
          context.append(
            context.append(v17.application(context), v18.application(context))(Plus.item2Plus),
            context.append(v19.application(context), v20.application(context))(Plus.item2Plus)
          )(Plus.item2Plus)
        )(Plus.item2Plus),
        v21.application(context)
      )(Tuple22Plus.tuple22Plus20)
  given [
    T <: Context,
    Boot1,
    Target1 <: TypeHList,
    Boot2,
    Target2 <: TypeHList,
    Boot3,
    Target3 <: TypeHList,
    Boot4,
    Target4 <: TypeHList,
    Boot5,
    Target5 <: TypeHList,
    Boot6,
    Target6 <: TypeHList,
    Boot7,
    Target7 <: TypeHList,
    Boot8,
    Target8 <: TypeHList,
    Boot9,
    Target9 <: TypeHList,
    Boot10,
    Target10 <: TypeHList,
    Boot11,
    Target11 <: TypeHList,
    Boot12,
    Target12 <: TypeHList,
    Boot13,
    Target13 <: TypeHList,
    Boot14,
    Target14 <: TypeHList,
    Boot15,
    Target15 <: TypeHList,
    Boot16,
    Target16 <: TypeHList,
    Boot17,
    Target17 <: TypeHList,
    Boot18,
    Target18 <: TypeHList,
    Boot19,
    Target19 <: TypeHList,
    Boot20,
    Target20 <: TypeHList,
    Boot21,
    Target21 <: TypeHList,
    Boot22,
    Target22 <: TypeHList
  ](using
    v1: Application[T, Boot1, Target1],
    v2: Application[T, Boot2, Target2],
    v3: Application[T, Boot3, Target3],
    v4: Application[T, Boot4, Target4],
    v5: Application[T, Boot5, Target5],
    v6: Application[T, Boot6, Target6],
    v7: Application[T, Boot7, Target7],
    v8: Application[T, Boot8, Target8],
    v9: Application[T, Boot9, Target9],
    v10: Application[T, Boot10, Target10],
    v11: Application[T, Boot11, Target11],
    v12: Application[T, Boot12, Target12],
    v13: Application[T, Boot13, Target13],
    v14: Application[T, Boot14, Target14],
    v15: Application[T, Boot15, Target15],
    v16: Application[T, Boot16, Target16],
    v17: Application[T, Boot17, Target17],
    v18: Application[T, Boot18, Target18],
    v19: Application[T, Boot19, Target19],
    v20: Application[T, Boot20, Target20],
    v21: Application[T, Boot21, Target21],
    v22: Application[T, Boot22, Target22]
  ): Application[T, Tuple22[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15,
    Boot16,
    Boot17,
    Boot18,
    Boot19,
    Boot20,
    Boot21,
    Boot22
  ], Tuple22TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15,
    Target16,
    Target17,
    Target18,
    Target19,
    Target20,
    Target21,
    Target22
  ]] =
    context =>
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context.append(v1.application(context), v2.application(context))(Plus.item2Plus),
                context.append(v3.application(context), v4.application(context))(Plus.item2Plus)
              )(Plus.item2Plus),
              context.append(
                context.append(v5.application(context), v6.application(context))(Plus.item2Plus),
                context.append(v7.application(context), v8.application(context))(Plus.item2Plus)
              )(Plus.item2Plus)
            )(Plus.item2Plus),
            context.append(
              context.append(
                context.append(v9.application(context), v10.application(context))(Plus.item2Plus),
                context.append(v11.application(context), v12.application(context))(Plus.item2Plus)
              )(Plus.item2Plus),
              context.append(
                context.append(v13.application(context), v14.application(context))(Plus.item2Plus),
                context.append(v15.application(context), v16.application(context))(Plus.item2Plus)
              )(Plus.item2Plus)
            )(Plus.item2Plus)
          )(Plus.item2Plus),
          context.append(
            context.append(
              context.append(v17.application(context), v18.application(context))(Plus.item2Plus),
              context.append(v19.application(context), v20.application(context))(Plus.item2Plus)
            )(Plus.item2Plus),
            v21.application(context)
          )(Plus.item2Plus)
        )(Plus.item2Plus),
        v22.application(context)
      )(Tuple22Plus.tuple22Plus21)
}
object TupleHelper extends TupleHelper
