package asuna.test.model

case class Test01[T](ii: T, i3: String, i4: Int)
case class Test02(i3: String, i4: Int)
case class Test03(i3: String, i4: Int, fg: Option[Test04])
case class Test04(i3: String, i4: Int, gf: List[Test03])
