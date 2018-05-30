package net.scalax.slick.dynamic

import io.circe.Json
import io.circe.generic.auto._
import net.scalax.asuna.core.DataShapeValue
import net.scalax.asuna.sangria.{ SlickRepAbs, SlickSangria, SlickValueGen }
import net.scalax.asuna.shape.ShapeHelper
import net.scalax.asuna.slick.umr.SlickShapeValueWrapHelper
import org.scalatest.concurrent.ScalaFutures
import org.scalatest._
import sangria.parser.QueryParser
import shapeless._

import scala.concurrent.{ Await, Future, duration }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import slick.jdbc.H2Profile.api._

case class Friends4(
  id: Long,
  name: String,
  nick: String,
  age: Int)

class FriendTable4(tag: slick.lifted.Tag) extends Table[Friends4](tag, "firend4") {
  def id = column[Long]("id", O.AutoInc)
  def name = column[String]("name")
  def nick = column[String]("nick")
  def age = column[Int]("age")

  def * = (id, name, nick, age).mapTo[Friends4]
}

case class FriendWrap(age: Int, repOut: SlickValueGen[FriendTable4])

object SFriend4 extends SlickSangria[FriendTable4, FriendWrap] with ShapeHelper {
  def id = repWithKey(_.id, "id")
  def name = repWithKey(_.name, "name")
  def nick = repWithKey(_.nick, "nick")
  def age = rep(_.age)

  override def sangriaSv: DataShapeValue[FriendWrap, SlickRepAbs[FriendTable4, Any]] = {
    (age :: seqRep(id, name, nick) :: HNil).mapReader(Generic[FriendWrap].from)
  }
}

class Def extends FlatSpec with Matchers
  with EitherValues
  with ScalaFutures
  with BeforeAndAfterAll
  with BeforeAndAfter with ShapeHelper with SlickShapeValueWrapHelper {

  import sangria.macros.derive._
  import sangria.execution._
  import sangria.marshalling.circe._
  import sangria.schema._

  def await[A](f: Future[A]) = Await.result(f, duration.Duration.Inf)

  val friendTq4 = TableQuery[FriendTable4]

  val db = Database.forURL(
    s"jdbc:h2:mem:hfTest;DB_CLOSE_DELAY=-1",
    driver = "org.h2.Driver",
    keepAliveConnection = true)

  override def beforeAll = {
    await(db.run(friendTq4.schema.create))
  }

  before {
    val friend1 = Friends4(-1, "name1", "nick1", 23)
    val friend2 = Friends4(-1, "name2", "nick2", 26)
    val friend3 = Friends4(-1, "name3", "nick3", 20)
    await(db.run(friendTq4 ++= List(friend1, friend2, friend3)))
  }

  after {
    await(db.run(friendTq4.delete))
  }

  case class Picture(width: Int, height: Int, url: Option[String])

  implicit lazy val PictureType = ObjectType(
    "Picture",
    "The product picture",

    fields[Unit, Picture](
      Field("width", IntType, resolve = _.value.width),
      Field("height", IntType, resolve = _.value.height),
      Field("url", OptionType(StringType),
        description = Some("Picture CDN URL"),
        resolve = _.value.url)))

  lazy val NameArg = Argument("name", StringType)

  lazy val QueryType = ObjectType("Query", fields[Unit, Unit](
    Field("product", OptionType(ProductType),
      description = Some("Returns a product with specific `id`."),
      arguments = NameArg :: Nil,
      resolve = Projector({ (c, fields) =>
        val bindQ = friendTq4.filter(s => s.name === c.arg(NameArg)).map(friend => SFriend4.bindQuery(friend, fields.toList.map(_.name)))
        val action = bindQ.result.headOption
        println("33" * 20 + action.statements)
        db.run(action)
      })),

    Field("products", ListType(ProductType),
      description = Some("Returns a list of all available products."),
      resolve = Projector({ (c, fields) =>
        val bindQ = friendTq4.map(friend => SFriend4.bindQuery(friend, fields.toList.map(_.name)))
        val action = bindQ.result
        println("33" * 20 + action.statements)
        db.run(action)
      }))))

  lazy val sizeArg = Argument("size", IntType)

  //val aabb = Promise[String]

  lazy val ProductType = ObjectType("aa", "cc",
    fields[Unit, FriendWrap](
      Field("id", LongType, resolve = { c =>
        c.value.repOut.getData(SFriend4.id)
      }),
      Field("name", StringType, resolve = { c =>
        c.value.repOut.getData(SFriend4.name)
      }),
      Field("nick", StringType,
        description = Some("Picture CDN URL"),
        resolve = { c =>
          c.value.repOut.getData(SFriend4.nick)
        }),
      Field("age", IntType,
        description = Some("Picture CDN URL"),
        resolve = { c =>
          c.value.age
        }),
      Field("picture", OptionType(PictureType),
        description = Some("Returns a product with specific `id`."),
        arguments = sizeArg :: Nil,
        resolve = {
          c =>
            def picture(size: Int): Picture = Picture(width = size, height = size, url = Some(s"$size.jpg"))
            picture(c.value.age)
        })))

  lazy val schema = Schema(QueryType)

  val result: Future[Json] = Executor.execute(schema, QueryParser.parse("""
    query  MyProduct {
      product(name: "name2") {
        name
        age

        picture(size: 500) {
          width, height, url
        }
      }

      products {
        id
        nick
      }
    }
  """).get, (()))

  "aa" should "decode bb" in {
    println(await(result))
  }

}