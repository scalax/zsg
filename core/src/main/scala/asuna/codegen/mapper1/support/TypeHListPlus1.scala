package asuna.support
import asuna.TypeHList
import asuna.Plus
import asuna.TupleTypeHList0
import asuna.TupleTypeHList1
class TypeHListPlus1 {
  @inline def plus1[E1 <: TypeHList]: Plus[
    TupleTypeHList0,
    E1,
    TupleTypeHList1[E1]
  ] =
    AnyTypeHListPlus.plus.asInstanceOf[Plus[
      TupleTypeHList0,
      E1,
      TupleTypeHList1[E1]
    ]]
}
object TypeHListPlus1 extends TypeHListPlus1
