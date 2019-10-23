package asuna.testkit
import asuna.macros.PropertyApply
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
class Test10 extends AnyFunSpec with Matchers {
  case class Foo10(i1: Long, i2: Int, i3: Int, i4: String, i5: Long, i6: Int, i7: Int, i8: String, i9: Long, i10: Int) {
    self =>
    override def toString: String =
      s"(Long" + s"(${self.i1}),i1)|" + s"(Int" + s"(${self.i2}),i2)|" + s"(Int" + s"(${self.i3}),i3)|" + s"(String" + s"(${self.i4}),i4)|" + s"(Long" + s"(${self.i5}),i5)|" + s"(Int" + s"(${self.i6}),i6)|" + s"(Int" + s"(${self.i7}),i7)|" + s"(String" + s"(${self.i8}),i8)|" + s"(Long" + s"(${self.i9}),i9)|" + s"(Int" + s"(${self.i10}),i10)"
    def reverseString: String =
      s"(Int" + s"(${self.i10}),i10)|" + s"(Long" + s"(${self.i9}),i9)|" + s"(String" + s"(${self.i8}),i8)|" + s"(Int" + s"(${self.i7}),i7)|" + s"(Int" + s"(${self.i6}),i6)|" + s"(Long" + s"(${self.i5}),i5)|" + s"(String" + s"(${self.i4}),i4)|" + s"(Int" + s"(${self.i3}),i3)|" + s"(Int" + s"(${self.i2}),i2)|" + s"(Long" + s"(${self.i1}),i1)"
  }
  val fooValue10 = Foo10(i1 = 1, i2 = 2, i3 = 3, i4 = "i4", i5 = 5, i6 = 6, i7 = 7, i8 = "i8", i9 = 9, i10 = 10)
  val ap10       = PropertyApply[Foo10]
  import in._
  import out._
  val fooEncoder10: ListEncoder[Foo10]         = encoder
  val reverseFooEncoder10: ListEncoder[Foo10]  = reverseEncoder
  val fooDecoder10: ModelDecoder[Foo10]        = decoder
  val reverseFooDecoder10: ModelDecoder[Foo10] = reverseDecoder
  describe("A case class by 10 length") {
    it("should generic to a encoder") {
      val str1 = fooEncoder10.encode(fooValue10).mkString("|")
      str1 shouldBe fooValue10.toString
    }
    it("should generic to a reverse encoder") {
      val str2 = reverseFooEncoder10.encode(fooValue10).mkString("|")
      str2 shouldBe fooValue10.reverseString
    }
    it("should generic to a decoder") {
      val (_, model1) = fooDecoder10.getData(fooValue10.toString)
      model1 shouldBe fooValue10
    }
    it("should generic to a reverse decoder") {
      val (_, model2) = reverseFooDecoder10.getData(fooValue10.reverseString)
      model2 shouldBe fooValue10
    }
  }
}
