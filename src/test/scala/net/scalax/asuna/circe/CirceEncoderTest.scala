package aa.bb.cc

import java.util.Locale

import com.github.javafaker.Faker
import io.circe.{ Encoder, Json }
import net.scalax.asuna.circe.{ CirceAsunaDecoderHelper, CirceAsunaEncoderHelper, EmptyCirceTable }
import org.scalatest.concurrent.ScalaFutures
import org.scalatest._

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
  }

  "circe encoder gen by asuna" should "auto encoder simple case class" in {
    val test2 = TestModel2(faker.book.title, 967)
    val circeEncoder = asunaCirce.effect(asunaCirce.caseOnly[EmptyCirceTable, TestModel2].compileEncoder2222.inputTable(EmptyCirceTable.value))
    val provideJson = {
      import io.circe.generic.auto._
      val encoder = implicitly[Encoder[TestModel2]]
      encoder(test2)
    }

    val asunaJson = circeEncoder.write(test2)
    provideJson should be(Json.fromJsonObject(asunaJson))
  }

  "circe decoder gen by asuna" should "auto decode simple case class" in {
    val test2 = TestModel2(faker.book.title, 967)
    val provideJson = {
      import io.circe.generic.auto._
      val encoder = implicitly[Encoder[TestModel2]]
      encoder(test2)
    }

    val circeDecoder = asunaCirceDecoder.effect(asunaCirceDecoder.caseOnly[EmptyCirceTable, TestModel2].compileDecoder2222.inputTable(EmptyCirceTable.value))
    circeDecoder.read(provideJson) should be(Right(test2))
  }

}