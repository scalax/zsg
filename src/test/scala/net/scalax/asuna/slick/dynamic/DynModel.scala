package net.scalax.slick.async

import io.circe.{ Json, JsonObject }
import io.circe.syntax._
import net.scalax.slick.dynamic.{ FilterParam3, FriendTable2Model }
import net.scalax.umr.UmrReaderQueryHelper

import scala.language.higherKinds
import slick.jdbc.H2Profile.api._
import org.scalatest._
import org.scalatest.concurrent.ScalaFutures
import org.slf4j.LoggerFactory
import shapeless._

import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{ Failure, Success }

case class Friends2(
  id: Option[Long] = None,
  name: String,
  nick: String,
  age: Int)

class FriendTable2(tag: slick.lifted.Tag) extends Table[Friends2](tag, "firend2") {
  def id = column[Long]("id", O.AutoInc)
  def name = column[String]("name")
  def nick = column[String]("nick")
  def age = column[Int]("age")

  def * = (id.?, name, nick, age).mapTo[Friends2]
}

class DynModel
  extends FlatSpec
  with Matchers
  with EitherValues
  with ScalaFutures
  with BeforeAndAfterAll
  with BeforeAndAfter with UmrReaderQueryHelper {

  val t = 10.seconds
  override implicit val patienceConfig = PatienceConfig(timeout = t)
  val logger = LoggerFactory.getLogger(getClass)

  val friendTq2 = TableQuery[FriendTable2]

  val db = Database.forURL(
    s"jdbc:h2:mem:hfTest;DB_CLOSE_DELAY=-1",
    driver = "org.h2.Driver",
    keepAliveConnection = true)

  override def beforeAll = {
    db.run(friendTq2.schema.create).futureValue
  }

  before {
    val friend1 = Friends2(None, "喵", "汪", 23)
    val friend2 = Friends2(None, "jilen", "kerr", 26)
    val friend3 = Friends2(None, "小莎莎", "烟流", 20)
    db.run(friendTq2 ++= List(friend1, friend2, friend3)).futureValue
    friendTq2.result
  }

  after {
    db.run(friendTq2.delete).futureValue
  }

  "shape" should "aotu filer with case class" in {
    val query = friendTq2.map(s => tranRep(new FriendTable2Model(s)))
    logger.info(query.result.statements.toString)
    try {
      val friendQuery = query.result.head
      val r = db.run(friendQuery).futureValue
      r should be(FilterParam3(name = "喵", age = 23, ext = Map("nickName" -> "汪".asJson, "id" -> 1.asJson)))
    } catch {
      case e: Exception =>
        logger.error("error", e)
        throw e
    }
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