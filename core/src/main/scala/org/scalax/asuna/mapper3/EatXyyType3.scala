package org.scalax.asuna.mapper
class EatXyyType3[E1 <: TypeParameter, E2 <: TypeParameter, E3 <: TypeParameter] extends TypeParameter {
  override type H = Item3[E1#H, E2#H, E3#H]
  override type T = EatXyyType3[E1#T, E2#T, E3#T]
}
