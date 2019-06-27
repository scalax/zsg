package org.scalax.asuna.mapper.item
class EatXyyType2[E1 <: org.scalax.asuna.mapper.TypeParam, E2 <: org.scalax.asuna.mapper.TypeParam] extends org.scalax.asuna.mapper.TypeParam {
  override type H = Item2[E1#H, E2#H]
  override type T = EatXyyType2[E1#T, E2#T]
}
