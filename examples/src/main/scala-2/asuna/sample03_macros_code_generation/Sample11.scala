package zsg.sample03_macros_code_generation

trait Model10TraitI {
  self: SumTrait with SumIII =>

  case class Sample10ModelWithDefaultValue(
    i1: String,
    i2: Int,
    i3: Int,
    i4: Long,
    i5: String = "Test10-i5",
    i6: List[SumII.Aux[Char]] = List.fill(2333)(new SumII {
      override type ChartType = Char
      override def toString: String = s"${this.getClass.getName}.Aux[Char]"
    }),
    i7: Long,
    i8: Option[Long] = Option(22),
    i9: List[Long],
    i10: String
  )

}

trait SumIII

trait SumII {
  type ChartType
}

object SumII {
  type Aux[T] = SumII { type ChartType = T }
}

trait SumTrait extends Model10TraitI with SumIII

object sumOfCaseClass extends {
  val bb = 11
} with SumTrait
