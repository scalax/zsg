package zsg.macros.case_class_test
import zsg.macros.single.PropertyApply
import scala.collection.compat._
import zio._
import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._
object CaseClassTest3 extends DefaultRunnableSpec {
  case class Foo3(i1: Long, i2: Int, i3: Int) {
    self =>
    def fieldNames: List[String] = List("i1", "i2", "i3")
    def defaultValues: List[DefaultValue] = List(
      DefaultValue(value = Option.empty, fieldIndex = 1),
      DefaultValue(value = Option.empty, fieldIndex = 2),
      DefaultValue(value = Option.empty, fieldIndex = 3)
    )
    def fieldInfo: List[FieldModel] =
      List(
        FieldModel(value = LongProperty(self.i1), fieldIndex = 1, fieldName = "i1", typeName = "Long"),
        FieldModel(value = IntProperty(self.i2), fieldIndex = 2, fieldName = "i2", typeName = "Int"),
        FieldModel(value = IntProperty(self.i3), fieldIndex = 3, fieldName = "i3", typeName = "Int")
      )
    def reverseFieldInfo: List[FieldModel] =
      List(
        FieldModel(value = IntProperty(self.i3), fieldIndex = 3, fieldName = "i3", typeName = "Int"),
        FieldModel(value = IntProperty(self.i2), fieldIndex = 2, fieldName = "i2", typeName = "Int"),
        FieldModel(value = LongProperty(self.i1), fieldIndex = 1, fieldName = "i1", typeName = "Long")
      )
  }
  val fooValue3                                 = Foo3(i1 = 225523422542L, i2 = 88, i3 = 82)
  val fooEncoder3: ModelToString[Foo3]          = ModelToString.encoder
  val reverseFooEncoder3: ModelToString[Foo3]   = ModelToString.reverseEncoder
  val fooDecoder3: ModelFromString[Foo3]        = ModelFromString.decoder
  val reverseFooDecoder3: ModelFromString[Foo3] = ModelFromString.reverseDecoder
  override def spec = suite("A case class by 3 length")(
    zio.test.test("should generic to a encoder") {
      val str1 = fooEncoder3.mToString(fooValue3)
      assert(str1)(equalTo(fooValue3.fieldInfo))
    },
    zio.test.test("should generic to a reverse encoder") {
      val str2 = reverseFooEncoder3.mToString(fooValue3)
      assert(str2)(equalTo(fooValue3.reverseFieldInfo))
    },
    zio.test.test("should generic to it's default value") {
      val str2 = fooEncoder3.defaultValues
      assert(str2)(equalTo(fooValue3.defaultValues))
    },
    zio.test.test("should generic to it's name list") {
      val name1 = fooEncoder3.labelledNames
      assert(name1)(equalTo(fooValue3.fieldNames))
    },
    zio.test.test("should generic to it's reverse name list") {
      val name1 = reverseFooEncoder3.labelledNames
      assert(name1)(equalTo(fooValue3.fieldNames.reverse))
    },
    zio.test.test("should generic to a decoder") {
      val (_, model1) = fooDecoder3.getData(fooValue3.fieldInfo)
      assert(model1)(equalTo(fooValue3))
    },
    zio.test.test("should generic to a reverse decoder") {
      val (_, model2) = reverseFooDecoder3.getData(fooValue3.reverseFieldInfo)
      assert(model2)(equalTo(fooValue3))
    }
  )
}
