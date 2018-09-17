package net.scalax.asuna.slick.filter

import java.util.Locale

import com.github.javafaker.Faker
import io.circe.{Json, JsonObject}
import slick.jdbc.H2Profile.api._
import org.scalatest._
import org.scalatest.concurrent.ScalaFutures
import org.slf4j.LoggerFactory

import scala.concurrent.{duration, Await, Future}

class TestCase1 extends FlatSpec with Matchers with EitherValues with ScalaFutures with BeforeAndAfterAll with BeforeAndAfter {

  def await[A](f: Future[A]) = Await.result(f, duration.Duration.Inf)

  val logger = LoggerFactory.getLogger(getClass)

  val local = new Locale("zh", "CN")
  val faker = new Faker(local)

  val friendTq = TableQuery[FriendTable]

  val db = Database.forURL(s"jdbc:h2:mem:hfTest;DB_CLOSE_DELAY=-1", driver = "org.h2.Driver", keepAliveConnection = true)

  override def beforeAll = {
    await(db.run(friendTq.schema.create))
  }

  before {
    val friend1 = Friends(None, faker.name.name, faker.weather.description, 23)
    val friend2 = Friends(None, faker.name.name, faker.weather.description, 26)
    val friend3 = Friends(None, faker.name.name, faker.weather.description, 20)
    await(db.run(friendTq ++= List(friend1, friend2, friend3)))
    friendTq.result
  }

  after {
    await(db.run(friendTq.delete))
  }

  "shape" should "auto filer with case class" in {
    val filterQuery = friendTq.filter(t => new SlickFilterTest(t).filterCol.inputData(FilterParam(name = "jilen", age = 26)).getOrElse(LiteralColumn(Option(true))))

    filterQuery.result.statements.toList should be(friendTq.filter(s => (s.name === "jilen") && (s.age === 26)).result.statements.toList)

    try {
      val friendQuery = filterQuery.result.headOption
      val r           = await(db.run(friendQuery))
      r.map(s => s.copy(id = Option.empty) should be(Friends(None, "jilen", "kerr", 26)))
    } catch {
      case e: Exception =>
        logger.error("error", e)
        throw e
    }
  }

  "shape" should "auto fileter with case class and jsonobject" in {
    val filterQuery = friendTq.filter(
        s =>
        new SlickFilterJson(s).filterCol
          .inputData(FilterParam2(FilterParam1(name = "小莎莎"), json = JsonObject("age" -> Json.fromInt(20), "nick" -> Json.fromString("烟流"))))
          .getOrElse(LiteralColumn(Option(true)))
    )

    filterQuery.result.statements.toList should be(friendTq.filter(s => (s.name === "小莎莎") && (s.nick === "烟流") && (s.age === 20)).result.statements.toList)

    try {
      val friendQuery = filterQuery.result.headOption
      val r           = await(db.run(friendQuery))
      r.map(s => s.copy(id = Option.empty) should be(Friends(None, "小莎莎", "烟流", 20)))
    } catch {
      case e: Exception =>
        logger.error("error", e)
        throw e
    }
  }

}
