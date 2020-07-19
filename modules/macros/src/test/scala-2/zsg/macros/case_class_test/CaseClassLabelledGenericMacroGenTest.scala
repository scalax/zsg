package zsg.macros.case_class_test

import zsg.BuildContent
import zsg.macros.single.{PropertyApply, StringName, ZsgDefaultValueGeneric, ZsgGetterGeneric, ZsgLabelledTypeGeneric}
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class CaseClassLabelledGenericMacroGenTest extends AnyFunSpec with Matchers {

  case class Foo(i1: String, i2: String, i3: Int, i4: Int, i5: Long, i6: String, i7: String, i8: String, i9: Int, i10: Int)

  val fooValue = Foo(i1 = "i1", i2 = "i2", i3 = 3, i4 = 4, i5 = 5L, i6 = "i6", i7 = "i7", i8 = "i8", i9 = 9, i10 = 10)

  val ap = PropertyApply[Foo]

  val fooPropertyTag =
    BuildContent.tuple10(
      ap.to(_.i1),
      ap.to(_.i2),
      ap.to(_.i3),
      ap.to(_.i4),
      ap.to(_.i5),
      ap.to(_.i6),
      ap.to(_.i7),
      ap.to(_.i8),
      ap.to(_.i9),
      ap.to(_.i10)
    )

  val fooGetter = { foo: Foo =>
    BuildContent.tuple10(
      foo.i1,
      foo.i2,
      foo.i3,
      foo.i4,
      foo.i5,
      foo.i6,
      foo.i7,
      foo.i8,
      foo.i9,
      foo.i10
    )
  }

  val fooLabelled = ZsgLabelledTypeGeneric
    .CaseClassColumnName[Foo]
    .propertyName(n =>
      BuildContent.tuple10(
        {
          type i1 = StringName
          n.name[i1]
        }, {
          type i2 = StringName
          n.name[i2]
        }, {
          type i3 = StringName
          n.name[i3]
        }, {
          type i4 = StringName
          n.name[i4]
        }, {
          type i5 = StringName
          n.name[i5]
        }, {
          type i6 = StringName
          n.name[i6]
        }, {
          type i7 = StringName
          n.name[i7]
        }, {
          type i8 = StringName
          n.name[i8]
        }, {
          type i9 = StringName
          n.name[i9]
        }, {
          type i10 = StringName
          n.name[i10]
        }
      )
    )

  val fooEncoder: ModelToString[Foo]  = ModelToString.init1(ModelToString.forType[Foo].value(fooPropertyTag), fooLabelled).init2.init3(ZsgGetterGeneric.value(fooGetter))
  val fooEncoder2: ModelToString[Foo] = ModelToString.encoder

  def prepareResult(foo: Foo) =
    List(
      FieldModel(value = StringProperty(foo.i1), fieldIndex = 1, fieldName = "i1", typeName = "String"),
      FieldModel(value = StringProperty(foo.i2), fieldIndex = 2, fieldName = "i2", typeName = "String"),
      FieldModel(value = IntProperty(foo.i3), fieldIndex = 3, fieldName = "i3", typeName = "Int"),
      FieldModel(value = IntProperty(foo.i4), fieldIndex = 4, fieldName = "i4", typeName = "Int"),
      FieldModel(value = LongProperty(foo.i5), fieldIndex = 5, fieldName = "i5", typeName = "Long"),
      FieldModel(value = StringProperty(foo.i6), fieldIndex = 6, fieldName = "i6", typeName = "String"),
      FieldModel(value = StringProperty(foo.i7), fieldIndex = 7, fieldName = "i7", typeName = "String"),
      FieldModel(value = StringProperty(foo.i8), fieldIndex = 8, fieldName = "i8", typeName = "String"),
      FieldModel(value = IntProperty(foo.i9), fieldIndex = 9, fieldName = "i9", typeName = "Int"),
      FieldModel(value = IntProperty(foo.i10), fieldIndex = 10, fieldName = "i10", typeName = "Int")
    )

  describe("A case class") {
    it("should labelled generic to a encoder") {
      val str1 = fooEncoder.mToString(fooValue)
      val str2 = fooEncoder2.mToString(fooValue)
      str1 shouldBe prepareResult(fooValue)
      str2 shouldBe prepareResult(fooValue)
      str1 shouldBe str2
    }
  }

}
