package zsg

trait Plus[X <: TypeHList, Y <: TypeHList, Z <: TypeHList] {
  def takeHead(z: TypeHead[Z]): TypeHead[X]
  def takeTail(z: TypeHead[Z]): TypeHead[Y]
  def plus(x: TypeHead[X], y: TypeHead[Y]): TypeHead[Z]
  def tail: Plus[TypeTail[X], TypeTail[Y], TypeTail[Z]]
}

object Plus {
  def plusInstanceImpl[X <: TypeHList, Y <: TypeHList]: Plus[X, Y, Item2TypeHList[X, Y]] = new Plus[X, Y, Item2TypeHList[X, Y]] {
    override def takeHead(z: TypeHead[Item2TypeHList[X, Y]]): TypeHead[X] = z.asInstanceOf[ZsgTuple2[TypeHead[X], TypeHead[Y]]].i1
    override def takeTail(z: TypeHead[Item2TypeHList[X, Y]]): TypeHead[Y] = z.asInstanceOf[ZsgTuple2[TypeHead[X], TypeHead[Y]]].i2
    override def plus(x: TypeHead[X], y: TypeHead[Y]): TypeHead[Item2TypeHList[X, Y]] =
      new ZsgTuple2(x, y).asInstanceOf[TypeHead[Item2TypeHList[X, Y]]]
    override def tail: Plus[TypeTail[X], TypeTail[Y], TypeTail[Item2TypeHList[X, Y]]] =
      plusInstanceAny.asInstanceOf[Plus[TypeTail[X], TypeTail[Y], TypeTail[Item2TypeHList[X, Y]]]]
  }

  val plusInstanceAny = plusInstanceImpl[TypeHList, TypeHList]

  inline def plusInstance[X <: TypeHList, Y <: TypeHList]: Plus[X, Y, Item2TypeHList[X, Y]] =
    plusInstanceAny.asInstanceOf[Plus[X, Y, Item2TypeHList[X, Y]]]
}
