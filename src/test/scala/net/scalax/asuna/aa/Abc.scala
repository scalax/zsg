package net.scalax.slick.dynamic

import java.util.Date

import io.circe.Json
import io.circe.generic.auto._
import net.scalax.asuna.core.DataShapeValue
import net.scalax.asuna.shape.ShapeHelper
import net.scalax.asuna.slick.umr.{ SlickShapeValueWrap, SlickShapeValueWrapHelper, UmrReaderQuery }
import org.scalatest.concurrent.ScalaFutures
import org.scalatest._
import sangria.execution.deferred._
import sangria.parser.QueryParser

import scala.concurrent.{ Await, Future, duration }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import slick.jdbc.H2Profile.api._
import slick.lifted.{ MappedProjection, ShapedValue }

case class Friends3(
  id: Long,
  name: String,
  nick: String,
  age: Int)

class FriendTable3(tag: slick.lifted.Tag) extends Table[Friends3](tag, "firend3") {
  def id = column[Long]("id", O.AutoInc)
  def name = column[String]("name")
  def nick = column[String]("nick")
  def age = column[Int]("age")

  def * = (id, name, nick, age).mapTo[Friends3]
}

class Abc extends FlatSpec with Matchers
  with EitherValues
  with ScalaFutures
  with BeforeAndAfterAll
  with BeforeAndAfter {

  import sangria.macros.derive._
  import sangria.execution._
  import sangria.marshalling.circe._
  import sangria.schema._

  def await[A](f: Future[A]) = Await.result(f, duration.Duration.Inf)

  val friendTq3 = TableQuery[FriendTable3]

  val db = Database.forURL(
    s"jdbc:h2:mem:hfTest;DB_CLOSE_DELAY=-1",
    driver = "org.h2.Driver",
    keepAliveConnection = true)

  override def beforeAll = {
    await(db.run(friendTq3.schema.create))
  }

  before {
    val friend1 = Friends3(-1, "name1", "nick1", 23)
    val friend2 = Friends3(-1, "name2", "nick2", 26)
    val friend3 = Friends3(-1, "name3", "nick3", 20)
    await(db.run(friendTq3 ++= List(friend1, friend2, friend3)))
    friendTq3.result
  }

  after {
    await(db.run(friendTq3.delete))
  }

  case class Picture(width: Int, height: Int, url: Option[String])

  trait Identifiable {
    def id: String
  }

  case class ProductRepo(list: List[String] = List.empty) {
    private val Products = List(
      Product("1", "Cheesecake", "Tasty"),
      Product("2", "Health Potion", "+50 HP"))

    def product(id: String): Option[Product] = Products find (_.id == id)

    def products: List[Product] = Products

    def add(key: String): ProductRepo = this.copy(key :: list)
  }

  lazy val IdentifiableType = InterfaceType(
    "Identifiable",
    "Entity that can be identified",

    fields[Unit, Identifiable](
      Field("id", StringType, resolve = _.value.id)))

  implicit lazy val PictureType = ObjectType(
    "Picture",
    "The product picture",

    fields[Unit, Picture](
      Field("width", IntType, resolve = _.value.width),
      Field("height", IntType, resolve = _.value.height),
      Field("url", OptionType(StringType),
        description = Some("Picture CDN URL"),
        resolve = _.value.url)))

  case class Product(id: String, name: String, description: String) extends Identifiable {
    def picture(size: Int): Picture = Picture(width = size, height = size, url = Some(s"${id}-${name}-${description}-//cdn.com/$size/$id.jpg"))
  }

  val hashId = HasId[String, String] { (value: String) => value }
  val anyHashId = HasId[Any, Any] { (value: Any) => value }

  /*val categories11 = Fetcher { (ctx: ProductRepo, ids: Seq[String]) =>
    println(ids)
    Future.successful(ids.map(s => s + "|" + new Date().getTime.toString))
  }*/

  val byParent = Relation("byParent", { (c: String) =>
    println("33" * 10)
    println(c)
    println(c.size)
    Seq(c.size, 6, 1)
  }, { (c: String) => c + "|1122" })

  object QueryWrap {
    val dataBase: Database = db
    //val query: Query[E, U, C]
    def toDefer[R, B, Q](repCv: FriendTable3 => R)(implicit shape: Shape[_ <: FlatShapeLevel, R, B, Q]): RepWrap[R, B, Q] = {
      //val query1 = query
      val shape1 = shape.asInstanceOf[Shape[FlatShapeLevel, R, B, Q]]
      val repCv1 = repCv
      new RepWrap[R, B, Q] {
        //override val query = query1
        override val shape = shape1
        override val repCv = repCv1
      }
    }
  }

  val r1 = QueryWrap.toDefer(_.name)
  val r2 = QueryWrap.toDefer(_.nick)

  trait RepWrap[R, B, Q] extends Relation[B, (B, FriendTable3 => R), FriendTable3 => MappedProjection[(B, FriendTable3 => R), B]] {
    val dataBase: Database = db
    //val query: Query[E, U, C]
    val shape: Shape[FlatShapeLevel, R, B, Q]
    val repCv: FriendTable3 => R

    val anyShapeValue: FriendTable3 => MappedProjection[(B, FriendTable3 => R), B] = { (f: FriendTable3) => ShapedValue(repCv(f), shape).<>[(B, FriendTable3 => R)](s => (s, repCv), t => Option(t._1)) }

    override def relIds(value: (B, FriendTable3 => R)): Seq[FriendTable3 => MappedProjection[(B, FriendTable3 => R), B]] = {
      val list = List(r1, r2)
      List(value).map(_._2).map(t => list.filter(s => s.repCv == t).map(_.anyShapeValue.asInstanceOf[FriendTable3 => MappedProjection[(B, FriendTable3 => R), B]])).flatten
    }
    override def map(value: (B, FriendTable3 => R)): B = value._1
  }

  val categories1111 = Fetcher.relOnly(
    { (repo: ProductRepo, ids: RelationIds[Any]) =>
      val aa = ids.apply(r1.asInstanceOf[RepWrap[Any, Any, Any]])
      val bb = ids.apply(r2.asInstanceOf[RepWrap[Any, Any, Any]])
      val query = friendTq3.map { friend =>
        val cc = new UmrReaderQuery[List[(Any, FriendTable3 => Any)]] with ShapeHelper with SlickShapeValueWrapHelper {
          override def umrSv: DataShapeValue[List[(Any, FriendTable3 => Any)], SlickShapeValueWrap[Any]] = (aa ++: bb).map(s => rep(s.apply(friend))).toList.shaped
        }
        UmrReaderQuery(cc)
      }.to[List]
      val action = query.result.head
      println("11" * 10 + action.statements)
      db.run(action)
    })(anyHashId)

  val categories = Fetcher.rel(
    { (repo: ProductRepo, ids: Seq[String]) =>
      println("11" * 1000)
      println(ids)
      Future.successful(ids.map(s => s + "|" + s * 50))
    },
    { (repo: ProductRepo, ids: RelationIds[String]) =>
      println("22" * 10)
      println(ids)
      println(ids.apply(byParent))
      Future.successful(List("1", "22", "333", "4444", "55555", "666666"))
    })(hashId)

  lazy val Id = Argument("id", StringType)

  lazy val QueryType = ObjectType("Query", fields[ProductRepo, Unit](
    Field("product", OptionType(ProductType),
      description = Some("Returns a product with specific `id`."),
      arguments = Id :: Nil,
      resolve = c => c.ctx.product(c arg Id)),

    Field("products", ListType(ProductType),
      description = Some("Returns a list of all available products."),
      resolve = _.ctx.products)))

  /*lazy val ProductType = deriveObjectType[Unit, Product](
    Interfaces(IdentifiableType),
    IncludeMethods("picture"))*/

  lazy val sizeArg = Argument("size", IntType)

  //val aabb = Promise[String]

  lazy val ProductType = ObjectType("aa", "cc",
    fields[ProductRepo, Product](
      Field("id", StringType, resolve = { c =>
        c.value.id
      }),
      Field("name", StringType, resolve = { c =>
        /*println("222222222")
        println("field")
        println(c.field)
        println("\n\n")
        println("astNodes")
        println(c.astFields.mkString("\n1111\n"))
        println("path")
        println(c.path)
        println("222222222")*/
        categories.deferRelSeq(byParent, c.value.id.size)
        categories1111.deferRel(r1.asInstanceOf[Relation[Any, (Any, FriendTable3 => Any), FriendTable3 => MappedProjection[(Any, FriendTable3 => Any), String]]], r1.anyShapeValue.asInstanceOf[FriendTable3 => MappedProjection[(Any, FriendTable3 => Any), String]]).asInstanceOf[Deferred[String]]
        /*aabb.future*/ /*.map { t =>
          println("ee" * 100)
          t
        }*/
        /*UpdateCtx(c.value.name) { (s: String) =>
            println("1111111111111")
            println(c.ctx)
            val newCtx = c.ctx add s
            println("2222222222222222")
            println(newCtx)
            newCtx
          }*/
      }),
      Field("description", StringType,
        description = Some("Picture CDN URL"),
        resolve = { c =>
          categories.deferRelSeq(byParent, c.value.description.size)
          categories1111.deferRel(r2.asInstanceOf[Relation[Any, (Any, FriendTable3 => Any), FriendTable3 => MappedProjection[(Any, FriendTable3 => Any), String]]], r2.anyShapeValue.asInstanceOf[FriendTable3 => MappedProjection[(Any, FriendTable3 => Any), String]]).asInstanceOf[Deferred[String]]
        }),
      Field("picture", OptionType(PictureType),
        description = Some("Returns a product with specific `id`."),
        arguments = sizeArg :: Nil,
        resolve = {
          c =>
            /*val aa = Picture(width = c arg sizeArg, height = c arg sizeArg, url = Some(s"//cdn.com/$size/${c arg sizeArg}.jpg"))
            aa*/
            /*println("33333333333333333")
            println("field")
            println(c.field)
            println("\n\n")
            println("astNodes")
            println(c.astFields.mkString("\n1111\n"))
            println("path")
            println(c.path)
            println("33333333333333333")*/
            c.value.picture(c arg sizeArg)
        } //c.ctx.product(c arg Id))
      /*Interfaces(IdentifiableType),
    IncludeMethods("picture")*/ )))

  lazy val schema = Schema(QueryType)

  val aa = new Middleware[ProductRepo] with MiddlewareAfterField[ProductRepo] {
    override type QueryVal = String

    override def beforeQuery(context: MiddlewareQueryContext[ProductRepo, _, _]): QueryVal = {
      //aabb.success("hahahahhahahhahahahahhah")
      "ignore" * 100
    }

    override def afterQuery(queryVal: QueryVal, context: MiddlewareQueryContext[ProductRepo, _, _]): Unit = {
      //println("ee" * 100)
    }

    override type FieldVal = Any

    override def afterField(queryVal: QueryVal, fieldVal: Any, value: Any, mctx: MiddlewareQueryContext[ProductRepo, _, _], ctx: Context[ProductRepo, _]): Option[Any] = {
      /*println(queryVal)
      println("kbkbkb" * 33 + "\n")
      println(fieldVal.toString + "|" + value.toString)*/
      Option(value)
    }

    override def beforeField(queryVal: QueryVal, mctx: MiddlewareQueryContext[ProductRepo, _, _], ctx: Context[ProductRepo, _]): BeforeFieldResult[ProductRepo, Any] = {
      BeforeFieldResult(
        fieldVal = ctx.value,
        actionOverride = Option.empty,
        attachment = Option.empty)
    }
  }

  val result: Future[Json] = Executor.execute(schema, QueryParser.parse("""
    query  MyProduct {
      product(id: "2") {
        name
        description

        picture(size: 500) {
          width, height, url
        }
      }

      products {
        name
      }
    }
  """).get, new ProductRepo, middleware = aa :: Nil, deferredResolver = DeferredResolver.fetchers(categories, categories1111))

  "aa" should "decode bb" in {
    println(await(result))
  }

}