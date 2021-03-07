package zsg.codegen3

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object SystemOfNumerationTest extends DefaultRunnableSpec {
  val item1  = 进位准备.init6(1, 2, 3, 4, 5, 6)
  val item10 = item1.next(7).next(8).next(9).next(10)
  val item20 = item1.next(11).next(12).next(13).next(14)

  override def spec = suite("Rep Mapper")(
    test("should map mutiply class") {
      val assert1 = assert(item1._1_th)(equalTo(1))
      assert1
    }
  )

}
