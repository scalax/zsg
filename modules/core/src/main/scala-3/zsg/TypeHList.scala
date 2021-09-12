package zsg

trait TypeHList
class TypeZero                              extends TypeHList
class TypePositive[Head, Tail <: TypeHList] extends TypeHList

type TypeHead[T <: TypeHList] = T match {
  case TypePositive[head, tail] => head
}
type TypeTail[T <: TypeHList] <: TypeHList = T match {
  case TypePositive[head, tail] => tail
}
