package net.scalax.asuna.slick.sortBy

import java.util.Locale

import com.github.javafaker.Faker
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

  override def beforeAll: Unit = {
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

  "shape" should "auto sort by with case class" in {
    val sortByFriendTq = TableQuery[SlickSrotByTest]

    val param1       = List(("extColumn", "desc"))
    val sortByQuery1 = sortByFriendTq.sortBy(t => t.sortByCols.inputParam(param1))
    sortByQuery1.result.statements.toList should be(sortByFriendTq.sortBy(s => (s.id.desc, s.nick.desc)).result.statements.toList)
    val friendQuery1 = sortByQuery1.to[List].result
    val list         = await(db.run(friendQuery1))
    list.size should be(3)
    list.foreach { item =>
      item.getClass should be(classOf[Friends])
    }
  }

  it should "auto sort by with mutiply columns(include Tuple property)" in {
    val sortByFriendTq = TableQuery[SlickSrotByTest]

    val param2       = List(("nick", "desc"), ("extColumn", "desc"), ("id", "asc"))
    val sortByQuery2 = sortByFriendTq.sortBy(t => t.sortByCols.inputParam(param2))
    sortByQuery2.result.statements.toList should be(sortByFriendTq.sortBy(_.nick.desc).sortBy(s => (s.id.desc, s.nick.desc)).sortBy(_.id.asc).result.statements.toList)
    val friendQuery2 = sortByQuery2.to[List].result
    val list         = await(db.run(friendQuery2))
    list.size should be(3)
    list.foreach { item =>
      item.getClass should be(classOf[Friends])
    }
  }

  it should "auto sort by with safe parameters" in {
    val sortByFriendTq = TableQuery[SlickSrotByTest]

    val param3       = List(("test UTF-8 喵喵酱", "desc"), ("nick", "desc"), ("lkeindkte", "asc"), ("extColumn", "length"), ("id", "asc"), ("age", "desc"))
    val sortByQuery3 = sortByFriendTq.sortBy(t => t.sortByCols.inputParam(param3))
    sortByQuery3.result.statements.toList should be(sortByFriendTq.sortBy(_.nick.desc).sortBy(_.id.asc).result.statements.toList)
    val friendQuery3 = sortByQuery3.to[List].result
    val list         = await(db.run(friendQuery3))
    list.size should be(3)
    list.foreach { item =>
      item.getClass should be(classOf[Friends])
    }
  }

  it should "auto sort by with mutiply columns" in {
    val sortByFriendTq = TableQuery[SlickSrotByTest]

    val param2       = List(("nick", "desc"), ("id", "asc"))
    val sortByQuery2 = sortByFriendTq.sortBy(t => t.sortByCols.inputParam(param2))
    sortByQuery2.result.statements.toList should be(sortByFriendTq.sortBy(_.nick.desc).sortBy(_.id.asc).result.statements.toList)
    val friendQuery2 = sortByQuery2.to[List].result
    val list         = await(db.run(friendQuery2))
    list.size should be(3)
    list.foreach { item =>
      item.getClass should be(classOf[Friends])
    }
  }
}
