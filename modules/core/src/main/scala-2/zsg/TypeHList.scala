package zsg

trait TypeHList {
  type Head
  type Tail <: TypeHList
}
