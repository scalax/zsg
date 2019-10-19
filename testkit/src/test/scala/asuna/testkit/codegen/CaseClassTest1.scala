package asuna.testkit
import asuna.macros.PropertyApply
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
class Test1 extends AnyFunSpec with Matchers {
  case class Foo1(i1: Long) {
    self =>
    override def toString: String =
      s"(Long" + s"(${self.i1}),i1)"
    def reverseString: String =
      s"(Long" + s"(${self.i1}),i1)"
  }
  val fooValue1 = Foo1(i1 = 1)
  val ap1       = PropertyApply[Foo1]
  import in._
  import out._
  val fooEncoder1: ListEncoder[Foo1]         = encoder
  val reverseFooEncoder1: ListEncoder[Foo1]  = reverseEncoder
  val fooDecoder1: ModelDecoder[Foo1]        = decoder
  val reverseFooDecoder1: ModelDecoder[Foo1] = reverseDecoder
  describe("A case class by 1 length") {
    it("should generic to a encoder") {
      val str1 = fooEncoder1.encode(fooValue1).mkString("|")
      str1 shouldBe fooValue1.toString
    }
    it("should generic to a reverse encoder") {
      val str2 = reverseFooEncoder1.encode(fooValue1).mkString("|")
      str2 shouldBe fooValue1.reverseString
    }
    it("should generic to a decoder") {
      val (_, model1) = fooDecoder1.init(fooValue1.toString)
      model1 shouldBe fooValue1
    }
    it("should generic to a reverse decoder") {
      val (_, model2) = reverseFooDecoder1.init(fooValue1.reverseString)
      model2 shouldBe fooValue1
    }
  }
}
