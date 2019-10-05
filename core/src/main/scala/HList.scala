package org.scalax.asuna.mapper.dotty

trait TypeParam {

  type H
  type T <: TypeParam
  val tail: T

}

trait TypeResult extends TypeParam {

  type Result
  override type H
  override type T <: TypeParam
  override val tail: T

}

trait Plus[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](val x: X, val y: Y, val z: Z) {

  def plus(p: x.H, item: y.H): z.H
  def takeHead(t: z.H): y.H
  def takeTail(t: z.H): x.H
  def sub: Plus[x.T, y.T, z.T]

}

trait Context {

  def append[X <: TypeResult, Y <: TypeResult, Z <: TypeResult](x: X, y: Y, z: Z)(x1: x.Result, y1: y.Result, plus: Plus[X, Y, Z]): z.Result

}

trait Application[T, I <: TypeResult] {
  val typeResult: I
  def application(context: Context): typeResult.Result
}