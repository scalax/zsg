package net.scalax.slick.dynamic

import io.circe.Json
import io.circe.generic.auto._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest._
import sangria.parser.QueryParser

import scala.concurrent.{ Await, Future, duration }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

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

  case class Picture(width: Int, height: Int, url: Option[String])

  trait Identifiable {
    def id: String
  }

  class ProductRepo {
    private val Products = List(
      Product("1", "Cheesecake", "Tasty"),
      Product("2", "Health Potion", "+50 HP"))

    def product(id: String): Option[Product] = Products find (_.id == id)

    def products: List[Product] = Products
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

  lazy val ProductType = ObjectType("aa", "cc",
    fields[Unit, Product](
      Field("id", StringType, resolve = _.value.id),
      Field("name", StringType, resolve = s => Future.successful(s.value.name)),
      Field("description", StringType,
        description = Some("Picture CDN URL"),
        resolve = _.value.description),
      Field("picture", OptionType(PictureType),
        description = Some("Returns a product with specific `id`."),
        arguments = sizeArg :: Nil,
        resolve = {
          c =>
            /*val aa = Picture(width = c arg sizeArg, height = c arg sizeArg, url = Some(s"//cdn.com/$size/${c arg sizeArg}.jpg"))
            aa*/
            c.value.picture(c arg sizeArg)
        } //c.ctx.product(c arg Id))
      /*Interfaces(IdentifiableType),
    IncludeMethods("picture")*/ )))

  lazy val schema = Schema(QueryType)

  val result: Future[Json] = Executor.execute(schema, QueryParser.parse("""
    query MyProduct {
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
  """).get, new ProductRepo)

  "aa" should "decode bb" in {
    println(await(result))
  }

}