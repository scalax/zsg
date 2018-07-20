package net.scalax.asuna.circe.test

import java.util.Locale

import com.github.javafaker.Faker
import net.scalax.asuna.circe.CirceAsunaEncoderHelper
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

  case class TestModel(
    name: String,
    key: String,
    TagTagTag: Int,
    olim: Long)

  object Abc

  "circe encoder" should "auto mapping case class with empty table" in {
    val model = TestModel(faker.name.name, faker.address.cityName, 123, 456L)
    val circeEncoder = asunaCirce.effect(asunaCirce.caseOnly[Abc.type, TestModel](Abc))
    val jsonObject = circeEncoder.write(model)
    val circeEncodeResult = {
      import io.circe.syntax._
      import io.circe.generic.auto._
      model.asJsonObject
    }
    jsonObject should be(circeEncodeResult)
  }

}