class AppendXyy0 extends ItemPlusXyy0 with ArticleXyy0 {
  override def eat[T](xyy: T): AppendXyy1[T] = new AppendXyy1(EatValue0.addRightItem(xyy))
}
class AppendXyy1[I1](override protected val item: EatValue0#AddRightItem[I1])
    extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]]
    with ItemPlusXyy1[I1]
    with ArticleXyy1[I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy2[I1, T] = new AppendXyy2(item.addRightItem(xyy))
}
class AppendXyy2[I1, I2](override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2])
    extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]]
    with ItemPlusXyy2[I1, I2]
    with ArticleXyy2[I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy3[I1, I2, T] = new AppendXyy3(item.addRightItem(xyy))
}
class AppendXyy3[I1, I2, I3](override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3])
    extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]]
    with ItemPlusXyy3[I1, I2, I3]
    with ArticleXyy3[I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy4[I1, I2, I3, T] = new AppendXyy4(item.addRightItem(xyy))
}
class AppendXyy4[I1, I2, I3, I4](override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4])
    extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]]
    with ItemPlusXyy4[I1, I2, I3, I4]
    with ArticleXyy4[I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy5[I1, I2, I3, I4, T] = new AppendXyy5(item.addRightItem(xyy))
}
class AppendXyy5[I1, I2, I3, I4, I5](override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5])
    extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]]
    with ItemPlusXyy5[I1, I2, I3, I4, I5]
    with ArticleXyy5[I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy6[I1, I2, I3, I4, I5, T] = new AppendXyy6(item.addRightItem(xyy))
}
class AppendXyy6[I1, I2, I3, I4, I5, I6](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]]
    with ItemPlusXyy6[I1, I2, I3, I4, I5, I6]
    with ArticleXyy6[I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy7[I1, I2, I3, I4, I5, I6, T] = new AppendXyy7(item.addRightItem(xyy))
}
class AppendXyy7[I1, I2, I3, I4, I5, I6, I7](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]]
    with ItemPlusXyy7[I1, I2, I3, I4, I5, I6, I7]
    with ArticleXyy7[I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy8[I1, I2, I3, I4, I5, I6, I7, T] = new AppendXyy8(item.addRightItem(xyy))
}
class AppendXyy8[I1, I2, I3, I4, I5, I6, I7, I8](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]]
    with ItemPlusXyy8[I1, I2, I3, I4, I5, I6, I7, I8]
    with ArticleXyy8[I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy9[I1, I2, I3, I4, I5, I6, I7, I8, T] = new AppendXyy9(item.addRightItem(xyy))
}
class AppendXyy9[I1, I2, I3, I4, I5, I6, I7, I8, I9](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]
) extends AnyVal
    with Xyy[
      EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[I9]
    ]
    with ItemPlusXyy9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
    with ArticleXyy9[I9, I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy10[I1, I2, I3, I4, I5, I6, I7, I8, I9, T] = new AppendXyy10(item.addRightItem(xyy))
}
class AppendXyy10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]]
    with ItemPlusXyy10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
    with ArticleXyy10[I10, I9, I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, T] = new AppendXyy11(item.addRightItem(xyy))
}
class AppendXyy11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]]
    with ItemPlusXyy11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]
    with ArticleXyy11[I11, I10, I9, I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, T] = new AppendXyy12(item.addRightItem(xyy))
}
class AppendXyy12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]]
    with ItemPlusXyy12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
    with ArticleXyy12[I12, I11, I10, I9, I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, T] = new AppendXyy13(item.addRightItem(xyy))
}
class AppendXyy13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]]
    with ItemPlusXyy13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]
    with ArticleXyy13[I13, I12, I11, I10, I9, I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, T] = new AppendXyy14(item.addRightItem(xyy))
}
class AppendXyy14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]]
    with ItemPlusXyy14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
    with ArticleXyy14[I14, I13, I12, I11, I10, I9, I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, T] = new AppendXyy15(item.addRightItem(xyy))
}
class AppendXyy15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]]
    with ItemPlusXyy15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]
    with ArticleXyy15[I15, I14, I13, I12, I11, I10, I9, I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, T] = new AppendXyy16(item.addRightItem(xyy))
}
class AppendXyy16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]]
    with ItemPlusXyy16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]
    with ArticleXyy16[I16, I15, I14, I13, I12, I11, I10, I9, I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, T] = new AppendXyy17(item.addRightItem(xyy))
}
class AppendXyy17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]]
    with ItemPlusXyy17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]
    with ArticleXyy17[I17, I16, I15, I14, I13, I12, I11, I10, I9, I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, T] = new AppendXyy18(item.addRightItem(xyy))
}
class AppendXyy18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[
    I18
  ]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[I18]]
    with ItemPlusXyy18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]
    with ArticleXyy18[I18, I17, I16, I15, I14, I13, I12, I11, I10, I9, I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, T] = new AppendXyy19(item.addRightItem(xyy))
}
class AppendXyy19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[
    I18
  ]#AddRightItem[I19]
) extends AnyVal
    with Xyy[
      EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[I9]#AddRightItem[
        I10
      ]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[I18]#AddRightItem[I19]
    ]
    with ItemPlusXyy19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]
    with ArticleXyy19[I19, I18, I17, I16, I15, I14, I13, I12, I11, I10, I9, I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, T] =
    new AppendXyy20(item.addRightItem(xyy))
}
class AppendXyy20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[
    I18
  ]#AddRightItem[I19]#AddRightItem[I20]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[I18]#AddRightItem[
      I19
    ]#AddRightItem[I20]]
    with ItemPlusXyy20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20]
    with ArticleXyy20[I20, I19, I18, I17, I16, I15, I14, I13, I12, I11, I10, I9, I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, T] =
    new AppendXyy21(item.addRightItem(xyy))
}
class AppendXyy21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[
    I18
  ]#AddRightItem[I19]#AddRightItem[I20]#AddRightItem[I21]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[I18]#AddRightItem[
      I19
    ]#AddRightItem[I20]#AddRightItem[I21]]
    with ItemPlusXyy21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21]
    with ArticleXyy21[I21, I20, I19, I18, I17, I16, I15, I14, I13, I12, I11, I10, I9, I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
  override def eat[T](xyy: T): AppendXyy22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, T] =
    new AppendXyy22(item.addRightItem(xyy))
}
class AppendXyy22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22](
  override protected val item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[
    I18
  ]#AddRightItem[I19]#AddRightItem[I20]#AddRightItem[I21]#AddRightItem[I22]
) extends AnyVal
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[I18]#AddRightItem[
      I19
    ]#AddRightItem[I20]#AddRightItem[I21]#AddRightItem[I22]]
    with ItemPlusXyy22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22]
    with ArticleXyy22[I22, I21, I20, I19, I18, I17, I16, I15, I14, I13, I12, I11, I10, I9, I8, I7, I6, I5, I4, I3, I2, I1] {
  self =>
}
