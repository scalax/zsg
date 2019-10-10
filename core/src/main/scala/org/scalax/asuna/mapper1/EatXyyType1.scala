package org.scalax.asuna.mapper
class EatXyyType1[E1 <: TypeParameter] extends TypeParameter {
  override type H = Item1[E1#H]
  override type T = EatXyyType1[E1#T]
}
