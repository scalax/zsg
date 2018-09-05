package net.scalax.slick.async

import java.util.Locale

import com.github.javafaker.Faker
import io.circe.syntax._
import net.scalax.slick.dynamic.{ FilterParam3, FriendTable2Model }
import slick.jdbc.H2Profile.api._
import org.scalatest._
import org.scalatest.concurrent.ScalaFutures
import org.slf4j.LoggerFactory

import scala.concurrent.{ Await, Future, duration }

case class Friends2(
  id: Long,
  name: String,
  nick: String,
  age: Int)

class FriendTable2(tag: slick.lifted.Tag) extends Table[Friends2](tag, "firend2") {
  def id = column[Long]("id", O.AutoInc)
  def name = column[String]("name")
  def nick = column[String]("nick")
  def age = column[Int]("age")

  def * = (id, name, nick, age).mapTo[Friends2]
}

class DynModel
  extends FlatSpec
  with Matchers
  with EitherValues
  with ScalaFutures
  with BeforeAndAfterAll
  with BeforeAndAfter {

  val local = new Locale("zh", "CN")
  val faker = new Faker(local)

  def await[A](f: Future[A]) = Await.result(f, duration.Duration.Inf)

  val logger = LoggerFactory.getLogger(getClass)

  val friendTq2 = TableQuery[FriendTable2]

  val db = Database.forURL(
    s"jdbc:h2:mem:testDB01;DB_CLOSE_DELAY=-1",
    driver = "org.h2.Driver",
    keepAliveConnection = true)

  override def beforeAll = {
    await(db.run(friendTq2.schema.create))
  }

  val friend1 = Friends2(-1, faker.name.name, faker.weather.description, 23)
  val friend2 = Friends2(-1, faker.name.name, faker.weather.description, 26)
  val friend3 = Friends2(-1, faker.name.name, faker.weather.description, 20)

  before {
    await(db.run(friendTq2 ++= List(friend1, friend2, friend3)))
    friendTq2.result
  }

  after {
    await(db.run(friendTq2.delete))
  }

  "shape" should "aotu filer with case class" in {
    val query = friendTq2.map(s => new FriendTable2Model(s).umrSv.toSv)
    query.result.statements should be(friendTq2.map(s => (s.name, s.age, s.id, s.nick)).result.statements)
    val friendQuery = query.result
    val r = await(db.run(friendQuery))
    r.toList should be(List(
      FilterParam3(name = friend1.name, age = friend1.age, ext = Map("nickName" -> friend1.nick.asJson, "id" -> r(0).ext.get("id").get)),
      FilterParam3(name = friend2.name, age = friend2.age, ext = Map("nickName" -> friend2.nick.asJson, "id" -> r(1).ext.get("id").get)),
      FilterParam3(name = friend3.name, age = friend3.age, ext = Map("nickName" -> friend3.nick.asJson, "id" -> r(2).ext.get("id").get))))
  }

  "shape" should "auto fileter with case class and jsonobject" in {
    /*val query = SlickWriterQuery.tranQuery(friendTq)(s => new SlickFilterJson(s))(
      FilterParam1(name = "小莎莎") ::
        JsonObject("age" -> Json.fromInt(20), "nick" -> Json.fromString("烟流")) ::
        HNil)

    logger.info(query.result.statements.toString)
    try {
      val friendQuery = query.result.head
      val r = db.run(friendQuery).futureValue
      r.copy(id = Option.empty) should be(Friends(None, "小莎莎", "烟流", 20))
    } catch {
      case e: Exception =>
        logger.error("error", e)
        throw e
    }*/
  }

}