package zsg.macros.case_class_test
import zsg.macros.single.PropertyApply
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
class CaseClassTest2 extends AnyFunSpec with Matchers {
case class Foo2( i1:   Long     ,  i2:    Int   ) {
self =>
override def toString: String =
s"(Long" + s"(${self.i1}),i1)|"  + s"(Int" + s"(${self.i2}),i2)"
def reverseString: String =
s"(Int" + s"(${self.i2}),i2)|"  + s"(Long" + s"(${self.i1}),i1)"
}
val fooValue2 = Foo2( i1 =   1     ,  i2 =    2   )
val ap2 = PropertyApply[Foo2]
val fooEncoder2: ModelToString[Foo2] = ModelToString.encoder
val reverseFooEncoder2: ModelToString[Foo2] = ModelToString.reverseEncoder
val fooDecoder2: ModelFromString[Foo2] = ModelFromString.decoder
val reverseFooDecoder2: ModelFromString[Foo2] = ModelFromString.reverseDecoder
describe("A case class by 2 length") {
it("should generic to a encoder") {
val str1 = fooEncoder2.mToString(fooValue2).mkString("|")
str1 shouldBe fooValue2.toString
}
it("should generic to a reverse encoder") {
val str2 = reverseFooEncoder2.mToString(fooValue2).mkString("|")
str2 shouldBe fooValue2.reverseString
}
it("should generic to a decoder") {
val (_, model1) = fooDecoder2.getData(fooValue2.toString)
model1 shouldBe fooValue2
}
it("should generic to a reverse decoder") {
val (_, model2) = reverseFooDecoder2.getData(fooValue2.reverseString)
model2 shouldBe fooValue2
}
}
}
