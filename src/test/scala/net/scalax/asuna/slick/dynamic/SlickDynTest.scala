package net.scalax.slick.dynamic

import io.circe.Json
import io.circe.generic.auto._
import net.scalax.asuna.shape.ShapeHelpers
import net.scalax.slick.async.FriendTable2
import net.scalax.umr.{ ShapeValueWrap, UmrReaderQuery, UmrReaderQueryHelper }
import play.api.libs.circe.{ Filterable, SlickFilterHelper }
import slick.jdbc.H2Profile.api._
import shapeless._

case class FilterParam3(name: String, age: Int, ext: Map[String, Json])
case class FilterParam4(name: String, age: Int)
class FriendTable2Model(friend: FriendTable2) extends UmrReaderQuery[FilterParam3] with ShapeHelpers with UmrReaderQueryHelper with SlickFilterHelper {

  val name = friend.name.mixin(friend.name.filter)
  val age = friend.age.filter.mixin(friend.age)
  val nick = friend.nick.jsonWithKey("nickName")
  val id = friend.id.jsonWithKey("id")

  val gen = Generic[FilterParam3]

  override lazy val shapeValue = umrToDv(name :: age :: nick :: id :: HNil).mapReader {
    case (name :: age :: nick :: id :: HNil) =>
      FilterParam3(name = name, age = age, ext = Map(nick, id))
  }

  val bb = filterToDv(name :: age :: HNil).mapReader {
    case (name :: age :: HNil) =>
      FilterParam4(name = name, age = age)
  }

}