package net.scalax.slick.dynamic

import io.circe.Json
import io.circe.generic.auto._
import net.scalax.asuna.sangria.{SlickSangriaHelper, SlickValueGen}
import org.scalatest.concurrent.ScalaFutures
import org.scalatest._
import sangria.parser.QueryParser

import scala.concurrent.{duration, Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import slick.jdbc.H2Profile.api._

case class Friends4(id: Long, name: String, nick: String, age: Int)

class FriendTable4(tag: slick.lifted.Tag) extends Table[Friends4](tag, "firend4") {
  def id   = column[Long]("id", O.AutoInc)
  def name = column[String]("name")
  def nick = column[String]("nick")
  def age  = column[Int]("age")

  def * = (id, name, nick, age).mapTo[Friends4]
}

case class FriendWrap(age: Int, repOut: SlickValueGen[FriendTable4], extAge: Int)

trait SFriend4 extends SlickSangriaHelper[FriendTable4] {
  self =>

  def id     = repWithKey(_.id, "id")
  def name   = repWithKey(_.name, "name")
  def nick   = repWithKey(_.nick, "nick")
  def age    = rep(_.age)
  def extAge = rep(_.age)
  def repOut = seqRep(id, name, nick)

  lazy val shape  = sangria.caseOnly[SFriend4, FriendWrap].compile
  lazy val reader = sangria.effect(shape.inputTable(self))

}

object SFriend4 extends SFriend4

class SangriaTest extends FlatSpec with Matchers with EitherValues with ScalaFutures with BeforeAndAfterAll with BeforeAndAfter {

  import sangria.execution._
  import sangria.marshalling.circe._
  import sangria.schema._

  import com.github.javafaker.Faker
  import java.util.Locale

  def await[A](f: Future[A]) = Await.result(f, duration.Duration.Inf)

  val local     = new Locale("zh", "CN")
  val faker     = new Faker(local)
  val specName1 = faker.name.fullName

  val friendTq4 = TableQuery[FriendTable4]

  val db = Database.forURL(s"jdbc:h2:mem:hfTest;DB_CLOSE_DELAY=-1", driver = "org.h2.Driver", keepAliveConnection = true)

  override def beforeAll = {
    await(db.run(friendTq4.schema.create))
  }

  override def afterAll = {
    await(db.run(friendTq4.schema.drop))
  }

  before {
    val friend1 = Friends4(-1, specName1, faker.name.username, 23)
    val friend2 = Friends4(-1, faker.name.fullName, faker.name.username, 26)
    val friend3 = Friends4(-1, faker.name.fullName, faker.name.username, 20)
    await(db.run(friendTq4 ++= List(friend1, friend2, friend3)))
  }

  after {
    await(db.run(friendTq4.delete))
  }

  case class Picture(width: Int, height: Int, url: Option[String])

  implicit lazy val PictureType = ObjectType(
      "Picture"
    , "The product picture"
    , fields[Unit, Picture](
        Field("width", IntType, resolve = _.value.width)
      , Field("height", IntType, resolve = _.value.height)
      , Field("url", OptionType(StringType), description = Some("Picture CDN URL"), resolve = _.value.url)
    )
  )

  lazy val NameArg = Argument("name", StringType)

  lazy val QueryType = ObjectType(
      "Query"
    , fields[Unit, Unit](
        Field(
          "product"
        , OptionType(ProductType)
        , description = Some("Returns a product with specific `id`.")
        , arguments = NameArg :: Nil
        , resolve = Projector({ (c, fields) =>
          val bindQ  = friendTq4.filter(s => s.name === c.arg(NameArg)).map(friend => SFriend4.reader.inputTable(friend).filterNames(fields.toList.map(_.name)))
          val action = bindQ.result.headOption
          //println(action.statements)
          db.run(action)
        })
      )
      , Field(
          "products"
        , ListType(ProductType)
        , description = Some("Returns a list of all available products.")
        , resolve = Projector({ (c, fields) =>
          val bindQ  = friendTq4.map(friend => SFriend4.reader.inputTable(friend).filterNames(fields.toList.map(_.name)))
          val action = bindQ.result
          db.run(action)
        })
      )
    )
  )

  lazy val sizeArg = Argument("size", IntType)

  //val aabb = Promise[String]

  lazy val ProductType = ObjectType(
      "aa"
    , "cc"
    , fields[Unit, FriendWrap](
        Field("id", LongType, resolve = { c =>
        c.value.repOut.getData(SFriend4.id)
      })
      , Field("name", StringType, resolve = { c =>
        c.value.repOut.getData(SFriend4.name)
      })
      , Field("nick", StringType, description = Some("Picture CDN URL"), resolve = { c =>
        c.value.repOut.getData(SFriend4.nick)
      })
      , Field("age", IntType, description = Some("Picture CDN URL"), resolve = { c =>
        c.value.age
      })
      , Field(
          "picture"
        , OptionType(PictureType)
        , description = Some("Returns a product with specific `id`.")
        , arguments = sizeArg :: Nil
        , resolve = { c =>
          def picture(size: Int): Picture = Picture(width = size, height = size, url = Some(s"$size.jpg"))
          picture(c.value.age)
        }
      )
    )
  )

  lazy val schema = Schema(QueryType)

  lazy val result: Future[Json] = Executor.execute(
      schema
    , QueryParser.parse(s"""
    query  MyProduct {
      product(name: "${specName1}") {
        age
        name
        nick
        picture(size: 500) {
          width, height, url
        }
      }

      products {
        id
        name
        nick
      }
    }
  """).get
    , (())
  )

  "aa" should "decode bb" in {
    await(result)
    //println(await(result))
  }

}
