package asuna.support
import asuna.TypeHList
import asuna.Plus
import asuna.TupleTypeHList6
import asuna.TupleTypeHList7
class TypeHListPlus7 {
  @inline final def plus7[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList]: Plus[
    TupleTypeHList6[E1, E2, E3, E4, E5, E6],
    E7,
    TupleTypeHList7[E7, E1, E2, E3, E4, E5, E6]
  ] =
    AnyTypeHListPlus.plus.asInstanceOf[Plus[
      TupleTypeHList6[E1, E2, E3, E4, E5, E6],
      E7,
      TupleTypeHList7[E7, E1, E2, E3, E4, E5, E6]
    ]]
}
final object TypeHListPlus7 extends TypeHListPlus7
