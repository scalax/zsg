package org.scalax.asuna.mapper
class EatXyyType2[E1 <: TypeParameter, E2 <: TypeParameter] extends TypeParameter {
  override type H = Item2[E1#H, E2#H]
  override type T = EatXyyType2[E1#T, E2#T]
}
