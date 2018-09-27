package net.scalax.asuna.slick.sortBy

import java.util.UUID

import slick.jdbc.H2Profile.api._

case class Friends(id: Option[Long] = None, name: String, nick: String, age: Int)

class FriendTable(tag: slick.lifted.Tag) extends Table[Friends](tag, FriendTable.tableName) {

  def id   = column[Long]("id", O.AutoInc)
  def name = column[String]("name")
  def nick = column[String]("nick")
  def age  = column[Int]("age")

  def * = (id.?, name, nick, age).mapTo[Friends]
}

object FriendTable {
  val tableName = "firend-" + UUID.randomUUID.toString
}

case class SortByParam(id: Any, nick: Any, extColumn: Any)

class SlickSrotByTest(tag: slick.lifted.Tag) extends FriendTable(tag) with SlickSortByHelper {
  self =>

  def extColumn = (id, nick)

  def sortByCols = sortBy.effect(sortBy.singleModel[SortByParam](self).compile)

}
