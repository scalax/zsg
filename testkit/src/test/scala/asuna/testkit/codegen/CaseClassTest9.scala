package asuna.testkit
import asuna.macros.PropertyApply
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
class Test9 extends AnyFunSpec with Matchers {
  case class Foo9(i1: Long, i2: Int, i3: Int, i4: String, i5: Long, i6: Int, i7: Int, i8: String, i9: Long) {
    self =>
    override def toString: String =
      s"(Long" + s"(${self.i1}),i1)|" + s"(Int" + s"(${self.i2}),i2)|" + s"(Int" + s"(${self.i3}),i3)|" + s"(String" + s"(${self.i4}),i4)|" + s"(Long" + s"(${self.i5}),i5)|" + s"(Int" + s"(${self.i6}),i6)|" + s"(Int" + s"(${self.i7}),i7)|" + s"(String" + s"(${self.i8}),i8)|" + s"(Long" + s"(${self.i9}),i9)"
    def reverseString: String =
      s"(Long" + s"(${self.i9}),i9)|" + s"(String" + s"(${self.i8}),i8)|" + s"(Int" + s"(${self.i7}),i7)|" + s"(Int" + s"(${self.i6}),i6)|" + s"(Long" + s"(${self.i5}),i5)|" + s"(String" + s"(${self.i4}),i4)|" + s"(Int" + s"(${self.i3}),i3)|" + s"(Int" + s"(${self.i2}),i2)|" + s"(Long" + s"(${self.i1}),i1)"
  }
  val fooValue9 = Foo9(i1 = 1, i2 = 2, i3 = 3, i4 = "i4", i5 = 5, i6 = 6, i7 = 7, i8 = "i8", i9 = 9)
  val ap9       = PropertyApply[Foo9]
  import in._
  import out._
  val fooEncoder9: ListEncoder[Foo9]         = encoder
  val reverseFooEncoder9: ListEncoder[Foo9]  = reverseEncoder
  val fooDecoder9: ModelDecoder[Foo9]        = decoder
  val reverseFooDecoder9: ModelDecoder[Foo9] = reverseDecoder
  describe("A case class by 9 length") {
    it("should generic to a encoder") {
      val str1 = fooEncoder9.encode(fooValue9).mkString("|")
      str1 shouldBe fooValue9.toString
    }
    it("should generic to a reverse encoder") {
      val str2 = reverseFooEncoder9.encode(fooValue9).mkString("|")
      str2 shouldBe fooValue9.reverseString
    }
    it("should generic to a decoder") {
      val (_, model1) = fooDecoder9.getData(fooValue9.toString)
      model1 shouldBe fooValue9
    }
    it("should generic to a reverse decoder") {
      val (_, model2) = reverseFooDecoder9.getData(fooValue9.reverseString)
      model2 shouldBe fooValue9
    }
  }
}
