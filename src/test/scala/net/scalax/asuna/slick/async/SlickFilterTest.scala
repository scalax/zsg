package net.scalax.slick.async

import io.circe.JsonObject
import net.scalax.asuna.slick.filter.SlickFilterColHelper
import slick.jdbc.H2Profile.api._

case class FilterParam(name: String, age: Int)
class SlickFilterTest(friend: FriendTable) extends SlickFilterColHelper {
  self =>

  val name = filterRep(friend.name)
  val age = filterRep(friend.age)

  def filterCol = filter.effect(filter.caseOnly[SlickFilterTest, FilterParam](self))

}

case class FilterParam1(name: String)
case class FilterParam2(nameModel: FilterParam1, json: JsonObject)
class SlickFilterJson(friend: FriendTable) extends SlickFilterColHelper {
  self =>

  val name = filterRep(friend.name)
  val age = jsonFilterKey(friend.age, "age")
  val nick = jsonFilterKey(friend.nick, "nick")

  val nameModel = filter.caseOnly[SlickFilterJson, FilterParam1](self)

  private val l = List(age, nick)
  val json = filter.shaped(l).emap[JsonObject] { t => l.map(_ => t) }

  def filterCol = filter.effect(filter.caseOnly[SlickFilterJson, FilterParam2](self))

}