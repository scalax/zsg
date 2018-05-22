package net.scalax.slick.async

import io.circe.JsonObject
import io.circe.generic.auto._
import net.scalax.asuna.slick.filter.SlickFilterQuery
import net.scalax.asuna.shape.ShapeHelper
import net.scalax.asuna.slick.filter.SlickFilterColHelper
import slick.jdbc.H2Profile.api._
import shapeless._

case class FilterParam(name: String, age: Int)
class SlickFilterTest(friend: FriendTable) extends SlickFilterQuery[FilterParam] with SlickFilterColHelper with ShapeHelper {

  val name = filterRep(friend.name)
  val age = filterRep(friend.age)

  val gen = Generic[FilterParam]

  override lazy val slickFilterSv = (name :: age :: HNil).mapWriter(gen.to)

}

case class FilterParam1(name: String)
class SlickFilterJson(friend: FriendTable) extends SlickFilterQuery[FilterParam1 :: JsonObject :: HNil] with SlickFilterColHelper with ShapeHelper {

  val name = filterRep(friend.name)
  val age = jsonFilterKey(friend.age, "age")
  val nick = jsonFilterKey(friend.nick, "nick")

  val gen = Generic[FilterParam1]

  val shapeValue1 = (name :: HNil).mapWriter(gen.to)

  //val shapeValue2 = (age :: nick :: HNil).<> { _ => Option.empty[JsonObject] } { t => Option(t :: t :: HNil) }

  private val l = List(age, nick)
  val shapeValue2 = l.mapWriter[JsonObject] { t => l.map(_ => t) }

  override lazy val slickFilterSv = (shapeValue1 :: shapeValue2 :: HNil).shaped

}