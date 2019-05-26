package org.scalax.asuna.ii.item
class EatXyyType4[
    E1 <: org.scalax.asuna.mapper.item.TypeParam
  , E2 <: org.scalax.asuna.mapper.item.TypeParam
  , E3 <: org.scalax.asuna.mapper.item.TypeParam
  , E4 <: org.scalax.asuna.mapper.item.TypeParam
] extends org.scalax.asuna.mapper.item.TypeParam {
  override type H = XyyItem4[E1#H, E2#H, E3#H, E4#H]
  override type T = EatXyyType4[E1#T, E2#T, E3#T, E4#T]
}
