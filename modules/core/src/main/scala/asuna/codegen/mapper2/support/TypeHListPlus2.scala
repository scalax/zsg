package asuna.support
import asuna.TypeHList
import asuna.Plus
import asuna.TupleTypeHList1
import asuna.TupleTypeHList2
final object TypeHListPlus2 {
  @inline final def plus2[E1 <: TypeHList, E2 <: TypeHList]: Plus[
    TupleTypeHList1[E1],
    E2,
    TupleTypeHList2[E2, E1]
  ] =
    AnyTypeHListPlus.plus.asInstanceOf[Plus[
      TupleTypeHList1[E1],
      E2,
      TupleTypeHList2[E2, E1]
    ]]
}
