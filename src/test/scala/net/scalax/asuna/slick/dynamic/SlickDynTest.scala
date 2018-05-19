package net.scalax.slick.dynamic

import io.circe.Json
import io.circe.generic.auto._
import net.scalax.asuna.shape.ShapeHelpers
import net.scalax.slick.async.FriendTable2
import net.scalax.umr.{ UmrReaderQuery, UmrReaderQueryHelper }
import slick.jdbc.H2Profile.api._
import shapeless._

case class FilterParam3(name: String, age: Int, ext: Map[String, Json])
class FriendTable2Model(friend: FriendTable2) extends UmrReaderQuery[FilterParam3] with ShapeHelpers with UmrReaderQueryHelper {

  val name = friend.name
  val age = friend.age
  val nick = friend.nick.jsonWithKey("nickName")
  val id = friend.id.jsonWithKey("id")

  val gen = Generic[FilterParam3]

  override lazy val shapeValue = (name :: age :: nick :: id :: HNil).shaped.mapReader {
    case (name :: age :: nick :: id :: HNil) =>
      FilterParam3(name = name, age = age, ext = Map(nick, id))
  }

}