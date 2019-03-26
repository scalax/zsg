package org.scalax.asuna.mapper.item
trait Xyy[I] extends Any {
  protected def item: I
}
trait ArticleXyy0 extends Any with Article0 {
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy1[E1] extends Any with Xyy[EatValue0#AddRightItem[E1]] with Article1[E1] {
  override protected def item: EatValue0#AddRightItem[E1]
  override def e1: E1 = item.item.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy2[E1, E2] extends Any with Xyy[EatValue0#AddRightItem[E2]#AddRightItem[E1]] with Article2[E1, E2] {
  override protected def item: EatValue0#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1 = item.item.i2
  override def e2: E2 = item.item.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy3[E1, E2, E3] extends Any with Xyy[EatValue0#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]] with Article3[E1, E2, E3] {
  override protected def item: EatValue0#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1 = item.item.i2.i1
  override def e2: E2 = item.item.i1.i2
  override def e3: E3 = item.item.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy4[E1, E2, E3, E4] extends Any with Xyy[EatValue0#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]] with Article4[E1, E2, E3, E4] {
  override protected def item: EatValue0#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1 = item.item.i2.i2
  override def e2: E2 = item.item.i2.i1
  override def e3: E3 = item.item.i1.i2
  override def e4: E4 = item.item.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy5[E1, E2, E3, E4, E5]
    extends Any
    with Xyy[EatValue0#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]]
    with Article5[E1, E2, E3, E4, E5] {
  override protected def item: EatValue0#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1 = item.item.i2.i1.i1
  override def e2: E2 = item.item.i1.i2.i2
  override def e3: E3 = item.item.i1.i2.i1
  override def e4: E4 = item.item.i1.i1.i2
  override def e5: E5 = item.item.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy6[E1, E2, E3, E4, E5, E6]
    extends Any
    with Xyy[EatValue0#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]]
    with Article6[E1, E2, E3, E4, E5, E6] {
  override protected def item: EatValue0#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1 = item.item.i2.i1.i2
  override def e2: E2 = item.item.i2.i1.i1
  override def e3: E3 = item.item.i1.i2.i2
  override def e4: E4 = item.item.i1.i2.i1
  override def e5: E5 = item.item.i1.i1.i2
  override def e6: E6 = item.item.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy7[E1, E2, E3, E4, E5, E6, E7]
    extends Any
    with Xyy[EatValue0#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]]
    with Article7[E1, E2, E3, E4, E5, E6, E7] {
  override protected def item: EatValue0#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1 = item.item.i2.i2.i1
  override def e2: E2 = item.item.i2.i1.i2
  override def e3: E3 = item.item.i2.i1.i1
  override def e4: E4 = item.item.i1.i2.i2
  override def e5: E5 = item.item.i1.i2.i1
  override def e6: E6 = item.item.i1.i1.i2
  override def e7: E7 = item.item.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy8[E1, E2, E3, E4, E5, E6, E7, E8]
    extends Any
    with Xyy[EatValue0#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]]
    with Article8[E1, E2, E3, E4, E5, E6, E7, E8] {
  override protected def item
    : EatValue0#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1 = item.item.i2.i2.i2
  override def e2: E2 = item.item.i2.i2.i1
  override def e3: E3 = item.item.i2.i1.i2
  override def e4: E4 = item.item.i2.i1.i1
  override def e5: E5 = item.item.i1.i2.i2
  override def e6: E6 = item.item.i1.i2.i1
  override def e7: E7 = item.item.i1.i1.i2
  override def e8: E8 = item.item.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy9[E1, E2, E3, E4, E5, E6, E7, E8, E9]
    extends Any
    with Xyy[
      EatValue0#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
    ]
    with Article9[E1, E2, E3, E4, E5, E6, E7, E8, E9] {
  override protected def item
    : EatValue0#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1 = item.item.i2.i1.i1.i1
  override def e2: E2 = item.item.i1.i2.i2.i2
  override def e3: E3 = item.item.i1.i2.i2.i1
  override def e4: E4 = item.item.i1.i2.i1.i2
  override def e5: E5 = item.item.i1.i2.i1.i1
  override def e6: E6 = item.item.i1.i1.i2.i2
  override def e7: E7 = item.item.i1.i1.i2.i1
  override def e8: E8 = item.item.i1.i1.i1.i2
  override def e9: E9 = item.item.i1.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10]
    extends Any
    with Xyy[EatValue0#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[
      E2
    ]#AddRightItem[E1]]
    with Article10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] {
  override protected def item: EatValue0#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[
    E3
  ]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1   = item.item.i2.i1.i1.i2
  override def e2: E2   = item.item.i2.i1.i1.i1
  override def e3: E3   = item.item.i1.i2.i2.i2
  override def e4: E4   = item.item.i1.i2.i2.i1
  override def e5: E5   = item.item.i1.i2.i1.i2
  override def e6: E6   = item.item.i1.i2.i1.i1
  override def e7: E7   = item.item.i1.i1.i2.i2
  override def e8: E8   = item.item.i1.i1.i2.i1
  override def e9: E9   = item.item.i1.i1.i1.i2
  override def e10: E10 = item.item.i1.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11]
    extends Any
    with Xyy[EatValue0#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[
      E3
    ]#AddRightItem[E2]#AddRightItem[E1]]
    with Article11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] {
  override protected def item: EatValue0#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[
    E4
  ]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1   = item.item.i2.i1.i2.i1
  override def e2: E2   = item.item.i2.i1.i1.i2
  override def e3: E3   = item.item.i2.i1.i1.i1
  override def e4: E4   = item.item.i1.i2.i2.i2
  override def e5: E5   = item.item.i1.i2.i2.i1
  override def e6: E6   = item.item.i1.i2.i1.i2
  override def e7: E7   = item.item.i1.i2.i1.i1
  override def e8: E8   = item.item.i1.i1.i2.i2
  override def e9: E9   = item.item.i1.i1.i2.i1
  override def e10: E10 = item.item.i1.i1.i1.i2
  override def e11: E11 = item.item.i1.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]
    extends Any
    with Xyy[
      EatValue0#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[
        E4
      ]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
    ]
    with Article12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] {
  override protected def item
    : EatValue0#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[
      E4
    ]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1   = item.item.i2.i1.i2.i2
  override def e2: E2   = item.item.i2.i1.i2.i1
  override def e3: E3   = item.item.i2.i1.i1.i2
  override def e4: E4   = item.item.i2.i1.i1.i1
  override def e5: E5   = item.item.i1.i2.i2.i2
  override def e6: E6   = item.item.i1.i2.i2.i1
  override def e7: E7   = item.item.i1.i2.i1.i2
  override def e8: E8   = item.item.i1.i2.i1.i1
  override def e9: E9   = item.item.i1.i1.i2.i2
  override def e10: E10 = item.item.i1.i1.i2.i1
  override def e11: E11 = item.item.i1.i1.i1.i2
  override def e12: E12 = item.item.i1.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13]
    extends Any
    with Xyy[
      EatValue0#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[
        E5
      ]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
    ]
    with Article13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] {
  override protected def item
    : EatValue0#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[
      E5
    ]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1   = item.item.i2.i2.i1.i1
  override def e2: E2   = item.item.i2.i1.i2.i2
  override def e3: E3   = item.item.i2.i1.i2.i1
  override def e4: E4   = item.item.i2.i1.i1.i2
  override def e5: E5   = item.item.i2.i1.i1.i1
  override def e6: E6   = item.item.i1.i2.i2.i2
  override def e7: E7   = item.item.i1.i2.i2.i1
  override def e8: E8   = item.item.i1.i2.i1.i2
  override def e9: E9   = item.item.i1.i2.i1.i1
  override def e10: E10 = item.item.i1.i1.i2.i2
  override def e11: E11 = item.item.i1.i1.i2.i1
  override def e12: E12 = item.item.i1.i1.i1.i2
  override def e13: E13 = item.item.i1.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14]
    extends Any
    with Xyy[
      EatValue0#AddRightItem[E14]#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[
        E6
      ]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
    ]
    with Article14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] {
  override protected def item
    : EatValue0#AddRightItem[E14]#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[
      E6
    ]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1   = item.item.i2.i2.i1.i2
  override def e2: E2   = item.item.i2.i2.i1.i1
  override def e3: E3   = item.item.i2.i1.i2.i2
  override def e4: E4   = item.item.i2.i1.i2.i1
  override def e5: E5   = item.item.i2.i1.i1.i2
  override def e6: E6   = item.item.i2.i1.i1.i1
  override def e7: E7   = item.item.i1.i2.i2.i2
  override def e8: E8   = item.item.i1.i2.i2.i1
  override def e9: E9   = item.item.i1.i2.i1.i2
  override def e10: E10 = item.item.i1.i2.i1.i1
  override def e11: E11 = item.item.i1.i1.i2.i2
  override def e12: E12 = item.item.i1.i1.i2.i1
  override def e13: E13 = item.item.i1.i1.i1.i2
  override def e14: E14 = item.item.i1.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15]
    extends Any
    with Xyy[
      EatValue0#AddRightItem[E15]#AddRightItem[E14]#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[
        E7
      ]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
    ]
    with Article15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] {
  override protected def item
    : EatValue0#AddRightItem[E15]#AddRightItem[E14]#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[
      E7
    ]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1   = item.item.i2.i2.i2.i1
  override def e2: E2   = item.item.i2.i2.i1.i2
  override def e3: E3   = item.item.i2.i2.i1.i1
  override def e4: E4   = item.item.i2.i1.i2.i2
  override def e5: E5   = item.item.i2.i1.i2.i1
  override def e6: E6   = item.item.i2.i1.i1.i2
  override def e7: E7   = item.item.i2.i1.i1.i1
  override def e8: E8   = item.item.i1.i2.i2.i2
  override def e9: E9   = item.item.i1.i2.i2.i1
  override def e10: E10 = item.item.i1.i2.i1.i2
  override def e11: E11 = item.item.i1.i2.i1.i1
  override def e12: E12 = item.item.i1.i1.i2.i2
  override def e13: E13 = item.item.i1.i1.i2.i1
  override def e14: E14 = item.item.i1.i1.i1.i2
  override def e15: E15 = item.item.i1.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16]
    extends Any
    with Xyy[EatValue0#AddRightItem[E16]#AddRightItem[E15]#AddRightItem[E14]#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[
      E8
    ]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]]
    with Article16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] {
  override protected def item: EatValue0#AddRightItem[E16]#AddRightItem[E15]#AddRightItem[E14]#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[
    E9
  ]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1   = item.item.i2.i2.i2.i2
  override def e2: E2   = item.item.i2.i2.i2.i1
  override def e3: E3   = item.item.i2.i2.i1.i2
  override def e4: E4   = item.item.i2.i2.i1.i1
  override def e5: E5   = item.item.i2.i1.i2.i2
  override def e6: E6   = item.item.i2.i1.i2.i1
  override def e7: E7   = item.item.i2.i1.i1.i2
  override def e8: E8   = item.item.i2.i1.i1.i1
  override def e9: E9   = item.item.i1.i2.i2.i2
  override def e10: E10 = item.item.i1.i2.i2.i1
  override def e11: E11 = item.item.i1.i2.i1.i2
  override def e12: E12 = item.item.i1.i2.i1.i1
  override def e13: E13 = item.item.i1.i1.i2.i2
  override def e14: E14 = item.item.i1.i1.i2.i1
  override def e15: E15 = item.item.i1.i1.i1.i2
  override def e16: E16 = item.item.i1.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17]
    extends Any
    with Xyy[EatValue0#AddRightItem[E17]#AddRightItem[E16]#AddRightItem[E15]#AddRightItem[E14]#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[
      E9
    ]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]]
    with Article17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] {
  override protected def item: EatValue0#AddRightItem[E17]#AddRightItem[E16]#AddRightItem[E15]#AddRightItem[E14]#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[
    E10
  ]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1   = item.item.i2.i1.i1.i1.i1
  override def e2: E2   = item.item.i1.i2.i2.i2.i2
  override def e3: E3   = item.item.i1.i2.i2.i2.i1
  override def e4: E4   = item.item.i1.i2.i2.i1.i2
  override def e5: E5   = item.item.i1.i2.i2.i1.i1
  override def e6: E6   = item.item.i1.i2.i1.i2.i2
  override def e7: E7   = item.item.i1.i2.i1.i2.i1
  override def e8: E8   = item.item.i1.i2.i1.i1.i2
  override def e9: E9   = item.item.i1.i2.i1.i1.i1
  override def e10: E10 = item.item.i1.i1.i2.i2.i2
  override def e11: E11 = item.item.i1.i1.i2.i2.i1
  override def e12: E12 = item.item.i1.i1.i2.i1.i2
  override def e13: E13 = item.item.i1.i1.i2.i1.i1
  override def e14: E14 = item.item.i1.i1.i1.i2.i2
  override def e15: E15 = item.item.i1.i1.i1.i2.i1
  override def e16: E16 = item.item.i1.i1.i1.i1.i2
  override def e17: E17 = item.item.i1.i1.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]
    extends Any
    with Xyy[EatValue0#AddRightItem[E18]#AddRightItem[E17]#AddRightItem[E16]#AddRightItem[E15]#AddRightItem[E14]#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[
      E10
    ]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]]
    with Article18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] {
  override protected def item
    : EatValue0#AddRightItem[E18]#AddRightItem[E17]#AddRightItem[E16]#AddRightItem[E15]#AddRightItem[E14]#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[
      E10
    ]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1   = item.item.i2.i1.i1.i1.i2
  override def e2: E2   = item.item.i2.i1.i1.i1.i1
  override def e3: E3   = item.item.i1.i2.i2.i2.i2
  override def e4: E4   = item.item.i1.i2.i2.i2.i1
  override def e5: E5   = item.item.i1.i2.i2.i1.i2
  override def e6: E6   = item.item.i1.i2.i2.i1.i1
  override def e7: E7   = item.item.i1.i2.i1.i2.i2
  override def e8: E8   = item.item.i1.i2.i1.i2.i1
  override def e9: E9   = item.item.i1.i2.i1.i1.i2
  override def e10: E10 = item.item.i1.i2.i1.i1.i1
  override def e11: E11 = item.item.i1.i1.i2.i2.i2
  override def e12: E12 = item.item.i1.i1.i2.i2.i1
  override def e13: E13 = item.item.i1.i1.i2.i1.i2
  override def e14: E14 = item.item.i1.i1.i2.i1.i1
  override def e15: E15 = item.item.i1.i1.i1.i2.i2
  override def e16: E16 = item.item.i1.i1.i1.i2.i1
  override def e17: E17 = item.item.i1.i1.i1.i1.i2
  override def e18: E18 = item.item.i1.i1.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19]
    extends Any
    with Xyy[EatValue0#AddRightItem[E19]#AddRightItem[E18]#AddRightItem[E17]#AddRightItem[E16]#AddRightItem[E15]#AddRightItem[E14]#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[
      E11
    ]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[
      E1
    ]]
    with Article19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] {
  override protected def item: EatValue0#AddRightItem[E19]#AddRightItem[E18]#AddRightItem[E17]#AddRightItem[E16]#AddRightItem[E15]#AddRightItem[E14]#AddRightItem[E13]#AddRightItem[
    E12
  ]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[
    E2
  ]#AddRightItem[E1]
  override def e1: E1   = item.item.i2.i1.i1.i2.i1
  override def e2: E2   = item.item.i2.i1.i1.i1.i2
  override def e3: E3   = item.item.i2.i1.i1.i1.i1
  override def e4: E4   = item.item.i1.i2.i2.i2.i2
  override def e5: E5   = item.item.i1.i2.i2.i2.i1
  override def e6: E6   = item.item.i1.i2.i2.i1.i2
  override def e7: E7   = item.item.i1.i2.i2.i1.i1
  override def e8: E8   = item.item.i1.i2.i1.i2.i2
  override def e9: E9   = item.item.i1.i2.i1.i2.i1
  override def e10: E10 = item.item.i1.i2.i1.i1.i2
  override def e11: E11 = item.item.i1.i2.i1.i1.i1
  override def e12: E12 = item.item.i1.i1.i2.i2.i2
  override def e13: E13 = item.item.i1.i1.i2.i2.i1
  override def e14: E14 = item.item.i1.i1.i2.i1.i2
  override def e15: E15 = item.item.i1.i1.i2.i1.i1
  override def e16: E16 = item.item.i1.i1.i1.i2.i2
  override def e17: E17 = item.item.i1.i1.i1.i2.i1
  override def e18: E18 = item.item.i1.i1.i1.i1.i2
  override def e19: E19 = item.item.i1.i1.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20]
    extends Any
    with Xyy[EatValue0#AddRightItem[E20]#AddRightItem[E19]#AddRightItem[E18]#AddRightItem[E17]#AddRightItem[E16]#AddRightItem[E15]#AddRightItem[E14]#AddRightItem[E13]#AddRightItem[
      E12
    ]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[
      E2
    ]#AddRightItem[E1]]
    with Article20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] {
  override protected def item: EatValue0#AddRightItem[E20]#AddRightItem[E19]#AddRightItem[E18]#AddRightItem[E17]#AddRightItem[E16]#AddRightItem[E15]#AddRightItem[E14]#AddRightItem[
    E13
  ]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[
    E3
  ]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1   = item.item.i2.i1.i1.i2.i2
  override def e2: E2   = item.item.i2.i1.i1.i2.i1
  override def e3: E3   = item.item.i2.i1.i1.i1.i2
  override def e4: E4   = item.item.i2.i1.i1.i1.i1
  override def e5: E5   = item.item.i1.i2.i2.i2.i2
  override def e6: E6   = item.item.i1.i2.i2.i2.i1
  override def e7: E7   = item.item.i1.i2.i2.i1.i2
  override def e8: E8   = item.item.i1.i2.i2.i1.i1
  override def e9: E9   = item.item.i1.i2.i1.i2.i2
  override def e10: E10 = item.item.i1.i2.i1.i2.i1
  override def e11: E11 = item.item.i1.i2.i1.i1.i2
  override def e12: E12 = item.item.i1.i2.i1.i1.i1
  override def e13: E13 = item.item.i1.i1.i2.i2.i2
  override def e14: E14 = item.item.i1.i1.i2.i2.i1
  override def e15: E15 = item.item.i1.i1.i2.i1.i2
  override def e16: E16 = item.item.i1.i1.i2.i1.i1
  override def e17: E17 = item.item.i1.i1.i1.i2.i2
  override def e18: E18 = item.item.i1.i1.i1.i2.i1
  override def e19: E19 = item.item.i1.i1.i1.i1.i2
  override def e20: E20 = item.item.i1.i1.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21]
    extends Any
    with Xyy[EatValue0#AddRightItem[E21]#AddRightItem[E20]#AddRightItem[E19]#AddRightItem[E18]#AddRightItem[E17]#AddRightItem[E16]#AddRightItem[E15]#AddRightItem[E14]#AddRightItem[
      E13
    ]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[E4]#AddRightItem[
      E3
    ]#AddRightItem[E2]#AddRightItem[E1]]
    with Article21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] {
  override protected def item: EatValue0#AddRightItem[E21]#AddRightItem[E20]#AddRightItem[E19]#AddRightItem[E18]#AddRightItem[E17]#AddRightItem[E16]#AddRightItem[E15]#AddRightItem[
    E14
  ]#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[
    E4
  ]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1   = item.item.i2.i1.i2.i1.i1
  override def e2: E2   = item.item.i2.i1.i1.i2.i2
  override def e3: E3   = item.item.i2.i1.i1.i2.i1
  override def e4: E4   = item.item.i2.i1.i1.i1.i2
  override def e5: E5   = item.item.i2.i1.i1.i1.i1
  override def e6: E6   = item.item.i1.i2.i2.i2.i2
  override def e7: E7   = item.item.i1.i2.i2.i2.i1
  override def e8: E8   = item.item.i1.i2.i2.i1.i2
  override def e9: E9   = item.item.i1.i2.i2.i1.i1
  override def e10: E10 = item.item.i1.i2.i1.i2.i2
  override def e11: E11 = item.item.i1.i2.i1.i2.i1
  override def e12: E12 = item.item.i1.i2.i1.i1.i2
  override def e13: E13 = item.item.i1.i2.i1.i1.i1
  override def e14: E14 = item.item.i1.i1.i2.i2.i2
  override def e15: E15 = item.item.i1.i1.i2.i2.i1
  override def e16: E16 = item.item.i1.i1.i2.i1.i2
  override def e17: E17 = item.item.i1.i1.i2.i1.i1
  override def e18: E18 = item.item.i1.i1.i1.i2.i2
  override def e19: E19 = item.item.i1.i1.i1.i2.i1
  override def e20: E20 = item.item.i1.i1.i1.i1.i2
  override def e21: E21 = item.item.i1.i1.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ArticleXyy22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22]
    extends Any
    with Xyy[EatValue0#AddRightItem[E22]#AddRightItem[E21]#AddRightItem[E20]#AddRightItem[E19]#AddRightItem[E18]#AddRightItem[E17]#AddRightItem[E16]#AddRightItem[E15]#AddRightItem[
      E14
    ]#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[E5]#AddRightItem[
      E4
    ]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]]
    with Article22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22] {
  override protected def item: EatValue0#AddRightItem[E22]#AddRightItem[E21]#AddRightItem[E20]#AddRightItem[E19]#AddRightItem[E18]#AddRightItem[E17]#AddRightItem[E16]#AddRightItem[
    E15
  ]#AddRightItem[E14]#AddRightItem[E13]#AddRightItem[E12]#AddRightItem[E11]#AddRightItem[E10]#AddRightItem[E9]#AddRightItem[E8]#AddRightItem[E7]#AddRightItem[E6]#AddRightItem[
    E5
  ]#AddRightItem[E4]#AddRightItem[E3]#AddRightItem[E2]#AddRightItem[E1]
  override def e1: E1   = item.item.i2.i1.i2.i1.i2
  override def e2: E2   = item.item.i2.i1.i2.i1.i1
  override def e3: E3   = item.item.i2.i1.i1.i2.i2
  override def e4: E4   = item.item.i2.i1.i1.i2.i1
  override def e5: E5   = item.item.i2.i1.i1.i1.i2
  override def e6: E6   = item.item.i2.i1.i1.i1.i1
  override def e7: E7   = item.item.i1.i2.i2.i2.i2
  override def e8: E8   = item.item.i1.i2.i2.i2.i1
  override def e9: E9   = item.item.i1.i2.i2.i1.i2
  override def e10: E10 = item.item.i1.i2.i2.i1.i1
  override def e11: E11 = item.item.i1.i2.i1.i2.i2
  override def e12: E12 = item.item.i1.i2.i1.i2.i1
  override def e13: E13 = item.item.i1.i2.i1.i1.i2
  override def e14: E14 = item.item.i1.i2.i1.i1.i1
  override def e15: E15 = item.item.i1.i1.i2.i2.i2
  override def e16: E16 = item.item.i1.i1.i2.i2.i1
  override def e17: E17 = item.item.i1.i1.i2.i1.i2
  override def e18: E18 = item.item.i1.i1.i2.i1.i1
  override def e19: E19 = item.item.i1.i1.i1.i2.i2
  override def e20: E20 = item.item.i1.i1.i1.i2.i1
  override def e21: E21 = item.item.i1.i1.i1.i1.i2
  override def e22: E22 = item.item.i1.i1.i1.i1.i1
}
