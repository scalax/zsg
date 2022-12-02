package zsg.macros.case_class_test
import zsg.macros.single.PropertyApply
import scala.collection.compat._
import zio._
import zio.Console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._
object CaseClassTest4 extends DefaultRunnableSpec {
    case class Foo4(   i1:   Long         ,   i2:    Int        ,   i3:     Int       ,   i4:      Long    ) {
        self =>
        def fieldNames: List[String] = List(  "i1"   ,  "i2"   ,  "i3"   ,  "i4" )
        def defaultValues: List[DefaultValue] = List(    DefaultValue(value = Option.empty, fieldIndex = 1)     ,    DefaultValue(value = Option.empty, fieldIndex = 2)     ,    DefaultValue(value = Option.empty, fieldIndex = 3)     ,    DefaultValue(value = Option.empty, fieldIndex = 4)   )
        def fieldInfo: List[FieldModel] =
            List(   FieldModel(value =   LongProperty(self.i1)     , fieldIndex = 1, fieldName = "i1", typeName =   "Long"     )    ,   FieldModel(value =    IntProperty(self.i2)    , fieldIndex = 2, fieldName = "i2", typeName =    "Int"    )    ,   FieldModel(value =     IntProperty(self.i3)   , fieldIndex = 3, fieldName = "i3", typeName =     "Int"   )    ,   FieldModel(value =      LongProperty(self.i4)  , fieldIndex = 4, fieldName = "i4", typeName =      "Long"  )  )
        def reverseFieldInfo: List[FieldModel] =
            List(  FieldModel(value =      LongProperty(self.i4)  , fieldIndex = 4, fieldName = "i4", typeName =      "Long"  )   ,    FieldModel(value =     IntProperty(self.i3)   , fieldIndex = 3, fieldName = "i3", typeName =     "Int"   )   ,    FieldModel(value =    IntProperty(self.i2)    , fieldIndex = 2, fieldName = "i2", typeName =    "Int"    )   ,    FieldModel(value =   LongProperty(self.i1)     , fieldIndex = 1, fieldName = "i1", typeName =   "Long"     )   )
    }
    val fooValue4 = Foo4(      i1 = 225523422542L             ,  i2 = 88             ,  i3 = 82             ,  i4 = 24564564L   )
    val fooEncoder4: ModelToString[Foo4] = ModelToString.encoder
    val reverseFooEncoder4: ModelToString[Foo4] = ModelToString.reverseEncoder
    val fooDecoder4: ModelFromString[Foo4] = ModelFromString.decoder
    val reverseFooDecoder4: ModelFromString[Foo4] = ModelFromString.reverseDecoder
    override def spec = suite("A case class by 4 length")(
        zio.test.test("should generic to a encoder") {
            val str1 = fooEncoder4.mToString(fooValue4)
            assert(str1)(equalTo(fooValue4.fieldInfo))
        },
        zio.test.test("should generic to a reverse encoder") {
            val str2 = reverseFooEncoder4.mToString(fooValue4)
            assert(str2)(equalTo(fooValue4.reverseFieldInfo))
        },
        zio.test.test("should generic to it's default value") {
            val str2 = fooEncoder4.defaultValues
            assert(str2)(equalTo(fooValue4.defaultValues))
        },
        zio.test.test("should generic to it's name list") {
            val name1 = fooEncoder4.labelledNames
            assert(name1)(equalTo(fooValue4.fieldNames))
        },
        zio.test.test("should generic to it's reverse name list") {
            val name1 = reverseFooEncoder4.labelledNames
            assert(name1)(equalTo(fooValue4.fieldNames.reverse))
        },
        zio.test.test("should generic to a decoder") {
            val (_, model1) = fooDecoder4.getData(fooValue4.fieldInfo)
            assert(model1)(equalTo(fooValue4))
        },
        zio.test.test("should generic to a reverse decoder") {
            val (_, model2) = reverseFooDecoder4.getData(fooValue4.reverseFieldInfo)
            assert(model2)(equalTo(fooValue4))
        }
    )
}
