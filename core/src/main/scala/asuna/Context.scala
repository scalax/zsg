package asuna

import scala.language.higherKinds

trait KindContext {
  type M[P <: TypeHList]
}

trait Context[K <: KindContext] extends Any {
  self =>

  def isReverse: Boolean
  def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z]
  def start: K#M[TupleTypeHList0]
  //def lift[T, I <: TypeParameter](i: AppendTag[T])(implicit ii: Application[K, T, I]): K#M[I] = ii.application(self)

  def reverse: Context[K] = new Context[K] {
    override def isReverse                                                                                              = !self.isReverse
    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: K#M[X], y: K#M[Y], p: Plus[X, Y, Z]): K#M[Z] = self.append(x, y, p)
    override def start: K#M[TupleTypeHList0]                                                                            = self.start
  }

}
