package asuna.support
import asuna.TypeHList
import asuna.Plus
import asuna.TupleTypeHList7
import asuna.TupleTypeHList8
class TypeHListPlus8 {
  @inline def plus8[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList, E8 <: TypeHList]: Plus[
    TupleTypeHList7[E1, E2, E3, E4, E5, E6, E7],
    E8,
    TupleTypeHList8[E8, E1, E2, E3, E4, E5, E6, E7]
  ] =
    AnyTypeHListPlus.plus.asInstanceOf[Plus[
      TupleTypeHList7[E1, E2, E3, E4, E5, E6, E7],
      E8,
      TupleTypeHList8[E8, E1, E2, E3, E4, E5, E6, E7]
    ]]
}
object TypeHListPlus8 extends TypeHListPlus8
