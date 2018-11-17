package aa.bb.cc

import java.util.Locale

import com.github.javafaker.Faker
import io.circe.{Decoder, DecodingFailure, Encoder}
import net.scalax.asuna.circe.CirceAsunaDecoderHelper
import net.scalax.asuna.implements.circe.abc.CirceHelper
import net.scalax.asuna.mapper.decoder.EmptyLazyModel
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

  case class InputTest[T](id: T) {
    type MType = Model[T]
  }
  case class Model[T](id: T, name: String, age: Int)
  trait Wrap {
    type IdType
    def model(f: InputTest[IdType]): f.MType
  }

  trait Wrap1111 {
    def model[IdType](f: InputTest[IdType]): Model[IdType]
  }

  trait Abc {
    type IdType1 <: Def#IdType2
  }

  trait Def {
    type IdType2
  }

  object AA

  val aa: Decoder[InputTest[Wrap#IdType] => Model[Wrap#IdType]] =
    asunaCirceDecoder.effect(asunaCirceDecoder.lazyModel[InputTest[Wrap#IdType], InputTest[Wrap#IdType]#MType, EmptyLazyModel](AA).compile).decoder.map(s => s)

  val jyukuil: Decoder[Wrap1111] = {
    val ngkrtnohntohjnty: Decoder[InputTest[Abc#IdType1] => Model[Def#IdType2]] = asunaCirceDecoder
      .effect(asunaCirceDecoder.lazyModel[InputTest[Abc#IdType1], InputTest[Def#IdType2]#MType, EmptyLazyModel](AA).compile)
      .decoder
      .map(s => s)

    Decoder.decodeJson.emap { j =>
      val tjyhmhjkm: InputTest[Abc#IdType1] => Model[Def#IdType2] = j.as(ngkrtnohntohjnty).right.get

      Right(new Wrap1111 {
        override def model[IdType](r: InputTest[IdType]): Model[IdType] = {
          //j.as(asunaCirceDecoder.effect(asunaCirceDecoder.debugLazyModel[r.type, r.MType, EmptyLazyModel](AA).compile).decoder.map(s => s)).right.get.apply(r)
          ???
        }
      })
    }
  }

  implicit def mrekjiotjo[T](implicit mtonortn: Decoder[T]): Decoder[Model[T]] = {
    trait mojoijno extends Wrap {
      override type IdType = T
    }

    Decoder.decodeJson.emap { j =>
      val bb: InputTest[Wrap#IdType] => InputTest[Wrap#IdType]#MType = j.as(aa).right.get
      val cc: mojoijno#IdType                                        = j.as(mtonortn).right.get
      def dd[R <: Wrap](sdfgerg: R#IdType)                           = bb(InputTest(sdfgerg))

      dd[mojoijno](cc)

      Right(new Wrap {
        override type IdType = T
        override def model(r: InputTest[IdType]): Model[IdType] = {
          bb(InputTest(r.id: Wrap#IdType))
          ???
        }
      }.model(InputTest(cc)))
    }
  }

  /*object TestModel2Helper

  object TestModel1Helper {
    lazy val test3: Encoder[Option[TestModel3]] = optionEncoder(circe.singleModel[TestModel3](TestModel3Helper).compile)
  }

  object TestModel3Helper {
    lazy val test1 = commonEncoder(circe.singleModel[TestModel1](TestModel1Helper).compile)
    lazy val test4: Encoder[List[Option[TestModel4]]] = {
      implicit val test100 = circe.effect(circe.singleModel[TestModel4](TestModel4Helper).compile).write
      implicitly
    }
  }

  object TestModel4Helper {
    lazy val test3 = commonEncoder(circe.singleModel[TestModel3](TestModel3Helper).compile)
  }

  object TestModelHelper {
    lazy val test2 = listEncoder(circe.singleModel[TestModel2](TestModel2Helper).compile)
    lazy val est1  = commonEncoder(circe.singleModel[TestModel1](TestModel1Helper).compile)
  }

  val asunaEncoder: Encoder[TestModel] = commonEncoder(circe.singleModel[TestModel](TestModelHelper).compile)*/

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
