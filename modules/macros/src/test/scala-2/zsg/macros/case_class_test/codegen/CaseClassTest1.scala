package zsg.macros.case_class_test
import zsg.macros.single.PropertyApply
import scala.collection.compat._
import zio._
import zio.Console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._
object CaseClassTest1 extends DefaultRunnableSpec {
  case class Foo1(i1: Long) {
    self =>
    def fieldNames: List[String]          = List("i1")
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
  override def spec = suite("A case class by 1 length")(
    zio.test.test("should generic to a encoder") {
      val str1 = fooEncoder1.mToString(fooValue1)
      assert(str1)(equalTo(fooValue1.fieldInfo))
    },
    zio.test.test("should generic to a reverse encoder") {
      val str2 = reverseFooEncoder1.mToString(fooValue1)
      assert(str2)(equalTo(fooValue1.reverseFieldInfo))
    },
    zio.test.test("should generic to it's default value") {
      val str2 = fooEncoder1.defaultValues
      assert(str2)(equalTo(fooValue1.defaultValues))
    },
    zio.test.test("should generic to it's name list") {
      val name1 = fooEncoder1.labelledNames
      assert(name1)(equalTo(fooValue1.fieldNames))
    },
    zio.test.test("should generic to it's reverse name list") {
      val name1 = reverseFooEncoder1.labelledNames
      assert(name1)(equalTo(fooValue1.fieldNames.reverse))
    },
    zio.test.test("should generic to a decoder") {
      val (_, model1) = fooDecoder1.getData(fooValue1.fieldInfo)
      assert(model1)(equalTo(fooValue1))
    },
    zio.test.test("should generic to a reverse decoder") {
      val (_, model2) = reverseFooDecoder1.getData(fooValue1.reverseFieldInfo)
      assert(model2)(equalTo(fooValue1))
    }
  )
}
