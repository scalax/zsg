package aa.bb.cc

import java.util.Locale

import com.github.javafaker.Faker
import net.scalax.asuna.circe.another.CirceEncoderConfirmOrder
import net.scalax.asuna.circe.{ CirceAsunaEncoderHelper, EmptyCirceTable }
import org.scalatest._
import org.scalatest.concurrent.ScalaFutures

case class TestModel1(
  name: String,
  olim: Long, test3: TestModel3)

case class TestModel2(
  name: String,
  accdef: Int)

case class TestModel3(
  nickName: String,
  maxAge: Int, test1: TestModel1)

case class TestModel(
  name: String,
  key: String,
  TagTagTag: Int,
  olim: Long,
  test1: TestModel1,
  test2: TestModel2)

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
    val test3 = TestModel3(faker.address.fullAddress, 461, ???)
    val test1 = TestModel1(faker.weather.description, 793, test3)

    val test2 = TestModel2(faker.book.title, 967)
    val model = TestModel(faker.name.name, faker.address.cityName, 123, 456L, test1, test2)

    /*implicit val implicit1 = {
      import io.circe.generic.auto._
      implicitly[Encoder[TestModel3]]
    }*/

    import io.circe.syntax._

    implicitly[CirceEncoderConfirmOrder[TestModel1]]

    val circeEncoder = asunaCirce.effect(asunaCirce.caseOnly[EmptyCirceTable, TestModel1].input(EmptyCirceTable.value))

    val jsonObject = circeEncoder.write(test1)

    val circeEncodeResult = {
      import io.circe.generic.auto._
      model.asJsonObject
    }

    println("11" * 100)
    println(jsonObject.asJson.spaces2)
    jsonObject should be(circeEncodeResult)
  }

}