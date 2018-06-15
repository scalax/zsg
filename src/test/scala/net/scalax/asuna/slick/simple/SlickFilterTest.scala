package net.scalax.slick.dynamic

import io.circe.Json
import io.circe.generic.auto._
import net.scalax.asuna.core.{ DMHelper, DataModel }
import net.scalax.asuna.shape.ShapeHelper
import net.scalax.slick.async.{ FriendTable2, Mark, MarkTable }
import net.scalax.asuna.slick.umr.{ SlickShapeValueWrapHelper, UmrReaderQuery }
import slick.jdbc.H2Profile.api._
import shapeless._

case class InnerFriends2(name: String, nick: String, age: Int, mark: List[InnerMark])
case class InnerMark(id: Long, name: String, mark: Int)

class FriendTable2Model(friend: FriendTable2) extends UmrReaderQuery[DataModel[List[InnerMark], InnerFriends2, Long]] with ShapeHelper with SlickShapeValueWrapHelper {

  val id = rep(friend.id)
  val name = rep(friend.name)
  val nick = rep(friend.nick)
  val age = rep(friend.age)

  val gen = Generic[InnerFriends2]

  override lazy val umrSv = umrUnwrap(id.toSub :: name :: nick :: age :: umrDelay[List[InnerMark]] :: HNil).map { s =>
    DMHelper.compile(s).compose((s: List[InnerMark]) => s :: HNil).andThen(gen.from).changeSub(_.head)
  }

}

class MarkTableModel(mark: MarkTable) extends UmrReaderQuery[InnerMark] with ShapeHelper with SlickShapeValueWrapHelper {

  val id = rep(mark.id)
  val name = rep(mark.name)
  val markRep = rep(mark.mark)

  val gen = Generic[InnerMark]

  override lazy val umrSv = umrUnwrap(id :: name :: markRep :: HNil).map(gen.from)

}