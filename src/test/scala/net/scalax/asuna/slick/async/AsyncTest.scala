package net.scalax.slick.async

import io.circe.{ Json, JsonObject }
import slick.jdbc.H2Profile.api._
import org.scalatest._
import org.scalatest.concurrent.ScalaFutures
import org.slf4j.LoggerFactory
import shapeless.HNil

import scala.concurrent.{ Await, Future, duration }

case class Friends(
  id: Option[Long] = None,
  name: String,
  nick: String,
  age: Int)

class FriendTable(tag: slick.lifted.Tag) extends Table[Friends](tag, "firend") {
  def id = column[Long]("id", O.AutoInc)
  def name = column[String]("name")
  def nick = column[String]("nick")
  def age = column[Int]("age")

  def * = (id.?, name, nick, age).mapTo[Friends]
}

class AsyncTest
  extends FlatSpec
  with Matchers
  with EitherValues
  with ScalaFutures
  with BeforeAndAfterAll
  with BeforeAndAfter {

  def await[A](f: Future[A]) = Await.result(f, duration.Duration.Inf)

  val logger = LoggerFactory.getLogger(getClass)

  val friendTq = TableQuery[FriendTable]

  val db = Database.forURL(
    s"jdbc:h2:mem:hfTest;DB_CLOSE_DELAY=-1",
    driver = "org.h2.Driver",
    keepAliveConnection = true)

  override def beforeAll = {
    await(db.run(friendTq.schema.create))
  }

  before {
    val friend1 = Friends(None, "喵", "汪", 23)
    val friend2 = Friends(None, "jilen", "kerr", 26)
    val friend3 = Friends(None, "小莎莎", "烟流", 20)
    await(db.run(friendTq ++= List(friend1, friend2, friend3)))
    friendTq.result
  }

  after {
    await(db.run(friendTq.delete))
  }

  "shape" should "auto filer with case class" in {
    object filterFriendTq extends TableQuery(cons => new SlickFilterTest(cons))
    val filterQuery = filterFriendTq.filter(t => t.filterCol.inputData(FilterParam(name = "jilen", age = 26)).getOrElse(LiteralColumn(Option(true))))

    logger.info(filterQuery.result.statements.toString)
    try {
      val friendQuery = filterQuery.result.head
      val r = await(db.run(friendQuery))
      r.copy(id = Option.empty) should be(Friends(None, "jilen", "kerr", 26))
    } catch {
      case e: Exception =>
        logger.error("error", e)
        throw e
    }
  }

  "shape" should "auto fileter with case class and jsonobject" in {
    val filterQuery = friendTq.filter(s => new SlickFilterJson(s).filterCol.inputData(FilterParam1(name = "小莎莎") ::
      JsonObject("age" -> Json.fromInt(20), "nick" -> Json.fromString("烟流")) ::
      HNil).getOrElse(LiteralColumn(Option(true))))

    logger.info(filterQuery.result.statements.toString)
    try {
      val friendQuery = filterQuery.result.head
      val r = await(db.run(friendQuery))
      r.copy(id = Option.empty) should be(Friends(None, "小莎莎", "烟流", 20))
    } catch {
      case e: Exception =>
        logger.error("error", e)
        throw e
    }
  }

}