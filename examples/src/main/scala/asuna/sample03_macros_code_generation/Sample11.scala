package asuna.sample03_macros_code_generation

trait I1 {
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

trait II extends I1 with SumI

object ii extends {
  val bb = 11
} with II
