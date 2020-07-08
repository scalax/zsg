package zsg.macros.case_class_test
import zsg.macros.single.PropertyApply
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
class CaseClassTest3 extends AnyFunSpec with Matchers {
case class Foo3( i1:   Long     ,  i2:    Int    ,  i3:     Int  ) {
self =>
override def toString: String =
s"(Long" + s"(${self.i1}),i1)|"  + s"(Int" + s"(${self.i2}),i2)|"  + s"(Int" + s"(${self.i3}),i3)"
def reverseString: String =
s"(Int" + s"(${self.i3}),i3)|"  + s"(Int" + s"(${self.i2}),i2)|"  + s"(Long" + s"(${self.i1}),i1)"
}
val fooValue3 = Foo3( i1 =   1     ,  i2 =    2    ,  i3 =     3  )
val ap3 = PropertyApply[Foo3]
val fooEncoder3: ModelToString[Foo3] = ModelToString.encoder
val reverseFooEncoder3: ModelToString[Foo3] = ModelToString.reverseEncoder
val fooDecoder3: ModelFromString[Foo3] = ModelFromString.decoder
val reverseFooDecoder3: ModelFromString[Foo3] = ModelFromString.reverseDecoder
describe("A case class by 3 length") {
it("should generic to a encoder") {
val str1 = fooEncoder3.mToString(fooValue3).mkString("|")
str1 shouldBe fooValue3.toString
}
it("should generic to a reverse encoder") {
val str2 = reverseFooEncoder3.mToString(fooValue3).mkString("|")
str2 shouldBe fooValue3.reverseString
}
it("should generic to a decoder") {
val (_, model1) = fooDecoder3.getData(fooValue3.toString)
model1 shouldBe fooValue3
}
it("should generic to a reverse decoder") {
val (_, model2) = reverseFooDecoder3.getData(fooValue3.reverseString)
model2 shouldBe fooValue3
}
}
}
