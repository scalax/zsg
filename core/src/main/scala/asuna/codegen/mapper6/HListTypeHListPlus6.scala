package asuna
class HListTypeHListPlus6 {
  def plus6[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList]: Plus[
    HListTypeHList5[E1, E2, E3, E4, E5],
    E6,
    HListTypeHList6[E1, E2, E3, E4, E5, E6]
  ] =
    AnyHListTypeHListPlus.plus.asInstanceOf[Plus[
      HListTypeHList5[E1, E2, E3, E4, E5],
      E6,
      HListTypeHList6[E1, E2, E3, E4, E5, E6]
    ]]
}
object HListTypeHListPlus6 extends HListTypeHListPlus6
