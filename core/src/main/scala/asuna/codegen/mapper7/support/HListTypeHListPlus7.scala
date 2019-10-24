package asuna.support
import asuna.TypeHList
import asuna.Plus
class HListTypeHListPlus7 {
  @inline def plus7[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList]: Plus[
    HListTypeHList6[E1, E2, E3, E4, E5, E6],
    E7,
    HListTypeHList7[E1, E2, E3, E4, E5, E6, E7]
  ] =
    AnyHListTypeHListPlus.plus.asInstanceOf[Plus[
      HListTypeHList6[E1, E2, E3, E4, E5, E6],
      E7,
      HListTypeHList7[E1, E2, E3, E4, E5, E6, E7]
    ]]
}
object HListTypeHListPlus7 extends HListTypeHListPlus7
