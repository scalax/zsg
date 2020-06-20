package zsg.macros.case_class_test

import zsg.BuildContent
import zsg.macros.single.{PropertyApply, StringName, ZsgGetterGeneric, ZsgLabelledTypeGeneric}
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class CaseClassLabelledGenericMacroGenTest extends AnyFunSpec with Matchers {

  case class Foo(i1: String, i2: String, i3: Int, i4: Int, i5: Long, i6: String, i7: String, i8: String, i9: Int, i10: Int)

  val fooValue = Foo(i1 = "i1", i2 = "i2", i3 = 3, i4 = 4, i5 = 5L, i6 = "i6", i7 = "i7", i8 = "i8", i9 = 9, i10 = 10)

  val ap = PropertyApply[Foo]

  val fooPropertyTag = BuildContent.nodeTuple2(
    BuildContent.nodeTuple2(
      BuildContent.nodeTuple2(BuildContent.tuple2(ap.to(_.i1), ap.to(_.i2)), BuildContent.tuple2(ap.to(_.i3), ap.to(_.i4))),
      BuildContent.nodeTuple2(BuildContent.tuple2(ap.to(_.i5), ap.to(_.i6)), BuildContent.tuple2(ap.to(_.i7), ap.to(_.i8)))
    ),
    BuildContent.nodeTuple1(BuildContent.tuple2(ap.to(_.i9), ap.to(_.i10)))
  )

  val fooGetter = { foo: Foo =>
    BuildContent.nodeTuple2(
      BuildContent.nodeTuple2(
        BuildContent.nodeTuple2(BuildContent.tuple2(foo.i1, foo.i2), BuildContent.tuple2(foo.i3, foo.i4)),
        BuildContent.nodeTuple2(BuildContent.tuple2(foo.i5, foo.i6), BuildContent.tuple2(foo.i7, foo.i8))
      ),
      BuildContent.nodeTuple1(
        BuildContent.tuple2(foo.i9, foo.i10)
      )
    )
  }

  val fooLabelled = ZsgLabelledTypeGeneric
    .CaseClassColumnName[Foo]
    .propertyName(n =>
      BuildContent.nodeTuple2(
        BuildContent.nodeTuple2(
          BuildContent.nodeTuple2(
            BuildContent.tuple2({
              type i1 = StringName
              n.name[i1]
            }, {
              type i2 = StringName
              n.name[i2]
            }),
            BuildContent.tuple2({
              type i3 = StringName
              n.name[i3]
            }, {
              type i4 = StringName
              n.name[i4]
            })
          ),
          BuildContent.nodeTuple2(
            BuildContent.tuple2({
              type i5 = StringName
              n.name[i5]
            }, {
              type i6 = StringName
              n.name[i6]
            }),
            BuildContent.tuple2({
              type i7 = StringName
              n.name[i7]
            }, {
              type i8 = StringName
              n.name[i8]
            })
          )
        ),
        BuildContent.nodeTuple1(BuildContent.tuple2({
          type i9 = StringName
          n.name[i9]
        }, {
          type i10 = StringName
          n.name[i10]
        }))
      )
    )

  val fooEncoder: ModelToString[Foo]  = ModelToString.init1(ModelToString.forType[Foo].value(fooPropertyTag), fooLabelled).init2.init3(ZsgGetterGeneric.value(fooGetter))
  val fooEncoder2: ModelToString[Foo] = ModelToString.encoder

  def prepareResult(foo: Foo) =
    s"(String(${foo.i1}),i1)|(String(${foo.i2}),i2)|(Int(${foo.i3}),i3)|" +
      s"(Int(${foo.i4}),i4)|(Long(${foo.i5}),i5)|(String(${foo.i6}),i6)|" +
      s"(String(${foo.i7}),i7)|(String(${foo.i8}),i8)|(Int(${foo.i9}),i9)|" +
      s"(Int(${foo.i10}),i10)"

  describe("A case class") {
    it("should labelled generic to a encoder") {
      val str1 = fooEncoder.mToString(fooValue).mkString("|")
      val str2 = fooEncoder2.mToString(fooValue).mkString("|")
      str1 shouldBe prepareResult(fooValue)
      str2 shouldBe prepareResult(fooValue)
      str1 shouldBe str2
    }
  }

}
