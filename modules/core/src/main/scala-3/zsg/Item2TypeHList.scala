package zsg

type Item2TypeHList[T1 <: TypeHList, T2 <: TypeHList] <: TypeHList = (T1, T2) match {
  case (TypePositive[head1, tail1], TypePositive[head2, tail2]) => TypePositive[ZsgTuple2[head1, head2], Item2TypeHList[tail1, tail2]]
  case (TypeZero, TypeZero)                                     => TypeZero
}
