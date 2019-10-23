package asuna
class HListTypeHListPlus3 {
  @inline def plus3[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList]: Plus[
    HListTypeHList2[E1, E2],
    E3,
    HListTypeHList3[E1, E2, E3]
  ] =
    AnyHListTypeHListPlus.plus.asInstanceOf[Plus[
      HListTypeHList2[E1, E2],
      E3,
      HListTypeHList3[E1, E2, E3]
    ]]
}
object HListTypeHListPlus3 extends HListTypeHListPlus3
