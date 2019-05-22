package org.scalax.asuna.ii.item
class EatXyyType1[E1 <: org.scalax.asuna.mapper.item.TypeParam] extends org.scalax.asuna.mapper.item.TypeParam {
  override type H = XyyItem1[E1#H]
  override type T = EatXyyType1[E1#T]
}
