package aa.bb.cc

import java.util.Locale

import com.github.javafaker.Faker
import net.scalax.asuna.circe.{ CirceAsunaEncoderHelper, EmptyCirceTable }
import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.helper.MacroColumnInfoImpl
import org.scalatest.concurrent.ScalaFutures
import org.scalatest._

case class TestModel1(
  name1: String,
  olim3: Long, test3: TestModel3)

case class TestModel2(
  name2: String,
  accdef: Int)

case class TestModel3(
  nickName: String,
  maxAge: Int, test16: TestModel1)

case class TestModel(
  name4: String,
  key5: String,
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

  /*
  testModel
  -> shapeEncoderImplicit[TestModel]
  test1
  -> shapeEncoderImplicit[TestModel1]
  test3
  -> shapeEncoderImplicit[TestModel3]
  test1
  -> shapeEncoderImplicit[TestModel1]
   */

  lazy val local = new Locale("zh", "CN")
  lazy val faker = new Faker(local)

  "circe encoder" should "auto mapping case class with empty table" in {
    val test3 = TestModel3(faker.address.fullAddress, 461, TestModel1(faker.weather.description, 793, TestModel3(faker.address.fullAddress, 461, TestModel1(faker.weather.description, 793, null))))
    val test1 = TestModel1(faker.weather.description, 793, test3)

    val test2 = TestModel2(faker.book.title, 967)

    val model = TestModel(faker.name.name, faker.address.cityName, 123, 456L, test1, test2)

    val circeEncoder11111111 = asunaCirce.effect(asunaCirce.caseOnly[EmptyCirceTable, TestModel].input(EmptyCirceTable.value))

    /*implicit val implicit1 = {
      import io.circe.generic.auto._
      implicitly[Encoder[TestModel3]]
    }

    import io.circe.syntax._

    implicitly[CirceEncoderConfirmOrder[TestModel1]]*/

    val jsonObject = circeEncoder11111111.write(model)

    /*val circeEncodeResult = {
      import io.circe.generic.auto._
      model.asJsonObject
    }*/

    println("11" * 100)
    println(jsonObject)
    /*println(jsonObject.asJson.spaces2)
    jsonObject should be(circeEncodeResult)*/
  }
  /*trait kfike[Poly] {
    type Out
    val out: Out
  }

  object kfike {
    type Aux[P, T] = kfike[P] { type Out = T }
    type Aux2[P] = kfike[P]
  }

  object sdfjsofjweifj extends sdfjsejfweohjrfjihjwerhwerh {
    implicit def sfejrwewurhw: kfike.Aux[sdfjsofjweifj.type, String] = new kfike[sdfjsofjweifj.type] {
      override type Out = String
      override val out = "sdfrertert"
    }
  }

  trait sdfjsejfweohjrfjihjwerhwerh {
    implicit def sdfwsegsrtrstr: kfike.Aux[sdfjsofjweifj.type, Int] = new kfike[sdfjsofjweifj.type] {
      override type Out = Int
      override val out = 33453
    }
  }

    def sfsfsfsf[A](implicit sfserr: kfike.Aux2[A]): sfserr.Out = sfserr.out

    println("aaaa" * 100)
    //println(sfsfsfsf[sdfjsofjweifj.type])

    def sokfjawoerhjawr[T, D](dfas: T)(implicit sfjfwshtfwe: efabc[T, D]): D = sfjfwshtfwe.out

    println(sokfjawoerhjawr("sdfsdrerse"))


  trait efabc[In, Out] {
    val out: Out
  }

  object efabc extends sdfjsdofhefghseruighteurisgtgbreui {
    implicit def lewrhguilerhguiergbhtgrbsetiges(implicit sdfwserf: TestModel1): efabc[String, Int] = new efabc[String, Int] {
      override val out: Int = 2333
    }
  }

  trait sdfjsdofhefghseruighteurisgtgbreui extends asgerstyreydrtyhrtdhurtyujht {
    implicit def vargfdsgsdfgbvsertsrtg(implicit sdfwserf: TestModel1): efabc[String, String] = new efabc[String, String] {
      override val out: String = "sdfdstgrestsert"
    }
  }

  trait asgerstyreydrtyhrtdhurtyujht {
    implicit def awrtfsertgsertgsedrtesrtfaer: efabc[String, TestModel2] = new efabc[String, TestModel2] {
      override val out: TestModel2 = TestModel2("dfsdfgsertert", 4564)
    }
  }*/
}