package asuna.test.circe.test1

import asuna.test.model._

object Instance {

  val i1 = Test01("name", "test01", 123)
  val i2 = Test02("test02", 123)
  val i3 = Test03("test06", 123, Option(Test04("test07", 789, List(Test03("test06", 456, Option.empty)))))
  val i4 = io.circe.parser.parse("""{"i3":"test07","i4":123,"gf":[]}""").right.get

}
