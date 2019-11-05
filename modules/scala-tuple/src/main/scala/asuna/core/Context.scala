package asuna

import scala.language.higherKinds

class TupleTypeHList0 extends TypeHList {
  override type H = AsunaTuple0
  override type T = TupleTypeHList0
}

trait KindContext {
  type M[P <: TypeHList]
}

trait Context[K <: KindContext] extends Any {
  def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z]
  def start: K#M[TupleTypeHList0]
}
