package net.scalax.asuna.circe.test

import java.util.Locale

import com.github.javafaker.Faker
import io.circe.Encoder
import net.scalax.asuna.circe.{ CirceAsunaEncoderHelper, CirceTableEmptyObject }
import org.scalatest._
import org.scalatest.concurrent.ScalaFutures

class CirceEncoderTest extends FlatSpec
  with Matchers
  with EitherValues
  with ScalaFutures
  with BeforeAndAfterAll
  with BeforeAndAfter
  with CirceAsunaEncoderHelper {

  lazy val local = new Locale("zh", "CN")
  lazy val faker = new Faker(local)

  case class TestModel1(
    name: String,
    olim: Long)

  case class TestModel2(
    name: String,
    accdef: Int, test3: TestModel3)

  case class TestModel3(
    nickName: String,
    maxAge: Int)

  case class TestModel(
    name: String,
    key: String,
    TagTagTag: Int,
    olim: Long,
    test1: TestModel1,
    test2: TestModel2)

  object Abc

  "circe encoder" should "auto mapping case class with empty table" in {
    val test1 = TestModel1(faker.weather.description, 793)
    val test3 = TestModel3(faker.address.fullAddress, 461)
    val test2 = TestModel2(faker.book.title, 967, test3)
    val model = TestModel(faker.name.name, faker.address.cityName, 123, 456L, test1, test2)

    /*implicit val implicit1: Encoder[TestModel3] = {
      /*import io.circe.generic.auto._
      implicitly[Encoder[TestModel3]]*/
      ???
    }*/

    val circeEncoder = asunaCirce.effect(asunaCirce.caseOnly[CirceTableEmptyObject, TestModel].input(CirceTableEmptyObject.value))
    val jsonObject = circeEncoder.write(model)
    val circeEncodeResult = {
      import io.circe.syntax._
      import io.circe.generic.auto._
      model.asJsonObject
    }

    println(circeEncodeResult)
    println("1123" * 100 + jsonObject)

    jsonObject should be(circeEncodeResult)
  }

}