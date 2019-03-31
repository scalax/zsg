package org.scalax.asuna.ii.item
import shapeless._
trait ArticleXyy0 extends Any with XyyItem0 {
  override def eat[T](xyy: T): ArticleXyy1[T] = new ArticleXyy1(xyy :: HNil)
}
object ArticleXyy0 extends ArticleXyy0
class ArticleXyy1[E1](val head: E1 :: HNil) extends AnyVal with XyyItem1[E1] {
  override def eat[T](xyy: T): ArticleXyy2[E1, T] = new ArticleXyy2[E1, T](xyy :: head)
  override def rightHead: E1                      = head.head
  override def rightTail: ArticleXyy0             = ArticleXyy0
  override def i1: E1                             = head.head
}
class ArticleXyy2[E1, E2](val head: E2 :: E1 :: HNil) extends AnyVal with XyyItem2[E1, E2] {
  override def eat[T](xyy: T): ArticleXyy3[E1, E2, T] = new ArticleXyy3[E1, E2, T](xyy :: head)
  override def rightHead: E2                          = head.head
  override def rightTail: ArticleXyy1[E1]             = new ArticleXyy1(head.tail)
  override def i1: E1                                 = head.tail.head
  override def i2: E2                                 = head.head
}
class ArticleXyy3[E1, E2, E3](val head: E3 :: E2 :: E1 :: HNil) extends AnyVal with XyyItem3[E1, E2, E3] {
  override def eat[T](xyy: T): ArticleXyy4[E1, E2, E3, T] = new ArticleXyy4[E1, E2, E3, T](xyy :: head)
  override def rightHead: E3                              = head.head
  override def rightTail: ArticleXyy2[E1, E2]             = new ArticleXyy2(head.tail)
  override def i1: E1                                     = head.tail.tail.head
  override def i2: E2                                     = head.tail.head
  override def i3: E3                                     = head.head
}
class ArticleXyy4[E1, E2, E3, E4](val head: E4 :: E3 :: E2 :: E1 :: HNil) extends AnyVal with XyyItem4[E1, E2, E3, E4] {
  override def eat[T](xyy: T): ArticleXyy5[E1, E2, E3, E4, T] = new ArticleXyy5[E1, E2, E3, E4, T](xyy :: head)
  override def rightHead: E4                                  = head.head
  override def rightTail: ArticleXyy3[E1, E2, E3]             = new ArticleXyy3(head.tail)
  override def i1: E1                                         = head.tail.tail.tail.head
  override def i2: E2                                         = head.tail.tail.head
  override def i3: E3                                         = head.tail.head
  override def i4: E4                                         = head.head
}
class ArticleXyy5[E1, E2, E3, E4, E5](val head: E5 :: E4 :: E3 :: E2 :: E1 :: HNil) extends AnyVal with XyyItem5[E1, E2, E3, E4, E5] {
  override def eat[T](xyy: T): ArticleXyy6[E1, E2, E3, E4, E5, T] = new ArticleXyy6[E1, E2, E3, E4, E5, T](xyy :: head)
  override def rightHead: E5                                      = head.head
  override def rightTail: ArticleXyy4[E1, E2, E3, E4]             = new ArticleXyy4(head.tail)
  override def i1: E1                                             = head.tail.tail.tail.tail.head
  override def i2: E2                                             = head.tail.tail.tail.head
  override def i3: E3                                             = head.tail.tail.head
  override def i4: E4                                             = head.tail.head
  override def i5: E5                                             = head.head
}
class ArticleXyy6[E1, E2, E3, E4, E5, E6](val head: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil) extends AnyVal with XyyItem6[E1, E2, E3, E4, E5, E6] {
  override def eat[T](xyy: T): ArticleXyy7[E1, E2, E3, E4, E5, E6, T] = new ArticleXyy7[E1, E2, E3, E4, E5, E6, T](xyy :: head)
  override def rightHead: E6                                          = head.head
  override def rightTail: ArticleXyy5[E1, E2, E3, E4, E5]             = new ArticleXyy5(head.tail)
  override def i1: E1                                                 = head.tail.tail.tail.tail.tail.head
  override def i2: E2                                                 = head.tail.tail.tail.tail.head
  override def i3: E3                                                 = head.tail.tail.tail.head
  override def i4: E4                                                 = head.tail.tail.head
  override def i5: E5                                                 = head.tail.head
  override def i6: E6                                                 = head.head
}
class ArticleXyy7[E1, E2, E3, E4, E5, E6, E7](val head: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil) extends AnyVal with XyyItem7[E1, E2, E3, E4, E5, E6, E7] {
  override def eat[T](xyy: T): ArticleXyy8[E1, E2, E3, E4, E5, E6, E7, T] = new ArticleXyy8[E1, E2, E3, E4, E5, E6, E7, T](xyy :: head)
  override def rightHead: E7                                              = head.head
  override def rightTail: ArticleXyy6[E1, E2, E3, E4, E5, E6]             = new ArticleXyy6(head.tail)
  override def i1: E1                                                     = head.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                     = head.tail.tail.tail.tail.tail.head
  override def i3: E3                                                     = head.tail.tail.tail.tail.head
  override def i4: E4                                                     = head.tail.tail.tail.head
  override def i5: E5                                                     = head.tail.tail.head
  override def i6: E6                                                     = head.tail.head
  override def i7: E7                                                     = head.head
}
class ArticleXyy8[E1, E2, E3, E4, E5, E6, E7, E8](val head: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil)
    extends AnyVal
    with XyyItem8[E1, E2, E3, E4, E5, E6, E7, E8] {
  override def eat[T](xyy: T): ArticleXyy9[E1, E2, E3, E4, E5, E6, E7, E8, T] = new ArticleXyy9[E1, E2, E3, E4, E5, E6, E7, E8, T](xyy :: head)
  override def rightHead: E8                                                  = head.head
  override def rightTail: ArticleXyy7[E1, E2, E3, E4, E5, E6, E7]             = new ArticleXyy7(head.tail)
  override def i1: E1                                                         = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                         = head.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                         = head.tail.tail.tail.tail.tail.head
  override def i4: E4                                                         = head.tail.tail.tail.tail.head
  override def i5: E5                                                         = head.tail.tail.tail.head
  override def i6: E6                                                         = head.tail.tail.head
  override def i7: E7                                                         = head.tail.head
  override def i8: E8                                                         = head.head
}
class ArticleXyy9[E1, E2, E3, E4, E5, E6, E7, E8, E9](val head: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil)
    extends AnyVal
    with XyyItem9[E1, E2, E3, E4, E5, E6, E7, E8, E9] {
  override def eat[T](xyy: T): ArticleXyy10[E1, E2, E3, E4, E5, E6, E7, E8, E9, T] = new ArticleXyy10[E1, E2, E3, E4, E5, E6, E7, E8, E9, T](xyy :: head)
  override def rightHead: E9                                                       = head.head
  override def rightTail: ArticleXyy8[E1, E2, E3, E4, E5, E6, E7, E8]              = new ArticleXyy8(head.tail)
  override def i1: E1                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                              = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                              = head.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                              = head.tail.tail.tail.tail.tail.head
  override def i5: E5                                                              = head.tail.tail.tail.tail.head
  override def i6: E6                                                              = head.tail.tail.tail.head
  override def i7: E7                                                              = head.tail.tail.head
  override def i8: E8                                                              = head.tail.head
  override def i9: E9                                                              = head.head
}
class ArticleXyy10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10](val head: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil)
    extends AnyVal
    with XyyItem10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] {
  override def eat[T](xyy: T): ArticleXyy11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, T] = new ArticleXyy11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, T](xyy :: head)
  override def rightHead: E10                                                           = head.head
  override def rightTail: ArticleXyy9[E1, E2, E3, E4, E5, E6, E7, E8, E9]               = new ArticleXyy9(head.tail)
  override def i1: E1                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                   = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                   = head.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                   = head.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                   = head.tail.tail.tail.tail.head
  override def i7: E7                                                                   = head.tail.tail.tail.head
  override def i8: E8                                                                   = head.tail.tail.head
  override def i9: E9                                                                   = head.tail.head
  override def i10: E10                                                                 = head.head
}
class ArticleXyy11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11](val head: E11 :: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil)
    extends AnyVal
    with XyyItem11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] {
  override def eat[T](xyy: T): ArticleXyy12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, T] =
    new ArticleXyy12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, T](xyy :: head)
  override def rightHead: E11                                                   = head.head
  override def rightTail: ArticleXyy10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] = new ArticleXyy10(head.tail)
  override def i1: E1                                                           = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                           = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                           = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                           = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                           = head.tail.tail.tail.tail.tail.tail.head
  override def i6: E6                                                           = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                           = head.tail.tail.tail.tail.head
  override def i8: E8                                                           = head.tail.tail.tail.head
  override def i9: E9                                                           = head.tail.tail.head
  override def i10: E10                                                         = head.tail.head
  override def i11: E11                                                         = head.head
}
class ArticleXyy12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12](val head: E12 :: E11 :: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil)
    extends AnyVal
    with XyyItem12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] {
  override def eat[T](xyy: T): ArticleXyy13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, T] =
    new ArticleXyy13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, T](xyy :: head)
  override def rightHead: E12                                                        = head.head
  override def rightTail: ArticleXyy11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] = new ArticleXyy11(head.tail)
  override def i1: E1                                                                = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                = head.tail.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                = head.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                = head.tail.tail.tail.tail.head
  override def i9: E9                                                                = head.tail.tail.tail.head
  override def i10: E10                                                              = head.tail.tail.head
  override def i11: E11                                                              = head.tail.head
  override def i12: E12                                                              = head.head
}
class ArticleXyy13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13](
  val head: E13 :: E12 :: E11 :: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil
) extends AnyVal
    with XyyItem13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] {
  override def eat[T](xyy: T): ArticleXyy14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, T] =
    new ArticleXyy14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, T](xyy :: head)
  override def rightHead: E13                                                             = head.head
  override def rightTail: ArticleXyy12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] = new ArticleXyy12(head.tail)
  override def i1: E1                                                                     = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                     = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                     = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                     = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                     = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                     = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                     = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                     = head.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                     = head.tail.tail.tail.tail.head
  override def i10: E10                                                                   = head.tail.tail.tail.head
  override def i11: E11                                                                   = head.tail.tail.head
  override def i12: E12                                                                   = head.tail.head
  override def i13: E13                                                                   = head.head
}
class ArticleXyy14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14](
  val head: E14 :: E13 :: E12 :: E11 :: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil
) extends AnyVal
    with XyyItem14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] {
  override def eat[T](xyy: T): ArticleXyy15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, T] =
    new ArticleXyy15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, T](xyy :: head)
  override def rightHead: E14                                                                  = head.head
  override def rightTail: ArticleXyy13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] = new ArticleXyy13(head.tail)
  override def i1: E1                                                                          = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                          = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                          = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                          = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                          = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                          = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                          = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                          = head.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                          = head.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                        = head.tail.tail.tail.tail.head
  override def i11: E11                                                                        = head.tail.tail.tail.head
  override def i12: E12                                                                        = head.tail.tail.head
  override def i13: E13                                                                        = head.tail.head
  override def i14: E14                                                                        = head.head
}
class ArticleXyy15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15](
  val head: E15 :: E14 :: E13 :: E12 :: E11 :: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil
) extends AnyVal
    with XyyItem15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] {
  override def eat[T](xyy: T): ArticleXyy16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, T] =
    new ArticleXyy16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, T](xyy :: head)
  override def rightHead: E15                                                                       = head.head
  override def rightTail: ArticleXyy14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] = new ArticleXyy14(head.tail)
  override def i1: E1                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                               = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                               = head.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                             = head.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                             = head.tail.tail.tail.tail.head
  override def i12: E12                                                                             = head.tail.tail.tail.head
  override def i13: E13                                                                             = head.tail.tail.head
  override def i14: E14                                                                             = head.tail.head
  override def i15: E15                                                                             = head.head
}
class ArticleXyy16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16](
  val head: E16 :: E15 :: E14 :: E13 :: E12 :: E11 :: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil
) extends AnyVal
    with XyyItem16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] {
  override def eat[T](xyy: T): ArticleXyy17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, T] =
    new ArticleXyy17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, T](xyy :: head)
  override def rightHead: E16                                                                            = head.head
  override def rightTail: ArticleXyy15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] = new ArticleXyy15(head.tail)
  override def i1: E1                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                  = head.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                  = head.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                  = head.tail.tail.tail.tail.head
  override def i13: E13                                                                                  = head.tail.tail.tail.head
  override def i14: E14                                                                                  = head.tail.tail.head
  override def i15: E15                                                                                  = head.tail.head
  override def i16: E16                                                                                  = head.head
}
class ArticleXyy17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17](
  val head: E17 :: E16 :: E15 :: E14 :: E13 :: E12 :: E11 :: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil
) extends AnyVal
    with XyyItem17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] {
  override def eat[T](xyy: T): ArticleXyy18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, T] =
    new ArticleXyy18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, T](xyy :: head)
  override def rightHead: E17                                                                                 = head.head
  override def rightTail: ArticleXyy16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] = new ArticleXyy16(head.tail)
  override def i1: E1                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                       = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                       = head.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                       = head.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                                       = head.tail.tail.tail.tail.head
  override def i14: E14                                                                                       = head.tail.tail.tail.head
  override def i15: E15                                                                                       = head.tail.tail.head
  override def i16: E16                                                                                       = head.tail.head
  override def i17: E17                                                                                       = head.head
}
class ArticleXyy18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18](
  val head: E18 :: E17 :: E16 :: E15 :: E14 :: E13 :: E12 :: E11 :: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil
) extends AnyVal
    with XyyItem18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] {
  override def eat[T](xyy: T): ArticleXyy19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, T] =
    new ArticleXyy19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, T](xyy :: head)
  override def rightHead: E18                                                                                      = head.head
  override def rightTail: ArticleXyy17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] = new ArticleXyy17(head.tail)
  override def i1: E1                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                            = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                            = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                            = head.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                                            = head.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                                            = head.tail.tail.tail.tail.head
  override def i15: E15                                                                                            = head.tail.tail.tail.head
  override def i16: E16                                                                                            = head.tail.tail.head
  override def i17: E17                                                                                            = head.tail.head
  override def i18: E18                                                                                            = head.head
}
class ArticleXyy19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19](
  val head: E19 :: E18 :: E17 :: E16 :: E15 :: E14 :: E13 :: E12 :: E11 :: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil
) extends AnyVal
    with XyyItem19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] {
  override def eat[T](xyy: T): ArticleXyy20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, T] =
    new ArticleXyy20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, T](xyy :: head)
  override def rightHead: E19                                                                                           = head.head
  override def rightTail: ArticleXyy18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] = new ArticleXyy18(head.tail)
  override def i1: E1                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                                                 = head.tail.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                                                 = head.tail.tail.tail.tail.tail.head
  override def i15: E15                                                                                                 = head.tail.tail.tail.tail.head
  override def i16: E16                                                                                                 = head.tail.tail.tail.head
  override def i17: E17                                                                                                 = head.tail.tail.head
  override def i18: E18                                                                                                 = head.tail.head
  override def i19: E19                                                                                                 = head.head
}
class ArticleXyy20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20](
  val head: E20 :: E19 :: E18 :: E17 :: E16 :: E15 :: E14 :: E13 :: E12 :: E11 :: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil
) extends AnyVal
    with XyyItem20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] {
  override def eat[T](xyy: T): ArticleXyy21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, T] =
    new ArticleXyy21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, T](xyy :: head)
  override def rightHead: E20                                                                                                = head.head
  override def rightTail: ArticleXyy19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] = new ArticleXyy19(head.tail)
  override def i1: E1                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                                      = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                                      = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                                      = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                                                      = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                                                      = head.tail.tail.tail.tail.tail.tail.head
  override def i15: E15                                                                                                      = head.tail.tail.tail.tail.tail.head
  override def i16: E16                                                                                                      = head.tail.tail.tail.tail.head
  override def i17: E17                                                                                                      = head.tail.tail.tail.head
  override def i18: E18                                                                                                      = head.tail.tail.head
  override def i19: E19                                                                                                      = head.tail.head
  override def i20: E20                                                                                                      = head.head
}
class ArticleXyy21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21](
  val head: E21 :: E20 :: E19 :: E18 :: E17 :: E16 :: E15 :: E14 :: E13 :: E12 :: E11 :: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil
) extends AnyVal
    with XyyItem21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] {
  override def eat[T](xyy: T): ArticleXyy22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, T] =
    new ArticleXyy22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, T](xyy :: head)
  override def rightHead: E21                                                                                                     = head.head
  override def rightTail: ArticleXyy20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] = new ArticleXyy20(head.tail)
  override def i1: E1                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                                           = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                                           = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                                           = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                                                           = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                                                           = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i15: E15                                                                                                           = head.tail.tail.tail.tail.tail.tail.head
  override def i16: E16                                                                                                           = head.tail.tail.tail.tail.tail.head
  override def i17: E17                                                                                                           = head.tail.tail.tail.tail.head
  override def i18: E18                                                                                                           = head.tail.tail.tail.head
  override def i19: E19                                                                                                           = head.tail.tail.head
  override def i20: E20                                                                                                           = head.tail.head
  override def i21: E21                                                                                                           = head.head
}
class ArticleXyy22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22](
  val head: E22 :: E21 :: E20 :: E19 :: E18 :: E17 :: E16 :: E15 :: E14 :: E13 :: E12 :: E11 :: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil
) extends AnyVal
    with XyyItem22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22] {
  override def rightHead: E22                                                                                                          = head.head
  override def rightTail: ArticleXyy21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] = new ArticleXyy21(head.tail)
  override def i1: E1                                                                                                                  = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                                                                  = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                                                                  = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                                                                  = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                                                                  = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                                                                  = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                                                  = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                                                  = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                                                  = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                                                = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                                                = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                                                = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                                                                = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                                                                = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i15: E15                                                                                                                = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i16: E16                                                                                                                = head.tail.tail.tail.tail.tail.tail.head
  override def i17: E17                                                                                                                = head.tail.tail.tail.tail.tail.head
  override def i18: E18                                                                                                                = head.tail.tail.tail.tail.head
  override def i19: E19                                                                                                                = head.tail.tail.tail.head
  override def i20: E20                                                                                                                = head.tail.tail.head
  override def i21: E21                                                                                                                = head.tail.head
  override def i22: E22                                                                                                                = head.head
}
