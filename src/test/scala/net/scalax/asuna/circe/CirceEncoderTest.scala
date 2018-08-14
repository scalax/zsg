package aa.bb.cc

import java.util.Locale

import com.github.javafaker.Faker
import net.scalax.asuna.circe.another.EncoderContentAbs
import net.scalax.asuna.circe.{ CirceAsunaEncoderHelper, EmptyCirceTable }
import org.scalatest.concurrent.ScalaFutures
import org.scalatest._
import shapeless.Lazy

case class TestModel1(
  /*name1: String,
  olim3: Long,*/ test3: TestModel3)

case class TestModel2(
  name2: String,
  accdef: Int)

case class TestModel3(
  /*nickName: String,
  maxAge: Int,*/ test1: TestModel1 /*, test4: TestModel4*/ )

case class TestModel4(
  age: Int,
  today: String,
  test3: TestModel3)

case class TestModel(
  /*name4: String,
  key5: String,
  TagTagTag: Int,
  olim: Long,*/
  test1: TestModel1 /*,
  test2: List[TestModel2]*/ )

class CirceEncoderTest extends FlatSpec
  with Matchers
  with EitherValues
  with ScalaFutures
  with BeforeAndAfterAll
  with BeforeAndAfter
  with CirceAsunaEncoderHelper {

  lazy val local = new Locale("zh", "CN")
  lazy val faker = new Faker(local)

  "circe encoder" should "auto mapping case class with empty table" in {
    /*val test3 = TestModel3(faker.address.fullAddress, 461, TestModel1(faker.weather.description, 793, TestModel3(faker.address.fullAddress, 461, TestModel1(faker.weather.description, 793, null), null)), null)
    val test1 = TestModel1(faker.weather.description, 793, test3)
    val test2 = TestModel2(faker.book.title, 967)
    val model = TestModel(faker.name.name, faker.address.cityName, 123, 456L, test1, List(test2, test2, test2, test2, test2))*/

    val circeEncoder11111111 = asunaCirce.effect(asunaCirce.caseOnly[EmptyCirceTable, TestModel2].input(EmptyCirceTable.value))

    /*val jsonObject = circeEncoder11111111.write(model)
    println(jsonObject)*/
  }

  /*val slnjnfowehiehnriotht = {
    new net.scalax.asuna.helper.encoder.ForTableInputImpl[net.scalax.asuna.circe.EmptyCirceTable, aa.bb.cc.TestModel1, List[net.scalax.asuna.circe.aaaa.CirceAsunaEncoder], List[(String, io.circe.Json)]](((fresh$macro$1: net.scalax.asuna.circe.EmptyCirceTable) => {
      val mg433092eea6932a49d7aab80a631550a92b5b: _root_.net.scalax.asuna.helper.decoder.macroImpl.ModelGen[aa.bb.cc.TestModel1] = _root_.net.scalax.asuna.helper.decoder.macroImpl.ModelGen.value[aa.bb.cc.TestModel1];
      val proEncoderWrap4b6862b0a36eea45f7aa5c2a756e88ccb673: _root_.net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper.ProEncoderWrap[List[net.scalax.asuna.circe.aaaa.CirceAsunaEncoder], List[(String, io.circe.Json)]] = _root_.net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper.ProEncoderWrap.value[List[net.scalax.asuna.circe.aaaa.CirceAsunaEncoder], List[(String, io.circe.Json)]];
      val encoderHelper6751826ca574ca4633aa6dca592f0f5bdcbc: _root_.net.scalax.asuna.helper.encoder.EncoderHelper[List[net.scalax.asuna.circe.aaaa.CirceAsunaEncoder], List[(String, io.circe.Json)]] = _root_.net.scalax.asuna.helper.encoder.EncoderHelper.value[List[net.scalax.asuna.circe.aaaa.CirceAsunaEncoder], List[(String, io.circe.Json)]];
      val test344e36e44aa1a4a48dca96c4a003f174058e2 = {
        def defName82d52842a2342a489bab647a8f7a930aae83[A, B, C](rep: A, propertyType: _root_.net.scalax.asuna.helper.decoder.macroImpl.PropertyType[B])(implicit shape: _root_.net.scalax.asuna.core.encoder.EncoderShape[A, B, C, List[net.scalax.asuna.circe.aaaa.CirceAsunaEncoder], List[(String, io.circe.Json)]]) = proEncoderWrap4b6862b0a36eea45f7aa5c2a756e88ccb673.propertySv(rep, propertyType)(shape);
        def test3$macro$2(implicit columnInfo: _root_.net.scalax.asuna.helper.MacroColumnInfo): net.scalax.asuna.core.encoder.EncoderShapeValue[Any, List[net.scalax.asuna.circe.aaaa.CirceAsunaEncoder], List[(String, io.circe.Json)]] = defName82d52842a2342a489bab647a8f7a930aae83(mg433092eea6932a49d7aab80a631550a92b5b(((x$2) => x$2.test3)).toPlaceholder, mg433092eea6932a49d7aab80a631550a92b5b(((x$1) => x$1.test3)));
        test3$macro$2(_root_.net.scalax.asuna.helper.MacroColumnInfoImpl(tableColumnName = "test3", modelColumnName = "test3"))
      };
      encoderHelper6751826ca574ca4633aa6dca592f0f5bdcbc.shaped(_root_.scala.List.apply(test344e36e44aa1a4a48dca96c4a003f174058e2)).emap(((termVar1$macro$3: aa.bb.cc.TestModel1) => {
        val x$3 = termVar1$macro$3.test3;
        Nil.$colon$colon(x$3)
      }))
    }))
  }*/

}