package zsg.scala.tuple
import zsg._

type Tuple23TypeHList[Item <: TypeHList, I1 <: TypeHList] <: TypeHList = (Item, I1) match {
  case (TypeZero, TypeZero) => TypeZero
  case (TypePositive[head1, tail1], TypePositive[head2, tail2]) =>
    TypePositive[head1 *: head2, Tuple23TypeHList[tail1, tail2]]
}

object Tuple23Plus {

  lazy val tupeXXLPlusImpl: Plus[TypeHList, TypeHList, TypeHList] = new Plus[TypeHList, TypeHList, TypeHList] {
    override def takeHead(u: TypeHead[TypeHList]): TypeHead[TypeHList] = {
      val z = u.asInstanceOf[*:[_, _]]
      z.head.asInstanceOf[TypeHead[TypeHList]]
    }
    override def takeTail(u: TypeHead[TypeHList]): TypeHead[TypeHList] = {
      val z = u.asInstanceOf[*:[_, _]]
      z.tail.asInstanceOf[TypeHead[TypeHList]]
    }
    override def plus(x: TypeHead[TypeHList], u: TypeHead[TypeHList]): TypeHead[TypeHList] = {
      val y = u.asInstanceOf[Tuple]
      (x *: y).asInstanceOf[TypeHead[TypeHList]]
    }
    override def tail: Plus[TypeTail[TypeHList], TypeTail[TypeHList], TypeTail[TypeHList]] =
      tupeXXLPlusImpl.asInstanceOf[Plus[TypeTail[TypeHList], TypeTail[TypeHList], TypeTail[TypeHList]]]
  }

  def tupleXXLPlus[X <: TypeHList, Y <: TypeHList]: Plus[X, Y, Tuple23TypeHList[X, Y]] =
    tupeXXLPlusImpl.asInstanceOf[Plus[X, Y, Tuple23TypeHList[X, Y]]]

}
