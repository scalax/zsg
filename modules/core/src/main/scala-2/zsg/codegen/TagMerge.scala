package zsg
class TagMerge2[I1, I2] {
  type Target
}
object TagMerge2 extends TagMerge2ImplicitImpl {
  type Aux[I1, I2, T] = TagMerge2[I1, I2] { type Target = T }
  val tagMergeAny                                    = new TagMerge2[Any, Any]
  def tagMerge2[I1, I2, Target]: Aux[I1, I2, Target] = tagMergeAny.asInstanceOf[Aux[I1, I2, Target]]
  implicit def merge2Implicit2[S1, S2, T1, T2, Target1, Target2](implicit
    i1: Aux[S1, S2, Target1],
    i2: Aux[T1, T2, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[Target1, Target2]] = tagMerge2
}
trait TagMerge2ImplicitImpl {
  implicit def merge2Implicit1[I1, I2]: TagMerge2.Aux[I1, I2, TagMerge2[I1, I2]] = TagMerge2.tagMerge2
}
class TagMerge3[I1, I2, I3] {
  type Target
}
object TagMerge3 extends TagMerge3ImplicitImpl {
  type Aux[I1, I2, I3, T] = TagMerge3[I1, I2, I3] { type Target = T }
  val tagMergeAny                                            = new TagMerge3[Any, Any, Any]
  def tagMerge3[I1, I2, I3, Target]: Aux[I1, I2, I3, Target] = tagMergeAny.asInstanceOf[Aux[I1, I2, I3, Target]]
  implicit def merge3Implicit2[S1, S2, S3, T1, T2, T3, Target1, Target2](implicit
    i1: Aux[S1, S2, S3, Target1],
    i2: Aux[T1, T2, T3, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[Target1, Target2]] = tagMerge3
}
trait TagMerge3ImplicitImpl {
  implicit def merge3Implicit1[I1, I2, I3]: TagMerge3.Aux[I1, I2, I3, TagMerge3[I1, I2, I3]] = TagMerge3.tagMerge3
}
class TagMerge4[I1, I2, I3, I4] {
  type Target
}
object TagMerge4 extends TagMerge4ImplicitImpl {
  type Aux[I1, I2, I3, I4, T] = TagMerge4[I1, I2, I3, I4] { type Target = T }
  val tagMergeAny                                                    = new TagMerge4[Any, Any, Any, Any]
  def tagMerge4[I1, I2, I3, I4, Target]: Aux[I1, I2, I3, I4, Target] = tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, Target]]
  implicit def merge4Implicit2[S1, S2, S3, S4, T1, T2, T3, T4, Target1, Target2](implicit
    i1: Aux[S1, S2, S3, S4, Target1],
    i2: Aux[T1, T2, T3, T4, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[Target1, Target2]] = tagMerge4
}
trait TagMerge4ImplicitImpl {
  implicit def merge4Implicit1[I1, I2, I3, I4]: TagMerge4.Aux[I1, I2, I3, I4, TagMerge4[I1, I2, I3, I4]] = TagMerge4.tagMerge4
}
class TagMerge5[I1, I2, I3, I4, I5] {
  type Target
}
object TagMerge5 extends TagMerge5ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, T] = TagMerge5[I1, I2, I3, I4, I5] { type Target = T }
  val tagMergeAny                                                            = new TagMerge5[Any, Any, Any, Any, Any]
  def tagMerge5[I1, I2, I3, I4, I5, Target]: Aux[I1, I2, I3, I4, I5, Target] = tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, Target]]
  implicit def merge5Implicit2[S1, S2, S3, S4, S5, T1, T2, T3, T4, T5, Target1, Target2](implicit
    i1: Aux[S1, S2, S3, S4, S5, Target1],
    i2: Aux[T1, T2, T3, T4, T5, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[Target1, Target2]] = tagMerge5
}
trait TagMerge5ImplicitImpl {
  implicit def merge5Implicit1[I1, I2, I3, I4, I5]: TagMerge5.Aux[I1, I2, I3, I4, I5, TagMerge5[I1, I2, I3, I4, I5]] = TagMerge5.tagMerge5
}
class TagMerge6[I1, I2, I3, I4, I5, I6] {
  type Target
}
object TagMerge6 extends TagMerge6ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, T] = TagMerge6[I1, I2, I3, I4, I5, I6] { type Target = T }
  val tagMergeAny = new TagMerge6[Any, Any, Any, Any, Any, Any]
  def tagMerge6[I1, I2, I3, I4, I5, I6, Target]: Aux[I1, I2, I3, I4, I5, I6, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, Target]]
  implicit def merge6Implicit2[S1, S2, S3, S4, S5, S6, T1, T2, T3, T4, T5, T6, Target1, Target2](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    Target1,
    Target2
  ]] = tagMerge6
}
trait TagMerge6ImplicitImpl {
  implicit def merge6Implicit1[I1, I2, I3, I4, I5, I6]: TagMerge6.Aux[I1, I2, I3, I4, I5, I6, TagMerge6[I1, I2, I3, I4, I5, I6]] =
    TagMerge6.tagMerge6
}
class TagMerge7[I1, I2, I3, I4, I5, I6, I7] {
  type Target
}
object TagMerge7 extends TagMerge7ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, T] = TagMerge7[I1, I2, I3, I4, I5, I6, I7] { type Target = T }
  val tagMergeAny = new TagMerge7[Any, Any, Any, Any, Any, Any, Any]
  def tagMerge7[I1, I2, I3, I4, I5, I6, I7, Target]: Aux[I1, I2, I3, I4, I5, I6, I7, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, Target]]
  implicit def merge7Implicit2[S1, S2, S3, S4, S5, S6, S7, T1, T2, T3, T4, T5, T6, T7, Target1, Target2](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[Target1, Target2]] = tagMerge7
}
trait TagMerge7ImplicitImpl {
  implicit def merge7Implicit1[I1, I2, I3, I4, I5, I6, I7]
    : TagMerge7.Aux[I1, I2, I3, I4, I5, I6, I7, TagMerge7[I1, I2, I3, I4, I5, I6, I7]] = TagMerge7.tagMerge7
}
class TagMerge8[I1, I2, I3, I4, I5, I6, I7, I8] {
  type Target
}
object TagMerge8 extends TagMerge8ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, T] = TagMerge8[I1, I2, I3, I4, I5, I6, I7, I8] { type Target = T }
  val tagMergeAny = new TagMerge8[Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge8[I1, I2, I3, I4, I5, I6, I7, I8, Target]: Aux[I1, I2, I3, I4, I5, I6, I7, I8, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, Target]]
  implicit def merge8Implicit2[S1, S2, S3, S4, S5, S6, S7, S8, T1, T2, T3, T4, T5, T6, T7, T8, Target1, Target2](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[Target1, Target2]] = tagMerge8
}
trait TagMerge8ImplicitImpl {
  implicit def merge8Implicit1[I1, I2, I3, I4, I5, I6, I7, I8]
    : TagMerge8.Aux[I1, I2, I3, I4, I5, I6, I7, I8, TagMerge8[I1, I2, I3, I4, I5, I6, I7, I8]] = TagMerge8.tagMerge8
}
class TagMerge9[I1, I2, I3, I4, I5, I6, I7, I8, I9] {
  type Target
}
object TagMerge9 extends TagMerge9ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, T] = TagMerge9[I1, I2, I3, I4, I5, I6, I7, I8, I9] { type Target = T }
  val tagMergeAny = new TagMerge9[Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge9[I1, I2, I3, I4, I5, I6, I7, I8, I9, Target]: Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, Target]]
  implicit def merge9Implicit2[S1, S2, S3, S4, S5, S6, S7, S8, S9, T1, T2, T3, T4, T5, T6, T7, T8, T9, Target1, Target2](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, S9, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, T9, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[S9, T9], ItemTag2[Target1, Target2]] = tagMerge9
}
trait TagMerge9ImplicitImpl {
  implicit def merge9Implicit1[I1, I2, I3, I4, I5, I6, I7, I8, I9]
    : TagMerge9.Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, TagMerge9[I1, I2, I3, I4, I5, I6, I7, I8, I9]] = TagMerge9.tagMerge9
}
class TagMerge10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] {
  type Target
}
object TagMerge10 extends TagMerge10ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, T] = TagMerge10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] { type Target = T }
  val tagMergeAny = new TagMerge10[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, Target]: Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, Target]]
  implicit def merge10Implicit2[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, Target1, Target2](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[S9, T9], ItemTag2[S10, T10], ItemTag2[Target1, Target2]] = tagMerge10
}
trait TagMerge10ImplicitImpl {
  implicit def merge10Implicit1[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
    : TagMerge10.Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, TagMerge10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]] = TagMerge10.tagMerge10
}
class TagMerge11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] {
  type Target
}
object TagMerge11 extends TagMerge11ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, T] = TagMerge11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] { type Target = T }
  val tagMergeAny = new TagMerge11[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, Target]: Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, Target]]
  implicit def merge11Implicit2[
    S1,
    S2,
    S3,
    S4,
    S5,
    S6,
    S7,
    S8,
    S9,
    S10,
    S11,
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
    Target1,
    Target2
  ](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[S9, T9], ItemTag2[S10, T10], ItemTag2[S11, T11], ItemTag2[Target1, Target2]] = tagMerge11
}
trait TagMerge11ImplicitImpl {
  implicit def merge11Implicit1[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]
    : TagMerge11.Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, TagMerge11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]] =
    TagMerge11.tagMerge11
}
class TagMerge12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] {
  type Target
}
object TagMerge12 extends TagMerge12ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, T] = TagMerge12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] {
    type Target = T
  }
  val tagMergeAny = new TagMerge12[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, Target]
    : Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, Target]]
  implicit def merge12Implicit2[
    S1,
    S2,
    S3,
    S4,
    S5,
    S6,
    S7,
    S8,
    S9,
    S10,
    S11,
    S12,
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
    Target1,
    Target2
  ](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[S9, T9], ItemTag2[S10, T10], ItemTag2[S11, T11], ItemTag2[S12, T12], ItemTag2[Target1, Target2]] =
    tagMerge12
}
trait TagMerge12ImplicitImpl {
  implicit def merge12Implicit1[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
    : TagMerge12.Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, TagMerge12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]] =
    TagMerge12.tagMerge12
}
class TagMerge13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] {
  type Target
}
object TagMerge13 extends TagMerge13ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, T] = TagMerge13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] {
    type Target = T
  }
  val tagMergeAny = new TagMerge13[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, Target]
    : Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, Target]]
  implicit def merge13Implicit2[
    S1,
    S2,
    S3,
    S4,
    S5,
    S6,
    S7,
    S8,
    S9,
    S10,
    S11,
    S12,
    S13,
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
    Target1,
    Target2
  ](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[S9, T9], ItemTag2[S10, T10], ItemTag2[S11, T11], ItemTag2[S12, T12], ItemTag2[S13, T13], ItemTag2[
    Target1,
    Target2
  ]] = tagMerge13
}
trait TagMerge13ImplicitImpl {
  implicit def merge13Implicit1[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]: TagMerge13.Aux[
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8,
    I9,
    I10,
    I11,
    I12,
    I13,
    TagMerge13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]
  ] = TagMerge13.tagMerge13
}
class TagMerge14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] {
  type Target
}
object TagMerge14 extends TagMerge14ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, T] =
    TagMerge14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] { type Target = T }
  val tagMergeAny = new TagMerge14[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, Target]
    : Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, Target]]
  implicit def merge14Implicit2[
    S1,
    S2,
    S3,
    S4,
    S5,
    S6,
    S7,
    S8,
    S9,
    S10,
    S11,
    S12,
    S13,
    S14,
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
    Target1,
    Target2
  ](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[S9, T9], ItemTag2[S10, T10], ItemTag2[S11, T11], ItemTag2[S12, T12], ItemTag2[S13, T13], ItemTag2[
    S14,
    T14
  ], ItemTag2[Target1, Target2]] = tagMerge14
}
trait TagMerge14ImplicitImpl {
  implicit def merge14Implicit1[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]: TagMerge14.Aux[
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8,
    I9,
    I10,
    I11,
    I12,
    I13,
    I14,
    TagMerge14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
  ] = TagMerge14.tagMerge14
}
class TagMerge15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] {
  type Target
}
object TagMerge15 extends TagMerge15ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, T] =
    TagMerge15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] { type Target = T }
  val tagMergeAny = new TagMerge15[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, Target]
    : Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, Target]]
  implicit def merge15Implicit2[
    S1,
    S2,
    S3,
    S4,
    S5,
    S6,
    S7,
    S8,
    S9,
    S10,
    S11,
    S12,
    S13,
    S14,
    S15,
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
    Target1,
    Target2
  ](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[S9, T9], ItemTag2[S10, T10], ItemTag2[S11, T11], ItemTag2[S12, T12], ItemTag2[S13, T13], ItemTag2[
    S14,
    T14
  ], ItemTag2[S15, T15], ItemTag2[Target1, Target2]] = tagMerge15
}
trait TagMerge15ImplicitImpl {
  implicit def merge15Implicit1[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]: TagMerge15.Aux[
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8,
    I9,
    I10,
    I11,
    I12,
    I13,
    I14,
    I15,
    TagMerge15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]
  ] = TagMerge15.tagMerge15
}
class TagMerge16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] {
  type Target
}
object TagMerge16 extends TagMerge16ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, T] =
    TagMerge16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] { type Target = T }
  val tagMergeAny = new TagMerge16[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, Target]
    : Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, Target]]
  implicit def merge16Implicit2[
    S1,
    S2,
    S3,
    S4,
    S5,
    S6,
    S7,
    S8,
    S9,
    S10,
    S11,
    S12,
    S13,
    S14,
    S15,
    S16,
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
    Target1,
    Target2
  ](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[S9, T9], ItemTag2[S10, T10], ItemTag2[S11, T11], ItemTag2[S12, T12], ItemTag2[S13, T13], ItemTag2[
    S14,
    T14
  ], ItemTag2[S15, T15], ItemTag2[S16, T16], ItemTag2[Target1, Target2]] = tagMerge16
}
trait TagMerge16ImplicitImpl {
  implicit def merge16Implicit1[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]: TagMerge16.Aux[
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8,
    I9,
    I10,
    I11,
    I12,
    I13,
    I14,
    I15,
    I16,
    TagMerge16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]
  ] = TagMerge16.tagMerge16
}
class TagMerge17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] {
  type Target
}
object TagMerge17 extends TagMerge17ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, T] =
    TagMerge17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] { type Target = T }
  val tagMergeAny = new TagMerge17[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, Target]
    : Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, Target]]
  implicit def merge17Implicit2[
    S1,
    S2,
    S3,
    S4,
    S5,
    S6,
    S7,
    S8,
    S9,
    S10,
    S11,
    S12,
    S13,
    S14,
    S15,
    S16,
    S17,
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
    Target1,
    Target2
  ](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16, S17, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[S9, T9], ItemTag2[S10, T10], ItemTag2[S11, T11], ItemTag2[S12, T12], ItemTag2[S13, T13], ItemTag2[
    S14,
    T14
  ], ItemTag2[S15, T15], ItemTag2[S16, T16], ItemTag2[S17, T17], ItemTag2[Target1, Target2]] = tagMerge17
}
trait TagMerge17ImplicitImpl {
  implicit def merge17Implicit1[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]: TagMerge17.Aux[
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8,
    I9,
    I10,
    I11,
    I12,
    I13,
    I14,
    I15,
    I16,
    I17,
    TagMerge17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]
  ] = TagMerge17.tagMerge17
}
class TagMerge18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] {
  type Target
}
object TagMerge18 extends TagMerge18ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, T] =
    TagMerge18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] { type Target = T }
  val tagMergeAny = new TagMerge18[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, Target]
    : Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, Target]]
  implicit def merge18Implicit2[
    S1,
    S2,
    S3,
    S4,
    S5,
    S6,
    S7,
    S8,
    S9,
    S10,
    S11,
    S12,
    S13,
    S14,
    S15,
    S16,
    S17,
    S18,
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
    Target1,
    Target2
  ](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16, S17, S18, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[S9, T9], ItemTag2[S10, T10], ItemTag2[S11, T11], ItemTag2[S12, T12], ItemTag2[S13, T13], ItemTag2[
    S14,
    T14
  ], ItemTag2[S15, T15], ItemTag2[S16, T16], ItemTag2[S17, T17], ItemTag2[S18, T18], ItemTag2[Target1, Target2]] = tagMerge18
}
trait TagMerge18ImplicitImpl {
  implicit def merge18Implicit1[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]: TagMerge18.Aux[
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8,
    I9,
    I10,
    I11,
    I12,
    I13,
    I14,
    I15,
    I16,
    I17,
    I18,
    TagMerge18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]
  ] = TagMerge18.tagMerge18
}
class TagMerge19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] {
  type Target
}
object TagMerge19 extends TagMerge19ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, T] =
    TagMerge19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] { type Target = T }
  val tagMergeAny = new TagMerge19[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, Target]
    : Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, Target]]
  implicit def merge19Implicit2[
    S1,
    S2,
    S3,
    S4,
    S5,
    S6,
    S7,
    S8,
    S9,
    S10,
    S11,
    S12,
    S13,
    S14,
    S15,
    S16,
    S17,
    S18,
    S19,
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
    Target1,
    Target2
  ](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16, S17, S18, S19, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[S9, T9], ItemTag2[S10, T10], ItemTag2[S11, T11], ItemTag2[S12, T12], ItemTag2[S13, T13], ItemTag2[
    S14,
    T14
  ], ItemTag2[S15, T15], ItemTag2[S16, T16], ItemTag2[S17, T17], ItemTag2[S18, T18], ItemTag2[S19, T19], ItemTag2[Target1, Target2]] =
    tagMerge19
}
trait TagMerge19ImplicitImpl {
  implicit def merge19Implicit1[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]: TagMerge19.Aux[
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8,
    I9,
    I10,
    I11,
    I12,
    I13,
    I14,
    I15,
    I16,
    I17,
    I18,
    I19,
    TagMerge19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]
  ] = TagMerge19.tagMerge19
}
class TagMerge20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] {
  type Target
}
object TagMerge20 extends TagMerge20ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, T] =
    TagMerge20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] { type Target = T }
  val tagMergeAny = new TagMerge20[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, Target]
    : Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, Target]]
  implicit def merge20Implicit2[
    S1,
    S2,
    S3,
    S4,
    S5,
    S6,
    S7,
    S8,
    S9,
    S10,
    S11,
    S12,
    S13,
    S14,
    S15,
    S16,
    S17,
    S18,
    S19,
    S20,
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
    Target1,
    Target2
  ](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16, S17, S18, S19, S20, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[S9, T9], ItemTag2[S10, T10], ItemTag2[S11, T11], ItemTag2[S12, T12], ItemTag2[S13, T13], ItemTag2[
    S14,
    T14
  ], ItemTag2[S15, T15], ItemTag2[S16, T16], ItemTag2[S17, T17], ItemTag2[S18, T18], ItemTag2[S19, T19], ItemTag2[S20, T20], ItemTag2[
    Target1,
    Target2
  ]] = tagMerge20
}
trait TagMerge20ImplicitImpl {
  implicit def merge20Implicit1[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20]: TagMerge20.Aux[
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8,
    I9,
    I10,
    I11,
    I12,
    I13,
    I14,
    I15,
    I16,
    I17,
    I18,
    I19,
    I20,
    TagMerge20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20]
  ] = TagMerge20.tagMerge20
}
class TagMerge21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21] {
  type Target
}
object TagMerge21 extends TagMerge21ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, T] =
    TagMerge21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21] { type Target = T }
  val tagMergeAny = new TagMerge21[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, Target]
    : Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, Target] =
    tagMergeAny.asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, Target]]
  implicit def merge21Implicit2[
    S1,
    S2,
    S3,
    S4,
    S5,
    S6,
    S7,
    S8,
    S9,
    S10,
    S11,
    S12,
    S13,
    S14,
    S15,
    S16,
    S17,
    S18,
    S19,
    S20,
    S21,
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
    Target1,
    Target2
  ](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16, S17, S18, S19, S20, S21, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[S9, T9], ItemTag2[S10, T10], ItemTag2[S11, T11], ItemTag2[S12, T12], ItemTag2[S13, T13], ItemTag2[
    S14,
    T14
  ], ItemTag2[S15, T15], ItemTag2[S16, T16], ItemTag2[S17, T17], ItemTag2[S18, T18], ItemTag2[S19, T19], ItemTag2[S20, T20], ItemTag2[
    S21,
    T21
  ], ItemTag2[Target1, Target2]] = tagMerge21
}
trait TagMerge21ImplicitImpl {
  implicit def merge21Implicit1[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21]
    : TagMerge21.Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, TagMerge21[
      I1,
      I2,
      I3,
      I4,
      I5,
      I6,
      I7,
      I8,
      I9,
      I10,
      I11,
      I12,
      I13,
      I14,
      I15,
      I16,
      I17,
      I18,
      I19,
      I20,
      I21
    ]] = TagMerge21.tagMerge21
}
class TagMerge22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22] {
  type Target
}
object TagMerge22 extends TagMerge22ImplicitImpl {
  type Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22, T] =
    TagMerge22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22] { type Target = T }
  val tagMergeAny =
    new TagMerge22[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def tagMerge22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22, Target]
    : Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22, Target] = tagMergeAny
    .asInstanceOf[Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22, Target]]
  implicit def merge22Implicit2[
    S1,
    S2,
    S3,
    S4,
    S5,
    S6,
    S7,
    S8,
    S9,
    S10,
    S11,
    S12,
    S13,
    S14,
    S15,
    S16,
    S17,
    S18,
    S19,
    S20,
    S21,
    S22,
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
    Target1,
    Target2
  ](implicit
    i1: Aux[S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16, S17, S18, S19, S20, S21, S22, Target1],
    i2: Aux[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, Target2]
  ): Aux[ItemTag2[S1, T1], ItemTag2[S2, T2], ItemTag2[S3, T3], ItemTag2[S4, T4], ItemTag2[S5, T5], ItemTag2[S6, T6], ItemTag2[
    S7,
    T7
  ], ItemTag2[S8, T8], ItemTag2[S9, T9], ItemTag2[S10, T10], ItemTag2[S11, T11], ItemTag2[S12, T12], ItemTag2[S13, T13], ItemTag2[
    S14,
    T14
  ], ItemTag2[S15, T15], ItemTag2[S16, T16], ItemTag2[S17, T17], ItemTag2[S18, T18], ItemTag2[S19, T19], ItemTag2[S20, T20], ItemTag2[
    S21,
    T21
  ], ItemTag2[S22, T22], ItemTag2[Target1, Target2]] = tagMerge22
}
trait TagMerge22ImplicitImpl {
  implicit def merge22Implicit1[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22]
    : TagMerge22.Aux[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22, TagMerge22[
      I1,
      I2,
      I3,
      I4,
      I5,
      I6,
      I7,
      I8,
      I9,
      I10,
      I11,
      I12,
      I13,
      I14,
      I15,
      I16,
      I17,
      I18,
      I19,
      I20,
      I21,
      I22
    ]] = TagMerge22.tagMerge22
}
