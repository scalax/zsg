package asuna

import scala.language.higherKinds

trait KindContext {
  type M[P <: TypeHList]
}

trait Context[K <: KindContext] extends Any {

  def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z]
  def start: K#M[TupleTypeHList0]

}
