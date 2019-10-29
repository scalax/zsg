package asuna.support
import asuna.TypeHList
import asuna.Plus
import asuna.TupleTypeHList5
import asuna.TupleTypeHList6
class HListTypeHListPlus6 {
  @inline def plus6[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList]: Plus[
    TupleTypeHList5[E1, E2, E3, E4, E5],
    E6,
    TupleTypeHList6[E6, E1, E2, E3, E4, E5]
  ] =
    AnyHListTypeHListPlus.plus.asInstanceOf[Plus[
      TupleTypeHList5[E1, E2, E3, E4, E5],
      E6,
      TupleTypeHList6[E6, E1, E2, E3, E4, E5]
    ]]
}
object HListTypeHListPlus6 extends HListTypeHListPlus6
