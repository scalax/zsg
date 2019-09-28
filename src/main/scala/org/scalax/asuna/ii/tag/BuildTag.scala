package org.scalax.asuna.mapper.item
import shapeless._
trait BuildTagContect {
  def lift[T](tag: => org.scalax.asuna.mapper.AppendTag[T]): org.scalax.asuna.mapper.AppendTag[T] = new org.scalax.asuna.mapper.AppendTag[T]
  def tag[T1](t1: org.scalax.asuna.mapper.AppendTag[T1]): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag1[T1, Asuna.`Number: 1`]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag1[T1, Asuna.`Number: 1`]]
  def nodeTag[T1 <: org.scalax.asuna.mapper.item.ItemTag](
    t1: org.scalax.asuna.mapper.AppendTag[T1]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag1[T1, Asuna.`Number: 1`]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag1[T1, Asuna.`Number: 1`]]
  def item1[T1](t1: T1): ContextContent[org.scalax.asuna.mapper.item.Item1[T1]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item1[T1]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](c: org.scalax.asuna.mapper.Context[K]): org.scalax.asuna.mapper.item.Item1[T1] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem1(t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem1(EatValue0.addRightItem(t1))
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem1(t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem1(EatValue0.addRightItem(t1))
          }
        }
      }
    }
  def nodeItem1[T1](t1: ContextContent[T1]): ContextContent[org.scalax.asuna.mapper.item.Item1[T1]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item1[T1]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](c: org.scalax.asuna.mapper.Context[K]): org.scalax.asuna.mapper.item.Item1[T1] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem1(t1.withContext(c) :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem1(EatValue0.addRightItem(t1.withContext(c)))
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem1(t1.withContext(c) :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem1(EatValue0.addRightItem(t1.withContext(c)))
          }
        }
      }
    }
  def tag[T1, T2](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag2[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag2[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`]]
  def nodeTag[T1 <: org.scalax.asuna.mapper.item.ItemTag, T2 <: org.scalax.asuna.mapper.item.ItemTag](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag2[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag2[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`]]
  def item2[T1, T2](t1: T1, t2: T2): ContextContent[org.scalax.asuna.mapper.item.Item2[T1, T2]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item2[T1, T2]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](c: org.scalax.asuna.mapper.Context[K]): org.scalax.asuna.mapper.item.Item2[T1, T2] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem2(t1 :: t2 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem2(EatValue0.addRightItem(t2).addRightItem(t1))
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem2(t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem2(EatValue0.addRightItem(t1).addRightItem(t2))
          }
        }
      }
    }
  def nodeItem2[T1, T2](t1: ContextContent[T1], t2: ContextContent[T2]): ContextContent[org.scalax.asuna.mapper.item.Item2[T1, T2]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item2[T1, T2]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](c: org.scalax.asuna.mapper.Context[K]): org.scalax.asuna.mapper.item.Item2[T1, T2] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem2(t1.withContext(c) :: t2.withContext(c) :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem2(EatValue0.addRightItem(t2.withContext(c)).addRightItem(t1.withContext(c)))
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem2(t2.withContext(c) :: t1.withContext(c) :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem2(EatValue0.addRightItem(t1.withContext(c)).addRightItem(t2.withContext(c)))
          }
        }
      }
    }
  def tag[T1, T2, T3](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag3[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`, T3, Asuna.`Number: 3`]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag3[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`, T3, Asuna.`Number: 3`]]
  def nodeTag[T1 <: org.scalax.asuna.mapper.item.ItemTag, T2 <: org.scalax.asuna.mapper.item.ItemTag, T3 <: org.scalax.asuna.mapper.item.ItemTag](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag3[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`, T3, Asuna.`Number: 3`]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag3[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`, T3, Asuna.`Number: 3`]]
  def item3[T1, T2, T3](t1: T1, t2: T2, t3: T3): ContextContent[org.scalax.asuna.mapper.item.Item3[T1, T2, T3]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item3[T1, T2, T3]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](c: org.scalax.asuna.mapper.Context[K]): org.scalax.asuna.mapper.item.Item3[T1, T2, T3] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem3(t1 :: t2 :: t3 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem3(EatValue0.addRightItem(t3).addRightItem(t2).addRightItem(t1))
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem3(t3 :: t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem3(EatValue0.addRightItem(t1).addRightItem(t2).addRightItem(t3))
          }
        }
      }
    }
  def nodeItem3[T1, T2, T3](t1: ContextContent[T1], t2: ContextContent[T2], t3: ContextContent[T3]): ContextContent[org.scalax.asuna.mapper.item.Item3[T1, T2, T3]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item3[T1, T2, T3]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](c: org.scalax.asuna.mapper.Context[K]): org.scalax.asuna.mapper.item.Item3[T1, T2, T3] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem3(t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem3(EatValue0.addRightItem(t3.withContext(c)).addRightItem(t2.withContext(c)).addRightItem(t1.withContext(c)))
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem3(t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem3(EatValue0.addRightItem(t1.withContext(c)).addRightItem(t2.withContext(c)).addRightItem(t3.withContext(c)))
          }
        }
      }
    }
  def tag[T1, T2, T3, T4](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4]
  ): org.scalax.asuna.mapper.AppendTag[
    org.scalax.asuna.mapper.item.ItemTag4[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`, T3, Asuna.`Number: 3`, T4, Asuna.`Number: 4`]
  ] =
    new org.scalax.asuna.mapper.AppendTag[
      org.scalax.asuna.mapper.item.ItemTag4[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`, T3, Asuna.`Number: 3`, T4, Asuna.`Number: 4`]
    ]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4]
  ): org.scalax.asuna.mapper.AppendTag[
    org.scalax.asuna.mapper.item.NodeTag4[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`, T3, Asuna.`Number: 3`, T4, Asuna.`Number: 4`]
  ] =
    new org.scalax.asuna.mapper.AppendTag[
      org.scalax.asuna.mapper.item.NodeTag4[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`, T3, Asuna.`Number: 3`, T4, Asuna.`Number: 4`]
    ]
  def item4[T1, T2, T3, T4](t1: T1, t2: T2, t3: T3, t4: T4): ContextContent[org.scalax.asuna.mapper.item.Item4[T1, T2, T3, T4]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item4[T1, T2, T3, T4]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](c: org.scalax.asuna.mapper.Context[K]): org.scalax.asuna.mapper.item.Item4[T1, T2, T3, T4] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem4(t1 :: t2 :: t3 :: t4 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem4(EatValue0.addRightItem(t4).addRightItem(t3).addRightItem(t2).addRightItem(t1))
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem4(t4 :: t3 :: t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem4(EatValue0.addRightItem(t1).addRightItem(t2).addRightItem(t3).addRightItem(t4))
          }
        }
      }
    }
  def nodeItem4[T1, T2, T3, T4](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4]
  ): ContextContent[org.scalax.asuna.mapper.item.Item4[T1, T2, T3, T4]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item4[T1, T2, T3, T4]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](c: org.scalax.asuna.mapper.Context[K]): org.scalax.asuna.mapper.item.Item4[T1, T2, T3, T4] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem4(t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem4(
              EatValue0.addRightItem(t4.withContext(c)).addRightItem(t3.withContext(c)).addRightItem(t2.withContext(c)).addRightItem(t1.withContext(c))
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem4(t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem4(
              EatValue0.addRightItem(t1.withContext(c)).addRightItem(t2.withContext(c)).addRightItem(t3.withContext(c)).addRightItem(t4.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5]
  ): org.scalax.asuna.mapper.AppendTag[
    org.scalax.asuna.mapper.item.ItemTag5[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`, T3, Asuna.`Number: 3`, T4, Asuna.`Number: 4`, T5, Asuna.`Number: 5`]
  ] =
    new org.scalax.asuna.mapper.AppendTag[
      org.scalax.asuna.mapper.item.ItemTag5[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`, T3, Asuna.`Number: 3`, T4, Asuna.`Number: 4`, T5, Asuna.`Number: 5`]
    ]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5]
  ): org.scalax.asuna.mapper.AppendTag[
    org.scalax.asuna.mapper.item.NodeTag5[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`, T3, Asuna.`Number: 3`, T4, Asuna.`Number: 4`, T5, Asuna.`Number: 5`]
  ] =
    new org.scalax.asuna.mapper.AppendTag[
      org.scalax.asuna.mapper.item.NodeTag5[T1, Asuna.`Number: 1`, T2, Asuna.`Number: 2`, T3, Asuna.`Number: 3`, T4, Asuna.`Number: 4`, T5, Asuna.`Number: 5`]
    ]
  def item5[T1, T2, T3, T4, T5](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5): ContextContent[org.scalax.asuna.mapper.item.Item5[T1, T2, T3, T4, T5]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item5[T1, T2, T3, T4, T5]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item5[T1, T2, T3, T4, T5] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem5(t1 :: t2 :: t3 :: t4 :: t5 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem5(EatValue0.addRightItem(t5).addRightItem(t4).addRightItem(t3).addRightItem(t2).addRightItem(t1))
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem5(t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem5(EatValue0.addRightItem(t1).addRightItem(t2).addRightItem(t3).addRightItem(t4).addRightItem(t5))
          }
        }
      }
    }
  def nodeItem5[T1, T2, T3, T4, T5](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5]
  ): ContextContent[org.scalax.asuna.mapper.item.Item5[T1, T2, T3, T4, T5]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item5[T1, T2, T3, T4, T5]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item5[T1, T2, T3, T4, T5] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem5(
              t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem5(
              EatValue0
                .addRightItem(t5.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t1.withContext(c))
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem5(t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem5(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag6[
    T1,
    Asuna.`Number: 1`,
    T2,
    Asuna.`Number: 2`,
    T3,
    Asuna.`Number: 3`,
    T4,
    Asuna.`Number: 4`,
    T5,
    Asuna.`Number: 5`,
    T6,
    Asuna.`Number: 6`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag6[
      T1,
      Asuna.`Number: 1`,
      T2,
      Asuna.`Number: 2`,
      T3,
      Asuna.`Number: 3`,
      T4,
      Asuna.`Number: 4`,
      T5,
      Asuna.`Number: 5`,
      T6,
      Asuna.`Number: 6`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag6[
    T1,
    Asuna.`Number: 1`,
    T2,
    Asuna.`Number: 2`,
    T3,
    Asuna.`Number: 3`,
    T4,
    Asuna.`Number: 4`,
    T5,
    Asuna.`Number: 5`,
    T6,
    Asuna.`Number: 6`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag6[
      T1,
      Asuna.`Number: 1`,
      T2,
      Asuna.`Number: 2`,
      T3,
      Asuna.`Number: 3`,
      T4,
      Asuna.`Number: 4`,
      T5,
      Asuna.`Number: 5`,
      T6,
      Asuna.`Number: 6`
    ]]
  def item6[T1, T2, T3, T4, T5, T6](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6): ContextContent[org.scalax.asuna.mapper.item.Item6[T1, T2, T3, T4, T5, T6]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item6[T1, T2, T3, T4, T5, T6]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item6[T1, T2, T3, T4, T5, T6] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem6(t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem6(
              EatValue0.addRightItem(t6).addRightItem(t5).addRightItem(t4).addRightItem(t3).addRightItem(t2).addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem6(t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem6(EatValue0.addRightItem(t1).addRightItem(t2).addRightItem(t3).addRightItem(t4).addRightItem(t5).addRightItem(t6))
          }
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
  ): ContextContent[org.scalax.asuna.mapper.item.Item6[T1, T2, T3, T4, T5, T6]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item6[T1, T2, T3, T4, T5, T6]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item6[T1, T2, T3, T4, T5, T6] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem6(
              t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem6(
              EatValue0
                .addRightItem(t6.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t1.withContext(c))
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem6(
              t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem6(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag7[
    T1,
    Asuna.`Number: 1`,
    T2,
    Asuna.`Number: 2`,
    T3,
    Asuna.`Number: 3`,
    T4,
    Asuna.`Number: 4`,
    T5,
    Asuna.`Number: 5`,
    T6,
    Asuna.`Number: 6`,
    T7,
    Asuna.`Number: 7`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag7[
      T1,
      Asuna.`Number: 1`,
      T2,
      Asuna.`Number: 2`,
      T3,
      Asuna.`Number: 3`,
      T4,
      Asuna.`Number: 4`,
      T5,
      Asuna.`Number: 5`,
      T6,
      Asuna.`Number: 6`,
      T7,
      Asuna.`Number: 7`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag7[
    T1,
    Asuna.`Number: 1`,
    T2,
    Asuna.`Number: 2`,
    T3,
    Asuna.`Number: 3`,
    T4,
    Asuna.`Number: 4`,
    T5,
    Asuna.`Number: 5`,
    T6,
    Asuna.`Number: 6`,
    T7,
    Asuna.`Number: 7`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag7[
      T1,
      Asuna.`Number: 1`,
      T2,
      Asuna.`Number: 2`,
      T3,
      Asuna.`Number: 3`,
      T4,
      Asuna.`Number: 4`,
      T5,
      Asuna.`Number: 5`,
      T6,
      Asuna.`Number: 6`,
      T7,
      Asuna.`Number: 7`
    ]]
  def item7[T1, T2, T3, T4, T5, T6, T7](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7
  ): ContextContent[org.scalax.asuna.mapper.item.Item7[T1, T2, T3, T4, T5, T6, T7]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item7[T1, T2, T3, T4, T5, T6, T7]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item7[T1, T2, T3, T4, T5, T6, T7] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem7(t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem7(
              EatValue0.addRightItem(t7).addRightItem(t6).addRightItem(t5).addRightItem(t4).addRightItem(t3).addRightItem(t2).addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem7(t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem7(
              EatValue0.addRightItem(t1).addRightItem(t2).addRightItem(t3).addRightItem(t4).addRightItem(t5).addRightItem(t6).addRightItem(t7)
            )
          }
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
  ): ContextContent[org.scalax.asuna.mapper.item.Item7[T1, T2, T3, T4, T5, T6, T7]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item7[T1, T2, T3, T4, T5, T6, T7]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item7[T1, T2, T3, T4, T5, T6, T7] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem7(
              t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: t7.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem7(
              EatValue0
                .addRightItem(t7.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t1.withContext(c))
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem7(
              t7.withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem7(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag8[
    T1,
    Asuna.`Number: 1`,
    T2,
    Asuna.`Number: 2`,
    T3,
    Asuna.`Number: 3`,
    T4,
    Asuna.`Number: 4`,
    T5,
    Asuna.`Number: 5`,
    T6,
    Asuna.`Number: 6`,
    T7,
    Asuna.`Number: 7`,
    T8,
    Asuna.`Number: 8`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag8[
      T1,
      Asuna.`Number: 1`,
      T2,
      Asuna.`Number: 2`,
      T3,
      Asuna.`Number: 3`,
      T4,
      Asuna.`Number: 4`,
      T5,
      Asuna.`Number: 5`,
      T6,
      Asuna.`Number: 6`,
      T7,
      Asuna.`Number: 7`,
      T8,
      Asuna.`Number: 8`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag8[
    T1,
    Asuna.`Number: 1`,
    T2,
    Asuna.`Number: 2`,
    T3,
    Asuna.`Number: 3`,
    T4,
    Asuna.`Number: 4`,
    T5,
    Asuna.`Number: 5`,
    T6,
    Asuna.`Number: 6`,
    T7,
    Asuna.`Number: 7`,
    T8,
    Asuna.`Number: 8`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag8[
      T1,
      Asuna.`Number: 1`,
      T2,
      Asuna.`Number: 2`,
      T3,
      Asuna.`Number: 3`,
      T4,
      Asuna.`Number: 4`,
      T5,
      Asuna.`Number: 5`,
      T6,
      Asuna.`Number: 6`,
      T7,
      Asuna.`Number: 7`,
      T8,
      Asuna.`Number: 8`
    ]]
  def item8[T1, T2, T3, T4, T5, T6, T7, T8](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8)
    : ContextContent[org.scalax.asuna.mapper.item.Item8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item8[T1, T2, T3, T4, T5, T6, T7, T8] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem8(t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem8(
              EatValue0.addRightItem(t8).addRightItem(t7).addRightItem(t6).addRightItem(t5).addRightItem(t4).addRightItem(t3).addRightItem(t2).addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem8(t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem8(
              EatValue0.addRightItem(t1).addRightItem(t2).addRightItem(t3).addRightItem(t4).addRightItem(t5).addRightItem(t6).addRightItem(t7).addRightItem(t8)
            )
          }
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
  ): ContextContent[org.scalax.asuna.mapper.item.Item8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item8[T1, T2, T3, T4, T5, T6, T7, T8] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem8(
              t1.withContext(c) :: t2
                .withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: t7.withContext(c) :: t8.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem8(
              EatValue0
                .addRightItem(t8.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t1.withContext(c))
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem8(
              t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem8(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
            )
          }
        }
      }
    }
}
object BuildTagContect extends BuildTagContect
