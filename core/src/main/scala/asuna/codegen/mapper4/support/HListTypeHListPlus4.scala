package asuna.support
import asuna.TypeHList
import asuna.Plus
class HListTypeHListPlus4 {
  @inline def plus4[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList]: Plus[
    HListTypeHList3[E1, E2, E3],
    E4,
    HListTypeHList4[E1, E2, E3, E4]
  ] =
    AnyHListTypeHListPlus.plus.asInstanceOf[Plus[
      HListTypeHList3[E1, E2, E3],
      E4,
      HListTypeHList4[E1, E2, E3, E4]
    ]]
}
object HListTypeHListPlus4 extends HListTypeHListPlus4
