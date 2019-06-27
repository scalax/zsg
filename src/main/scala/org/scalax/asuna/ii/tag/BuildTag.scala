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
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag9[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag9[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag,
    T9 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag9[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag9[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`
    ]]
  def item9[T1, T2, T3, T4, T5, T6, T7, T8, T9](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9)
    : ContextContent[org.scalax.asuna.mapper.item.Item9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem9(t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem9(
              EatValue0
                .addRightItem(t9)
                .addRightItem(t8)
                .addRightItem(t7)
                .addRightItem(t6)
                .addRightItem(t5)
                .addRightItem(t4)
                .addRightItem(t3)
                .addRightItem(t2)
                .addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem9(t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem9(
              EatValue0
                .addRightItem(t1)
                .addRightItem(t2)
                .addRightItem(t3)
                .addRightItem(t4)
                .addRightItem(t5)
                .addRightItem(t6)
                .addRightItem(t7)
                .addRightItem(t8)
                .addRightItem(t9)
            )
          }
        }
      }
    }
  def nodeItem9[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8],
    t9: ContextContent[T9]
  ): ContextContent[org.scalax.asuna.mapper.item.Item9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem9(
              t1.withContext(c) :: t2.withContext(c) :: t3
                .withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: t7.withContext(c) :: t8.withContext(c) :: t9.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem9(
              EatValue0
                .addRightItem(t9.withContext(c))
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
            new org.scalax.asuna.mapper.item.HListItem9(
              t9.withContext(c) :: t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem9(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
                .addRightItem(t9.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag10[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag10[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag,
    T9 <: org.scalax.asuna.mapper.item.ItemTag,
    T10 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag10[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag10[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`
    ]]
  def item10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10)
    : ContextContent[org.scalax.asuna.mapper.item.Item10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem10(t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem10(
              EatValue0
                .addRightItem(t10)
                .addRightItem(t9)
                .addRightItem(t8)
                .addRightItem(t7)
                .addRightItem(t6)
                .addRightItem(t5)
                .addRightItem(t4)
                .addRightItem(t3)
                .addRightItem(t2)
                .addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem10(t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem10(
              EatValue0
                .addRightItem(t1)
                .addRightItem(t2)
                .addRightItem(t3)
                .addRightItem(t4)
                .addRightItem(t5)
                .addRightItem(t6)
                .addRightItem(t7)
                .addRightItem(t8)
                .addRightItem(t9)
                .addRightItem(t10)
            )
          }
        }
      }
    }
  def nodeItem10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8],
    t9: ContextContent[T9],
    t10: ContextContent[T10]
  ): ContextContent[org.scalax.asuna.mapper.item.Item10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem10(
              t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4
                .withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: t7.withContext(c) :: t8.withContext(c) :: t9.withContext(c) :: t10.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem10(
              EatValue0
                .addRightItem(t10.withContext(c))
                .addRightItem(t9.withContext(c))
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
            new org.scalax.asuna.mapper.item.HListItem10(
              t10.withContext(c) :: t9.withContext(c) :: t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem10(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
                .addRightItem(t9.withContext(c))
                .addRightItem(t10.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag11[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag11[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag,
    T9 <: org.scalax.asuna.mapper.item.ItemTag,
    T10 <: org.scalax.asuna.mapper.item.ItemTag,
    T11 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag11[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag11[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`
    ]]
  def item11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11)
    : ContextContent[org.scalax.asuna.mapper.item.Item11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem11(t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem11(
              EatValue0
                .addRightItem(t11)
                .addRightItem(t10)
                .addRightItem(t9)
                .addRightItem(t8)
                .addRightItem(t7)
                .addRightItem(t6)
                .addRightItem(t5)
                .addRightItem(t4)
                .addRightItem(t3)
                .addRightItem(t2)
                .addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem11(t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem11(
              EatValue0
                .addRightItem(t1)
                .addRightItem(t2)
                .addRightItem(t3)
                .addRightItem(t4)
                .addRightItem(t5)
                .addRightItem(t6)
                .addRightItem(t7)
                .addRightItem(t8)
                .addRightItem(t9)
                .addRightItem(t10)
                .addRightItem(t11)
            )
          }
        }
      }
    }
  def nodeItem11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8],
    t9: ContextContent[T9],
    t10: ContextContent[T10],
    t11: ContextContent[T11]
  ): ContextContent[org.scalax.asuna.mapper.item.Item11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem11(
              t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5
                .withContext(c) :: t6.withContext(c) :: t7.withContext(c) :: t8.withContext(c) :: t9.withContext(c) :: t10.withContext(c) :: t11.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem11(
              EatValue0
                .addRightItem(t11.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t9.withContext(c))
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
            new org.scalax.asuna.mapper.item.HListItem11(
              t11.withContext(c) :: t10.withContext(c) :: t9.withContext(c) :: t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem11(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
                .addRightItem(t9.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t11.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag12[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag12[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag,
    T9 <: org.scalax.asuna.mapper.item.ItemTag,
    T10 <: org.scalax.asuna.mapper.item.ItemTag,
    T11 <: org.scalax.asuna.mapper.item.ItemTag,
    T12 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag12[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag12[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`
    ]]
  def item12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12)
    : ContextContent[org.scalax.asuna.mapper.item.Item12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem12(t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem12(
              EatValue0
                .addRightItem(t12)
                .addRightItem(t11)
                .addRightItem(t10)
                .addRightItem(t9)
                .addRightItem(t8)
                .addRightItem(t7)
                .addRightItem(t6)
                .addRightItem(t5)
                .addRightItem(t4)
                .addRightItem(t3)
                .addRightItem(t2)
                .addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem12(t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem12(
              EatValue0
                .addRightItem(t1)
                .addRightItem(t2)
                .addRightItem(t3)
                .addRightItem(t4)
                .addRightItem(t5)
                .addRightItem(t6)
                .addRightItem(t7)
                .addRightItem(t8)
                .addRightItem(t9)
                .addRightItem(t10)
                .addRightItem(t11)
                .addRightItem(t12)
            )
          }
        }
      }
    }
  def nodeItem12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8],
    t9: ContextContent[T9],
    t10: ContextContent[T10],
    t11: ContextContent[T11],
    t12: ContextContent[T12]
  ): ContextContent[org.scalax.asuna.mapper.item.Item12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem12(
              t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6
                .withContext(c) :: t7.withContext(c) :: t8.withContext(c) :: t9.withContext(c) :: t10.withContext(c) :: t11.withContext(c) :: t12.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem12(
              EatValue0
                .addRightItem(t12.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t9.withContext(c))
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
            new org.scalax.asuna.mapper.item.HListItem12(
              t12.withContext(c) :: t11.withContext(c) :: t10.withContext(c) :: t9.withContext(c) :: t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem12(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
                .addRightItem(t9.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t12.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag13[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag13[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag,
    T9 <: org.scalax.asuna.mapper.item.ItemTag,
    T10 <: org.scalax.asuna.mapper.item.ItemTag,
    T11 <: org.scalax.asuna.mapper.item.ItemTag,
    T12 <: org.scalax.asuna.mapper.item.ItemTag,
    T13 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag13[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag13[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`
    ]]
  def item13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13
  ): ContextContent[org.scalax.asuna.mapper.item.Item13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem13(t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem13(
              EatValue0
                .addRightItem(t13)
                .addRightItem(t12)
                .addRightItem(t11)
                .addRightItem(t10)
                .addRightItem(t9)
                .addRightItem(t8)
                .addRightItem(t7)
                .addRightItem(t6)
                .addRightItem(t5)
                .addRightItem(t4)
                .addRightItem(t3)
                .addRightItem(t2)
                .addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem13(t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem13(
              EatValue0
                .addRightItem(t1)
                .addRightItem(t2)
                .addRightItem(t3)
                .addRightItem(t4)
                .addRightItem(t5)
                .addRightItem(t6)
                .addRightItem(t7)
                .addRightItem(t8)
                .addRightItem(t9)
                .addRightItem(t10)
                .addRightItem(t11)
                .addRightItem(t12)
                .addRightItem(t13)
            )
          }
        }
      }
    }
  def nodeItem13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8],
    t9: ContextContent[T9],
    t10: ContextContent[T10],
    t11: ContextContent[T11],
    t12: ContextContent[T12],
    t13: ContextContent[T13]
  ): ContextContent[org.scalax.asuna.mapper.item.Item13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem13(
              t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: t7
                .withContext(c) :: t8.withContext(c) :: t9.withContext(c) :: t10.withContext(c) :: t11.withContext(c) :: t12.withContext(c) :: t13.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem13(
              EatValue0
                .addRightItem(t13.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t9.withContext(c))
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
            new org.scalax.asuna.mapper.item.HListItem13(
              t13.withContext(c) :: t12.withContext(c) :: t11.withContext(c) :: t10.withContext(c) :: t9.withContext(c) :: t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem13(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
                .addRightItem(t9.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t13.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag14[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag14[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag,
    T9 <: org.scalax.asuna.mapper.item.ItemTag,
    T10 <: org.scalax.asuna.mapper.item.ItemTag,
    T11 <: org.scalax.asuna.mapper.item.ItemTag,
    T12 <: org.scalax.asuna.mapper.item.ItemTag,
    T13 <: org.scalax.asuna.mapper.item.ItemTag,
    T14 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag14[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag14[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`
    ]]
  def item14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14
  ): ContextContent[org.scalax.asuna.mapper.item.Item14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem14(t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem14(
              EatValue0
                .addRightItem(t14)
                .addRightItem(t13)
                .addRightItem(t12)
                .addRightItem(t11)
                .addRightItem(t10)
                .addRightItem(t9)
                .addRightItem(t8)
                .addRightItem(t7)
                .addRightItem(t6)
                .addRightItem(t5)
                .addRightItem(t4)
                .addRightItem(t3)
                .addRightItem(t2)
                .addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem14(t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem14(
              EatValue0
                .addRightItem(t1)
                .addRightItem(t2)
                .addRightItem(t3)
                .addRightItem(t4)
                .addRightItem(t5)
                .addRightItem(t6)
                .addRightItem(t7)
                .addRightItem(t8)
                .addRightItem(t9)
                .addRightItem(t10)
                .addRightItem(t11)
                .addRightItem(t12)
                .addRightItem(t13)
                .addRightItem(t14)
            )
          }
        }
      }
    }
  def nodeItem14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8],
    t9: ContextContent[T9],
    t10: ContextContent[T10],
    t11: ContextContent[T11],
    t12: ContextContent[T12],
    t13: ContextContent[T13],
    t14: ContextContent[T14]
  ): ContextContent[org.scalax.asuna.mapper.item.Item14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem14(
              t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: t7.withContext(c) :: t8
                .withContext(c) :: t9.withContext(c) :: t10.withContext(c) :: t11.withContext(c) :: t12.withContext(c) :: t13.withContext(c) :: t14.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem14(
              EatValue0
                .addRightItem(t14.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t9.withContext(c))
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
            new org.scalax.asuna.mapper.item.HListItem14(
              t14.withContext(c) :: t13.withContext(c) :: t12.withContext(c) :: t11.withContext(c) :: t10.withContext(c) :: t9.withContext(c) :: t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem14(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
                .addRightItem(t9.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t14.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag15[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag15[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag,
    T9 <: org.scalax.asuna.mapper.item.ItemTag,
    T10 <: org.scalax.asuna.mapper.item.ItemTag,
    T11 <: org.scalax.asuna.mapper.item.ItemTag,
    T12 <: org.scalax.asuna.mapper.item.ItemTag,
    T13 <: org.scalax.asuna.mapper.item.ItemTag,
    T14 <: org.scalax.asuna.mapper.item.ItemTag,
    T15 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag15[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag15[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`
    ]]
  def item15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15
  ): ContextContent[org.scalax.asuna.mapper.item.Item15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem15(t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem15(
              EatValue0
                .addRightItem(t15)
                .addRightItem(t14)
                .addRightItem(t13)
                .addRightItem(t12)
                .addRightItem(t11)
                .addRightItem(t10)
                .addRightItem(t9)
                .addRightItem(t8)
                .addRightItem(t7)
                .addRightItem(t6)
                .addRightItem(t5)
                .addRightItem(t4)
                .addRightItem(t3)
                .addRightItem(t2)
                .addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem15(t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem15(
              EatValue0
                .addRightItem(t1)
                .addRightItem(t2)
                .addRightItem(t3)
                .addRightItem(t4)
                .addRightItem(t5)
                .addRightItem(t6)
                .addRightItem(t7)
                .addRightItem(t8)
                .addRightItem(t9)
                .addRightItem(t10)
                .addRightItem(t11)
                .addRightItem(t12)
                .addRightItem(t13)
                .addRightItem(t14)
                .addRightItem(t15)
            )
          }
        }
      }
    }
  def nodeItem15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8],
    t9: ContextContent[T9],
    t10: ContextContent[T10],
    t11: ContextContent[T11],
    t12: ContextContent[T12],
    t13: ContextContent[T13],
    t14: ContextContent[T14],
    t15: ContextContent[T15]
  ): ContextContent[org.scalax.asuna.mapper.item.Item15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem15(
              t1.withContext(c) :: t2.withContext(c) :: t3
                .withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: t7.withContext(c) :: t8.withContext(c) :: t9.withContext(c) :: t10
                .withContext(c) :: t11.withContext(c) :: t12.withContext(c) :: t13.withContext(c) :: t14.withContext(c) :: t15.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem15(
              EatValue0
                .addRightItem(t15.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t9.withContext(c))
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
            new org.scalax.asuna.mapper.item.HListItem15(
              t15.withContext(c) :: t14
                .withContext(c) :: t13.withContext(c) :: t12.withContext(c) :: t11.withContext(c) :: t10.withContext(c) :: t9.withContext(c) :: t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem15(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
                .addRightItem(t9.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t15.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15],
    t16: org.scalax.asuna.mapper.AppendTag[T16]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag16[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`,
    T16,
    Asuna.`Number: 16`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag16[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`,
      T16,
      Asuna.`Number: 16`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag,
    T9 <: org.scalax.asuna.mapper.item.ItemTag,
    T10 <: org.scalax.asuna.mapper.item.ItemTag,
    T11 <: org.scalax.asuna.mapper.item.ItemTag,
    T12 <: org.scalax.asuna.mapper.item.ItemTag,
    T13 <: org.scalax.asuna.mapper.item.ItemTag,
    T14 <: org.scalax.asuna.mapper.item.ItemTag,
    T15 <: org.scalax.asuna.mapper.item.ItemTag,
    T16 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15],
    t16: org.scalax.asuna.mapper.AppendTag[T16]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag16[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`,
    T16,
    Asuna.`Number: 16`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag16[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`,
      T16,
      Asuna.`Number: 16`
    ]]
  def item16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16
  ): ContextContent[org.scalax.asuna.mapper.item.Item16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem16(
              t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: t16 :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem16(
              EatValue0
                .addRightItem(t16)
                .addRightItem(t15)
                .addRightItem(t14)
                .addRightItem(t13)
                .addRightItem(t12)
                .addRightItem(t11)
                .addRightItem(t10)
                .addRightItem(t9)
                .addRightItem(t8)
                .addRightItem(t7)
                .addRightItem(t6)
                .addRightItem(t5)
                .addRightItem(t4)
                .addRightItem(t3)
                .addRightItem(t2)
                .addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem16(t16 :: t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
          } else {
            new org.scalax.asuna.mapper.item.TreeItem16(
              EatValue0
                .addRightItem(t1)
                .addRightItem(t2)
                .addRightItem(t3)
                .addRightItem(t4)
                .addRightItem(t5)
                .addRightItem(t6)
                .addRightItem(t7)
                .addRightItem(t8)
                .addRightItem(t9)
                .addRightItem(t10)
                .addRightItem(t11)
                .addRightItem(t12)
                .addRightItem(t13)
                .addRightItem(t14)
                .addRightItem(t15)
                .addRightItem(t16)
            )
          }
        }
      }
    }
  def nodeItem16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8],
    t9: ContextContent[T9],
    t10: ContextContent[T10],
    t11: ContextContent[T11],
    t12: ContextContent[T12],
    t13: ContextContent[T13],
    t14: ContextContent[T14],
    t15: ContextContent[T15],
    t16: ContextContent[T16]
  ): ContextContent[org.scalax.asuna.mapper.item.Item16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem16(
              t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4
                .withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: t7.withContext(c) :: t8.withContext(c) :: t9.withContext(c) :: t10.withContext(c) :: t11
                .withContext(c) :: t12.withContext(c) :: t13.withContext(c) :: t14.withContext(c) :: t15.withContext(c) :: t16.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem16(
              EatValue0
                .addRightItem(t16.withContext(c))
                .addRightItem(t15.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t9.withContext(c))
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
            new org.scalax.asuna.mapper.item.HListItem16(
              t16.withContext(c) :: t15.withContext(c) :: t14
                .withContext(c) :: t13.withContext(c) :: t12.withContext(c) :: t11.withContext(c) :: t10.withContext(c) :: t9.withContext(c) :: t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem16(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
                .addRightItem(t9.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t15.withContext(c))
                .addRightItem(t16.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15],
    t16: org.scalax.asuna.mapper.AppendTag[T16],
    t17: org.scalax.asuna.mapper.AppendTag[T17]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag17[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`,
    T16,
    Asuna.`Number: 16`,
    T17,
    Asuna.`Number: 17`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag17[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`,
      T16,
      Asuna.`Number: 16`,
      T17,
      Asuna.`Number: 17`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag,
    T9 <: org.scalax.asuna.mapper.item.ItemTag,
    T10 <: org.scalax.asuna.mapper.item.ItemTag,
    T11 <: org.scalax.asuna.mapper.item.ItemTag,
    T12 <: org.scalax.asuna.mapper.item.ItemTag,
    T13 <: org.scalax.asuna.mapper.item.ItemTag,
    T14 <: org.scalax.asuna.mapper.item.ItemTag,
    T15 <: org.scalax.asuna.mapper.item.ItemTag,
    T16 <: org.scalax.asuna.mapper.item.ItemTag,
    T17 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15],
    t16: org.scalax.asuna.mapper.AppendTag[T16],
    t17: org.scalax.asuna.mapper.AppendTag[T17]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag17[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`,
    T16,
    Asuna.`Number: 16`,
    T17,
    Asuna.`Number: 17`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag17[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`,
      T16,
      Asuna.`Number: 16`,
      T17,
      Asuna.`Number: 17`
    ]]
  def item17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17
  ): ContextContent[org.scalax.asuna.mapper.item.Item17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem17(
              t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: t16 :: t17 :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem17(
              EatValue0
                .addRightItem(t17)
                .addRightItem(t16)
                .addRightItem(t15)
                .addRightItem(t14)
                .addRightItem(t13)
                .addRightItem(t12)
                .addRightItem(t11)
                .addRightItem(t10)
                .addRightItem(t9)
                .addRightItem(t8)
                .addRightItem(t7)
                .addRightItem(t6)
                .addRightItem(t5)
                .addRightItem(t4)
                .addRightItem(t3)
                .addRightItem(t2)
                .addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem17(
              t17 :: t16 :: t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem17(
              EatValue0
                .addRightItem(t1)
                .addRightItem(t2)
                .addRightItem(t3)
                .addRightItem(t4)
                .addRightItem(t5)
                .addRightItem(t6)
                .addRightItem(t7)
                .addRightItem(t8)
                .addRightItem(t9)
                .addRightItem(t10)
                .addRightItem(t11)
                .addRightItem(t12)
                .addRightItem(t13)
                .addRightItem(t14)
                .addRightItem(t15)
                .addRightItem(t16)
                .addRightItem(t17)
            )
          }
        }
      }
    }
  def nodeItem17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8],
    t9: ContextContent[T9],
    t10: ContextContent[T10],
    t11: ContextContent[T11],
    t12: ContextContent[T12],
    t13: ContextContent[T13],
    t14: ContextContent[T14],
    t15: ContextContent[T15],
    t16: ContextContent[T16],
    t17: ContextContent[T17]
  ): ContextContent[org.scalax.asuna.mapper.item.Item17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem17(
              t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5
                .withContext(c) :: t6.withContext(c) :: t7.withContext(c) :: t8.withContext(c) :: t9.withContext(c) :: t10.withContext(c) :: t11.withContext(c) :: t12
                .withContext(c) :: t13.withContext(c) :: t14.withContext(c) :: t15.withContext(c) :: t16.withContext(c) :: t17.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem17(
              EatValue0
                .addRightItem(t17.withContext(c))
                .addRightItem(t16.withContext(c))
                .addRightItem(t15.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t9.withContext(c))
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
            new org.scalax.asuna.mapper.item.HListItem17(
              t17.withContext(c) :: t16.withContext(c) :: t15.withContext(c) :: t14
                .withContext(c) :: t13.withContext(c) :: t12.withContext(c) :: t11.withContext(c) :: t10.withContext(c) :: t9.withContext(c) :: t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem17(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
                .addRightItem(t9.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t15.withContext(c))
                .addRightItem(t16.withContext(c))
                .addRightItem(t17.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15],
    t16: org.scalax.asuna.mapper.AppendTag[T16],
    t17: org.scalax.asuna.mapper.AppendTag[T17],
    t18: org.scalax.asuna.mapper.AppendTag[T18]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag18[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`,
    T16,
    Asuna.`Number: 16`,
    T17,
    Asuna.`Number: 17`,
    T18,
    Asuna.`Number: 18`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag18[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`,
      T16,
      Asuna.`Number: 16`,
      T17,
      Asuna.`Number: 17`,
      T18,
      Asuna.`Number: 18`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag,
    T9 <: org.scalax.asuna.mapper.item.ItemTag,
    T10 <: org.scalax.asuna.mapper.item.ItemTag,
    T11 <: org.scalax.asuna.mapper.item.ItemTag,
    T12 <: org.scalax.asuna.mapper.item.ItemTag,
    T13 <: org.scalax.asuna.mapper.item.ItemTag,
    T14 <: org.scalax.asuna.mapper.item.ItemTag,
    T15 <: org.scalax.asuna.mapper.item.ItemTag,
    T16 <: org.scalax.asuna.mapper.item.ItemTag,
    T17 <: org.scalax.asuna.mapper.item.ItemTag,
    T18 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15],
    t16: org.scalax.asuna.mapper.AppendTag[T16],
    t17: org.scalax.asuna.mapper.AppendTag[T17],
    t18: org.scalax.asuna.mapper.AppendTag[T18]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag18[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`,
    T16,
    Asuna.`Number: 16`,
    T17,
    Asuna.`Number: 17`,
    T18,
    Asuna.`Number: 18`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag18[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`,
      T16,
      Asuna.`Number: 16`,
      T17,
      Asuna.`Number: 17`,
      T18,
      Asuna.`Number: 18`
    ]]
  def item18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18
  ): ContextContent[org.scalax.asuna.mapper.item.Item18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem18(
              t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: t16 :: t17 :: t18 :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem18(
              EatValue0
                .addRightItem(t18)
                .addRightItem(t17)
                .addRightItem(t16)
                .addRightItem(t15)
                .addRightItem(t14)
                .addRightItem(t13)
                .addRightItem(t12)
                .addRightItem(t11)
                .addRightItem(t10)
                .addRightItem(t9)
                .addRightItem(t8)
                .addRightItem(t7)
                .addRightItem(t6)
                .addRightItem(t5)
                .addRightItem(t4)
                .addRightItem(t3)
                .addRightItem(t2)
                .addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem18(
              t18 :: t17 :: t16 :: t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem18(
              EatValue0
                .addRightItem(t1)
                .addRightItem(t2)
                .addRightItem(t3)
                .addRightItem(t4)
                .addRightItem(t5)
                .addRightItem(t6)
                .addRightItem(t7)
                .addRightItem(t8)
                .addRightItem(t9)
                .addRightItem(t10)
                .addRightItem(t11)
                .addRightItem(t12)
                .addRightItem(t13)
                .addRightItem(t14)
                .addRightItem(t15)
                .addRightItem(t16)
                .addRightItem(t17)
                .addRightItem(t18)
            )
          }
        }
      }
    }
  def nodeItem18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8],
    t9: ContextContent[T9],
    t10: ContextContent[T10],
    t11: ContextContent[T11],
    t12: ContextContent[T12],
    t13: ContextContent[T13],
    t14: ContextContent[T14],
    t15: ContextContent[T15],
    t16: ContextContent[T16],
    t17: ContextContent[T17],
    t18: ContextContent[T18]
  ): ContextContent[org.scalax.asuna.mapper.item.Item18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem18(
              t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6
                .withContext(c) :: t7.withContext(c) :: t8.withContext(c) :: t9.withContext(c) :: t10.withContext(c) :: t11.withContext(c) :: t12.withContext(c) :: t13
                .withContext(c) :: t14.withContext(c) :: t15.withContext(c) :: t16.withContext(c) :: t17.withContext(c) :: t18.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem18(
              EatValue0
                .addRightItem(t18.withContext(c))
                .addRightItem(t17.withContext(c))
                .addRightItem(t16.withContext(c))
                .addRightItem(t15.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t9.withContext(c))
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
            new org.scalax.asuna.mapper.item.HListItem18(
              t18.withContext(c) :: t17.withContext(c) :: t16.withContext(c) :: t15.withContext(c) :: t14
                .withContext(c) :: t13.withContext(c) :: t12.withContext(c) :: t11.withContext(c) :: t10.withContext(c) :: t9.withContext(c) :: t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem18(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
                .addRightItem(t9.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t15.withContext(c))
                .addRightItem(t16.withContext(c))
                .addRightItem(t17.withContext(c))
                .addRightItem(t18.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15],
    t16: org.scalax.asuna.mapper.AppendTag[T16],
    t17: org.scalax.asuna.mapper.AppendTag[T17],
    t18: org.scalax.asuna.mapper.AppendTag[T18],
    t19: org.scalax.asuna.mapper.AppendTag[T19]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag19[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`,
    T16,
    Asuna.`Number: 16`,
    T17,
    Asuna.`Number: 17`,
    T18,
    Asuna.`Number: 18`,
    T19,
    Asuna.`Number: 19`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag19[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`,
      T16,
      Asuna.`Number: 16`,
      T17,
      Asuna.`Number: 17`,
      T18,
      Asuna.`Number: 18`,
      T19,
      Asuna.`Number: 19`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag,
    T9 <: org.scalax.asuna.mapper.item.ItemTag,
    T10 <: org.scalax.asuna.mapper.item.ItemTag,
    T11 <: org.scalax.asuna.mapper.item.ItemTag,
    T12 <: org.scalax.asuna.mapper.item.ItemTag,
    T13 <: org.scalax.asuna.mapper.item.ItemTag,
    T14 <: org.scalax.asuna.mapper.item.ItemTag,
    T15 <: org.scalax.asuna.mapper.item.ItemTag,
    T16 <: org.scalax.asuna.mapper.item.ItemTag,
    T17 <: org.scalax.asuna.mapper.item.ItemTag,
    T18 <: org.scalax.asuna.mapper.item.ItemTag,
    T19 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15],
    t16: org.scalax.asuna.mapper.AppendTag[T16],
    t17: org.scalax.asuna.mapper.AppendTag[T17],
    t18: org.scalax.asuna.mapper.AppendTag[T18],
    t19: org.scalax.asuna.mapper.AppendTag[T19]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag19[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`,
    T16,
    Asuna.`Number: 16`,
    T17,
    Asuna.`Number: 17`,
    T18,
    Asuna.`Number: 18`,
    T19,
    Asuna.`Number: 19`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag19[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`,
      T16,
      Asuna.`Number: 16`,
      T17,
      Asuna.`Number: 17`,
      T18,
      Asuna.`Number: 18`,
      T19,
      Asuna.`Number: 19`
    ]]
  def item19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19
  ): ContextContent[org.scalax.asuna.mapper.item.Item19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem19(
              t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: t16 :: t17 :: t18 :: t19 :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem19(
              EatValue0
                .addRightItem(t19)
                .addRightItem(t18)
                .addRightItem(t17)
                .addRightItem(t16)
                .addRightItem(t15)
                .addRightItem(t14)
                .addRightItem(t13)
                .addRightItem(t12)
                .addRightItem(t11)
                .addRightItem(t10)
                .addRightItem(t9)
                .addRightItem(t8)
                .addRightItem(t7)
                .addRightItem(t6)
                .addRightItem(t5)
                .addRightItem(t4)
                .addRightItem(t3)
                .addRightItem(t2)
                .addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem19(
              t19 :: t18 :: t17 :: t16 :: t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem19(
              EatValue0
                .addRightItem(t1)
                .addRightItem(t2)
                .addRightItem(t3)
                .addRightItem(t4)
                .addRightItem(t5)
                .addRightItem(t6)
                .addRightItem(t7)
                .addRightItem(t8)
                .addRightItem(t9)
                .addRightItem(t10)
                .addRightItem(t11)
                .addRightItem(t12)
                .addRightItem(t13)
                .addRightItem(t14)
                .addRightItem(t15)
                .addRightItem(t16)
                .addRightItem(t17)
                .addRightItem(t18)
                .addRightItem(t19)
            )
          }
        }
      }
    }
  def nodeItem19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8],
    t9: ContextContent[T9],
    t10: ContextContent[T10],
    t11: ContextContent[T11],
    t12: ContextContent[T12],
    t13: ContextContent[T13],
    t14: ContextContent[T14],
    t15: ContextContent[T15],
    t16: ContextContent[T16],
    t17: ContextContent[T17],
    t18: ContextContent[T18],
    t19: ContextContent[T19]
  ): ContextContent[org.scalax.asuna.mapper.item.Item19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem19(
              t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: t7
                .withContext(c) :: t8.withContext(c) :: t9.withContext(c) :: t10.withContext(c) :: t11.withContext(c) :: t12.withContext(c) :: t13.withContext(c) :: t14
                .withContext(c) :: t15.withContext(c) :: t16.withContext(c) :: t17.withContext(c) :: t18.withContext(c) :: t19.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem19(
              EatValue0
                .addRightItem(t19.withContext(c))
                .addRightItem(t18.withContext(c))
                .addRightItem(t17.withContext(c))
                .addRightItem(t16.withContext(c))
                .addRightItem(t15.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t9.withContext(c))
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
            new org.scalax.asuna.mapper.item.HListItem19(
              t19.withContext(c) :: t18.withContext(c) :: t17.withContext(c) :: t16.withContext(c) :: t15.withContext(c) :: t14
                .withContext(c) :: t13.withContext(c) :: t12.withContext(c) :: t11.withContext(c) :: t10.withContext(c) :: t9.withContext(c) :: t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem19(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
                .addRightItem(t9.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t15.withContext(c))
                .addRightItem(t16.withContext(c))
                .addRightItem(t17.withContext(c))
                .addRightItem(t18.withContext(c))
                .addRightItem(t19.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15],
    t16: org.scalax.asuna.mapper.AppendTag[T16],
    t17: org.scalax.asuna.mapper.AppendTag[T17],
    t18: org.scalax.asuna.mapper.AppendTag[T18],
    t19: org.scalax.asuna.mapper.AppendTag[T19],
    t20: org.scalax.asuna.mapper.AppendTag[T20]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag20[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`,
    T16,
    Asuna.`Number: 16`,
    T17,
    Asuna.`Number: 17`,
    T18,
    Asuna.`Number: 18`,
    T19,
    Asuna.`Number: 19`,
    T20,
    Asuna.`Number: 20`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag20[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`,
      T16,
      Asuna.`Number: 16`,
      T17,
      Asuna.`Number: 17`,
      T18,
      Asuna.`Number: 18`,
      T19,
      Asuna.`Number: 19`,
      T20,
      Asuna.`Number: 20`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag,
    T9 <: org.scalax.asuna.mapper.item.ItemTag,
    T10 <: org.scalax.asuna.mapper.item.ItemTag,
    T11 <: org.scalax.asuna.mapper.item.ItemTag,
    T12 <: org.scalax.asuna.mapper.item.ItemTag,
    T13 <: org.scalax.asuna.mapper.item.ItemTag,
    T14 <: org.scalax.asuna.mapper.item.ItemTag,
    T15 <: org.scalax.asuna.mapper.item.ItemTag,
    T16 <: org.scalax.asuna.mapper.item.ItemTag,
    T17 <: org.scalax.asuna.mapper.item.ItemTag,
    T18 <: org.scalax.asuna.mapper.item.ItemTag,
    T19 <: org.scalax.asuna.mapper.item.ItemTag,
    T20 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15],
    t16: org.scalax.asuna.mapper.AppendTag[T16],
    t17: org.scalax.asuna.mapper.AppendTag[T17],
    t18: org.scalax.asuna.mapper.AppendTag[T18],
    t19: org.scalax.asuna.mapper.AppendTag[T19],
    t20: org.scalax.asuna.mapper.AppendTag[T20]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag20[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`,
    T16,
    Asuna.`Number: 16`,
    T17,
    Asuna.`Number: 17`,
    T18,
    Asuna.`Number: 18`,
    T19,
    Asuna.`Number: 19`,
    T20,
    Asuna.`Number: 20`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag20[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`,
      T16,
      Asuna.`Number: 16`,
      T17,
      Asuna.`Number: 17`,
      T18,
      Asuna.`Number: 18`,
      T19,
      Asuna.`Number: 19`,
      T20,
      Asuna.`Number: 20`
    ]]
  def item20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19,
    t20: T20
  ): ContextContent[org.scalax.asuna.mapper.item.Item20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem20(
              t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: t16 :: t17 :: t18 :: t19 :: t20 :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem20(
              EatValue0
                .addRightItem(t20)
                .addRightItem(t19)
                .addRightItem(t18)
                .addRightItem(t17)
                .addRightItem(t16)
                .addRightItem(t15)
                .addRightItem(t14)
                .addRightItem(t13)
                .addRightItem(t12)
                .addRightItem(t11)
                .addRightItem(t10)
                .addRightItem(t9)
                .addRightItem(t8)
                .addRightItem(t7)
                .addRightItem(t6)
                .addRightItem(t5)
                .addRightItem(t4)
                .addRightItem(t3)
                .addRightItem(t2)
                .addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem20(
              t20 :: t19 :: t18 :: t17 :: t16 :: t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem20(
              EatValue0
                .addRightItem(t1)
                .addRightItem(t2)
                .addRightItem(t3)
                .addRightItem(t4)
                .addRightItem(t5)
                .addRightItem(t6)
                .addRightItem(t7)
                .addRightItem(t8)
                .addRightItem(t9)
                .addRightItem(t10)
                .addRightItem(t11)
                .addRightItem(t12)
                .addRightItem(t13)
                .addRightItem(t14)
                .addRightItem(t15)
                .addRightItem(t16)
                .addRightItem(t17)
                .addRightItem(t18)
                .addRightItem(t19)
                .addRightItem(t20)
            )
          }
        }
      }
    }
  def nodeItem20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8],
    t9: ContextContent[T9],
    t10: ContextContent[T10],
    t11: ContextContent[T11],
    t12: ContextContent[T12],
    t13: ContextContent[T13],
    t14: ContextContent[T14],
    t15: ContextContent[T15],
    t16: ContextContent[T16],
    t17: ContextContent[T17],
    t18: ContextContent[T18],
    t19: ContextContent[T19],
    t20: ContextContent[T20]
  ): ContextContent[org.scalax.asuna.mapper.item.Item20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem20(
              t1.withContext(c) :: t2.withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: t7.withContext(c) :: t8
                .withContext(c) :: t9.withContext(c) :: t10.withContext(c) :: t11.withContext(c) :: t12.withContext(c) :: t13.withContext(c) :: t14.withContext(c) :: t15
                .withContext(c) :: t16.withContext(c) :: t17.withContext(c) :: t18.withContext(c) :: t19.withContext(c) :: t20.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem20(
              EatValue0
                .addRightItem(t20.withContext(c))
                .addRightItem(t19.withContext(c))
                .addRightItem(t18.withContext(c))
                .addRightItem(t17.withContext(c))
                .addRightItem(t16.withContext(c))
                .addRightItem(t15.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t9.withContext(c))
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
            new org.scalax.asuna.mapper.item.HListItem20(
              t20.withContext(c) :: t19.withContext(c) :: t18.withContext(c) :: t17.withContext(c) :: t16.withContext(c) :: t15.withContext(c) :: t14
                .withContext(c) :: t13.withContext(c) :: t12.withContext(c) :: t11.withContext(c) :: t10.withContext(c) :: t9.withContext(c) :: t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem20(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
                .addRightItem(t9.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t15.withContext(c))
                .addRightItem(t16.withContext(c))
                .addRightItem(t17.withContext(c))
                .addRightItem(t18.withContext(c))
                .addRightItem(t19.withContext(c))
                .addRightItem(t20.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15],
    t16: org.scalax.asuna.mapper.AppendTag[T16],
    t17: org.scalax.asuna.mapper.AppendTag[T17],
    t18: org.scalax.asuna.mapper.AppendTag[T18],
    t19: org.scalax.asuna.mapper.AppendTag[T19],
    t20: org.scalax.asuna.mapper.AppendTag[T20],
    t21: org.scalax.asuna.mapper.AppendTag[T21]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag21[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`,
    T16,
    Asuna.`Number: 16`,
    T17,
    Asuna.`Number: 17`,
    T18,
    Asuna.`Number: 18`,
    T19,
    Asuna.`Number: 19`,
    T20,
    Asuna.`Number: 20`,
    T21,
    Asuna.`Number: 21`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag21[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`,
      T16,
      Asuna.`Number: 16`,
      T17,
      Asuna.`Number: 17`,
      T18,
      Asuna.`Number: 18`,
      T19,
      Asuna.`Number: 19`,
      T20,
      Asuna.`Number: 20`,
      T21,
      Asuna.`Number: 21`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag,
    T9 <: org.scalax.asuna.mapper.item.ItemTag,
    T10 <: org.scalax.asuna.mapper.item.ItemTag,
    T11 <: org.scalax.asuna.mapper.item.ItemTag,
    T12 <: org.scalax.asuna.mapper.item.ItemTag,
    T13 <: org.scalax.asuna.mapper.item.ItemTag,
    T14 <: org.scalax.asuna.mapper.item.ItemTag,
    T15 <: org.scalax.asuna.mapper.item.ItemTag,
    T16 <: org.scalax.asuna.mapper.item.ItemTag,
    T17 <: org.scalax.asuna.mapper.item.ItemTag,
    T18 <: org.scalax.asuna.mapper.item.ItemTag,
    T19 <: org.scalax.asuna.mapper.item.ItemTag,
    T20 <: org.scalax.asuna.mapper.item.ItemTag,
    T21 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15],
    t16: org.scalax.asuna.mapper.AppendTag[T16],
    t17: org.scalax.asuna.mapper.AppendTag[T17],
    t18: org.scalax.asuna.mapper.AppendTag[T18],
    t19: org.scalax.asuna.mapper.AppendTag[T19],
    t20: org.scalax.asuna.mapper.AppendTag[T20],
    t21: org.scalax.asuna.mapper.AppendTag[T21]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag21[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`,
    T16,
    Asuna.`Number: 16`,
    T17,
    Asuna.`Number: 17`,
    T18,
    Asuna.`Number: 18`,
    T19,
    Asuna.`Number: 19`,
    T20,
    Asuna.`Number: 20`,
    T21,
    Asuna.`Number: 21`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag21[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`,
      T16,
      Asuna.`Number: 16`,
      T17,
      Asuna.`Number: 17`,
      T18,
      Asuna.`Number: 18`,
      T19,
      Asuna.`Number: 19`,
      T20,
      Asuna.`Number: 20`,
      T21,
      Asuna.`Number: 21`
    ]]
  def item21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19,
    t20: T20,
    t21: T21
  ): ContextContent[org.scalax.asuna.mapper.item.Item21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem21(
              t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: t16 :: t17 :: t18 :: t19 :: t20 :: t21 :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem21(
              EatValue0
                .addRightItem(t21)
                .addRightItem(t20)
                .addRightItem(t19)
                .addRightItem(t18)
                .addRightItem(t17)
                .addRightItem(t16)
                .addRightItem(t15)
                .addRightItem(t14)
                .addRightItem(t13)
                .addRightItem(t12)
                .addRightItem(t11)
                .addRightItem(t10)
                .addRightItem(t9)
                .addRightItem(t8)
                .addRightItem(t7)
                .addRightItem(t6)
                .addRightItem(t5)
                .addRightItem(t4)
                .addRightItem(t3)
                .addRightItem(t2)
                .addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem21(
              t21 :: t20 :: t19 :: t18 :: t17 :: t16 :: t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem21(
              EatValue0
                .addRightItem(t1)
                .addRightItem(t2)
                .addRightItem(t3)
                .addRightItem(t4)
                .addRightItem(t5)
                .addRightItem(t6)
                .addRightItem(t7)
                .addRightItem(t8)
                .addRightItem(t9)
                .addRightItem(t10)
                .addRightItem(t11)
                .addRightItem(t12)
                .addRightItem(t13)
                .addRightItem(t14)
                .addRightItem(t15)
                .addRightItem(t16)
                .addRightItem(t17)
                .addRightItem(t18)
                .addRightItem(t19)
                .addRightItem(t20)
                .addRightItem(t21)
            )
          }
        }
      }
    }
  def nodeItem21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8],
    t9: ContextContent[T9],
    t10: ContextContent[T10],
    t11: ContextContent[T11],
    t12: ContextContent[T12],
    t13: ContextContent[T13],
    t14: ContextContent[T14],
    t15: ContextContent[T15],
    t16: ContextContent[T16],
    t17: ContextContent[T17],
    t18: ContextContent[T18],
    t19: ContextContent[T19],
    t20: ContextContent[T20],
    t21: ContextContent[T21]
  ): ContextContent[org.scalax.asuna.mapper.item.Item21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem21(
              t1.withContext(c) :: t2
                .withContext(c) :: t3.withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: t7.withContext(c) :: t8.withContext(c) :: t9
                .withContext(c) :: t10.withContext(c) :: t11.withContext(c) :: t12.withContext(c) :: t13.withContext(c) :: t14.withContext(c) :: t15.withContext(c) :: t16
                .withContext(c) :: t17.withContext(c) :: t18.withContext(c) :: t19.withContext(c) :: t20.withContext(c) :: t21.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem21(
              EatValue0
                .addRightItem(t21.withContext(c))
                .addRightItem(t20.withContext(c))
                .addRightItem(t19.withContext(c))
                .addRightItem(t18.withContext(c))
                .addRightItem(t17.withContext(c))
                .addRightItem(t16.withContext(c))
                .addRightItem(t15.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t9.withContext(c))
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
            new org.scalax.asuna.mapper.item.HListItem21(
              t21
                .withContext(c) :: t20.withContext(c) :: t19.withContext(c) :: t18.withContext(c) :: t17.withContext(c) :: t16.withContext(c) :: t15.withContext(c) :: t14
                .withContext(c) :: t13.withContext(c) :: t12.withContext(c) :: t11.withContext(c) :: t10.withContext(c) :: t9.withContext(c) :: t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem21(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
                .addRightItem(t9.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t15.withContext(c))
                .addRightItem(t16.withContext(c))
                .addRightItem(t17.withContext(c))
                .addRightItem(t18.withContext(c))
                .addRightItem(t19.withContext(c))
                .addRightItem(t20.withContext(c))
                .addRightItem(t21.withContext(c))
            )
          }
        }
      }
    }
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15],
    t16: org.scalax.asuna.mapper.AppendTag[T16],
    t17: org.scalax.asuna.mapper.AppendTag[T17],
    t18: org.scalax.asuna.mapper.AppendTag[T18],
    t19: org.scalax.asuna.mapper.AppendTag[T19],
    t20: org.scalax.asuna.mapper.AppendTag[T20],
    t21: org.scalax.asuna.mapper.AppendTag[T21],
    t22: org.scalax.asuna.mapper.AppendTag[T22]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag22[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`,
    T16,
    Asuna.`Number: 16`,
    T17,
    Asuna.`Number: 17`,
    T18,
    Asuna.`Number: 18`,
    T19,
    Asuna.`Number: 19`,
    T20,
    Asuna.`Number: 20`,
    T21,
    Asuna.`Number: 21`,
    T22,
    Asuna.`Number: 22`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.ItemTag22[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`,
      T16,
      Asuna.`Number: 16`,
      T17,
      Asuna.`Number: 17`,
      T18,
      Asuna.`Number: 18`,
      T19,
      Asuna.`Number: 19`,
      T20,
      Asuna.`Number: 20`,
      T21,
      Asuna.`Number: 21`,
      T22,
      Asuna.`Number: 22`
    ]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag,
    T8 <: org.scalax.asuna.mapper.item.ItemTag,
    T9 <: org.scalax.asuna.mapper.item.ItemTag,
    T10 <: org.scalax.asuna.mapper.item.ItemTag,
    T11 <: org.scalax.asuna.mapper.item.ItemTag,
    T12 <: org.scalax.asuna.mapper.item.ItemTag,
    T13 <: org.scalax.asuna.mapper.item.ItemTag,
    T14 <: org.scalax.asuna.mapper.item.ItemTag,
    T15 <: org.scalax.asuna.mapper.item.ItemTag,
    T16 <: org.scalax.asuna.mapper.item.ItemTag,
    T17 <: org.scalax.asuna.mapper.item.ItemTag,
    T18 <: org.scalax.asuna.mapper.item.ItemTag,
    T19 <: org.scalax.asuna.mapper.item.ItemTag,
    T20 <: org.scalax.asuna.mapper.item.ItemTag,
    T21 <: org.scalax.asuna.mapper.item.ItemTag,
    T22 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.AppendTag[T1],
    t2: org.scalax.asuna.mapper.AppendTag[T2],
    t3: org.scalax.asuna.mapper.AppendTag[T3],
    t4: org.scalax.asuna.mapper.AppendTag[T4],
    t5: org.scalax.asuna.mapper.AppendTag[T5],
    t6: org.scalax.asuna.mapper.AppendTag[T6],
    t7: org.scalax.asuna.mapper.AppendTag[T7],
    t8: org.scalax.asuna.mapper.AppendTag[T8],
    t9: org.scalax.asuna.mapper.AppendTag[T9],
    t10: org.scalax.asuna.mapper.AppendTag[T10],
    t11: org.scalax.asuna.mapper.AppendTag[T11],
    t12: org.scalax.asuna.mapper.AppendTag[T12],
    t13: org.scalax.asuna.mapper.AppendTag[T13],
    t14: org.scalax.asuna.mapper.AppendTag[T14],
    t15: org.scalax.asuna.mapper.AppendTag[T15],
    t16: org.scalax.asuna.mapper.AppendTag[T16],
    t17: org.scalax.asuna.mapper.AppendTag[T17],
    t18: org.scalax.asuna.mapper.AppendTag[T18],
    t19: org.scalax.asuna.mapper.AppendTag[T19],
    t20: org.scalax.asuna.mapper.AppendTag[T20],
    t21: org.scalax.asuna.mapper.AppendTag[T21],
    t22: org.scalax.asuna.mapper.AppendTag[T22]
  ): org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag22[
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
    Asuna.`Number: 8`,
    T9,
    Asuna.`Number: 9`,
    T10,
    Asuna.`Number: 10`,
    T11,
    Asuna.`Number: 11`,
    T12,
    Asuna.`Number: 12`,
    T13,
    Asuna.`Number: 13`,
    T14,
    Asuna.`Number: 14`,
    T15,
    Asuna.`Number: 15`,
    T16,
    Asuna.`Number: 16`,
    T17,
    Asuna.`Number: 17`,
    T18,
    Asuna.`Number: 18`,
    T19,
    Asuna.`Number: 19`,
    T20,
    Asuna.`Number: 20`,
    T21,
    Asuna.`Number: 21`,
    T22,
    Asuna.`Number: 22`
  ]] =
    new org.scalax.asuna.mapper.AppendTag[org.scalax.asuna.mapper.item.NodeTag22[
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
      Asuna.`Number: 8`,
      T9,
      Asuna.`Number: 9`,
      T10,
      Asuna.`Number: 10`,
      T11,
      Asuna.`Number: 11`,
      T12,
      Asuna.`Number: 12`,
      T13,
      Asuna.`Number: 13`,
      T14,
      Asuna.`Number: 14`,
      T15,
      Asuna.`Number: 15`,
      T16,
      Asuna.`Number: 16`,
      T17,
      Asuna.`Number: 17`,
      T18,
      Asuna.`Number: 18`,
      T19,
      Asuna.`Number: 19`,
      T20,
      Asuna.`Number: 20`,
      T21,
      Asuna.`Number: 21`,
      T22,
      Asuna.`Number: 22`
    ]]
  def item22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19,
    t20: T20,
    t21: T21,
    t22: T22
  ): ContextContent[org.scalax.asuna.mapper.item.Item22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem22(
              t1 :: t2 :: t3 :: t4 :: t5 :: t6 :: t7 :: t8 :: t9 :: t10 :: t11 :: t12 :: t13 :: t14 :: t15 :: t16 :: t17 :: t18 :: t19 :: t20 :: t21 :: t22 :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem22(
              EatValue0
                .addRightItem(t22)
                .addRightItem(t21)
                .addRightItem(t20)
                .addRightItem(t19)
                .addRightItem(t18)
                .addRightItem(t17)
                .addRightItem(t16)
                .addRightItem(t15)
                .addRightItem(t14)
                .addRightItem(t13)
                .addRightItem(t12)
                .addRightItem(t11)
                .addRightItem(t10)
                .addRightItem(t9)
                .addRightItem(t8)
                .addRightItem(t7)
                .addRightItem(t6)
                .addRightItem(t5)
                .addRightItem(t4)
                .addRightItem(t3)
                .addRightItem(t2)
                .addRightItem(t1)
            )
          }
        } else {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.HListItem22(
              t22 :: t21 :: t20 :: t19 :: t18 :: t17 :: t16 :: t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem22(
              EatValue0
                .addRightItem(t1)
                .addRightItem(t2)
                .addRightItem(t3)
                .addRightItem(t4)
                .addRightItem(t5)
                .addRightItem(t6)
                .addRightItem(t7)
                .addRightItem(t8)
                .addRightItem(t9)
                .addRightItem(t10)
                .addRightItem(t11)
                .addRightItem(t12)
                .addRightItem(t13)
                .addRightItem(t14)
                .addRightItem(t15)
                .addRightItem(t16)
                .addRightItem(t17)
                .addRightItem(t18)
                .addRightItem(t19)
                .addRightItem(t20)
                .addRightItem(t21)
                .addRightItem(t22)
            )
          }
        }
      }
    }
  def nodeItem22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t1: ContextContent[T1],
    t2: ContextContent[T2],
    t3: ContextContent[T3],
    t4: ContextContent[T4],
    t5: ContextContent[T5],
    t6: ContextContent[T6],
    t7: ContextContent[T7],
    t8: ContextContent[T8],
    t9: ContextContent[T9],
    t10: ContextContent[T10],
    t11: ContextContent[T11],
    t12: ContextContent[T12],
    t13: ContextContent[T13],
    t14: ContextContent[T14],
    t15: ContextContent[T15],
    t16: ContextContent[T16],
    t17: ContextContent[T17],
    t18: ContextContent[T18],
    t19: ContextContent[T19],
    t20: ContextContent[T20],
    t21: ContextContent[T21],
    t22: ContextContent[T22]
  ): ContextContent[org.scalax.asuna.mapper.item.Item22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]] =
    new ContextContent[org.scalax.asuna.mapper.item.Item22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]] {
      override def withContext[K <: org.scalax.asuna.mapper.KindContext](
        c: org.scalax.asuna.mapper.Context[K]
      ): org.scalax.asuna.mapper.item.Item22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
        if (c.isReverse) {
          if (c.useHList) {
            new org.scalax.asuna.mapper.item.ReverseHListItem22(
              t1.withContext(c) :: t2.withContext(c) :: t3
                .withContext(c) :: t4.withContext(c) :: t5.withContext(c) :: t6.withContext(c) :: t7.withContext(c) :: t8.withContext(c) :: t9.withContext(c) :: t10
                .withContext(c) :: t11.withContext(c) :: t12.withContext(c) :: t13.withContext(c) :: t14.withContext(c) :: t15.withContext(c) :: t16.withContext(c) :: t17
                .withContext(c) :: t18.withContext(c) :: t19.withContext(c) :: t20.withContext(c) :: t21.withContext(c) :: t22.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.ReverseTreeItem22(
              EatValue0
                .addRightItem(t22.withContext(c))
                .addRightItem(t21.withContext(c))
                .addRightItem(t20.withContext(c))
                .addRightItem(t19.withContext(c))
                .addRightItem(t18.withContext(c))
                .addRightItem(t17.withContext(c))
                .addRightItem(t16.withContext(c))
                .addRightItem(t15.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t9.withContext(c))
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
            new org.scalax.asuna.mapper.item.HListItem22(
              t22.withContext(c) :: t21
                .withContext(c) :: t20.withContext(c) :: t19.withContext(c) :: t18.withContext(c) :: t17.withContext(c) :: t16.withContext(c) :: t15.withContext(c) :: t14
                .withContext(c) :: t13.withContext(c) :: t12.withContext(c) :: t11.withContext(c) :: t10.withContext(c) :: t9.withContext(c) :: t8.withContext(c) :: t7
                .withContext(c) :: t6.withContext(c) :: t5.withContext(c) :: t4.withContext(c) :: t3.withContext(c) :: t2.withContext(c) :: t1.withContext(c) :: HNil
            )
          } else {
            new org.scalax.asuna.mapper.item.TreeItem22(
              EatValue0
                .addRightItem(t1.withContext(c))
                .addRightItem(t2.withContext(c))
                .addRightItem(t3.withContext(c))
                .addRightItem(t4.withContext(c))
                .addRightItem(t5.withContext(c))
                .addRightItem(t6.withContext(c))
                .addRightItem(t7.withContext(c))
                .addRightItem(t8.withContext(c))
                .addRightItem(t9.withContext(c))
                .addRightItem(t10.withContext(c))
                .addRightItem(t11.withContext(c))
                .addRightItem(t12.withContext(c))
                .addRightItem(t13.withContext(c))
                .addRightItem(t14.withContext(c))
                .addRightItem(t15.withContext(c))
                .addRightItem(t16.withContext(c))
                .addRightItem(t17.withContext(c))
                .addRightItem(t18.withContext(c))
                .addRightItem(t19.withContext(c))
                .addRightItem(t20.withContext(c))
                .addRightItem(t21.withContext(c))
                .addRightItem(t22.withContext(c))
            )
          }
        }
      }
    }
}
object BuildTagContect extends BuildTagContect
