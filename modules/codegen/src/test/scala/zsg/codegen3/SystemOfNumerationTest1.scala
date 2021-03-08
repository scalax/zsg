package zsg.codegen3

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object SystemOfNumerationTest1 extends DefaultRunnableSpec {
  val item6   = SystemOfNumeration.init6("item1", "item2", "item3", "item4", "item5", "item6")
  val item300 = for (i <- 7 to 300) yield s"item${i}"
  val i300    = item300.foldLeft(item6)((i1, i2) => i1.next(i2))

  override def spec = suite("Rep Mapper")(
    test("should map mutiply class") {
      SystemOfNumerationTestItem1.testItem(i300)
    }
  )

}
