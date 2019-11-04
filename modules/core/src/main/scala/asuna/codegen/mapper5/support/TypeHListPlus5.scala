package asuna.support
import asuna.TypeHList
import asuna.Plus
import asuna.TupleTypeHList4
import asuna.TupleTypeHList5
final object TypeHListPlus5 {
  @inline final def plus5[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList]: Plus[
    TupleTypeHList4[E1, E2, E3, E4],
    E5,
    TupleTypeHList5[E5, E1, E2, E3, E4]
  ] =
    AnyTypeHListPlus.plus.asInstanceOf[Plus[
      TupleTypeHList4[E1, E2, E3, E4],
      E5,
      TupleTypeHList5[E5, E1, E2, E3, E4]
    ]]
}
