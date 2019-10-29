package asuna.support
import asuna.TypeHList
import asuna.Plus
import asuna.TupleTypeHList2
import asuna.TupleTypeHList3
class TypeHListPlus3 {
  @inline def plus3[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList]: Plus[
    TupleTypeHList2[E1, E2],
    E3,
    TupleTypeHList3[E3, E1, E2]
  ] =
    AnyTypeHListPlus.plus.asInstanceOf[Plus[
      TupleTypeHList2[E1, E2],
      E3,
      TupleTypeHList3[E3, E1, E2]
    ]]
}
object TypeHListPlus3 extends TypeHListPlus3
