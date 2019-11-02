package asuna.testkit.model

case class Test01[T](ii: T, i3: String, i4: Int)
case class Test02(i3: String, i4: Int)
case class Test03(i3: String, i4: Int, fg: Option[Test04])
case class Test04(i3: String, i4: Int, gf: List[Test03])

sealed trait Test05[T]
case class Test06[T](i1: String, i2: Int) extends Test05[T]
case class Test07[T](i1: T, i2: Int)      extends Test05[T]
case class Test08(i1: String, i2: Int)    extends Test05[String]
case object Test09                        extends Test05[String]
