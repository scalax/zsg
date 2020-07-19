package zsg.macros.case_class_test
import zsg.macros.single.PropertyApply
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
class CaseClassTest1 extends AnyFunSpec with Matchers {
  case class Foo1(i1: Long) {
    self =>
    def defaultValues: List[DefaultValue] = List(DefaultValue(value = Option.empty, fieldIndex = 1))
    def fieldInfo: List[FieldModel] =
      List(FieldModel(value = LongProperty(self.i1), fieldIndex = 1, fieldName = "i1", typeName = "Long"))
    def reverseFieldInfo: List[FieldModel] =
      List(FieldModel(value = LongProperty(self.i1), fieldIndex = 1, fieldName = "i1", typeName = "Long"))
  }
  val fooValue1                                 = Foo1(i1 = 225523422542L)
  val fooEncoder1: ModelToString[Foo1]          = ModelToString.encoder
  val reverseFooEncoder1: ModelToString[Foo1]   = ModelToString.reverseEncoder
  val fooDecoder1: ModelFromString[Foo1]        = ModelFromString.decoder
  val reverseFooDecoder1: ModelFromString[Foo1] = ModelFromString.reverseDecoder
  describe("A case class by 1 length") {
    it("should generic to a encoder") {
      val str1 = fooEncoder1.mToString(fooValue1)
      str1 shouldBe fooValue1.fieldInfo
    }
    it("should generic to a reverse encoder") {
      val str2 = reverseFooEncoder1.mToString(fooValue1)
      str2 shouldBe fooValue1.reverseFieldInfo
    }
    it("should generic to it's default value") {
      val str2 = fooEncoder1.defaultValues
      str2 shouldBe fooValue1.defaultValues
    }
    it("should generic to a decoder") {
      val (_, model1) = fooDecoder1.getData(fooValue1.fieldInfo)
      model1 shouldBe fooValue1
    }
    it("should generic to a reverse decoder") {
      val (_, model2) = reverseFooDecoder1.getData(fooValue1.reverseFieldInfo)
      model2 shouldBe fooValue1
    }
  }
}
