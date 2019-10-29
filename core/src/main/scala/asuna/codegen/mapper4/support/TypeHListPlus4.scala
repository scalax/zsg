package asuna.support
import asuna.TypeHList
import asuna.Plus
import asuna.TupleTypeHList3
import asuna.TupleTypeHList4
class TypeHListPlus4 {
  @inline def plus4[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList]: Plus[
    TupleTypeHList3[E1, E2, E3],
    E4,
    TupleTypeHList4[E4, E1, E2, E3]
  ] =
    AnyTypeHListPlus.plus.asInstanceOf[Plus[
      TupleTypeHList3[E1, E2, E3],
      E4,
      TupleTypeHList4[E4, E1, E2, E3]
    ]]
}
object TypeHListPlus4 extends TypeHListPlus4
