package org.scalax.asuna.ii.item
import shapeless._
trait BuildTagContect {
  def lift[T](tag: => org.scalax.asuna.mapper.item.AppendTag[T]): org.scalax.asuna.mapper.item.AppendTag[T] = new org.scalax.asuna.mapper.item.AppendTag[T]
  def tag[T1](t1: org.scalax.asuna.mapper.item.AppendTag[T1]): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag1[T1]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag1[T1]]
  def nodeTag[T1 <: org.scalax.asuna.mapper.item.ItemTag](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag1[T1]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag1[T1]]
  def item1[T1](t1: T1): org.scalax.asuna.ii.item.XyyItem1[T1] =
    new org.scalax.asuna.ii.item.ArticleXyy1(t1 :: HNil)
  def tag[T1, T2](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag2[T1, T2]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag2[T1, T2]]
  def nodeTag[T1 <: org.scalax.asuna.mapper.item.ItemTag, T2 <: org.scalax.asuna.mapper.item.ItemTag](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag2[T1, T2]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag2[T1, T2]]
  def item2[T1, T2](t1: T1, t2: T2): org.scalax.asuna.ii.item.XyyItem2[T1, T2] =
    new org.scalax.asuna.ii.item.ArticleXyy2(t2 :: t1 :: HNil)
  def tag[T1, T2, T3](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag3[T1, T2, T3]]
  def nodeTag[T1 <: org.scalax.asuna.mapper.item.ItemTag, T2 <: org.scalax.asuna.mapper.item.ItemTag, T3 <: org.scalax.asuna.mapper.item.ItemTag](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag3[T1, T2, T3]]
  def item3[T1, T2, T3](t1: T1, t2: T2, t3: T3): org.scalax.asuna.ii.item.XyyItem3[T1, T2, T3] =
    new org.scalax.asuna.ii.item.ArticleXyy3(t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag4[T1, T2, T3, T4]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag4[T1, T2, T3, T4]]
  def item4[T1, T2, T3, T4](t1: T1, t2: T2, t3: T3, t4: T4): org.scalax.asuna.ii.item.XyyItem4[T1, T2, T3, T4] =
    new org.scalax.asuna.ii.item.ArticleXyy4(t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag5[T1, T2, T3, T4, T5]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag5[T1, T2, T3, T4, T5]]
  def item5[T1, T2, T3, T4, T5](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5): org.scalax.asuna.ii.item.XyyItem5[T1, T2, T3, T4, T5] =
    new org.scalax.asuna.ii.item.ArticleXyy5(t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5, T6](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag6[T1, T2, T3, T4, T5, T6]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag6[T1, T2, T3, T4, T5, T6]]
  def item6[T1, T2, T3, T4, T5, T6](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6): org.scalax.asuna.ii.item.XyyItem6[T1, T2, T3, T4, T5, T6] =
    new org.scalax.asuna.ii.item.ArticleXyy6(t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5, T6, T7](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag7[T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag7[T1, T2, T3, T4, T5, T6, T7]]
  def nodeTag[
    T1 <: org.scalax.asuna.mapper.item.ItemTag,
    T2 <: org.scalax.asuna.mapper.item.ItemTag,
    T3 <: org.scalax.asuna.mapper.item.ItemTag,
    T4 <: org.scalax.asuna.mapper.item.ItemTag,
    T5 <: org.scalax.asuna.mapper.item.ItemTag,
    T6 <: org.scalax.asuna.mapper.item.ItemTag,
    T7 <: org.scalax.asuna.mapper.item.ItemTag
  ](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag7[T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag7[T1, T2, T3, T4, T5, T6, T7]]
  def item7[T1, T2, T3, T4, T5, T6, T7](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7): org.scalax.asuna.ii.item.XyyItem7[T1, T2, T3, T4, T5, T6, T7] =
    new org.scalax.asuna.ii.item.ArticleXyy7(t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5, T6, T7, T8](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag8[T1, T2, T3, T4, T5, T6, T7, T8]]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag8[T1, T2, T3, T4, T5, T6, T7, T8]]
  def item8[T1, T2, T3, T4, T5, T6, T7, T8](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8)
    : org.scalax.asuna.ii.item.XyyItem8[T1, T2, T3, T4, T5, T6, T7, T8] =
    new org.scalax.asuna.ii.item.ArticleXyy8(t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]
  def item9[T1, T2, T3, T4, T5, T6, T7, T8, T9](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9)
    : org.scalax.asuna.ii.item.XyyItem9[T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    new org.scalax.asuna.ii.item.ArticleXyy9(t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]]
  def item10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10)
    : org.scalax.asuna.ii.item.XyyItem10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    new org.scalax.asuna.ii.item.ArticleXyy10(t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]]
  def item11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11)
    : org.scalax.asuna.ii.item.XyyItem11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
    new org.scalax.asuna.ii.item.ArticleXyy11(t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]]
  def item12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12)
    : org.scalax.asuna.ii.item.XyyItem12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    new org.scalax.asuna.ii.item.ArticleXyy12(t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]]
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
  ): org.scalax.asuna.ii.item.XyyItem13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
    new org.scalax.asuna.ii.item.ArticleXyy13(t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]]
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
  ): org.scalax.asuna.ii.item.XyyItem14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
    new org.scalax.asuna.ii.item.ArticleXyy14(t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]]
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
  ): org.scalax.asuna.ii.item.XyyItem15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    new org.scalax.asuna.ii.item.ArticleXyy15(t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15],
    t16: org.scalax.asuna.mapper.item.AppendTag[T16]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15],
    t16: org.scalax.asuna.mapper.item.AppendTag[T16]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]]
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
  ): org.scalax.asuna.ii.item.XyyItem16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    new org.scalax.asuna.ii.item.ArticleXyy16(t16 :: t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15],
    t16: org.scalax.asuna.mapper.item.AppendTag[T16],
    t17: org.scalax.asuna.mapper.item.AppendTag[T17]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15],
    t16: org.scalax.asuna.mapper.item.AppendTag[T16],
    t17: org.scalax.asuna.mapper.item.AppendTag[T17]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]]
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
  ): org.scalax.asuna.ii.item.XyyItem17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    new org.scalax.asuna.ii.item.ArticleXyy17(t17 :: t16 :: t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15],
    t16: org.scalax.asuna.mapper.item.AppendTag[T16],
    t17: org.scalax.asuna.mapper.item.AppendTag[T17],
    t18: org.scalax.asuna.mapper.item.AppendTag[T18]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15],
    t16: org.scalax.asuna.mapper.item.AppendTag[T16],
    t17: org.scalax.asuna.mapper.item.AppendTag[T17],
    t18: org.scalax.asuna.mapper.item.AppendTag[T18]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]]
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
  ): org.scalax.asuna.ii.item.XyyItem18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    new org.scalax.asuna.ii.item.ArticleXyy18(t18 :: t17 :: t16 :: t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil)
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15],
    t16: org.scalax.asuna.mapper.item.AppendTag[T16],
    t17: org.scalax.asuna.mapper.item.AppendTag[T17],
    t18: org.scalax.asuna.mapper.item.AppendTag[T18],
    t19: org.scalax.asuna.mapper.item.AppendTag[T19]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.ItemTag19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15],
    t16: org.scalax.asuna.mapper.item.AppendTag[T16],
    t17: org.scalax.asuna.mapper.item.AppendTag[T17],
    t18: org.scalax.asuna.mapper.item.AppendTag[T18],
    t19: org.scalax.asuna.mapper.item.AppendTag[T19]
  ): org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] =
    new org.scalax.asuna.mapper.item.AppendTag[org.scalax.asuna.ii.item.NodeTag19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]]
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
  ): org.scalax.asuna.ii.item.XyyItem19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    new org.scalax.asuna.ii.item.ArticleXyy19(
      t19 :: t18 :: t17 :: t16 :: t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil
    )
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15],
    t16: org.scalax.asuna.mapper.item.AppendTag[T16],
    t17: org.scalax.asuna.mapper.item.AppendTag[T17],
    t18: org.scalax.asuna.mapper.item.AppendTag[T18],
    t19: org.scalax.asuna.mapper.item.AppendTag[T19],
    t20: org.scalax.asuna.mapper.item.AppendTag[T20]
  ): org.scalax.asuna.mapper.item.AppendTag[
    org.scalax.asuna.ii.item.ItemTag20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ] =
    new org.scalax.asuna.mapper.item.AppendTag[
      org.scalax.asuna.ii.item.ItemTag20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
    ]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15],
    t16: org.scalax.asuna.mapper.item.AppendTag[T16],
    t17: org.scalax.asuna.mapper.item.AppendTag[T17],
    t18: org.scalax.asuna.mapper.item.AppendTag[T18],
    t19: org.scalax.asuna.mapper.item.AppendTag[T19],
    t20: org.scalax.asuna.mapper.item.AppendTag[T20]
  ): org.scalax.asuna.mapper.item.AppendTag[
    org.scalax.asuna.ii.item.NodeTag20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ] =
    new org.scalax.asuna.mapper.item.AppendTag[
      org.scalax.asuna.ii.item.NodeTag20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
    ]
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
  ): org.scalax.asuna.ii.item.XyyItem20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    new org.scalax.asuna.ii.item.ArticleXyy20(
      t20 :: t19 :: t18 :: t17 :: t16 :: t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil
    )
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15],
    t16: org.scalax.asuna.mapper.item.AppendTag[T16],
    t17: org.scalax.asuna.mapper.item.AppendTag[T17],
    t18: org.scalax.asuna.mapper.item.AppendTag[T18],
    t19: org.scalax.asuna.mapper.item.AppendTag[T19],
    t20: org.scalax.asuna.mapper.item.AppendTag[T20],
    t21: org.scalax.asuna.mapper.item.AppendTag[T21]
  ): org.scalax.asuna.mapper.item.AppendTag[
    org.scalax.asuna.ii.item.ItemTag21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ] =
    new org.scalax.asuna.mapper.item.AppendTag[
      org.scalax.asuna.ii.item.ItemTag21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
    ]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15],
    t16: org.scalax.asuna.mapper.item.AppendTag[T16],
    t17: org.scalax.asuna.mapper.item.AppendTag[T17],
    t18: org.scalax.asuna.mapper.item.AppendTag[T18],
    t19: org.scalax.asuna.mapper.item.AppendTag[T19],
    t20: org.scalax.asuna.mapper.item.AppendTag[T20],
    t21: org.scalax.asuna.mapper.item.AppendTag[T21]
  ): org.scalax.asuna.mapper.item.AppendTag[
    org.scalax.asuna.ii.item.NodeTag21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ] =
    new org.scalax.asuna.mapper.item.AppendTag[
      org.scalax.asuna.ii.item.NodeTag21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
    ]
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
  ): org.scalax.asuna.ii.item.XyyItem21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    new org.scalax.asuna.ii.item.ArticleXyy21(
      t21 :: t20 :: t19 :: t18 :: t17 :: t16 :: t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil
    )
  def tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15],
    t16: org.scalax.asuna.mapper.item.AppendTag[T16],
    t17: org.scalax.asuna.mapper.item.AppendTag[T17],
    t18: org.scalax.asuna.mapper.item.AppendTag[T18],
    t19: org.scalax.asuna.mapper.item.AppendTag[T19],
    t20: org.scalax.asuna.mapper.item.AppendTag[T20],
    t21: org.scalax.asuna.mapper.item.AppendTag[T21],
    t22: org.scalax.asuna.mapper.item.AppendTag[T22]
  ): org.scalax.asuna.mapper.item.AppendTag[
    org.scalax.asuna.ii.item.ItemTag22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ] =
    new org.scalax.asuna.mapper.item.AppendTag[
      org.scalax.asuna.ii.item.ItemTag22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
    ]
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
    t1: org.scalax.asuna.mapper.item.AppendTag[T1],
    t2: org.scalax.asuna.mapper.item.AppendTag[T2],
    t3: org.scalax.asuna.mapper.item.AppendTag[T3],
    t4: org.scalax.asuna.mapper.item.AppendTag[T4],
    t5: org.scalax.asuna.mapper.item.AppendTag[T5],
    t6: org.scalax.asuna.mapper.item.AppendTag[T6],
    t7: org.scalax.asuna.mapper.item.AppendTag[T7],
    t8: org.scalax.asuna.mapper.item.AppendTag[T8],
    t9: org.scalax.asuna.mapper.item.AppendTag[T9],
    t10: org.scalax.asuna.mapper.item.AppendTag[T10],
    t11: org.scalax.asuna.mapper.item.AppendTag[T11],
    t12: org.scalax.asuna.mapper.item.AppendTag[T12],
    t13: org.scalax.asuna.mapper.item.AppendTag[T13],
    t14: org.scalax.asuna.mapper.item.AppendTag[T14],
    t15: org.scalax.asuna.mapper.item.AppendTag[T15],
    t16: org.scalax.asuna.mapper.item.AppendTag[T16],
    t17: org.scalax.asuna.mapper.item.AppendTag[T17],
    t18: org.scalax.asuna.mapper.item.AppendTag[T18],
    t19: org.scalax.asuna.mapper.item.AppendTag[T19],
    t20: org.scalax.asuna.mapper.item.AppendTag[T20],
    t21: org.scalax.asuna.mapper.item.AppendTag[T21],
    t22: org.scalax.asuna.mapper.item.AppendTag[T22]
  ): org.scalax.asuna.mapper.item.AppendTag[
    org.scalax.asuna.ii.item.NodeTag22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ] =
    new org.scalax.asuna.mapper.item.AppendTag[
      org.scalax.asuna.ii.item.NodeTag22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
    ]
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
  ): org.scalax.asuna.ii.item.XyyItem22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    new org.scalax.asuna.ii.item.ArticleXyy22(
      t22 :: t21 :: t20 :: t19 :: t18 :: t17 :: t16 :: t15 :: t14 :: t13 :: t12 :: t11 :: t10 :: t9 :: t8 :: t7 :: t6 :: t5 :: t4 :: t3 :: t2 :: t1 :: HNil
    )
}
object BuildTagContect extends BuildTagContect
