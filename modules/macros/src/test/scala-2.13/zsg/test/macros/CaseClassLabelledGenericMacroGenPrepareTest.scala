package zsg.test.macros.case_class_test

import zsg.{ItemTag2, ZsgTuple2}
import zsg.macros.case_class_test.{FieldModel, IntProperty, LongProperty, ModelToString, StringProperty}
import zsg.macros.single.{ColumnName, PropertyApply, ZsgGetterGeneric, ZsgLabelledTypeGeneric}

object CaseClassLabelledGenericMacroGenPrepareTest {

  case class Foo(i1: String, i2: String, i3: Int, i4: Int, i5: Long, i6: String, i7: String, i8: String, i9: Int, i10: Int)

  val fooValue = Foo(i1 = "i1", i2 = "i2", i3 = 3, i4 = 4, i5 = 5L, i6 = "i6", i7 = "i7", i8 = "i8", i9 = 9, i10 = 10)

  val ap = PropertyApply[Foo]

  val fooPropertyTag = ItemTag2(
    ItemTag2(
      ItemTag2(ItemTag2(ap.to(_.i1), ap.to(_.i2)), ItemTag2(ap.to(_.i3), ap.to(_.i4))),
      ItemTag2(ItemTag2(ap.to(_.i5), ap.to(_.i6)), ItemTag2(ap.to(_.i7), ap.to(_.i8)))
    ),
    ItemTag2(ap.to(_.i9), ap.to(_.i10))
  )

  val fooGetter = (foo: Foo) =>
    new ZsgTuple2(
      new ZsgTuple2(
        new ZsgTuple2(new ZsgTuple2(foo.i1, foo.i2), new ZsgTuple2(foo.i3, foo.i4)),
        new ZsgTuple2(new ZsgTuple2(foo.i5, foo.i6), new ZsgTuple2(foo.i7, foo.i8))
      ),
      new ZsgTuple2(foo.i9, foo.i10)
    )

  lazy val dsfsdfewrene: Foo = throw new Exception

  val fooLabelled = ZsgLabelledTypeGeneric[Foo].model(
    ItemTag2(
      ItemTag2(
        ItemTag2(ItemTag2(ColumnName["i1"], ColumnName["i2"]), ItemTag2(ColumnName["i3"], ColumnName["i4"])),
        ItemTag2(ItemTag2(ColumnName["i5"], ColumnName["i6"]), ItemTag2(ColumnName["i7"], ColumnName["i8"]))
      ),
      ItemTag2(ColumnName["i9"], ColumnName["i10"])
    )
  )

  val fooEncoder: ModelToString[Foo] =
    ModelToString.init1(ModelToString.forType[Foo].value(fooPropertyTag), fooLabelled).init2.init3(ZsgGetterGeneric.value(fooGetter))
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

}
