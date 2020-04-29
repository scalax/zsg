package asuna.sample03_macros_code_generation

trait I1jognergn {
  self: SumI =>
  case class Sample11(
    i1: String,
    i2: Int,
    i3: Int,
    i4: Long,
    i5: String = "Test10-i5",
    i6: List[String] = List.empty,
    i7: Long,
    i8: Option[Long],
    i9: List[Long],
    i10: String
  )
}

trait SumI

trait IIgsrgresg extends I1jognergn with SumI

object ii extends {
  val bb = 11
} with IIgsrgresg
