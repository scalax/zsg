package zsg.macros.case_class_test
import zsg.macros.single.PropertyApply
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import scala.collection.compat._
class CaseClassTest2 extends AnyFunSpec with Matchers {
  case class Foo2(i1: Long, i2: Int) {
    self =>
    def fieldNames: List[String]          = List("i1", "i2")
    def defaultValues: List[DefaultValue] = List(DefaultValue(value = Option.empty, fieldIndex = 1), DefaultValue(value = Option.empty, fieldIndex = 2))
    def fieldInfo: List[FieldModel] =
      List(
        FieldModel(value = LongProperty(self.i1), fieldIndex = 1, fieldName = "i1", typeName = "Long"),
        FieldModel(value = IntProperty(self.i2), fieldIndex = 2, fieldName = "i2", typeName = "Int")
      )
    def reverseFieldInfo: List[FieldModel] =
      List(
        FieldModel(value = IntProperty(self.i2), fieldIndex = 2, fieldName = "i2", typeName = "Int"),
        FieldModel(value = LongProperty(self.i1), fieldIndex = 1, fieldName = "i1", typeName = "Long")
      )
  }
  val fooValue2                                 = Foo2(i1 = 225523422542L, i2 = 88)
  val fooEncoder2: ModelToString[Foo2]          = ModelToString.encoder
  val reverseFooEncoder2: ModelToString[Foo2]   = ModelToString.reverseEncoder
  val fooDecoder2: ModelFromString[Foo2]        = ModelFromString.decoder
  val reverseFooDecoder2: ModelFromString[Foo2] = ModelFromString.reverseDecoder
  describe("A case class by 2 length") {
    it("should generic to a encoder") {
      val str1 = fooEncoder2.mToString(fooValue2)
      str1 shouldBe fooValue2.fieldInfo
    }
    it("should generic to a reverse encoder") {
      val str2 = reverseFooEncoder2.mToString(fooValue2)
      str2 shouldBe fooValue2.reverseFieldInfo
    }
    it("should generic to it's default value") {
      val str2 = fooEncoder2.defaultValues
      str2 shouldBe fooValue2.defaultValues
    }
    it("should generic to it's name list") {
      val name1 = fooEncoder2.labelledNames
      name1 shouldBe fooValue2.fieldNames
    }
    it("should generic to it's reverse name list") {
      val name1 = reverseFooEncoder2.labelledNames
      name1 shouldBe fooValue2.fieldNames.reverse
    }
    it("should generic to a decoder") {
      val (_, model1) = fooDecoder2.getData(fooValue2.fieldInfo)
      model1 shouldBe fooValue2
    }
    it("should generic to a reverse decoder") {
      val (_, model2) = reverseFooDecoder2.getData(fooValue2.reverseFieldInfo)
      model2 shouldBe fooValue2
    }
  }
}
