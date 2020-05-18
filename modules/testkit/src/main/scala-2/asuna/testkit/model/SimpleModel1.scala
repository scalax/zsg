package zsg.testkit.model

import zsg.macros.single.deficient.{DeficientProperty, ModelProperty}

import scala.annotation.meta.getter

case class Test01[T](ii: T, i3: String, i4: Int)
case class Test02(i3: String, i4: Int)
case class Test03(i3: String, i4: Int, fg: Option[Test04])
case class Test04(i3: String, i4: Int, gf: List[Test03])

sealed trait Test05[T]
case class Test06[T](i1: String, i2: Int) extends Test05[T]
case class Test07[T](i1: T, i2: Int)      extends Test05[T]
case class Test08(i1: String, i2: Int)    extends Test05[String]
case object Test09                        extends Test05[String]

case class Test10[T](i1: String, name: String, i3: T, i4: Long, i5: Short)
case class Test11[T](name: String, i3: T)

trait Test12Trait {
  @(ModelProperty @getter)
  val test10: Test10[T]
  @DeficientProperty
  def test11: Test11[T]
  type T
}
trait Test13TraitImpl[T1] extends Test12Trait {
  override type T = T1
}

case class Test14(i1: String, i4: Long, i5: Short)
