package asuna
trait BuildContent {
  def lift[T](tag: => AppendTag[T]): AppendTag[T] = new AppendTag[T]
  def tag[T1](t1: AppendTag[T1]): AppendTag[ItemTag1[T1, `Number： 1`]] =
    new AppendTag[ItemTag1[T1, `Number： 1`]]
  def nodeTag[T1 <: ItemTag](t1: AppendTag[T1]): AppendTag[NodeTag1[T1, `Number： 1`]] =
    new AppendTag[NodeTag1[T1, `Number： 1`]]
  def item1[T1](t1: T1): ContextContent[Item1[T1]] =
    new ContextContent[Item1[T1]] {
      override def withContext[K <: KindContext](c: Context[K]): Item1[T1] = {
        if (c.isReverse) {
          new ReverseHListItem1(t1 :: HNil)
        } else {
          new HListItem1(t1 :: HNil)
        }
      }
    }
  def nodeItem1[T1](t1: ContextContent[T1]): ContextContent[Item1[T1]] =
    new ContextContent[Item1[T1]] {
      override def withContext[K <: KindContext](c: Context[K]): Item1[T1] = {
        if (c.isReverse) {
          new ReverseHListItem1(t1.withContext(c) :: HNil)
        } else {
          new HListItem1(t1.withContext(c) :: HNil)
        }
      }
    }
  def tag[T1, T2](t1: AppendTag[T1], t2: AppendTag[T2]): AppendTag[ItemTag2[T1, `Number： 1`, T2, `Number： 2`]] =
    new AppendTag[ItemTag2[T1, `Number： 1`, T2, `Number： 2`]]
  def nodeTag[T1 <: ItemTag, T2 <: ItemTag](t1: AppendTag[T1], t2: AppendTag[T2]): AppendTag[NodeTag2[T1, `Number： 1`, T2, `Number： 2`]] =
    new AppendTag[NodeTag2[T1, `Number： 1`, T2, `Number： 2`]]
  def item2[T1, T2](t1: T1, t2: T2): ContextContent[Item2[T1, T2]] =
    new ContextContent[Item2[T1, T2]] {
      override def withContext[K <: KindContext](c: Context[K]): Item2[T1, T2] = {
        if (c.isReverse) {
          new ReverseHListItem2(t1 :: t2 :: HNil)
        } else {
          new HListItem2(t2 :: t1 :: HNil)
        }
      }
    }
  def nodeItem2[T1, T2](t1: ContextContent[T1], t2: ContextContent[T2]): ContextContent[Item2[T1, T2]] =
    new ContextContent[Item2[T1, T2]] {
      override def withContext[K <: KindContext](c: Context[K]): Item2[T1, T2] = {
        if (c.isReverse) {
          new ReverseHListItem2(t1.withContext(c) :: t2.withContext(c) :: HNil)
        } else {
          new HListItem2(t2.withContext(c) :: t1.withContext(c) :: HNil)
        }
      }
    }
  def tag[T1, T2, T3](t1: AppendTag[T1], t2: AppendTag[T2], t3: AppendTag[T3]): AppendTag[ItemTag3[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`]] =
    new AppendTag[ItemTag3[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`]]
  def nodeTag[T1 <: ItemTag, T2 <: ItemTag, T3 <: ItemTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3]
  ): AppendTag[NodeTag3[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`]] =
    new AppendTag[NodeTag3[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`]]
  def item3[T1, T2, T3](t1: T1, t2: T2, t3: T3): ContextContent[Item3[T1, T2, T3]] =
    new ContextContent[Item3[T1, T2, T3]] {
      override def withContext[K <: KindContext](c: Context[K]): Item3[T1, T2, T3] = {
        if (c.isReverse) {
          new ReverseHListItem3(t1 :: t2 :: t3 :: HNil)
        } else {
          new HListItem3(t3 :: t2 :: t1 :: HNil)
        }
      }
    }
  def nodeItem3[T1, T2, T3](t1: ContextContent[T1], t2: ContextContent[T2], t3: ContextContent[T3]): ContextContent[Item3[T1, T2, T3]] =
    new ContextContent[Item3[T1, T2, T3]] {
      override def withContext[K <: KindContext](c: Context[K]): Item3[T1, T2, T3] = {
        if (c.isReverse) {
          new ReverseHListItem3(t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: HNil)
        } else {
          new HListItem3(t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil)
        }
      }
    }
  def tag[T1, T2, T3, T4](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4]
  ): AppendTag[ItemTag4[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`]] =
    new AppendTag[ItemTag4[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`]]
  def nodeTag[T1 <: ItemTag, T2 <: ItemTag, T3 <: ItemTag, T4 <: ItemTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4]
  ): AppendTag[NodeTag4[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`]] =
    new AppendTag[NodeTag4[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`]]
  def item4[T1, T2, T3, T4](t1: T1, t2: T2, t3: T3, t4: T4): ContextContent[Item4[T1, T2, T3, T4]] =
    new ContextContent[Item4[T1, T2, T3, T4]] {
      override def withContext[K <: KindContext](c: Context[K]): Item4[T1, T2, T3, T4] = {
        if (c.isReverse) {
          new ReverseHListItem4(t1 :: t2 :: t3 :: t4 :: HNil)
        } else {
          new HListItem4(t4 :: t3 :: t2 :: t1 :: HNil)
        }
      }
    }
  def nodeItem4[T1, T2, T3, T4](t1: ContextContent[T1], t2: ContextContent[T2], t3: ContextContent[T3], t4: ContextContent[T4]): ContextContent[Item4[T1, T2, T3, T4]] =
    new ContextContent[Item4[T1, T2, T3, T4]] {
      override def withContext[K <: KindContext](c: Context[K]): Item4[T1, T2, T3, T4] = {
        if (c.isReverse) {
          new ReverseHListItem4(t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: HNil)
        } else {
          new HListItem4(t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil)
        }
      }
    }
  def tag[T1, T2, T3, T4, T5](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5]
  ): AppendTag[ItemTag5[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`]] =
    new AppendTag[ItemTag5[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`]]
  def nodeTag[T1 <: ItemTag, T2 <: ItemTag, T3 <: ItemTag, T4 <: ItemTag, T5 <: ItemTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5]
  ): AppendTag[NodeTag5[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`]] =
    new AppendTag[NodeTag5[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`]]
  def item5[T1, T2, T3, T4, T5](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5): ContextContent[Item5[T1, T2, T3, T4, T5]] =
    new ContextContent[Item5[T1, T2, T3, T4, T5]] {
      override def withContext[K <: KindContext](c: Context[K]): Item5[T1, T2, T3, T4, T5] = {
        if (c.isReverse) {
          new ReverseHListItem5(t1 :: t2 :: t3 :: t4 :: t5 :: HNil)
        } else {
          new HListItem5(t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
        }
      }
    }
  def nodeItem5[T1, T2, T3, T4, T5](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5]
  ): ContextContent[Item5[T1, T2, T3, T4, T5]] =
    new ContextContent[Item5[T1, T2, T3, T4, T5]] {
      override def withContext[K <: KindContext](c: Context[K]): Item5[T1, T2, T3, T4, T5] = {
        if (c.isReverse) {
          new ReverseHListItem5(t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: HNil)
        } else {
          new HListItem5(t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil)
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6]
  ): AppendTag[ItemTag6[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`, T6, `Number： 6`]] =
    new AppendTag[ItemTag6[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`, T6, `Number： 6`]]
  def nodeTag[T1 <: ItemTag, T2 <: ItemTag, T3 <: ItemTag, T4 <: ItemTag, T5 <: ItemTag, T6 <: ItemTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6]
  ): AppendTag[NodeTag6[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`, T6, `Number： 6`]] =
    new AppendTag[NodeTag6[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`, T6, `Number： 6`]]
  def item6[T1, T2, T3, T4, T5, T6](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6): ContextContent[Item6[T1, T2, T3, T4, T5, T6]] =
    new ContextContent[Item6[T1, T2, T3, T4, T5, T6]] {
      override def withContext[K <: KindContext](c: Context[K]): Item6[T1, T2, T3, T4, T5, T6] = {
        if (c.isReverse) {
          new ReverseHListItem6(t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: HNil)
        } else {
          new HListItem6(t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
        }
      }
    }
  def nodeItem6[T1, T2, T3, T4, T5, T6](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6]
  ): ContextContent[Item6[T1, T2, T3, T4, T5, T6]] =
    new ContextContent[Item6[T1, T2, T3, T4, T5, T6]] {
      override def withContext[K <: KindContext](c: Context[K]): Item6[T1, T2, T3, T4, T5, T6] = {
        if (c.isReverse) {
          new ReverseHListItem6(t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: HNil)
        } else {
          new HListItem6(t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil)
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6],
    t7: AppendTag[T7]
  ): AppendTag[ItemTag7[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`, T6, `Number： 6`, T7, `Number： 7`]] =
    new AppendTag[ItemTag7[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`, T6, `Number： 6`, T7, `Number： 7`]]
  def nodeTag[T1 <: ItemTag, T2 <: ItemTag, T3 <: ItemTag, T4 <: ItemTag, T5 <: ItemTag, T6 <: ItemTag, T7 <: ItemTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6],
    t7: AppendTag[T7]
  ): AppendTag[NodeTag7[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`, T6, `Number： 6`, T7, `Number： 7`]] =
    new AppendTag[NodeTag7[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`, T6, `Number： 6`, T7, `Number： 7`]]
  def item7[T1, T2, T3, T4, T5, T6, T7](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7): ContextContent[Item7[T1, T2, T3, T4, T5, T6, T7]] =
    new ContextContent[Item7[T1, T2, T3, T4, T5, T6, T7]] {
      override def withContext[K <: KindContext](c: Context[K]): Item7[T1, T2, T3, T4, T5, T6, T7] = {
        if (c.isReverse) {
          new ReverseHListItem7(t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: HNil)
        } else {
          new HListItem7(t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
        }
      }
    }
  def nodeItem7[T1, T2, T3, T4, T5, T6, T7](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7]
  ): ContextContent[Item7[T1, T2, T3, T4, T5, T6, T7]] =
    new ContextContent[Item7[T1, T2, T3, T4, T5, T6, T7]] {
      override def withContext[K <: KindContext](c: Context[K]): Item7[T1, T2, T3, T4, T5, T6, T7] = {
        if (c.isReverse) {
          new ReverseHListItem7(
            t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: t7.withContext(c) :: HNil
          )
        } else {
          new HListItem7(
            t7.withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
          )
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6],
    t7: AppendTag[T7],
    t8: AppendTag[T8]
  ): AppendTag[ItemTag8[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`, T6, `Number： 6`, T7, `Number： 7`, T8, `Number： 8`]] =
    new AppendTag[ItemTag8[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`, T6, `Number： 6`, T7, `Number： 7`, T8, `Number： 8`]]
  def nodeTag[T1 <: ItemTag, T2 <: ItemTag, T3 <: ItemTag, T4 <: ItemTag, T5 <: ItemTag, T6 <: ItemTag, T7 <: ItemTag, T8 <: ItemTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6],
    t7: AppendTag[T7],
    t8: AppendTag[T8]
  ): AppendTag[NodeTag8[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`, T6, `Number： 6`, T7, `Number： 7`, T8, `Number： 8`]] =
    new AppendTag[NodeTag8[T1, `Number： 1`, T2, `Number： 2`, T3, `Number： 3`, T4, `Number： 4`, T5, `Number： 5`, T6, `Number： 6`, T7, `Number： 7`, T8, `Number： 8`]]
  def item8[T1, T2, T3, T4, T5, T6, T7, T8](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8): ContextContent[Item8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new ContextContent[Item8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def withContext[K <: KindContext](c: Context[K]): Item8[T1, T2, T3, T4, T5, T6, T7, T8] = {
        if (c.isReverse) {
          new ReverseHListItem8(t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: HNil)
        } else {
          new HListItem8(t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
        }
      }
    }
  def nodeItem8[T1, T2, T3, T4, T5, T6, T7, T8](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8]
  ): ContextContent[Item8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new ContextContent[Item8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def withContext[K <: KindContext](c: Context[K]): Item8[T1, T2, T3, T4, T5, T6, T7, T8] = {
        if (c.isReverse) {
          new ReverseHListItem8(
            t1.withContext(c) :: t2
              .withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: t7.withContext(c) :: t8.withContext(c) :: HNil
          )
        } else {
          new HListItem8(
            t8.withContext(c) :: t7
              .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
          )
        }
      }
    }
}
object BuildContent extends BuildContent
