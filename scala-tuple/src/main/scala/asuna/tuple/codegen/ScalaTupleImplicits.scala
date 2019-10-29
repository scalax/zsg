package asuna.tuple
import asuna.tuple.tupleSupport.ScalaTupleHListTypeHList
import asuna.tuple.tupleSupport.ScalaTupleHListTypeHListPlus
import asuna.tuple.tupleSupport.HListToScalaTupleTypeHListPlus
import asuna.TypeHList
import asuna.Application
import asuna.KindContext
import asuna.Context
import asuna.TupleTypeHList0
class ScalaTupleImplicits {
  implicit def scalaTupleImplicit2[K <: KindContext, H1, H2, T1 <: TypeHList, T2 <: TypeHList](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2]
  ): Application[K, (H1, H2), ScalaTupleTypeHList2[T1, T2]] =
    new Application[K, (H1, H2), ScalaTupleTypeHList2[T1, T2]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList2[T1, T2]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T2], T1, ScalaTupleTypeHList2[T1, T2]](
          context.append[TupleTypeHList0, T2, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T2]](
            context.start,
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus1
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put2
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit3[K <: KindContext, H1, H2, H3, T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3]
  ): Application[K, (H1, H2, H3), ScalaTupleTypeHList3[T1, T2, T3]] =
    new Application[K, (H1, H2, H3), ScalaTupleTypeHList3[T1, T2, T3]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList3[T1, T2, T3]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T3, T2], T1, ScalaTupleTypeHList3[T1, T2, T3]](
          context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T3], T2, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T3, T2]](
            context.append[TupleTypeHList0, T3, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T3]](
              context.start,
              t3.application(context),
              ScalaTupleHListTypeHListPlus.plus1
            ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus2
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put3
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit4[K <: KindContext, H1, H2, H3, H4, T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4]
  ): Application[K, (H1, H2, H3, H4), ScalaTupleTypeHList4[T1, T2, T3, T4]] =
    new Application[K, (H1, H2, H3, H4), ScalaTupleTypeHList4[T1, T2, T3, T4]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList4[T1, T2, T3, T4]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T4, T3, T2], T1, ScalaTupleTypeHList4[T1, T2, T3, T4]](
          context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T4, T3], T2, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T4, T3, T2]](
            context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T4], T3, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T4, T3]](
              context.append[TupleTypeHList0, T4, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T4]](
                context.start,
                t4.application(context),
                ScalaTupleHListTypeHListPlus.plus1
              ),
              t3.application(context),
              ScalaTupleHListTypeHListPlus.plus2
            ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus3
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put4
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit5[K <: KindContext, H1, H2, H3, H4, H5, T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5]
  ): Application[K, (H1, H2, H3, H4, H5), ScalaTupleTypeHList5[T1, T2, T3, T4, T5]] =
    new Application[K, (H1, H2, H3, H4, H5), ScalaTupleTypeHList5[T1, T2, T3, T4, T5]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList5[T1, T2, T3, T4, T5]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T5, T4, T3, T2], T1, ScalaTupleTypeHList5[T1, T2, T3, T4, T5]](
          context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T5, T4, T3], T2, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T5, T4, T3, T2]](
            context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T5, T4], T3, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T5, T4, T3]](
              context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T5], T4, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T5, T4]](
                context.append[TupleTypeHList0, T5, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T5]](
                  context.start,
                  t5.application(context),
                  ScalaTupleHListTypeHListPlus.plus1
                ),
                t4.application(context),
                ScalaTupleHListTypeHListPlus.plus2
              ),
              t3.application(context),
              ScalaTupleHListTypeHListPlus.plus3
            ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus4
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put5
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit6[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6]
  ): Application[K, (H1, H2, H3, H4, H5, H6), ScalaTupleTypeHList6[T1, T2, T3, T4, T5, T6]] =
    new Application[K, (H1, H2, H3, H4, H5, H6), ScalaTupleTypeHList6[T1, T2, T3, T4, T5, T6]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList6[T1, T2, T3, T4, T5, T6]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList6[T1, T2, T3, T4, T5, T6]](
          context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T6, T5, T4, T3], T2, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T6, T5, T4, T3, T2]](
            context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T6, T5, T4], T3, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T6, T5, T4, T3]](
              context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T6, T5], T4, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T6, T5, T4]](
                context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T6], T5, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T6, T5]](
                  context.append[TupleTypeHList0, T6, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T6]](
                    context.start,
                    t6.application(context),
                    ScalaTupleHListTypeHListPlus.plus1
                  ),
                  t5.application(context),
                  ScalaTupleHListTypeHListPlus.plus2
                ),
                t4.application(context),
                ScalaTupleHListTypeHListPlus.plus3
              ),
              t3.application(context),
              ScalaTupleHListTypeHListPlus.plus4
            ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus5
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put6
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit7[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7), ScalaTupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7), ScalaTupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]](
          context.append[
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T7, T6, T5, T4, T3],
            T2,
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T7, T6, T5, T4, T3, T2]
          ](
            context
              .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T7, T6, T5, T4], T3, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T7, T6, T5, T4, T3]](
                context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T7, T6, T5], T4, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T7, T6, T5, T4]](
                  context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T7, T6], T5, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T7, T6, T5]](
                    context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T7], T6, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T7, T6]](
                      context.append[TupleTypeHList0, T7, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T7]](
                        context.start,
                        t7.application(context),
                        ScalaTupleHListTypeHListPlus.plus1
                      ),
                      t6.application(context),
                      ScalaTupleHListTypeHListPlus.plus2
                    ),
                    t5.application(context),
                    ScalaTupleHListTypeHListPlus.plus3
                  ),
                  t4.application(context),
                  ScalaTupleHListTypeHListPlus.plus4
                ),
                t3.application(context),
                ScalaTupleHListTypeHListPlus.plus5
              ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus6
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put7
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit8[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8), ScalaTupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8), ScalaTupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T8, T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]](
          context.append[
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T8, T7, T6, T5, T4, T3],
            T2,
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T8, T7, T6, T5, T4, T3, T2]
          ](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T8, T7, T6, T5, T4],
              T3,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T8, T7, T6, T5, T4, T3]
            ](
              context
                .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T8, T7, T6, T5], T4, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T8, T7, T6, T5, T4]](
                  context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T8, T7, T6], T5, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T8, T7, T6, T5]](
                    context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T8, T7], T6, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T8, T7, T6]](
                      context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T8], T7, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T8, T7]](
                        context.append[TupleTypeHList0, T8, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T8]](
                          context.start,
                          t8.application(context),
                          ScalaTupleHListTypeHListPlus.plus1
                        ),
                        t7.application(context),
                        ScalaTupleHListTypeHListPlus.plus2
                      ),
                      t6.application(context),
                      ScalaTupleHListTypeHListPlus.plus3
                    ),
                    t5.application(context),
                    ScalaTupleHListTypeHListPlus.plus4
                  ),
                  t4.application(context),
                  ScalaTupleHListTypeHListPlus.plus5
                ),
              t3.application(context),
              ScalaTupleHListTypeHListPlus.plus6
            ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus7
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put8
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit9[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9), ScalaTupleTypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9), ScalaTupleTypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T9, T8, T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9]](
          context.append[
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T9, T8, T7, T6, T5, T4, T3],
            T2,
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T9, T8, T7, T6, T5, T4, T3, T2]
          ](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T9, T8, T7, T6, T5, T4],
              T3,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T9, T8, T7, T6, T5, T4, T3]
            ](
              context.append[
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T9, T8, T7, T6, T5],
                T4,
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T9, T8, T7, T6, T5, T4]
              ](
                context
                  .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T9, T8, T7, T6], T5, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T9, T8, T7, T6, T5]](
                    context
                      .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T9, T8, T7], T6, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T9, T8, T7, T6]](
                        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T9, T8], T7, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T9, T8, T7]](
                          context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T9], T8, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T9, T8]](
                            context.append[TupleTypeHList0, T9, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T9]](
                              context.start,
                              t9.application(context),
                              ScalaTupleHListTypeHListPlus.plus1
                            ),
                            t8.application(context),
                            ScalaTupleHListTypeHListPlus.plus2
                          ),
                          t7.application(context),
                          ScalaTupleHListTypeHListPlus.plus3
                        ),
                        t6.application(context),
                        ScalaTupleHListTypeHListPlus.plus4
                      ),
                    t5.application(context),
                    ScalaTupleHListTypeHListPlus.plus5
                  ),
                t4.application(context),
                ScalaTupleHListTypeHListPlus.plus6
              ),
              t3.application(context),
              ScalaTupleHListTypeHListPlus.plus7
            ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus8
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put9
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit10[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10), ScalaTupleTypeHList10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10), ScalaTupleTypeHList10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T10, T9, T8, T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList10[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10
        ]](
          context.append[
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T10, T9, T8, T7, T6, T5, T4, T3],
            T2,
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T10, T9, T8, T7, T6, T5, T4, T3, T2]
          ](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T10, T9, T8, T7, T6, T5, T4],
              T3,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T10, T9, T8, T7, T6, T5, T4, T3]
            ](
              context.append[
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T10, T9, T8, T7, T6, T5],
                T4,
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T10, T9, T8, T7, T6, T5, T4]
              ](
                context.append[
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T10, T9, T8, T7, T6],
                  T5,
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T10, T9, T8, T7, T6, T5]
                ](
                  context.append[
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T10, T9, T8, T7],
                    T6,
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T10, T9, T8, T7, T6]
                  ](
                    context
                      .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T10, T9, T8], T7, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T10, T9, T8, T7]](
                        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T10, T9], T8, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T10, T9, T8]](
                          context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T10], T9, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T10, T9]](
                            context.append[TupleTypeHList0, T10, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T10]](
                              context.start,
                              t10.application(context),
                              ScalaTupleHListTypeHListPlus.plus1
                            ),
                            t9.application(context),
                            ScalaTupleHListTypeHListPlus.plus2
                          ),
                          t8.application(context),
                          ScalaTupleHListTypeHListPlus.plus3
                        ),
                        t7.application(context),
                        ScalaTupleHListTypeHListPlus.plus4
                      ),
                    t6.application(context),
                    ScalaTupleHListTypeHListPlus.plus5
                  ),
                  t5.application(context),
                  ScalaTupleHListTypeHListPlus.plus6
                ),
                t4.application(context),
                ScalaTupleHListTypeHListPlus.plus7
              ),
              t3.application(context),
              ScalaTupleHListTypeHListPlus.plus8
            ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus9
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put10
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit11[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11), ScalaTupleTypeHList11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11), ScalaTupleTypeHList11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T11, T10, T9, T8, T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList11[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11
        ]](
          context.append[
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T11, T10, T9, T8, T7, T6, T5, T4, T3],
            T2,
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T11, T10, T9, T8, T7, T6, T5, T4, T3, T2]
          ](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T11, T10, T9, T8, T7, T6, T5, T4],
              T3,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T11, T10, T9, T8, T7, T6, T5, T4, T3]
            ](
              context.append[
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T11, T10, T9, T8, T7, T6, T5],
                T4,
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T11, T10, T9, T8, T7, T6, T5, T4]
              ](
                context.append[
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T11, T10, T9, T8, T7, T6],
                  T5,
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T11, T10, T9, T8, T7, T6, T5]
                ](
                  context.append[
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T11, T10, T9, T8, T7],
                    T6,
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T11, T10, T9, T8, T7, T6]
                  ](
                    context.append[
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T11, T10, T9, T8],
                      T7,
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T11, T10, T9, T8, T7]
                    ](
                      context.append[
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T11, T10, T9],
                        T8,
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T11, T10, T9, T8]
                      ](
                        context
                          .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T11, T10], T9, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T11, T10, T9]](
                            context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T11], T10, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T11, T10]](
                              context.append[TupleTypeHList0, T11, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T11]](
                                context.start,
                                t11.application(context),
                                ScalaTupleHListTypeHListPlus.plus1
                              ),
                              t10.application(context),
                              ScalaTupleHListTypeHListPlus.plus2
                            ),
                            t9.application(context),
                            ScalaTupleHListTypeHListPlus.plus3
                          ),
                        t8.application(context),
                        ScalaTupleHListTypeHListPlus.plus4
                      ),
                      t7.application(context),
                      ScalaTupleHListTypeHListPlus.plus5
                    ),
                    t6.application(context),
                    ScalaTupleHListTypeHListPlus.plus6
                  ),
                  t5.application(context),
                  ScalaTupleHListTypeHListPlus.plus7
                ),
                t4.application(context),
                ScalaTupleHListTypeHListPlus.plus8
              ),
              t3.application(context),
              ScalaTupleHListTypeHListPlus.plus9
            ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus10
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put11
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit12[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12), ScalaTupleTypeHList12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12), ScalaTupleTypeHList12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList12[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12
        ]](
          context.append[
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
            T2,
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2]
          ](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T12, T11, T10, T9, T8, T7, T6, T5, T4],
              T3,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T12, T11, T10, T9, T8, T7, T6, T5, T4, T3]
            ](
              context.append[
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T12, T11, T10, T9, T8, T7, T6, T5],
                T4,
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T12, T11, T10, T9, T8, T7, T6, T5, T4]
              ](
                context.append[
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T12, T11, T10, T9, T8, T7, T6],
                  T5,
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T12, T11, T10, T9, T8, T7, T6, T5]
                ](
                  context.append[
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T12, T11, T10, T9, T8, T7],
                    T6,
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T12, T11, T10, T9, T8, T7, T6]
                  ](
                    context.append[
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T12, T11, T10, T9, T8],
                      T7,
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T12, T11, T10, T9, T8, T7]
                    ](
                      context.append[
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T12, T11, T10, T9],
                        T8,
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T12, T11, T10, T9, T8]
                      ](
                        context.append[
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T12, T11, T10],
                          T9,
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T12, T11, T10, T9]
                        ](
                          context
                            .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T12, T11], T10, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T12, T11, T10]](
                              context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T12], T11, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T12, T11]](
                                context.append[TupleTypeHList0, T12, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T12]](
                                  context.start,
                                  t12.application(context),
                                  ScalaTupleHListTypeHListPlus.plus1
                                ),
                                t11.application(context),
                                ScalaTupleHListTypeHListPlus.plus2
                              ),
                              t10.application(context),
                              ScalaTupleHListTypeHListPlus.plus3
                            ),
                          t9.application(context),
                          ScalaTupleHListTypeHListPlus.plus4
                        ),
                        t8.application(context),
                        ScalaTupleHListTypeHListPlus.plus5
                      ),
                      t7.application(context),
                      ScalaTupleHListTypeHListPlus.plus6
                    ),
                    t6.application(context),
                    ScalaTupleHListTypeHListPlus.plus7
                  ),
                  t5.application(context),
                  ScalaTupleHListTypeHListPlus.plus8
                ),
                t4.application(context),
                ScalaTupleHListTypeHListPlus.plus9
              ),
              t3.application(context),
              ScalaTupleHListTypeHListPlus.plus10
            ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus11
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put12
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit13[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13), ScalaTupleTypeHList13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13), ScalaTupleTypeHList13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList13[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13
        ]](
          context.append[
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
            T2,
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2]
          ](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
              T3,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3]
            ](
              context.append[
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T13, T12, T11, T10, T9, T8, T7, T6, T5],
                T4,
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T13, T12, T11, T10, T9, T8, T7, T6, T5, T4]
              ](
                context.append[
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T13, T12, T11, T10, T9, T8, T7, T6],
                  T5,
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T13, T12, T11, T10, T9, T8, T7, T6, T5]
                ](
                  context.append[
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T13, T12, T11, T10, T9, T8, T7],
                    T6,
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T13, T12, T11, T10, T9, T8, T7, T6]
                  ](
                    context.append[
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T13, T12, T11, T10, T9, T8],
                      T7,
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T13, T12, T11, T10, T9, T8, T7]
                    ](
                      context.append[
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T13, T12, T11, T10, T9],
                        T8,
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T13, T12, T11, T10, T9, T8]
                      ](
                        context.append[
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T13, T12, T11, T10],
                          T9,
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T13, T12, T11, T10, T9]
                        ](
                          context.append[
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T13, T12, T11],
                            T10,
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T13, T12, T11, T10]
                          ](
                            context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T13, T12], T11, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[
                              T13,
                              T12,
                              T11
                            ]](
                              context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T13], T12, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T13, T12]](
                                context.append[TupleTypeHList0, T13, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T13]](
                                  context.start,
                                  t13.application(context),
                                  ScalaTupleHListTypeHListPlus.plus1
                                ),
                                t12.application(context),
                                ScalaTupleHListTypeHListPlus.plus2
                              ),
                              t11.application(context),
                              ScalaTupleHListTypeHListPlus.plus3
                            ),
                            t10.application(context),
                            ScalaTupleHListTypeHListPlus.plus4
                          ),
                          t9.application(context),
                          ScalaTupleHListTypeHListPlus.plus5
                        ),
                        t8.application(context),
                        ScalaTupleHListTypeHListPlus.plus6
                      ),
                      t7.application(context),
                      ScalaTupleHListTypeHListPlus.plus7
                    ),
                    t6.application(context),
                    ScalaTupleHListTypeHListPlus.plus8
                  ),
                  t5.application(context),
                  ScalaTupleHListTypeHListPlus.plus9
                ),
                t4.application(context),
                ScalaTupleHListTypeHListPlus.plus10
              ),
              t3.application(context),
              ScalaTupleHListTypeHListPlus.plus11
            ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus12
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put13
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit14[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14), ScalaTupleTypeHList14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14), ScalaTupleTypeHList14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList14[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14
        ]](
          context.append[
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
            T2,
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2]
          ](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
              T3,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3]
            ](
              context.append[
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
                T4,
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4]
              ](
                context.append[
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T14, T13, T12, T11, T10, T9, T8, T7, T6],
                  T5,
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T14, T13, T12, T11, T10, T9, T8, T7, T6, T5]
                ](
                  context.append[
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T14, T13, T12, T11, T10, T9, T8, T7],
                    T6,
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T14, T13, T12, T11, T10, T9, T8, T7, T6]
                  ](
                    context.append[
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T14, T13, T12, T11, T10, T9, T8],
                      T7,
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T14, T13, T12, T11, T10, T9, T8, T7]
                    ](
                      context.append[
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T14, T13, T12, T11, T10, T9],
                        T8,
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T14, T13, T12, T11, T10, T9, T8]
                      ](
                        context.append[
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T14, T13, T12, T11, T10],
                          T9,
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T14, T13, T12, T11, T10, T9]
                        ](
                          context.append[
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T14, T13, T12, T11],
                            T10,
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T14, T13, T12, T11, T10]
                          ](
                            context.append[
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T14, T13, T12],
                              T11,
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T14, T13, T12, T11]
                            ](
                              context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T14, T13], T12, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[
                                T14,
                                T13,
                                T12
                              ]](
                                context
                                  .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T14], T13, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T14, T13]](
                                    context.append[TupleTypeHList0, T14, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T14]](
                                      context.start,
                                      t14.application(context),
                                      ScalaTupleHListTypeHListPlus.plus1
                                    ),
                                    t13.application(context),
                                    ScalaTupleHListTypeHListPlus.plus2
                                  ),
                                t12.application(context),
                                ScalaTupleHListTypeHListPlus.plus3
                              ),
                              t11.application(context),
                              ScalaTupleHListTypeHListPlus.plus4
                            ),
                            t10.application(context),
                            ScalaTupleHListTypeHListPlus.plus5
                          ),
                          t9.application(context),
                          ScalaTupleHListTypeHListPlus.plus6
                        ),
                        t8.application(context),
                        ScalaTupleHListTypeHListPlus.plus7
                      ),
                      t7.application(context),
                      ScalaTupleHListTypeHListPlus.plus8
                    ),
                    t6.application(context),
                    ScalaTupleHListTypeHListPlus.plus9
                  ),
                  t5.application(context),
                  ScalaTupleHListTypeHListPlus.plus10
                ),
                t4.application(context),
                ScalaTupleHListTypeHListPlus.plus11
              ),
              t3.application(context),
              ScalaTupleHListTypeHListPlus.plus12
            ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus13
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put14
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit15[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15), ScalaTupleTypeHList15[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15),
      ScalaTupleTypeHList15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
    ] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList15[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15
        ]](
          context.append[
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
            T2,
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2]
          ](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
              T3,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3]
            ](
              context.append[
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
                T4,
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4]
              ](
                context.append[
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
                  T5,
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5]
                ](
                  context.append[
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T15, T14, T13, T12, T11, T10, T9, T8, T7],
                    T6,
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6]
                  ](
                    context.append[
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T15, T14, T13, T12, T11, T10, T9, T8],
                      T7,
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T15, T14, T13, T12, T11, T10, T9, T8, T7]
                    ](
                      context.append[
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T15, T14, T13, T12, T11, T10, T9],
                        T8,
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T15, T14, T13, T12, T11, T10, T9, T8]
                      ](
                        context.append[
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T15, T14, T13, T12, T11, T10],
                          T9,
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T15, T14, T13, T12, T11, T10, T9]
                        ](
                          context.append[
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T15, T14, T13, T12, T11],
                            T10,
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T15, T14, T13, T12, T11, T10]
                          ](
                            context.append[
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T15, T14, T13, T12],
                              T11,
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T15, T14, T13, T12, T11]
                            ](
                              context.append[
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T15, T14, T13],
                                T12,
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T15, T14, T13, T12]
                              ](
                                context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T15, T14], T13, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[
                                  T15,
                                  T14,
                                  T13
                                ]](
                                  context
                                    .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T15], T14, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T15, T14]](
                                      context.append[TupleTypeHList0, T15, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T15]](
                                        context.start,
                                        t15.application(context),
                                        ScalaTupleHListTypeHListPlus.plus1
                                      ),
                                      t14.application(context),
                                      ScalaTupleHListTypeHListPlus.plus2
                                    ),
                                  t13.application(context),
                                  ScalaTupleHListTypeHListPlus.plus3
                                ),
                                t12.application(context),
                                ScalaTupleHListTypeHListPlus.plus4
                              ),
                              t11.application(context),
                              ScalaTupleHListTypeHListPlus.plus5
                            ),
                            t10.application(context),
                            ScalaTupleHListTypeHListPlus.plus6
                          ),
                          t9.application(context),
                          ScalaTupleHListTypeHListPlus.plus7
                        ),
                        t8.application(context),
                        ScalaTupleHListTypeHListPlus.plus8
                      ),
                      t7.application(context),
                      ScalaTupleHListTypeHListPlus.plus9
                    ),
                    t6.application(context),
                    ScalaTupleHListTypeHListPlus.plus10
                  ),
                  t5.application(context),
                  ScalaTupleHListTypeHListPlus.plus11
                ),
                t4.application(context),
                ScalaTupleHListTypeHListPlus.plus12
              ),
              t3.application(context),
              ScalaTupleHListTypeHListPlus.plus13
            ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus14
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put15
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit16[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList,
    T16 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15],
    t16: Application[K, H16, T16]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16), ScalaTupleTypeHList16[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16),
      ScalaTupleTypeHList16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
    ] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList16[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16
        ]](
          context.append[
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
            T2,
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2]
          ](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
              T3,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3]
            ](
              context.append[
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
                T4,
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4]
              ](
                context.append[
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
                  T5,
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5]
                ](
                  context.append[
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7],
                    T6,
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6]
                  ](
                    context.append[
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T16, T15, T14, T13, T12, T11, T10, T9, T8],
                      T7,
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7]
                    ](
                      context.append[
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T16, T15, T14, T13, T12, T11, T10, T9],
                        T8,
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T16, T15, T14, T13, T12, T11, T10, T9, T8]
                      ](
                        context.append[
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T16, T15, T14, T13, T12, T11, T10],
                          T9,
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T16, T15, T14, T13, T12, T11, T10, T9]
                        ](
                          context.append[
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T16, T15, T14, T13, T12, T11],
                            T10,
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T16, T15, T14, T13, T12, T11, T10]
                          ](
                            context.append[
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T16, T15, T14, T13, T12],
                              T11,
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T16, T15, T14, T13, T12, T11]
                            ](
                              context.append[
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T16, T15, T14, T13],
                                T12,
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T16, T15, T14, T13, T12]
                              ](
                                context.append[
                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T16, T15, T14],
                                  T13,
                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T16, T15, T14, T13]
                                ](
                                  context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T16, T15], T14, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[
                                    T16,
                                    T15,
                                    T14
                                  ]](
                                    context
                                      .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T16], T15, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T16, T15]](
                                        context.append[TupleTypeHList0, T16, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T16]](
                                          context.start,
                                          t16.application(context),
                                          ScalaTupleHListTypeHListPlus.plus1
                                        ),
                                        t15.application(context),
                                        ScalaTupleHListTypeHListPlus.plus2
                                      ),
                                    t14.application(context),
                                    ScalaTupleHListTypeHListPlus.plus3
                                  ),
                                  t13.application(context),
                                  ScalaTupleHListTypeHListPlus.plus4
                                ),
                                t12.application(context),
                                ScalaTupleHListTypeHListPlus.plus5
                              ),
                              t11.application(context),
                              ScalaTupleHListTypeHListPlus.plus6
                            ),
                            t10.application(context),
                            ScalaTupleHListTypeHListPlus.plus7
                          ),
                          t9.application(context),
                          ScalaTupleHListTypeHListPlus.plus8
                        ),
                        t8.application(context),
                        ScalaTupleHListTypeHListPlus.plus9
                      ),
                      t7.application(context),
                      ScalaTupleHListTypeHListPlus.plus10
                    ),
                    t6.application(context),
                    ScalaTupleHListTypeHListPlus.plus11
                  ),
                  t5.application(context),
                  ScalaTupleHListTypeHListPlus.plus12
                ),
                t4.application(context),
                ScalaTupleHListTypeHListPlus.plus13
              ),
              t3.application(context),
              ScalaTupleHListTypeHListPlus.plus14
            ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus15
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put16
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit17[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    H17,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList,
    T16 <: TypeHList,
    T17 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15],
    t16: Application[K, H16, T16],
    t17: Application[K, H17, T17]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17), ScalaTupleTypeHList17[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17),
      ScalaTupleTypeHList17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
    ] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] = {
//if (context.isReverse) {
        context
          .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList17[
            T1,
            T2,
            T3,
            T4,
            T5,
            T6,
            T7,
            T8,
            T9,
            T10,
            T11,
            T12,
            T13,
            T14,
            T15,
            T16,
            T17
          ]](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
              T2,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2]
            ](
              context.append[
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
                T3,
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3]
              ](
                context.append[
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
                  T4,
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4]
                ](
                  context.append[
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
                    T5,
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5]
                  ](
                    context.append[
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7],
                      T6,
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6]
                    ](
                      context.append[
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8],
                        T7,
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7]
                      ](
                        context.append[
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T17, T16, T15, T14, T13, T12, T11, T10, T9],
                          T8,
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8]
                        ](
                          context.append[
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T17, T16, T15, T14, T13, T12, T11, T10],
                            T9,
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T17, T16, T15, T14, T13, T12, T11, T10, T9]
                          ](
                            context.append[
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T17, T16, T15, T14, T13, T12, T11],
                              T10,
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T17, T16, T15, T14, T13, T12, T11, T10]
                            ](
                              context.append[
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T17, T16, T15, T14, T13, T12],
                                T11,
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T17, T16, T15, T14, T13, T12, T11]
                              ](
                                context.append[
                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T17, T16, T15, T14, T13],
                                  T12,
                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T17, T16, T15, T14, T13, T12]
                                ](
                                  context.append[
                                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T17, T16, T15, T14],
                                    T13,
                                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T17, T16, T15, T14, T13]
                                  ](
                                    context.append[
                                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T17, T16, T15],
                                      T14,
                                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T17, T16, T15, T14]
                                    ](
                                      context.append[
                                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T17, T16],
                                        T15,
                                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T17, T16, T15]
                                      ](
                                        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T17], T16, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[
                                          T17,
                                          T16
                                        ]](
                                          context.append[TupleTypeHList0, T17, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T17]](
                                            context.start,
                                            t17.application(context),
                                            ScalaTupleHListTypeHListPlus.plus1
                                          ),
                                          t16.application(context),
                                          ScalaTupleHListTypeHListPlus.plus2
                                        ),
                                        t15.application(context),
                                        ScalaTupleHListTypeHListPlus.plus3
                                      ),
                                      t14.application(context),
                                      ScalaTupleHListTypeHListPlus.plus4
                                    ),
                                    t13.application(context),
                                    ScalaTupleHListTypeHListPlus.plus5
                                  ),
                                  t12.application(context),
                                  ScalaTupleHListTypeHListPlus.plus6
                                ),
                                t11.application(context),
                                ScalaTupleHListTypeHListPlus.plus7
                              ),
                              t10.application(context),
                              ScalaTupleHListTypeHListPlus.plus8
                            ),
                            t9.application(context),
                            ScalaTupleHListTypeHListPlus.plus9
                          ),
                          t8.application(context),
                          ScalaTupleHListTypeHListPlus.plus10
                        ),
                        t7.application(context),
                        ScalaTupleHListTypeHListPlus.plus11
                      ),
                      t6.application(context),
                      ScalaTupleHListTypeHListPlus.plus12
                    ),
                    t5.application(context),
                    ScalaTupleHListTypeHListPlus.plus13
                  ),
                  t4.application(context),
                  ScalaTupleHListTypeHListPlus.plus14
                ),
                t3.application(context),
                ScalaTupleHListTypeHListPlus.plus15
              ),
              t2.application(context),
              ScalaTupleHListTypeHListPlus.plus16
            ),
            t1.application(context),
            HListToScalaTupleTypeHListPlus.put17
          )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit18[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    H17,
    H18,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList,
    T16 <: TypeHList,
    T17 <: TypeHList,
    T18 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15],
    t16: Application[K, H16, T16],
    t17: Application[K, H17, T17],
    t18: Application[K, H18, T18]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18), ScalaTupleTypeHList18[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18),
      ScalaTupleTypeHList18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
    ] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] = {
//if (context.isReverse) {
        context
          .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList17[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList18[
            T1,
            T2,
            T3,
            T4,
            T5,
            T6,
            T7,
            T8,
            T9,
            T10,
            T11,
            T12,
            T13,
            T14,
            T15,
            T16,
            T17,
            T18
          ]](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
              T2,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList17[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2]
            ](
              context.append[
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
                T3,
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3]
              ](
                context.append[
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
                  T4,
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4]
                ](
                  context.append[
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
                    T5,
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5]
                  ](
                    context.append[
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7],
                      T6,
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6]
                    ](
                      context.append[
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8],
                        T7,
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7]
                      ](
                        context.append[
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9],
                          T8,
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8]
                        ](
                          context.append[
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T18, T17, T16, T15, T14, T13, T12, T11, T10],
                            T9,
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9]
                          ](
                            context.append[
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T18, T17, T16, T15, T14, T13, T12, T11],
                              T10,
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T18, T17, T16, T15, T14, T13, T12, T11, T10]
                            ](
                              context.append[
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T18, T17, T16, T15, T14, T13, T12],
                                T11,
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T18, T17, T16, T15, T14, T13, T12, T11]
                              ](
                                context.append[
                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T18, T17, T16, T15, T14, T13],
                                  T12,
                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T18, T17, T16, T15, T14, T13, T12]
                                ](
                                  context.append[
                                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T18, T17, T16, T15, T14],
                                    T13,
                                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T18, T17, T16, T15, T14, T13]
                                  ](
                                    context.append[
                                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T18, T17, T16, T15],
                                      T14,
                                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T18, T17, T16, T15, T14]
                                    ](
                                      context.append[
                                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T18, T17, T16],
                                        T15,
                                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T18, T17, T16, T15]
                                      ](
                                        context.append[
                                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T18, T17],
                                          T16,
                                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T18, T17, T16]
                                        ](
                                          context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T18], T17, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[
                                            T18,
                                            T17
                                          ]](
                                            context.append[TupleTypeHList0, T18, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T18]](
                                              context.start,
                                              t18.application(context),
                                              ScalaTupleHListTypeHListPlus.plus1
                                            ),
                                            t17.application(context),
                                            ScalaTupleHListTypeHListPlus.plus2
                                          ),
                                          t16.application(context),
                                          ScalaTupleHListTypeHListPlus.plus3
                                        ),
                                        t15.application(context),
                                        ScalaTupleHListTypeHListPlus.plus4
                                      ),
                                      t14.application(context),
                                      ScalaTupleHListTypeHListPlus.plus5
                                    ),
                                    t13.application(context),
                                    ScalaTupleHListTypeHListPlus.plus6
                                  ),
                                  t12.application(context),
                                  ScalaTupleHListTypeHListPlus.plus7
                                ),
                                t11.application(context),
                                ScalaTupleHListTypeHListPlus.plus8
                              ),
                              t10.application(context),
                              ScalaTupleHListTypeHListPlus.plus9
                            ),
                            t9.application(context),
                            ScalaTupleHListTypeHListPlus.plus10
                          ),
                          t8.application(context),
                          ScalaTupleHListTypeHListPlus.plus11
                        ),
                        t7.application(context),
                        ScalaTupleHListTypeHListPlus.plus12
                      ),
                      t6.application(context),
                      ScalaTupleHListTypeHListPlus.plus13
                    ),
                    t5.application(context),
                    ScalaTupleHListTypeHListPlus.plus14
                  ),
                  t4.application(context),
                  ScalaTupleHListTypeHListPlus.plus15
                ),
                t3.application(context),
                ScalaTupleHListTypeHListPlus.plus16
              ),
              t2.application(context),
              ScalaTupleHListTypeHListPlus.plus17
            ),
            t1.application(context),
            HListToScalaTupleTypeHListPlus.put18
          )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit19[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    H17,
    H18,
    H19,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList,
    T16 <: TypeHList,
    T17 <: TypeHList,
    T18 <: TypeHList,
    T19 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15],
    t16: Application[K, H16, T16],
    t17: Application[K, H17, T17],
    t18: Application[K, H18, T18],
    t19: Application[K, H19, T19]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19), ScalaTupleTypeHList19[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19),
      ScalaTupleTypeHList19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
    ] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] = {
//if (context.isReverse) {
        context
          .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList18[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList19[
            T1,
            T2,
            T3,
            T4,
            T5,
            T6,
            T7,
            T8,
            T9,
            T10,
            T11,
            T12,
            T13,
            T14,
            T15,
            T16,
            T17,
            T18,
            T19
          ]](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList17[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
              T2,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList18[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2]
            ](
              context.append[
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
                T3,
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList17[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3]
              ](
                context.append[
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
                  T4,
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4]
                ](
                  context.append[
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
                    T5,
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5]
                  ](
                    context.append[
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7],
                      T6,
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6]
                    ](
                      context.append[
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8],
                        T7,
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7]
                      ](
                        context.append[
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9],
                          T8,
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8]
                        ](
                          context.append[
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10],
                            T9,
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9]
                          ](
                            context.append[
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T19, T18, T17, T16, T15, T14, T13, T12, T11],
                              T10,
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10]
                            ](
                              context.append[
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T19, T18, T17, T16, T15, T14, T13, T12],
                                T11,
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T19, T18, T17, T16, T15, T14, T13, T12, T11]
                              ](
                                context.append[
                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T19, T18, T17, T16, T15, T14, T13],
                                  T12,
                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T19, T18, T17, T16, T15, T14, T13, T12]
                                ](
                                  context.append[
                                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T19, T18, T17, T16, T15, T14],
                                    T13,
                                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T19, T18, T17, T16, T15, T14, T13]
                                  ](
                                    context.append[
                                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T19, T18, T17, T16, T15],
                                      T14,
                                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T19, T18, T17, T16, T15, T14]
                                    ](
                                      context.append[
                                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T19, T18, T17, T16],
                                        T15,
                                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T19, T18, T17, T16, T15]
                                      ](
                                        context.append[
                                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T19, T18, T17],
                                          T16,
                                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T19, T18, T17, T16]
                                        ](
                                          context.append[
                                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T19, T18],
                                            T17,
                                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T19, T18, T17]
                                          ](
                                            context.append[
                                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T19],
                                              T18,
                                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T19, T18]
                                            ](
                                              context.append[TupleTypeHList0, T19, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T19]](
                                                context.start,
                                                t19.application(context),
                                                ScalaTupleHListTypeHListPlus.plus1
                                              ),
                                              t18.application(context),
                                              ScalaTupleHListTypeHListPlus.plus2
                                            ),
                                            t17.application(context),
                                            ScalaTupleHListTypeHListPlus.plus3
                                          ),
                                          t16.application(context),
                                          ScalaTupleHListTypeHListPlus.plus4
                                        ),
                                        t15.application(context),
                                        ScalaTupleHListTypeHListPlus.plus5
                                      ),
                                      t14.application(context),
                                      ScalaTupleHListTypeHListPlus.plus6
                                    ),
                                    t13.application(context),
                                    ScalaTupleHListTypeHListPlus.plus7
                                  ),
                                  t12.application(context),
                                  ScalaTupleHListTypeHListPlus.plus8
                                ),
                                t11.application(context),
                                ScalaTupleHListTypeHListPlus.plus9
                              ),
                              t10.application(context),
                              ScalaTupleHListTypeHListPlus.plus10
                            ),
                            t9.application(context),
                            ScalaTupleHListTypeHListPlus.plus11
                          ),
                          t8.application(context),
                          ScalaTupleHListTypeHListPlus.plus12
                        ),
                        t7.application(context),
                        ScalaTupleHListTypeHListPlus.plus13
                      ),
                      t6.application(context),
                      ScalaTupleHListTypeHListPlus.plus14
                    ),
                    t5.application(context),
                    ScalaTupleHListTypeHListPlus.plus15
                  ),
                  t4.application(context),
                  ScalaTupleHListTypeHListPlus.plus16
                ),
                t3.application(context),
                ScalaTupleHListTypeHListPlus.plus17
              ),
              t2.application(context),
              ScalaTupleHListTypeHListPlus.plus18
            ),
            t1.application(context),
            HListToScalaTupleTypeHListPlus.put19
          )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit20[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    H17,
    H18,
    H19,
    H20,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList,
    T16 <: TypeHList,
    T17 <: TypeHList,
    T18 <: TypeHList,
    T19 <: TypeHList,
    T20 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15],
    t16: Application[K, H16, T16],
    t17: Application[K, H17, T17],
    t18: Application[K, H18, T18],
    t19: Application[K, H19, T19],
    t20: Application[K, H20, T20]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20), ScalaTupleTypeHList20[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20),
      ScalaTupleTypeHList20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
    ] {
      override def application(
        context: Context[K]
      ): K#M[ScalaTupleTypeHList20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] = {
//if (context.isReverse) {
        context
          .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList19[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList20[
            T1,
            T2,
            T3,
            T4,
            T5,
            T6,
            T7,
            T8,
            T9,
            T10,
            T11,
            T12,
            T13,
            T14,
            T15,
            T16,
            T17,
            T18,
            T19,
            T20
          ]](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList18[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
              T2,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList19[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2]
            ](
              context.append[
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList17[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
                T3,
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList18[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3]
              ](
                context.append[
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
                  T4,
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList17[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4]
                ](
                  context.append[
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
                    T5,
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5]
                  ](
                    context.append[
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7],
                      T6,
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6]
                    ](
                      context.append[
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8],
                        T7,
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7]
                      ](
                        context.append[
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9],
                          T8,
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8]
                        ](
                          context.append[
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10],
                            T9,
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9]
                          ](
                            context.append[
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11],
                              T10,
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10]
                            ](
                              context.append[
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T20, T19, T18, T17, T16, T15, T14, T13, T12],
                                T11,
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11]
                              ](
                                context.append[
                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T20, T19, T18, T17, T16, T15, T14, T13],
                                  T12,
                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T20, T19, T18, T17, T16, T15, T14, T13, T12]
                                ](
                                  context.append[
                                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T20, T19, T18, T17, T16, T15, T14],
                                    T13,
                                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T20, T19, T18, T17, T16, T15, T14, T13]
                                  ](
                                    context.append[
                                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T20, T19, T18, T17, T16, T15],
                                      T14,
                                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T20, T19, T18, T17, T16, T15, T14]
                                    ](
                                      context.append[
                                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T20, T19, T18, T17, T16],
                                        T15,
                                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T20, T19, T18, T17, T16, T15]
                                      ](
                                        context.append[
                                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T20, T19, T18, T17],
                                          T16,
                                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T20, T19, T18, T17, T16]
                                        ](
                                          context.append[
                                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T20, T19, T18],
                                            T17,
                                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T20, T19, T18, T17]
                                          ](
                                            context.append[
                                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T20, T19],
                                              T18,
                                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T20, T19, T18]
                                            ](
                                              context.append[
                                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T20],
                                                T19,
                                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T20, T19]
                                              ](
                                                context.append[TupleTypeHList0, T20, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T20]](
                                                  context.start,
                                                  t20.application(context),
                                                  ScalaTupleHListTypeHListPlus.plus1
                                                ),
                                                t19.application(context),
                                                ScalaTupleHListTypeHListPlus.plus2
                                              ),
                                              t18.application(context),
                                              ScalaTupleHListTypeHListPlus.plus3
                                            ),
                                            t17.application(context),
                                            ScalaTupleHListTypeHListPlus.plus4
                                          ),
                                          t16.application(context),
                                          ScalaTupleHListTypeHListPlus.plus5
                                        ),
                                        t15.application(context),
                                        ScalaTupleHListTypeHListPlus.plus6
                                      ),
                                      t14.application(context),
                                      ScalaTupleHListTypeHListPlus.plus7
                                    ),
                                    t13.application(context),
                                    ScalaTupleHListTypeHListPlus.plus8
                                  ),
                                  t12.application(context),
                                  ScalaTupleHListTypeHListPlus.plus9
                                ),
                                t11.application(context),
                                ScalaTupleHListTypeHListPlus.plus10
                              ),
                              t10.application(context),
                              ScalaTupleHListTypeHListPlus.plus11
                            ),
                            t9.application(context),
                            ScalaTupleHListTypeHListPlus.plus12
                          ),
                          t8.application(context),
                          ScalaTupleHListTypeHListPlus.plus13
                        ),
                        t7.application(context),
                        ScalaTupleHListTypeHListPlus.plus14
                      ),
                      t6.application(context),
                      ScalaTupleHListTypeHListPlus.plus15
                    ),
                    t5.application(context),
                    ScalaTupleHListTypeHListPlus.plus16
                  ),
                  t4.application(context),
                  ScalaTupleHListTypeHListPlus.plus17
                ),
                t3.application(context),
                ScalaTupleHListTypeHListPlus.plus18
              ),
              t2.application(context),
              ScalaTupleHListTypeHListPlus.plus19
            ),
            t1.application(context),
            HListToScalaTupleTypeHListPlus.put20
          )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit21[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    H17,
    H18,
    H19,
    H20,
    H21,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList,
    T16 <: TypeHList,
    T17 <: TypeHList,
    T18 <: TypeHList,
    T19 <: TypeHList,
    T20 <: TypeHList,
    T21 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15],
    t16: Application[K, H16, T16],
    t17: Application[K, H17, T17],
    t18: Application[K, H18, T18],
    t19: Application[K, H19, T19],
    t20: Application[K, H20, T20],
    t21: Application[K, H21, T21]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21), ScalaTupleTypeHList21[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21),
      ScalaTupleTypeHList21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
    ] {
      override def application(
        context: Context[K]
      ): K#M[ScalaTupleTypeHList21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] = {
//if (context.isReverse) {
        context
          .append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList20[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2], T1, ScalaTupleTypeHList21[
            T1,
            T2,
            T3,
            T4,
            T5,
            T6,
            T7,
            T8,
            T9,
            T10,
            T11,
            T12,
            T13,
            T14,
            T15,
            T16,
            T17,
            T18,
            T19,
            T20,
            T21
          ]](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList19[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
              T2,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList20[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2]
            ](
              context.append[
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList18[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
                T3,
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList19[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3]
              ](
                context.append[
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList17[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
                  T4,
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList18[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4]
                ](
                  context.append[
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
                    T5,
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList17[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5]
                  ](
                    context.append[
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7],
                      T6,
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6]
                    ](
                      context.append[
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8],
                        T7,
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7]
                      ](
                        context.append[
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9],
                          T8,
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8]
                        ](
                          context.append[
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10],
                            T9,
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9]
                          ](
                            context.append[
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11],
                              T10,
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10]
                            ](
                              context.append[
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12],
                                T11,
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11]
                              ](
                                context.append[
                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T21, T20, T19, T18, T17, T16, T15, T14, T13],
                                  T12,
                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12]
                                ](
                                  context.append[
                                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T21, T20, T19, T18, T17, T16, T15, T14],
                                    T13,
                                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T21, T20, T19, T18, T17, T16, T15, T14, T13]
                                  ](
                                    context.append[
                                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T21, T20, T19, T18, T17, T16, T15],
                                      T14,
                                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T21, T20, T19, T18, T17, T16, T15, T14]
                                    ](
                                      context.append[
                                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T21, T20, T19, T18, T17, T16],
                                        T15,
                                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T21, T20, T19, T18, T17, T16, T15]
                                      ](
                                        context.append[
                                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T21, T20, T19, T18, T17],
                                          T16,
                                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T21, T20, T19, T18, T17, T16]
                                        ](
                                          context.append[
                                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T21, T20, T19, T18],
                                            T17,
                                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T21, T20, T19, T18, T17]
                                          ](
                                            context.append[
                                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T21, T20, T19],
                                              T18,
                                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T21, T20, T19, T18]
                                            ](
                                              context.append[
                                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T21, T20],
                                                T19,
                                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T21, T20, T19]
                                              ](
                                                context.append[
                                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T21],
                                                  T20,
                                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T21, T20]
                                                ](
                                                  context.append[TupleTypeHList0, T21, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T21]](
                                                    context.start,
                                                    t21.application(context),
                                                    ScalaTupleHListTypeHListPlus.plus1
                                                  ),
                                                  t20.application(context),
                                                  ScalaTupleHListTypeHListPlus.plus2
                                                ),
                                                t19.application(context),
                                                ScalaTupleHListTypeHListPlus.plus3
                                              ),
                                              t18.application(context),
                                              ScalaTupleHListTypeHListPlus.plus4
                                            ),
                                            t17.application(context),
                                            ScalaTupleHListTypeHListPlus.plus5
                                          ),
                                          t16.application(context),
                                          ScalaTupleHListTypeHListPlus.plus6
                                        ),
                                        t15.application(context),
                                        ScalaTupleHListTypeHListPlus.plus7
                                      ),
                                      t14.application(context),
                                      ScalaTupleHListTypeHListPlus.plus8
                                    ),
                                    t13.application(context),
                                    ScalaTupleHListTypeHListPlus.plus9
                                  ),
                                  t12.application(context),
                                  ScalaTupleHListTypeHListPlus.plus10
                                ),
                                t11.application(context),
                                ScalaTupleHListTypeHListPlus.plus11
                              ),
                              t10.application(context),
                              ScalaTupleHListTypeHListPlus.plus12
                            ),
                            t9.application(context),
                            ScalaTupleHListTypeHListPlus.plus13
                          ),
                          t8.application(context),
                          ScalaTupleHListTypeHListPlus.plus14
                        ),
                        t7.application(context),
                        ScalaTupleHListTypeHListPlus.plus15
                      ),
                      t6.application(context),
                      ScalaTupleHListTypeHListPlus.plus16
                    ),
                    t5.application(context),
                    ScalaTupleHListTypeHListPlus.plus17
                  ),
                  t4.application(context),
                  ScalaTupleHListTypeHListPlus.plus18
                ),
                t3.application(context),
                ScalaTupleHListTypeHListPlus.plus19
              ),
              t2.application(context),
              ScalaTupleHListTypeHListPlus.plus20
            ),
            t1.application(context),
            HListToScalaTupleTypeHListPlus.put21
          )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
  implicit def scalaTupleImplicit22[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    H17,
    H18,
    H19,
    H20,
    H21,
    H22,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList,
    T16 <: TypeHList,
    T17 <: TypeHList,
    T18 <: TypeHList,
    T19 <: TypeHList,
    T20 <: TypeHList,
    T21 <: TypeHList,
    T22 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15],
    t16: Application[K, H16, T16],
    t17: Application[K, H17, T17],
    t18: Application[K, H18, T18],
    t19: Application[K, H19, T19],
    t20: Application[K, H20, T20],
    t21: Application[K, H21, T21],
    t22: Application[K, H22, T22]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22), ScalaTupleTypeHList22[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21,
    T22
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22),
      ScalaTupleTypeHList22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
    ] {
      override def application(
        context: Context[K]
      ): K#M[ScalaTupleTypeHList22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]] = {
//if (context.isReverse) {
        context.append[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList21[
          T22,
          T21,
          T20,
          T19,
          T18,
          T17,
          T16,
          T15,
          T14,
          T13,
          T12,
          T11,
          T10,
          T9,
          T8,
          T7,
          T6,
          T5,
          T4,
          T3,
          T2
        ], T1, ScalaTupleTypeHList22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]](
          context.append[
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList20[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
            T2,
            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList21[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2]
          ](
            context.append[
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList19[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
              T3,
              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList20[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3]
            ](
              context.append[
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList18[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
                T4,
                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList19[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4]
              ](
                context.append[
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList17[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
                  T5,
                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList18[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5]
                ](
                  context.append[
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7],
                    T6,
                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList17[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6]
                  ](
                    context.append[
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8],
                      T7,
                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7]
                    ](
                      context.append[
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9],
                        T8,
                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8]
                      ](
                        context.append[
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10],
                          T9,
                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9]
                        ](
                          context.append[
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11],
                            T10,
                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10]
                          ](
                            context.append[
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12],
                              T11,
                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11]
                            ](
                              context.append[
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13],
                                T12,
                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12]
                              ](
                                context.append[
                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T22, T21, T20, T19, T18, T17, T16, T15, T14],
                                  T13,
                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13]
                                ](
                                  context.append[
                                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T22, T21, T20, T19, T18, T17, T16, T15],
                                    T14,
                                    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[T22, T21, T20, T19, T18, T17, T16, T15, T14]
                                  ](
                                    context.append[
                                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T22, T21, T20, T19, T18, T17, T16],
                                      T15,
                                      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[T22, T21, T20, T19, T18, T17, T16, T15]
                                    ](
                                      context.append[
                                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T22, T21, T20, T19, T18, T17],
                                        T16,
                                        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[T22, T21, T20, T19, T18, T17, T16]
                                      ](
                                        context.append[
                                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T22, T21, T20, T19, T18],
                                          T17,
                                          ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[T22, T21, T20, T19, T18, T17]
                                        ](
                                          context.append[
                                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T22, T21, T20, T19],
                                            T18,
                                            ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[T22, T21, T20, T19, T18]
                                          ](
                                            context.append[
                                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T22, T21, T20],
                                              T19,
                                              ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[T22, T21, T20, T19]
                                            ](
                                              context.append[
                                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T22, T21],
                                                T20,
                                                ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[T22, T21, T20]
                                              ](
                                                context.append[
                                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T22],
                                                  T21,
                                                  ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[T22, T21]
                                                ](
                                                  context.append[TupleTypeHList0, T22, ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[T22]](
                                                    context.start,
                                                    t22.application(context),
                                                    ScalaTupleHListTypeHListPlus.plus1
                                                  ),
                                                  t21.application(context),
                                                  ScalaTupleHListTypeHListPlus.plus2
                                                ),
                                                t20.application(context),
                                                ScalaTupleHListTypeHListPlus.plus3
                                              ),
                                              t19.application(context),
                                              ScalaTupleHListTypeHListPlus.plus4
                                            ),
                                            t18.application(context),
                                            ScalaTupleHListTypeHListPlus.plus5
                                          ),
                                          t17.application(context),
                                          ScalaTupleHListTypeHListPlus.plus6
                                        ),
                                        t16.application(context),
                                        ScalaTupleHListTypeHListPlus.plus7
                                      ),
                                      t15.application(context),
                                      ScalaTupleHListTypeHListPlus.plus8
                                    ),
                                    t14.application(context),
                                    ScalaTupleHListTypeHListPlus.plus9
                                  ),
                                  t13.application(context),
                                  ScalaTupleHListTypeHListPlus.plus10
                                ),
                                t12.application(context),
                                ScalaTupleHListTypeHListPlus.plus11
                              ),
                              t11.application(context),
                              ScalaTupleHListTypeHListPlus.plus12
                            ),
                            t10.application(context),
                            ScalaTupleHListTypeHListPlus.plus13
                          ),
                          t9.application(context),
                          ScalaTupleHListTypeHListPlus.plus14
                        ),
                        t8.application(context),
                        ScalaTupleHListTypeHListPlus.plus15
                      ),
                      t7.application(context),
                      ScalaTupleHListTypeHListPlus.plus16
                    ),
                    t6.application(context),
                    ScalaTupleHListTypeHListPlus.plus17
                  ),
                  t5.application(context),
                  ScalaTupleHListTypeHListPlus.plus18
                ),
                t4.application(context),
                ScalaTupleHListTypeHListPlus.plus19
              ),
              t3.application(context),
              ScalaTupleHListTypeHListPlus.plus20
            ),
            t2.application(context),
            ScalaTupleHListTypeHListPlus.plus21
          ),
          t1.application(context),
          HListToScalaTupleTypeHListPlus.put22
        )
        /*} else {
@asuna.codegen.scala_tuple.utils.txt.ContextAppend(currentItem = tagNum)(maxItem = tagNum)
}*/
      }
    }
}
object ScalaTupleImplicits extends ScalaTupleImplicits
