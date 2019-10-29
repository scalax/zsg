package asuna.support
import asuna.TypeHList
import asuna.Plus
import asuna.TupleTypeHList1
import asuna.TupleTypeHList2
class HListTypeHListPlus2 {
  @inline def plus2[E1 <: TypeHList, E2 <: TypeHList]: Plus[
    TupleTypeHList1[E1],
    E2,
    TupleTypeHList2[E2, E1]
  ] =
    AnyHListTypeHListPlus.plus.asInstanceOf[Plus[
      TupleTypeHList1[E1],
      E2,
      TupleTypeHList2[E2, E1]
    ]]
}
object HListTypeHListPlus2 extends HListTypeHListPlus2
