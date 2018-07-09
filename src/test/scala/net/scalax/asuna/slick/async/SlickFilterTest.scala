package net.scalax.slick.async

import io.circe.JsonObject
import net.scalax.asuna.core.HListEncoderShapeHelper
import net.scalax.asuna.slick.filter.SlickFilterQuery
import net.scalax.asuna.shape.ShapeHelper
import net.scalax.asuna.slick.filter.SlickFilterColHelper
import shapeless.{ Generic, HNil }
import slick.jdbc.H2Profile.api._

case class FilterParam(name: String, age: Int)
class SlickFilterTest(tag: Tag) extends FriendTable(tag) with SlickFilterColHelper with ShapeHelper with HListEncoderShapeHelper {

  val nameF = filterRep(name)
  val ageF = filterRep(age)

  def filterCol = SlickFilterQuery.effect((nameF :: ageF :: HNil).emap(Generic[FilterParam].to))

}

case class FilterParam1(name: String)
class SlickFilterJson(friend: FriendTable) extends SlickFilterColHelper with ShapeHelper with HListEncoderShapeHelper {

  val name = filterRep(friend.name)
  val age = jsonFilterKey(friend.age, "age")
  val nick = jsonFilterKey(friend.nick, "nick")

  val gen = Generic[FilterParam1]

  val shapeValue1 = (name :: HNil).emap(gen.to)

  private val l = List(age, nick)
  val shapeValue2 = l.emap[JsonObject] { t => l.map(_ => t) }

  def filterCol = SlickFilterQuery.effect(shapeValue1 :: shapeValue2 :: HNil)

}