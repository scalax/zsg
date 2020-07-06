package zsg.macros.case_class_test
import zsg.macros.single.PropertyApply
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
class CaseClassTest1 extends AnyFunSpec with Matchers {
case class Foo1( i1:   Long    ) {
self =>
override def toString: String =
s"(Long" + s"(${self.i1}),i1)"
def reverseString: String =
s"(Long" + s"(${self.i1}),i1)"
}
val fooValue1 = Foo1( i1 =   1    )
val ap1 = PropertyApply[Foo1]
val fooEncoder1: ModelToString[Foo1] = ModelToString.encoder
val reverseFooEncoder1: ModelToString[Foo1] = ModelToString.reverseEncoder
val fooDecoder1: ModelFromString[Foo1] = ModelFromString.decoder
val reverseFooDecoder1: ModelFromString[Foo1] = ModelFromString.reverseDecoder
describe("A case class by 1 length") {
it("should generic to a encoder") {
val str1 = fooEncoder1.mToString(fooValue1).mkString("|")
str1 shouldBe fooValue1.toString
}
it("should generic to a reverse encoder") {
val str2 = reverseFooEncoder1.mToString(fooValue1).mkString("|")
str2 shouldBe fooValue1.reverseString
}
it("should generic to a decoder") {
val (_, model1) = fooDecoder1.getData(fooValue1.toString)
model1 shouldBe fooValue1
}
it("should generic to a reverse decoder") {
val (_, model2) = reverseFooDecoder1.getData(fooValue1.reverseString)
model2 shouldBe fooValue1
}
}
}
