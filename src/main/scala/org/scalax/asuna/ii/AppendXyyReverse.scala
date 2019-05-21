package org.scalax.asuna.ii.item
import shapeless._
trait ArticleXyyReverse0 extends Any with XyyItem0 {
  override def pudao[T](xyy: T): ArticleXyyReverse1[T] = new ArticleXyyReverse1(xyy :: HNil)
}
object ArticleXyyReverse0 extends ArticleXyyReverse0
class ArticleXyyReverse1[E1](val head: E1 :: HNil) extends AnyVal with XyyItem1[E1] {
  override def pudao[T](xyy: T): ArticleXyyReverse2[T, E1] = new ArticleXyyReverse2[T, E1](xyy :: head)
  override def leftHead: E1                                = head.head
  override def leftTail: ArticleXyyReverse0                = ArticleXyyReverse0
  override def i1: E1                                      = head.head
}
class ArticleXyyReverse2[E1, E2](val head: E1 :: E2 :: HNil) extends AnyVal with XyyItem2[E1, E2] {
  override def pudao[T](xyy: T): ArticleXyyReverse3[T, E1, E2] = new ArticleXyyReverse3[T, E1, E2](xyy :: head)
  override def leftHead: E1                                    = head.head
  override def leftTail: ArticleXyyReverse1[E2]                = new ArticleXyyReverse1(head.tail)
  override def i1: E1                                          = head.head
  override def i2: E2                                          = head.tail.head
}
class ArticleXyyReverse3[E1, E2, E3](val head: E1 :: E2 :: E3 :: HNil) extends AnyVal with XyyItem3[E1, E2, E3] {
  override def pudao[T](xyy: T): ArticleXyyReverse4[T, E1, E2, E3] = new ArticleXyyReverse4[T, E1, E2, E3](xyy :: head)
  override def leftHead: E1                                        = head.head
  override def leftTail: ArticleXyyReverse2[E2, E3]                = new ArticleXyyReverse2(head.tail)
  override def i1: E1                                              = head.head
  override def i2: E2                                              = head.tail.head
  override def i3: E3                                              = head.tail.tail.head
}
class ArticleXyyReverse4[E1, E2, E3, E4](val head: E1 :: E2 :: E3 :: E4 :: HNil) extends AnyVal with XyyItem4[E1, E2, E3, E4] {
  override def pudao[T](xyy: T): ArticleXyyReverse5[T, E1, E2, E3, E4] = new ArticleXyyReverse5[T, E1, E2, E3, E4](xyy :: head)
  override def leftHead: E1                                            = head.head
  override def leftTail: ArticleXyyReverse3[E2, E3, E4]                = new ArticleXyyReverse3(head.tail)
  override def i1: E1                                                  = head.head
  override def i2: E2                                                  = head.tail.head
  override def i3: E3                                                  = head.tail.tail.head
  override def i4: E4                                                  = head.tail.tail.tail.head
}
class ArticleXyyReverse5[E1, E2, E3, E4, E5](val head: E1 :: E2 :: E3 :: E4 :: E5 :: HNil) extends AnyVal with XyyItem5[E1, E2, E3, E4, E5] {
  override def pudao[T](xyy: T): ArticleXyyReverse6[T, E1, E2, E3, E4, E5] = new ArticleXyyReverse6[T, E1, E2, E3, E4, E5](xyy :: head)
  override def leftHead: E1                                                = head.head
  override def leftTail: ArticleXyyReverse4[E2, E3, E4, E5]                = new ArticleXyyReverse4(head.tail)
  override def i1: E1                                                      = head.head
  override def i2: E2                                                      = head.tail.head
  override def i3: E3                                                      = head.tail.tail.head
  override def i4: E4                                                      = head.tail.tail.tail.head
  override def i5: E5                                                      = head.tail.tail.tail.tail.head
}
class ArticleXyyReverse6[E1, E2, E3, E4, E5, E6](val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: HNil) extends AnyVal with XyyItem6[E1, E2, E3, E4, E5, E6] {
  override def pudao[T](xyy: T): ArticleXyyReverse7[T, E1, E2, E3, E4, E5, E6] = new ArticleXyyReverse7[T, E1, E2, E3, E4, E5, E6](xyy :: head)
  override def leftHead: E1                                                    = head.head
  override def leftTail: ArticleXyyReverse5[E2, E3, E4, E5, E6]                = new ArticleXyyReverse5(head.tail)
  override def i1: E1                                                          = head.head
  override def i2: E2                                                          = head.tail.head
  override def i3: E3                                                          = head.tail.tail.head
  override def i4: E4                                                          = head.tail.tail.tail.head
  override def i5: E5                                                          = head.tail.tail.tail.tail.head
  override def i6: E6                                                          = head.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse7[E1, E2, E3, E4, E5, E6, E7](val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: HNil) extends AnyVal with XyyItem7[E1, E2, E3, E4, E5, E6, E7] {
  override def pudao[T](xyy: T): ArticleXyyReverse8[T, E1, E2, E3, E4, E5, E6, E7] = new ArticleXyyReverse8[T, E1, E2, E3, E4, E5, E6, E7](xyy :: head)
  override def leftHead: E1                                                        = head.head
  override def leftTail: ArticleXyyReverse6[E2, E3, E4, E5, E6, E7]                = new ArticleXyyReverse6(head.tail)
  override def i1: E1                                                              = head.head
  override def i2: E2                                                              = head.tail.head
  override def i3: E3                                                              = head.tail.tail.head
  override def i4: E4                                                              = head.tail.tail.tail.head
  override def i5: E5                                                              = head.tail.tail.tail.tail.head
  override def i6: E6                                                              = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                              = head.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse8[E1, E2, E3, E4, E5, E6, E7, E8](val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: HNil)
    extends AnyVal
    with XyyItem8[E1, E2, E3, E4, E5, E6, E7, E8] {
  override def pudao[T](xyy: T): ArticleXyyReverse9[T, E1, E2, E3, E4, E5, E6, E7, E8] = new ArticleXyyReverse9[T, E1, E2, E3, E4, E5, E6, E7, E8](xyy :: head)
  override def leftHead: E1                                                            = head.head
  override def leftTail: ArticleXyyReverse7[E2, E3, E4, E5, E6, E7, E8]                = new ArticleXyyReverse7(head.tail)
  override def i1: E1                                                                  = head.head
  override def i2: E2                                                                  = head.tail.head
  override def i3: E3                                                                  = head.tail.tail.head
  override def i4: E4                                                                  = head.tail.tail.tail.head
  override def i5: E5                                                                  = head.tail.tail.tail.tail.head
  override def i6: E6                                                                  = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                  = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                  = head.tail.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse9[E1, E2, E3, E4, E5, E6, E7, E8, E9](val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: HNil)
    extends AnyVal
    with XyyItem9[E1, E2, E3, E4, E5, E6, E7, E8, E9] {
  override def pudao[T](xyy: T): ArticleXyyReverse10[T, E1, E2, E3, E4, E5, E6, E7, E8, E9] = new ArticleXyyReverse10[T, E1, E2, E3, E4, E5, E6, E7, E8, E9](xyy :: head)
  override def leftHead: E1                                                                 = head.head
  override def leftTail: ArticleXyyReverse8[E2, E3, E4, E5, E6, E7, E8, E9]                 = new ArticleXyyReverse8(head.tail)
  override def i1: E1                                                                       = head.head
  override def i2: E2                                                                       = head.tail.head
  override def i3: E3                                                                       = head.tail.tail.head
  override def i4: E4                                                                       = head.tail.tail.tail.head
  override def i5: E5                                                                       = head.tail.tail.tail.tail.head
  override def i6: E6                                                                       = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                       = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                       = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                       = head.tail.tail.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10](val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: HNil)
    extends AnyVal
    with XyyItem10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] {
  override def pudao[T](xyy: T): ArticleXyyReverse11[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] =
    new ArticleXyyReverse11[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10](xyy :: head)
  override def leftHead: E1                                                      = head.head
  override def leftTail: ArticleXyyReverse9[E2, E3, E4, E5, E6, E7, E8, E9, E10] = new ArticleXyyReverse9(head.tail)
  override def i1: E1                                                            = head.head
  override def i2: E2                                                            = head.tail.head
  override def i3: E3                                                            = head.tail.tail.head
  override def i4: E4                                                            = head.tail.tail.tail.head
  override def i5: E5                                                            = head.tail.tail.tail.tail.head
  override def i6: E6                                                            = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                            = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                            = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                            = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                          = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11](val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: HNil)
    extends AnyVal
    with XyyItem11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] {
  override def pudao[T](xyy: T): ArticleXyyReverse12[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] =
    new ArticleXyyReverse12[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11](xyy :: head)
  override def leftHead: E1                                                            = head.head
  override def leftTail: ArticleXyyReverse10[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] = new ArticleXyyReverse10(head.tail)
  override def i1: E1                                                                  = head.head
  override def i2: E2                                                                  = head.tail.head
  override def i3: E3                                                                  = head.tail.tail.head
  override def i4: E4                                                                  = head.tail.tail.tail.head
  override def i5: E5                                                                  = head.tail.tail.tail.tail.head
  override def i6: E6                                                                  = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                  = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                  = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                  = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12](val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: E12 :: HNil)
    extends AnyVal
    with XyyItem12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] {
  override def pudao[T](xyy: T): ArticleXyyReverse13[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] =
    new ArticleXyyReverse13[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12](xyy :: head)
  override def leftHead: E1                                                                 = head.head
  override def leftTail: ArticleXyyReverse11[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] = new ArticleXyyReverse11(head.tail)
  override def i1: E1                                                                       = head.head
  override def i2: E2                                                                       = head.tail.head
  override def i3: E3                                                                       = head.tail.tail.head
  override def i4: E4                                                                       = head.tail.tail.tail.head
  override def i5: E5                                                                       = head.tail.tail.tail.tail.head
  override def i6: E6                                                                       = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                       = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                       = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                       = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                     = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                     = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                     = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13](
  val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: E12 :: E13 :: HNil
) extends AnyVal
    with XyyItem13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] {
  override def pudao[T](xyy: T): ArticleXyyReverse14[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] =
    new ArticleXyyReverse14[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13](xyy :: head)
  override def leftHead: E1                                                                      = head.head
  override def leftTail: ArticleXyyReverse12[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] = new ArticleXyyReverse12(head.tail)
  override def i1: E1                                                                            = head.head
  override def i2: E2                                                                            = head.tail.head
  override def i3: E3                                                                            = head.tail.tail.head
  override def i4: E4                                                                            = head.tail.tail.tail.head
  override def i5: E5                                                                            = head.tail.tail.tail.tail.head
  override def i6: E6                                                                            = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                            = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                            = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                            = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                          = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                          = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                          = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                          = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14](
  val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: E12 :: E13 :: E14 :: HNil
) extends AnyVal
    with XyyItem14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] {
  override def pudao[T](xyy: T): ArticleXyyReverse15[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] =
    new ArticleXyyReverse15[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14](xyy :: head)
  override def leftHead: E1                                                                           = head.head
  override def leftTail: ArticleXyyReverse13[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] = new ArticleXyyReverse13(head.tail)
  override def i1: E1                                                                                 = head.head
  override def i2: E2                                                                                 = head.tail.head
  override def i3: E3                                                                                 = head.tail.tail.head
  override def i4: E4                                                                                 = head.tail.tail.tail.head
  override def i5: E5                                                                                 = head.tail.tail.tail.tail.head
  override def i6: E6                                                                                 = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                 = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15](
  val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: E12 :: E13 :: E14 :: E15 :: HNil
) extends AnyVal
    with XyyItem15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] {
  override def pudao[T](xyy: T): ArticleXyyReverse16[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] =
    new ArticleXyyReverse16[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15](xyy :: head)
  override def leftHead: E1                                                                                = head.head
  override def leftTail: ArticleXyyReverse14[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] = new ArticleXyyReverse14(head.tail)
  override def i1: E1                                                                                      = head.head
  override def i2: E2                                                                                      = head.tail.head
  override def i3: E3                                                                                      = head.tail.tail.head
  override def i4: E4                                                                                      = head.tail.tail.tail.head
  override def i5: E5                                                                                      = head.tail.tail.tail.tail.head
  override def i6: E6                                                                                      = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                      = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                      = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                      = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i15: E15                                                                                    = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16](
  val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: E12 :: E13 :: E14 :: E15 :: E16 :: HNil
) extends AnyVal
    with XyyItem16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] {
  override def pudao[T](xyy: T): ArticleXyyReverse17[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] =
    new ArticleXyyReverse17[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16](xyy :: head)
  override def leftHead: E1                                                                                     = head.head
  override def leftTail: ArticleXyyReverse15[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] = new ArticleXyyReverse15(head.tail)
  override def i1: E1                                                                                           = head.head
  override def i2: E2                                                                                           = head.tail.head
  override def i3: E3                                                                                           = head.tail.tail.head
  override def i4: E4                                                                                           = head.tail.tail.tail.head
  override def i5: E5                                                                                           = head.tail.tail.tail.tail.head
  override def i6: E6                                                                                           = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                           = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                           = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                           = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i15: E15                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i16: E16                                                                                         = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17](
  val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: E12 :: E13 :: E14 :: E15 :: E16 :: E17 :: HNil
) extends AnyVal
    with XyyItem17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] {
  override def pudao[T](xyy: T): ArticleXyyReverse18[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] =
    new ArticleXyyReverse18[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17](xyy :: head)
  override def leftHead: E1                                                                                          = head.head
  override def leftTail: ArticleXyyReverse16[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] = new ArticleXyyReverse16(head.tail)
  override def i1: E1                                                                                                = head.head
  override def i2: E2                                                                                                = head.tail.head
  override def i3: E3                                                                                                = head.tail.tail.head
  override def i4: E4                                                                                                = head.tail.tail.tail.head
  override def i5: E5                                                                                                = head.tail.tail.tail.tail.head
  override def i6: E6                                                                                                = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                                = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                                = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                                = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i15: E15                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i16: E16                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i17: E17                                                                                              = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18](
  val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: E12 :: E13 :: E14 :: E15 :: E16 :: E17 :: E18 :: HNil
) extends AnyVal
    with XyyItem18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] {
  override def pudao[T](xyy: T): ArticleXyyReverse19[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] =
    new ArticleXyyReverse19[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18](xyy :: head)
  override def leftHead: E1                                                                                               = head.head
  override def leftTail: ArticleXyyReverse17[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] = new ArticleXyyReverse17(head.tail)
  override def i1: E1                                                                                                     = head.head
  override def i2: E2                                                                                                     = head.tail.head
  override def i3: E3                                                                                                     = head.tail.tail.head
  override def i4: E4                                                                                                     = head.tail.tail.tail.head
  override def i5: E5                                                                                                     = head.tail.tail.tail.tail.head
  override def i6: E6                                                                                                     = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                                     = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                                     = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                                     = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i15: E15                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i16: E16                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i17: E17                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i18: E18                                                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19](
  val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: E12 :: E13 :: E14 :: E15 :: E16 :: E17 :: E18 :: E19 :: HNil
) extends AnyVal
    with XyyItem19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] {
  override def pudao[T](xyy: T): ArticleXyyReverse20[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] =
    new ArticleXyyReverse20[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19](xyy :: head)
  override def leftHead: E1                                                                                                    = head.head
  override def leftTail: ArticleXyyReverse18[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] = new ArticleXyyReverse18(head.tail)
  override def i1: E1                                                                                                          = head.head
  override def i2: E2                                                                                                          = head.tail.head
  override def i3: E3                                                                                                          = head.tail.tail.head
  override def i4: E4                                                                                                          = head.tail.tail.tail.head
  override def i5: E5                                                                                                          = head.tail.tail.tail.tail.head
  override def i6: E6                                                                                                          = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                                          = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                                          = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                                          = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i15: E15                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i16: E16                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i17: E17                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i18: E18                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i19: E19                                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20](
  val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: E12 :: E13 :: E14 :: E15 :: E16 :: E17 :: E18 :: E19 :: E20 :: HNil
) extends AnyVal
    with XyyItem20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] {
  override def pudao[T](xyy: T): ArticleXyyReverse21[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] =
    new ArticleXyyReverse21[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20](xyy :: head)
  override def leftHead: E1                                                                                                         = head.head
  override def leftTail: ArticleXyyReverse19[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] = new ArticleXyyReverse19(head.tail)
  override def i1: E1                                                                                                               = head.head
  override def i2: E2                                                                                                               = head.tail.head
  override def i3: E3                                                                                                               = head.tail.tail.head
  override def i4: E4                                                                                                               = head.tail.tail.tail.head
  override def i5: E5                                                                                                               = head.tail.tail.tail.tail.head
  override def i6: E6                                                                                                               = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                                               = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                                               = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i15: E15                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i16: E16                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i17: E17                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i18: E18                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i19: E19                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i20: E20                                                                                                             = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21](
  val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: E12 :: E13 :: E14 :: E15 :: E16 :: E17 :: E18 :: E19 :: E20 :: E21 :: HNil
) extends AnyVal
    with XyyItem21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] {
  override def pudao[T](xyy: T): ArticleXyyReverse22[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] =
    new ArticleXyyReverse22[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21](xyy :: head)
  override def leftHead: E1 = head.head
  override def leftTail: ArticleXyyReverse20[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] =
    new ArticleXyyReverse20(head.tail)
  override def i1: E1   = head.head
  override def i2: E2   = head.tail.head
  override def i3: E3   = head.tail.tail.head
  override def i4: E4   = head.tail.tail.tail.head
  override def i5: E5   = head.tail.tail.tail.tail.head
  override def i6: E6   = head.tail.tail.tail.tail.tail.head
  override def i7: E7   = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8   = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9   = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i15: E15 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i16: E16 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i17: E17 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i18: E18 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i19: E19 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i20: E20 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i21: E21 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
class ArticleXyyReverse22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22](
  val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: E12 :: E13 :: E14 :: E15 :: E16 :: E17 :: E18 :: E19 :: E20 :: E21 :: E22 :: HNil
) extends AnyVal
    with XyyItem22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22] {
  override def leftHead: E1 = head.head
  override def leftTail: ArticleXyyReverse21[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22] =
    new ArticleXyyReverse21(head.tail)
  override def i1: E1   = head.head
  override def i2: E2   = head.tail.head
  override def i3: E3   = head.tail.tail.head
  override def i4: E4   = head.tail.tail.tail.head
  override def i5: E5   = head.tail.tail.tail.tail.head
  override def i6: E6   = head.tail.tail.tail.tail.tail.head
  override def i7: E7   = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8   = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9   = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i15: E15 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i16: E16 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i17: E17 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i18: E18 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i19: E19 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i20: E20 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i21: E21 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i22: E22 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
