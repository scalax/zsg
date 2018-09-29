package aa.bb.cc

import java.util.Locale

import com.github.javafaker.Faker
import io.circe.Encoder
import net.scalax.asuna.circe.{CirceAsunaDecoderHelper, EmptyCirceTable, JsonEncoderHelper}
import org.scalatest.concurrent.ScalaFutures
import org.scalatest._

case class TestModel1(name1: String, olim3: Long, test3: Option[TestModel3])

case class TestModel2(name2: String, accdef: Int)

case class TestModel3(nickName: String, maxAge: Int, test1: TestModel1, test4: List[Option[TestModel4]])

case class TestModel4(age: Int, today: String, test3: TestModel3)

case class TestModel(name4: String, key5: String, TagTagTag: Int, olim: Long, est1: TestModel1, test2: List[TestModel2])

class CirceEncoderTest
    extends FlatSpec
    with Matchers
    with EitherValues
    with ScalaFutures
    with BeforeAndAfterAll
    with BeforeAndAfter
    //with CirceAsunaEncoderHelper
    with CirceAsunaDecoderHelper {

  lazy val local = new Locale("zh", "CN")
  lazy val faker = new Faker(local)

  val test3 = TestModel3(
      faker.address.fullAddress
    , 461
    , TestModel1(
        faker.weather.description
      , 793
      , Option(TestModel3(faker.address.fullAddress, 461, TestModel1(faker.weather.description, 793, Option.empty), List.empty))
    )
    , List.empty
  )
  val test1 = TestModel1(faker.weather.description, 793, Option(test3))
  val test2 = TestModel2(faker.book.title, 967)
  val model = TestModel(faker.name.name, faker.address.cityName, 123, 456L, test1, List(test2, test2, test2, test2, test2, test2))

  "circe encoder" should "auto mapping case class with empty table" in {}

  "circe encoder gen by asuna" should "auto encoder simple case class" in {
    //val test2 = TestModel2(faker.book.title, 967)
    //val circeEncoder = asunaCirce.effect(asunaCirce.singleModel[TestModel2](EmptyCirceTable.value).compile)
    val provideJson = {
      import io.circe.generic.auto._
      val encoder = implicitly[Encoder[TestModel]]
      encoder(model)
    }

    val asunaJson = JsonEncoderHelper.toJson(model)

    provideJson should be(asunaJson)
  }

  "circe decoder gen by asuna" should "auto decode simple case class" in {
    val test2 = TestModel2(faker.book.title, 967)
    val provideJson = {
      import io.circe.generic.auto._
      val encoder = implicitly[Encoder[TestModel2]]
      encoder(test2)
    }

    val circeDecoder = asunaCirceDecoder.effect(asunaCirceDecoder.singleModel[TestModel2](EmptyCirceTable.value).compile)
    circeDecoder.read(provideJson) should be(Right(test2))
  }

}
