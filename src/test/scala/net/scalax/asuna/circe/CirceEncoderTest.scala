package aa.bb.cc

import java.util.Locale

import com.github.javafaker.Faker
import io.circe.Json
import net.scalax.asuna.circe.{ CirceAsunaDecoderHelper, CirceAsunaEncoderHelper, EmptyCirceTable }
import net.scalax.asuna.helper.MacroColumnInfoImpl
import net.scalax.asuna.helper.decoder.macroImpl.ModelGen
import net.scalax.asuna.helper.encoder.{ CaseDecoderRepWrap, EncoderHelper, EncoderWitCol }
import org.scalatest.concurrent.ScalaFutures
import org.scalatest._
import shapeless._

case class TestModel1(
  /*name1: String ,
  olim3: Long ,*/ test3: TestModel3)

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
  name4: String,
  key5: String,
  TagTagTag: Int,
  olim: Long,
  est1: TestModel1,
  test2: TestModel2)

class CirceEncoderTest extends FlatSpec
  with Matchers
  with EitherValues
  with ScalaFutures
  with BeforeAndAfterAll
  with BeforeAndAfter
  with CirceAsunaEncoderHelper with CirceAsunaDecoderHelper {

  lazy val local = new Locale("zh", "CN")
  lazy val faker = new Faker(local)

  "circe encoder" should "auto mapping case class with empty table" in {
    /*val test3 = TestModel3(faker.address.fullAddress, 461, TestModel1(faker.weather.description, 793, TestModel3(faker.address.fullAddress, 461, TestModel1(faker.weather.description, 793, null), null)), null)
    val test1 = TestModel1(faker.weather.description, 793, test3)
    val test2 = TestModel2(faker.book.title, 967)
    val model = TestModel(faker.name.name, faker.address.cityName, 123, 456L, test1, List(test2, test2, test2, test2, test2))*/

    val test2 = TestModel2(faker.book.title, 967)

    val circeEncoder1111 = asunaCirce.effect(toTargetWrap[EmptyCirceTable, TestModel2].laoinert.withShape.apply(EmptyCirceTable.value))

    println(circeEncoder1111)

    val jsonObject = circeEncoder1111.write(test2)

    println(Json.fromJsonObject(jsonObject).noSpaces)

    val circeDecoder1111 = asunaCirceDecoder.effect(toTargetWrapDecoder[EmptyCirceTable, TestModel2].laoinert.withShape.apply(EmptyCirceTable.value))

    println(circeDecoder1111.read(Json.fromJsonObject(jsonObject)).toString * 100)

  }

}