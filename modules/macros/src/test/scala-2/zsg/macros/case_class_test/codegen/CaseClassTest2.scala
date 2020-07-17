package zsg.macros.case_class_test
import zsg.macros.single.PropertyApply
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
class CaseClassTest2 extends AnyFunSpec with Matchers {
  case class Foo2(i1: Long, i2: Int) {
    self =>
    def defaultValues: List[DefaultValue] = List(DefaultValue(value = Option.empty, fieldIndex = 1), DefaultValue(value = Option.empty, fieldIndex = 2))
    def fieldInfo: List[FieldModel] =
      List(
        FieldModel(value = LongProperty(self.i1), fieldIndex = 1, fieldName = "i1", typeName = "Long"),
        FieldModel(value = IntProperty(self.i2), fieldIndex = 2, fieldName = "i2", typeName = "Int")
      )
    def reverseString: List[FieldModel] =
      List(
        FieldModel(value = IntProperty(self.i2), fieldIndex = 2, fieldName = "i2", typeName = "Int"),
        FieldModel(value = LongProperty(self.i1), fieldIndex = 1, fieldName = "i1", typeName = "Long")
      )
  }
  val fooValue2                                 = Foo2(i1 = 225523422542L, i2 = 88)
  val ap2                                       = PropertyApply[Foo2]
  val fooEncoder2: ModelToString[Foo2]          = ModelToString.encoder
  val reverseFooEncoder2: ModelToString[Foo2]   = ModelToString.reverseEncoder
  val fooDecoder2: ModelFromString[Foo2]        = ModelFromString.decoder
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
