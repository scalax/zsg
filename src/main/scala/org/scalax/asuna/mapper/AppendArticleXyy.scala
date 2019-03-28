package org.scalax.asuna.mapper.item
trait ArticleXyyContext {
  def plus0[K <: KindContext, II0 <: ItemType0](start: K#M[II0]): Application[K, Item0, II0] = new Application[K, Item0, II0] {
    override def application(context: Context[K]): K#M[II0] = start
  }
  def put0[K <: KindContext, II0 <: ArticleType0](start: K#M[II0]): Application[K, Item0, II0] = new Application[K, Item0, II0] {
    override def application(context: Context[K]): K#M[II0] = start
  }
  def plusPlus1[T1 <: TypeParam]: Plus[XyyType0, T1, XyyType1[T1]] = new Plus[XyyType0, T1, XyyType1[T1]] {
    override def plus(p: AppendXyy0, item: T1#H): AppendXyy1[T1#H] = p.eat(item)
    override def sub: Plus[XyyType0, T1#T, XyyType1[T1#T]]         = plusPlus1[T1#T]
  }
  def plus1[K <: KindContext, H1, T1 <: TypeParam, II0 <: ItemType0, II1 <: ItemType1[T1]](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    t1: Application[K, H1, T1]
  ): Application[K, Item1[H1], II1] = new Application[K, Item1[H1], II1] {
    override def application(context: Context[K]): K#M[II1] = {
      val ii1 = t1.application(context)
      context.append(plus0[K, II0](start).application(context), ii1, p1)
    }
  }
  def put1[K <: KindContext, H1, T1 <: TypeParam, II0 <: ArticleType0, II1 <: ArticleType1[T1]](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    t1: Application[K, H1, T1]
  ): Application[K, Item1[H1], II1] = new Application[K, Item1[H1], II1] {
    override def application(context: Context[K]): K#M[II1] = {
      val ii1 = t1.application(context)
      context.append(put0[K, II0](start).application(context), ii1, p1)
    }
  }
  def plusII1[K <: KindContext, H1, T1 <: TypeParam](t1: Application[K, H1, T1]): Application[K, Item1[H1], XyyType1[T1]] = new Application[K, Item1[H1], XyyType1[T1]] {
    override def application(context: Context[K]): K#M[XyyType1[T1]] = {
      plus1[K, H1, T1, XyyType0, XyyType1[T1]](context.start, plusPlus1, t1).application(context)
    }
  }
  def putII1[K <: KindContext, H1, T1 <: TypeParam](t1: Application[K, H1, T1]): Application[K, Item1[H1], XyyType1[T1]] = new Application[K, Item1[H1], XyyType1[T1]] {
    override def application(context: Context[K]): K#M[XyyType1[T1]] = {
      put1[K, H1, T1, XyyType0, XyyType1[T1]](context.start, plusPlus1, t1).application(context)
    }
  }
  def plus2[K <: KindContext, H1, H2, T1 <: TypeParam, T2 <: TypeParam, II0 <: ItemType0, II1 <: ItemType1[T1], II2 <: ItemType2[T1, T2]](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2]
  ): Application[K, Item2[H1, H2], II2] = new Application[K, Item2[H1, H2], II2] {
    override def application(context: Context[K]): K#M[II2] = {
      val ii2 = t2.application(context)
      context.append(plus1[K, H1, T1, II0, II1](start, p1, t1).application(context), ii2, p2)
    }
  }
  def put2[K <: KindContext, H1, H2, T1 <: TypeParam, T2 <: TypeParam, II0 <: ArticleType0, II1 <: ArticleType1[T2], II2 <: ArticleType2[T1, T2]](
    start: K#M[II0],
    p1: Plus[II0, T2, II1],
    p2: Plus[II1, T1, II2],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2]
  ): Application[K, Item2[H1, H2], II2] = new Application[K, Item2[H1, H2], II2] {
    override def application(context: Context[K]): K#M[II2] = {
      val ii1 = t1.application(context)
      context.append(put1[K, H2, T2, II0, II1](start, p1, t2).application(context), ii1, p2)
    }
  }
  def plusII2[K <: KindContext, H1, H2, T1 <: TypeParam, T2 <: TypeParam](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2]
  ): Application[K, Item2[H1, H2], XyyType2[T1, T2]] = new Application[K, Item2[H1, H2], XyyType2[T1, T2]] {
    override def application(context: Context[K]): K#M[XyyType2[T1, T2]] = {
      plus2[K, H1, H2, T1, T2, XyyType0, XyyType1[T1], XyyType2[T1, T2]](context.start, plusPlus1, plusPlus2, t1, t2).application(context)
    }
  }
  def putII2[K <: KindContext, H1, H2, T1 <: TypeParam, T2 <: TypeParam](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2]
  ): Application[K, Item2[H1, H2], XyyType2[T2, T1]] = new Application[K, Item2[H1, H2], XyyType2[T2, T1]] {
    override def application(context: Context[K]): K#M[XyyType2[T2, T1]] = {
      put2[K, H1, H2, T1, T2, XyyType0, XyyType1[T2], XyyType2[T2, T1]](context.start, plusPlus1, plusPlus2, t1, t2).application(context)
    }
  }
  def plus3[K <: KindContext, H1, H2, H3, T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, II0 <: ItemType0, II1 <: ItemType1[T1], II2 <: ItemType2[T1, T2], II3 <: ItemType3[
    T1,
    T2,
    T3
  ]](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3]
  ): Application[K, Item3[H1, H2, H3], II3] = new Application[K, Item3[H1, H2, H3], II3] {
    override def application(context: Context[K]): K#M[II3] = {
      val ii3 = t3.application(context)
      context.append(plus2[K, H1, H2, T1, T2, II0, II1, II2](start, p1, p2, t1, t2).application(context), ii3, p3)
    }
  }
  def put3[K <: KindContext, H1, H2, H3, T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, II0 <: ArticleType0, II1 <: ArticleType1[T3], II2 <: ArticleType2[T2, T3], II3 <: ArticleType3[
    T1,
    T2,
    T3
  ]](
    start: K#M[II0],
    p1: Plus[II0, T3, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T1, II3],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3]
  ): Application[K, Item3[H1, H2, H3], II3] = new Application[K, Item3[H1, H2, H3], II3] {
    override def application(context: Context[K]): K#M[II3] = {
      val ii1 = t1.application(context)
      context.append(put2[K, H2, H3, T2, T3, II0, II1, II2](start, p1, p2, t2, t3).application(context), ii1, p3)
    }
  }
  def plusII3[K <: KindContext, H1, H2, H3, T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3]
  ): Application[K, Item3[H1, H2, H3], XyyType3[T1, T2, T3]] = new Application[K, Item3[H1, H2, H3], XyyType3[T1, T2, T3]] {
    override def application(context: Context[K]): K#M[XyyType3[T1, T2, T3]] = {
      plus3[K, H1, H2, H3, T1, T2, T3, XyyType0, XyyType1[T1], XyyType2[T1, T2], XyyType3[T1, T2, T3]](context.start, plusPlus1, plusPlus2, plusPlus3, t1, t2, t3)
        .application(context)
    }
  }
  def putII3[K <: KindContext, H1, H2, H3, T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3]
  ): Application[K, Item3[H1, H2, H3], XyyType3[T3, T2, T1]] = new Application[K, Item3[H1, H2, H3], XyyType3[T3, T2, T1]] {
    override def application(context: Context[K]): K#M[XyyType3[T3, T2, T1]] = {
      put3[K, H1, H2, H3, T1, T2, T3, XyyType0, XyyType1[T3], XyyType2[T3, T2], XyyType3[T3, T2, T1]](context.start, plusPlus1, plusPlus2, plusPlus3, t1, t2, t3)
        .application(context)
    }
  }
  def plus4[K <: KindContext, H1, H2, H3, H4, T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam, II0 <: ItemType0, II1 <: ItemType1[T1], II2 <: ItemType2[
    T1,
    T2
  ], II3 <: ItemType3[T1, T2, T3], II4 <: ItemType4[T1, T2, T3, T4]](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4]
  ): Application[K, Item4[H1, H2, H3, H4], II4] = new Application[K, Item4[H1, H2, H3, H4], II4] {
    override def application(context: Context[K]): K#M[II4] = {
      val ii4 = t4.application(context)
      context.append(plus3[K, H1, H2, H3, T1, T2, T3, II0, II1, II2, II3](start, p1, p2, p3, t1, t2, t3).application(context), ii4, p4)
    }
  }
  def put4[K <: KindContext, H1, H2, H3, H4, T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam, II0 <: ArticleType0, II1 <: ArticleType1[T4], II2 <: ArticleType2[
    T3,
    T4
  ], II3 <: ArticleType3[T2, T3, T4], II4 <: ArticleType4[T1, T2, T3, T4]](
    start: K#M[II0],
    p1: Plus[II0, T4, II1],
    p2: Plus[II1, T3, II2],
    p3: Plus[II2, T2, II3],
    p4: Plus[II3, T1, II4],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4]
  ): Application[K, Item4[H1, H2, H3, H4], II4] = new Application[K, Item4[H1, H2, H3, H4], II4] {
    override def application(context: Context[K]): K#M[II4] = {
      val ii1 = t1.application(context)
      context.append(put3[K, H2, H3, H4, T2, T3, T4, II0, II1, II2, II3](start, p1, p2, p3, t2, t3, t4).application(context), ii1, p4)
    }
  }
  def plusII4[K <: KindContext, H1, H2, H3, H4, T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4]
  ): Application[K, Item4[H1, H2, H3, H4], XyyType4[T1, T2, T3, T4]] = new Application[K, Item4[H1, H2, H3, H4], XyyType4[T1, T2, T3, T4]] {
    override def application(context: Context[K]): K#M[XyyType4[T1, T2, T3, T4]] = {
      plus4[K, H1, H2, H3, H4, T1, T2, T3, T4, XyyType0, XyyType1[T1], XyyType2[T1, T2], XyyType3[T1, T2, T3], XyyType4[T1, T2, T3, T4]](
        context.start,
        plusPlus1,
        plusPlus2,
        plusPlus3,
        plusPlus4,
        t1,
        t2,
        t3,
        t4
      ).application(context)
    }
  }
  def putII4[K <: KindContext, H1, H2, H3, H4, T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4]
  ): Application[K, Item4[H1, H2, H3, H4], XyyType4[T4, T3, T2, T1]] = new Application[K, Item4[H1, H2, H3, H4], XyyType4[T4, T3, T2, T1]] {
    override def application(context: Context[K]): K#M[XyyType4[T4, T3, T2, T1]] = {
      put4[K, H1, H2, H3, H4, T1, T2, T3, T4, XyyType0, XyyType1[T4], XyyType2[T4, T3], XyyType3[T4, T3, T2], XyyType4[T4, T3, T2, T1]](
        context.start,
        plusPlus1,
        plusPlus2,
        plusPlus3,
        plusPlus4,
        t1,
        t2,
        t3,
        t4
      ).application(context)
    }
  }
  def plus5[K <: KindContext, H1, H2, H3, H4, H5, T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam, T5 <: TypeParam, II0 <: ItemType0, II1 <: ItemType1[
    T1
  ], II2 <: ItemType2[T1, T2], II3 <: ItemType3[T1, T2, T3], II4 <: ItemType4[T1, T2, T3, T4], II5 <: ItemType5[T1, T2, T3, T4, T5]](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5]
  ): Application[K, Item5[H1, H2, H3, H4, H5], II5] = new Application[K, Item5[H1, H2, H3, H4, H5], II5] {
    override def application(context: Context[K]): K#M[II5] = {
      val ii5 = t5.application(context)
      context.append(plus4[K, H1, H2, H3, H4, T1, T2, T3, T4, II0, II1, II2, II3, II4](start, p1, p2, p3, p4, t1, t2, t3, t4).application(context), ii5, p5)
    }
  }
  def put5[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T5],
    II2 <: ArticleType2[T4, T5],
    II3 <: ArticleType3[T3, T4, T5],
    II4 <: ArticleType4[T2, T3, T4, T5],
    II5 <: ArticleType5[T1, T2, T3, T4, T5]
  ](
    start: K#M[II0],
    p1: Plus[II0, T5, II1],
    p2: Plus[II1, T4, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T2, II4],
    p5: Plus[II4, T1, II5],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5]
  ): Application[K, Item5[H1, H2, H3, H4, H5], II5] = new Application[K, Item5[H1, H2, H3, H4, H5], II5] {
    override def application(context: Context[K]): K#M[II5] = {
      val ii1 = t1.application(context)
      context.append(put4[K, H2, H3, H4, H5, T2, T3, T4, T5, II0, II1, II2, II3, II4](start, p1, p2, p3, p4, t2, t3, t4, t5).application(context), ii1, p5)
    }
  }
  def plusII5[K <: KindContext, H1, H2, H3, H4, H5, T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam, T5 <: TypeParam](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5]
  ): Application[K, Item5[H1, H2, H3, H4, H5], XyyType5[T1, T2, T3, T4, T5]] = new Application[K, Item5[H1, H2, H3, H4, H5], XyyType5[T1, T2, T3, T4, T5]] {
    override def application(context: Context[K]): K#M[XyyType5[T1, T2, T3, T4, T5]] = {
      plus5[K, H1, H2, H3, H4, H5, T1, T2, T3, T4, T5, XyyType0, XyyType1[T1], XyyType2[T1, T2], XyyType3[T1, T2, T3], XyyType4[T1, T2, T3, T4], XyyType5[
        T1,
        T2,
        T3,
        T4,
        T5
      ]](context.start, plusPlus1, plusPlus2, plusPlus3, plusPlus4, plusPlus5, t1, t2, t3, t4, t5).application(context)
    }
  }
  def putII5[K <: KindContext, H1, H2, H3, H4, H5, T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam, T5 <: TypeParam](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5]
  ): Application[K, Item5[H1, H2, H3, H4, H5], XyyType5[T5, T4, T3, T2, T1]] = new Application[K, Item5[H1, H2, H3, H4, H5], XyyType5[T5, T4, T3, T2, T1]] {
    override def application(context: Context[K]): K#M[XyyType5[T5, T4, T3, T2, T1]] = {
      put5[K, H1, H2, H3, H4, H5, T1, T2, T3, T4, T5, XyyType0, XyyType1[T5], XyyType2[T5, T4], XyyType3[T5, T4, T3], XyyType4[T5, T4, T3, T2], XyyType5[
        T5,
        T4,
        T3,
        T2,
        T1
      ]](context.start, plusPlus1, plusPlus2, plusPlus3, plusPlus4, plusPlus5, t1, t2, t3, t4, t5).application(context)
    }
  }
  def plus6[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6]
  ): Application[K, Item6[H1, H2, H3, H4, H5, H6], II6] = new Application[K, Item6[H1, H2, H3, H4, H5, H6], II6] {
    override def application(context: Context[K]): K#M[II6] = {
      val ii6 = t6.application(context)
      context.append(
        plus5[K, H1, H2, H3, H4, H5, T1, T2, T3, T4, T5, II0, II1, II2, II3, II4, II5](start, p1, p2, p3, p4, p5, t1, t2, t3, t4, t5).application(context),
        ii6,
        p6
      )
    }
  }
  def put6[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T6],
    II2 <: ArticleType2[T5, T6],
    II3 <: ArticleType3[T4, T5, T6],
    II4 <: ArticleType4[T3, T4, T5, T6],
    II5 <: ArticleType5[T2, T3, T4, T5, T6],
    II6 <: ArticleType6[T1, T2, T3, T4, T5, T6]
  ](
    start: K#M[II0],
    p1: Plus[II0, T6, II1],
    p2: Plus[II1, T5, II2],
    p3: Plus[II2, T4, II3],
    p4: Plus[II3, T3, II4],
    p5: Plus[II4, T2, II5],
    p6: Plus[II5, T1, II6],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6]
  ): Application[K, Item6[H1, H2, H3, H4, H5, H6], II6] = new Application[K, Item6[H1, H2, H3, H4, H5, H6], II6] {
    override def application(context: Context[K]): K#M[II6] = {
      val ii1 = t1.application(context)
      context.append(
        put5[K, H2, H3, H4, H5, H6, T2, T3, T4, T5, T6, II0, II1, II2, II3, II4, II5](start, p1, p2, p3, p4, p5, t2, t3, t4, t5, t6).application(context),
        ii1,
        p6
      )
    }
  }
  def plusII6[K <: KindContext, H1, H2, H3, H4, H5, H6, T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam, T5 <: TypeParam, T6 <: TypeParam](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6]
  ): Application[K, Item6[H1, H2, H3, H4, H5, H6], XyyType6[T1, T2, T3, T4, T5, T6]] =
    new Application[K, Item6[H1, H2, H3, H4, H5, H6], XyyType6[T1, T2, T3, T4, T5, T6]] {
      override def application(context: Context[K]): K#M[XyyType6[T1, T2, T3, T4, T5, T6]] = {
        plus6[K, H1, H2, H3, H4, H5, H6, T1, T2, T3, T4, T5, T6, XyyType0, XyyType1[T1], XyyType2[T1, T2], XyyType3[T1, T2, T3], XyyType4[T1, T2, T3, T4], XyyType5[
          T1,
          T2,
          T3,
          T4,
          T5
        ], XyyType6[T1, T2, T3, T4, T5, T6]](context.start, plusPlus1, plusPlus2, plusPlus3, plusPlus4, plusPlus5, plusPlus6, t1, t2, t3, t4, t5, t6).application(context)
      }
    }
  def putII6[K <: KindContext, H1, H2, H3, H4, H5, H6, T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam, T5 <: TypeParam, T6 <: TypeParam](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6]
  ): Application[K, Item6[H1, H2, H3, H4, H5, H6], XyyType6[T6, T5, T4, T3, T2, T1]] =
    new Application[K, Item6[H1, H2, H3, H4, H5, H6], XyyType6[T6, T5, T4, T3, T2, T1]] {
      override def application(context: Context[K]): K#M[XyyType6[T6, T5, T4, T3, T2, T1]] = {
        put6[K, H1, H2, H3, H4, H5, H6, T1, T2, T3, T4, T5, T6, XyyType0, XyyType1[T6], XyyType2[T6, T5], XyyType3[T6, T5, T4], XyyType4[T6, T5, T4, T3], XyyType5[
          T6,
          T5,
          T4,
          T3,
          T2
        ], XyyType6[T6, T5, T4, T3, T2, T1]](context.start, plusPlus1, plusPlus2, plusPlus3, plusPlus4, plusPlus5, plusPlus6, t1, t2, t3, t4, t5, t6).application(context)
      }
    }
  def plus7[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7]
  ): Application[K, Item7[H1, H2, H3, H4, H5, H6, H7], II7] = new Application[K, Item7[H1, H2, H3, H4, H5, H6, H7], II7] {
    override def application(context: Context[K]): K#M[II7] = {
      val ii7 = t7.application(context)
      context.append(
        plus6[K, H1, H2, H3, H4, H5, H6, T1, T2, T3, T4, T5, T6, II0, II1, II2, II3, II4, II5, II6](start, p1, p2, p3, p4, p5, p6, t1, t2, t3, t4, t5, t6)
          .application(context),
        ii7,
        p7
      )
    }
  }
  def put7[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T7],
    II2 <: ArticleType2[T6, T7],
    II3 <: ArticleType3[T5, T6, T7],
    II4 <: ArticleType4[T4, T5, T6, T7],
    II5 <: ArticleType5[T3, T4, T5, T6, T7],
    II6 <: ArticleType6[T2, T3, T4, T5, T6, T7],
    II7 <: ArticleType7[T1, T2, T3, T4, T5, T6, T7]
  ](
    start: K#M[II0],
    p1: Plus[II0, T7, II1],
    p2: Plus[II1, T6, II2],
    p3: Plus[II2, T5, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T3, II5],
    p6: Plus[II5, T2, II6],
    p7: Plus[II6, T1, II7],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7]
  ): Application[K, Item7[H1, H2, H3, H4, H5, H6, H7], II7] = new Application[K, Item7[H1, H2, H3, H4, H5, H6, H7], II7] {
    override def application(context: Context[K]): K#M[II7] = {
      val ii1 = t1.application(context)
      context.append(
        put6[K, H2, H3, H4, H5, H6, H7, T2, T3, T4, T5, T6, T7, II0, II1, II2, II3, II4, II5, II6](start, p1, p2, p3, p4, p5, p6, t2, t3, t4, t5, t6, t7)
          .application(context),
        ii1,
        p7
      )
    }
  }
  def plusII7[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam
  ](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7]
  ): Application[K, Item7[H1, H2, H3, H4, H5, H6, H7], XyyType7[T1, T2, T3, T4, T5, T6, T7]] =
    new Application[K, Item7[H1, H2, H3, H4, H5, H6, H7], XyyType7[T1, T2, T3, T4, T5, T6, T7]] {
      override def application(context: Context[K]): K#M[XyyType7[T1, T2, T3, T4, T5, T6, T7]] = {
        plus7[K, H1, H2, H3, H4, H5, H6, H7, T1, T2, T3, T4, T5, T6, T7, XyyType0, XyyType1[T1], XyyType2[T1, T2], XyyType3[T1, T2, T3], XyyType4[T1, T2, T3, T4], XyyType5[
          T1,
          T2,
          T3,
          T4,
          T5
        ], XyyType6[T1, T2, T3, T4, T5, T6], XyyType7[T1, T2, T3, T4, T5, T6, T7]](
          context.start,
          plusPlus1,
          plusPlus2,
          plusPlus3,
          plusPlus4,
          plusPlus5,
          plusPlus6,
          plusPlus7,
          t1,
          t2,
          t3,
          t4,
          t5,
          t6,
          t7
        ).application(context)
      }
    }
  def putII7[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam
  ](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7]
  ): Application[K, Item7[H1, H2, H3, H4, H5, H6, H7], XyyType7[T7, T6, T5, T4, T3, T2, T1]] =
    new Application[K, Item7[H1, H2, H3, H4, H5, H6, H7], XyyType7[T7, T6, T5, T4, T3, T2, T1]] {
      override def application(context: Context[K]): K#M[XyyType7[T7, T6, T5, T4, T3, T2, T1]] = {
        put7[K, H1, H2, H3, H4, H5, H6, H7, T1, T2, T3, T4, T5, T6, T7, XyyType0, XyyType1[T7], XyyType2[T7, T6], XyyType3[T7, T6, T5], XyyType4[T7, T6, T5, T4], XyyType5[
          T7,
          T6,
          T5,
          T4,
          T3
        ], XyyType6[T7, T6, T5, T4, T3, T2], XyyType7[T7, T6, T5, T4, T3, T2, T1]](
          context.start,
          plusPlus1,
          plusPlus2,
          plusPlus3,
          plusPlus4,
          plusPlus5,
          plusPlus6,
          plusPlus7,
          t1,
          t2,
          t3,
          t4,
          t5,
          t6,
          t7
        ).application(context)
      }
    }
  def plus8[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8]
  ): Application[K, Item8[H1, H2, H3, H4, H5, H6, H7, H8], II8] = new Application[K, Item8[H1, H2, H3, H4, H5, H6, H7, H8], II8] {
    override def application(context: Context[K]): K#M[II8] = {
      val ii8 = t8.application(context)
      context.append(
          plus7[K, H1, H2, H3, H4, H5, H6, H7, T1, T2, T3, T4, T5, T6, T7, II0, II1, II2, II3, II4, II5, II6, II7](
          start,
          p1,
          p2,
          p3,
          p4,
          p5,
          p6,
          p7,
          t1,
          t2,
          t3,
          t4,
          t5,
          t6,
          t7
        ).application(context)
        , ii8
        , p8
      )
    }
  }
  def put8[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T8],
    II2 <: ArticleType2[T7, T8],
    II3 <: ArticleType3[T6, T7, T8],
    II4 <: ArticleType4[T5, T6, T7, T8],
    II5 <: ArticleType5[T4, T5, T6, T7, T8],
    II6 <: ArticleType6[T3, T4, T5, T6, T7, T8],
    II7 <: ArticleType7[T2, T3, T4, T5, T6, T7, T8],
    II8 <: ArticleType8[T1, T2, T3, T4, T5, T6, T7, T8]
  ](
    start: K#M[II0],
    p1: Plus[II0, T8, II1],
    p2: Plus[II1, T7, II2],
    p3: Plus[II2, T6, II3],
    p4: Plus[II3, T5, II4],
    p5: Plus[II4, T4, II5],
    p6: Plus[II5, T3, II6],
    p7: Plus[II6, T2, II7],
    p8: Plus[II7, T1, II8],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8]
  ): Application[K, Item8[H1, H2, H3, H4, H5, H6, H7, H8], II8] = new Application[K, Item8[H1, H2, H3, H4, H5, H6, H7, H8], II8] {
    override def application(context: Context[K]): K#M[II8] = {
      val ii1 = t1.application(context)
      context.append(
          put7[K, H2, H3, H4, H5, H6, H7, H8, T2, T3, T4, T5, T6, T7, T8, II0, II1, II2, II3, II4, II5, II6, II7](
          start,
          p1,
          p2,
          p3,
          p4,
          p5,
          p6,
          p7,
          t2,
          t3,
          t4,
          t5,
          t6,
          t7,
          t8
        ).application(context)
        , ii1
        , p8
      )
    }
  }
  def plusII8[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam
  ](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8]
  ): Application[K, Item8[H1, H2, H3, H4, H5, H6, H7, H8], XyyType8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new Application[K, Item8[H1, H2, H3, H4, H5, H6, H7, H8], XyyType8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def application(context: Context[K]): K#M[XyyType8[T1, T2, T3, T4, T5, T6, T7, T8]] = {
        plus8[K, H1, H2, H3, H4, H5, H6, H7, H8, T1, T2, T3, T4, T5, T6, T7, T8, XyyType0, XyyType1[T1], XyyType2[T1, T2], XyyType3[T1, T2, T3], XyyType4[T1, T2, T3, T4], XyyType5[
          T1,
          T2,
          T3,
          T4,
          T5
        ], XyyType6[T1, T2, T3, T4, T5, T6], XyyType7[T1, T2, T3, T4, T5, T6, T7], XyyType8[T1, T2, T3, T4, T5, T6, T7, T8]](
          context.start,
          plusPlus1,
          plusPlus2,
          plusPlus3,
          plusPlus4,
          plusPlus5,
          plusPlus6,
          plusPlus7,
          plusPlus8,
          t1,
          t2,
          t3,
          t4,
          t5,
          t6,
          t7,
          t8
        ).application(context)
      }
    }
  def putII8[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam
  ](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8]
  ): Application[K, Item8[H1, H2, H3, H4, H5, H6, H7, H8], XyyType8[T8, T7, T6, T5, T4, T3, T2, T1]] =
    new Application[K, Item8[H1, H2, H3, H4, H5, H6, H7, H8], XyyType8[T8, T7, T6, T5, T4, T3, T2, T1]] {
      override def application(context: Context[K]): K#M[XyyType8[T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put8[K, H1, H2, H3, H4, H5, H6, H7, H8, T1, T2, T3, T4, T5, T6, T7, T8, XyyType0, XyyType1[T8], XyyType2[T8, T7], XyyType3[T8, T7, T6], XyyType4[T8, T7, T6, T5], XyyType5[
          T8,
          T7,
          T6,
          T5,
          T4
        ], XyyType6[T8, T7, T6, T5, T4, T3], XyyType7[T8, T7, T6, T5, T4, T3, T2], XyyType8[T8, T7, T6, T5, T4, T3, T2, T1]](
          context.start,
          plusPlus1,
          plusPlus2,
          plusPlus3,
          plusPlus4,
          plusPlus5,
          plusPlus6,
          plusPlus7,
          plusPlus8,
          t1,
          t2,
          t3,
          t4,
          t5,
          t6,
          t7,
          t8
        ).application(context)
      }
    }
  def plus9[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8],
    II9 <: ItemType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T9, II9],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9]
  ): Application[K, Item9[H1, H2, H3, H4, H5, H6, H7, H8, H9], II9] = new Application[K, Item9[H1, H2, H3, H4, H5, H6, H7, H8, H9], II9] {
    override def application(context: Context[K]): K#M[II9] = {
      val ii9 = t9.application(context)
      context.append(
          plus8[K, H1, H2, H3, H4, H5, H6, H7, H8, T1, T2, T3, T4, T5, T6, T7, T8, II0, II1, II2, II3, II4, II5, II6, II7, II8](
          start,
          p1,
          p2,
          p3,
          p4,
          p5,
          p6,
          p7,
          p8,
          t1,
          t2,
          t3,
          t4,
          t5,
          t6,
          t7,
          t8
        ).application(context)
        , ii9
        , p9
      )
    }
  }
  def put9[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T9],
    II2 <: ArticleType2[T8, T9],
    II3 <: ArticleType3[T7, T8, T9],
    II4 <: ArticleType4[T6, T7, T8, T9],
    II5 <: ArticleType5[T5, T6, T7, T8, T9],
    II6 <: ArticleType6[T4, T5, T6, T7, T8, T9],
    II7 <: ArticleType7[T3, T4, T5, T6, T7, T8, T9],
    II8 <: ArticleType8[T2, T3, T4, T5, T6, T7, T8, T9],
    II9 <: ArticleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]
  ](
    start: K#M[II0],
    p1: Plus[II0, T9, II1],
    p2: Plus[II1, T8, II2],
    p3: Plus[II2, T7, II3],
    p4: Plus[II3, T6, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T4, II6],
    p7: Plus[II6, T3, II7],
    p8: Plus[II7, T2, II8],
    p9: Plus[II8, T1, II9],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9]
  ): Application[K, Item9[H1, H2, H3, H4, H5, H6, H7, H8, H9], II9] = new Application[K, Item9[H1, H2, H3, H4, H5, H6, H7, H8, H9], II9] {
    override def application(context: Context[K]): K#M[II9] = {
      val ii1 = t1.application(context)
      context.append(
          put8[K, H2, H3, H4, H5, H6, H7, H8, H9, T2, T3, T4, T5, T6, T7, T8, T9, II0, II1, II2, II3, II4, II5, II6, II7, II8](
          start,
          p1,
          p2,
          p3,
          p4,
          p5,
          p6,
          p7,
          p8,
          t2,
          t3,
          t4,
          t5,
          t6,
          t7,
          t8,
          t9
        ).application(context)
        , ii1
        , p9
      )
    }
  }
  def plusII9[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam
  ](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9]
  ): Application[K, Item9[H1, H2, H3, H4, H5, H6, H7, H8, H9], XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new Application[K, Item9[H1, H2, H3, H4, H5, H6, H7, H8, H9], XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def application(context: Context[K]): K#M[XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = {
        plus9[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, T1, T2, T3, T4, T5, T6, T7, T8, T9, XyyType0, XyyType1[T1], XyyType2[T1, T2], XyyType3[T1, T2, T3], XyyType4[
          T1,
          T2,
          T3,
          T4
        ], XyyType5[T1, T2, T3, T4, T5], XyyType6[T1, T2, T3, T4, T5, T6], XyyType7[T1, T2, T3, T4, T5, T6, T7], XyyType8[T1, T2, T3, T4, T5, T6, T7, T8], XyyType9[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9
        ]](context.start, plusPlus1, plusPlus2, plusPlus3, plusPlus4, plusPlus5, plusPlus6, plusPlus7, plusPlus8, plusPlus9, t1, t2, t3, t4, t5, t6, t7, t8, t9)
          .application(context)
      }
    }
  def putII9[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam
  ](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9]
  ): Application[K, Item9[H1, H2, H3, H4, H5, H6, H7, H8, H9], XyyType9[T9, T8, T7, T6, T5, T4, T3, T2, T1]] =
    new Application[K, Item9[H1, H2, H3, H4, H5, H6, H7, H8, H9], XyyType9[T9, T8, T7, T6, T5, T4, T3, T2, T1]] {
      override def application(context: Context[K]): K#M[XyyType9[T9, T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put9[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, T1, T2, T3, T4, T5, T6, T7, T8, T9, XyyType0, XyyType1[T9], XyyType2[T9, T8], XyyType3[T9, T8, T7], XyyType4[
          T9,
          T8,
          T7,
          T6
        ], XyyType5[T9, T8, T7, T6, T5], XyyType6[T9, T8, T7, T6, T5, T4], XyyType7[T9, T8, T7, T6, T5, T4, T3], XyyType8[T9, T8, T7, T6, T5, T4, T3, T2], XyyType9[
          T9,
          T8,
          T7,
          T6,
          T5,
          T4,
          T3,
          T2,
          T1
        ]](context.start, plusPlus1, plusPlus2, plusPlus3, plusPlus4, plusPlus5, plusPlus6, plusPlus7, plusPlus8, plusPlus9, t1, t2, t3, t4, t5, t6, t7, t8, t9)
          .application(context)
      }
    }
  def plus10[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8],
    II9 <: ItemType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
    II10 <: ItemType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T9, II9],
    p10: Plus[II9, T10, II10],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10]
  ): Application[K, Item10[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10], II10] = new Application[K, Item10[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10], II10] {
    override def application(context: Context[K]): K#M[II10] = {
      val ii10 = t10.application(context)
      context.append(
          plus9[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, T1, T2, T3, T4, T5, T6, T7, T8, T9, II0, II1, II2, II3, II4, II5, II6, II7, II8, II9](
          start,
          p1,
          p2,
          p3,
          p4,
          p5,
          p6,
          p7,
          p8,
          p9,
          t1,
          t2,
          t3,
          t4,
          t5,
          t6,
          t7,
          t8,
          t9
        ).application(context)
        , ii10
        , p10
      )
    }
  }
  def put10[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T10],
    II2 <: ArticleType2[T9, T10],
    II3 <: ArticleType3[T8, T9, T10],
    II4 <: ArticleType4[T7, T8, T9, T10],
    II5 <: ArticleType5[T6, T7, T8, T9, T10],
    II6 <: ArticleType6[T5, T6, T7, T8, T9, T10],
    II7 <: ArticleType7[T4, T5, T6, T7, T8, T9, T10],
    II8 <: ArticleType8[T3, T4, T5, T6, T7, T8, T9, T10],
    II9 <: ArticleType9[T2, T3, T4, T5, T6, T7, T8, T9, T10],
    II10 <: ArticleType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]
  ](
    start: K#M[II0],
    p1: Plus[II0, T10, II1],
    p2: Plus[II1, T9, II2],
    p3: Plus[II2, T8, II3],
    p4: Plus[II3, T7, II4],
    p5: Plus[II4, T6, II5],
    p6: Plus[II5, T5, II6],
    p7: Plus[II6, T4, II7],
    p8: Plus[II7, T3, II8],
    p9: Plus[II8, T2, II9],
    p10: Plus[II9, T1, II10],
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10]
  ): Application[K, Item10[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10], II10] = new Application[K, Item10[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10], II10] {
    override def application(context: Context[K]): K#M[II10] = {
      val ii1 = t1.application(context)
      context.append(
          put9[K, H2, H3, H4, H5, H6, H7, H8, H9, H10, T2, T3, T4, T5, T6, T7, T8, T9, T10, II0, II1, II2, II3, II4, II5, II6, II7, II8, II9](
          start,
          p1,
          p2,
          p3,
          p4,
          p5,
          p6,
          p7,
          p8,
          p9,
          t2,
          t3,
          t4,
          t5,
          t6,
          t7,
          t8,
          t9,
          t10
        ).application(context)
        , ii1
        , p10
      )
    }
  }
  def plusII10[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam
  ](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10]
  ): Application[K, Item10[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10], XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new Application[K, Item10[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10], XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def application(context: Context[K]): K#M[XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = {
        plus10[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, XyyType0, XyyType1[T1], XyyType2[T1, T2], XyyType3[T1, T2, T3], XyyType4[
          T1,
          T2,
          T3,
          T4
        ], XyyType5[T1, T2, T3, T4, T5], XyyType6[T1, T2, T3, T4, T5, T6], XyyType7[T1, T2, T3, T4, T5, T6, T7], XyyType8[T1, T2, T3, T4, T5, T6, T7, T8], XyyType9[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9
        ], XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]](
          context.start,
          plusPlus1,
          plusPlus2,
          plusPlus3,
          plusPlus4,
          plusPlus5,
          plusPlus6,
          plusPlus7,
          plusPlus8,
          plusPlus9,
          plusPlus10,
          t1,
          t2,
          t3,
          t4,
          t5,
          t6,
          t7,
          t8,
          t9,
          t10
        ).application(context)
      }
    }
  def putII10[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam
  ](
    t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10]
  ): Application[K, Item10[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10], XyyType10[T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] =
    new Application[K, Item10[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10], XyyType10[T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] {
      override def application(context: Context[K]): K#M[XyyType10[T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put10[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, XyyType0, XyyType1[T10], XyyType2[T10, T9], XyyType3[T10, T9, T8], XyyType4[
          T10,
          T9,
          T8,
          T7
        ], XyyType5[T10, T9, T8, T7, T6], XyyType6[T10, T9, T8, T7, T6, T5], XyyType7[T10, T9, T8, T7, T6, T5, T4], XyyType8[T10, T9, T8, T7, T6, T5, T4, T3], XyyType9[
          T10,
          T9,
          T8,
          T7,
          T6,
          T5,
          T4,
          T3,
          T2
        ], XyyType10[T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]](
          context.start,
          plusPlus1,
          plusPlus2,
          plusPlus3,
          plusPlus4,
          plusPlus5,
          plusPlus6,
          plusPlus7,
          plusPlus8,
          plusPlus9,
          plusPlus10,
          t1,
          t2,
          t3,
          t4,
          t5,
          t6,
          t7,
          t8,
          t9,
          t10
        ).application(context)
      }
    }
  def plus11[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8],
    II9 <: ItemType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
    II10 <: ItemType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
    II11 <: ItemType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T9, II9],
    p10: Plus[II9, T10, II10],
    p11: Plus[II10, T11, II11],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item11[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11], II11] = new Application[K, Item11[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11], II11] {
    override def application(context: Context[K]): K#M[II11] = {
      val ii11 = t11.application(context)
      context.append(
          plus10[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, II0, II1, II2, II3, II4, II5, II6, II7, II8, II9, II10](
          start,
          p1,
          p2,
          p3,
          p4,
          p5,
          p6,
          p7,
          p8,
          p9,
          p10,
          t1,
          t2,
          t3,
          t4,
          t5,
          t6,
          t7,
          t8,
          t9,
          t10
        ).application(context)
        , ii11
        , p11
      )
    }
  }
  def put11[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T11],
    II2 <: ArticleType2[T10, T11],
    II3 <: ArticleType3[T9, T10, T11],
    II4 <: ArticleType4[T8, T9, T10, T11],
    II5 <: ArticleType5[T7, T8, T9, T10, T11],
    II6 <: ArticleType6[T6, T7, T8, T9, T10, T11],
    II7 <: ArticleType7[T5, T6, T7, T8, T9, T10, T11],
    II8 <: ArticleType8[T4, T5, T6, T7, T8, T9, T10, T11],
    II9 <: ArticleType9[T3, T4, T5, T6, T7, T8, T9, T10, T11],
    II10 <: ArticleType10[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
    II11 <: ArticleType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
  ](
    start: K#M[II0],
    p1: Plus[II0, T11, II1],
    p2: Plus[II1, T10, II2],
    p3: Plus[II2, T9, II3],
    p4: Plus[II3, T8, II4],
    p5: Plus[II4, T7, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T5, II7],
    p8: Plus[II7, T4, II8],
    p9: Plus[II8, T3, II9],
    p10: Plus[II9, T2, II10],
    p11: Plus[II10, T1, II11],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item11[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11], II11] = new Application[K, Item11[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11], II11] {
    override def application(context: Context[K]): K#M[II11] = {
      val ii1 = t1.application(context)
      context.append(
          put10[K, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, II0, II1, II2, II3, II4, II5, II6, II7, II8, II9, II10](
          start,
          p1,
          p2,
          p3,
          p4,
          p5,
          p6,
          p7,
          p8,
          p9,
          p10,
          t2,
          t3,
          t4,
          t5,
          t6,
          t7,
          t8,
          t9,
          t10,
          t11
        ).application(context)
        , ii1
        , p11
      )
    }
  }
  def plusII11[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item11[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11], XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new Application[K, Item11[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11], XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {
      override def application(context: Context[K]): K#M[XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] = {
        plus11[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, XyyType0, XyyType1[T1], XyyType2[T1, T2], XyyType3[
          T1,
          T2,
          T3
        ], XyyType4[T1, T2, T3, T4], XyyType5[T1, T2, T3, T4, T5], XyyType6[T1, T2, T3, T4, T5, T6], XyyType7[T1, T2, T3, T4, T5, T6, T7], XyyType8[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8
        ], XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
        ).application(context)
      }
    }
  def putII11[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item11[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11], XyyType11[T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] =
    new Application[K, Item11[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11], XyyType11[T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] {
      override def application(context: Context[K]): K#M[XyyType11[T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put11[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, XyyType0, XyyType1[T11], XyyType2[T11, T10], XyyType3[
          T11,
          T10,
          T9
        ], XyyType4[T11, T10, T9, T8], XyyType5[T11, T10, T9, T8, T7], XyyType6[T11, T10, T9, T8, T7, T6], XyyType7[T11, T10, T9, T8, T7, T6, T5], XyyType8[
          T11,
          T10,
          T9,
          T8,
          T7,
          T6,
          T5,
          T4
        ], XyyType9[T11, T10, T9, T8, T7, T6, T5, T4, T3], XyyType10[T11, T10, T9, T8, T7, T6, T5, T4, T3, T2], XyyType11[T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
        ).application(context)
      }
    }
  def plus12[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8],
    II9 <: ItemType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
    II10 <: ItemType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
    II11 <: ItemType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
    II12 <: ItemType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T9, II9],
    p10: Plus[II9, T10, II10],
    p11: Plus[II10, T11, II11],
    p12: Plus[II11, T12, II12],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item12[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12], II12] =
    new Application[K, Item12[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12], II12] {
      override def application(context: Context[K]): K#M[II12] = {
        val ii12 = t12.application(context)
        context.append(
            plus11[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11
          ](start, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11).application(context)
          , ii12
          , p12
        )
      }
    }
  def put12[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T12],
    II2 <: ArticleType2[T11, T12],
    II3 <: ArticleType3[T10, T11, T12],
    II4 <: ArticleType4[T9, T10, T11, T12],
    II5 <: ArticleType5[T8, T9, T10, T11, T12],
    II6 <: ArticleType6[T7, T8, T9, T10, T11, T12],
    II7 <: ArticleType7[T6, T7, T8, T9, T10, T11, T12],
    II8 <: ArticleType8[T5, T6, T7, T8, T9, T10, T11, T12],
    II9 <: ArticleType9[T4, T5, T6, T7, T8, T9, T10, T11, T12],
    II10 <: ArticleType10[T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
    II11 <: ArticleType11[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
    II12 <: ArticleType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
  ](
    start: K#M[II0],
    p1: Plus[II0, T12, II1],
    p2: Plus[II1, T11, II2],
    p3: Plus[II2, T10, II3],
    p4: Plus[II3, T9, II4],
    p5: Plus[II4, T8, II5],
    p6: Plus[II5, T7, II6],
    p7: Plus[II6, T6, II7],
    p8: Plus[II7, T5, II8],
    p9: Plus[II8, T4, II9],
    p10: Plus[II9, T3, II10],
    p11: Plus[II10, T2, II11],
    p12: Plus[II11, T1, II12],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item12[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12], II12] =
    new Application[K, Item12[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12], II12] {
      override def application(context: Context[K]): K#M[II12] = {
        val ii1 = t1.application(context)
        context.append(
            put11[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11
          ](start, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12).application(context)
          , ii1
          , p12
        )
      }
    }
  def plusII12[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item12[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12], XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] =
    new Application[K, Item12[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12], XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] {
      override def application(context: Context[K]): K#M[XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] = {
        plus12[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, XyyType0, XyyType1[T1], XyyType2[T1, T2], XyyType3[
          T1,
          T2,
          T3
        ], XyyType4[T1, T2, T3, T4], XyyType5[T1, T2, T3, T4, T5], XyyType6[T1, T2, T3, T4, T5, T6], XyyType7[T1, T2, T3, T4, T5, T6, T7], XyyType8[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8
        ], XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], XyyType12[
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
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
        ).application(context)
      }
    }
  def putII12[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item12[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12], XyyType12[T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] =
    new Application[K, Item12[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12], XyyType12[T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] {
      override def application(context: Context[K]): K#M[XyyType12[T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put12[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, XyyType0, XyyType1[T12], XyyType2[T12, T11], XyyType3[
          T12,
          T11,
          T10
        ], XyyType4[T12, T11, T10, T9], XyyType5[T12, T11, T10, T9, T8], XyyType6[T12, T11, T10, T9, T8, T7], XyyType7[T12, T11, T10, T9, T8, T7, T6], XyyType8[
          T12,
          T11,
          T10,
          T9,
          T8,
          T7,
          T6,
          T5
        ], XyyType9[T12, T11, T10, T9, T8, T7, T6, T5, T4], XyyType10[T12, T11, T10, T9, T8, T7, T6, T5, T4, T3], XyyType11[
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
        ], XyyType12[T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
        ).application(context)
      }
    }
  def plus13[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8],
    II9 <: ItemType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
    II10 <: ItemType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
    II11 <: ItemType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
    II12 <: ItemType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
    II13 <: ItemType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T9, II9],
    p10: Plus[II9, T10, II10],
    p11: Plus[II10, T11, II11],
    p12: Plus[II11, T12, II12],
    p13: Plus[II12, T13, II13],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item13[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13], II13] =
    new Application[K, Item13[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13], II13] {
      override def application(context: Context[K]): K#M[II13] = {
        val ii13 = t13.application(context)
        context.append(
            plus12[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12
          ](start, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12).application(context)
          , ii13
          , p13
        )
      }
    }
  def put13[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T13],
    II2 <: ArticleType2[T12, T13],
    II3 <: ArticleType3[T11, T12, T13],
    II4 <: ArticleType4[T10, T11, T12, T13],
    II5 <: ArticleType5[T9, T10, T11, T12, T13],
    II6 <: ArticleType6[T8, T9, T10, T11, T12, T13],
    II7 <: ArticleType7[T7, T8, T9, T10, T11, T12, T13],
    II8 <: ArticleType8[T6, T7, T8, T9, T10, T11, T12, T13],
    II9 <: ArticleType9[T5, T6, T7, T8, T9, T10, T11, T12, T13],
    II10 <: ArticleType10[T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
    II11 <: ArticleType11[T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
    II12 <: ArticleType12[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
    II13 <: ArticleType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
  ](
    start: K#M[II0],
    p1: Plus[II0, T13, II1],
    p2: Plus[II1, T12, II2],
    p3: Plus[II2, T11, II3],
    p4: Plus[II3, T10, II4],
    p5: Plus[II4, T9, II5],
    p6: Plus[II5, T8, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T6, II8],
    p9: Plus[II8, T5, II9],
    p10: Plus[II9, T4, II10],
    p11: Plus[II10, T3, II11],
    p12: Plus[II11, T2, II12],
    p13: Plus[II12, T1, II13],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item13[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13], II13] =
    new Application[K, Item13[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13], II13] {
      override def application(context: Context[K]): K#M[II13] = {
        val ii1 = t1.application(context)
        context.append(
            put12[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12
          ](start, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13).application(context)
          , ii1
          , p13
        )
      }
    }
  def plusII13[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item13[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13], XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] =
    new Application[K, Item13[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13], XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] {
      override def application(context: Context[K]): K#M[XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] = {
        plus13[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, XyyType0, XyyType1[T1], XyyType2[
          T1,
          T2
        ], XyyType3[T1, T2, T3], XyyType4[T1, T2, T3, T4], XyyType5[T1, T2, T3, T4, T5], XyyType6[T1, T2, T3, T4, T5, T6], XyyType7[T1, T2, T3, T4, T5, T6, T7], XyyType8[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8
        ], XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], XyyType12[
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
        ], XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
        ).application(context)
      }
    }
  def putII13[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item13[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13], XyyType13[T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] =
    new Application[K, Item13[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13], XyyType13[T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] {
      override def application(context: Context[K]): K#M[XyyType13[T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put13[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, XyyType0, XyyType1[T13], XyyType2[
          T13,
          T12
        ], XyyType3[T13, T12, T11], XyyType4[T13, T12, T11, T10], XyyType5[T13, T12, T11, T10, T9], XyyType6[T13, T12, T11, T10, T9, T8], XyyType7[
          T13,
          T12,
          T11,
          T10,
          T9,
          T8,
          T7
        ], XyyType8[T13, T12, T11, T10, T9, T8, T7, T6], XyyType9[T13, T12, T11, T10, T9, T8, T7, T6, T5], XyyType10[T13, T12, T11, T10, T9, T8, T7, T6, T5, T4], XyyType11[
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
          T3
        ], XyyType12[T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2], XyyType13[T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
        ).application(context)
      }
    }
  def plus14[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8],
    II9 <: ItemType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
    II10 <: ItemType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
    II11 <: ItemType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
    II12 <: ItemType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
    II13 <: ItemType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
    II14 <: ItemType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T9, II9],
    p10: Plus[II9, T10, II10],
    p11: Plus[II10, T11, II11],
    p12: Plus[II11, T12, II12],
    p13: Plus[II12, T13, II13],
    p14: Plus[II13, T14, II14],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item14[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14], II14] =
    new Application[K, Item14[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14], II14] {
      override def application(context: Context[K]): K#M[II14] = {
        val ii14 = t14.application(context)
        context.append(
            plus13[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13
          ](start, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13).application(context)
          , ii14
          , p14
        )
      }
    }
  def put14[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T14],
    II2 <: ArticleType2[T13, T14],
    II3 <: ArticleType3[T12, T13, T14],
    II4 <: ArticleType4[T11, T12, T13, T14],
    II5 <: ArticleType5[T10, T11, T12, T13, T14],
    II6 <: ArticleType6[T9, T10, T11, T12, T13, T14],
    II7 <: ArticleType7[T8, T9, T10, T11, T12, T13, T14],
    II8 <: ArticleType8[T7, T8, T9, T10, T11, T12, T13, T14],
    II9 <: ArticleType9[T6, T7, T8, T9, T10, T11, T12, T13, T14],
    II10 <: ArticleType10[T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
    II11 <: ArticleType11[T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
    II12 <: ArticleType12[T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
    II13 <: ArticleType13[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
    II14 <: ArticleType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
  ](
    start: K#M[II0],
    p1: Plus[II0, T14, II1],
    p2: Plus[II1, T13, II2],
    p3: Plus[II2, T12, II3],
    p4: Plus[II3, T11, II4],
    p5: Plus[II4, T10, II5],
    p6: Plus[II5, T9, II6],
    p7: Plus[II6, T8, II7],
    p8: Plus[II7, T7, II8],
    p9: Plus[II8, T6, II9],
    p10: Plus[II9, T5, II10],
    p11: Plus[II10, T4, II11],
    p12: Plus[II11, T3, II12],
    p13: Plus[II12, T2, II13],
    p14: Plus[II13, T1, II14],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item14[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14], II14] =
    new Application[K, Item14[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14], II14] {
      override def application(context: Context[K]): K#M[II14] = {
        val ii1 = t1.application(context)
        context.append(
            put13[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13
          ](start, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14).application(context)
          , ii1
          , p14
        )
      }
    }
  def plusII14[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item14[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14], XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] =
    new Application[K, Item14[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14], XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] {
      override def application(context: Context[K]): K#M[XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] = {
        plus14[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, XyyType0, XyyType1[T1], XyyType2[
          T1,
          T2
        ], XyyType3[T1, T2, T3], XyyType4[T1, T2, T3, T4], XyyType5[T1, T2, T3, T4, T5], XyyType6[T1, T2, T3, T4, T5, T6], XyyType7[T1, T2, T3, T4, T5, T6, T7], XyyType8[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8
        ], XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], XyyType12[
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
        ], XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
        ).application(context)
      }
    }
  def putII14[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item14[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14], XyyType14[T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] =
    new Application[K, Item14[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14], XyyType14[T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] {
      override def application(context: Context[K]): K#M[XyyType14[T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put14[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, XyyType0, XyyType1[T14], XyyType2[
          T14,
          T13
        ], XyyType3[T14, T13, T12], XyyType4[T14, T13, T12, T11], XyyType5[T14, T13, T12, T11, T10], XyyType6[T14, T13, T12, T11, T10, T9], XyyType7[
          T14,
          T13,
          T12,
          T11,
          T10,
          T9,
          T8
        ], XyyType8[T14, T13, T12, T11, T10, T9, T8, T7], XyyType9[T14, T13, T12, T11, T10, T9, T8, T7, T6], XyyType10[T14, T13, T12, T11, T10, T9, T8, T7, T6, T5], XyyType11[
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
          T4
        ], XyyType12[T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3], XyyType13[T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2], XyyType14[
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
          T2,
          T1
        ]](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
        ).application(context)
      }
    }
  def plus15[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8],
    II9 <: ItemType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
    II10 <: ItemType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
    II11 <: ItemType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
    II12 <: ItemType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
    II13 <: ItemType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
    II14 <: ItemType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
    II15 <: ItemType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T9, II9],
    p10: Plus[II9, T10, II10],
    p11: Plus[II10, T11, II11],
    p12: Plus[II11, T12, II12],
    p13: Plus[II12, T13, II13],
    p14: Plus[II13, T14, II14],
    p15: Plus[II14, T15, II15],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item15[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15], II15] =
    new Application[K, Item15[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15], II15] {
      override def application(context: Context[K]): K#M[II15] = {
        val ii15 = t15.application(context)
        context.append(
            plus14[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14
          ](start, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14).application(context)
          , ii15
          , p15
        )
      }
    }
  def put15[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T15],
    II2 <: ArticleType2[T14, T15],
    II3 <: ArticleType3[T13, T14, T15],
    II4 <: ArticleType4[T12, T13, T14, T15],
    II5 <: ArticleType5[T11, T12, T13, T14, T15],
    II6 <: ArticleType6[T10, T11, T12, T13, T14, T15],
    II7 <: ArticleType7[T9, T10, T11, T12, T13, T14, T15],
    II8 <: ArticleType8[T8, T9, T10, T11, T12, T13, T14, T15],
    II9 <: ArticleType9[T7, T8, T9, T10, T11, T12, T13, T14, T15],
    II10 <: ArticleType10[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
    II11 <: ArticleType11[T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
    II12 <: ArticleType12[T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
    II13 <: ArticleType13[T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
    II14 <: ArticleType14[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
    II15 <: ArticleType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
  ](
    start: K#M[II0],
    p1: Plus[II0, T15, II1],
    p2: Plus[II1, T14, II2],
    p3: Plus[II2, T13, II3],
    p4: Plus[II3, T12, II4],
    p5: Plus[II4, T11, II5],
    p6: Plus[II5, T10, II6],
    p7: Plus[II6, T9, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T7, II9],
    p10: Plus[II9, T6, II10],
    p11: Plus[II10, T5, II11],
    p12: Plus[II11, T4, II12],
    p13: Plus[II12, T3, II13],
    p14: Plus[II13, T2, II14],
    p15: Plus[II14, T1, II15],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item15[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15], II15] =
    new Application[K, Item15[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15], II15] {
      override def application(context: Context[K]): K#M[II15] = {
        val ii1 = t1.application(context)
        context.append(
            put14[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14
          ](start, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15).application(context)
          , ii1
          , p15
        )
      }
    }
  def plusII15[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item15[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15], XyyType15[
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
      Item15[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15],
      XyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
    ] {
      override def application(context: Context[K]): K#M[XyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] = {
        plus15[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, XyyType0, XyyType1[
          T1
        ], XyyType2[T1, T2], XyyType3[T1, T2, T3], XyyType4[T1, T2, T3, T4], XyyType5[T1, T2, T3, T4, T5], XyyType6[T1, T2, T3, T4, T5, T6], XyyType7[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7
        ], XyyType8[T1, T2, T3, T4, T5, T6, T7, T8], XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], XyyType11[
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
        ], XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], XyyType14[
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
        ], XyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
        ).application(context)
      }
    }
  def putII15[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item15[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15], XyyType15[
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
    T2,
    T1
  ]] =
    new Application[
      K,
      Item15[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15],
      XyyType15[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
    ] {
      override def application(context: Context[K]): K#M[XyyType15[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put15[K, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, XyyType0, XyyType1[
          T15
        ], XyyType2[T15, T14], XyyType3[T15, T14, T13], XyyType4[T15, T14, T13, T12], XyyType5[T15, T14, T13, T12, T11], XyyType6[T15, T14, T13, T12, T11, T10], XyyType7[
          T15,
          T14,
          T13,
          T12,
          T11,
          T10,
          T9
        ], XyyType8[T15, T14, T13, T12, T11, T10, T9, T8], XyyType9[T15, T14, T13, T12, T11, T10, T9, T8, T7], XyyType10[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6], XyyType11[
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
          T5
        ], XyyType12[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4], XyyType13[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3], XyyType14[
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
        ], XyyType15[T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
        ).application(context)
      }
    }
  def plus16[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8],
    II9 <: ItemType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
    II10 <: ItemType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
    II11 <: ItemType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
    II12 <: ItemType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
    II13 <: ItemType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
    II14 <: ItemType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
    II15 <: ItemType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
    II16 <: ItemType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T9, II9],
    p10: Plus[II9, T10, II10],
    p11: Plus[II10, T11, II11],
    p12: Plus[II11, T12, II12],
    p13: Plus[II12, T13, II13],
    p14: Plus[II13, T14, II14],
    p15: Plus[II14, T15, II15],
    p16: Plus[II15, T16, II16],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item16[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16], II16] =
    new Application[K, Item16[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16], II16] {
      override def application(context: Context[K]): K#M[II16] = {
        val ii16 = t16.application(context)
        context.append(
            plus15[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14,
            II15
          ](start, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15)
            .application(context)
          , ii16
          , p16
        )
      }
    }
  def put16[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T16],
    II2 <: ArticleType2[T15, T16],
    II3 <: ArticleType3[T14, T15, T16],
    II4 <: ArticleType4[T13, T14, T15, T16],
    II5 <: ArticleType5[T12, T13, T14, T15, T16],
    II6 <: ArticleType6[T11, T12, T13, T14, T15, T16],
    II7 <: ArticleType7[T10, T11, T12, T13, T14, T15, T16],
    II8 <: ArticleType8[T9, T10, T11, T12, T13, T14, T15, T16],
    II9 <: ArticleType9[T8, T9, T10, T11, T12, T13, T14, T15, T16],
    II10 <: ArticleType10[T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
    II11 <: ArticleType11[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
    II12 <: ArticleType12[T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
    II13 <: ArticleType13[T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
    II14 <: ArticleType14[T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
    II15 <: ArticleType15[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
    II16 <: ArticleType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
  ](
    start: K#M[II0],
    p1: Plus[II0, T16, II1],
    p2: Plus[II1, T15, II2],
    p3: Plus[II2, T14, II3],
    p4: Plus[II3, T13, II4],
    p5: Plus[II4, T12, II5],
    p6: Plus[II5, T11, II6],
    p7: Plus[II6, T10, II7],
    p8: Plus[II7, T9, II8],
    p9: Plus[II8, T8, II9],
    p10: Plus[II9, T7, II10],
    p11: Plus[II10, T6, II11],
    p12: Plus[II11, T5, II12],
    p13: Plus[II12, T4, II13],
    p14: Plus[II13, T3, II14],
    p15: Plus[II14, T2, II15],
    p16: Plus[II15, T1, II16],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item16[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16], II16] =
    new Application[K, Item16[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16], II16] {
      override def application(context: Context[K]): K#M[II16] = {
        val ii1 = t1.application(context)
        context.append(
            put15[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14,
            II15
          ](start, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16)
            .application(context)
          , ii1
          , p16
        )
      }
    }
  def plusII16[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item16[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16], XyyType16[
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
      Item16[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16],
      XyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
    ] {
      override def application(context: Context[K]): K#M[XyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] = {
        plus16[
          K,
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
          XyyType0,
          XyyType1[T1],
          XyyType2[T1, T2],
          XyyType3[T1, T2, T3],
          XyyType4[T1, T2, T3, T4],
          XyyType5[T1, T2, T3, T4, T5],
          XyyType6[T1, T2, T3, T4, T5, T6],
          XyyType7[T1, T2, T3, T4, T5, T6, T7],
          XyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
          XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
          XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
          XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
          XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
          XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
          XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
          XyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
          XyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
        ](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , plusPlus16
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
          , t16
        ).application(context)
      }
    }
  def putII16[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item16[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16], XyyType16[
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
    T2,
    T1
  ]] =
    new Application[
      K,
      Item16[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16],
      XyyType16[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
    ] {
      override def application(context: Context[K]): K#M[XyyType16[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put16[
          K,
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
          XyyType0,
          XyyType1[T16],
          XyyType2[T16, T15],
          XyyType3[T16, T15, T14],
          XyyType4[T16, T15, T14, T13],
          XyyType5[T16, T15, T14, T13, T12],
          XyyType6[T16, T15, T14, T13, T12, T11],
          XyyType7[T16, T15, T14, T13, T12, T11, T10],
          XyyType8[T16, T15, T14, T13, T12, T11, T10, T9],
          XyyType9[T16, T15, T14, T13, T12, T11, T10, T9, T8],
          XyyType10[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7],
          XyyType11[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
          XyyType12[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
          XyyType13[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
          XyyType14[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
          XyyType15[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2],
          XyyType16[T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
        ](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , plusPlus16
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
          , t16
        ).application(context)
      }
    }
  def plus17[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8],
    II9 <: ItemType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
    II10 <: ItemType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
    II11 <: ItemType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
    II12 <: ItemType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
    II13 <: ItemType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
    II14 <: ItemType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
    II15 <: ItemType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
    II16 <: ItemType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
    II17 <: ItemType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T9, II9],
    p10: Plus[II9, T10, II10],
    p11: Plus[II10, T11, II11],
    p12: Plus[II11, T12, II12],
    p13: Plus[II12, T13, II13],
    p14: Plus[II13, T14, II14],
    p15: Plus[II14, T15, II15],
    p16: Plus[II15, T16, II16],
    p17: Plus[II16, T17, II17],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item17[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17], II17] =
    new Application[K, Item17[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17], II17] {
      override def application(context: Context[K]): K#M[II17] = {
        val ii17 = t17.application(context)
        context.append(
            plus16[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14,
            II15,
            II16
          ](start, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16)
            .application(context)
          , ii17
          , p17
        )
      }
    }
  def put17[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T17],
    II2 <: ArticleType2[T16, T17],
    II3 <: ArticleType3[T15, T16, T17],
    II4 <: ArticleType4[T14, T15, T16, T17],
    II5 <: ArticleType5[T13, T14, T15, T16, T17],
    II6 <: ArticleType6[T12, T13, T14, T15, T16, T17],
    II7 <: ArticleType7[T11, T12, T13, T14, T15, T16, T17],
    II8 <: ArticleType8[T10, T11, T12, T13, T14, T15, T16, T17],
    II9 <: ArticleType9[T9, T10, T11, T12, T13, T14, T15, T16, T17],
    II10 <: ArticleType10[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
    II11 <: ArticleType11[T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
    II12 <: ArticleType12[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
    II13 <: ArticleType13[T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
    II14 <: ArticleType14[T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
    II15 <: ArticleType15[T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
    II16 <: ArticleType16[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
    II17 <: ArticleType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  ](
    start: K#M[II0],
    p1: Plus[II0, T17, II1],
    p2: Plus[II1, T16, II2],
    p3: Plus[II2, T15, II3],
    p4: Plus[II3, T14, II4],
    p5: Plus[II4, T13, II5],
    p6: Plus[II5, T12, II6],
    p7: Plus[II6, T11, II7],
    p8: Plus[II7, T10, II8],
    p9: Plus[II8, T9, II9],
    p10: Plus[II9, T8, II10],
    p11: Plus[II10, T7, II11],
    p12: Plus[II11, T6, II12],
    p13: Plus[II12, T5, II13],
    p14: Plus[II13, T4, II14],
    p15: Plus[II14, T3, II15],
    p16: Plus[II15, T2, II16],
    p17: Plus[II16, T1, II17],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item17[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17], II17] =
    new Application[K, Item17[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17], II17] {
      override def application(context: Context[K]): K#M[II17] = {
        val ii1 = t1.application(context)
        context.append(
            put16[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14,
            II15,
            II16
          ](start, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17)
            .application(context)
          , ii1
          , p17
        )
      }
    }
  def plusII17[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item17[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17], XyyType17[
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
      Item17[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17],
      XyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
    ] {
      override def application(context: Context[K]): K#M[XyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] = {
        plus17[
          K,
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
          XyyType0,
          XyyType1[T1],
          XyyType2[T1, T2],
          XyyType3[T1, T2, T3],
          XyyType4[T1, T2, T3, T4],
          XyyType5[T1, T2, T3, T4, T5],
          XyyType6[T1, T2, T3, T4, T5, T6],
          XyyType7[T1, T2, T3, T4, T5, T6, T7],
          XyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
          XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
          XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
          XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
          XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
          XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
          XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
          XyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
          XyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
          XyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
        ](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , plusPlus16
          , plusPlus17
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
          , t16
          , t17
        ).application(context)
      }
    }
  def putII17[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item17[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17], XyyType17[
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
    T2,
    T1
  ]] =
    new Application[
      K,
      Item17[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17],
      XyyType17[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
    ] {
      override def application(context: Context[K]): K#M[XyyType17[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put17[
          K,
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
          XyyType0,
          XyyType1[T17],
          XyyType2[T17, T16],
          XyyType3[T17, T16, T15],
          XyyType4[T17, T16, T15, T14],
          XyyType5[T17, T16, T15, T14, T13],
          XyyType6[T17, T16, T15, T14, T13, T12],
          XyyType7[T17, T16, T15, T14, T13, T12, T11],
          XyyType8[T17, T16, T15, T14, T13, T12, T11, T10],
          XyyType9[T17, T16, T15, T14, T13, T12, T11, T10, T9],
          XyyType10[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8],
          XyyType11[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7],
          XyyType12[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
          XyyType13[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
          XyyType14[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
          XyyType15[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
          XyyType16[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2],
          XyyType17[T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
        ](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , plusPlus16
          , plusPlus17
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
          , t16
          , t17
        ).application(context)
      }
    }
  def plus18[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8],
    II9 <: ItemType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
    II10 <: ItemType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
    II11 <: ItemType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
    II12 <: ItemType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
    II13 <: ItemType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
    II14 <: ItemType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
    II15 <: ItemType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
    II16 <: ItemType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
    II17 <: ItemType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
    II18 <: ItemType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T9, II9],
    p10: Plus[II9, T10, II10],
    p11: Plus[II10, T11, II11],
    p12: Plus[II11, T12, II12],
    p13: Plus[II12, T13, II13],
    p14: Plus[II13, T14, II14],
    p15: Plus[II14, T15, II15],
    p16: Plus[II15, T16, II16],
    p17: Plus[II16, T17, II17],
    p18: Plus[II17, T18, II18],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item18[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18], II18] =
    new Application[K, Item18[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18], II18] {
      override def application(context: Context[K]): K#M[II18] = {
        val ii18 = t18.application(context)
        context.append(
            plus17[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14,
            II15,
            II16,
            II17
          ](start, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17)
            .application(context)
          , ii18
          , p18
        )
      }
    }
  def put18[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T18],
    II2 <: ArticleType2[T17, T18],
    II3 <: ArticleType3[T16, T17, T18],
    II4 <: ArticleType4[T15, T16, T17, T18],
    II5 <: ArticleType5[T14, T15, T16, T17, T18],
    II6 <: ArticleType6[T13, T14, T15, T16, T17, T18],
    II7 <: ArticleType7[T12, T13, T14, T15, T16, T17, T18],
    II8 <: ArticleType8[T11, T12, T13, T14, T15, T16, T17, T18],
    II9 <: ArticleType9[T10, T11, T12, T13, T14, T15, T16, T17, T18],
    II10 <: ArticleType10[T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
    II11 <: ArticleType11[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
    II12 <: ArticleType12[T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
    II13 <: ArticleType13[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
    II14 <: ArticleType14[T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
    II15 <: ArticleType15[T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
    II16 <: ArticleType16[T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
    II17 <: ArticleType17[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
    II18 <: ArticleType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  ](
    start: K#M[II0],
    p1: Plus[II0, T18, II1],
    p2: Plus[II1, T17, II2],
    p3: Plus[II2, T16, II3],
    p4: Plus[II3, T15, II4],
    p5: Plus[II4, T14, II5],
    p6: Plus[II5, T13, II6],
    p7: Plus[II6, T12, II7],
    p8: Plus[II7, T11, II8],
    p9: Plus[II8, T10, II9],
    p10: Plus[II9, T9, II10],
    p11: Plus[II10, T8, II11],
    p12: Plus[II11, T7, II12],
    p13: Plus[II12, T6, II13],
    p14: Plus[II13, T5, II14],
    p15: Plus[II14, T4, II15],
    p16: Plus[II15, T3, II16],
    p17: Plus[II16, T2, II17],
    p18: Plus[II17, T1, II18],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item18[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18], II18] =
    new Application[K, Item18[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18], II18] {
      override def application(context: Context[K]): K#M[II18] = {
        val ii1 = t1.application(context)
        context.append(
            put17[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14,
            II15,
            II16,
            II17
          ](
            start,
            p1,
            p2,
            p3,
            p4,
            p5,
            p6,
            p7,
            p8,
            p9,
            p10,
            p11,
            p12,
            p13,
            p14,
            p15,
            p16,
            p17,
            t2,
            t3,
            t4,
            t5,
            t6,
            t7,
            t8,
            t9,
            t10,
            t11,
            t12,
            t13,
            t14,
            t15,
            t16,
            t17,
            t18
          ).application(context)
          , ii1
          , p18
        )
      }
    }
  def plusII18[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item18[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18], XyyType18[
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
      Item18[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18],
      XyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
    ] {
      override def application(context: Context[K]): K#M[XyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] = {
        plus18[
          K,
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
          XyyType0,
          XyyType1[T1],
          XyyType2[T1, T2],
          XyyType3[T1, T2, T3],
          XyyType4[T1, T2, T3, T4],
          XyyType5[T1, T2, T3, T4, T5],
          XyyType6[T1, T2, T3, T4, T5, T6],
          XyyType7[T1, T2, T3, T4, T5, T6, T7],
          XyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
          XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
          XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
          XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
          XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
          XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
          XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
          XyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
          XyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
          XyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
          XyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
        ](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , plusPlus16
          , plusPlus17
          , plusPlus18
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
          , t16
          , t17
          , t18
        ).application(context)
      }
    }
  def putII18[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item18[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18], XyyType18[
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
    T2,
    T1
  ]] =
    new Application[
      K,
      Item18[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18],
      XyyType18[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
    ] {
      override def application(context: Context[K]): K#M[XyyType18[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put18[
          K,
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
          XyyType0,
          XyyType1[T18],
          XyyType2[T18, T17],
          XyyType3[T18, T17, T16],
          XyyType4[T18, T17, T16, T15],
          XyyType5[T18, T17, T16, T15, T14],
          XyyType6[T18, T17, T16, T15, T14, T13],
          XyyType7[T18, T17, T16, T15, T14, T13, T12],
          XyyType8[T18, T17, T16, T15, T14, T13, T12, T11],
          XyyType9[T18, T17, T16, T15, T14, T13, T12, T11, T10],
          XyyType10[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9],
          XyyType11[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8],
          XyyType12[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7],
          XyyType13[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
          XyyType14[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
          XyyType15[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
          XyyType16[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
          XyyType17[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2],
          XyyType18[T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
        ](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , plusPlus16
          , plusPlus17
          , plusPlus18
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
          , t16
          , t17
          , t18
        ).application(context)
      }
    }
  def plus19[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8],
    II9 <: ItemType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
    II10 <: ItemType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
    II11 <: ItemType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
    II12 <: ItemType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
    II13 <: ItemType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
    II14 <: ItemType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
    II15 <: ItemType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
    II16 <: ItemType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
    II17 <: ItemType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
    II18 <: ItemType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
    II19 <: ItemType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T9, II9],
    p10: Plus[II9, T10, II10],
    p11: Plus[II10, T11, II11],
    p12: Plus[II11, T12, II12],
    p13: Plus[II12, T13, II13],
    p14: Plus[II13, T14, II14],
    p15: Plus[II14, T15, II15],
    p16: Plus[II15, T16, II16],
    p17: Plus[II16, T17, II17],
    p18: Plus[II17, T18, II18],
    p19: Plus[II18, T19, II19],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item19[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19], II19] =
    new Application[K, Item19[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19], II19] {
      override def application(context: Context[K]): K#M[II19] = {
        val ii19 = t19.application(context)
        context.append(
            plus18[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14,
            II15,
            II16,
            II17,
            II18
          ](
            start,
            p1,
            p2,
            p3,
            p4,
            p5,
            p6,
            p7,
            p8,
            p9,
            p10,
            p11,
            p12,
            p13,
            p14,
            p15,
            p16,
            p17,
            p18,
            t1,
            t2,
            t3,
            t4,
            t5,
            t6,
            t7,
            t8,
            t9,
            t10,
            t11,
            t12,
            t13,
            t14,
            t15,
            t16,
            t17,
            t18
          ).application(context)
          , ii19
          , p19
        )
      }
    }
  def put19[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T19],
    II2 <: ArticleType2[T18, T19],
    II3 <: ArticleType3[T17, T18, T19],
    II4 <: ArticleType4[T16, T17, T18, T19],
    II5 <: ArticleType5[T15, T16, T17, T18, T19],
    II6 <: ArticleType6[T14, T15, T16, T17, T18, T19],
    II7 <: ArticleType7[T13, T14, T15, T16, T17, T18, T19],
    II8 <: ArticleType8[T12, T13, T14, T15, T16, T17, T18, T19],
    II9 <: ArticleType9[T11, T12, T13, T14, T15, T16, T17, T18, T19],
    II10 <: ArticleType10[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
    II11 <: ArticleType11[T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
    II12 <: ArticleType12[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
    II13 <: ArticleType13[T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
    II14 <: ArticleType14[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
    II15 <: ArticleType15[T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
    II16 <: ArticleType16[T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
    II17 <: ArticleType17[T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
    II18 <: ArticleType18[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
    II19 <: ArticleType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  ](
    start: K#M[II0],
    p1: Plus[II0, T19, II1],
    p2: Plus[II1, T18, II2],
    p3: Plus[II2, T17, II3],
    p4: Plus[II3, T16, II4],
    p5: Plus[II4, T15, II5],
    p6: Plus[II5, T14, II6],
    p7: Plus[II6, T13, II7],
    p8: Plus[II7, T12, II8],
    p9: Plus[II8, T11, II9],
    p10: Plus[II9, T10, II10],
    p11: Plus[II10, T9, II11],
    p12: Plus[II11, T8, II12],
    p13: Plus[II12, T7, II13],
    p14: Plus[II13, T6, II14],
    p15: Plus[II14, T5, II15],
    p16: Plus[II15, T4, II16],
    p17: Plus[II16, T3, II17],
    p18: Plus[II17, T2, II18],
    p19: Plus[II18, T1, II19],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item19[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19], II19] =
    new Application[K, Item19[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19], II19] {
      override def application(context: Context[K]): K#M[II19] = {
        val ii1 = t1.application(context)
        context.append(
            put18[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14,
            II15,
            II16,
            II17,
            II18
          ](
            start,
            p1,
            p2,
            p3,
            p4,
            p5,
            p6,
            p7,
            p8,
            p9,
            p10,
            p11,
            p12,
            p13,
            p14,
            p15,
            p16,
            p17,
            p18,
            t2,
            t3,
            t4,
            t5,
            t6,
            t7,
            t8,
            t9,
            t10,
            t11,
            t12,
            t13,
            t14,
            t15,
            t16,
            t17,
            t18,
            t19
          ).application(context)
          , ii1
          , p19
        )
      }
    }
  def plusII19[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item19[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19], XyyType19[
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
      Item19[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19],
      XyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
    ] {
      override def application(context: Context[K]): K#M[XyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] = {
        plus19[
          K,
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
          XyyType0,
          XyyType1[T1],
          XyyType2[T1, T2],
          XyyType3[T1, T2, T3],
          XyyType4[T1, T2, T3, T4],
          XyyType5[T1, T2, T3, T4, T5],
          XyyType6[T1, T2, T3, T4, T5, T6],
          XyyType7[T1, T2, T3, T4, T5, T6, T7],
          XyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
          XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
          XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
          XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
          XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
          XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
          XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
          XyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
          XyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
          XyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
          XyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
          XyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
        ](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , plusPlus16
          , plusPlus17
          , plusPlus18
          , plusPlus19
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
          , t16
          , t17
          , t18
          , t19
        ).application(context)
      }
    }
  def putII19[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item19[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19], XyyType19[
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
    T2,
    T1
  ]] =
    new Application[
      K,
      Item19[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19],
      XyyType19[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
    ] {
      override def application(context: Context[K]): K#M[XyyType19[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put19[
          K,
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
          XyyType0,
          XyyType1[T19],
          XyyType2[T19, T18],
          XyyType3[T19, T18, T17],
          XyyType4[T19, T18, T17, T16],
          XyyType5[T19, T18, T17, T16, T15],
          XyyType6[T19, T18, T17, T16, T15, T14],
          XyyType7[T19, T18, T17, T16, T15, T14, T13],
          XyyType8[T19, T18, T17, T16, T15, T14, T13, T12],
          XyyType9[T19, T18, T17, T16, T15, T14, T13, T12, T11],
          XyyType10[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10],
          XyyType11[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9],
          XyyType12[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8],
          XyyType13[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7],
          XyyType14[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
          XyyType15[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
          XyyType16[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
          XyyType17[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
          XyyType18[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2],
          XyyType19[T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
        ](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , plusPlus16
          , plusPlus17
          , plusPlus18
          , plusPlus19
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
          , t16
          , t17
          , t18
          , t19
        ).application(context)
      }
    }
  def plus20[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8],
    II9 <: ItemType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
    II10 <: ItemType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
    II11 <: ItemType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
    II12 <: ItemType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
    II13 <: ItemType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
    II14 <: ItemType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
    II15 <: ItemType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
    II16 <: ItemType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
    II17 <: ItemType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
    II18 <: ItemType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
    II19 <: ItemType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
    II20 <: ItemType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T9, II9],
    p10: Plus[II9, T10, II10],
    p11: Plus[II10, T11, II11],
    p12: Plus[II11, T12, II12],
    p13: Plus[II12, T13, II13],
    p14: Plus[II13, T14, II14],
    p15: Plus[II14, T15, II15],
    p16: Plus[II15, T16, II16],
    p17: Plus[II16, T17, II17],
    p18: Plus[II17, T18, II18],
    p19: Plus[II18, T19, II19],
    p20: Plus[II19, T20, II20],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item20[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20], II20] =
    new Application[K, Item20[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20], II20] {
      override def application(context: Context[K]): K#M[II20] = {
        val ii20 = t20.application(context)
        context.append(
            plus19[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14,
            II15,
            II16,
            II17,
            II18,
            II19
          ](
            start,
            p1,
            p2,
            p3,
            p4,
            p5,
            p6,
            p7,
            p8,
            p9,
            p10,
            p11,
            p12,
            p13,
            p14,
            p15,
            p16,
            p17,
            p18,
            p19,
            t1,
            t2,
            t3,
            t4,
            t5,
            t6,
            t7,
            t8,
            t9,
            t10,
            t11,
            t12,
            t13,
            t14,
            t15,
            t16,
            t17,
            t18,
            t19
          ).application(context)
          , ii20
          , p20
        )
      }
    }
  def put20[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T20],
    II2 <: ArticleType2[T19, T20],
    II3 <: ArticleType3[T18, T19, T20],
    II4 <: ArticleType4[T17, T18, T19, T20],
    II5 <: ArticleType5[T16, T17, T18, T19, T20],
    II6 <: ArticleType6[T15, T16, T17, T18, T19, T20],
    II7 <: ArticleType7[T14, T15, T16, T17, T18, T19, T20],
    II8 <: ArticleType8[T13, T14, T15, T16, T17, T18, T19, T20],
    II9 <: ArticleType9[T12, T13, T14, T15, T16, T17, T18, T19, T20],
    II10 <: ArticleType10[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
    II11 <: ArticleType11[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
    II12 <: ArticleType12[T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
    II13 <: ArticleType13[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
    II14 <: ArticleType14[T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
    II15 <: ArticleType15[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
    II16 <: ArticleType16[T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
    II17 <: ArticleType17[T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
    II18 <: ArticleType18[T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
    II19 <: ArticleType19[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
    II20 <: ArticleType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ](
    start: K#M[II0],
    p1: Plus[II0, T20, II1],
    p2: Plus[II1, T19, II2],
    p3: Plus[II2, T18, II3],
    p4: Plus[II3, T17, II4],
    p5: Plus[II4, T16, II5],
    p6: Plus[II5, T15, II6],
    p7: Plus[II6, T14, II7],
    p8: Plus[II7, T13, II8],
    p9: Plus[II8, T12, II9],
    p10: Plus[II9, T11, II10],
    p11: Plus[II10, T10, II11],
    p12: Plus[II11, T9, II12],
    p13: Plus[II12, T8, II13],
    p14: Plus[II13, T7, II14],
    p15: Plus[II14, T6, II15],
    p16: Plus[II15, T5, II16],
    p17: Plus[II16, T4, II17],
    p18: Plus[II17, T3, II18],
    p19: Plus[II18, T2, II19],
    p20: Plus[II19, T1, II20],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item20[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20], II20] =
    new Application[K, Item20[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20], II20] {
      override def application(context: Context[K]): K#M[II20] = {
        val ii1 = t1.application(context)
        context.append(
            put19[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14,
            II15,
            II16,
            II17,
            II18,
            II19
          ](
            start,
            p1,
            p2,
            p3,
            p4,
            p5,
            p6,
            p7,
            p8,
            p9,
            p10,
            p11,
            p12,
            p13,
            p14,
            p15,
            p16,
            p17,
            p18,
            p19,
            t2,
            t3,
            t4,
            t5,
            t6,
            t7,
            t8,
            t9,
            t10,
            t11,
            t12,
            t13,
            t14,
            t15,
            t16,
            t17,
            t18,
            t19,
            t20
          ).application(context)
          , ii1
          , p20
        )
      }
    }
  def plusII20[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item20[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20], XyyType20[
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
      Item20[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20],
      XyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
    ] {
      override def application(context: Context[K]): K#M[XyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] = {
        plus20[
          K,
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
          XyyType0,
          XyyType1[T1],
          XyyType2[T1, T2],
          XyyType3[T1, T2, T3],
          XyyType4[T1, T2, T3, T4],
          XyyType5[T1, T2, T3, T4, T5],
          XyyType6[T1, T2, T3, T4, T5, T6],
          XyyType7[T1, T2, T3, T4, T5, T6, T7],
          XyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
          XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
          XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
          XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
          XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
          XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
          XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
          XyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
          XyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
          XyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
          XyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
          XyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
          XyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
        ](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , plusPlus16
          , plusPlus17
          , plusPlus18
          , plusPlus19
          , plusPlus20
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
          , t16
          , t17
          , t18
          , t19
          , t20
        ).application(context)
      }
    }
  def putII20[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item20[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20], XyyType20[
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
    T2,
    T1
  ]] =
    new Application[
      K,
      Item20[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20],
      XyyType20[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
    ] {
      override def application(context: Context[K]): K#M[XyyType20[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put20[
          K,
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
          XyyType0,
          XyyType1[T20],
          XyyType2[T20, T19],
          XyyType3[T20, T19, T18],
          XyyType4[T20, T19, T18, T17],
          XyyType5[T20, T19, T18, T17, T16],
          XyyType6[T20, T19, T18, T17, T16, T15],
          XyyType7[T20, T19, T18, T17, T16, T15, T14],
          XyyType8[T20, T19, T18, T17, T16, T15, T14, T13],
          XyyType9[T20, T19, T18, T17, T16, T15, T14, T13, T12],
          XyyType10[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11],
          XyyType11[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10],
          XyyType12[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9],
          XyyType13[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8],
          XyyType14[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7],
          XyyType15[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
          XyyType16[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
          XyyType17[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
          XyyType18[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
          XyyType19[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2],
          XyyType20[T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
        ](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , plusPlus16
          , plusPlus17
          , plusPlus18
          , plusPlus19
          , plusPlus20
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
          , t16
          , t17
          , t18
          , t19
          , t20
        ).application(context)
      }
    }
  def plus21[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam,
    T21 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8],
    II9 <: ItemType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
    II10 <: ItemType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
    II11 <: ItemType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
    II12 <: ItemType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
    II13 <: ItemType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
    II14 <: ItemType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
    II15 <: ItemType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
    II16 <: ItemType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
    II17 <: ItemType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
    II18 <: ItemType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
    II19 <: ItemType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
    II20 <: ItemType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
    II21 <: ItemType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T9, II9],
    p10: Plus[II9, T10, II10],
    p11: Plus[II10, T11, II11],
    p12: Plus[II11, T12, II12],
    p13: Plus[II12, T13, II13],
    p14: Plus[II13, T14, II14],
    p15: Plus[II14, T15, II15],
    p16: Plus[II15, T16, II16],
    p17: Plus[II16, T17, II17],
    p18: Plus[II17, T18, II18],
    p19: Plus[II18, T19, II19],
    p20: Plus[II19, T20, II20],
    p21: Plus[II20, T21, II21],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item21[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21], II21] =
    new Application[K, Item21[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21], II21] {
      override def application(context: Context[K]): K#M[II21] = {
        val ii21 = t21.application(context)
        context.append(
            plus20[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14,
            II15,
            II16,
            II17,
            II18,
            II19,
            II20
          ](
            start,
            p1,
            p2,
            p3,
            p4,
            p5,
            p6,
            p7,
            p8,
            p9,
            p10,
            p11,
            p12,
            p13,
            p14,
            p15,
            p16,
            p17,
            p18,
            p19,
            p20,
            t1,
            t2,
            t3,
            t4,
            t5,
            t6,
            t7,
            t8,
            t9,
            t10,
            t11,
            t12,
            t13,
            t14,
            t15,
            t16,
            t17,
            t18,
            t19,
            t20
          ).application(context)
          , ii21
          , p21
        )
      }
    }
  def put21[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam,
    T21 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T21],
    II2 <: ArticleType2[T20, T21],
    II3 <: ArticleType3[T19, T20, T21],
    II4 <: ArticleType4[T18, T19, T20, T21],
    II5 <: ArticleType5[T17, T18, T19, T20, T21],
    II6 <: ArticleType6[T16, T17, T18, T19, T20, T21],
    II7 <: ArticleType7[T15, T16, T17, T18, T19, T20, T21],
    II8 <: ArticleType8[T14, T15, T16, T17, T18, T19, T20, T21],
    II9 <: ArticleType9[T13, T14, T15, T16, T17, T18, T19, T20, T21],
    II10 <: ArticleType10[T12, T13, T14, T15, T16, T17, T18, T19, T20, T21],
    II11 <: ArticleType11[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21],
    II12 <: ArticleType12[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21],
    II13 <: ArticleType13[T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21],
    II14 <: ArticleType14[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21],
    II15 <: ArticleType15[T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21],
    II16 <: ArticleType16[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21],
    II17 <: ArticleType17[T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21],
    II18 <: ArticleType18[T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21],
    II19 <: ArticleType19[T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21],
    II20 <: ArticleType20[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21],
    II21 <: ArticleType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ](
    start: K#M[II0],
    p1: Plus[II0, T21, II1],
    p2: Plus[II1, T20, II2],
    p3: Plus[II2, T19, II3],
    p4: Plus[II3, T18, II4],
    p5: Plus[II4, T17, II5],
    p6: Plus[II5, T16, II6],
    p7: Plus[II6, T15, II7],
    p8: Plus[II7, T14, II8],
    p9: Plus[II8, T13, II9],
    p10: Plus[II9, T12, II10],
    p11: Plus[II10, T11, II11],
    p12: Plus[II11, T10, II12],
    p13: Plus[II12, T9, II13],
    p14: Plus[II13, T8, II14],
    p15: Plus[II14, T7, II15],
    p16: Plus[II15, T6, II16],
    p17: Plus[II16, T5, II17],
    p18: Plus[II17, T4, II18],
    p19: Plus[II18, T3, II19],
    p20: Plus[II19, T2, II20],
    p21: Plus[II20, T1, II21],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item21[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21], II21] =
    new Application[K, Item21[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21], II21] {
      override def application(context: Context[K]): K#M[II21] = {
        val ii1 = t1.application(context)
        context.append(
            put20[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14,
            II15,
            II16,
            II17,
            II18,
            II19,
            II20
          ](
            start,
            p1,
            p2,
            p3,
            p4,
            p5,
            p6,
            p7,
            p8,
            p9,
            p10,
            p11,
            p12,
            p13,
            p14,
            p15,
            p16,
            p17,
            p18,
            p19,
            p20,
            t2,
            t3,
            t4,
            t5,
            t6,
            t7,
            t8,
            t9,
            t10,
            t11,
            t12,
            t13,
            t14,
            t15,
            t16,
            t17,
            t18,
            t19,
            t20,
            t21
          ).application(context)
          , ii1
          , p21
        )
      }
    }
  def plusII21[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam,
    T21 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item21[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21], XyyType21[
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
      Item21[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21],
      XyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
    ] {
      override def application(context: Context[K]): K#M[XyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] = {
        plus21[
          K,
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
          XyyType0,
          XyyType1[T1],
          XyyType2[T1, T2],
          XyyType3[T1, T2, T3],
          XyyType4[T1, T2, T3, T4],
          XyyType5[T1, T2, T3, T4, T5],
          XyyType6[T1, T2, T3, T4, T5, T6],
          XyyType7[T1, T2, T3, T4, T5, T6, T7],
          XyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
          XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
          XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
          XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
          XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
          XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
          XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
          XyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
          XyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
          XyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
          XyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
          XyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
          XyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
          XyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
        ](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , plusPlus16
          , plusPlus17
          , plusPlus18
          , plusPlus19
          , plusPlus20
          , plusPlus21
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
          , t16
          , t17
          , t18
          , t19
          , t20
          , t21
        ).application(context)
      }
    }
  def putII21[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam,
    T21 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item21[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21], XyyType21[
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
    T2,
    T1
  ]] =
    new Application[
      K,
      Item21[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21],
      XyyType21[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
    ] {
      override def application(context: Context[K]): K#M[XyyType21[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put21[
          K,
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
          XyyType0,
          XyyType1[T21],
          XyyType2[T21, T20],
          XyyType3[T21, T20, T19],
          XyyType4[T21, T20, T19, T18],
          XyyType5[T21, T20, T19, T18, T17],
          XyyType6[T21, T20, T19, T18, T17, T16],
          XyyType7[T21, T20, T19, T18, T17, T16, T15],
          XyyType8[T21, T20, T19, T18, T17, T16, T15, T14],
          XyyType9[T21, T20, T19, T18, T17, T16, T15, T14, T13],
          XyyType10[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12],
          XyyType11[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11],
          XyyType12[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10],
          XyyType13[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9],
          XyyType14[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8],
          XyyType15[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7],
          XyyType16[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
          XyyType17[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
          XyyType18[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
          XyyType19[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
          XyyType20[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2],
          XyyType21[T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
        ](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , plusPlus16
          , plusPlus17
          , plusPlus18
          , plusPlus19
          , plusPlus20
          , plusPlus21
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
          , t16
          , t17
          , t18
          , t19
          , t20
          , t21
        ).application(context)
      }
    }
  def plus22[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam,
    T21 <: TypeParam,
    T22 <: TypeParam,
    II0 <: ItemType0,
    II1 <: ItemType1[T1],
    II2 <: ItemType2[T1, T2],
    II3 <: ItemType3[T1, T2, T3],
    II4 <: ItemType4[T1, T2, T3, T4],
    II5 <: ItemType5[T1, T2, T3, T4, T5],
    II6 <: ItemType6[T1, T2, T3, T4, T5, T6],
    II7 <: ItemType7[T1, T2, T3, T4, T5, T6, T7],
    II8 <: ItemType8[T1, T2, T3, T4, T5, T6, T7, T8],
    II9 <: ItemType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
    II10 <: ItemType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
    II11 <: ItemType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
    II12 <: ItemType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
    II13 <: ItemType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
    II14 <: ItemType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
    II15 <: ItemType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
    II16 <: ItemType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
    II17 <: ItemType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
    II18 <: ItemType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
    II19 <: ItemType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
    II20 <: ItemType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
    II21 <: ItemType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21],
    II22 <: ItemType22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ](
    start: K#M[II0],
    p1: Plus[II0, T1, II1],
    p2: Plus[II1, T2, II2],
    p3: Plus[II2, T3, II3],
    p4: Plus[II3, T4, II4],
    p5: Plus[II4, T5, II5],
    p6: Plus[II5, T6, II6],
    p7: Plus[II6, T7, II7],
    p8: Plus[II7, T8, II8],
    p9: Plus[II8, T9, II9],
    p10: Plus[II9, T10, II10],
    p11: Plus[II10, T11, II11],
    p12: Plus[II11, T12, II12],
    p13: Plus[II12, T13, II13],
    p14: Plus[II13, T14, II14],
    p15: Plus[II14, T15, II15],
    p16: Plus[II15, T16, II16],
    p17: Plus[II16, T17, II17],
    p18: Plus[II17, T18, II18],
    p19: Plus[II18, T19, II19],
    p20: Plus[II19, T20, II20],
    p21: Plus[II20, T21, II21],
    p22: Plus[II21, T22, II22],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item22[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22], II22] =
    new Application[K, Item22[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22], II22] {
      override def application(context: Context[K]): K#M[II22] = {
        val ii22 = t22.application(context)
        context.append(
            plus21[
            K,
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
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14,
            II15,
            II16,
            II17,
            II18,
            II19,
            II20,
            II21
          ](
              start
            , p1
            , p2
            , p3
            , p4
            , p5
            , p6
            , p7
            , p8
            , p9
            , p10
            , p11
            , p12
            , p13
            , p14
            , p15
            , p16
            , p17
            , p18
            , p19
            , p20
            , p21
            , t1
            , t2
            , t3
            , t4
            , t5
            , t6
            , t7
            , t8
            , t9
            , t10
            , t11
            , t12
            , t13
            , t14
            , t15
            , t16
            , t17
            , t18
            , t19
            , t20
            , t21
          ).application(context)
          , ii22
          , p22
        )
      }
    }
  def put22[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam,
    T21 <: TypeParam,
    T22 <: TypeParam,
    II0 <: ArticleType0,
    II1 <: ArticleType1[T22],
    II2 <: ArticleType2[T21, T22],
    II3 <: ArticleType3[T20, T21, T22],
    II4 <: ArticleType4[T19, T20, T21, T22],
    II5 <: ArticleType5[T18, T19, T20, T21, T22],
    II6 <: ArticleType6[T17, T18, T19, T20, T21, T22],
    II7 <: ArticleType7[T16, T17, T18, T19, T20, T21, T22],
    II8 <: ArticleType8[T15, T16, T17, T18, T19, T20, T21, T22],
    II9 <: ArticleType9[T14, T15, T16, T17, T18, T19, T20, T21, T22],
    II10 <: ArticleType10[T13, T14, T15, T16, T17, T18, T19, T20, T21, T22],
    II11 <: ArticleType11[T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22],
    II12 <: ArticleType12[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22],
    II13 <: ArticleType13[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22],
    II14 <: ArticleType14[T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22],
    II15 <: ArticleType15[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22],
    II16 <: ArticleType16[T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22],
    II17 <: ArticleType17[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22],
    II18 <: ArticleType18[T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22],
    II19 <: ArticleType19[T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22],
    II20 <: ArticleType20[T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22],
    II21 <: ArticleType21[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22],
    II22 <: ArticleType22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ](
    start: K#M[II0],
    p1: Plus[II0, T22, II1],
    p2: Plus[II1, T21, II2],
    p3: Plus[II2, T20, II3],
    p4: Plus[II3, T19, II4],
    p5: Plus[II4, T18, II5],
    p6: Plus[II5, T17, II6],
    p7: Plus[II6, T16, II7],
    p8: Plus[II7, T15, II8],
    p9: Plus[II8, T14, II9],
    p10: Plus[II9, T13, II10],
    p11: Plus[II10, T12, II11],
    p12: Plus[II11, T11, II12],
    p13: Plus[II12, T10, II13],
    p14: Plus[II13, T9, II14],
    p15: Plus[II14, T8, II15],
    p16: Plus[II15, T7, II16],
    p17: Plus[II16, T6, II17],
    p18: Plus[II17, T5, II18],
    p19: Plus[II18, T4, II19],
    p20: Plus[II19, T3, II20],
    p21: Plus[II20, T2, II21],
    p22: Plus[II21, T1, II22],
    t1: Application[K, H1, T1],
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
  ): Application[K, Item22[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22], II22] =
    new Application[K, Item22[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22], II22] {
      override def application(context: Context[K]): K#M[II22] = {
        val ii1 = t1.application(context)
        context.append(
            put21[
            K,
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
            T22,
            II0,
            II1,
            II2,
            II3,
            II4,
            II5,
            II6,
            II7,
            II8,
            II9,
            II10,
            II11,
            II12,
            II13,
            II14,
            II15,
            II16,
            II17,
            II18,
            II19,
            II20,
            II21
          ](
              start
            , p1
            , p2
            , p3
            , p4
            , p5
            , p6
            , p7
            , p8
            , p9
            , p10
            , p11
            , p12
            , p13
            , p14
            , p15
            , p16
            , p17
            , p18
            , p19
            , p20
            , p21
            , t2
            , t3
            , t4
            , t5
            , t6
            , t7
            , t8
            , t9
            , t10
            , t11
            , t12
            , t13
            , t14
            , t15
            , t16
            , t17
            , t18
            , t19
            , t20
            , t21
            , t22
          ).application(context)
          , ii1
          , p22
        )
      }
    }
  def plusII22[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam,
    T21 <: TypeParam,
    T22 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item22[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22], XyyType22[
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
      Item22[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22],
      XyyType22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
    ] {
      override def application(
        context: Context[K]
      ): K#M[XyyType22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]] = {
        plus22[
          K,
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
          T22,
          XyyType0,
          XyyType1[T1],
          XyyType2[T1, T2],
          XyyType3[T1, T2, T3],
          XyyType4[T1, T2, T3, T4],
          XyyType5[T1, T2, T3, T4, T5],
          XyyType6[T1, T2, T3, T4, T5, T6],
          XyyType7[T1, T2, T3, T4, T5, T6, T7],
          XyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
          XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9],
          XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10],
          XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11],
          XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12],
          XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13],
          XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14],
          XyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
          XyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
          XyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
          XyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
          XyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
          XyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
          XyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21],
          XyyType22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
        ](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , plusPlus16
          , plusPlus17
          , plusPlus18
          , plusPlus19
          , plusPlus20
          , plusPlus21
          , plusPlus22
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
          , t16
          , t17
          , t18
          , t19
          , t20
          , t21
          , t22
        ).application(context)
      }
    }
  def putII22[
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
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam,
    T21 <: TypeParam,
    T22 <: TypeParam
  ](
    t1: Application[K, H1, T1],
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
  ): Application[K, Item22[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22], XyyType22[
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
    T2,
    T1
  ]] =
    new Application[
      K,
      Item22[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22],
      XyyType22[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
    ] {
      override def application(
        context: Context[K]
      ): K#M[XyyType22[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]] = {
        put22[
          K,
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
          T22,
          XyyType0,
          XyyType1[T22],
          XyyType2[T22, T21],
          XyyType3[T22, T21, T20],
          XyyType4[T22, T21, T20, T19],
          XyyType5[T22, T21, T20, T19, T18],
          XyyType6[T22, T21, T20, T19, T18, T17],
          XyyType7[T22, T21, T20, T19, T18, T17, T16],
          XyyType8[T22, T21, T20, T19, T18, T17, T16, T15],
          XyyType9[T22, T21, T20, T19, T18, T17, T16, T15, T14],
          XyyType10[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13],
          XyyType11[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12],
          XyyType12[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11],
          XyyType13[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10],
          XyyType14[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9],
          XyyType15[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8],
          XyyType16[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7],
          XyyType17[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6],
          XyyType18[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5],
          XyyType19[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4],
          XyyType20[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3],
          XyyType21[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2],
          XyyType22[T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1]
        ](
            context.start
          , plusPlus1
          , plusPlus2
          , plusPlus3
          , plusPlus4
          , plusPlus5
          , plusPlus6
          , plusPlus7
          , plusPlus8
          , plusPlus9
          , plusPlus10
          , plusPlus11
          , plusPlus12
          , plusPlus13
          , plusPlus14
          , plusPlus15
          , plusPlus16
          , plusPlus17
          , plusPlus18
          , plusPlus19
          , plusPlus20
          , plusPlus21
          , plusPlus22
          , t1
          , t2
          , t3
          , t4
          , t5
          , t6
          , t7
          , t8
          , t9
          , t10
          , t11
          , t12
          , t13
          , t14
          , t15
          , t16
          , t17
          , t18
          , t19
          , t20
          , t21
          , t22
        ).application(context)
      }
    }
  def plusPlus2[T1 <: TypeParam, T2 <: TypeParam]: Plus[XyyType1[T1], T2, XyyType2[T1, T2]] = new Plus[XyyType1[T1], T2, XyyType2[T1, T2]] {
    override def plus(p: AppendXyy1[T1#H], item: T2#H): AppendXyy2[T1#H, T2#H] = p.eat(item)
    override def sub: Plus[XyyType1[T1#T], T2#T, XyyType2[T1#T, T2#T]]         = plusPlus2[T1#T, T2#T]
  }
  def plusPlus3[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam]: Plus[XyyType2[T1, T2], T3, XyyType3[T1, T2, T3]] =
    new Plus[XyyType2[T1, T2], T3, XyyType3[T1, T2, T3]] {
      override def plus(p: AppendXyy2[T1#H, T2#H], item: T3#H): AppendXyy3[T1#H, T2#H, T3#H] = p.eat(item)
      override def sub: Plus[XyyType2[T1#T, T2#T], T3#T, XyyType3[T1#T, T2#T, T3#T]]         = plusPlus3[T1#T, T2#T, T3#T]
    }
  def plusPlus4[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam]: Plus[XyyType3[T1, T2, T3], T4, XyyType4[T1, T2, T3, T4]] =
    new Plus[XyyType3[T1, T2, T3], T4, XyyType4[T1, T2, T3, T4]] {
      override def plus(p: AppendXyy3[T1#H, T2#H, T3#H], item: T4#H): AppendXyy4[T1#H, T2#H, T3#H, T4#H] = p.eat(item)
      override def sub: Plus[XyyType3[T1#T, T2#T, T3#T], T4#T, XyyType4[T1#T, T2#T, T3#T, T4#T]]         = plusPlus4[T1#T, T2#T, T3#T, T4#T]
    }
  def plusPlus5[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam, T5 <: TypeParam]: Plus[XyyType4[T1, T2, T3, T4], T5, XyyType5[T1, T2, T3, T4, T5]] =
    new Plus[XyyType4[T1, T2, T3, T4], T5, XyyType5[T1, T2, T3, T4, T5]] {
      override def plus(p: AppendXyy4[T1#H, T2#H, T3#H, T4#H], item: T5#H): AppendXyy5[T1#H, T2#H, T3#H, T4#H, T5#H] = p.eat(item)
      override def sub: Plus[XyyType4[T1#T, T2#T, T3#T, T4#T], T5#T, XyyType5[T1#T, T2#T, T3#T, T4#T, T5#T]]         = plusPlus5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def plusPlus6[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam, T5 <: TypeParam, T6 <: TypeParam]
    : Plus[XyyType5[T1, T2, T3, T4, T5], T6, XyyType6[T1, T2, T3, T4, T5, T6]] = new Plus[XyyType5[T1, T2, T3, T4, T5], T6, XyyType6[T1, T2, T3, T4, T5, T6]] {
    override def plus(p: AppendXyy5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): AppendXyy6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] = p.eat(item)
    override def sub: Plus[XyyType5[T1#T, T2#T, T3#T, T4#T, T5#T], T6#T, XyyType6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]]         = plusPlus6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
  }
  def plusPlus7[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam, T5 <: TypeParam, T6 <: TypeParam, T7 <: TypeParam]
    : Plus[XyyType6[T1, T2, T3, T4, T5, T6], T7, XyyType7[T1, T2, T3, T4, T5, T6, T7]] =
    new Plus[XyyType6[T1, T2, T3, T4, T5, T6], T7, XyyType7[T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: AppendXyy6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): AppendXyy7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] = p.eat(item)
      override def sub: Plus[XyyType6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T], T7#T, XyyType7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]] =
        plusPlus7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def plusPlus8[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam, T5 <: TypeParam, T6 <: TypeParam, T7 <: TypeParam, T8 <: TypeParam]
    : Plus[XyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyType8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new Plus[XyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyType8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: AppendXyy7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): AppendXyy8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] = p.eat(item)
      override def sub: Plus[XyyType7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T], T8#T, XyyType8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]] =
        plusPlus8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def plusPlus9[T1 <: TypeParam, T2 <: TypeParam, T3 <: TypeParam, T4 <: TypeParam, T5 <: TypeParam, T6 <: TypeParam, T7 <: TypeParam, T8 <: TypeParam, T9 <: TypeParam]
    : Plus[XyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new Plus[XyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def plus(p: AppendXyy8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): AppendXyy9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H] =
        p.eat(item)
      override def sub: Plus[XyyType8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T], T9#T, XyyType9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]] =
        plusPlus9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
  def plusPlus10[
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam
  ]: Plus[XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new Plus[XyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def plus(
        p: AppendXyy9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H],
        item: T10#H
      ): AppendXyy10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H] = p.eat(item)
      override def sub
        : Plus[XyyType9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T], T10#T, XyyType10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]] =
        plusPlus10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
  def plusPlus11[
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam
  ]: Plus[XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new Plus[XyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {
      override def plus(
        p: AppendXyy10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H],
        item: T11#H
      ): AppendXyy11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H] = p.eat(item)
      override def sub: Plus[XyyType10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T], T11#T, XyyType11[
        T1#T,
        T2#T,
        T3#T,
        T4#T,
        T5#T,
        T6#T,
        T7#T,
        T8#T,
        T9#T,
        T10#T,
        T11#T
      ]] = plusPlus11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
  def plusPlus12[
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam
  ]: Plus[XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] =
    new Plus[XyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] {
      override def plus(
        p: AppendXyy11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H],
        item: T12#H
      ): AppendXyy12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H] = p.eat(item)
      override def sub: Plus[XyyType11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T], T12#T, XyyType12[
        T1#T,
        T2#T,
        T3#T,
        T4#T,
        T5#T,
        T6#T,
        T7#T,
        T8#T,
        T9#T,
        T10#T,
        T11#T,
        T12#T
      ]] = plusPlus12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T]
    }
  def plusPlus13[
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam
  ]: Plus[XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13, XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] =
    new Plus[XyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13, XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] {
      override def plus(
        p: AppendXyy12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H],
        item: T13#H
      ): AppendXyy13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H] = p.eat(item)
      override def sub: Plus[XyyType12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T], T13#T, XyyType13[
        T1#T,
        T2#T,
        T3#T,
        T4#T,
        T5#T,
        T6#T,
        T7#T,
        T8#T,
        T9#T,
        T10#T,
        T11#T,
        T12#T,
        T13#T
      ]] = plusPlus13[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T]
    }
  def plusPlus14[
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam
  ]: Plus[XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14, XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] =
    new Plus[XyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14, XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] {
      override def plus(
        p: AppendXyy13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H],
        item: T14#H
      ): AppendXyy14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H] = p.eat(item)
      override def sub: Plus[XyyType13[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T], T14#T, XyyType14[
        T1#T,
        T2#T,
        T3#T,
        T4#T,
        T5#T,
        T6#T,
        T7#T,
        T8#T,
        T9#T,
        T10#T,
        T11#T,
        T12#T,
        T13#T,
        T14#T
      ]] = plusPlus14[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T]
    }
  def plusPlus15[
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam
  ]: Plus[XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15, XyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] =
    new Plus[XyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15, XyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] {
      override def plus(
        p: AppendXyy14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H],
        item: T15#H
      ): AppendXyy15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H] = p.eat(item)
      override def sub: Plus[XyyType14[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T], T15#T, XyyType15[
        T1#T,
        T2#T,
        T3#T,
        T4#T,
        T5#T,
        T6#T,
        T7#T,
        T8#T,
        T9#T,
        T10#T,
        T11#T,
        T12#T,
        T13#T,
        T14#T,
        T15#T
      ]] = plusPlus15[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T]
    }
  def plusPlus16[
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam
  ]: Plus[XyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, XyyType16[
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
    new Plus[
      XyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15],
      T16,
      XyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
    ] {
      override def plus(
        p: AppendXyy15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H],
        item: T16#H
      ): AppendXyy16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H] = p.eat(item)
      override def sub: Plus[XyyType15[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T], T16#T, XyyType16[
        T1#T,
        T2#T,
        T3#T,
        T4#T,
        T5#T,
        T6#T,
        T7#T,
        T8#T,
        T9#T,
        T10#T,
        T11#T,
        T12#T,
        T13#T,
        T14#T,
        T15#T,
        T16#T
      ]] = plusPlus16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
  def plusPlus17[
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam
  ]: Plus[XyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17, XyyType17[
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
    new Plus[
      XyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16],
      T17,
      XyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
    ] {
      override def plus(
        p: AppendXyy16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
        item: T17#H
      ): AppendXyy17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H] = p.eat(item)
      override def sub: Plus[XyyType16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T], T17#T, XyyType17[
        T1#T,
        T2#T,
        T3#T,
        T4#T,
        T5#T,
        T6#T,
        T7#T,
        T8#T,
        T9#T,
        T10#T,
        T11#T,
        T12#T,
        T13#T,
        T14#T,
        T15#T,
        T16#T,
        T17#T
      ]] = plusPlus17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
  def plusPlus18[
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam
  ]: Plus[XyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18, XyyType18[
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
    new Plus[
      XyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17],
      T18,
      XyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
    ] {
      override def plus(
        p: AppendXyy17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H],
        item: T18#H
      ): AppendXyy18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H] = p.eat(item)
      override def sub: Plus[XyyType17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T], T18#T, XyyType18[
        T1#T,
        T2#T,
        T3#T,
        T4#T,
        T5#T,
        T6#T,
        T7#T,
        T8#T,
        T9#T,
        T10#T,
        T11#T,
        T12#T,
        T13#T,
        T14#T,
        T15#T,
        T16#T,
        T17#T,
        T18#T
      ]] = plusPlus18[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T]
    }
  def plusPlus19[
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam
  ]: Plus[XyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19, XyyType19[
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
    new Plus[
      XyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18],
      T19,
      XyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
    ] {
      override def plus(
        p: AppendXyy18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H],
        item: T19#H
      ): AppendXyy19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H] = p.eat(item)
      override def sub: Plus[
        XyyType18[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T],
        T19#T,
        XyyType19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T]
      ] = plusPlus19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T]
    }
  def plusPlus20[
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam
  ]: Plus[XyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20, XyyType20[
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
    new Plus[
      XyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19],
      T20,
      XyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
    ] {
      override def plus(
        p: AppendXyy19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H],
        item: T20#H
      ): AppendXyy20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H] = p.eat(item)
      override def sub: Plus[
        XyyType19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T],
        T20#T,
        XyyType20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T]
      ] = plusPlus20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T]
    }
  def plusPlus21[
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam,
    T21 <: TypeParam
  ]: Plus[XyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21, XyyType21[
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
    new Plus[
      XyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20],
      T21,
      XyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
    ] {
      override def plus(
        p: AppendXyy20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H],
        item: T21#H
      ): AppendXyy21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H] =
        p.eat(item)
      override def sub: Plus[
        XyyType20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T],
        T21#T,
        XyyType21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T]
      ] = plusPlus21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T]
    }
  def plusPlus22[
    T1 <: TypeParam,
    T2 <: TypeParam,
    T3 <: TypeParam,
    T4 <: TypeParam,
    T5 <: TypeParam,
    T6 <: TypeParam,
    T7 <: TypeParam,
    T8 <: TypeParam,
    T9 <: TypeParam,
    T10 <: TypeParam,
    T11 <: TypeParam,
    T12 <: TypeParam,
    T13 <: TypeParam,
    T14 <: TypeParam,
    T15 <: TypeParam,
    T16 <: TypeParam,
    T17 <: TypeParam,
    T18 <: TypeParam,
    T19 <: TypeParam,
    T20 <: TypeParam,
    T21 <: TypeParam,
    T22 <: TypeParam
  ]: Plus[XyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T22, XyyType22[
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
    new Plus[
      XyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21],
      T22,
      XyyType22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
    ] {
      override def plus(
        p: AppendXyy21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H],
        item: T22#H
      ): AppendXyy22[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H, T22#H] =
        p.eat(item)
      override def sub: Plus[
        XyyType21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T],
        T22#T,
        XyyType22[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T, T22#T]
      ] = plusPlus22[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T, T22#T]
    }
}
