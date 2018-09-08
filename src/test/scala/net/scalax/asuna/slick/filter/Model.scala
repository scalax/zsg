package net.scalax.asuna.slick.filter

import io.circe.JsonObject
import net.scalax.slick.async.FriendTable2
import slick.jdbc.H2Profile.api._

case class Friends(
  id: Option[Long] = None,
  name: String,
  nick: String,
  age: Int)

class FriendTable(tag: slick.lifted.Tag) extends Table[Friends](tag, "firend") {
  def id = column[Long]("id", O.AutoInc)
  def name = column[String]("name")
  def nick = column[String]("nick")
  def age = column[Int]("age")

  def * = (id.?, name, nick, age).mapTo[Friends]
}

case class FilterParam(name: String, age: Int)
class SlickFilterTest(friend: FriendTable) extends SlickFilterColHelper {
  self =>

  val name = filterRep(friend.name)
  val age = filterRep(friend.age)

  def filterCol = filter.effect(filter.caseOnly[SlickFilterTest, FilterParam].compileEncoder2222.inputTable(self))

}

case class FilterParam1(name: String)
case class FilterParam2(nameModel: FilterParam1, json: JsonObject)
class SlickFilterJson(friend: FriendTable) extends SlickFilterColHelper {
  self =>

  val name = filterRep(friend.name)
  val age = jsonFilterKey(friend.age, "age")
  val nick = jsonFilterKey(friend.nick, "nick")

  val nameModel = filter.caseOnly[SlickFilterJson, FilterParam1].compileEncoder2222.inputTable(self)

  private val l = List(age, nick)
  val json = filter.shaped(l).emap[JsonObject] { t => l.map(_ => t) }

  def filterCol = filter.effect(filter.caseOnly[SlickFilterJson, FilterParam2].compileEncoder2222.inputTable(self))

}