package org.scalax.asuna.mapper.item
trait ArticleType0 extends TypeParam {
  override type H <: Article0
  override type T <: ArticleType0
}
trait ArticleType1[E1 <: TypeParam] extends TypeParam {
  override type H <: Article1[E1#H]
  override type T <: ArticleType1[E1#T]
}
trait ArticleType2[E1 <: TypeParam, E2 <: TypeParam] extends TypeParam {
  override type H <: Article2[E1#H, E2#H]
  override type T <: ArticleType2[E1#T, E2#T]
}
trait ArticleType3[E1 <: TypeParam, E2 <: TypeParam, E3 <: TypeParam] extends TypeParam {
  override type H <: Article3[E1#H, E2#H, E3#H]
  override type T <: ArticleType3[E1#T, E2#T, E3#T]
}
trait ArticleType4[E1 <: TypeParam, E2 <: TypeParam, E3 <: TypeParam, E4 <: TypeParam] extends TypeParam {
  override type H <: Article4[E1#H, E2#H, E3#H, E4#H]
  override type T <: ArticleType4[E1#T, E2#T, E3#T, E4#T]
}
trait ArticleType5[E1 <: TypeParam, E2 <: TypeParam, E3 <: TypeParam, E4 <: TypeParam, E5 <: TypeParam] extends TypeParam {
  override type H <: Article5[E1#H, E2#H, E3#H, E4#H, E5#H]
  override type T <: ArticleType5[E1#T, E2#T, E3#T, E4#T, E5#T]
}
trait ArticleType6[E1 <: TypeParam, E2 <: TypeParam, E3 <: TypeParam, E4 <: TypeParam, E5 <: TypeParam, E6 <: TypeParam] extends TypeParam {
  override type H <: Article6[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H]
  override type T <: ArticleType6[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T]
}
trait ArticleType7[E1 <: TypeParam, E2 <: TypeParam, E3 <: TypeParam, E4 <: TypeParam, E5 <: TypeParam, E6 <: TypeParam, E7 <: TypeParam] extends TypeParam {
  override type H <: Article7[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H]
  override type T <: ArticleType7[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T]
}
trait ArticleType8[E1 <: TypeParam, E2 <: TypeParam, E3 <: TypeParam, E4 <: TypeParam, E5 <: TypeParam, E6 <: TypeParam, E7 <: TypeParam, E8 <: TypeParam]
    extends TypeParam {
  override type H <: Article8[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H]
  override type T <: ArticleType8[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T]
}
trait ArticleType9[
  E1 <: TypeParam,
  E2 <: TypeParam,
  E3 <: TypeParam,
  E4 <: TypeParam,
  E5 <: TypeParam,
  E6 <: TypeParam,
  E7 <: TypeParam,
  E8 <: TypeParam,
  E9 <: TypeParam
] extends TypeParam {
  override type H <: Article9[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H]
  override type T <: ArticleType9[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T]
}
trait ArticleType10[
  E1 <: TypeParam,
  E2 <: TypeParam,
  E3 <: TypeParam,
  E4 <: TypeParam,
  E5 <: TypeParam,
  E6 <: TypeParam,
  E7 <: TypeParam,
  E8 <: TypeParam,
  E9 <: TypeParam,
  E10 <: TypeParam
] extends TypeParam {
  override type H <: Article10[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H]
  override type T <: ArticleType10[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T]
}
trait ArticleType11[
  E1 <: TypeParam,
  E2 <: TypeParam,
  E3 <: TypeParam,
  E4 <: TypeParam,
  E5 <: TypeParam,
  E6 <: TypeParam,
  E7 <: TypeParam,
  E8 <: TypeParam,
  E9 <: TypeParam,
  E10 <: TypeParam,
  E11 <: TypeParam
] extends TypeParam {
  override type H <: Article11[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H]
  override type T <: ArticleType11[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T]
}
trait ArticleType12[
  E1 <: TypeParam,
  E2 <: TypeParam,
  E3 <: TypeParam,
  E4 <: TypeParam,
  E5 <: TypeParam,
  E6 <: TypeParam,
  E7 <: TypeParam,
  E8 <: TypeParam,
  E9 <: TypeParam,
  E10 <: TypeParam,
  E11 <: TypeParam,
  E12 <: TypeParam
] extends TypeParam {
  override type H <: Article12[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H]
  override type T <: ArticleType12[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T]
}
trait ArticleType13[
  E1 <: TypeParam,
  E2 <: TypeParam,
  E3 <: TypeParam,
  E4 <: TypeParam,
  E5 <: TypeParam,
  E6 <: TypeParam,
  E7 <: TypeParam,
  E8 <: TypeParam,
  E9 <: TypeParam,
  E10 <: TypeParam,
  E11 <: TypeParam,
  E12 <: TypeParam,
  E13 <: TypeParam
] extends TypeParam {
  override type H <: Article13[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H]
  override type T <: ArticleType13[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T]
}
trait ArticleType14[
  E1 <: TypeParam,
  E2 <: TypeParam,
  E3 <: TypeParam,
  E4 <: TypeParam,
  E5 <: TypeParam,
  E6 <: TypeParam,
  E7 <: TypeParam,
  E8 <: TypeParam,
  E9 <: TypeParam,
  E10 <: TypeParam,
  E11 <: TypeParam,
  E12 <: TypeParam,
  E13 <: TypeParam,
  E14 <: TypeParam
] extends TypeParam {
  override type H <: Article14[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H]
  override type T <: ArticleType14[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T]
}
trait ArticleType15[
  E1 <: TypeParam,
  E2 <: TypeParam,
  E3 <: TypeParam,
  E4 <: TypeParam,
  E5 <: TypeParam,
  E6 <: TypeParam,
  E7 <: TypeParam,
  E8 <: TypeParam,
  E9 <: TypeParam,
  E10 <: TypeParam,
  E11 <: TypeParam,
  E12 <: TypeParam,
  E13 <: TypeParam,
  E14 <: TypeParam,
  E15 <: TypeParam
] extends TypeParam {
  override type H <: Article15[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H]
  override type T <: ArticleType15[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T]
}
trait ArticleType16[
  E1 <: TypeParam,
  E2 <: TypeParam,
  E3 <: TypeParam,
  E4 <: TypeParam,
  E5 <: TypeParam,
  E6 <: TypeParam,
  E7 <: TypeParam,
  E8 <: TypeParam,
  E9 <: TypeParam,
  E10 <: TypeParam,
  E11 <: TypeParam,
  E12 <: TypeParam,
  E13 <: TypeParam,
  E14 <: TypeParam,
  E15 <: TypeParam,
  E16 <: TypeParam
] extends TypeParam {
  override type H <: Article16[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H, E16#H]
  override type T <: ArticleType16[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T]
}
trait ArticleType17[
  E1 <: TypeParam,
  E2 <: TypeParam,
  E3 <: TypeParam,
  E4 <: TypeParam,
  E5 <: TypeParam,
  E6 <: TypeParam,
  E7 <: TypeParam,
  E8 <: TypeParam,
  E9 <: TypeParam,
  E10 <: TypeParam,
  E11 <: TypeParam,
  E12 <: TypeParam,
  E13 <: TypeParam,
  E14 <: TypeParam,
  E15 <: TypeParam,
  E16 <: TypeParam,
  E17 <: TypeParam
] extends TypeParam {
  override type H <: Article17[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H, E16#H, E17#H]
  override type T <: ArticleType17[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T]
}
trait ArticleType18[
  E1 <: TypeParam,
  E2 <: TypeParam,
  E3 <: TypeParam,
  E4 <: TypeParam,
  E5 <: TypeParam,
  E6 <: TypeParam,
  E7 <: TypeParam,
  E8 <: TypeParam,
  E9 <: TypeParam,
  E10 <: TypeParam,
  E11 <: TypeParam,
  E12 <: TypeParam,
  E13 <: TypeParam,
  E14 <: TypeParam,
  E15 <: TypeParam,
  E16 <: TypeParam,
  E17 <: TypeParam,
  E18 <: TypeParam
] extends TypeParam {
  override type H <: Article18[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H, E16#H, E17#H, E18#H]
  override type T <: ArticleType18[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T]
}
trait ArticleType19[
  E1 <: TypeParam,
  E2 <: TypeParam,
  E3 <: TypeParam,
  E4 <: TypeParam,
  E5 <: TypeParam,
  E6 <: TypeParam,
  E7 <: TypeParam,
  E8 <: TypeParam,
  E9 <: TypeParam,
  E10 <: TypeParam,
  E11 <: TypeParam,
  E12 <: TypeParam,
  E13 <: TypeParam,
  E14 <: TypeParam,
  E15 <: TypeParam,
  E16 <: TypeParam,
  E17 <: TypeParam,
  E18 <: TypeParam,
  E19 <: TypeParam
] extends TypeParam {
  override type H <: Article19[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H, E16#H, E17#H, E18#H, E19#H]
  override type T <: ArticleType19[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T]
}
trait ArticleType20[
  E1 <: TypeParam,
  E2 <: TypeParam,
  E3 <: TypeParam,
  E4 <: TypeParam,
  E5 <: TypeParam,
  E6 <: TypeParam,
  E7 <: TypeParam,
  E8 <: TypeParam,
  E9 <: TypeParam,
  E10 <: TypeParam,
  E11 <: TypeParam,
  E12 <: TypeParam,
  E13 <: TypeParam,
  E14 <: TypeParam,
  E15 <: TypeParam,
  E16 <: TypeParam,
  E17 <: TypeParam,
  E18 <: TypeParam,
  E19 <: TypeParam,
  E20 <: TypeParam
] extends TypeParam {
  override type H <: Article20[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H, E16#H, E17#H, E18#H, E19#H, E20#H]
  override type T <: ArticleType20[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T, E20#T]
}
trait ArticleType21[
  E1 <: TypeParam,
  E2 <: TypeParam,
  E3 <: TypeParam,
  E4 <: TypeParam,
  E5 <: TypeParam,
  E6 <: TypeParam,
  E7 <: TypeParam,
  E8 <: TypeParam,
  E9 <: TypeParam,
  E10 <: TypeParam,
  E11 <: TypeParam,
  E12 <: TypeParam,
  E13 <: TypeParam,
  E14 <: TypeParam,
  E15 <: TypeParam,
  E16 <: TypeParam,
  E17 <: TypeParam,
  E18 <: TypeParam,
  E19 <: TypeParam,
  E20 <: TypeParam,
  E21 <: TypeParam
] extends TypeParam {
  override type H <: Article21[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H, E16#H, E17#H, E18#H, E19#H, E20#H, E21#H]
  override type T <: ArticleType21[
    E1#T,
    E2#T,
    E3#T,
    E4#T,
    E5#T,
    E6#T,
    E7#T,
    E8#T,
    E9#T,
    E10#T,
    E11#T,
    E12#T,
    E13#T,
    E14#T,
    E15#T,
    E16#T,
    E17#T,
    E18#T,
    E19#T,
    E20#T,
    E21#T
  ]
}
trait ArticleType22[
  E1 <: TypeParam,
  E2 <: TypeParam,
  E3 <: TypeParam,
  E4 <: TypeParam,
  E5 <: TypeParam,
  E6 <: TypeParam,
  E7 <: TypeParam,
  E8 <: TypeParam,
  E9 <: TypeParam,
  E10 <: TypeParam,
  E11 <: TypeParam,
  E12 <: TypeParam,
  E13 <: TypeParam,
  E14 <: TypeParam,
  E15 <: TypeParam,
  E16 <: TypeParam,
  E17 <: TypeParam,
  E18 <: TypeParam,
  E19 <: TypeParam,
  E20 <: TypeParam,
  E21 <: TypeParam,
  E22 <: TypeParam
] extends TypeParam {
  override type H <: Article22[
    E1#H,
    E2#H,
    E3#H,
    E4#H,
    E5#H,
    E6#H,
    E7#H,
    E8#H,
    E9#H,
    E10#H,
    E11#H,
    E12#H,
    E13#H,
    E14#H,
    E15#H,
    E16#H,
    E17#H,
    E18#H,
    E19#H,
    E20#H,
    E21#H,
    E22#H
  ]
  override type T <: ArticleType22[
    E1#T,
    E2#T,
    E3#T,
    E4#T,
    E5#T,
    E6#T,
    E7#T,
    E8#T,
    E9#T,
    E10#T,
    E11#T,
    E12#T,
    E13#T,
    E14#T,
    E15#T,
    E16#T,
    E17#T,
    E18#T,
    E19#T,
    E20#T,
    E21#T,
    E22#T
  ]
}
