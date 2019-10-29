package asuna.support
import asuna.TypeHList
import asuna.Plus
import asuna.TupleTypeHList0
import asuna.TupleTypeHList1
class HListTypeHListPlus1 {
  @inline def plus1[E1 <: TypeHList]: Plus[
    TupleTypeHList0,
    E1,
    TupleTypeHList1[E1]
  ] =
    AnyHListTypeHListPlus.plus.asInstanceOf[Plus[
      TupleTypeHList0,
      E1,
      TupleTypeHList1[E1]
    ]]
}
object HListTypeHListPlus1 extends HListTypeHListPlus1
