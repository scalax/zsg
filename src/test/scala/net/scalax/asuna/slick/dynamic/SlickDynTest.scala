package net.scalax.slick.dynamic

import io.circe.Json
import net.scalax.asuna.helper.decoder.HListDecoderShapeImplicit
import net.scalax.asuna.helper.encoder.HListEncoderShapeImplicit
import net.scalax.asuna.shape.ShapeHelper
import net.scalax.asuna.slick.filter.SlickFilterColHelper
import net.scalax.slick.async.FriendTable2
import net.scalax.asuna.slick.umr.UmrHelper
import shapeless._
import slick.jdbc.H2Profile.api._

case class FilterParam3(name: String, age: Int, ext: Map[String, Json])
case class FilterParam4(name: String, age: Int)
class FriendTable2Model(friend: FriendTable2) extends UmrHelper with ShapeHelper with SlickFilterColHelper {
  self =>

  val name = rep(friend.name).mixin(filterRep(friend.name))
  val age  = filterRep(friend.age).mixin(rep(friend.age))
  val nick = jsonKey(friend.nick, "nickName")
  val id   = jsonKey(friend.id, "id")

  val ext = umr.shaped(List(nick, id)).dmap(_.toMap)

  lazy val umrSv = umr.effect(umr.caseOnly[FriendTable2Model, FilterParam3].compileDecoder2222.inputTable(self))

  val slickFilterSv = filter.caseOnly[FriendTable2Model, FilterParam4].compileEncoder2222.inputTable(self)

}

class FriendTable2Model2(friend: FriendTable2)
    extends UmrHelper
    with ShapeHelper
    with SlickFilterColHelper
    with HListEncoderShapeImplicit
    with HListDecoderShapeImplicit {

  val nameAndAge = (rep(friend.name) :: rep(friend.age) :: HNil).mixin(filterRep(friend.name) :: filterRep(friend.age) :: HNil)
  val nick       = jsonKey(friend.nick, "nickName")
  val id         = jsonKey(friend.id, "id")

  val gen  = Generic[FilterParam3]
  val gen1 = Generic[FilterParam4]

  lazy val umrSv = umr.effect(umr.shaped(nameAndAge :: List(nick, id) :: HNil).dmap {
    case ((name :: age :: HNil) :: l :: HNil) =>
      FilterParam3(name = name, age = age, ext = l.toMap)
  })

  val slickFilterSv = filter.effect(filter.shaped(nameAndAge).emap(gen1.to))

}
