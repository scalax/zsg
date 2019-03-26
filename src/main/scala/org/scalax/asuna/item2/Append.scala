package org.scalax.asuna.mapper.item
import scala.language.higherKinds

trait TypeParam {
  type H
  type T <: TypeParam
}

trait KindContext {
  type M[P <: TypeParam]
}

trait Plus[X <: TypeParam, Y <: TypeParam, Z <: TypeParam] {
  def plus(p: X#H, item: Y#H): Z#H
  def take(t: Z#H): (X#H, Y#H)
  def sub: Plus[X#T, Y#T, Z#T]
}

trait Context[K <: KindContext] {
  self =>

  def reverse: Boolean
  def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z]
  //def start: K#M[Type0]
  //def lift[T, I <: TypeParam](i: ItemTag[T])(implicit ii: Application[K, T, I]): K#M[I] = ii.application(context = self)

}
