package zsg.macros.case_class_test
import zsg.macros.single.PropertyApply
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
class CaseClassTest3 extends AnyFunSpec with Matchers {
  case class Foo3(i1: Long, i2: Int, i3: Int) {
    self =>
    def defaultValues: List[DefaultValue] =
      List(DefaultValue(value = Option.empty, fieldIndex = 1), DefaultValue(value = Option.empty, fieldIndex = 2), DefaultValue(value = Option.empty, fieldIndex = 3))
    def fieldInfo: List[FieldModel] =
      List(
        FieldModel(value = LongProperty(self.i1), fieldIndex = 1, fieldName = "i1", typeName = "Long"),
        FieldModel(value = IntProperty(self.i2), fieldIndex = 2, fieldName = "i2", typeName = "Int"),
        FieldModel(value = IntProperty(self.i3), fieldIndex = 3, fieldName = "i3", typeName = "Int")
      )
    def reverseString: List[FieldModel] =
      List(
        FieldModel(value = IntProperty(self.i3), fieldIndex = 3, fieldName = "i3", typeName = "Int"),
        FieldModel(value = IntProperty(self.i2), fieldIndex = 2, fieldName = "i2", typeName = "Int"),
        FieldModel(value = LongProperty(self.i1), fieldIndex = 1, fieldName = "i1", typeName = "Long")
      )
  }
  val fooValue3                                 = Foo3(i1 = 225523422542L, i2 = 88, i3 = 82)
  val ap3                                       = PropertyApply[Foo3]
  val fooEncoder3: ModelToString[Foo3]          = ModelToString.encoder
  val reverseFooEncoder3: ModelToString[Foo3]   = ModelToString.reverseEncoder
  val fooDecoder3: ModelFromString[Foo3]        = ModelFromString.decoder
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
