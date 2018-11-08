package net.scalax.asuna.slick.simple

import java.util.Locale

import com.github.javafaker.Faker
import net.scalax.asuna.mapper.decoder.LazyModel
import slick.jdbc.H2Profile.api._
import org.scalatest._
import org.scalatest.concurrent.ScalaFutures
import org.slf4j.LoggerFactory

import scala.concurrent.{duration, Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global

case class Friends2(id: Long, name: String, nick: String, age: Int)
case class Friends3(id1111: Long, name1111: String, nick1111: String, age1111: Int)

class FriendTable2(tag: slick.lifted.Tag) extends Table[Friends2](tag, "firend2") {
  def id   = column[Long]("id", O.AutoInc)
  def name = column[String]("name")
  def nick = column[String]("nick")
  def age  = column[Int]("age")

  def * = (id, name, nick, age).mapTo[Friends2]
}

case class Mark(id: Long, name: String, mark: Int, friendId: Long)

class MarkTable(tag: slick.lifted.Tag) extends Table[Mark](tag, "mark") {
  def id       = column[Long]("id", O.AutoInc)
  def name     = column[String]("name")
  def mark     = column[Int]("mark")
  def friendId = column[Long]("friend_id")

  def * = (id, name, mark, friendId).mapTo[Mark]
}

class DynModel extends FlatSpec with Matchers with EitherValues with ScalaFutures with BeforeAndAfterAll with BeforeAndAfter {

  val local = new Locale("zh", "CN")
  val faker = new Faker(local)

  def await[A](f: Future[A]) = Await.result(f, duration.Duration.Inf)

  val logger = LoggerFactory.getLogger(getClass)

  val friendTq2 = TableQuery[FriendTable2]
  val markTq    = TableQuery[MarkTable]

  val db = Database.forURL(s"jdbc:h2:mem:hfTest;DB_CLOSE_DELAY=-1", driver = "org.h2.Driver", keepAliveConnection = true)

  override def beforeAll = {
    await(db.run((markTq.schema ++ friendTq2.schema).create))
  }

  before {
    val friend1 = Friends2(-1, faker.name.name, faker.weather.description, 23)
    val friend2 = Friends2(-1, faker.name.name, faker.weather.description, 26)
    val friend3 = Friends2(-1, faker.name.name, faker.weather.description, 20)

    val insert = friendTq2.returning(friendTq2.map(_.id)).into((friend, id) => friend.copy(id = id))

    val friend1DBIO = insert += friend1
    val friend2DBIO = insert += friend2
    val friend3DBIO = insert += friend3

    await(db.run(DBIO.sequence(List(friend1DBIO, friend2DBIO, friend3DBIO))))
    val result = await(db.run(friendTq2.result))

    var i = 36
    var j = 2
    val mark = result.map(_.id).map { id =>
      val subList = for (_ <- 0 until j) yield {
        Mark(id = -1, name = faker.address.cityName, mark = { i += 10; i }, friendId = id)
      }
      j += 1
      subList
    }
    await(db.run(markTq ++= mark.flatten.toList))
  }

  after {
    await(db.run(friendTq2.delete))
  }

  "shape" should "auto filer with case class" in {
    val prepareData: Future[Seq[LazyModel[InnerFriendInput, InnerFriends2, InnerFriendOutput]]] =
      db.run(friendTq2.map(s => new FriendTable2Model(s).reader).result)
    def fetchSub(friendId: Long): Future[Seq[InnerMark]] = db.run(markTq.filter(_.friendId === friendId).map(s => new MarkTableModel(s).reader).result)
    try {
      val r: Future[Seq[InnerFriends2]] = prepareData.flatMap { t =>
        val lf = t.map(l => fetchSub(l.sub.id).map(u => l(InnerFriendInput(u.toList))))
        Future.sequence(lf)
      }
      val d = await(r)
      //println(d)
    } catch {
      case e: Exception =>
        logger.error("error", e)
        throw e
    }
  }

  it should "auto encode with FriendTable4Model" in {
    val prepareData6 = FriendTable4Model.map(s => new dfjgoshjiotherihte(s).reader1111).result
    val prepareData7 = FriendTable4Model.map(_.reader7).result
    prepareData6.statements.toList should be(FriendTable4Model.map(s => (s.id, s.nick)).result.statements.toList)
    prepareData7.statements.toList should be(FriendTable4Model.map(s => (s.age, s.id)).result.statements.toList)
    try {
      val d6 = await(db.run(prepareData6))
      //println(d6.asJson.spaces2)
      val d7 = await(db.run(prepareData7))
      //println(d7.asJson.spaces2)
    } catch {
      case e: Exception =>
        logger.error("error", e)
        throw e
    }
  }

  it should "aotu create with macro" in {
    val prepareData = db.run(friendTq2.map(s => new FriendTable3Model(s).reader).result)
    try {
      val d = await(prepareData)
      //println(d.asJson.spaces2)
    } catch {
      case e: Exception =>
        logger.error("error", e)
        throw e
    }
  }

  it should "dynamic filter columns and output to JsonObject" in {
    val cols        = List("id", "nick", "name")
    val autalCols   = List("id", "name")
    val tq          = DynFriendModelTq(cols)
    val prepareData = tq.map(_.reader8)
    prepareData.result.statements.toList should be(friendTq2.map(s => (s.age, s.name, s.id)).result.statements.toList)
    val d = await(db.run(prepareData.result))
    d.size should be(3)
    d.foreach { item =>
      item.getClass should be(classOf[Friends8])
      item.dyn.toMap.keys.toSet should be(autalCols.toSet)
    }
  }

}
