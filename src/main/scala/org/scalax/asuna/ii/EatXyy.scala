package org.scalax.asuna.ii.item
class ArticleXyy0 {
  def eat[T](xyy: T): ArticleXyy1[T]   = new ArticleXyy1(xyy)
  def pudao[T](xyy: T): ArticleXyy1[T] = new ArticleXyy1(xyy)
}
object ArticleXyy0 extends ArticleXyy0
class ArticleXyy1[E1](val head: E1) {
  def eat[T](xyy: T): ArticleXyy2[E1, T]   = new ArticleXyy2(head, org.scalax.asuna.mapper.item.EatValue0.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy2[T, E1] = new ArticleXyy2(xyy, org.scalax.asuna.mapper.item.EatValue0.addRightItem(head))
}
class ArticleXyy2[E1, E2](val head: E1, val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]) {
  def eat[T](xyy: T): ArticleXyy3[E1, E2, T]   = new ArticleXyy3(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy3[T, E2, E1] = new ArticleXyy3(xyy, item.addRightItem(head))
}
class ArticleXyy3[E1, E2, E3](val head: E1, val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]) {
  def eat[T](xyy: T): ArticleXyy4[E1, E2, E3, T]   = new ArticleXyy4(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy4[T, E2, E3, E1] = new ArticleXyy4(xyy, item.addRightItem(head))
}
class ArticleXyy4[E1, E2, E3, E4](val head: E1, val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]) {
  def eat[T](xyy: T): ArticleXyy5[E1, E2, E3, E4, T]   = new ArticleXyy5(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy5[T, E2, E3, E4, E1] = new ArticleXyy5(xyy, item.addRightItem(head))
}
class ArticleXyy5[E1, E2, E3, E4, E5](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]
) {
  def eat[T](xyy: T): ArticleXyy6[E1, E2, E3, E4, E5, T]   = new ArticleXyy6(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy6[T, E2, E3, E4, E5, E1] = new ArticleXyy6(xyy, item.addRightItem(head))
}
class ArticleXyy6[E1, E2, E3, E4, E5, E6](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]
) {
  def eat[T](xyy: T): ArticleXyy7[E1, E2, E3, E4, E5, E6, T]   = new ArticleXyy7(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy7[T, E2, E3, E4, E5, E6, E1] = new ArticleXyy7(xyy, item.addRightItem(head))
}
class ArticleXyy7[E1, E2, E3, E4, E5, E6, E7](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]
) {
  def eat[T](xyy: T): ArticleXyy8[E1, E2, E3, E4, E5, E6, E7, T]   = new ArticleXyy8(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy8[T, E2, E3, E4, E5, E6, E7, E1] = new ArticleXyy8(xyy, item.addRightItem(head))
}
class ArticleXyy8[E1, E2, E3, E4, E5, E6, E7, E8](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]
) {
  def eat[T](xyy: T): ArticleXyy9[E1, E2, E3, E4, E5, E6, E7, E8, T]   = new ArticleXyy9(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy9[T, E2, E3, E4, E5, E6, E7, E8, E1] = new ArticleXyy9(xyy, item.addRightItem(head))
}
class ArticleXyy9[E1, E2, E3, E4, E5, E6, E7, E8, E9](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]#AddRightItem[
    E9
  ]
) {
  def eat[T](xyy: T): ArticleXyy10[E1, E2, E3, E4, E5, E6, E7, E8, E9, T]   = new ArticleXyy10(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy10[T, E2, E3, E4, E5, E6, E7, E8, E9, E1] = new ArticleXyy10(xyy, item.addRightItem(head))
}
class ArticleXyy10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]#AddRightItem[
    E9
  ]#AddRightItem[E10]
) {
  def eat[T](xyy: T): ArticleXyy11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, T]   = new ArticleXyy11(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy11[T, E2, E3, E4, E5, E6, E7, E8, E9, E10, E1] = new ArticleXyy11(xyy, item.addRightItem(head))
}
class ArticleXyy11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]#AddRightItem[
    E9
  ]#AddRightItem[E10]#AddRightItem[E11]
) {
  def eat[T](xyy: T): ArticleXyy12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, T]   = new ArticleXyy12(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy12[T, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E1] = new ArticleXyy12(xyy, item.addRightItem(head))
}
class ArticleXyy12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]#AddRightItem[
    E9
  ]#AddRightItem[E10]#AddRightItem[E11]#AddRightItem[E12]
) {
  def eat[T](xyy: T): ArticleXyy13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, T]   = new ArticleXyy13(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy13[T, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E1] = new ArticleXyy13(xyy, item.addRightItem(head))
}
class ArticleXyy13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]#AddRightItem[
    E9
  ]#AddRightItem[E10]#AddRightItem[E11]#AddRightItem[E12]#AddRightItem[E13]
) {
  def eat[T](xyy: T): ArticleXyy14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, T]   = new ArticleXyy14(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy14[T, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E1] = new ArticleXyy14(xyy, item.addRightItem(head))
}
class ArticleXyy14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]#AddRightItem[
    E9
  ]#AddRightItem[E10]#AddRightItem[E11]#AddRightItem[E12]#AddRightItem[E13]#AddRightItem[E14]
) {
  def eat[T](xyy: T): ArticleXyy15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, T]   = new ArticleXyy15(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy15[T, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E1] = new ArticleXyy15(xyy, item.addRightItem(head))
}
class ArticleXyy15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]#AddRightItem[
    E9
  ]#AddRightItem[E10]#AddRightItem[E11]#AddRightItem[E12]#AddRightItem[E13]#AddRightItem[E14]#AddRightItem[E15]
) {
  def eat[T](xyy: T): ArticleXyy16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, T]   = new ArticleXyy16(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy16[T, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E1] = new ArticleXyy16(xyy, item.addRightItem(head))
}
class ArticleXyy16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]#AddRightItem[
    E9
  ]#AddRightItem[E10]#AddRightItem[E11]#AddRightItem[E12]#AddRightItem[E13]#AddRightItem[E14]#AddRightItem[E15]#AddRightItem[E16]
) {
  def eat[T](xyy: T): ArticleXyy17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, T]   = new ArticleXyy17(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy17[T, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E1] = new ArticleXyy17(xyy, item.addRightItem(head))
}
class ArticleXyy17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]#AddRightItem[
    E9
  ]#AddRightItem[E10]#AddRightItem[E11]#AddRightItem[E12]#AddRightItem[E13]#AddRightItem[E14]#AddRightItem[E15]#AddRightItem[E16]#AddRightItem[E17]
) {
  def eat[T](xyy: T): ArticleXyy18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, T]   = new ArticleXyy18(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy18[T, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E1] = new ArticleXyy18(xyy, item.addRightItem(head))
}
class ArticleXyy18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]#AddRightItem[
    E9
  ]#AddRightItem[E10]#AddRightItem[E11]#AddRightItem[E12]#AddRightItem[E13]#AddRightItem[E14]#AddRightItem[E15]#AddRightItem[E16]#AddRightItem[E17]#AddRightItem[E18]
) {
  def eat[T](xyy: T): ArticleXyy19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, T]   = new ArticleXyy19(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy19[T, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E1] = new ArticleXyy19(xyy, item.addRightItem(head))
}
class ArticleXyy19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]#AddRightItem[
    E9
  ]#AddRightItem[E10]#AddRightItem[E11]#AddRightItem[E12]#AddRightItem[E13]#AddRightItem[E14]#AddRightItem[E15]#AddRightItem[E16]#AddRightItem[E17]#AddRightItem[E18]#AddRightItem[
    E19
  ]
) {
  def eat[T](xyy: T): ArticleXyy20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, T] =
    new ArticleXyy20(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy20[T, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E1] =
    new ArticleXyy20(xyy, item.addRightItem(head))
}
class ArticleXyy20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]#AddRightItem[
    E9
  ]#AddRightItem[E10]#AddRightItem[E11]#AddRightItem[E12]#AddRightItem[E13]#AddRightItem[E14]#AddRightItem[E15]#AddRightItem[E16]#AddRightItem[E17]#AddRightItem[E18]#AddRightItem[
    E19
  ]#AddRightItem[E20]
) {
  def eat[T](xyy: T): ArticleXyy21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, T] =
    new ArticleXyy21(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy21[T, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E1] =
    new ArticleXyy21(xyy, item.addRightItem(head))
}
class ArticleXyy21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]#AddRightItem[
    E9
  ]#AddRightItem[E10]#AddRightItem[E11]#AddRightItem[E12]#AddRightItem[E13]#AddRightItem[E14]#AddRightItem[E15]#AddRightItem[E16]#AddRightItem[E17]#AddRightItem[E18]#AddRightItem[
    E19
  ]#AddRightItem[E20]#AddRightItem[E21]
) {
  def eat[T](xyy: T): ArticleXyy22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, T] =
    new ArticleXyy22(head, item.addRightItem(xyy))
  def pudao[T](xyy: T): ArticleXyy22[T, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E1] =
    new ArticleXyy22(xyy, item.addRightItem(head))
}
class ArticleXyy22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22](
  val head: E1,
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[E2]#AddRightItem[E3]#AddRightItem[E4]#AddRightItem[E5]#AddRightItem[E6]#AddRightItem[E7]#AddRightItem[E8]#AddRightItem[
    E9
  ]#AddRightItem[E10]#AddRightItem[E11]#AddRightItem[E12]#AddRightItem[E13]#AddRightItem[E14]#AddRightItem[E15]#AddRightItem[E16]#AddRightItem[E17]#AddRightItem[E18]#AddRightItem[
    E19
  ]#AddRightItem[E20]#AddRightItem[E21]#AddRightItem[E22]
)
