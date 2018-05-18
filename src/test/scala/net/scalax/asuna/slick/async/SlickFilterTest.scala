package net.scalax.slick.async

import io.circe.JsonObject
import io.circe.generic.auto._
import net.scalax.asuna.core.SlickWriterQuery
import net.scalax.asuna.shape.ShapeHelpers
import play.api.libs.circe.SlickFilterHelper
import slick.jdbc.H2Profile.api._
import shapeless._

case class FilterParam(name: String, age: Int)
class SlickFilterTest(friend: FriendTable) extends SlickWriterQuery[FilterParam] with SlickFilterHelper with ShapeHelpers {

  val name = friend.name.filter
  val age = friend.age.filter

  val gen = Generic[FilterParam]

  override lazy val shapeValue = (name :: age :: HNil).<>(s => Option(gen.from(s)))(t => Option(gen.to(t)))

}

case class FilterParam1(name: String)
class SlickFilterJson(friend: FriendTable) extends SlickWriterQuery[FilterParam1 :: JsonObject :: HNil] with SlickFilterHelper with ShapeHelpers {

  val name = friend.name.filter
  val age = friend.age.jsonFilterWithKey("age")
  val nick = friend.nick.jsonFilterWithKey("nick")

  val gen = Generic[FilterParam1]

  val shapeValue1 = (name :: HNil).<>(s => Option(gen.from(s)))(t => Option(gen.to(t)))

  val shapeValue2 = (age :: nick :: HNil).<> { _ => Option.empty[JsonObject] } { t => Option(t :: t :: HNil) }

  override lazy val shapeValue = (shapeValue1 :: shapeValue2 :: HNil).shaped

}