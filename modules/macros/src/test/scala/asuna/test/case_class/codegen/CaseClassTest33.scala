package asuna.testkit
import asuna.macros.PropertyApply
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
class Test33 extends AnyFunSpec with Matchers {
case class Foo33( i1:   Long     ,  i2:    Int    ,  i3:     Int   ,  i4:  String      ,  i5:   Long     ,  i6:    Int    ,  i7:     Int   ,  i8:  String      ,  i9:   Long     ,  i10:    Int    ,  i11:     Int   ,  i12:  String      ,  i13:   Long     ,  i14:    Int    ,  i15:     Int   ,  i16:  String      ,  i17:   Long     ,  i18:    Int    ,  i19:     Int   ,  i20:  String      ,  i21:   Long     ,  i22:    Int    ,  i23:     Int   ,  i24:  String      ,  i25:   Long     ,  i26:    Int    ,  i27:     Int   ,  i28:  String      ,  i29:   Long     ,  i30:    Int    ,  i31:     Int   ,  i32:  String      ,  i33:   Long    ) {
self =>
override def toString: String =
s"(Long" + s"(${self.i1}),i1)|"  + s"(Int" + s"(${self.i2}),i2)|"  + s"(Int" + s"(${self.i3}),i3)|"  + s"(String" + s"(${self.i4}),i4)|"  + s"(Long" + s"(${self.i5}),i5)|"  + s"(Int" + s"(${self.i6}),i6)|"  + s"(Int" + s"(${self.i7}),i7)|"  + s"(String" + s"(${self.i8}),i8)|"  + s"(Long" + s"(${self.i9}),i9)|"  + s"(Int" + s"(${self.i10}),i10)|"  + s"(Int" + s"(${self.i11}),i11)|"  + s"(String" + s"(${self.i12}),i12)|"  + s"(Long" + s"(${self.i13}),i13)|"  + s"(Int" + s"(${self.i14}),i14)|"  + s"(Int" + s"(${self.i15}),i15)|"  + s"(String" + s"(${self.i16}),i16)|"  + s"(Long" + s"(${self.i17}),i17)|"  + s"(Int" + s"(${self.i18}),i18)|"  + s"(Int" + s"(${self.i19}),i19)|"  + s"(String" + s"(${self.i20}),i20)|"  + s"(Long" + s"(${self.i21}),i21)|"  + s"(Int" + s"(${self.i22}),i22)|"  + s"(Int" + s"(${self.i23}),i23)|"  + s"(String" + s"(${self.i24}),i24)|"  + s"(Long" + s"(${self.i25}),i25)|"  + s"(Int" + s"(${self.i26}),i26)|"  + s"(Int" + s"(${self.i27}),i27)|"  + s"(String" + s"(${self.i28}),i28)|"  + s"(Long" + s"(${self.i29}),i29)|"  + s"(Int" + s"(${self.i30}),i30)|"  + s"(Int" + s"(${self.i31}),i31)|"  + s"(String" + s"(${self.i32}),i32)|"  + s"(Long" + s"(${self.i33}),i33)"
def reverseString: String =
s"(Long" + s"(${self.i33}),i33)|"  + s"(String" + s"(${self.i32}),i32)|"  + s"(Int" + s"(${self.i31}),i31)|"  + s"(Int" + s"(${self.i30}),i30)|"  + s"(Long" + s"(${self.i29}),i29)|"  + s"(String" + s"(${self.i28}),i28)|"  + s"(Int" + s"(${self.i27}),i27)|"  + s"(Int" + s"(${self.i26}),i26)|"  + s"(Long" + s"(${self.i25}),i25)|"  + s"(String" + s"(${self.i24}),i24)|"  + s"(Int" + s"(${self.i23}),i23)|"  + s"(Int" + s"(${self.i22}),i22)|"  + s"(Long" + s"(${self.i21}),i21)|"  + s"(String" + s"(${self.i20}),i20)|"  + s"(Int" + s"(${self.i19}),i19)|"  + s"(Int" + s"(${self.i18}),i18)|"  + s"(Long" + s"(${self.i17}),i17)|"  + s"(String" + s"(${self.i16}),i16)|"  + s"(Int" + s"(${self.i15}),i15)|"  + s"(Int" + s"(${self.i14}),i14)|"  + s"(Long" + s"(${self.i13}),i13)|"  + s"(String" + s"(${self.i12}),i12)|"  + s"(Int" + s"(${self.i11}),i11)|"  + s"(Int" + s"(${self.i10}),i10)|"  + s"(Long" + s"(${self.i9}),i9)|"  + s"(String" + s"(${self.i8}),i8)|"  + s"(Int" + s"(${self.i7}),i7)|"  + s"(Int" + s"(${self.i6}),i6)|"  + s"(Long" + s"(${self.i5}),i5)|"  + s"(String" + s"(${self.i4}),i4)|"  + s"(Int" + s"(${self.i3}),i3)|"  + s"(Int" + s"(${self.i2}),i2)|"  + s"(Long" + s"(${self.i1}),i1)"
}
val fooValue33 = Foo33( i1 =   1     ,  i2 =    2    ,  i3 =     3   ,  i4 =  "i4"      ,  i5 =   5     ,  i6 =    6    ,  i7 =     7   ,  i8 =  "i8"      ,  i9 =   9     ,  i10 =    10    ,  i11 =     11   ,  i12 =  "i12"      ,  i13 =   13     ,  i14 =    14    ,  i15 =     15   ,  i16 =  "i16"      ,  i17 =   17     ,  i18 =    18    ,  i19 =     19   ,  i20 =  "i20"      ,  i21 =   21     ,  i22 =    22    ,  i23 =     23   ,  i24 =  "i24"      ,  i25 =   25     ,  i26 =    26    ,  i27 =     27   ,  i28 =  "i28"      ,  i29 =   29     ,  i30 =    30    ,  i31 =     31   ,  i32 =  "i32"      ,  i33 =   33    )
val ap33 = PropertyApply[Foo33]
import in._
import out._
val fooEncoder33: ListEncoder[Foo33] = encoder
val reverseFooEncoder33: ListEncoder[Foo33] = reverseEncoder
val fooDecoder33: ModelDecoder[Foo33] = decoder
val reverseFooDecoder33: ModelDecoder[Foo33] = reverseDecoder
describe("A case class by 33 length") {
it("should generic to a encoder") {
val str1 = fooEncoder33.encode(fooValue33).mkString("|")
str1 shouldBe fooValue33.toString
}
it("should generic to a reverse encoder") {
val str2 = reverseFooEncoder33.encode(fooValue33).mkString("|")
str2 shouldBe fooValue33.reverseString
}
it("should generic to a decoder") {
val (_, model1) = fooDecoder33.getData(fooValue33.toString)
model1 shouldBe fooValue33
}
it("should generic to a reverse decoder") {
val (_, model2) = reverseFooDecoder33.getData(fooValue33.reverseString)
model2 shouldBe fooValue33
}
}
}
