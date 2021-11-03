package zsg.scala.tuple
import zsg._

/*type TakeHeadTuple23TypeHList[Item <: TypeHList, I1 <: Tuple] <: Tuple = I1 match {
  case head1 *: tail1 => TypeHead[Item] *: TakeHeadTuple23TypeHList[head1, tail1]
  case EmptyTuple     => TypeHead[Item] *: EmptyTuple
}

type TakeTailTuple23TypeHList[Item <: TypeHList, I1 <: Tuple] <: Tuple = I1 match {
  case head1 *: tail1 => TypeTail[Item] *: TakeTailTuple23TypeHList[head1, tail1]
  case EmptyTuple     => EmptyTuple
}*/

type TakeHeadTuple23TypeHList[I1 <: Tuple] <: Tuple = I1 match {
  case head1 *: tail1 => TypeHead[head1] *: TakeHeadTuple23TypeHList[tail1]
  case EmptyTuple     => EmptyTuple
}

type TakeTailTuple23TypeHList[I1 <: Tuple] <: Tuple = I1 match {
  case head1 *: tail1 => TypeTail[head1] *: TakeTailTuple23TypeHList[tail1]
  case EmptyTuple     => EmptyTuple
}

type Tuple23TypeHList[Item <: TypeHList, I1 <: Tuple] <: TypeHList = Item match {
  case TypeZero                 => TypeZero
  case TypePositive[head, tail] => TypePositive[head *: TakeHeadTuple23TypeHList[I1], Tuple23TypeHList[tail, TakeTailTuple23TypeHList[I1]]]
}

object Tuple23Plus {

  type n1 = TypePositive[Int, TypePositive[String, TypeZero]]
  type n2 = TypePositive[String, TypePositive[Int, TypeZero]]
  type n3 = TypePositive[Long, TypePositive[Long, TypeZero]]
  type n4 = n1 *: n2 *: EmptyTuple
  val aa: Tuple23TypeHList[n3, n4] = throw new Exception
  aa: zsg.TypePositive[Long *: Int *: String *: EmptyTuple, zsg.TypePositive[Long *: String *: Int *: EmptyTuple, zsg.TypeZero]]

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

}
