package net.scalax.asuna.slick.simple

import io.circe.JsonObject
import net.scalax.asuna.slick.umr.UmrHelper
import net.scalax.asuna.slick.umr.rmu.RmuWriterQuery
import slick.jdbc.H2Profile.api._

case class InnerFriends2(id: Long, name: String, nick: String, age: Int, mark: List[InnerMark])
case class InnerMark(id: Long, name: String, mark: Int)
case class InnerFriendInput(mark: List[InnerMark])
case class InnerFriendOutput(id: Long)

case class Friends5(id: Long, name123: String, nick: String, age: Int)

class FriendTable3Model(friend: FriendTable2) extends UmrHelper {

  val id = rep(friend.id)
  val name123 = rep(friend.name)
  val nick = rep(friend.nick)
  val age = rep(friend.age)

  lazy val shape = umr.caseOnly[FriendTable3Model, Friends5]

  lazy val reader = umr.effect(shape(this)).toSv

}

case class Friends6(id: Long, nick: String)
case class Friends7(age: Int, id: Long)

class FriendTable4Model(cons: Tag) extends FriendTable2(cons) with UmrHelper with RmuWriterQuery {

  lazy val shape6 = umr.caseOnly[FriendTable4Model, Friends6].compileDecoder1111.inputTable(this)
  lazy val reader6 = umr.effect(shape6).toSv

  lazy val shape7 = umr.caseOnly[FriendTable4Model, Friends7].compileDecoder1111.inputTable(this)
  lazy val reader7 = umr.effect(shape7).toSv

}

object FriendTable4Model extends TableQuery(cons => new FriendTable4Model(cons))

case class DynFields(id: Long, name: String, age: Int)
case class Friends8(id: Long, dyn: JsonObject)

class DynFriendModel(cons: Tag, cols: List[String]) extends FriendTable2(cons) with UmrHelper with RmuWriterQuery {
  self =>

  def dyn = rmu.effect(rmu.caseOnly[DynFriendModel, DynFields].input(self)).withCols(cols)
  def shape8 = umr.caseOnly[DynFriendModel, Friends8].compileDecoder1111.inputTable(self)
  def reader8 = umr.effect(shape8).toSv

}

object DynFriendModelTq extends (List[String] => TableQuery[DynFriendModel]) {
  override def apply(v1: List[String]): TableQuery[DynFriendModel] = {
    TableQuery(cons => new DynFriendModel(cons, v1))
  }
}

class FriendTable2Model(friend: FriendTable2) extends UmrHelper {

  val id = rep(friend.id)
  val name = rep(friend.name)
  val nick = rep(friend.nick)
  val age = rep(friend.age)

  lazy val shape = umr.dataModel[FriendTable2Model, InnerFriendInput, InnerFriends2, InnerFriendOutput]
  lazy val reader = umr.effect(shape(this)).toSv

}

class MarkTableModel(markTable: MarkTable) extends UmrHelper {

  val id = rep(markTable.id)
  val name = rep(markTable.name)
  val mark = rep(markTable.mark)

  lazy val shape = umr.caseOnly[MarkTableModel, InnerMark]
  lazy val reader = umr.effect(shape(this)).toSv

}