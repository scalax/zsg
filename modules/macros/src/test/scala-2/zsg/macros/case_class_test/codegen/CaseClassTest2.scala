package zsg.macros.case_class_test
import zsg.macros.single.PropertyApply
import scala.collection.compat._
import zio._
import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._
object CaseClassTest2 extends DefaultRunnableSpec {
  case class Foo2(i1: Long, i2: Int) {
    self =>
    def fieldNames: List[String] = List("i1", "i2")
    def defaultValues: List[DefaultValue] =
      List(DefaultValue(value = Option.empty, fieldIndex = 1), DefaultValue(value = Option.empty, fieldIndex = 2))
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
  override def spec = suite("A case class by 2 length")(
    zio.test.test("should generic to a encoder") {
      val str1 = fooEncoder2.mToString(fooValue2)
      assert(str1)(equalTo(fooValue2.fieldInfo))
    },
    zio.test.test("should generic to a reverse encoder") {
      val str2 = reverseFooEncoder2.mToString(fooValue2)
      assert(str2)(equalTo(fooValue2.reverseFieldInfo))
    },
    zio.test.test("should generic to it's default value") {
      val str2 = fooEncoder2.defaultValues
      assert(str2)(equalTo(fooValue2.defaultValues))
    },
    zio.test.test("should generic to it's name list") {
      val name1 = fooEncoder2.labelledNames
      assert(name1)(equalTo(fooValue2.fieldNames))
    },
    zio.test.test("should generic to it's reverse name list") {
      val name1 = reverseFooEncoder2.labelledNames
      assert(name1)(equalTo(fooValue2.fieldNames.reverse))
    },
    zio.test.test("should generic to a decoder") {
      val (_, model1) = fooDecoder2.getData(fooValue2.fieldInfo)
      assert(model1)(equalTo(fooValue2))
    },
    zio.test.test("should generic to a reverse decoder") {
      val (_, model2) = reverseFooDecoder2.getData(fooValue2.reverseFieldInfo)
      assert(model2)(equalTo(fooValue2))
    }
  )
}
