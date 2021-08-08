package zsg

abstract class Plus[X <: TypeHList, Y <: TypeHList, Z <: TypeHList] {
  def takeHead(z: Z#Head): X#Head
  def takeTail(z: Z#Head): Y#Head
  def plus(x: X#Head, y: Y#Head): Z#Head
  def tail: Plus[X#Tail, Y#Tail, Z#Tail]
}

object Plus {
  private def item2PlusImpl[X <: TypeHList, Y <: TypeHList]: Plus[X, Y, Item2TypeHList[X, Y]] = new Plus[X, Y, Item2TypeHList[X, Y]] {
    override def takeHead(z: ZsgTuple2[X#Head, Y#Head]): X#Head             = z.i1
    override def takeTail(z: ZsgTuple2[X#Head, Y#Head]): Y#Head             = z.i2
    override def plus(x: X#Head, y: Y#Head): ZsgTuple2[X#Head, Y#Head]      = new ZsgTuple2(i1 = x, i2 = y)
    override def tail: Plus[X#Tail, Y#Tail, Item2TypeHList[X#Tail, Y#Tail]] = item2Plus
  }
  private val item2PlusAny = item2PlusImpl[TypeHList, TypeHList]
  def item2Plus[X <: TypeHList, Y <: TypeHList]: Plus[X, Y, Item2TypeHList[X, Y]] =
    item2PlusAny.asInstanceOf[Plus[X, Y, Item2TypeHList[X, Y]]]
}
