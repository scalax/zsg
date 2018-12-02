package aa.bb.cc

import java.util.Locale

import com.github.javafaker.Faker
import io.circe.{Decoder, Encoder}
import org.scalax.asuna.circe.CirceAsunaDecoderHelper
import org.scalax.asuna.implements.circe.abc.CirceHelper
import org.scalax.asuna.mapper.decoder.EmptyLazyModel
import org.scalatest.concurrent.ScalaFutures
import org.scalatest._

case class TestModel1(name1: String, olim3: Long, test3: Option[TestModel3])
case class TestModel2(name2: String, accdef: Int)
case class TestModel3(nickName: String, maxAge: Int, test1: TestModel1, test4: List[Option[TestModel4]])
case class TestModel4(age: Int, today: String, test3: TestModel3)
case class TestModel(name4: String, key5: String, TagTagTag: Int, olim: Long, est1: TestModel1, test2: List[TestModel2])

object Aa extends CirceHelper {
  object Gg

  object Cc {
    lazy val test3: Encoder[Option[TestModel3]] = implicitly
  }

  object Dd {
    lazy val test4: Encoder[List[Option[TestModel4]]] = {
      implicit val aa: Encoder[TestModel4] = circe.effect(circe.singleModel[TestModel4](Gg).compile).write
      implicitly
    }
  }

  implicit lazy val test3Implicit: Encoder[TestModel3] = circe.effect(circe.singleModel[TestModel3](Dd).compile).write
  implicit lazy val est1: Encoder[TestModel1]          = circe.effect(circe.singleModel[TestModel1](Cc).compile).write
  implicit val test2                                   = circe.effect(circe.singleModel[TestModel2](Gg).compile).write
  lazy val test: Encoder[TestModel]                    = circe.effect(circe.singleModel[TestModel](Gg).compile).write
}

class CirceEncoderTest
    extends FlatSpec
    with Matchers
    with EitherValues
    with ScalaFutures
    with BeforeAndAfterAll
    with BeforeAndAfter
    with CirceAsunaDecoderHelper {

  lazy val local = new Locale("zh", "CN")
  lazy val faker = new Faker(local)

  object AA

  case class InputTest1111[R](id: R)
  case class Model1111[R](id: R, name: String, age: Int)
  trait LazyInput1111 {
    def apply[R](preModel: InputTest1111[R]): Model1111[R]
    val sub: EmptyLazyModel
  }

  val aa: Decoder[LazyInput1111] =
    asunaCirceDecoder.effect(asunaCirceDecoder.lazyModel[LazyInput1111](AA).compile).decoder

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
    val test2 = TestModel2(faker.book.title, 967)
    val provideJson = {
      import io.circe.generic.auto._
      val encoder = implicitly[Encoder[TestModel]]
      encoder(model)
    }

    val asunaJson = Aa.test(model)

    //println(asunaJson.noSpaces)
    provideJson should be(asunaJson)
  }

  "circe decoder gen by asuna" should "auto decode simple case class" in {
    val test2 = TestModel2(faker.book.title, 967)
    val provideJson = {
      import io.circe.generic.auto._
      val encoder = implicitly[Encoder[TestModel2]]
      encoder(test2)
    }

    val circeDecoder = asunaCirceDecoder.effect(asunaCirceDecoder.singleModel[TestModel2](EmptyLazyModel.value).compile)
    circeDecoder.read(provideJson) should be(Right(test2))
  }

}
