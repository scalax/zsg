package net.scalax.slick.dynamic

import io.circe.Json
import io.circe.generic.auto._
import net.scalax.asuna.slick.filter.SlickFilterQuery
import net.scalax.asuna.shape.ShapeHelper
import net.scalax.asuna.slick.filter.SlickFilterColHelper
import net.scalax.slick.async.FriendTable2
import net.scalax.asuna.slick.umr.{ SlickShapeValueWrapHelper, UmrReaderQuery }
import slick.jdbc.H2Profile.api._
import shapeless._

case class FilterParam3(name: String, age: Int, ext: Map[String, Json])
case class FilterParam4(name: String, age: Int)
class FriendTable2Model(friend: FriendTable2) extends UmrReaderQuery[FilterParam3] with ShapeHelper with SlickShapeValueWrapHelper with SlickFilterColHelper with SlickFilterQuery[FilterParam4] {

  val name = rep(friend.name).mixin(filterRep(friend.name))
  val age = filterRep(friend.age).mixin(rep(friend.age))
  val nick = jsonKey(friend.nick, "nickName")
  val id = jsonKey(friend.id, "id")

  val gen = Generic[FilterParam3]

  override lazy val umrSv = umrUnwrap(name :: age :: List(nick, id) :: HNil).mapReader {
    case (name :: age :: l :: HNil) =>
      FilterParam3(name = name, age = age, ext = l.toMap)
  }

  override val slickFilterSv = filterUnwrap(name :: age :: HNil).mapReader {
    case (name :: age :: HNil) =>
      FilterParam4(name = name, age = age)
  }

}

class FriendTable2Model2(friend: FriendTable2) extends UmrReaderQuery[FilterParam3] with ShapeHelper with SlickShapeValueWrapHelper with SlickFilterColHelper with SlickFilterQuery[FilterParam4] {

  val nameAndAge = (rep(friend.name) :: rep(friend.age) :: HNil).mixin(filterRep(friend.name) :: filterRep(friend.age) :: HNil)
  val nick = jsonKey(friend.nick, "nickName")
  val id = jsonKey(friend.id, "id")

  val gen = Generic[FilterParam3]
  val gen1 = Generic[FilterParam4]

  override lazy val umrSv = umrUnwrap(nameAndAge :: List(nick, id) :: HNil).mapReader {
    case ((name :: age :: HNil) :: l :: HNil) =>
      FilterParam3(name = name, age = age, ext = l.toMap)
  }

  override val slickFilterSv = filterUnwrap(nameAndAge).mapReader(gen1.from)

}