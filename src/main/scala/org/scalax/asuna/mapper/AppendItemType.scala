package org.scalax.asuna.mapper.item
trait ItemType0 extends TypeParam {
  override type H <: Item0
  override type T <: ItemType0
}
trait ItemType1[I1 <: TypeParam] extends TypeParam {
  override type H <: Item1[I1#H]
  override type T <: ItemType1[I1#T]
}
trait ItemType2[I1 <: TypeParam, I2 <: TypeParam] extends TypeParam {
  override type H <: Item2[I1#H, I2#H]
  override type T <: ItemType2[I1#T, I2#T]
}
trait ItemType3[I1 <: TypeParam, I2 <: TypeParam, I3 <: TypeParam] extends TypeParam {
  override type H <: Item3[I1#H, I2#H, I3#H]
  override type T <: ItemType3[I1#T, I2#T, I3#T]
}
trait ItemType4[I1 <: TypeParam, I2 <: TypeParam, I3 <: TypeParam, I4 <: TypeParam] extends TypeParam {
  override type H <: Item4[I1#H, I2#H, I3#H, I4#H]
  override type T <: ItemType4[I1#T, I2#T, I3#T, I4#T]
}
trait ItemType5[I1 <: TypeParam, I2 <: TypeParam, I3 <: TypeParam, I4 <: TypeParam, I5 <: TypeParam] extends TypeParam {
  override type H <: Item5[I1#H, I2#H, I3#H, I4#H, I5#H]
  override type T <: ItemType5[I1#T, I2#T, I3#T, I4#T, I5#T]
}
trait ItemType6[I1 <: TypeParam, I2 <: TypeParam, I3 <: TypeParam, I4 <: TypeParam, I5 <: TypeParam, I6 <: TypeParam] extends TypeParam {
  override type H <: Item6[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H]
  override type T <: ItemType6[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T]
}
trait ItemType7[I1 <: TypeParam, I2 <: TypeParam, I3 <: TypeParam, I4 <: TypeParam, I5 <: TypeParam, I6 <: TypeParam, I7 <: TypeParam] extends TypeParam {
  override type H <: Item7[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H]
  override type T <: ItemType7[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T]
}
trait ItemType8[I1 <: TypeParam, I2 <: TypeParam, I3 <: TypeParam, I4 <: TypeParam, I5 <: TypeParam, I6 <: TypeParam, I7 <: TypeParam, I8 <: TypeParam]
    extends TypeParam {
  override type H <: Item8[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H, I8#H]
  override type T <: ItemType8[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T, I8#T]
}
trait ItemType9[I1 <: TypeParam, I2 <: TypeParam, I3 <: TypeParam, I4 <: TypeParam, I5 <: TypeParam, I6 <: TypeParam, I7 <: TypeParam, I8 <: TypeParam, I9 <: TypeParam]
    extends TypeParam {
  override type H <: Item9[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H, I8#H, I9#H]
  override type T <: ItemType9[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T, I8#T, I9#T]
}
trait ItemType10[
  I1 <: TypeParam,
  I2 <: TypeParam,
  I3 <: TypeParam,
  I4 <: TypeParam,
  I5 <: TypeParam,
  I6 <: TypeParam,
  I7 <: TypeParam,
  I8 <: TypeParam,
  I9 <: TypeParam,
  I10 <: TypeParam
] extends TypeParam {
  override type H <: Item10[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H, I8#H, I9#H, I10#H]
  override type T <: ItemType10[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T, I8#T, I9#T, I10#T]
}
trait ItemType11[
  I1 <: TypeParam,
  I2 <: TypeParam,
  I3 <: TypeParam,
  I4 <: TypeParam,
  I5 <: TypeParam,
  I6 <: TypeParam,
  I7 <: TypeParam,
  I8 <: TypeParam,
  I9 <: TypeParam,
  I10 <: TypeParam,
  I11 <: TypeParam
] extends TypeParam {
  override type H <: Item11[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H, I8#H, I9#H, I10#H, I11#H]
  override type T <: ItemType11[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T, I8#T, I9#T, I10#T, I11#T]
}
trait ItemType12[
  I1 <: TypeParam,
  I2 <: TypeParam,
  I3 <: TypeParam,
  I4 <: TypeParam,
  I5 <: TypeParam,
  I6 <: TypeParam,
  I7 <: TypeParam,
  I8 <: TypeParam,
  I9 <: TypeParam,
  I10 <: TypeParam,
  I11 <: TypeParam,
  I12 <: TypeParam
] extends TypeParam {
  override type H <: Item12[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H, I8#H, I9#H, I10#H, I11#H, I12#H]
  override type T <: ItemType12[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T, I8#T, I9#T, I10#T, I11#T, I12#T]
}
trait ItemType13[
  I1 <: TypeParam,
  I2 <: TypeParam,
  I3 <: TypeParam,
  I4 <: TypeParam,
  I5 <: TypeParam,
  I6 <: TypeParam,
  I7 <: TypeParam,
  I8 <: TypeParam,
  I9 <: TypeParam,
  I10 <: TypeParam,
  I11 <: TypeParam,
  I12 <: TypeParam,
  I13 <: TypeParam
] extends TypeParam {
  override type H <: Item13[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H, I8#H, I9#H, I10#H, I11#H, I12#H, I13#H]
  override type T <: ItemType13[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T, I8#T, I9#T, I10#T, I11#T, I12#T, I13#T]
}
trait ItemType14[
  I1 <: TypeParam,
  I2 <: TypeParam,
  I3 <: TypeParam,
  I4 <: TypeParam,
  I5 <: TypeParam,
  I6 <: TypeParam,
  I7 <: TypeParam,
  I8 <: TypeParam,
  I9 <: TypeParam,
  I10 <: TypeParam,
  I11 <: TypeParam,
  I12 <: TypeParam,
  I13 <: TypeParam,
  I14 <: TypeParam
] extends TypeParam {
  override type H <: Item14[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H, I8#H, I9#H, I10#H, I11#H, I12#H, I13#H, I14#H]
  override type T <: ItemType14[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T, I8#T, I9#T, I10#T, I11#T, I12#T, I13#T, I14#T]
}
trait ItemType15[
  I1 <: TypeParam,
  I2 <: TypeParam,
  I3 <: TypeParam,
  I4 <: TypeParam,
  I5 <: TypeParam,
  I6 <: TypeParam,
  I7 <: TypeParam,
  I8 <: TypeParam,
  I9 <: TypeParam,
  I10 <: TypeParam,
  I11 <: TypeParam,
  I12 <: TypeParam,
  I13 <: TypeParam,
  I14 <: TypeParam,
  I15 <: TypeParam
] extends TypeParam {
  override type H <: Item15[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H, I8#H, I9#H, I10#H, I11#H, I12#H, I13#H, I14#H, I15#H]
  override type T <: ItemType15[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T, I8#T, I9#T, I10#T, I11#T, I12#T, I13#T, I14#T, I15#T]
}
trait ItemType16[
  I1 <: TypeParam,
  I2 <: TypeParam,
  I3 <: TypeParam,
  I4 <: TypeParam,
  I5 <: TypeParam,
  I6 <: TypeParam,
  I7 <: TypeParam,
  I8 <: TypeParam,
  I9 <: TypeParam,
  I10 <: TypeParam,
  I11 <: TypeParam,
  I12 <: TypeParam,
  I13 <: TypeParam,
  I14 <: TypeParam,
  I15 <: TypeParam,
  I16 <: TypeParam
] extends TypeParam {
  override type H <: Item16[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H, I8#H, I9#H, I10#H, I11#H, I12#H, I13#H, I14#H, I15#H, I16#H]
  override type T <: ItemType16[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T, I8#T, I9#T, I10#T, I11#T, I12#T, I13#T, I14#T, I15#T, I16#T]
}
trait ItemType17[
  I1 <: TypeParam,
  I2 <: TypeParam,
  I3 <: TypeParam,
  I4 <: TypeParam,
  I5 <: TypeParam,
  I6 <: TypeParam,
  I7 <: TypeParam,
  I8 <: TypeParam,
  I9 <: TypeParam,
  I10 <: TypeParam,
  I11 <: TypeParam,
  I12 <: TypeParam,
  I13 <: TypeParam,
  I14 <: TypeParam,
  I15 <: TypeParam,
  I16 <: TypeParam,
  I17 <: TypeParam
] extends TypeParam {
  override type H <: Item17[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H, I8#H, I9#H, I10#H, I11#H, I12#H, I13#H, I14#H, I15#H, I16#H, I17#H]
  override type T <: ItemType17[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T, I8#T, I9#T, I10#T, I11#T, I12#T, I13#T, I14#T, I15#T, I16#T, I17#T]
}
trait ItemType18[
  I1 <: TypeParam,
  I2 <: TypeParam,
  I3 <: TypeParam,
  I4 <: TypeParam,
  I5 <: TypeParam,
  I6 <: TypeParam,
  I7 <: TypeParam,
  I8 <: TypeParam,
  I9 <: TypeParam,
  I10 <: TypeParam,
  I11 <: TypeParam,
  I12 <: TypeParam,
  I13 <: TypeParam,
  I14 <: TypeParam,
  I15 <: TypeParam,
  I16 <: TypeParam,
  I17 <: TypeParam,
  I18 <: TypeParam
] extends TypeParam {
  override type H <: Item18[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H, I8#H, I9#H, I10#H, I11#H, I12#H, I13#H, I14#H, I15#H, I16#H, I17#H, I18#H]
  override type T <: ItemType18[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T, I8#T, I9#T, I10#T, I11#T, I12#T, I13#T, I14#T, I15#T, I16#T, I17#T, I18#T]
}
trait ItemType19[
  I1 <: TypeParam,
  I2 <: TypeParam,
  I3 <: TypeParam,
  I4 <: TypeParam,
  I5 <: TypeParam,
  I6 <: TypeParam,
  I7 <: TypeParam,
  I8 <: TypeParam,
  I9 <: TypeParam,
  I10 <: TypeParam,
  I11 <: TypeParam,
  I12 <: TypeParam,
  I13 <: TypeParam,
  I14 <: TypeParam,
  I15 <: TypeParam,
  I16 <: TypeParam,
  I17 <: TypeParam,
  I18 <: TypeParam,
  I19 <: TypeParam
] extends TypeParam {
  override type H <: Item19[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H, I8#H, I9#H, I10#H, I11#H, I12#H, I13#H, I14#H, I15#H, I16#H, I17#H, I18#H, I19#H]
  override type T <: ItemType19[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T, I8#T, I9#T, I10#T, I11#T, I12#T, I13#T, I14#T, I15#T, I16#T, I17#T, I18#T, I19#T]
}
trait ItemType20[
  I1 <: TypeParam,
  I2 <: TypeParam,
  I3 <: TypeParam,
  I4 <: TypeParam,
  I5 <: TypeParam,
  I6 <: TypeParam,
  I7 <: TypeParam,
  I8 <: TypeParam,
  I9 <: TypeParam,
  I10 <: TypeParam,
  I11 <: TypeParam,
  I12 <: TypeParam,
  I13 <: TypeParam,
  I14 <: TypeParam,
  I15 <: TypeParam,
  I16 <: TypeParam,
  I17 <: TypeParam,
  I18 <: TypeParam,
  I19 <: TypeParam,
  I20 <: TypeParam
] extends TypeParam {
  override type H <: Item20[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H, I8#H, I9#H, I10#H, I11#H, I12#H, I13#H, I14#H, I15#H, I16#H, I17#H, I18#H, I19#H, I20#H]
  override type T <: ItemType20[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T, I8#T, I9#T, I10#T, I11#T, I12#T, I13#T, I14#T, I15#T, I16#T, I17#T, I18#T, I19#T, I20#T]
}
trait ItemType21[
  I1 <: TypeParam,
  I2 <: TypeParam,
  I3 <: TypeParam,
  I4 <: TypeParam,
  I5 <: TypeParam,
  I6 <: TypeParam,
  I7 <: TypeParam,
  I8 <: TypeParam,
  I9 <: TypeParam,
  I10 <: TypeParam,
  I11 <: TypeParam,
  I12 <: TypeParam,
  I13 <: TypeParam,
  I14 <: TypeParam,
  I15 <: TypeParam,
  I16 <: TypeParam,
  I17 <: TypeParam,
  I18 <: TypeParam,
  I19 <: TypeParam,
  I20 <: TypeParam,
  I21 <: TypeParam
] extends TypeParam {
  override type H <: Item21[I1#H, I2#H, I3#H, I4#H, I5#H, I6#H, I7#H, I8#H, I9#H, I10#H, I11#H, I12#H, I13#H, I14#H, I15#H, I16#H, I17#H, I18#H, I19#H, I20#H, I21#H]
  override type T <: ItemType21[I1#T, I2#T, I3#T, I4#T, I5#T, I6#T, I7#T, I8#T, I9#T, I10#T, I11#T, I12#T, I13#T, I14#T, I15#T, I16#T, I17#T, I18#T, I19#T, I20#T, I21#T]
}
trait ItemType22[
  I1 <: TypeParam,
  I2 <: TypeParam,
  I3 <: TypeParam,
  I4 <: TypeParam,
  I5 <: TypeParam,
  I6 <: TypeParam,
  I7 <: TypeParam,
  I8 <: TypeParam,
  I9 <: TypeParam,
  I10 <: TypeParam,
  I11 <: TypeParam,
  I12 <: TypeParam,
  I13 <: TypeParam,
  I14 <: TypeParam,
  I15 <: TypeParam,
  I16 <: TypeParam,
  I17 <: TypeParam,
  I18 <: TypeParam,
  I19 <: TypeParam,
  I20 <: TypeParam,
  I21 <: TypeParam,
  I22 <: TypeParam
] extends TypeParam {
  override type H <: Item22[
    I1#H,
    I2#H,
    I3#H,
    I4#H,
    I5#H,
    I6#H,
    I7#H,
    I8#H,
    I9#H,
    I10#H,
    I11#H,
    I12#H,
    I13#H,
    I14#H,
    I15#H,
    I16#H,
    I17#H,
    I18#H,
    I19#H,
    I20#H,
    I21#H,
    I22#H
  ]
  override type T <: ItemType22[
    I1#T,
    I2#T,
    I3#T,
    I4#T,
    I5#T,
    I6#T,
    I7#T,
    I8#T,
    I9#T,
    I10#T,
    I11#T,
    I12#T,
    I13#T,
    I14#T,
    I15#T,
    I16#T,
    I17#T,
    I18#T,
    I19#T,
    I20#T,
    I21#T,
    I22#T
  ]
}
