package net.scalax.slick.dynamic

import io.circe.Json
import io.circe.generic.auto._
import net.scalax.asuna.shape.ShapeHelpers
import net.scalax.asuna.slick.filter.SlickFilterColHelper
import net.scalax.slick.async.FriendTable2
import net.scalax.umr.{ ShapeValueWrap, UmrReaderQuery, UmrReaderQueryHelper }
import slick.jdbc.H2Profile.api._
import shapeless._

case class FilterParam3(name: String, age: Int, ext: Map[String, Json])
case class FilterParam4(name: String, age: Int)
class FriendTable2Model(friend: FriendTable2) extends UmrReaderQuery[FilterParam3] with ShapeHelpers with UmrReaderQueryHelper with SlickFilterColHelper {

  val name = friend.name.mixin(friend.name.filter)
  val age = friend.age.filter.mixin(friend.age)
  val nick = friend.nick.jsonWithKey("nickName")
  val id = friend.id.jsonWithKey("id")

  val gen = Generic[FilterParam3]

  override lazy val shapeValue = umrUnwrap(name :: age :: List(nick, id) :: HNil).mapReader {
    case (name :: age :: l :: HNil) =>
      FilterParam3(name = name, age = age, ext = l.toMap)
  }

  val bb = filterUnwrap(name :: age :: HNil).mapReader {
    case (name :: age :: HNil) =>
      FilterParam4(name = name, age = age)
  }

}

class FriendTable2Model2(friend: FriendTable2) extends UmrReaderQuery[FilterParam3] with ShapeHelpers with UmrReaderQueryHelper with SlickFilterColHelper {

  val nameAndAge = (friend.name :: friend.age :: HNil).mixin(friend.name.filter :: friend.age.filter :: HNil)
  val nick = friend.nick.jsonWithKey("nickName")
  val id = friend.id.jsonWithKey("id")

  val gen = Generic[FilterParam3]

  override lazy val shapeValue = umrUnwrap(nameAndAge :: List(nick, id) :: HNil).mapReader {
    case ((name :: age :: HNil) :: l :: HNil) =>
      FilterParam3(name = name, age = age, ext = l.toMap)
  }

  val bb = filterUnwrap(nameAndAge).mapReader {
    case (name :: age :: HNil) =>
      FilterParam4(name = name, age = age)
  }

}