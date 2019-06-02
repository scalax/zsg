package org.scalax.asuna.mapper.item
class EatXyyType1[E1 <: org.scalax.asuna.mapper.TypeParam] extends org.scalax.asuna.mapper.TypeParam {
  override type H = XyyItem1[E1#H]
  override type T = EatXyyType1[E1#T]
}
