package org.scalax.asuna.mapper.item
class EatXyyType3[E1 <: org.scalax.asuna.mapper.TypeParam, E2 <: org.scalax.asuna.mapper.TypeParam, E3 <: org.scalax.asuna.mapper.TypeParam] extends org.scalax.asuna.mapper.TypeParam {
  override type H = Item3[E1#H, E2#H, E3#H]
  override type T = EatXyyType3[E1#T, E2#T, E3#T]
}
