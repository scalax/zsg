package org.scalax.asuna.ii.item
class EatXyyType3[E1 <: org.scalax.asuna.mapper.item.TypeParam, E2 <: org.scalax.asuna.mapper.item.TypeParam, E3 <: org.scalax.asuna.mapper.item.TypeParam]
    extends org.scalax.asuna.mapper.item.TypeParam {
  override type H = XyyItem3[E1#H, E2#H, E3#H]
  override type T = EatXyyType3[E1#T, E2#T, E3#T]
}
